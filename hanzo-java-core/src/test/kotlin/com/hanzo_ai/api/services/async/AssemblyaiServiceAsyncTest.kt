// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.assemblyai.AssemblyaiCreateParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiDeleteParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiPatchParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiRetrieveParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssemblyaiServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyaiFuture =
            assemblyaiServiceAsync.create(
                AssemblyaiCreateParams.builder().endpoint("endpoint").build()
            )

        val assemblyai = assemblyaiFuture.get()
        assemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyaiFuture =
            assemblyaiServiceAsync.retrieve(
                AssemblyaiRetrieveParams.builder().endpoint("endpoint").build()
            )

        val assemblyai = assemblyaiFuture.get()
        assemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyaiFuture =
            assemblyaiServiceAsync.update(
                AssemblyaiUpdateParams.builder().endpoint("endpoint").build()
            )

        val assemblyai = assemblyaiFuture.get()
        assemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val assemblyaiFuture =
            assemblyaiServiceAsync.delete(
                AssemblyaiDeleteParams.builder().endpoint("endpoint").build()
            )

        val assemblyai = assemblyaiFuture.get()
        assemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiServiceAsync = client.assemblyai()

        val responseFuture =
            assemblyaiServiceAsync.patch(
                AssemblyaiPatchParams.builder().endpoint("endpoint").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
