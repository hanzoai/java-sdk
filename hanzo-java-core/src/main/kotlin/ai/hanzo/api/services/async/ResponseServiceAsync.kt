// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.responses.ResponseCreateParams
import ai.hanzo.api.models.responses.ResponseCreateResponse
import ai.hanzo.api.models.responses.ResponseDeleteParams
import ai.hanzo.api.models.responses.ResponseDeleteResponse
import ai.hanzo.api.models.responses.ResponseRetrieveParams
import ai.hanzo.api.models.responses.ResponseRetrieveResponse
import ai.hanzo.api.services.async.responses.InputItemServiceAsync
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface ResponseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun inputItems(): InputItemServiceAsync

    /**
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses
     *
     * ```bash
     * curl -X POST http://localhost:4000/v1/responses     -H "Content-Type: application/json"     -H "Authorization: Bearer sk-1234"     -d '{
     *     "model": "gpt-4o",
     *     "input": "Tell me about AI"
     * }'
     * ```
     */
    fun create(): CompletableFuture<ResponseCreateResponse> = create(ResponseCreateParams.none())

    /** @see [create] */
    fun create(
        params: ResponseCreateParams = ResponseCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseCreateResponse>

    /** @see [create] */
    fun create(
        params: ResponseCreateParams = ResponseCreateParams.none()
    ): CompletableFuture<ResponseCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<ResponseCreateResponse> =
        create(ResponseCreateParams.none(), requestOptions)

    /**
     * Get a response by ID.
     *
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses/get
     *
     * ```bash
     * curl -X GET http://localhost:4000/v1/responses/resp_abc123     -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun retrieve(params: ResponseRetrieveParams): CompletableFuture<ResponseRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ResponseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseRetrieveResponse>

    /**
     * Delete a response by ID.
     *
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses/delete
     *
     * ```bash
     * curl -X DELETE http://localhost:4000/v1/responses/resp_abc123     -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun delete(params: ResponseDeleteParams): CompletableFuture<ResponseDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ResponseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseDeleteResponse>

    /**
     * A view of [ResponseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun inputItems(): InputItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/responses`, but is otherwise the same as
         * [ResponseServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<ResponseCreateResponse>> =
            create(ResponseCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ResponseCreateParams = ResponseCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ResponseCreateParams = ResponseCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ResponseCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ResponseCreateResponse>> =
            create(ResponseCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/responses/{response_id}`, but is otherwise the
         * same as [ResponseServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ResponseRetrieveParams
        ): CompletableFuture<HttpResponseFor<ResponseRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ResponseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/responses/{response_id}`, but is otherwise
         * the same as [ResponseServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: ResponseDeleteParams
        ): CompletableFuture<HttpResponseFor<ResponseDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ResponseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseDeleteResponse>>
    }
}
