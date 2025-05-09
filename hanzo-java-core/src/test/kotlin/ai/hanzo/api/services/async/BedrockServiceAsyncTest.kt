// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BedrockServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockServiceAsync = client.bedrock()

        val bedrockFuture = bedrockServiceAsync.create("endpoint")

        val bedrock = bedrockFuture.get()
        bedrock.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockServiceAsync = client.bedrock()

        val bedrockFuture = bedrockServiceAsync.retrieve("endpoint")

        val bedrock = bedrockFuture.get()
        bedrock.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockServiceAsync = client.bedrock()

        val bedrockFuture = bedrockServiceAsync.update("endpoint")

        val bedrock = bedrockFuture.get()
        bedrock.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockServiceAsync = client.bedrock()

        val bedrockFuture = bedrockServiceAsync.delete("endpoint")

        val bedrock = bedrockFuture.get()
        bedrock.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bedrockServiceAsync = client.bedrock()

        val responseFuture = bedrockServiceAsync.patch("endpoint")

        val response = responseFuture.get()
        response.validate()
    }
}
