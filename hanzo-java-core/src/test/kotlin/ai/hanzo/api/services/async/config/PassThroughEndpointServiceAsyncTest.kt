// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.config

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughGenericEndpoint
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PassThroughEndpointServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointServiceAsync = client.config().passThroughEndpoint()

        val passThroughEndpointFuture =
            passThroughEndpointServiceAsync.create(
                PassThroughEndpointCreateParams.builder()
                    .passThroughGenericEndpoint(
                        PassThroughGenericEndpoint.builder()
                            .headers(JsonValue.from(mapOf<String, Any>()))
                            .path("path")
                            .target("target")
                            .build()
                    )
                    .build()
            )

        val passThroughEndpoint = passThroughEndpointFuture.get()
        passThroughEndpoint.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointServiceAsync = client.config().passThroughEndpoint()

        val passThroughEndpointFuture = passThroughEndpointServiceAsync.update("endpoint_id")

        val passThroughEndpoint = passThroughEndpointFuture.get()
        passThroughEndpoint.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointServiceAsync = client.config().passThroughEndpoint()

        val passThroughEndpointResponseFuture =
            passThroughEndpointServiceAsync.list(
                PassThroughEndpointListParams.builder().endpointId("endpoint_id").build()
            )

        val passThroughEndpointResponse = passThroughEndpointResponseFuture.get()
        passThroughEndpointResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointServiceAsync = client.config().passThroughEndpoint()

        val passThroughEndpointResponseFuture =
            passThroughEndpointServiceAsync.delete(
                PassThroughEndpointDeleteParams.builder().endpointId("endpoint_id").build()
            )

        val passThroughEndpointResponse = passThroughEndpointResponseFuture.get()
        passThroughEndpointResponse.validate()
    }
}
