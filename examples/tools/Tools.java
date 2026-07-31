package ai.hanzo.cloud.examples;

import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.McpApi;
import ai.hanzo.cloud.model.McpCatalog;
import ai.hanzo.cloud.model.McpFailure;
import ai.hanzo.cloud.model.McpRequest;
import ai.hanzo.cloud.model.McpResponse;
import ai.hanzo.cloud.model.McpResponseResult;
import ai.hanzo.cloud.model.McpTool;

import java.util.List;

/**
 * tools — list the MCP tools this key can reach.
 *
 * <p>Operation: {@code mcp_rpc} — POST /v1/mcp, {@code method=tools/list}.
 *
 * <p>This flow was calling {@code cloud_get_v1_tools} instead. That route is
 * real and stays available — it is the REST view of the same catalogue — but it
 * is not what {@code flows.yaml} names, and it is not what an MCP client
 * speaks. POST /v1/mcp is the fleet's ONE MCP door: it composes the typed
 * product operations with the external MCP servers the caller's org has
 * enabled. It is IN the document, which is what makes this a generated call
 * rather than a hand-rolled HTTP request inside a generated client.
 *
 * <p>(GET /v1/mcp is 404 while POST answers 200 — one verb is never a liveness
 * probe.)
 *
 * <p>JSON-RPC reports failure INSIDE a 200, so {@code error} is read before
 * {@code result}, not after.
 *
 * <pre>
 *   HANZO_API_KEY=hk-... ./gradlew :examples:tools
 * </pre>
 */
public final class Tools {

    public static void main(String[] args) {
        McpApi mcp = new McpApi(Hanzo.client());

        try {
            McpResponse response = mcp.mcpRpc(new McpRequest()
                    .jsonrpc(McpRequest.JsonrpcEnum._2_0)
                    .id("1")
                    .method(McpRequest.MethodEnum.TOOLS_LIST));

            // A JSON-RPC error arrives with HTTP 200. This is the first read.
            McpFailure failure = response.getError();
            if (failure != null) {
                System.err.printf("mcp error %d: %s%n", failure.getCode(), failure.getMessage());
                System.exit(1);
            }

            McpResponseResult result = response.getResult();
            Object actual = result == null ? null : result.getActualInstance();
            if (!(actual instanceof McpCatalog)) {
                System.err.printf("tools/list did not answer with a catalogue: %s%n", actual);
                System.exit(1);
            }

            List<McpTool> found = ((McpCatalog) actual).getTools();
            if (found == null || found.isEmpty()) {
                System.err.println("no tools returned — a key that can reach none is a key worth checking");
                System.exit(1);
            }

            System.out.printf("%d tools%n", found.size());
            found.stream().limit(3).forEach(tool ->
                    System.out.printf("  %-28s %s%n", tool.getName(), tool.getDescription()));
        } catch (ApiException e) {
            System.err.printf("tools/list failed: HTTP %d %s%n", e.getCode(), e.getResponseBody());
            System.exit(1);
        }
    }
}
