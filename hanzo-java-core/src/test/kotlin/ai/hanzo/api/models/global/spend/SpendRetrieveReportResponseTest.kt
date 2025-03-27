// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.global.spend

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendRetrieveReportResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val spendRetrieveReportResponse =
            SpendRetrieveReportResponse.builder()
                .apiKey("api_key")
                .callType("call_type")
                .endTime("string")
                .messages("string")
                .requestId("request_id")
                .response("string")
                .startTime("string")
                .apiBase("api_base")
                .cacheHit("cache_hit")
                .cacheKey("cache_key")
                .completionTokens(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .model("model")
                .promptTokens(0L)
                .requestTags(JsonValue.from(mapOf<String, Any>()))
                .requesterIpAddress("requester_ip_address")
                .spend(0.0)
                .totalTokens(0L)
                .user("user")
                .build()

        assertThat(spendRetrieveReportResponse.apiKey()).isEqualTo("api_key")
        assertThat(spendRetrieveReportResponse.callType()).isEqualTo("call_type")
        assertThat(spendRetrieveReportResponse.endTime())
            .contains(SpendRetrieveReportResponse.EndTime.ofString("string"))
        assertThat(spendRetrieveReportResponse.messages())
            .contains(SpendRetrieveReportResponse.Messages.ofString("string"))
        assertThat(spendRetrieveReportResponse.requestId()).isEqualTo("request_id")
        assertThat(spendRetrieveReportResponse.response())
            .contains(SpendRetrieveReportResponse.Response.ofString("string"))
        assertThat(spendRetrieveReportResponse.startTime())
            .contains(SpendRetrieveReportResponse.StartTime.ofString("string"))
        assertThat(spendRetrieveReportResponse.apiBase()).contains("api_base")
        assertThat(spendRetrieveReportResponse.cacheHit()).contains("cache_hit")
        assertThat(spendRetrieveReportResponse.cacheKey()).contains("cache_key")
        assertThat(spendRetrieveReportResponse.completionTokens()).contains(0L)
        assertThat(spendRetrieveReportResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(spendRetrieveReportResponse.model()).contains("model")
        assertThat(spendRetrieveReportResponse.promptTokens()).contains(0L)
        assertThat(spendRetrieveReportResponse._requestTags())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(spendRetrieveReportResponse.requesterIpAddress())
            .contains("requester_ip_address")
        assertThat(spendRetrieveReportResponse.spend()).contains(0.0)
        assertThat(spendRetrieveReportResponse.totalTokens()).contains(0L)
        assertThat(spendRetrieveReportResponse.user()).contains("user")
    }
}
