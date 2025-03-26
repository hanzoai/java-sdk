// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.gemini.GeminiCreateParams
import com.hanzo_ai.api.models.gemini.GeminiDeleteParams
import com.hanzo_ai.api.models.gemini.GeminiPatchParams
import com.hanzo_ai.api.models.gemini.GeminiRetrieveParams
import com.hanzo_ai.api.models.gemini.GeminiUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GeminiServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val geminiFuture =
            geminiServiceAsync.create(GeminiCreateParams.builder().endpoint("endpoint").build())

        val gemini = geminiFuture.get()
        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val geminiFuture =
            geminiServiceAsync.retrieve(GeminiRetrieveParams.builder().endpoint("endpoint").build())

        val gemini = geminiFuture.get()
        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val geminiFuture =
            geminiServiceAsync.update(GeminiUpdateParams.builder().endpoint("endpoint").build())

        val gemini = geminiFuture.get()
        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val geminiFuture =
            geminiServiceAsync.delete(GeminiDeleteParams.builder().endpoint("endpoint").build())

        val gemini = geminiFuture.get()
        gemini.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geminiServiceAsync = client.gemini()

        val responseFuture =
            geminiServiceAsync.patch(GeminiPatchParams.builder().endpoint("endpoint").build())

        val response = responseFuture.get()
        response.validate()
    }
}
