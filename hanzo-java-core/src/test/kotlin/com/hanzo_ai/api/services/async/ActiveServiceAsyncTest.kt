// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActiveServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listCallbacks() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val activeServiceAsync = client.active()

        val responseFuture = activeServiceAsync.listCallbacks()

        val response = responseFuture.get()
        response.validate()
    }
}
