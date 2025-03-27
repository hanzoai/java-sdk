// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.health.HealthCheckAllParams
import ai.hanzo.api.models.health.HealthCheckServicesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HealthServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun checkAll() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthServiceAsync = client.health()

        val responseFuture =
            healthServiceAsync.checkAll(HealthCheckAllParams.builder().model("model").build())

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun checkLiveliness() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthServiceAsync = client.health()

        val responseFuture = healthServiceAsync.checkLiveliness()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun checkLiveness() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthServiceAsync = client.health()

        val responseFuture = healthServiceAsync.checkLiveness()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun checkReadiness() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthServiceAsync = client.health()

        val responseFuture = healthServiceAsync.checkReadiness()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun checkServices() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthServiceAsync = client.health()

        val responseFuture =
            healthServiceAsync.checkServices(
                HealthCheckServicesParams.builder()
                    .service(HealthCheckServicesParams.Service.SLACK_BUDGET_ALERTS)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
