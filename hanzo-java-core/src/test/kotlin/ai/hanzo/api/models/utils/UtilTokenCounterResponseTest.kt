// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UtilTokenCounterResponseTest {

    @Test
    fun create() {
        val utilTokenCounterResponse =
            UtilTokenCounterResponse.builder()
                .modelUsed("model_used")
                .requestModel("request_model")
                .tokenizerType("tokenizer_type")
                .totalTokens(0L)
                .error(true)
                .errorMessage("error_message")
                .originalResponse(
                    UtilTokenCounterResponse.OriginalResponse.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .statusCode(0L)
                .build()

        assertThat(utilTokenCounterResponse.modelUsed()).isEqualTo("model_used")
        assertThat(utilTokenCounterResponse.requestModel()).isEqualTo("request_model")
        assertThat(utilTokenCounterResponse.tokenizerType()).isEqualTo("tokenizer_type")
        assertThat(utilTokenCounterResponse.totalTokens()).isEqualTo(0L)
        assertThat(utilTokenCounterResponse.error()).contains(true)
        assertThat(utilTokenCounterResponse.errorMessage()).contains("error_message")
        assertThat(utilTokenCounterResponse.originalResponse())
            .contains(
                UtilTokenCounterResponse.OriginalResponse.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(utilTokenCounterResponse.statusCode()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val utilTokenCounterResponse =
            UtilTokenCounterResponse.builder()
                .modelUsed("model_used")
                .requestModel("request_model")
                .tokenizerType("tokenizer_type")
                .totalTokens(0L)
                .error(true)
                .errorMessage("error_message")
                .originalResponse(
                    UtilTokenCounterResponse.OriginalResponse.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .statusCode(0L)
                .build()

        val roundtrippedUtilTokenCounterResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(utilTokenCounterResponse),
                jacksonTypeRef<UtilTokenCounterResponse>(),
            )

        assertThat(roundtrippedUtilTokenCounterResponse).isEqualTo(utilTokenCounterResponse)
    }
}
