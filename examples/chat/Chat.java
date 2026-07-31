package ai.hanzo.cloud.examples;

import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.OpenAiCompatibleApi;
import ai.hanzo.cloud.model.AiChatChoice;
import ai.hanzo.cloud.model.AiChatCompletionRequest;
import ai.hanzo.cloud.model.AiChatCompletionResponse;
import ai.hanzo.cloud.model.AiChatMessage;
import ai.hanzo.cloud.model.AiUsage;

import java.util.List;

/**
 * chat — one completion.
 *
 * <p>Operation: {@code ai_createChatCompletion} — POST /v1/chat/completions,
 * the OpenAI-compatible surface.
 *
 * <p>Non-streaming on purpose: streaming is SSE, a different transport that a
 * generated client hands back as an opaque body, so demonstrating it here would
 * teach the wrong shape.
 *
 * <pre>
 *   HANZO_API_KEY=sk-... ./gradlew :examples:chat
 * </pre>
 */
public final class Chat {

    public static void main(String[] args) {
        AiChatMessage message = new AiChatMessage()
                .role(AiChatMessage.RoleEnum.USER)
                .content("In one sentence: what is Hanzo?");

        AiChatCompletionRequest request = new AiChatCompletionRequest()
                .model(Hanzo.model())
                .messages(List.of(message));

        OpenAiCompatibleApi ai = new OpenAiCompatibleApi(Hanzo.client());
        try {
            AiChatCompletionResponse response = ai.aiCreateChatCompletion(request);

            List<AiChatChoice> choices = response.getChoices();
            if (choices == null || choices.isEmpty()) {
                System.err.println("no choices returned");
                System.exit(1);
            }
            // `content` is `{}` in the document — a string for a plain reply, an
            // array of parts for a multimodal one — so it arrives as Object.
            System.out.println(choices.get(0).getMessage().getContent());

            AiUsage usage = response.getUsage();
            if (usage != null) {
                System.out.printf("%ntokens: %d prompt + %d completion%n",
                        usage.getPromptTokens(), usage.getCompletionTokens());
            }
        } catch (ApiException e) {
            System.err.printf("chat completion failed: HTTP %d %s%n", e.getCode(), e.getResponseBody());
            System.exit(1);
        }
    }
}
