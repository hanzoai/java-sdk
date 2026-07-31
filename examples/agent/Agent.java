package ai.hanzo.cloud.examples;

import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.AgentsApi;
import ai.hanzo.cloud.model.AgentsRunRequest;
import ai.hanzo.cloud.model.AgentsRunView;
import ai.hanzo.cloud.model.CloudAgentRunView;
import ai.hanzo.cloud.model.CloudAgentView;
import ai.hanzo.cloud.model.CloudCreateAgentIn;
import ai.hanzo.cloud.model.CloudRunList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * agent — create one, run it, watch the run land.
 *
 * <p>Operations: {@code cloud_post_v1_agents} — POST /v1/agents,
 * {@code cloud_post_v1_agents_by_ref_run} — POST /v1/agents/{ref}/run,
 * {@code cloud_get_v1_agents_ref_runs} — GET /v1/agents/{ref}/runs.
 *
 * <p>{@code ref} accepts the public id or the org-unique name, so the run and
 * the read both use the name just created. Names are org-unique, so this makes
 * a fresh one rather than hardcoding it.
 *
 * <p>The run route now carries a typed body IN and a typed {@link AgentsRunView}
 * back, both restored to the document, so the call takes real input and its
 * acknowledgement is read rather than discarded. A run is still asynchronous,
 * so the example records the run ids that existed beforehand and polls the run
 * list until the one that appeared is terminal — the last step is the RUN LIST,
 * not the agent read.
 *
 * <p>Agents are org-scoped: without {@code X-Org-Id} these are
 * 403 {@code "X-Org-Id required"}.
 *
 * <pre>
 *   HANZO_API_KEY=sk-... HANZO_ORG_ID=my-org ./gradlew :examples:agent
 * </pre>
 */
public final class Agent {

    /** Anything not still moving is done; the document does not enumerate the vocabulary. */
    private static final Set<String> RUNNING = Set.of("queued", "pending", "running", "in_progress", "starting");

    private static final int POLL_ATTEMPTS = 60;
    private static final long POLL_INTERVAL_MS = 1000L;

    public static void main(String[] args) throws InterruptedException {
        AgentsApi agents = new AgentsApi(Hanzo.client());
        String name = "sdk-example-" + UUID.randomUUID().toString().substring(0, 8);

        try {
            CloudAgentView created = agents.cloudPostV1Agents(new CloudCreateAgentIn()
                    .name(name)
                    .model(Hanzo.model())
                    .instructions("You answer in exactly one sentence."));
            System.out.printf("created  %s (%s)%n", created.getName(), created.getId());

            Set<String> before = runIds(agents.cloudGetV1AgentsRefRuns(name, 100));

            AgentsRunView started = agents.cloudPostV1AgentsByRefRun(name,
                    new AgentsRunRequest().input("What is the capital of Japan?"));
            System.out.printf("ran      %s %s%n", name, started.getStatus());

            for (int attempt = 0; attempt < POLL_ATTEMPTS; attempt++) {
                CloudRunList runs = agents.cloudGetV1AgentsRefRuns(name, 100);
                CloudAgentRunView run = newest(runs, before);
                if (run != null && !RUNNING.contains(String.valueOf(run.getStatus()))) {
                    System.out.printf("run      %s %s%n", run.getId(), run.getStatus());
                    System.out.printf("output   %s%n", run.getOutput());
                    return;
                }
                Thread.sleep(POLL_INTERVAL_MS);
            }
            System.err.printf("run did not finish within %ds%n", POLL_ATTEMPTS * POLL_INTERVAL_MS / 1000);
            System.exit(1);
        } catch (ApiException e) {
            System.err.printf("agent failed: HTTP %d %s%n", e.getCode(), e.getResponseBody());
            System.exit(1);
        }
    }

    private static Set<String> runIds(CloudRunList list) {
        Set<String> ids = new HashSet<>();
        List<CloudAgentRunView> runs = list == null ? null : list.getRuns();
        if (runs != null) {
            runs.forEach(run -> ids.add(run.getId()));
        }
        return ids;
    }

    /** The run this example started: the one that was not there before. */
    private static CloudAgentRunView newest(CloudRunList list, Set<String> before) {
        List<CloudAgentRunView> runs = list == null ? null : list.getRuns();
        if (runs == null) {
            return null;
        }
        return runs.stream().filter(run -> !before.contains(run.getId())).findFirst().orElse(null);
    }
}
