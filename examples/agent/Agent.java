package ai.hanzo.cloud.examples;

import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.AgentsApi;
import ai.hanzo.cloud.model.AgentRunView;
import ai.hanzo.cloud.model.AgentView;
import ai.hanzo.cloud.model.CreateAgentIn;
import ai.hanzo.cloud.model.RunList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * agent — create one, run it, watch the run land.
 *
 * <p>Operations: {@code post_v1_agents} — POST /v1/agents,
 * {@code post_v1_agents_by_ref_run} — POST /v1/agents/{ref}/run,
 * {@code get_v1_agents_by_ref_runs} — GET /v1/agents/{ref}/runs.
 *
 * <p>{@code ref} accepts the public id or the org-unique name, so the run and
 * the read both use the name just created. Names are org-unique, so this makes
 * a fresh one rather than hardcoding it.
 *
 * <p>The run route carries neither a body nor an acknowledgement in the
 * document, so the input the agent works on is its {@code instructions} and the
 * only evidence a run started is the RUN LIST. That is why the example records
 * the run ids that existed beforehand and polls until the one that appeared is
 * terminal — the last step is the list, not the agent read.
 *
 * <p>Agents are org-scoped: without {@code X-Org-Id} these are
 * 403 {@code "X-Org-Id required"}.
 *
 * <pre>
 *   HANZO_API_KEY=hk-... HANZO_ORG_ID=my-org ./gradlew :examples:agent
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
            AgentView created = agents.postAgents(new CreateAgentIn()
                    .name(name)
                    .model(Hanzo.model())
                    .instructions("Answer in exactly one sentence: what is the capital of Japan?"));
            System.out.printf("created  %s (%s)%n", created.getName(), created.getId());

            Set<String> before = runIds(agents.getAgentsByRefRuns(name, 100));

            agents.postAgentsByRefRun(name);
            System.out.printf("ran      %s%n", name);

            for (int attempt = 0; attempt < POLL_ATTEMPTS; attempt++) {
                AgentRunView run = started(agents.getAgentsByRefRuns(name, 100), before);
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

    private static Set<String> runIds(RunList list) {
        Set<String> ids = new HashSet<>();
        List<AgentRunView> runs = list == null ? null : list.getRuns();
        if (runs != null) {
            runs.forEach(run -> ids.add(run.getId()));
        }
        return ids;
    }

    /** The run this example started: the one that was not there before. */
    private static AgentRunView started(RunList list, Set<String> before) {
        List<AgentRunView> runs = list == null ? null : list.getRuns();
        if (runs == null) {
            return null;
        }
        return runs.stream().filter(run -> !before.contains(run.getId())).findFirst().orElse(null);
    }
}
