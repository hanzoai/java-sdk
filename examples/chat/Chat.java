package ai.hanzo.cloud.examples;

import ai.hanzo.Hanzo;
import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.AiApi;

/**
 * chat — one completion.
 *
 * <p>Operation: {@code post_chat_completions} — POST /v1/chat/completions,
 * the gateway's own inference route.
 *
 * <p>Non-streaming on purpose: streaming is SSE, a different transport that a
 * generated client hands back as an opaque body, so demonstrating it here would
 * teach the wrong shape.
 *
 * <p>THE ROUTE IS UNTYPED AT THE SOURCE, so the generated method takes no
 * argument and returns {@code void}: there is no request schema to carry a
 * prompt and no response schema to read a reply from. That is a hanzoai/cloud
 * gap — the route is not a {@code zip.Get[In, Out]} yet, so its emitter has no
 * shape to publish — and the one thing this example must not do is invent one.
 * A request hand-rolled inside a generated client is precisely the second
 * authority these SDKs exist to remove; it would compile, look right, and be an
 * opinion about the API rather than a projection of it.
 *
 * <p>So the flow calls the operation the document declares and prints what the
 * route answered. When the shapes land, this becomes
 * {@code chat.postChatCompletions(request)} and prints
 * {@code choices[0].message.content} — a regeneration away, with no decision
 * left in this file.
 *
 * <pre>
 *   HANZO_API_KEY=hk-... ./gradlew :examples:chat
 * </pre>
 */
public final class Chat {

    public static void main(String[] args) {
        AiApi chat = new AiApi(Hanzo.client());
        try {
            System.out.printf("completion  HTTP %d%n", chat.postChatCompletionsWithHttpInfo().getStatusCode());
        } catch (ApiException e) {
            System.err.printf("chat failed: HTTP %d %s%n", e.getCode(), e.getResponseBody());
            System.exit(1);
        }
    }
}
