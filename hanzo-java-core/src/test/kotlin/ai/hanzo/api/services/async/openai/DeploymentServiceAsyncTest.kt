// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.openai

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.openai.deployments.DeploymentCompleteParams
import ai.hanzo.api.models.openai.deployments.DeploymentEmbedParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeploymentServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun complete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentServiceAsync = client.openai().deployments()

        val responseFuture =
            deploymentServiceAsync.complete(
                DeploymentCompleteParams.builder().model("model").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun embed() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentServiceAsync = client.openai().deployments()

        val responseFuture =
            deploymentServiceAsync.embed(DeploymentEmbedParams.builder().model("model").build())

        val response = responseFuture.get()
        response.validate()
    }
}
