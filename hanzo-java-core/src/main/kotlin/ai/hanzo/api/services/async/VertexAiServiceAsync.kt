// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface VertexAiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun create(params: VertexAiCreateParams): CompletableFuture<VertexAiCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: VertexAiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiCreateResponse>

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun retrieve(params: VertexAiRetrieveParams): CompletableFuture<VertexAiRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: VertexAiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiRetrieveResponse>

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun update(params: VertexAiUpdateParams): CompletableFuture<VertexAiUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: VertexAiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiUpdateResponse>

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun delete(params: VertexAiDeleteParams): CompletableFuture<VertexAiDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: VertexAiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiDeleteResponse>

    /**
     * Call LLM proxy via Vertex AI SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/vertex_ai)
     */
    fun patch(params: VertexAiPatchParams): CompletableFuture<VertexAiPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: VertexAiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VertexAiPatchResponse>

    /**
     * A view of [VertexAiServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: VertexAiCreateParams
        ): CompletableFuture<HttpResponseFor<VertexAiCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: VertexAiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /vertex_ai/{endpoint}`, but is otherwise the same as
         * [VertexAiServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: VertexAiRetrieveParams
        ): CompletableFuture<HttpResponseFor<VertexAiRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: VertexAiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /vertex_ai/{endpoint}`, but is otherwise the same as
         * [VertexAiServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: VertexAiUpdateParams
        ): CompletableFuture<HttpResponseFor<VertexAiUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: VertexAiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: VertexAiDeleteParams
        ): CompletableFuture<HttpResponseFor<VertexAiDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: VertexAiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiDeleteResponse>>

        /**
         * Returns a raw HTTP response for `patch /vertex_ai/{endpoint}`, but is otherwise the same
         * as [VertexAiServiceAsync.patch].
         */
        @MustBeClosed
        fun patch(
            params: VertexAiPatchParams
        ): CompletableFuture<HttpResponseFor<VertexAiPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: VertexAiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VertexAiPatchResponse>>
    }
}
