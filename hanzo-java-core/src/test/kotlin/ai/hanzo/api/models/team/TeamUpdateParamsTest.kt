// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamUpdateParamsTest {

    @Test
    fun create() {
        TeamUpdateParams.builder()
            .litellmChangedBy("litellm-changed-by")
            .teamId("team_id")
            .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
            .addAllowedVectorStoreIndex(
                TeamUpdateParams.AllowedVectorStoreIndex.builder()
                    .indexName("index_name")
                    .addIndexPermission(
                        TeamUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                    )
                    .build()
            )
            .blocked(true)
            .budgetDuration("budget_duration")
            .addGuardrail("string")
            .maxBudget(0.0)
            .metadata(
                TeamUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelAliases(
                TeamUpdateParams.ModelAliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelRpmLimit(
                TeamUpdateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .modelTpmLimit(
                TeamUpdateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .objectPermission(
                TeamUpdateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        TeamUpdateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
            .organizationId("organization_id")
            .addPrompt("string")
            .routerSettings(
                TeamUpdateParams.RouterSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .rpmLimit(0L)
            .secretManagerSettings(
                TeamUpdateParams.SecretManagerSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addTag(JsonValue.from(mapOf<String, Any>()))
            .teamAlias("team_alias")
            .teamMemberBudget(0.0)
            .teamMemberBudgetDuration("team_member_budget_duration")
            .teamMemberKeyDuration("team_member_key_duration")
            .teamMemberRpmLimit(0L)
            .teamMemberTpmLimit(0L)
            .tpmLimit(0L)
            .build()
    }

    @Test
    fun headers() {
        val params =
            TeamUpdateParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .teamId("team_id")
                .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedVectorStoreIndex(
                    TeamUpdateParams.AllowedVectorStoreIndex.builder()
                        .indexName("index_name")
                        .addIndexPermission(
                            TeamUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                        )
                        .build()
                )
                .blocked(true)
                .budgetDuration("budget_duration")
                .addGuardrail("string")
                .maxBudget(0.0)
                .metadata(
                    TeamUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelAliases(
                    TeamUpdateParams.ModelAliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    TeamUpdateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .modelTpmLimit(
                    TeamUpdateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    TeamUpdateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            TeamUpdateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .organizationId("organization_id")
                .addPrompt("string")
                .routerSettings(
                    TeamUpdateParams.RouterSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rpmLimit(0L)
                .secretManagerSettings(
                    TeamUpdateParams.SecretManagerSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .teamAlias("team_alias")
                .teamMemberBudget(0.0)
                .teamMemberBudgetDuration("team_member_budget_duration")
                .teamMemberKeyDuration("team_member_key_duration")
                .teamMemberRpmLimit(0L)
                .teamMemberTpmLimit(0L)
                .tpmLimit(0L)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("litellm-changed-by", "litellm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = TeamUpdateParams.builder().teamId("team_id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            TeamUpdateParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .teamId("team_id")
                .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedVectorStoreIndex(
                    TeamUpdateParams.AllowedVectorStoreIndex.builder()
                        .indexName("index_name")
                        .addIndexPermission(
                            TeamUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                        )
                        .build()
                )
                .blocked(true)
                .budgetDuration("budget_duration")
                .addGuardrail("string")
                .maxBudget(0.0)
                .metadata(
                    TeamUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelAliases(
                    TeamUpdateParams.ModelAliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    TeamUpdateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .modelTpmLimit(
                    TeamUpdateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    TeamUpdateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            TeamUpdateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .organizationId("organization_id")
                .addPrompt("string")
                .routerSettings(
                    TeamUpdateParams.RouterSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rpmLimit(0L)
                .secretManagerSettings(
                    TeamUpdateParams.SecretManagerSettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .teamAlias("team_alias")
                .teamMemberBudget(0.0)
                .teamMemberBudgetDuration("team_member_budget_duration")
                .teamMemberKeyDuration("team_member_key_duration")
                .teamMemberRpmLimit(0L)
                .teamMemberTpmLimit(0L)
                .tpmLimit(0L)
                .build()

        val body = params._body()

        assertThat(body.teamId()).isEqualTo("team_id")
        assertThat(body.allowedPassthroughRoutes().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.allowedVectorStoreIndexes().getOrNull())
            .containsExactly(
                TeamUpdateParams.AllowedVectorStoreIndex.builder()
                    .indexName("index_name")
                    .addIndexPermission(
                        TeamUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                    )
                    .build()
            )
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetDuration()).contains("budget_duration")
        assertThat(body.guardrails().getOrNull()).containsExactly("string")
        assertThat(body.maxBudget()).contains(0.0)
        assertThat(body.metadata())
            .contains(
                TeamUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelAliases())
            .contains(
                TeamUpdateParams.ModelAliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelRpmLimit())
            .contains(
                TeamUpdateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.modelTpmLimit())
            .contains(
                TeamUpdateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.models().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.objectPermission())
            .contains(
                TeamUpdateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        TeamUpdateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
        assertThat(body.organizationId()).contains("organization_id")
        assertThat(body.prompts().getOrNull()).containsExactly("string")
        assertThat(body.routerSettings())
            .contains(
                TeamUpdateParams.RouterSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.rpmLimit()).contains(0L)
        assertThat(body.secretManagerSettings())
            .contains(
                TeamUpdateParams.SecretManagerSettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.tags().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.teamAlias()).contains("team_alias")
        assertThat(body.teamMemberBudget()).contains(0.0)
        assertThat(body.teamMemberBudgetDuration()).contains("team_member_budget_duration")
        assertThat(body.teamMemberKeyDuration()).contains("team_member_key_duration")
        assertThat(body.teamMemberRpmLimit()).contains(0L)
        assertThat(body.teamMemberTpmLimit()).contains(0L)
        assertThat(body.tpmLimit()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TeamUpdateParams.builder().teamId("team_id").build()

        val body = params._body()

        assertThat(body.teamId()).isEqualTo("team_id")
    }
}
