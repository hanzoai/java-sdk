// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.langfuse.LangfuseCreateParams
import com.hanzo_ai.api.models.langfuse.LangfuseDeleteParams
import com.hanzo_ai.api.models.langfuse.LangfusePatchParams
import com.hanzo_ai.api.models.langfuse.LangfuseRetrieveParams
import com.hanzo_ai.api.models.langfuse.LangfuseUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LangfuseServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseServiceAsync = client.langfuse()

        val langfuseFuture =
            langfuseServiceAsync.create(LangfuseCreateParams.builder().endpoint("endpoint").build())

        val langfuse = langfuseFuture.get()
        langfuse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseServiceAsync = client.langfuse()

        val langfuseFuture =
            langfuseServiceAsync.retrieve(
                LangfuseRetrieveParams.builder().endpoint("endpoint").build()
            )

        val langfuse = langfuseFuture.get()
        langfuse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseServiceAsync = client.langfuse()

        val langfuseFuture =
            langfuseServiceAsync.update(LangfuseUpdateParams.builder().endpoint("endpoint").build())

        val langfuse = langfuseFuture.get()
        langfuse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseServiceAsync = client.langfuse()

        val langfuseFuture =
            langfuseServiceAsync.delete(LangfuseDeleteParams.builder().endpoint("endpoint").build())

        val langfuse = langfuseFuture.get()
        langfuse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val langfuseServiceAsync = client.langfuse()

        val responseFuture =
            langfuseServiceAsync.patch(LangfusePatchParams.builder().endpoint("endpoint").build())

        val response = responseFuture.get()
        response.validate()
    }
}
