// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationCreateParamsTest {

    @Test
    fun create() {
        OrganizationCreateParams.builder()
            .organizationAlias("organization_alias")
            .budgetDuration("budget_duration")
            .budgetId("budget_id")
            .maxBudget(0.0)
            .maxParallelRequests(0L)
            .metadata(
                OrganizationCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelMaxBudget(
                OrganizationCreateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .modelRpmLimit(
                OrganizationCreateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .modelTpmLimit(
                OrganizationCreateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .objectPermission(
                OrganizationCreateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        OrganizationCreateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
            .organizationId("organization_id")
            .rpmLimit(0L)
            .softBudget(0.0)
            .tpmLimit(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            OrganizationCreateParams.builder()
                .organizationAlias("organization_alias")
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(
                    OrganizationCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelMaxBudget(
                    OrganizationCreateParams.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelRpmLimit(
                    OrganizationCreateParams.ModelRpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .modelTpmLimit(
                    OrganizationCreateParams.ModelTpmLimit.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .objectPermission(
                    OrganizationCreateParams.ObjectPermission.builder()
                        .addAgentAccessGroup("string")
                        .addAgent("string")
                        .addMcpAccessGroup("string")
                        .addMcpServer("string")
                        .mcpToolPermissions(
                            OrganizationCreateParams.ObjectPermission.McpToolPermissions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addVectorStore("string")
                        .build()
                )
                .organizationId("organization_id")
                .rpmLimit(0L)
                .softBudget(0.0)
                .tpmLimit(0L)
                .build()

        val body = params._body()

        assertThat(body.organizationAlias()).isEqualTo("organization_alias")
        assertThat(body.budgetDuration()).contains("budget_duration")
        assertThat(body.budgetId()).contains("budget_id")
        assertThat(body.maxBudget()).contains(0.0)
        assertThat(body.maxParallelRequests()).contains(0L)
        assertThat(body.metadata())
            .contains(
                OrganizationCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelMaxBudget())
            .contains(
                OrganizationCreateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.modelRpmLimit())
            .contains(
                OrganizationCreateParams.ModelRpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.modelTpmLimit())
            .contains(
                OrganizationCreateParams.ModelTpmLimit.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.models().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.objectPermission())
            .contains(
                OrganizationCreateParams.ObjectPermission.builder()
                    .addAgentAccessGroup("string")
                    .addAgent("string")
                    .addMcpAccessGroup("string")
                    .addMcpServer("string")
                    .mcpToolPermissions(
                        OrganizationCreateParams.ObjectPermission.McpToolPermissions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addVectorStore("string")
                    .build()
            )
        assertThat(body.organizationId()).contains("organization_id")
        assertThat(body.rpmLimit()).contains(0L)
        assertThat(body.softBudget()).contains(0.0)
        assertThat(body.tpmLimit()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrganizationCreateParams.builder().organizationAlias("organization_alias").build()

        val body = params._body()

        assertThat(body.organizationAlias()).isEqualTo("organization_alias")
    }
}
