// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerRetrieveInfoResponseTest {

    @Test
    fun create() {
        val customerRetrieveInfoResponse =
            CustomerRetrieveInfoResponse.builder()
                .blocked(true)
                .userId("user_id")
                .alias("alias")
                .allowedModelRegion(CustomerRetrieveInfoResponse.AllowedModelRegion.EU)
                .defaultModel("default_model")
                .llmBudgetTable(
                    CustomerRetrieveInfoResponse.LlmBudgetTable.builder()
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

        assertThat(customerRetrieveInfoResponse.blocked()).isEqualTo(true)
        assertThat(customerRetrieveInfoResponse.userId()).isEqualTo("user_id")
        assertThat(customerRetrieveInfoResponse.alias()).contains("alias")
        assertThat(customerRetrieveInfoResponse.allowedModelRegion())
            .contains(CustomerRetrieveInfoResponse.AllowedModelRegion.EU)
        assertThat(customerRetrieveInfoResponse.defaultModel()).contains("default_model")
        assertThat(customerRetrieveInfoResponse.llmBudgetTable())
            .contains(
                CustomerRetrieveInfoResponse.LlmBudgetTable.builder()
                    .budgetDuration("budget_duration")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .rpmLimit(0L)
                    .softBudget(0.0)
                    .tpmLimit(0L)
                    .build()
            )
        assertThat(customerRetrieveInfoResponse.spend()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerRetrieveInfoResponse =
            CustomerRetrieveInfoResponse.builder()
                .blocked(true)
                .userId("user_id")
                .alias("alias")
                .allowedModelRegion(CustomerRetrieveInfoResponse.AllowedModelRegion.EU)
                .defaultModel("default_model")
                .llmBudgetTable(
                    CustomerRetrieveInfoResponse.LlmBudgetTable.builder()
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

        val roundtrippedCustomerRetrieveInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerRetrieveInfoResponse),
                jacksonTypeRef<CustomerRetrieveInfoResponse>(),
            )

        assertThat(roundtrippedCustomerRetrieveInfoResponse).isEqualTo(customerRetrieveInfoResponse)
    }
}
