// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.vertexai.VertexAiCreateParams
import com.hanzo_ai.api.models.vertexai.VertexAiDeleteParams
import com.hanzo_ai.api.models.vertexai.VertexAiPatchParams
import com.hanzo_ai.api.models.vertexai.VertexAiRetrieveParams
import com.hanzo_ai.api.models.vertexai.VertexAiUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VertexAiServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vertexAiServiceAsync = client.vertexAi()

        val vertexAiFuture =
            vertexAiServiceAsync.create(VertexAiCreateParams.builder().endpoint("endpoint").build())

        val vertexAi = vertexAiFuture.get()
        vertexAi.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vertexAiServiceAsync = client.vertexAi()

        val vertexAiFuture =
            vertexAiServiceAsync.retrieve(
                VertexAiRetrieveParams.builder().endpoint("endpoint").build()
            )

        val vertexAi = vertexAiFuture.get()
        vertexAi.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vertexAiServiceAsync = client.vertexAi()

        val vertexAiFuture =
            vertexAiServiceAsync.update(VertexAiUpdateParams.builder().endpoint("endpoint").build())

        val vertexAi = vertexAiFuture.get()
        vertexAi.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vertexAiServiceAsync = client.vertexAi()

        val vertexAiFuture =
            vertexAiServiceAsync.delete(VertexAiDeleteParams.builder().endpoint("endpoint").build())

        val vertexAi = vertexAiFuture.get()
        vertexAi.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vertexAiServiceAsync = client.vertexAi()

        val responseFuture =
            vertexAiServiceAsync.patch(VertexAiPatchParams.builder().endpoint("endpoint").build())

        val response = responseFuture.get()
        response.validate()
    }
}
