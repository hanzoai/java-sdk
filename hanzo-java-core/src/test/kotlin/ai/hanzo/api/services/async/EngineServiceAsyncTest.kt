// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EngineServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun complete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val engineServiceAsync = client.engines()

        val responseFuture = engineServiceAsync.complete("model")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun embed() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val engineServiceAsync = client.engines()

        val responseFuture = engineServiceAsync.embed("model")

        val response = responseFuture.get()
        response.validate()
    }
}
