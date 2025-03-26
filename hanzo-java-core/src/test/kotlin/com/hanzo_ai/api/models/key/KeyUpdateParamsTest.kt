// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.key

import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.http.Headers
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        KeyUpdateParams.builder()
            .llmChangedBy("llm-changed-by")
            .key("key")
            .aliases(JsonValue.from(mapOf<String, Any>()))
            .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
            .blocked(true)
            .budgetDuration("budget_duration")
            .budgetId("budget_id")
            .config(JsonValue.from(mapOf<String, Any>()))
            .duration("duration")
            .addEnforcedParam("string")
            .addGuardrail("string")
            .keyAlias("key_alias")
            .maxBudget(0.0)
            .maxParallelRequests(0L)
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
            .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
            .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .permissions(JsonValue.from(mapOf<String, Any>()))
            .rpmLimit(0L)
            .spend(0.0)
            .addTag("string")
            .teamId("team_id")
            .tempBudgetExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .tempBudgetIncrease(0.0)
            .tpmLimit(0L)
            .userId("user_id")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
            KeyUpdateParams.builder()
                .llmChangedBy("llm-changed-by")
                .key("key")
                .aliases(JsonValue.from(mapOf<String, Any>()))
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .config(JsonValue.from(mapOf<String, Any>()))
                .duration("duration")
                .addEnforcedParam("string")
                .addGuardrail("string")
                .keyAlias("key_alias")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .permissions(JsonValue.from(mapOf<String, Any>()))
                .rpmLimit(0L)
                .spend(0.0)
                .addTag("string")
                .teamId("team_id")
                .tempBudgetExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tempBudgetIncrease(0.0)
                .tpmLimit(0L)
                .userId("user_id")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("llm-changed-by", "llm-changed-by").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headersWithoutOptionalFields() {
        val params = KeyUpdateParams.builder().key("key").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            KeyUpdateParams.builder()
                .llmChangedBy("llm-changed-by")
                .key("key")
                .aliases(JsonValue.from(mapOf<String, Any>()))
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .config(JsonValue.from(mapOf<String, Any>()))
                .duration("duration")
                .addEnforcedParam("string")
                .addGuardrail("string")
                .keyAlias("key_alias")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .permissions(JsonValue.from(mapOf<String, Any>()))
                .rpmLimit(0L)
                .spend(0.0)
                .addTag("string")
                .teamId("team_id")
                .tempBudgetExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tempBudgetIncrease(0.0)
                .tpmLimit(0L)
                .userId("user_id")
                .build()

        val body = params._body()

        assertThat(body.key()).isEqualTo("key")
        assertThat(body._aliases()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.allowedCacheControls().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetDuration()).contains("budget_duration")
        assertThat(body.budgetId()).contains("budget_id")
        assertThat(body._config()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.duration()).contains("duration")
        assertThat(body.enforcedParams().getOrNull()).containsExactly("string")
        assertThat(body.guardrails().getOrNull()).containsExactly("string")
        assertThat(body.keyAlias()).contains("key_alias")
        assertThat(body.maxBudget()).contains(0.0)
        assertThat(body.maxParallelRequests()).contains(0L)
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._modelMaxBudget()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._modelRpmLimit()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._modelTpmLimit()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.models().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._permissions()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.rpmLimit()).contains(0L)
        assertThat(body.spend()).contains(0.0)
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.teamId()).contains("team_id")
        assertThat(body.tempBudgetExpiry())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.tempBudgetIncrease()).contains(0.0)
        assertThat(body.tpmLimit()).contains(0L)
        assertThat(body.userId()).contains("user_id")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = KeyUpdateParams.builder().key("key").build()

        val body = params._body()

        assertThat(body.key()).isEqualTo("key")
    }
}
