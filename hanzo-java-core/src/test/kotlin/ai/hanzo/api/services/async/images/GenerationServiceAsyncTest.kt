// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.images

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GenerationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val generationServiceAsync = client.images().generations()

        val generationFuture = generationServiceAsync.create()

        val generation = generationFuture.get()
        generation.validate()
    }
}
