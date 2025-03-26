// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.config

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointUpdateParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughGenericEndpoint
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PassThroughEndpointServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointService = client.config().passThroughEndpoint()

        val passThroughEndpoint =
            passThroughEndpointService.create(
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

        passThroughEndpoint.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointService = client.config().passThroughEndpoint()

        val passThroughEndpoint =
            passThroughEndpointService.update(
                PassThroughEndpointUpdateParams.builder().endpointId("endpoint_id").build()
            )

        passThroughEndpoint.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointService = client.config().passThroughEndpoint()

        val passThroughEndpointResponse =
            passThroughEndpointService.list(
                PassThroughEndpointListParams.builder().endpointId("endpoint_id").build()
            )

        passThroughEndpointResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val passThroughEndpointService = client.config().passThroughEndpoint()

        val passThroughEndpointResponse =
            passThroughEndpointService.delete(
                PassThroughEndpointDeleteParams.builder().endpointId("endpoint_id").build()
            )

        passThroughEndpointResponse.validate()
    }
}
