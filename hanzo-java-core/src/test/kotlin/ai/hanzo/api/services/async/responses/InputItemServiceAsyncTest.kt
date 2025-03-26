// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.responses

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.responses.inputitems.InputItemListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InputItemServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inputItemServiceAsync = client.responses().inputItems()

        val inputItemFuture =
            inputItemServiceAsync.list(
                InputItemListParams.builder().responseId("response_id").build()
            )

        val inputItem = inputItemFuture.get()
        inputItem.validate()
    }
}
