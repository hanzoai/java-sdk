// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.cohere.CohereCreateParams
import ai.hanzo.api.models.cohere.CohereDeleteParams
import ai.hanzo.api.models.cohere.CohereModifyParams
import ai.hanzo.api.models.cohere.CohereRetrieveParams
import ai.hanzo.api.models.cohere.CohereUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CohereServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereServiceAsync = client.cohere()

        val cohereFuture =
            cohereServiceAsync.create(CohereCreateParams.builder().endpoint("endpoint").build())

        val cohere = cohereFuture.get()
        cohere.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereServiceAsync = client.cohere()

        val cohereFuture =
            cohereServiceAsync.retrieve(CohereRetrieveParams.builder().endpoint("endpoint").build())

        val cohere = cohereFuture.get()
        cohere.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereServiceAsync = client.cohere()

        val cohereFuture =
            cohereServiceAsync.update(CohereUpdateParams.builder().endpoint("endpoint").build())

        val cohere = cohereFuture.get()
        cohere.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereServiceAsync = client.cohere()

        val cohereFuture =
            cohereServiceAsync.delete(CohereDeleteParams.builder().endpoint("endpoint").build())

        val cohere = cohereFuture.get()
        cohere.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun modify() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cohereServiceAsync = client.cohere()

        val responseFuture =
            cohereServiceAsync.modify(CohereModifyParams.builder().endpoint("endpoint").build())

        val response = responseFuture.get()
        response.validate()
    }
}
