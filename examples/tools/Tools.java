package ai.hanzo.cloud.examples;

import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.ToolsApi;
import ai.hanzo.cloud.model.CloudTool;
import ai.hanzo.cloud.model.CloudToolList;

import java.util.List;

/**
 * tools — list the tools this key can reach.
 *
 * <p>Operation: {@code cloud_get_v1_tools} — GET /v1/tools.
 *
 * <p>This is the served tool list: every tool the caller's org can call, which
 * is what an MCP {@code tools/list} answers. The JSON-RPC door is not in the
 * document, so a generated client has no typed way to knock on it — calling it
 * would mean hand-rolling a request this SDK exists to avoid. To call a tool
 * rather than list them, the next route is {@code cloud_post_v1_tools_call}.
 *
 * <pre>
 *   HANZO_API_KEY=sk-... ./gradlew :examples:tools
 * </pre>
 */
public final class Tools {

    public static void main(String[] args) {
        ToolsApi tools = new ToolsApi(Hanzo.client());
        try {
            CloudToolList list = tools.cloudGetV1Tools(null, null);
            List<CloudTool> found = list == null ? null : list.getTools();

            if (found == null || found.isEmpty()) {
                System.err.println("no tools returned — a key that can reach none is a key worth checking");
                System.exit(1);
            }

            System.out.printf("%d tools%n", found.size());
            found.stream().limit(3).forEach(tool ->
                    System.out.printf("  %-28s %s%n", tool.getName(), tool.getSource()));
        } catch (ApiException e) {
            System.err.printf("tools/list failed: HTTP %d %s%n", e.getCode(), e.getResponseBody());
            System.exit(1);
        }
    }
}
