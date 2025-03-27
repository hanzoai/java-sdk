// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.bedrock.BedrockCreateParams
import ai.hanzo.api.models.bedrock.BedrockDeleteParams
import ai.hanzo.api.models.bedrock.BedrockPatchParams
import ai.hanzo.api.models.bedrock.BedrockRetrieveParams
import ai.hanzo.api.models.bedrock.BedrockUpdateParams
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

        val bedrockFuture =
            bedrockServiceAsync.create(BedrockCreateParams.builder().endpoint("endpoint").build())

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

        val bedrockFuture =
            bedrockServiceAsync.retrieve(
                BedrockRetrieveParams.builder().endpoint("endpoint").build()
            )

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

        val bedrockFuture =
            bedrockServiceAsync.update(BedrockUpdateParams.builder().endpoint("endpoint").build())

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

        val bedrockFuture =
            bedrockServiceAsync.delete(BedrockDeleteParams.builder().endpoint("endpoint").build())

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

        val responseFuture =
            bedrockServiceAsync.patch(BedrockPatchParams.builder().endpoint("endpoint").build())

        val response = responseFuture.get()
        response.validate()
    }
}
