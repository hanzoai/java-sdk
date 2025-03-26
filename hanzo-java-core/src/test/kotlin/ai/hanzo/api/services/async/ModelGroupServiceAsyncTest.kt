// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.modelgroup.ModelGroupRetrieveInfoParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelGroupServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveInfo() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val modelGroupServiceAsync = client.modelGroup()

        val responseFuture =
            modelGroupServiceAsync.retrieveInfo(
                ModelGroupRetrieveInfoParams.builder().modelGroup("model_group").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
