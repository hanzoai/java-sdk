// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.anthropic.AnthropicCreateParams
import ai.hanzo.api.models.anthropic.AnthropicDeleteParams
import ai.hanzo.api.models.anthropic.AnthropicModifyParams
import ai.hanzo.api.models.anthropic.AnthropicRetrieveParams
import ai.hanzo.api.models.anthropic.AnthropicUpdateParams
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

        val anthropicFuture =
            anthropicServiceAsync.create(
                AnthropicCreateParams.builder().endpoint("endpoint").build()
            )

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

        val anthropicFuture =
            anthropicServiceAsync.retrieve(
                AnthropicRetrieveParams.builder().endpoint("endpoint").build()
            )

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

        val anthropicFuture =
            anthropicServiceAsync.update(
                AnthropicUpdateParams.builder().endpoint("endpoint").build()
            )

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

        val anthropicFuture =
            anthropicServiceAsync.delete(
                AnthropicDeleteParams.builder().endpoint("endpoint").build()
            )

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

        val responseFuture =
            anthropicServiceAsync.modify(
                AnthropicModifyParams.builder().endpoint("endpoint").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
