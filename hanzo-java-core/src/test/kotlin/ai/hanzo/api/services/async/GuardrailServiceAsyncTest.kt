// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GuardrailServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val guardrailServiceAsync = client.guardrails()

        val guardrailsFuture = guardrailServiceAsync.list()

        val guardrails = guardrailsFuture.get()
        guardrails.validate()
    }
}
