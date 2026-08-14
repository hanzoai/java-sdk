package ai.hanzo.cloud.examples;

import ai.hanzo.Hanzo;
import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.ToolsApi;
import ai.hanzo.cloud.model.Tool;
import ai.hanzo.cloud.model.ToolList;

import java.util.List;

/**
 * tools — list the tools this key can reach.
 *
 * <p>Operation: {@code get_v1_tools} — GET /v1/tools.
 *
 * <p>The catalogue is per-key: it composes the typed product operations with
 * whatever external servers the caller's org has enabled, so two keys in two
 * orgs see different lists. {@code activated} says which of them this key may
 * actually dispatch, and {@code source} says where each one comes from —
 * printing both is the difference between a catalogue and a menu.
 *
 * <p>(POST /v1/mcp is the JSON-RPC door onto the same catalogue and answers 200
 * with the tool list, but the document does not declare it, so it is not a
 * generated method. GET /v1/tools is the REST view that is.)
 *
 * <pre>
 *   HANZO_API_KEY=hk-... ./gradlew :examples:tools
 * </pre>
 */
public final class Tools {

    public static void main(String[] args) {
        ToolsApi tools = new ToolsApi(Hanzo.client());

        try {
            ToolList catalog = tools.getTools(null, null);
            List<Tool> listed = catalog.getTools();
            if (listed == null || listed.isEmpty()) {
                System.out.println("no tools reachable with this key");
                return;
            }
            for (Tool tool : listed) {
                System.out.printf("%-32s %-12s %s%n",
                        tool.getName(),
                        tool.getSource(),
                        Boolean.TRUE.equals(tool.getActivated()) ? "activated" : "available");
            }
            System.out.printf("%n%d tools%n", listed.size());
        } catch (ApiException e) {
            System.err.printf("tools failed: HTTP %d %s%n", e.getCode(), e.getResponseBody());
            System.exit(1);
        }
    }
}
