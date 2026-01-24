// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.responses.ResponseCreateParams
import ai.hanzo.api.models.responses.ResponseCreateResponse
import ai.hanzo.api.models.responses.ResponseDeleteParams
import ai.hanzo.api.models.responses.ResponseDeleteResponse
import ai.hanzo.api.models.responses.ResponseRetrieveParams
import ai.hanzo.api.models.responses.ResponseRetrieveResponse
import ai.hanzo.api.services.async.responses.InputItemServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ResponseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResponseServiceAsync

    fun inputItems(): InputItemServiceAsync

    /**
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses
     *
     * Supports background mode with polling_via_cache for partial response retrieval. When
     * background=true and polling_via_cache is enabled, returns a polling_id immediately and
     * streams the response in the background, updating Redis cache.
     *
     * ```bash
     * # Normal request
     * curl -X POST http://localhost:4000/v1/responses     -H "Content-Type: application/json"     -H "Authorization: Bearer sk-1234"     -d '{
     *     "model": "gpt-4o",
     *     "input": "Tell me about AI"
     * }'
     *
     * # Background request with polling
     * curl -X POST http://localhost:4000/v1/responses     -H "Content-Type: application/json"     -H "Authorization: Bearer sk-1234"     -d '{
     *     "model": "gpt-4o",
     *     "input": "Tell me about AI",
     *     "background": true
     * }'
     * ```
     */
    fun create(): CompletableFuture<ResponseCreateResponse> = create(ResponseCreateParams.none())

    /** @see create */
    fun create(
        params: ResponseCreateParams = ResponseCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseCreateResponse>

    /** @see create */
    fun create(
        params: ResponseCreateParams = ResponseCreateParams.none()
    ): CompletableFuture<ResponseCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<ResponseCreateResponse> =
        create(ResponseCreateParams.none(), requestOptions)

    /**
     * Get a response by ID.
     *
     * Supports both:
     * - Polling IDs (litellm_poll_*): Returns cumulative cached content from background responses
     * - Provider response IDs: Passes through to provider API
     *
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses/get
     *
     * ```bash
     * # Get polling response
     * curl -X GET http://localhost:4000/v1/responses/litellm_poll_abc123     -H "Authorization: Bearer sk-1234"
     *
     * # Get provider response
     * curl -X GET http://localhost:4000/v1/responses/resp_abc123     -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun retrieve(responseId: String): CompletableFuture<ResponseRetrieveResponse> =
        retrieve(responseId, ResponseRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        responseId: String,
        params: ResponseRetrieveParams = ResponseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseRetrieveResponse> =
        retrieve(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        responseId: String,
        params: ResponseRetrieveParams = ResponseRetrieveParams.none(),
    ): CompletableFuture<ResponseRetrieveResponse> =
        retrieve(responseId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ResponseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ResponseRetrieveParams): CompletableFuture<ResponseRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        responseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResponseRetrieveResponse> =
        retrieve(responseId, ResponseRetrieveParams.none(), requestOptions)

    /**
     * Delete a response by ID.
     *
     * Supports both:
     * - Polling IDs (litellm_poll_*): Deletes from Redis cache
     * - Provider response IDs: Passes through to provider API
     *
     * Follows the OpenAI Responses API spec:
     * https://platform.openai.com/docs/api-reference/responses/delete
     *
     * ```bash
     * curl -X DELETE http://localhost:4000/v1/responses/resp_abc123     -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun delete(responseId: String): CompletableFuture<ResponseDeleteResponse> =
        delete(responseId, ResponseDeleteParams.none())

    /** @see delete */
    fun delete(
        responseId: String,
        params: ResponseDeleteParams = ResponseDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseDeleteResponse> =
        delete(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see delete */
    fun delete(
        responseId: String,
        params: ResponseDeleteParams = ResponseDeleteParams.none(),
    ): CompletableFuture<ResponseDeleteResponse> = delete(responseId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ResponseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResponseDeleteResponse>

    /** @see delete */
    fun delete(params: ResponseDeleteParams): CompletableFuture<ResponseDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        responseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResponseDeleteResponse> =
        delete(responseId, ResponseDeleteParams.none(), requestOptions)

    /**
     * A view of [ResponseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ResponseServiceAsync.WithRawResponse

        fun inputItems(): InputItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/responses`, but is otherwise the same as
         * [ResponseServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<ResponseCreateResponse>> =
            create(ResponseCreateParams.none())

        /** @see create */
        fun create(
            params: ResponseCreateParams = ResponseCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseCreateResponse>>

        /** @see create */
        fun create(
            params: ResponseCreateParams = ResponseCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ResponseCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ResponseCreateResponse>> =
            create(ResponseCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/responses/{response_id}`, but is otherwise the
         * same as [ResponseServiceAsync.retrieve].
         */
        fun retrieve(
            responseId: String
        ): CompletableFuture<HttpResponseFor<ResponseRetrieveResponse>> =
            retrieve(responseId, ResponseRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            responseId: String,
            params: ResponseRetrieveParams = ResponseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseRetrieveResponse>> =
            retrieve(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            responseId: String,
            params: ResponseRetrieveParams = ResponseRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ResponseRetrieveResponse>> =
            retrieve(responseId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ResponseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ResponseRetrieveParams
        ): CompletableFuture<HttpResponseFor<ResponseRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            responseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResponseRetrieveResponse>> =
            retrieve(responseId, ResponseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/responses/{response_id}`, but is otherwise
         * the same as [ResponseServiceAsync.delete].
         */
        fun delete(responseId: String): CompletableFuture<HttpResponseFor<ResponseDeleteResponse>> =
            delete(responseId, ResponseDeleteParams.none())

        /** @see delete */
        fun delete(
            responseId: String,
            params: ResponseDeleteParams = ResponseDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseDeleteResponse>> =
            delete(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see delete */
        fun delete(
            responseId: String,
            params: ResponseDeleteParams = ResponseDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ResponseDeleteResponse>> =
            delete(responseId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ResponseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResponseDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ResponseDeleteParams
        ): CompletableFuture<HttpResponseFor<ResponseDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            responseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResponseDeleteResponse>> =
            delete(responseId, ResponseDeleteParams.none(), requestOptions)
    }
}
