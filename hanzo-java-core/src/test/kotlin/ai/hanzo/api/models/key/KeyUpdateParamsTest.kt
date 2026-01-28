// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyUpdateParamsTest {

    @Test
    fun create() {
        KeyUpdateParams.builder()
            .litellmChangedBy("litellm-changed-by")
            .key("key")
            .aliases(
                KeyUpdateParams.Aliases.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
            .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
            .addAllowedRoute(JsonValue.from(mapOf<String, Any>()))
            .addAllowedVectorStoreIndex(
                KeyUpdateParams.AllowedVectorStoreIndex.builder()
                    .indexName("index_name")
                    .addIndexPermission(
                        KeyUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                    )
                    .build()
            )
            .autoRotate(true)
            .blocked(true)
            .budgetDuration("budget_duration")
            .budgetId("budget_id")
            .config(
                KeyUpdateParams.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .duration("duration")
            .addEnforcedParam("string")
            .addGuardrail("string")
            .keyAlias("key_alias")
            .maxBudget(0.0)
            .maxParallelRequests(0L)
            .metadata(
                KeyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelMaxBudget(
                KeyUpdateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelRpmLimit(
                KeyUpdateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelTpmLimit(
                KeyUpdateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .objectPermission(
                KeyUpdateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        KeyUpdateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
            .permissions(
                KeyUpdateParams.Permissions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addPrompt("string")
            .rotationInterval("rotation_interval")
            .routerSettings(
                KeyUpdateParams.RouterSettings.builder()
                    .allowedFails(0L)
                    .addContextWindowFallback(
                        KeyUpdateParams.RouterSettings.ContextWindowFallback.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .cooldownTime(0.0)
                    .addFallback(
                        KeyUpdateParams.RouterSettings.Fallback.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .maxRetries(0L)
                    .modelGroupAlias(
                        KeyUpdateParams.RouterSettings.ModelGroupAlias.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .modelGroupRetryPolicy(
                        KeyUpdateParams.RouterSettings.ModelGroupRetryPolicy.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .numRetries(0L)
                    .retryAfter(0.0)
                    .routingStrategy("routing_strategy")
                    .routingStrategyArgs(
                        KeyUpdateParams.RouterSettings.RoutingStrategyArgs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .timeout(0.0)
                    .build()
            )
            .rpmLimit(0L)
            .rpmLimitType(KeyUpdateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
            .spend(0.0)
            .addTag("string")
            .teamId("team_id")
            .tempBudgetExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .tempBudgetIncrease(0.0)
            .tpmLimit(0L)
            .tpmLimitType(KeyUpdateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
            .userId("user_id")
            .build()
    }

    @Test
    fun headers() {
        val params =
            KeyUpdateParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .key("key")
                .aliases(
                    KeyUpdateParams.Aliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedVectorStoreIndex(
                    KeyUpdateParams.AllowedVectorStoreIndex.builder()
                        .indexName("index_name")
                        .addIndexPermission(
                            KeyUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                        )
                        .build()
                )
                .autoRotate(true)
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .config(
                    KeyUpdateParams.Config.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .duration("duration")
                .addEnforcedParam("string")
                .addGuardrail("string")
                .keyAlias("key_alias")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(
                    KeyUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelMaxBudget(
                    KeyUpdateParams.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    KeyUpdateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelTpmLimit(
                    KeyUpdateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    KeyUpdateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            KeyUpdateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .permissions(
                    KeyUpdateParams.Permissions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addPrompt("string")
                .rotationInterval("rotation_interval")
                .routerSettings(
                    KeyUpdateParams.RouterSettings.builder()
                        .allowedFails(0L)
                        .addContextWindowFallback(
                            KeyUpdateParams.RouterSettings.ContextWindowFallback.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .cooldownTime(0.0)
                        .addFallback(
                            KeyUpdateParams.RouterSettings.Fallback.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .maxRetries(0L)
                        .modelGroupAlias(
                            KeyUpdateParams.RouterSettings.ModelGroupAlias.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .modelGroupRetryPolicy(
                            KeyUpdateParams.RouterSettings.ModelGroupRetryPolicy.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .numRetries(0L)
                        .retryAfter(0.0)
                        .routingStrategy("routing_strategy")
                        .routingStrategyArgs(
                            KeyUpdateParams.RouterSettings.RoutingStrategyArgs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .timeout(0.0)
                        .build()
                )
                .rpmLimit(0L)
                .rpmLimitType(KeyUpdateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
                .spend(0.0)
                .addTag("string")
                .teamId("team_id")
                .tempBudgetExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tempBudgetIncrease(0.0)
                .tpmLimit(0L)
                .tpmLimitType(KeyUpdateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
                .userId("user_id")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("litellm-changed-by", "litellm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = KeyUpdateParams.builder().key("key").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            KeyUpdateParams.builder()
                .litellmChangedBy("litellm-changed-by")
                .key("key")
                .aliases(
                    KeyUpdateParams.Aliases.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                .addAllowedPassthroughRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedRoute(JsonValue.from(mapOf<String, Any>()))
                .addAllowedVectorStoreIndex(
                    KeyUpdateParams.AllowedVectorStoreIndex.builder()
                        .indexName("index_name")
                        .addIndexPermission(
                            KeyUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                        )
                        .build()
                )
                .autoRotate(true)
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .config(
                    KeyUpdateParams.Config.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .duration("duration")
                .addEnforcedParam("string")
                .addGuardrail("string")
                .keyAlias("key_alias")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(
                    KeyUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelMaxBudget(
                    KeyUpdateParams.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    KeyUpdateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelTpmLimit(
                    KeyUpdateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    KeyUpdateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            KeyUpdateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .permissions(
                    KeyUpdateParams.Permissions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addPrompt("string")
                .rotationInterval("rotation_interval")
                .routerSettings(
                    KeyUpdateParams.RouterSettings.builder()
                        .allowedFails(0L)
                        .addContextWindowFallback(
                            KeyUpdateParams.RouterSettings.ContextWindowFallback.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .cooldownTime(0.0)
                        .addFallback(
                            KeyUpdateParams.RouterSettings.Fallback.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .maxRetries(0L)
                        .modelGroupAlias(
                            KeyUpdateParams.RouterSettings.ModelGroupAlias.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .modelGroupRetryPolicy(
                            KeyUpdateParams.RouterSettings.ModelGroupRetryPolicy.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .numRetries(0L)
                        .retryAfter(0.0)
                        .routingStrategy("routing_strategy")
                        .routingStrategyArgs(
                            KeyUpdateParams.RouterSettings.RoutingStrategyArgs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .timeout(0.0)
                        .build()
                )
                .rpmLimit(0L)
                .rpmLimitType(KeyUpdateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
                .spend(0.0)
                .addTag("string")
                .teamId("team_id")
                .tempBudgetExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tempBudgetIncrease(0.0)
                .tpmLimit(0L)
                .tpmLimitType(KeyUpdateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
                .userId("user_id")
                .build()

        val body = params._body()

        assertThat(body.key()).isEqualTo("key")
        assertThat(body.aliases())
            .contains(
                KeyUpdateParams.Aliases.builder()
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
                KeyUpdateParams.AllowedVectorStoreIndex.builder()
                    .indexName("index_name")
                    .addIndexPermission(
                        KeyUpdateParams.AllowedVectorStoreIndex.IndexPermission.READ
                    )
                    .build()
            )
        assertThat(body.autoRotate()).contains(true)
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetDuration()).contains("budget_duration")
        assertThat(body.budgetId()).contains("budget_id")
        assertThat(body.config())
            .contains(
                KeyUpdateParams.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.duration()).contains("duration")
        assertThat(body.enforcedParams().getOrNull()).containsExactly("string")
        assertThat(body.guardrails().getOrNull()).containsExactly("string")
        assertThat(body.keyAlias()).contains("key_alias")
        assertThat(body.maxBudget()).contains(0.0)
        assertThat(body.maxParallelRequests()).contains(0L)
        assertThat(body.metadata())
            .contains(
                KeyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelMaxBudget())
            .contains(
                KeyUpdateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelRpmLimit())
            .contains(
                KeyUpdateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelTpmLimit())
            .contains(
                KeyUpdateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.models().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.objectPermission())
            .contains(
                KeyUpdateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        KeyUpdateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
        assertThat(body.permissions())
            .contains(
                KeyUpdateParams.Permissions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.prompts().getOrNull()).containsExactly("string")
        assertThat(body.rotationInterval()).contains("rotation_interval")
        assertThat(body.routerSettings())
            .contains(
                KeyUpdateParams.RouterSettings.builder()
                    .allowedFails(0L)
                    .addContextWindowFallback(
                        KeyUpdateParams.RouterSettings.ContextWindowFallback.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .cooldownTime(0.0)
                    .addFallback(
                        KeyUpdateParams.RouterSettings.Fallback.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .maxRetries(0L)
                    .modelGroupAlias(
                        KeyUpdateParams.RouterSettings.ModelGroupAlias.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .modelGroupRetryPolicy(
                        KeyUpdateParams.RouterSettings.ModelGroupRetryPolicy.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .numRetries(0L)
                    .retryAfter(0.0)
                    .routingStrategy("routing_strategy")
                    .routingStrategyArgs(
                        KeyUpdateParams.RouterSettings.RoutingStrategyArgs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .timeout(0.0)
                    .build()
            )
        assertThat(body.rpmLimit()).contains(0L)
        assertThat(body.rpmLimitType()).contains(KeyUpdateParams.RpmLimitType.GUARANTEED_THROUGHPUT)
        assertThat(body.spend()).contains(0.0)
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.teamId()).contains("team_id")
        assertThat(body.tempBudgetExpiry())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.tempBudgetIncrease()).contains(0.0)
        assertThat(body.tpmLimit()).contains(0L)
        assertThat(body.tpmLimitType()).contains(KeyUpdateParams.TpmLimitType.GUARANTEED_THROUGHPUT)
        assertThat(body.userId()).contains("user_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = KeyUpdateParams.builder().key("key").build()

        val body = params._body()

        assertThat(body.key()).isEqualTo("key")
    }
}
