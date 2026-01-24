// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.embeddings

import ai.hanzo.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingCreateParamsTest {

    @Test
    fun create() {
        EmbeddingCreateParams.builder()
            .model("model")
            .apiBase("api_base")
            .apiKey("api_key")
            .apiType("api_type")
            .apiVersion("api_version")
            .caching(true)
            .customLlmProvider("string")
            .addInput("string")
            .litellmCallId("litellm_call_id")
            .litellmLoggingObj(
                EmbeddingCreateParams.LitellmLoggingObj.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .loggerFn("logger_fn")
            .timeout(0L)
            .user("user")
            .build()
    }

    @Test
    fun body() {
        val params =
            EmbeddingCreateParams.builder()
                .model("model")
                .apiBase("api_base")
                .apiKey("api_key")
                .apiType("api_type")
                .apiVersion("api_version")
                .caching(true)
                .customLlmProvider("string")
                .addInput("string")
                .litellmCallId("litellm_call_id")
                .litellmLoggingObj(
                    EmbeddingCreateParams.LitellmLoggingObj.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .loggerFn("logger_fn")
                .timeout(0L)
                .user("user")
                .build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
        assertThat(body.apiBase()).contains("api_base")
        assertThat(body.apiKey()).contains("api_key")
        assertThat(body.apiType()).contains("api_type")
        assertThat(body.apiVersion()).contains("api_version")
        assertThat(body.caching()).contains(true)
        assertThat(body.customLlmProvider())
            .contains(EmbeddingCreateParams.CustomLlmProvider.ofString("string"))
        assertThat(body.input().getOrNull()).containsExactly("string")
        assertThat(body.litellmCallId()).contains("litellm_call_id")
        assertThat(body.litellmLoggingObj())
            .contains(
                EmbeddingCreateParams.LitellmLoggingObj.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.loggerFn()).contains("logger_fn")
        assertThat(body.timeout()).contains(0L)
        assertThat(body.user()).contains("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmbeddingCreateParams.builder().model("model").build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
    }
}
