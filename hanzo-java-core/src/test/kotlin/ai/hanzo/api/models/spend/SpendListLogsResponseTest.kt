// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.spend

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendListLogsResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val spendListLogsResponse =
            SpendListLogsResponse.builder()
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

        assertThat(spendListLogsResponse.apiKey()).isEqualTo("api_key")
        assertThat(spendListLogsResponse.callType()).isEqualTo("call_type")
        assertThat(spendListLogsResponse.endTime())
            .contains(SpendListLogsResponse.EndTime.ofString("string"))
        assertThat(spendListLogsResponse.messages())
            .contains(SpendListLogsResponse.Messages.ofString("string"))
        assertThat(spendListLogsResponse.requestId()).isEqualTo("request_id")
        assertThat(spendListLogsResponse.response())
            .contains(SpendListLogsResponse.Response.ofString("string"))
        assertThat(spendListLogsResponse.startTime())
            .contains(SpendListLogsResponse.StartTime.ofString("string"))
        assertThat(spendListLogsResponse.apiBase()).contains("api_base")
        assertThat(spendListLogsResponse.cacheHit()).contains("cache_hit")
        assertThat(spendListLogsResponse.cacheKey()).contains("cache_key")
        assertThat(spendListLogsResponse.completionTokens()).contains(0L)
        assertThat(spendListLogsResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(spendListLogsResponse.model()).contains("model")
        assertThat(spendListLogsResponse.promptTokens()).contains(0L)
        assertThat(spendListLogsResponse._requestTags())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(spendListLogsResponse.requesterIpAddress()).contains("requester_ip_address")
        assertThat(spendListLogsResponse.spend()).contains(0.0)
        assertThat(spendListLogsResponse.totalTokens()).contains(0L)
        assertThat(spendListLogsResponse.user()).contains("user")
    }
}
