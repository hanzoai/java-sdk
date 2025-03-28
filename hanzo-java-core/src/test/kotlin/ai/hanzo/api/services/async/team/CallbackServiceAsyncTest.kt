// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.team

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.models.team.callback.CallbackAddParams
import ai.hanzo.api.models.team.callback.CallbackRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallbackServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callbackServiceAsync = client.team().callback()

        val callbackFuture =
            callbackServiceAsync.retrieve(
                CallbackRetrieveParams.builder().teamId("team_id").build()
            )

        val callback = callbackFuture.get()
        callback.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun add() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callbackServiceAsync = client.team().callback()

        val responseFuture =
            callbackServiceAsync.add(
                CallbackAddParams.builder()
                    .teamId("team_id")
                    .llmChangedBy("llm-changed-by")
                    .callbackName("callback_name")
                    .callbackVars(
                        CallbackAddParams.CallbackVars.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .callbackType(CallbackAddParams.CallbackType.SUCCESS)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
