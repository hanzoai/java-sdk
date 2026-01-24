// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyGenerateParamsTest {

    @Test
    fun create() {
        KeyGenerateParams.builder()
            .litellmChangedBy("litellm-changed-by")
            .aliases(
                KeyGenerateParams.Aliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
            .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
            .addAllowedRoute(JsonValue.from(mapOf<String, Any>()))
            .addAllowedVectorStoreIndex(
                KeyGenerateParams.AllowedVectorStoreIndex.builder()
                    .indexName("index_name")
                    .addIndexPermission(
                        KeyGenerateParams.AllowedVectorStoreIndex.IndexPermission.READ
                    )
                    .build()
            )
            .autoRotate(true)
            .blocked(true)
            .budgetDuration("budget_duration")
            .budgetId("budget_id")
            .config(
                KeyGenerateParams.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .duration("duration")
            .addEnforcedParam("string")
            .addGuardrail("string")
            .key("key")
            .keyAlias("key_alias")
            .keyType(KeyGenerateParams.KeyType.LLM_API)
            .maxBudget(0.0)
            .maxParallelRequests(0L)
            .metadata(
                KeyGenerateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelMaxBudget(
                KeyGenerateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelRpmLimit(
                KeyGenerateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelTpmLimit(
                KeyGenerateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .objectPermission(
                KeyGenerateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        KeyGenerateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
            .organizationId("organization_id")
            .permissions(
                KeyGenerateParams.Permissions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addPrompt("string")
            .rotationInterval("rotation_interval")
            .routerSettings(
                KeyGenerateParams.RouterSettings.builder()
                    .allowedFails(0L)
                    .addContextWindowFallback(
                        KeyGenerateParams.RouterSettings.ContextWindowFallback.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .cooldownTime(0.0)
                    .addFallback(
                        KeyGenerateParams.RouterSettings.Fallback.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .maxRetries(0L)
                    .modelGroupAlias(
                        KeyGenerateParams.RouterSettings.ModelGroupAlias.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .modelGroupRetryPolicy(
                        KeyGenerateParams.RouterSettings.ModelGroupRetryPolicy.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .numRetries(0L)
                    .retryAfter(0.0)
                    .routingStrategy("routing_strategy")
                    .routingStrategyArgs(
                        KeyGenerateParams.RouterSettings.RoutingStrategyArgs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .timeout(0.0)
                    .build()
            )
            .rpmLimit(0L)
            .rpmLimitType(KeyGenerateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
            .sendInviteEmail(true)
            .softBudget(0.0)
            .spend(0.0)
            .addTag("string")
            .teamId("team_id")
            .tpmLimit(0L)
            .tpmLimitType(KeyGenerateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
            .userId("user_id")
            .build()
    }

    @Test
    fun headers() {
        val params =
            KeyGenerateParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .aliases(
                    KeyGenerateParams.Aliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedVectorStoreIndex(
                    KeyGenerateParams.AllowedVectorStoreIndex.builder()
                        .indexName("index_name")
                        .addIndexPermission(
                            KeyGenerateParams.AllowedVectorStoreIndex.IndexPermission.READ
                        )
                        .build()
                )
                .autoRotate(true)
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .config(
                    KeyGenerateParams.Config.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .duration("duration")
                .addEnforcedParam("string")
                .addGuardrail("string")
                .key("key")
                .keyAlias("key_alias")
                .keyType(KeyGenerateParams.KeyType.LLM_API)
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(
                    KeyGenerateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelMaxBudget(
                    KeyGenerateParams.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    KeyGenerateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelTpmLimit(
                    KeyGenerateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    KeyGenerateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            KeyGenerateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .organizationId("organization_id")
                .permissions(
                    KeyGenerateParams.Permissions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addPrompt("string")
                .rotationInterval("rotation_interval")
                .routerSettings(
                    KeyGenerateParams.RouterSettings.builder()
                        .allowedFails(0L)
                        .addContextWindowFallback(
                            KeyGenerateParams.RouterSettings.ContextWindowFallback.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .cooldownTime(0.0)
                        .addFallback(
                            KeyGenerateParams.RouterSettings.Fallback.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .maxRetries(0L)
                        .modelGroupAlias(
                            KeyGenerateParams.RouterSettings.ModelGroupAlias.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .modelGroupRetryPolicy(
                            KeyGenerateParams.RouterSettings.ModelGroupRetryPolicy.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .numRetries(0L)
                        .retryAfter(0.0)
                        .routingStrategy("routing_strategy")
                        .routingStrategyArgs(
                            KeyGenerateParams.RouterSettings.RoutingStrategyArgs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .timeout(0.0)
                        .build()
                )
                .rpmLimit(0L)
                .rpmLimitType(KeyGenerateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
                .sendInviteEmail(true)
                .softBudget(0.0)
                .spend(0.0)
                .addTag("string")
                .teamId("team_id")
                .tpmLimit(0L)
                .tpmLimitType(KeyGenerateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
                .userId("user_id")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("litellm-changed-by", "litellm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = KeyGenerateParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            KeyGenerateParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .aliases(
                    KeyGenerateParams.Aliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedVectorStoreIndex(
                    KeyGenerateParams.AllowedVectorStoreIndex.builder()
                        .indexName("index_name")
                        .addIndexPermission(
                            KeyGenerateParams.AllowedVectorStoreIndex.IndexPermission.READ
                        )
                        .build()
                )
                .autoRotate(true)
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .config(
                    KeyGenerateParams.Config.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .duration("duration")
                .addEnforcedParam("string")
                .addGuardrail("string")
                .key("key")
                .keyAlias("key_alias")
                .keyType(KeyGenerateParams.KeyType.LLM_API)
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(
                    KeyGenerateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelMaxBudget(
                    KeyGenerateParams.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    KeyGenerateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelTpmLimit(
                    KeyGenerateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    KeyGenerateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            KeyGenerateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .organizationId("organization_id")
                .permissions(
                    KeyGenerateParams.Permissions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addPrompt("string")
                .rotationInterval("rotation_interval")
                .routerSettings(
                    KeyGenerateParams.RouterSettings.builder()
                        .allowedFails(0L)
                        .addContextWindowFallback(
                            KeyGenerateParams.RouterSettings.ContextWindowFallback.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .cooldownTime(0.0)
                        .addFallback(
                            KeyGenerateParams.RouterSettings.Fallback.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .maxRetries(0L)
                        .modelGroupAlias(
                            KeyGenerateParams.RouterSettings.ModelGroupAlias.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .modelGroupRetryPolicy(
                            KeyGenerateParams.RouterSettings.ModelGroupRetryPolicy.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .numRetries(0L)
                        .retryAfter(0.0)
                        .routingStrategy("routing_strategy")
                        .routingStrategyArgs(
                            KeyGenerateParams.RouterSettings.RoutingStrategyArgs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .timeout(0.0)
                        .build()
                )
                .rpmLimit(0L)
                .rpmLimitType(KeyGenerateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
                .sendInviteEmail(true)
                .softBudget(0.0)
                .spend(0.0)
                .addTag("string")
                .teamId("team_id")
                .tpmLimit(0L)
                .tpmLimitType(KeyGenerateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
                .userId("user_id")
                .build()

        val body = params._body()

        assertThat(body.aliases())
            .contains(
                KeyGenerateParams.Aliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.allowedCacheControls().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.allowedPassthroughRoutes().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.allowedRoutes().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.allowedVectorStoreIndexes().getOrNull())
            .containsExactly(
                KeyGenerateParams.AllowedVectorStoreIndex.builder()
                    .indexName("index_name")
                    .addIndexPermission(
                        KeyGenerateParams.AllowedVectorStoreIndex.IndexPermission.READ
                    )
                    .build()
            )
        assertThat(body.autoRotate()).contains(true)
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetDuration()).contains("budget_duration")
        assertThat(body.budgetId()).contains("budget_id")
        assertThat(body.config())
            .contains(
                KeyGenerateParams.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.duration()).contains("duration")
        assertThat(body.enforcedParams().getOrNull()).containsExactly("string")
        assertThat(body.guardrails().getOrNull()).containsExactly("string")
        assertThat(body.key()).contains("key")
        assertThat(body.keyAlias()).contains("key_alias")
        assertThat(body.keyType()).contains(KeyGenerateParams.KeyType.LLM_API)
        assertThat(body.maxBudget()).contains(0.0)
        assertThat(body.maxParallelRequests()).contains(0L)
        assertThat(body.metadata())
            .contains(
                KeyGenerateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelMaxBudget())
            .contains(
                KeyGenerateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelRpmLimit())
            .contains(
                KeyGenerateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelTpmLimit())
            .contains(
                KeyGenerateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.models().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.objectPermission())
            .contains(
                KeyGenerateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        KeyGenerateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
        assertThat(body.organizationId()).contains("organization_id")
        assertThat(body.permissions())
            .contains(
                KeyGenerateParams.Permissions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.prompts().getOrNull()).containsExactly("string")
        assertThat(body.rotationInterval()).contains("rotation_interval")
        assertThat(body.routerSettings())
            .contains(
                KeyGenerateParams.RouterSettings.builder()
                    .allowedFails(0L)
                    .addContextWindowFallback(
                        KeyGenerateParams.RouterSettings.ContextWindowFallback.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .cooldownTime(0.0)
                    .addFallback(
                        KeyGenerateParams.RouterSettings.Fallback.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .maxRetries(0L)
                    .modelGroupAlias(
                        KeyGenerateParams.RouterSettings.ModelGroupAlias.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .modelGroupRetryPolicy(
                        KeyGenerateParams.RouterSettings.ModelGroupRetryPolicy.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .numRetries(0L)
                    .retryAfter(0.0)
                    .routingStrategy("routing_strategy")
                    .routingStrategyArgs(
                        KeyGenerateParams.RouterSettings.RoutingStrategyArgs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .timeout(0.0)
                    .build()
            )
        assertThat(body.rpmLimit()).contains(0L)
        assertThat(body.rpmLimitType())
            .contains(KeyGenerateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
        assertThat(body.sendInviteEmail()).contains(true)
        assertThat(body.softBudget()).contains(0.0)
        assertThat(body.spend()).contains(0.0)
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.teamId()).contains("team_id")
        assertThat(body.tpmLimit()).contains(0L)
        assertThat(body.tpmLimitType())
            .contains(KeyGenerateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
        assertThat(body.userId()).contains("user_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = KeyGenerateParams.builder().build()

        val body = params._body()
    }
}
