// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GeminiServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val geminiServiceAsync = client.gemini()

        val geminiFuture = geminiServiceAsync.create("endpoint")

        val gemini = geminiFuture.get()
        gemini.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val geminiServiceAsync = client.gemini()

        val geminiFuture = geminiServiceAsync.retrieve("endpoint")

        val gemini = geminiFuture.get()
        gemini.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val geminiServiceAsync = client.gemini()

        val geminiFuture = geminiServiceAsync.update("endpoint")

        val gemini = geminiFuture.get()
        gemini.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val geminiServiceAsync = client.gemini()

        val geminiFuture = geminiServiceAsync.delete("endpoint")

        val gemini = geminiFuture.get()
        gemini.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patch() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val geminiServiceAsync = client.gemini()

        val responseFuture = geminiServiceAsync.patch("endpoint")

        val response = responseFuture.get()
        response.validate()
    }
}
