// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.customer

import ai.hanzo.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomerCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        CustomerCreateParams.builder()
            .userId("user_id")
            .alias("alias")
            .allowedModelRegion(CustomerCreateParams.AllowedModelRegion.EU)
            .blocked(true)
            .budgetDuration("budget_duration")
            .budgetId("budget_id")
            .defaultModel("default_model")
            .maxBudget(0.0)
            .maxParallelRequests(0L)
            .modelMaxBudget(
                CustomerCreateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "budget_duration" to "budget_duration",
                                "max_budget" to 0,
                                "rpm_limit" to 0,
                                "tpm_limit" to 0,
                            )
                        ),
                    )
                    .build()
            )
            .rpmLimit(0L)
            .softBudget(0.0)
            .tpmLimit(0L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            CustomerCreateParams.builder()
                .userId("user_id")
                .alias("alias")
                .allowedModelRegion(CustomerCreateParams.AllowedModelRegion.EU)
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetId("budget_id")
                .defaultModel("default_model")
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .modelMaxBudget(
                    CustomerCreateParams.ModelMaxBudget.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "budget_duration" to "budget_duration",
                                    "max_budget" to 0,
                                    "rpm_limit" to 0,
                                    "tpm_limit" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .rpmLimit(0L)
                .softBudget(0.0)
                .tpmLimit(0L)
                .build()

        val body = params._body()

        assertThat(body.userId()).isEqualTo("user_id")
        assertThat(body.alias()).contains("alias")
        assertThat(body.allowedModelRegion()).contains(CustomerCreateParams.AllowedModelRegion.EU)
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetDuration()).contains("budget_duration")
        assertThat(body.budgetId()).contains("budget_id")
        assertThat(body.defaultModel()).contains("default_model")
        assertThat(body.maxBudget()).contains(0.0)
        assertThat(body.maxParallelRequests()).contains(0L)
        assertThat(body.modelMaxBudget())
            .contains(
                CustomerCreateParams.ModelMaxBudget.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "budget_duration" to "budget_duration",
                                "max_budget" to 0,
                                "rpm_limit" to 0,
                                "tpm_limit" to 0,
                            )
                        ),
                    )
                    .build()
            )
        assertThat(body.rpmLimit()).contains(0L)
        assertThat(body.softBudget()).contains(0.0)
        assertThat(body.tpmLimit()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerCreateParams.builder().userId("user_id").build()

        val body = params._body()

        assertThat(body.userId()).isEqualTo("user_id")
    }
}
