// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.user

import ai.hanzo.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateParamsTest {

    @Test
    fun create() {
        UserCreateParams.builder()
            .aliases(
                UserCreateParams.Aliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
            .autoCreateKey(true)
            .blocked(true)
            .budgetDuration("budget_duration")
            .config(
                UserCreateParams.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .duration("duration")
            .addGuardrail("string")
            .keyAlias("key_alias")
            .maxBudget(0.0)
            .maxParallelRequests(0L)
            .metadata(
                UserCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelMaxBudget(
                UserCreateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelRpmLimit(
                UserCreateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelTpmLimit(
                UserCreateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .objectPermission(
                UserCreateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        UserCreateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
            .addOrganization("string")
            .permissions(
                UserCreateParams.Permissions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addPrompt("string")
            .rpmLimit(0L)
            .sendInviteEmail(true)
            .spend(0.0)
            .ssoUserId("sso_user_id")
            .teamId("team_id")
            .teamsOfStrings(listOf("string"))
            .tpmLimit(0L)
            .userAlias("user_alias")
            .userEmail("user_email")
            .userId("user_id")
            .userRole(UserCreateParams.UserRole.PROXY_ADMIN)
            .build()
    }

    @Test
    fun body() {
        val params =
            UserCreateParams.builder()
                .aliases(
                    UserCreateParams.Aliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .autoCreateKey(true)
                .blocked(true)
                .budgetDuration("budget_duration")
                .config(
                    UserCreateParams.Config.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .duration("duration")
                .addGuardrail("string")
                .keyAlias("key_alias")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(
                    UserCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelMaxBudget(
                    UserCreateParams.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    UserCreateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelTpmLimit(
                    UserCreateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    UserCreateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            UserCreateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .addOrganization("string")
                .permissions(
                    UserCreateParams.Permissions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addPrompt("string")
                .rpmLimit(0L)
                .sendInviteEmail(true)
                .spend(0.0)
                .ssoUserId("sso_user_id")
                .teamId("team_id")
                .teamsOfStrings(listOf("string"))
                .tpmLimit(0L)
                .userAlias("user_alias")
                .userEmail("user_email")
                .userId("user_id")
                .userRole(UserCreateParams.UserRole.PROXY_ADMIN)
                .build()

        val body = params._body()

        assertThat(body.aliases())
            .contains(
                UserCreateParams.Aliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.allowedCacheControls().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.autoCreateKey()).contains(true)
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetDuration()).contains("budget_duration")
        assertThat(body.config())
            .contains(
                UserCreateParams.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.duration()).contains("duration")
        assertThat(body.guardrails().getOrNull()).containsExactly("string")
        assertThat(body.keyAlias()).contains("key_alias")
        assertThat(body.maxBudget()).contains(0.0)
        assertThat(body.maxParallelRequests()).contains(0L)
        assertThat(body.metadata())
            .contains(
                UserCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelMaxBudget())
            .contains(
                UserCreateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelRpmLimit())
            .contains(
                UserCreateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelTpmLimit())
            .contains(
                UserCreateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.models().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.objectPermission())
            .contains(
                UserCreateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        UserCreateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
        assertThat(body.organizations().getOrNull()).containsExactly("string")
        assertThat(body.permissions())
            .contains(
                UserCreateParams.Permissions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.prompts().getOrNull()).containsExactly("string")
        assertThat(body.rpmLimit()).contains(0L)
        assertThat(body.sendInviteEmail()).contains(true)
        assertThat(body.spend()).contains(0.0)
        assertThat(body.ssoUserId()).contains("sso_user_id")
        assertThat(body.teamId()).contains("team_id")
        assertThat(body.teams()).contains(UserCreateParams.Teams.ofStrings(listOf("string")))
        assertThat(body.tpmLimit()).contains(0L)
        assertThat(body.userAlias()).contains("user_alias")
        assertThat(body.userEmail()).contains("user_email")
        assertThat(body.userId()).contains("user_id")
        assertThat(body.userRole()).contains(UserCreateParams.UserRole.PROXY_ADMIN)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserCreateParams.builder().build()

        val body = params._body()
    }
}
