// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.langfuse.LangfuseCreateParams
import ai.hanzo.api.models.langfuse.LangfuseDeleteParams
import ai.hanzo.api.models.langfuse.LangfusePatchParams
import ai.hanzo.api.models.langfuse.LangfuseRetrieveParams
import ai.hanzo.api.models.langfuse.LangfuseUpdateParams
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
