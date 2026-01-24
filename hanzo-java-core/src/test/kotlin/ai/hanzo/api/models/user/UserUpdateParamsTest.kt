// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.user

import ai.hanzo.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateParamsTest {

    @Test
    fun create() {
        UserUpdateParams.builder()
            .aliases(
                UserUpdateParams.Aliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
            .blocked(true)
            .budgetDuration("budget_duration")
            .config(
                UserUpdateParams.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .duration("duration")
            .addGuardrail("string")
            .keyAlias("key_alias")
            .maxBudget(0.0)
            .maxParallelRequests(0L)
            .metadata(
                UserUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelMaxBudget(
                UserUpdateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelRpmLimit(
                UserUpdateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelTpmLimit(
                UserUpdateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .objectPermission(
                UserUpdateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        UserUpdateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
            .password("password")
            .permissions(
                UserUpdateParams.Permissions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addPrompt("string")
            .rpmLimit(0L)
            .spend(0.0)
            .teamId("team_id")
            .tpmLimit(0L)
            .userAlias("user_alias")
            .userEmail("user_email")
            .userId("user_id")
            .userRole(UserUpdateParams.UserRole.PROXY_ADMIN)
            .build()
    }

    @Test
    fun body() {
        val params =
            UserUpdateParams.builder()
                .aliases(
                    UserUpdateParams.Aliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .config(
                    UserUpdateParams.Config.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .duration("duration")
                .addGuardrail("string")
                .keyAlias("key_alias")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(
                    UserUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelMaxBudget(
                    UserUpdateParams.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    UserUpdateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelTpmLimit(
                    UserUpdateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    UserUpdateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            UserUpdateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .password("password")
                .permissions(
                    UserUpdateParams.Permissions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addPrompt("string")
                .rpmLimit(0L)
                .spend(0.0)
                .teamId("team_id")
                .tpmLimit(0L)
                .userAlias("user_alias")
                .userEmail("user_email")
                .userId("user_id")
                .userRole(UserUpdateParams.UserRole.PROXY_ADMIN)
                .build()

        val body = params._body()

        assertThat(body.aliases())
            .contains(
                UserUpdateParams.Aliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.allowedCacheControls().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetDuration()).contains("budget_duration")
        assertThat(body.config())
            .contains(
                UserUpdateParams.Config.builder()
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
                UserUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelMaxBudget())
            .contains(
                UserUpdateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelRpmLimit())
            .contains(
                UserUpdateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelTpmLimit())
            .contains(
                UserUpdateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.models().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.objectPermission())
            .contains(
                UserUpdateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        UserUpdateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
        assertThat(body.password()).contains("password")
        assertThat(body.permissions())
            .contains(
                UserUpdateParams.Permissions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.prompts().getOrNull()).containsExactly("string")
        assertThat(body.rpmLimit()).contains(0L)
        assertThat(body.spend()).contains(0.0)
        assertThat(body.teamId()).contains("team_id")
        assertThat(body.tpmLimit()).contains(0L)
        assertThat(body.userAlias()).contains("user_alias")
        assertThat(body.userEmail()).contains("user_email")
        assertThat(body.userId()).contains("user_id")
        assertThat(body.userRole()).contains(UserUpdateParams.UserRole.PROXY_ADMIN)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserUpdateParams.builder().build()

        val body = params._body()
    }
}
