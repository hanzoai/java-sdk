// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.files

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.files.content.ContentRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val contentServiceAsync = client.files().content()

        val contentFuture =
            contentServiceAsync.retrieve(
                ContentRetrieveParams.builder().provider("provider").fileId("file_id").build()
            )

        val content = contentFuture.get()
        content.validate()
    }
}
