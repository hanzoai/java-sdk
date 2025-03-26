// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.global.spend

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendListTagsResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val spendListTagsResponse =
            SpendListTagsResponse.builder()
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

        assertThat(spendListTagsResponse.apiKey()).isEqualTo("api_key")
        assertThat(spendListTagsResponse.callType()).isEqualTo("call_type")
        assertThat(spendListTagsResponse.endTime())
            .contains(SpendListTagsResponse.EndTime.ofString("string"))
        assertThat(spendListTagsResponse.messages())
            .contains(SpendListTagsResponse.Messages.ofString("string"))
        assertThat(spendListTagsResponse.requestId()).isEqualTo("request_id")
        assertThat(spendListTagsResponse.response())
            .contains(SpendListTagsResponse.Response.ofString("string"))
        assertThat(spendListTagsResponse.startTime())
            .contains(SpendListTagsResponse.StartTime.ofString("string"))
        assertThat(spendListTagsResponse.apiBase()).contains("api_base")
        assertThat(spendListTagsResponse.cacheHit()).contains("cache_hit")
        assertThat(spendListTagsResponse.cacheKey()).contains("cache_key")
        assertThat(spendListTagsResponse.completionTokens()).contains(0L)
        assertThat(spendListTagsResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(spendListTagsResponse.model()).contains("model")
        assertThat(spendListTagsResponse.promptTokens()).contains(0L)
        assertThat(spendListTagsResponse._requestTags())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(spendListTagsResponse.requesterIpAddress()).contains("requester_ip_address")
        assertThat(spendListTagsResponse.spend()).contains(0.0)
        assertThat(spendListTagsResponse.totalTokens()).contains(0L)
        assertThat(spendListTagsResponse.user()).contains("user")
    }
}
