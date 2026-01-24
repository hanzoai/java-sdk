// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.openai.deployments

import ai.hanzo.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeploymentEmbedParamsTest {

    @Test
    fun create() {
        DeploymentEmbedParams.builder()
            .pathModel("model")
            .bodyModel("model")
            .apiBase("api_base")
            .apiKey("api_key")
            .apiType("api_type")
            .apiVersion("api_version")
            .caching(true)
            .customLlmProvider("string")
            .addInput("string")
            .litellmCallId("litellm_call_id")
            .litellmLoggingObj(
                DeploymentEmbedParams.LitellmLoggingObj.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .loggerFn("logger_fn")
            .timeout(0L)
            .user("user")
            .build()
    }

    @Test
    fun pathParams() {
        val params = DeploymentEmbedParams.builder().pathModel("model").bodyModel("model").build()

        assertThat(params._pathParam(0)).isEqualTo("model")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DeploymentEmbedParams.builder()
                .pathModel("model")
                .bodyModel("model")
                .apiBase("api_base")
                .apiKey("api_key")
                .apiType("api_type")
                .apiVersion("api_version")
                .caching(true)
                .customLlmProvider("string")
                .addInput("string")
                .litellmCallId("litellm_call_id")
                .litellmLoggingObj(
                    DeploymentEmbedParams.LitellmLoggingObj.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .loggerFn("logger_fn")
                .timeout(0L)
                .user("user")
                .build()

        val body = params._body()

        assertThat(body.bodyModel()).isEqualTo("model")
        assertThat(body.apiBase()).contains("api_base")
        assertThat(body.apiKey()).contains("api_key")
        assertThat(body.apiType()).contains("api_type")
        assertThat(body.apiVersion()).contains("api_version")
        assertThat(body.caching()).contains(true)
        assertThat(body.customLlmProvider())
            .contains(DeploymentEmbedParams.CustomLlmProvider.ofString("string"))
        assertThat(body.input().getOrNull()).containsExactly("string")
        assertThat(body.litellmCallId()).contains("litellm_call_id")
        assertThat(body.litellmLoggingObj())
            .contains(
                DeploymentEmbedParams.LitellmLoggingObj.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.loggerFn()).contains("logger_fn")
        assertThat(body.timeout()).contains(0L)
        assertThat(body.user()).contains("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DeploymentEmbedParams.builder().pathModel("model").bodyModel("model").build()

        val body = params._body()

        assertThat(body.bodyModel()).isEqualTo("model")
    }
}
