// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.TestServerExtension
import ai.hanzo.api.client.okhttp.HanzoOkHttpClientAsync
import ai.hanzo.api.models.batches.BatchCancelWithProviderParams
import ai.hanzo.api.models.batches.BatchCreateParams
import ai.hanzo.api.models.batches.BatchCreateWithProviderParams
import ai.hanzo.api.models.batches.BatchListParams
import ai.hanzo.api.models.batches.BatchListWithProviderParams
import ai.hanzo.api.models.batches.BatchRetrieveParams
import ai.hanzo.api.models.batches.BatchRetrieveWithProviderParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val batchFuture =
            batchServiceAsync.create(BatchCreateParams.builder().provider("provider").build())

        val batch = batchFuture.get()
        batch.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val batchFuture =
            batchServiceAsync.retrieve(
                BatchRetrieveParams.builder().batchId("batch_id").provider("provider").build()
            )

        val batch = batchFuture.get()
        batch.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val batchFuture =
            batchServiceAsync.list(
                BatchListParams.builder().after("after").limit(0L).provider("provider").build()
            )

        val batch = batchFuture.get()
        batch.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun cancelWithProvider() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val responseFuture =
            batchServiceAsync.cancelWithProvider(
                BatchCancelWithProviderParams.builder()
                    .provider("provider")
                    .batchId("batch_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createWithProvider() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val responseFuture =
            batchServiceAsync.createWithProvider(
                BatchCreateWithProviderParams.builder().provider("provider").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listWithProvider() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val responseFuture =
            batchServiceAsync.listWithProvider(
                BatchListWithProviderParams.builder()
                    .provider("provider")
                    .after("after")
                    .limit(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveWithProvider() {
        val client =
            HanzoOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batches()

        val responseFuture =
            batchServiceAsync.retrieveWithProvider(
                BatchRetrieveWithProviderParams.builder()
                    .provider("provider")
                    .batchId("batch_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
