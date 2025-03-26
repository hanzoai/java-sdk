// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.finetuning.jobs

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.finetuning.jobs.cancel.CancelCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CancelServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cancelServiceAsync = client.fineTuning().jobs().cancel()

        val cancelFuture =
            cancelServiceAsync.create(
                CancelCreateParams.builder().fineTuningJobId("fine_tuning_job_id").build()
            )

        val cancel = cancelFuture.get()
        cancel.validate()
    }
}
