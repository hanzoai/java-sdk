// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.openai.OpenAICreateParams
import ai.hanzo.api.models.openai.OpenAIDeleteParams
import ai.hanzo.api.models.openai.OpenAIPatchParams
import ai.hanzo.api.models.openai.OpenAIRetrieveParams
import ai.hanzo.api.models.openai.OpenAIUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OpenAIServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val openaiServiceAsync = client.openai()

        val openaiFuture =
            openaiServiceAsync.create(OpenAICreateParams.builder().endpoint("endpoint").build())

        val openai = openaiFuture.get()
        openai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val openaiServiceAsync = client.openai()

        val openaiFuture =
            openaiServiceAsync.retrieve(OpenAIRetrieveParams.builder().endpoint("endpoint").build())

        val openai = openaiFuture.get()
        openai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val openaiServiceAsync = client.openai()

        val openaiFuture =
            openaiServiceAsync.update(OpenAIUpdateParams.builder().endpoint("endpoint").build())

        val openai = openaiFuture.get()
        openai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val openaiServiceAsync = client.openai()

        val openaiFuture =
            openaiServiceAsync.delete(OpenAIDeleteParams.builder().endpoint("endpoint").build())

        val openai = openaiFuture.get()
        openai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val openaiServiceAsync = client.openai()

        val responseFuture =
            openaiServiceAsync.patch(OpenAIPatchParams.builder().endpoint("endpoint").build())

        val response = responseFuture.get()
        response.validate()
    }
}
