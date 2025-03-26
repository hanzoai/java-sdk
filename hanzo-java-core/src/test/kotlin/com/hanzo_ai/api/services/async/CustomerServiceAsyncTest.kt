// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.models.customer.BlockUsers
import com.hanzo_ai.api.models.customer.CustomerBlockParams
import com.hanzo_ai.api.models.customer.CustomerCreateParams
import com.hanzo_ai.api.models.customer.CustomerDeleteParams
import com.hanzo_ai.api.models.customer.CustomerRetrieveInfoParams
import com.hanzo_ai.api.models.customer.CustomerUnblockParams
import com.hanzo_ai.api.models.customer.CustomerUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomerServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val customerFuture =
            customerServiceAsync.create(
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
            )

        val customer = customerFuture.get()
        customer.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val customerFuture =
            customerServiceAsync.update(
                CustomerUpdateParams.builder()
                    .userId("user_id")
                    .alias("alias")
                    .allowedModelRegion(CustomerUpdateParams.AllowedModelRegion.EU)
                    .blocked(true)
                    .budgetId("budget_id")
                    .defaultModel("default_model")
                    .maxBudget(0.0)
                    .build()
            )

        val customer = customerFuture.get()
        customer.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val customersFuture = customerServiceAsync.list()

        val customers = customersFuture.get()
        customers.forEach { it.validate() }
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val customerFuture =
            customerServiceAsync.delete(CustomerDeleteParams.builder().addUserId("string").build())

        val customer = customerFuture.get()
        customer.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun block() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val responseFuture =
            customerServiceAsync.block(
                CustomerBlockParams.builder()
                    .blockUsers(BlockUsers.builder().addUserId("string").build())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveInfo() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val responseFuture =
            customerServiceAsync.retrieveInfo(
                CustomerRetrieveInfoParams.builder().endUserId("end_user_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun unblock() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customerServiceAsync = client.customer()

        val responseFuture =
            customerServiceAsync.unblock(
                CustomerUnblockParams.builder()
                    .blockUsers(BlockUsers.builder().addUserId("string").build())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
