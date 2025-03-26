// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.credentials.CredentialCreateParams
import ai.hanzo.api.models.credentials.CredentialDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CredentialServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val credentialServiceAsync = client.credentials()

        val credentialFuture =
            credentialServiceAsync.create(
                CredentialCreateParams.builder()
                    .credentialInfo(JsonValue.from(mapOf<String, Any>()))
                    .credentialName("credential_name")
                    .credentialValues(JsonValue.from(mapOf<String, Any>()))
                    .modelId("model_id")
                    .build()
            )

        val credential = credentialFuture.get()
        credential.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val credentialServiceAsync = client.credentials()

        val credentialFuture = credentialServiceAsync.list()

        val credential = credentialFuture.get()
        credential.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val credentialServiceAsync = client.credentials()

        val credentialFuture =
            credentialServiceAsync.delete(
                CredentialDeleteParams.builder().credentialName("credential_name").build()
            )

        val credential = credentialFuture.get()
        credential.validate()
    }
}
