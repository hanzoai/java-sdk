// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CacheServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cacheServiceAsync = client.cache()

        val cacheFuture = cacheServiceAsync.delete()

        val cache = cacheFuture.get()
        cache.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun flushAll() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cacheServiceAsync = client.cache()

        val responseFuture = cacheServiceAsync.flushAll()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun ping() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cacheServiceAsync = client.cache()

        val responseFuture = cacheServiceAsync.ping()

        val response = responseFuture.get()
        response.validate()
    }
}
