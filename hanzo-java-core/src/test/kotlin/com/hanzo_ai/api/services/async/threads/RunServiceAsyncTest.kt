// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.threads

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.threads.runs.RunCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runServiceAsync = client.threads().runs()

        val runFuture =
            runServiceAsync.create(RunCreateParams.builder().threadId("thread_id").build())

        val run = runFuture.get()
        run.validate()
    }
}
