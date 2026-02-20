// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.threads

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.threads().runs()

        val runFuture = runServiceAsync.create("thread_id")

        val run = runFuture.get()
        run.validate()
    }
}
