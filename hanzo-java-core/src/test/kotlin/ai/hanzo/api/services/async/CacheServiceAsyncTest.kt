// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CacheServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cacheServiceAsync = client.cache()

        val cacheFuture = cacheServiceAsync.delete()

        val cache = cacheFuture.get()
        cache.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun flushAll() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cacheServiceAsync = client.cache()

        val responseFuture = cacheServiceAsync.flushAll()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun ping() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cacheServiceAsync = client.cache()

        val responseFuture = cacheServiceAsync.ping()

        val response = responseFuture.get()
        response.validate()
    }
}
