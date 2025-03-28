// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.utils

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UtilTransformRequestResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val utilTransformRequestResponse =
            UtilTransformRequestResponse.builder()
                .error("error")
                .rawRequestApiBase("raw_request_api_base")
                .rawRequestBody(JsonValue.from(mapOf<String, Any>()))
                .rawRequestHeaders(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(utilTransformRequestResponse.error()).contains("error")
        assertThat(utilTransformRequestResponse.rawRequestApiBase())
            .contains("raw_request_api_base")
        assertThat(utilTransformRequestResponse._rawRequestBody())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(utilTransformRequestResponse._rawRequestHeaders())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
