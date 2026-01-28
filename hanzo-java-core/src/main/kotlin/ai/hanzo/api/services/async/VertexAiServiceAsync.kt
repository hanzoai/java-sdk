// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.vertexai.VertexAiCreateParams
import ai.hanzo.api.models.vertexai.VertexAiCreateResponse
import ai.hanzo.api.models.vertexai.VertexAiDeleteParams
import ai.hanzo.api.models.vertexai.VertexAiDeleteResponse
import ai.hanzo.api.models.vertexai.VertexAiPatchParams
import ai.hanzo.api.models.vertexai.VertexAiPatchResponse
import ai.hanzo.api.models.vertexai.VertexAiRetrieveParams
import ai.hanzo.api.models.vertexai.VertexAiRetrieveResponse
import ai.hanzo.api.models.vertexai.VertexAiUpdateParams
import ai.hanzo.api.models.vertexai.VertexAiUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VertexAiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VertexAiServiceAsync

    /**
     * Call LiteLLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/vertex_ai)
     */
    fun create(endpoint: String): CompletableFuture<VertexAiCreateResponse> =
        create(endpoint, VertexAiCreateParams.none())

    /** @see create */
    fun create(
        endpoint: String,
        params: VertexAiCreateParams = VertexAiCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiCreateResponse> =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    fun create(
        endpoint: String,
        params: VertexAiCreateParams = VertexAiCreateParams.none(),
    ): CompletableFuture<VertexAiCreateResponse> = create(endpoint, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VertexAiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiCreateResponse>

    /** @see create */
    fun create(params: VertexAiCreateParams): CompletableFuture<VertexAiCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VertexAiCreateResponse> =
        create(endpoint, VertexAiCreateParams.none(), requestOptions)

    /**
     * Call LiteLLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/vertex_ai)
     */
    fun retrieve(endpoint: String): CompletableFuture<VertexAiRetrieveResponse> =
        retrieve(endpoint, VertexAiRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        params: VertexAiRetrieveParams = VertexAiRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiRetrieveResponse> =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        params: VertexAiRetrieveParams = VertexAiRetrieveParams.none(),
    ): CompletableFuture<VertexAiRetrieveResponse> =
        retrieve(endpoint, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VertexAiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: VertexAiRetrieveParams): CompletableFuture<VertexAiRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VertexAiRetrieveResponse> =
        retrieve(endpoint, VertexAiRetrieveParams.none(), requestOptions)

    /**
     * Call LiteLLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/vertex_ai)
     */
    fun update(endpoint: String): CompletableFuture<VertexAiUpdateResponse> =
        update(endpoint, VertexAiUpdateParams.none())

    /** @see update */
    fun update(
        endpoint: String,
        params: VertexAiUpdateParams = VertexAiUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiUpdateResponse> =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    fun update(
        endpoint: String,
        params: VertexAiUpdateParams = VertexAiUpdateParams.none(),
    ): CompletableFuture<VertexAiUpdateResponse> = update(endpoint, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VertexAiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiUpdateResponse>

    /** @see update */
    fun update(params: VertexAiUpdateParams): CompletableFuture<VertexAiUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VertexAiUpdateResponse> =
        update(endpoint, VertexAiUpdateParams.none(), requestOptions)

    /**
     * Call LiteLLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/vertex_ai)
     */
    fun delete(endpoint: String): CompletableFuture<VertexAiDeleteResponse> =
        delete(endpoint, VertexAiDeleteParams.none())

    /** @see delete */
    fun delete(
        endpoint: String,
        params: VertexAiDeleteParams = VertexAiDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiDeleteResponse> =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    fun delete(
        endpoint: String,
        params: VertexAiDeleteParams = VertexAiDeleteParams.none(),
    ): CompletableFuture<VertexAiDeleteResponse> = delete(endpoint, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VertexAiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiDeleteResponse>

    /** @see delete */
    fun delete(params: VertexAiDeleteParams): CompletableFuture<VertexAiDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VertexAiDeleteResponse> =
        delete(endpoint, VertexAiDeleteParams.none(), requestOptions)

    /**
     * Call LiteLLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.litellm.ai/docs/pass_through/vertex_ai)
     */
    fun patch(endpoint: String): CompletableFuture<VertexAiPatchResponse> =
        patch(endpoint, VertexAiPatchParams.none())

    /** @see patch */
    fun patch(
        endpoint: String,
        params: VertexAiPatchParams = VertexAiPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiPatchResponse> =
        patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see patch */
    fun patch(
        endpoint: String,
        params: VertexAiPatchParams = VertexAiPatchParams.none(),
    ): CompletableFuture<VertexAiPatchResponse> = patch(endpoint, params, RequestOptions.none())

    /** @see patch */
    fun patch(
        params: VertexAiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiPatchResponse>

    /** @see patch */
    fun patch(params: VertexAiPatchParams): CompletableFuture<VertexAiPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see patch */
    fun patch(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VertexAiPatchResponse> =
        patch(endpoint, VertexAiPatchParams.none(), requestOptions)

    /**
     * A view of [VertexAiServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VertexAiServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiServiceAsync.create].
         */
        fun create(endpoint: String): CompletableFuture<HttpResponseFor<VertexAiCreateResponse>> =
            create(endpoint, VertexAiCreateParams.none())

        /** @see create */
        fun create(
            endpoint: String,
            params: VertexAiCreateParams = VertexAiCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiCreateResponse>> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        fun create(
            endpoint: String,
            params: VertexAiCreateParams = VertexAiCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiCreateResponse>> =
            create(endpoint, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VertexAiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiCreateResponse>>

        /** @see create */
        fun create(
            params: VertexAiCreateParams
        ): CompletableFuture<HttpResponseFor<VertexAiCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VertexAiCreateResponse>> =
            create(endpoint, VertexAiCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /vertex_ai/{endpoint}`, but is otherwise the same as
         * [VertexAiServiceAsync.retrieve].
         */
        fun retrieve(
            endpoint: String
        ): CompletableFuture<HttpResponseFor<VertexAiRetrieveResponse>> =
            retrieve(endpoint, VertexAiRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            params: VertexAiRetrieveParams = VertexAiRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiRetrieveResponse>> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            params: VertexAiRetrieveParams = VertexAiRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiRetrieveResponse>> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VertexAiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: VertexAiRetrieveParams
        ): CompletableFuture<HttpResponseFor<VertexAiRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VertexAiRetrieveResponse>> =
            retrieve(endpoint, VertexAiRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /vertex_ai/{endpoint}`, but is otherwise the same as
         * [VertexAiServiceAsync.update].
         */
        fun update(endpoint: String): CompletableFuture<HttpResponseFor<VertexAiUpdateResponse>> =
            update(endpoint, VertexAiUpdateParams.none())

        /** @see update */
        fun update(
            endpoint: String,
            params: VertexAiUpdateParams = VertexAiUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiUpdateResponse>> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        fun update(
            endpoint: String,
            params: VertexAiUpdateParams = VertexAiUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiUpdateResponse>> =
            update(endpoint, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: VertexAiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiUpdateResponse>>

        /** @see update */
        fun update(
            params: VertexAiUpdateParams
        ): CompletableFuture<HttpResponseFor<VertexAiUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VertexAiUpdateResponse>> =
            update(endpoint, VertexAiUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiServiceAsync.delete].
         */
        fun delete(endpoint: String): CompletableFuture<HttpResponseFor<VertexAiDeleteResponse>> =
            delete(endpoint, VertexAiDeleteParams.none())

        /** @see delete */
        fun delete(
            endpoint: String,
            params: VertexAiDeleteParams = VertexAiDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiDeleteResponse>> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        fun delete(
            endpoint: String,
            params: VertexAiDeleteParams = VertexAiDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiDeleteResponse>> =
            delete(endpoint, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: VertexAiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiDeleteResponse>>

        /** @see delete */
        fun delete(
            params: VertexAiDeleteParams
        ): CompletableFuture<HttpResponseFor<VertexAiDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VertexAiDeleteResponse>> =
            delete(endpoint, VertexAiDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiServiceAsync.patch].
         */
        fun patch(endpoint: String): CompletableFuture<HttpResponseFor<VertexAiPatchResponse>> =
            patch(endpoint, VertexAiPatchParams.none())

        /** @see patch */
        fun patch(
            endpoint: String,
            params: VertexAiPatchParams = VertexAiPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiPatchResponse>> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see patch */
        fun patch(
            endpoint: String,
            params: VertexAiPatchParams = VertexAiPatchParams.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiPatchResponse>> =
            patch(endpoint, params, RequestOptions.none())

        /** @see patch */
        fun patch(
            params: VertexAiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiPatchResponse>>

        /** @see patch */
        fun patch(
            params: VertexAiPatchParams
        ): CompletableFuture<HttpResponseFor<VertexAiPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see patch */
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VertexAiPatchResponse>> =
            patch(endpoint, VertexAiPatchParams.none(), requestOptions)
    }
}
