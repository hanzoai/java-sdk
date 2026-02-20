// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TestServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun ping() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val testServiceAsync = client.test()

        val responseFuture = testServiceAsync.ping()

        val response = responseFuture.get()
        response.validate()
    }
}
