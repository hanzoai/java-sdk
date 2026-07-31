// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BedrockServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val bedrockServiceAsync = client.bedrock()

        val bedrockFuture = bedrockServiceAsync.create("endpoint")

        val bedrock = bedrockFuture.get()
        bedrock.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val bedrockServiceAsync = client.bedrock()

        val bedrockFuture = bedrockServiceAsync.retrieve("endpoint")

        val bedrock = bedrockFuture.get()
        bedrock.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val bedrockServiceAsync = client.bedrock()

        val bedrockFuture = bedrockServiceAsync.update("endpoint")

        val bedrock = bedrockFuture.get()
        bedrock.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val bedrockServiceAsync = client.bedrock()

        val bedrockFuture = bedrockServiceAsync.delete("endpoint")

        val bedrock = bedrockFuture.get()
        bedrock.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patch() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val bedrockServiceAsync = client.bedrock()

        val responseFuture = bedrockServiceAsync.patch("endpoint")

        val response = responseFuture.get()
        response.validate()
    }
}
