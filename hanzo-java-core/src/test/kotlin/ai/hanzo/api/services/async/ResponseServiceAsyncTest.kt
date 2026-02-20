// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResponseServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val responseServiceAsync = client.responses()

        val responseFuture = responseServiceAsync.create()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val responseServiceAsync = client.responses()

        val responseFuture = responseServiceAsync.retrieve("response_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val responseServiceAsync = client.responses()

        val responseFuture = responseServiceAsync.delete("response_id")

        val response = responseFuture.get()
        response.validate()
    }
}
