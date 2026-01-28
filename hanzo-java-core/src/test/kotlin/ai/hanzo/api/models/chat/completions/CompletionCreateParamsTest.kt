// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.chat.completions

import ai.hanzo.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompletionCreateParamsTest {

    @Test
    fun create() {
        CompletionCreateParams.builder()
            .addMessage(
                CompletionCreateParams.Message.ChatCompletionUserMessage.builder()
                    .content("Hello, how are you?")
                    .cacheControl(
                        CompletionCreateParams.Message.ChatCompletionUserMessage.CacheControl
                            .builder()
                            .build()
                    )
                    .build()
            )
            .model("model")
            .caching(true)
            .contextWindowFallbackDict(
                CompletionCreateParams.ContextWindowFallbackDict.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .addFallback("string")
            .frequencyPenalty(0.0)
            .functionCall("string")
            .addFunction(
                CompletionCreateParams.Function.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addGuardrail("string")
            .logitBias(
                CompletionCreateParams.LogitBias.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .logprobs(true)
            .maxTokens(0L)
            .metadata(
                CompletionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .n(0L)
            .numRetries(0L)
            .parallelToolCalls(true)
            .presencePenalty(0.0)
            .responseFormat(
                CompletionCreateParams.ResponseFormat.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .seed(0L)
            .serviceTier("service_tier")
            .stop("string")
            .stream(true)
            .streamOptions(
                CompletionCreateParams.StreamOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .temperature(0.0)
            .toolChoice("string")
            .addTool(
                CompletionCreateParams.Tool.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .topLogprobs(0L)
            .topP(0.0)
            .user("user")
            .build()
    }

    @Test
    fun body() {
        val params =
            CompletionCreateParams.builder()
                .addMessage(
                    CompletionCreateParams.Message.ChatCompletionUserMessage.builder()
                        .content("Hello, how are you?")
                        .cacheControl(
                            CompletionCreateParams.Message.ChatCompletionUserMessage.CacheControl
                                .builder()
                                .build()
                        )
                        .build()
                )
                .model("model")
                .caching(true)
                .contextWindowFallbackDict(
                    CompletionCreateParams.ContextWindowFallbackDict.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addFallback("string")
                .frequencyPenalty(0.0)
                .functionCall("string")
                .addFunction(
                    CompletionCreateParams.Function.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addGuardrail("string")
                .logitBias(
                    CompletionCreateParams.LogitBias.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .logprobs(true)
                .maxTokens(0L)
                .metadata(
                    CompletionCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .n(0L)
                .numRetries(0L)
                .parallelToolCalls(true)
                .presencePenalty(0.0)
                .responseFormat(
                    CompletionCreateParams.ResponseFormat.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .seed(0L)
                .serviceTier("service_tier")
                .stop("string")
                .stream(true)
                .streamOptions(
                    CompletionCreateParams.StreamOptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .temperature(0.0)
                .toolChoice("string")
                .addTool(
                    CompletionCreateParams.Tool.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .topLogprobs(0L)
                .topP(0.0)
                .user("user")
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                CompletionCreateParams.Message.ofChatCompletionUser(
                    CompletionCreateParams.Message.ChatCompletionUserMessage.builder()
                        .content("Hello, how are you?")
                        .cacheControl(
                            CompletionCreateParams.Message.ChatCompletionUserMessage.CacheControl
                                .builder()
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.caching()).contains(true)
        assertThat(body.contextWindowFallbackDict())
            .contains(
                CompletionCreateParams.ContextWindowFallbackDict.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.fallbacks().getOrNull()).containsExactly("string")
        assertThat(body.frequencyPenalty()).contains(0.0)
        assertThat(body.functionCall())
            .contains(CompletionCreateParams.FunctionCall.ofString("string"))
        assertThat(body.functions().getOrNull())
            .containsExactly(
                CompletionCreateParams.Function.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.guardrails().getOrNull()).containsExactly("string")
        assertThat(body.logitBias())
            .contains(
                CompletionCreateParams.LogitBias.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.logprobs()).contains(true)
        assertThat(body.maxTokens()).contains(0L)
        assertThat(body.metadata())
            .contains(
                CompletionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.n()).contains(0L)
        assertThat(body.numRetries()).contains(0L)
        assertThat(body.parallelToolCalls()).contains(true)
        assertThat(body.presencePenalty()).contains(0.0)
        assertThat(body.responseFormat())
            .contains(
                CompletionCreateParams.ResponseFormat.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.seed()).contains(0L)
        assertThat(body.serviceTier()).contains("service_tier")
        assertThat(body.stop()).contains(CompletionCreateParams.Stop.ofString("string"))
        assertThat(body.stream()).contains(true)
        assertThat(body.streamOptions())
            .contains(
                CompletionCreateParams.StreamOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.temperature()).contains(0.0)
        assertThat(body.toolChoice()).contains(CompletionCreateParams.ToolChoice.ofString("string"))
        assertThat(body.tools().getOrNull())
            .containsExactly(
                CompletionCreateParams.Tool.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.topLogprobs()).contains(0L)
        assertThat(body.topP()).contains(0.0)
        assertThat(body.user()).contains("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CompletionCreateParams.builder()
                .addMessage(
                    CompletionCreateParams.Message.ChatCompletionUserMessage.builder()
                        .content("Hello, how are you?")
                        .build()
                )
                .model("model")
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                CompletionCreateParams.Message.ofChatCompletionUser(
                    CompletionCreateParams.Message.ChatCompletionUserMessage.builder()
                        .content("Hello, how are you?")
                        .build()
                )
            )
        assertThat(body.model()).isEqualTo("model")
    }
}
