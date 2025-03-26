// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GenerateKeyResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val generateKeyResponse =
            GenerateKeyResponse.builder()
                .expires(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("key")
                .token("token")
                .aliases(JsonValue.from(mapOf<String, Any>()))
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .config(JsonValue.from(mapOf<String, Any>()))
                .createdBy("created_by")
                .duration("duration")
                .addEnforcedParam("string")
                .addGuardrail("string")
                .keyAlias("key_alias")
                .keyName("key_name")
                .llmBudgetTable(JsonValue.from(mapOf<String, Any>()))
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
                .tokenId("token_id")
                .tpmLimit(0L)
                .updatedBy("updated_by")
                .userId("user_id")
                .build()

        assertThat(generateKeyResponse.expires())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(generateKeyResponse.key()).isEqualTo("key")
        assertThat(generateKeyResponse.token()).contains("token")
        assertThat(generateKeyResponse._aliases()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse.allowedCacheControls().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse.blocked()).contains(true)
        assertThat(generateKeyResponse.budgetDuration()).contains("budget_duration")
        assertThat(generateKeyResponse.budgetId()).contains("budget_id")
        assertThat(generateKeyResponse._config()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse.createdBy()).contains("created_by")
        assertThat(generateKeyResponse.duration()).contains("duration")
        assertThat(generateKeyResponse.enforcedParams().getOrNull()).containsExactly("string")
        assertThat(generateKeyResponse.guardrails().getOrNull()).containsExactly("string")
        assertThat(generateKeyResponse.keyAlias()).contains("key_alias")
        assertThat(generateKeyResponse.keyName()).contains("key_name")
        assertThat(generateKeyResponse._llmBudgetTable())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse.maxBudget()).contains(0.0)
        assertThat(generateKeyResponse.maxParallelRequests()).contains(0L)
        assertThat(generateKeyResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse._modelMaxBudget())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse._modelRpmLimit())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse._modelTpmLimit())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse.models().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse._permissions())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(generateKeyResponse.rpmLimit()).contains(0L)
        assertThat(generateKeyResponse.spend()).contains(0.0)
        assertThat(generateKeyResponse.tags().getOrNull()).containsExactly("string")
        assertThat(generateKeyResponse.teamId()).contains("team_id")
        assertThat(generateKeyResponse.tokenId()).contains("token_id")
        assertThat(generateKeyResponse.tpmLimit()).contains(0L)
        assertThat(generateKeyResponse.updatedBy()).contains("updated_by")
        assertThat(generateKeyResponse.userId()).contains("user_id")
    }
}
