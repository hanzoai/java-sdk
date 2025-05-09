// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GeminiServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val geminiFuture = geminiServiceAsync.create("endpoint")

        val gemini = geminiFuture.get()
        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val geminiFuture = geminiServiceAsync.retrieve("endpoint")

        val gemini = geminiFuture.get()
        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val geminiFuture = geminiServiceAsync.update("endpoint")

        val gemini = geminiFuture.get()
        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val geminiFuture = geminiServiceAsync.delete("endpoint")

        val gemini = geminiFuture.get()
        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val responseFuture = geminiServiceAsync.patch("endpoint")

        val response = responseFuture.get()
        response.validate()
    }
}
