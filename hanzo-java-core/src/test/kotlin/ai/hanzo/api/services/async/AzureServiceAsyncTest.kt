// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AzureServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureServiceAsync = client.azure()

        val azureFuture = azureServiceAsync.create("endpoint")

        val azure = azureFuture.get()
        azure.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureServiceAsync = client.azure()

        val azureFuture = azureServiceAsync.update("endpoint")

        val azure = azureFuture.get()
        azure.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureServiceAsync = client.azure()

        val azureFuture = azureServiceAsync.delete("endpoint")

        val azure = azureFuture.get()
        azure.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun call() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureServiceAsync = client.azure()

        val responseFuture = azureServiceAsync.call("endpoint")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val azureServiceAsync = client.azure()

        val responseFuture = azureServiceAsync.patch("endpoint")

        val response = responseFuture.get()
        response.validate()
    }
}
