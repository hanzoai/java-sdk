// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.models.budget.BudgetCreateParams
import com.hanzo_ai.api.models.budget.BudgetDeleteParams
import com.hanzo_ai.api.models.budget.BudgetInfoParams
import com.hanzo_ai.api.models.budget.BudgetNew
import com.hanzo_ai.api.models.budget.BudgetSettingsParams
import com.hanzo_ai.api.models.budget.BudgetUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BudgetServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val budgetFuture =
            budgetServiceAsync.create(
                BudgetCreateParams.builder()
                    .budgetNew(
                        BudgetNew.builder()
                            .budgetDuration("budget_duration")
                            .budgetId("budget_id")
                            .maxBudget(0.0)
                            .maxParallelRequests(0L)
                            .modelMaxBudget(
                                BudgetNew.ModelMaxBudget.builder()
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
                    )
                    .build()
            )

        val budget = budgetFuture.get()
        budget.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val budgetFuture =
            budgetServiceAsync.update(
                BudgetUpdateParams.builder()
                    .budgetNew(
                        BudgetNew.builder()
                            .budgetDuration("budget_duration")
                            .budgetId("budget_id")
                            .maxBudget(0.0)
                            .maxParallelRequests(0L)
                            .modelMaxBudget(
                                BudgetNew.ModelMaxBudget.builder()
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
                    )
                    .build()
            )

        val budget = budgetFuture.get()
        budget.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val budgetFuture = budgetServiceAsync.list()

        val budget = budgetFuture.get()
        budget.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val budgetFuture = budgetServiceAsync.delete(BudgetDeleteParams.builder().id("id").build())

        val budget = budgetFuture.get()
        budget.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun info() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val responseFuture =
            budgetServiceAsync.info(BudgetInfoParams.builder().addBudget("string").build())

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun settings() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val budgetServiceAsync = client.budget()

        val responseFuture =
            budgetServiceAsync.settings(
                BudgetSettingsParams.builder().budgetId("budget_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
