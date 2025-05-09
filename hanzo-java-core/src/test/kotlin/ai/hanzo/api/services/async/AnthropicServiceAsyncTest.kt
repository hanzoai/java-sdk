// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AnthropicServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val anthropicFuture = anthropicServiceAsync.create("endpoint")

        val anthropic = anthropicFuture.get()
        anthropic.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val anthropicFuture = anthropicServiceAsync.retrieve("endpoint")

        val anthropic = anthropicFuture.get()
        anthropic.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val anthropicFuture = anthropicServiceAsync.update("endpoint")

        val anthropic = anthropicFuture.get()
        anthropic.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val anthropicFuture = anthropicServiceAsync.delete("endpoint")

        val anthropic = anthropicFuture.get()
        anthropic.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun modify() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val anthropicServiceAsync = client.anthropic()

        val responseFuture = anthropicServiceAsync.modify("endpoint")

        val response = responseFuture.get()
        response.validate()
    }
}
