// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.global

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.global.spend.SpendListTagsParams
import ai.hanzo.api.models.global.spend.SpendRetrieveReportParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpendServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listTags() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spendServiceAsync = client.global().spend()

        val responseFuture =
            spendServiceAsync.listTags(
                SpendListTagsParams.builder()
                    .endDate("end_date")
                    .startDate("start_date")
                    .tags("tags")
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun reset() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spendServiceAsync = client.global().spend()

        val responseFuture = spendServiceAsync.reset()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveReport() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spendServiceAsync = client.global().spend()

        val responseFuture =
            spendServiceAsync.retrieveReport(
                SpendRetrieveReportParams.builder()
                    .apiKey("api_key")
                    .customerId("customer_id")
                    .endDate("end_date")
                    .groupBy(SpendRetrieveReportParams.GroupBy.TEAM)
                    .internalUserId("internal_user_id")
                    .startDate("start_date")
                    .teamId("team_id")
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
