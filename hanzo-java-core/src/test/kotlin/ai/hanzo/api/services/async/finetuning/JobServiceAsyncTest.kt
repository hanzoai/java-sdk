// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.finetuning

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.finetuning.jobs.JobCreateParams
import ai.hanzo.api.models.finetuning.jobs.JobListParams
import ai.hanzo.api.models.finetuning.jobs.JobRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.fineTuning().jobs()

        val jobFuture =
            jobServiceAsync.create(
                JobCreateParams.builder()
                    .customLlmProvider(JobCreateParams.CustomLlmProvider.OPENAI)
                    .model("model")
                    .trainingFile("training_file")
                    .hyperparameters(
                        JobCreateParams.Hyperparameters.builder()
                            .batchSize("string")
                            .learningRateMultiplier("string")
                            .nEpochs("string")
                            .build()
                    )
                    .addIntegration("string")
                    .seed(0L)
                    .suffix("suffix")
                    .validationFile("validation_file")
                    .build()
            )

        val job = jobFuture.get()
        job.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.fineTuning().jobs()

        val jobFuture =
            jobServiceAsync.retrieve(
                JobRetrieveParams.builder()
                    .fineTuningJobId("fine_tuning_job_id")
                    .customLlmProvider(JobRetrieveParams.CustomLlmProvider.OPENAI)
                    .build()
            )

        val job = jobFuture.get()
        job.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobServiceAsync = client.fineTuning().jobs()

        val jobFuture =
            jobServiceAsync.list(
                JobListParams.builder()
                    .customLlmProvider(JobListParams.CustomLlmProvider.OPENAI)
                    .after("after")
                    .limit(0L)
                    .build()
            )

        val job = jobFuture.get()
        job.validate()
    }
}
