// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.files

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.files.content.ContentRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ContentServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val contentServiceAsync = client.files().content()

        val contentFuture =
            contentServiceAsync.retrieve(
                ContentRetrieveParams.builder().provider("provider").fileId("file_id").build()
            )

        val content = contentFuture.get()
        content.validate()
    }
}
