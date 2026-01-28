// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.batches

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.batches.cancel.CancelCancelParams
import ai.hanzo.api.models.batches.cancel.CancelCancelResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CancelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CancelServiceAsync

    /**
     * Cancel a batch. This is the equivalent of POST
     * https://api.openai.com/v1/batches/{batch_id}/cancel
     *
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/batch/cancel
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches/batch_abc123/cancel         -H "Authorization: Bearer sk-1234"         -H "Content-Type: application/json"         -X POST
     *
     * ```
     */
    fun cancel(batchId: String): CompletableFuture<CancelCancelResponse> =
        cancel(batchId, CancelCancelParams.none())

    /** @see cancel */
    fun cancel(
        batchId: String,
        params: CancelCancelParams = CancelCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelCancelResponse> =
        cancel(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        batchId: String,
        params: CancelCancelParams = CancelCancelParams.none(),
    ): CompletableFuture<CancelCancelResponse> = cancel(batchId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: CancelCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelCancelResponse>

    /** @see cancel */
    fun cancel(params: CancelCancelParams): CompletableFuture<CancelCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        batchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CancelCancelResponse> =
        cancel(batchId, CancelCancelParams.none(), requestOptions)

    /**
     * A view of [CancelServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CancelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /batches/{batch_id}/cancel`, but is otherwise the
         * same as [CancelServiceAsync.cancel].
         */
        fun cancel(batchId: String): CompletableFuture<HttpResponseFor<CancelCancelResponse>> =
            cancel(batchId, CancelCancelParams.none())

        /** @see cancel */
        fun cancel(
            batchId: String,
            params: CancelCancelParams = CancelCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelCancelResponse>> =
            cancel(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            batchId: String,
            params: CancelCancelParams = CancelCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<CancelCancelResponse>> =
            cancel(batchId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: CancelCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: CancelCancelParams
        ): CompletableFuture<HttpResponseFor<CancelCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            batchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CancelCancelResponse>> =
            cancel(batchId, CancelCancelParams.none(), requestOptions)
    }
}
