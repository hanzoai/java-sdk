// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CustomerUpdateParams.builder()
            .userId("user_id")
            .alias("alias")
            .allowedModelRegion(CustomerUpdateParams.AllowedModelRegion.EU)
            .blocked(true)
            .budgetId("budget_id")
            .defaultModel("default_model")
            .maxBudget(0.0)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            CustomerUpdateParams.builder()
                .userId("user_id")
                .alias("alias")
                .allowedModelRegion(CustomerUpdateParams.AllowedModelRegion.EU)
                .blocked(true)
                .budgetId("budget_id")
                .defaultModel("default_model")
                .maxBudget(0.0)
                .build()

        val body = params._body()

        assertThat(body.userId()).isEqualTo("user_id")
        assertThat(body.alias()).contains("alias")
        assertThat(body.allowedModelRegion()).contains(CustomerUpdateParams.AllowedModelRegion.EU)
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetId()).contains("budget_id")
        assertThat(body.defaultModel()).contains("default_model")
        assertThat(body.maxBudget()).contains(0.0)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerUpdateParams.builder().userId("user_id").build()

        val body = params._body()

        assertThat(body.userId()).isEqualTo("user_id")
    }
}
