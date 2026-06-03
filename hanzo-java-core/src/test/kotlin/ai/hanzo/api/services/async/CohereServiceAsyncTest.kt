// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CohereServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cohereServiceAsync = client.cohere()

        val cohereFuture = cohereServiceAsync.create("endpoint")

        val cohere = cohereFuture.get()
        cohere.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cohereServiceAsync = client.cohere()

        val cohereFuture = cohereServiceAsync.retrieve("endpoint")

        val cohere = cohereFuture.get()
        cohere.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cohereServiceAsync = client.cohere()

        val cohereFuture = cohereServiceAsync.update("endpoint")

        val cohere = cohereFuture.get()
        cohere.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cohereServiceAsync = client.cohere()

        val cohereFuture = cohereServiceAsync.delete("endpoint")

        val cohere = cohereFuture.get()
        cohere.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun modify() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cohereServiceAsync = client.cohere()

        val responseFuture = cohereServiceAsync.modify("endpoint")

        val response = responseFuture.get()
        response.validate()
    }
}
