// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.cohere.CohereCreateParams
import ai.hanzo.api.models.cohere.CohereCreateResponse
import ai.hanzo.api.models.cohere.CohereDeleteParams
import ai.hanzo.api.models.cohere.CohereDeleteResponse
import ai.hanzo.api.models.cohere.CohereModifyParams
import ai.hanzo.api.models.cohere.CohereModifyResponse
import ai.hanzo.api.models.cohere.CohereRetrieveParams
import ai.hanzo.api.models.cohere.CohereRetrieveResponse
import ai.hanzo.api.models.cohere.CohereUpdateParams
import ai.hanzo.api.models.cohere.CohereUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface CohereServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    fun create(params: CohereCreateParams): CompletableFuture<CohereCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CohereCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereCreateResponse>

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    fun retrieve(params: CohereRetrieveParams): CompletableFuture<CohereRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CohereRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereRetrieveResponse>

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    fun update(params: CohereUpdateParams): CompletableFuture<CohereUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CohereUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereUpdateResponse>

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    fun delete(params: CohereDeleteParams): CompletableFuture<CohereDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CohereDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereDeleteResponse>

    /** [Docs](https://docs.llm.ai/docs/pass_through/cohere) */
    fun modify(params: CohereModifyParams): CompletableFuture<CohereModifyResponse> =
        modify(params, RequestOptions.none())

    /** @see [modify] */
    fun modify(
        params: CohereModifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereModifyResponse>

    /**
     * A view of [CohereServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CohereCreateParams
        ): CompletableFuture<HttpResponseFor<CohereCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CohereCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CohereRetrieveParams
        ): CompletableFuture<HttpResponseFor<CohereRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CohereRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: CohereUpdateParams
        ): CompletableFuture<HttpResponseFor<CohereUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CohereUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: CohereDeleteParams
        ): CompletableFuture<HttpResponseFor<CohereDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CohereDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereDeleteResponse>>

        /**
         * Returns a raw HTTP response for `patch /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.modify].
         */
        @MustBeClosed
        fun modify(
            params: CohereModifyParams
        ): CompletableFuture<HttpResponseFor<CohereModifyResponse>> =
            modify(params, RequestOptions.none())

        /** @see [modify] */
        @MustBeClosed
        fun modify(
            params: CohereModifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereModifyResponse>>
    }
}
