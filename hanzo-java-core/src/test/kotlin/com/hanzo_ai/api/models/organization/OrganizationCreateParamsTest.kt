// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.organization

import com.hanzo_ai.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrganizationCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        OrganizationCreateParams.builder()
            .organizationAlias("organization_alias")
            .budgetDuration("budget_duration")
            .budgetId("budget_id")
            .maxBudget(0.0)
            .maxParallelRequests(0L)
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .organizationId("organization_id")
            .rpmLimit(0L)
            .softBudget(0.0)
            .tpmLimit(0L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            OrganizationCreateParams.builder()
                .organizationAlias("organization_alias")
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
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
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._modelMaxBudget()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.models().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.organizationId()).contains("organization_id")
        assertThat(body.rpmLimit()).contains(0L)
        assertThat(body.softBudget()).contains(0.0)
        assertThat(body.tpmLimit()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrganizationCreateParams.builder().organizationAlias("organization_alias").build()

        val body = params._body()

        assertThat(body.organizationAlias()).isEqualTo("organization_alias")
    }
}
