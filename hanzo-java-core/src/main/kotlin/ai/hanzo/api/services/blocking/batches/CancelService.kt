// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.batches

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.batches.cancel.CancelCancelParams
import ai.hanzo.api.models.batches.cancel.CancelCancelResponse
import com.google.errorprone.annotations.MustBeClosed

interface CancelService {

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
    fun cancel(params: CancelCancelParams): CancelCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: CancelCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelCancelResponse

    /** A view of [CancelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /batches/{batch_id}/cancel`, but is otherwise the
         * same as [CancelService.cancel].
         */
        @MustBeClosed
        fun cancel(params: CancelCancelParams): HttpResponseFor<CancelCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: CancelCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelCancelResponse>
    }
}
