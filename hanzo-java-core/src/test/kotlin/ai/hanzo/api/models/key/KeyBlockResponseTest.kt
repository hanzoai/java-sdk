// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyBlockResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val keyBlockResponse =
            KeyBlockResponse.builder()
                .token("token")
                .aliases(JsonValue.from(mapOf<String, Any>()))
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .config(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .expires("string")
                .keyAlias("key_alias")
                .keyName("key_name")
                .llmBudgetTable(JsonValue.from(mapOf<String, Any>()))
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .modelSpend(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .orgId("org_id")
                .permissions(JsonValue.from(mapOf<String, Any>()))
                .rpmLimit(0L)
                .softBudgetCooldown(true)
                .spend(0.0)
                .teamId("team_id")
                .tpmLimit(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBy("updated_by")
                .userId("user_id")
                .build()

        assertThat(keyBlockResponse.token()).contains("token")
        assertThat(keyBlockResponse._aliases()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.allowedCacheControls().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.blocked()).contains(true)
        assertThat(keyBlockResponse.budgetDuration()).contains("budget_duration")
        assertThat(keyBlockResponse.budgetResetAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(keyBlockResponse._config()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(keyBlockResponse.createdBy()).contains("created_by")
        assertThat(keyBlockResponse.expires()).contains(KeyBlockResponse.Expires.ofString("string"))
        assertThat(keyBlockResponse.keyAlias()).contains("key_alias")
        assertThat(keyBlockResponse.keyName()).contains("key_name")
        assertThat(keyBlockResponse._llmBudgetTable())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.maxBudget()).contains(0.0)
        assertThat(keyBlockResponse.maxParallelRequests()).contains(0L)
        assertThat(keyBlockResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse._modelMaxBudget())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse._modelSpend()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.models().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.orgId()).contains("org_id")
        assertThat(keyBlockResponse._permissions()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.rpmLimit()).contains(0L)
        assertThat(keyBlockResponse.softBudgetCooldown()).contains(true)
        assertThat(keyBlockResponse.spend()).contains(0.0)
        assertThat(keyBlockResponse.teamId()).contains("team_id")
        assertThat(keyBlockResponse.tpmLimit()).contains(0L)
        assertThat(keyBlockResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(keyBlockResponse.updatedBy()).contains("updated_by")
        assertThat(keyBlockResponse.userId()).contains("user_id")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyBlockResponse =
            KeyBlockResponse.builder()
                .token("token")
                .aliases(JsonValue.from(mapOf<String, Any>()))
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .config(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .expires("string")
                .keyAlias("key_alias")
                .keyName("key_name")
                .llmBudgetTable(JsonValue.from(mapOf<String, Any>()))
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .modelSpend(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .orgId("org_id")
                .permissions(JsonValue.from(mapOf<String, Any>()))
                .rpmLimit(0L)
                .softBudgetCooldown(true)
                .spend(0.0)
                .teamId("team_id")
                .tpmLimit(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBy("updated_by")
                .userId("user_id")
                .build()

        val roundtrippedKeyBlockResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(keyBlockResponse),
                jacksonTypeRef<KeyBlockResponse>(),
            )

        assertThat(roundtrippedKeyBlockResponse).isEqualTo(keyBlockResponse)
    }
}
