// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.responses

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.responses.inputitems.InputItemListParams
import ai.hanzo.api.models.responses.inputitems.InputItemListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InputItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InputItemServiceAsync

    /** List input items for a response. */
    fun list(responseId: String): CompletableFuture<InputItemListResponse> =
        list(responseId, InputItemListParams.none())

    /** @see list */
    fun list(
        responseId: String,
        params: InputItemListParams = InputItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InputItemListResponse> =
        list(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see list */
    fun list(
        responseId: String,
        params: InputItemListParams = InputItemListParams.none(),
    ): CompletableFuture<InputItemListResponse> = list(responseId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: InputItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InputItemListResponse>

    /** @see list */
    fun list(params: InputItemListParams): CompletableFuture<InputItemListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        responseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InputItemListResponse> =
        list(responseId, InputItemListParams.none(), requestOptions)

    /**
     * A view of [InputItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InputItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/responses/{response_id}/input_items`, but is
         * otherwise the same as [InputItemServiceAsync.list].
         */
        fun list(responseId: String): CompletableFuture<HttpResponseFor<InputItemListResponse>> =
            list(responseId, InputItemListParams.none())

        /** @see list */
        fun list(
            responseId: String,
            params: InputItemListParams = InputItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InputItemListResponse>> =
            list(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see list */
        fun list(
            responseId: String,
            params: InputItemListParams = InputItemListParams.none(),
        ): CompletableFuture<HttpResponseFor<InputItemListResponse>> =
            list(responseId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: InputItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InputItemListResponse>>

        /** @see list */
        fun list(
            params: InputItemListParams
        ): CompletableFuture<HttpResponseFor<InputItemListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            responseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InputItemListResponse>> =
            list(responseId, InputItemListParams.none(), requestOptions)
    }
}
