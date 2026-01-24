// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetTableTest {

    @Test
    fun create() {
        val budgetTable =
            BudgetTable.builder()
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .modelMaxBudget(
                    BudgetTable.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rpmLimit(0L)
                .softBudget(0.0)
                .tpmLimit(0L)
                .build()

        assertThat(budgetTable.budgetDuration()).contains("budget_duration")
        assertThat(budgetTable.budgetId()).contains("budget_id")
        assertThat(budgetTable.maxBudget()).contains(0.0)
        assertThat(budgetTable.maxParallelRequests()).contains(0L)
        assertThat(budgetTable.modelMaxBudget())
            .contains(
                BudgetTable.ModelMaxBudget.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(budgetTable.rpmLimit()).contains(0L)
        assertThat(budgetTable.softBudget()).contains(0.0)
        assertThat(budgetTable.tpmLimit()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val budgetTable =
            BudgetTable.builder()
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .modelMaxBudget(
                    BudgetTable.ModelMaxBudget.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .rpmLimit(0L)
                .softBudget(0.0)
                .tpmLimit(0L)
                .build()

        val roundtrippedBudgetTable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(budgetTable),
                jacksonTypeRef<BudgetTable>(),
            )

        assertThat(roundtrippedBudgetTable).isEqualTo(budgetTable)
    }
}
