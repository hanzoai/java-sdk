// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.responses

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.responses.inputitems.InputItemListParams
import ai.hanzo.api.models.responses.inputitems.InputItemListResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface InputItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get input items for a response.
     *
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses/input-items
     *
     * ```bash
     * curl -X GET http://localhost:4000/v1/responses/resp_abc123/input_items     -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun list(params: InputItemListParams): CompletableFuture<InputItemListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: InputItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InputItemListResponse>

    /**
     * A view of [InputItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/responses/{response_id}/input_items`, but is
         * otherwise the same as [InputItemServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: InputItemListParams
        ): CompletableFuture<HttpResponseFor<InputItemListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InputItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InputItemListResponse>>
    }
}
