// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RerankServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val rerankServiceAsync = client.rerank()

        val rerankFuture = rerankServiceAsync.create()

        val rerank = rerankFuture.get()
        rerank.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createV1() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val rerankServiceAsync = client.rerank()

        val responseFuture = rerankServiceAsync.createV1()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createV2() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val rerankServiceAsync = client.rerank()

        val responseFuture = rerankServiceAsync.createV2()

        val response = responseFuture.get()
        response.validate()
    }
}
