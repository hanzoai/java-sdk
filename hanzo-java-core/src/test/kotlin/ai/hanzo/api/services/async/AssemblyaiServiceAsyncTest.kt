// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssemblyaiServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyaiFuture = assemblyaiServiceAsync.create("endpoint")

        val assemblyai = assemblyaiFuture.get()
        assemblyai.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyaiFuture = assemblyaiServiceAsync.retrieve("endpoint")

        val assemblyai = assemblyaiFuture.get()
        assemblyai.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyaiFuture = assemblyaiServiceAsync.update("endpoint")

        val assemblyai = assemblyaiFuture.get()
        assemblyai.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyaiFuture = assemblyaiServiceAsync.delete("endpoint")

        val assemblyai = assemblyaiFuture.get()
        assemblyai.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val responseFuture = assemblyaiServiceAsync.patch("endpoint")

        val response = responseFuture.get()
        response.validate()
    }
}
