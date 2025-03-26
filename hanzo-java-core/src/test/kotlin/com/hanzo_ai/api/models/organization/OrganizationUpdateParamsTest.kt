// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.organization

import com.hanzo_ai.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrganizationUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        OrganizationUpdateParams.builder()
            .budgetId("budget_id")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .addModel("string")
            .organizationAlias("organization_alias")
            .organizationId("organization_id")
            .spend(0.0)
            .updatedBy("updated_by")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            OrganizationUpdateParams.builder()
                .budgetId("budget_id")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .addModel("string")
                .organizationAlias("organization_alias")
                .organizationId("organization_id")
                .spend(0.0)
                .updatedBy("updated_by")
                .build()

        val body = params._body()

        assertThat(body.budgetId()).contains("budget_id")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.models().getOrNull()).containsExactly("string")
        assertThat(body.organizationAlias()).contains("organization_alias")
        assertThat(body.organizationId()).contains("organization_id")
        assertThat(body.spend()).contains(0.0)
        assertThat(body.updatedBy()).contains("updated_by")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = OrganizationUpdateParams.builder().build()

        val body = params._body()
    }
}
