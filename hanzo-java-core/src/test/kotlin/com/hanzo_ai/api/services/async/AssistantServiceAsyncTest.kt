// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.assistants.AssistantDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssistantServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.assistants()

        val assistantFuture = assistantServiceAsync.create()

        val assistant = assistantFuture.get()
        assistant.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.assistants()

        val assistantFuture = assistantServiceAsync.list()

        val assistant = assistantFuture.get()
        assistant.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.assistants()

        val assistantFuture =
            assistantServiceAsync.delete(
                AssistantDeleteParams.builder().assistantId("assistant_id").build()
            )

        val assistant = assistantFuture.get()
        assistant.validate()
    }
}
