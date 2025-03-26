// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.models.assemblyai.AssemblyaiCreateParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiDeleteParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiPatchParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiRetrieveParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssemblyaiServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiService = client.assemblyai()

        val assemblyai =
            assemblyaiService.create(AssemblyaiCreateParams.builder().endpoint("endpoint").build())

        assemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiService = client.assemblyai()

        val assemblyai =
            assemblyaiService.retrieve(
                AssemblyaiRetrieveParams.builder().endpoint("endpoint").build()
            )

        assemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiService = client.assemblyai()

        val assemblyai =
            assemblyaiService.update(AssemblyaiUpdateParams.builder().endpoint("endpoint").build())

        assemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiService = client.assemblyai()

        val assemblyai =
            assemblyaiService.delete(AssemblyaiDeleteParams.builder().endpoint("endpoint").build())

        assemblyai.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun patch() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assemblyaiService = client.assemblyai()

        val response =
            assemblyaiService.patch(AssemblyaiPatchParams.builder().endpoint("endpoint").build())

        response.validate()
    }
}
