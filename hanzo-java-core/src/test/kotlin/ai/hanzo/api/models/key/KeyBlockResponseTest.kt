// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyBlockResponseTest {

    @Test
    fun create() {
        val keyBlockResponse =
            KeyBlockResponse.builder()
                .token("token")
                .aliases(
                    KeyBlockResponse.Aliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .addAllowedRoute(JsonValue.from(mapOf<String, Any>()))
                .autoRotate(true)
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .config(
                    KeyBlockResponse.Config.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .expires("string")
                .keyAlias("key_alias")
                .keyName("key_name")
                .keyRotationAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastRotationAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .litellmBudgetTable(
                    KeyBlockResponse.LitellmBudgetTable.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(
                    KeyBlockResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelMaxBudget(
                    KeyBlockResponse.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelSpend(
                    KeyBlockResponse.ModelSpend.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    KeyBlockResponse.ObjectPermission.builder()
                        .objectPermissionId("object_permission_id")
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            KeyBlockResponse.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .objectPermissionId("object_permission_id")
                .orgId("org_id")
                .permissions(
                    KeyBlockResponse.Permissions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rotationCount(0L)
                .rotationInterval("rotation_interval")
                .routerSettings(
                    KeyBlockResponse.RouterSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
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
        assertThat(keyBlockResponse.aliases())
            .contains(
                KeyBlockResponse.Aliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(keyBlockResponse.allowedCacheControls().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.allowedRoutes().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.autoRotate()).contains(true)
        assertThat(keyBlockResponse.blocked()).contains(true)
        assertThat(keyBlockResponse.budgetDuration()).contains("budget_duration")
        assertThat(keyBlockResponse.budgetResetAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(keyBlockResponse.config())
            .contains(
                KeyBlockResponse.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(keyBlockResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(keyBlockResponse.createdBy()).contains("created_by")
        assertThat(keyBlockResponse.expires()).contains(KeyBlockResponse.Expires.ofString("string"))
        assertThat(keyBlockResponse.keyAlias()).contains("key_alias")
        assertThat(keyBlockResponse.keyName()).contains("key_name")
        assertThat(keyBlockResponse.keyRotationAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(keyBlockResponse.lastRotationAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(keyBlockResponse.litellmBudgetTable())
            .contains(
                KeyBlockResponse.LitellmBudgetTable.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(keyBlockResponse.maxBudget()).contains(0.0)
        assertThat(keyBlockResponse.maxParallelRequests()).contains(0L)
        assertThat(keyBlockResponse.metadata())
            .contains(
                KeyBlockResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(keyBlockResponse.modelMaxBudget())
            .contains(
                KeyBlockResponse.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(keyBlockResponse.modelSpend())
            .contains(
                KeyBlockResponse.ModelSpend.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(keyBlockResponse.models().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(keyBlockResponse.objectPermission())
            .contains(
                KeyBlockResponse.ObjectPermission.builder()
                    .objectPermissionId("object_permission_id")
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        KeyBlockResponse.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
        assertThat(keyBlockResponse.objectPermissionId()).contains("object_permission_id")
        assertThat(keyBlockResponse.orgId()).contains("org_id")
        assertThat(keyBlockResponse.permissions())
            .contains(
                KeyBlockResponse.Permissions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(keyBlockResponse.rotationCount()).contains(0L)
        assertThat(keyBlockResponse.rotationInterval()).contains("rotation_interval")
        assertThat(keyBlockResponse.routerSettings())
            .contains(
                KeyBlockResponse.RouterSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyBlockResponse =
            KeyBlockResponse.builder()
                .token("token")
                .aliases(
                    KeyBlockResponse.Aliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .addAllowedRoute(JsonValue.from(mapOf<String, Any>()))
                .autoRotate(true)
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .config(
                    KeyBlockResponse.Config.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .expires("string")
                .keyAlias("key_alias")
                .keyName("key_name")
                .keyRotationAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastRotationAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .litellmBudgetTable(
                    KeyBlockResponse.LitellmBudgetTable.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(
                    KeyBlockResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelMaxBudget(
                    KeyBlockResponse.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelSpend(
                    KeyBlockResponse.ModelSpend.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    KeyBlockResponse.ObjectPermission.builder()
                        .objectPermissionId("object_permission_id")
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            KeyBlockResponse.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .objectPermissionId("object_permission_id")
                .orgId("org_id")
                .permissions(
                    KeyBlockResponse.Permissions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rotationCount(0L)
                .rotationInterval("rotation_interval")
                .routerSettings(
                    KeyBlockResponse.RouterSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
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
