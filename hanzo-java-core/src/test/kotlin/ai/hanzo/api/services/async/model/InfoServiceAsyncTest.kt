// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.model

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.model.info.InfoListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InfoServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val infoServiceAsync = client.model().info()

        val infosFuture =
            infoServiceAsync.list(InfoListParams.builder().llmModelId("llm_model_id").build())

        val infos = infosFuture.get()
        infos.validate()
    }
}
