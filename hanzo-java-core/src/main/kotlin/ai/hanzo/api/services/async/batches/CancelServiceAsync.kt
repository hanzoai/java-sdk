// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.batches

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.batches.cancel.CancelCancelParams
import ai.hanzo.api.models.batches.cancel.CancelCancelResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface CancelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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

    /** @see [cancel] */
    fun cancel(
        batchId: String,
        params: CancelCancelParams = CancelCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelCancelResponse> =
        cancel(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see [cancel] */
    fun cancel(
        batchId: String,
        params: CancelCancelParams = CancelCancelParams.none(),
    ): CompletableFuture<CancelCancelResponse> = cancel(batchId, params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: CancelCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelCancelResponse>

    /** @see [cancel] */
    fun cancel(params: CancelCancelParams): CompletableFuture<CancelCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
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
         * Returns a raw HTTP response for `post /batches/{batch_id}/cancel`, but is otherwise the
         * same as [CancelServiceAsync.cancel].
         */
        @MustBeClosed
        fun cancel(batchId: String): CompletableFuture<HttpResponseFor<CancelCancelResponse>> =
            cancel(batchId, CancelCancelParams.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            batchId: String,
            params: CancelCancelParams = CancelCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelCancelResponse>> =
            cancel(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            batchId: String,
            params: CancelCancelParams = CancelCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<CancelCancelResponse>> =
            cancel(batchId, params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: CancelCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelCancelResponse>>

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: CancelCancelParams
        ): CompletableFuture<HttpResponseFor<CancelCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            batchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CancelCancelResponse>> =
            cancel(batchId, CancelCancelParams.none(), requestOptions)
    }
}
