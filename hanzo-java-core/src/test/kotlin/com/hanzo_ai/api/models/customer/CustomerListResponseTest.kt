// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.customer

import com.hanzo_ai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val customerListResponse =
            CustomerListResponse.builder()
                .blocked(true)
                .userId("user_id")
                .alias("alias")
                .allowedModelRegion(CustomerListResponse.AllowedModelRegion.EU)
                .defaultModel("default_model")
                .llmBudgetTable(
                    CustomerListResponse.LlmBudgetTable.builder()
                        .budgetDuration("budget_duration")
                        .maxBudget(0.0)
                        .maxParallelRequests(0L)
                        .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                        .rpmLimit(0L)
                        .softBudget(0.0)
                        .tpmLimit(0L)
                        .build()
                )
                .spend(0.0)
                .build()

        assertThat(customerListResponse.blocked()).isEqualTo(true)
        assertThat(customerListResponse.userId()).isEqualTo("user_id")
        assertThat(customerListResponse.alias()).contains("alias")
        assertThat(customerListResponse.allowedModelRegion())
            .contains(CustomerListResponse.AllowedModelRegion.EU)
        assertThat(customerListResponse.defaultModel()).contains("default_model")
        assertThat(customerListResponse.llmBudgetTable())
            .contains(
                CustomerListResponse.LlmBudgetTable.builder()
                    .budgetDuration("budget_duration")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .rpmLimit(0L)
                    .softBudget(0.0)
                    .tpmLimit(0L)
                    .build()
            )
        assertThat(customerListResponse.spend()).contains(0.0)
    }
}
