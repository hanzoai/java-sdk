// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.openai

import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DeploymentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun complete() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val deploymentServiceAsync = client.openai().deployments()

        val responseFuture = deploymentServiceAsync.complete("model")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun embed() {
        val client = HanzoOkHttpClientAsync.builder().apiKey("My API Key").build()
        val deploymentServiceAsync = client.openai().deployments()

        val responseFuture = deploymentServiceAsync.embed("model")

        val response = responseFuture.get()
        response.validate()
    }
}
