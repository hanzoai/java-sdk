// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiCreateParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiDeleteParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiPatchParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiRetrieveParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EuAssemblyaiServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiServiceAsync = client.euAssemblyai()

        val euAssemblyaiFuture =
            euAssemblyaiServiceAsync.create(
                EuAssemblyaiCreateParams.builder().endpoint("endpoint").build()
            )

        val euAssemblyai = euAssemblyaiFuture.get()
        euAssemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiServiceAsync = client.euAssemblyai()

        val euAssemblyaiFuture =
            euAssemblyaiServiceAsync.retrieve(
                EuAssemblyaiRetrieveParams.builder().endpoint("endpoint").build()
            )

        val euAssemblyai = euAssemblyaiFuture.get()
        euAssemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiServiceAsync = client.euAssemblyai()

        val euAssemblyaiFuture =
            euAssemblyaiServiceAsync.update(
                EuAssemblyaiUpdateParams.builder().endpoint("endpoint").build()
            )

        val euAssemblyai = euAssemblyaiFuture.get()
        euAssemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiServiceAsync = client.euAssemblyai()

        val euAssemblyaiFuture =
            euAssemblyaiServiceAsync.delete(
                EuAssemblyaiDeleteParams.builder().endpoint("endpoint").build()
            )

        val euAssemblyai = euAssemblyaiFuture.get()
        euAssemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val euAssemblyaiServiceAsync = client.euAssemblyai()

        val responseFuture =
            euAssemblyaiServiceAsync.patch(
                EuAssemblyaiPatchParams.builder().endpoint("endpoint").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
