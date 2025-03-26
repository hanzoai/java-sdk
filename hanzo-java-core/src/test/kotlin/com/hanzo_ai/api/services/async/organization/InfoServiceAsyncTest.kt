// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.organization

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClientAsync
import com.hanzo_ai.api.models.organization.info.InfoDeprecatedParams
import com.hanzo_ai.api.models.organization.info.InfoRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InfoServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val infoServiceAsync = client.organization().info()

        val infoFuture =
            infoServiceAsync.retrieve(
                InfoRetrieveParams.builder().organizationId("organization_id").build()
            )

        val info = infoFuture.get()
        info.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun deprecated() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val infoServiceAsync = client.organization().info()

        val responseFuture =
            infoServiceAsync.deprecated(
                InfoDeprecatedParams.builder().addOrganization("string").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
