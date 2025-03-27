// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.langfuse.LangfuseCreateParams
import ai.hanzo.api.models.langfuse.LangfuseCreateResponse
import ai.hanzo.api.models.langfuse.LangfuseDeleteParams
import ai.hanzo.api.models.langfuse.LangfuseDeleteResponse
import ai.hanzo.api.models.langfuse.LangfusePatchParams
import ai.hanzo.api.models.langfuse.LangfusePatchResponse
import ai.hanzo.api.models.langfuse.LangfuseRetrieveParams
import ai.hanzo.api.models.langfuse.LangfuseRetrieveResponse
import ai.hanzo.api.models.langfuse.LangfuseUpdateParams
import ai.hanzo.api.models.langfuse.LangfuseUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface LangfuseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    fun create(params: LangfuseCreateParams): CompletableFuture<LangfuseCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LangfuseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfuseCreateResponse>

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    fun retrieve(params: LangfuseRetrieveParams): CompletableFuture<LangfuseRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LangfuseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfuseRetrieveResponse>

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    fun update(params: LangfuseUpdateParams): CompletableFuture<LangfuseUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LangfuseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfuseUpdateResponse>

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    fun delete(params: LangfuseDeleteParams): CompletableFuture<LangfuseDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: LangfuseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfuseDeleteResponse>

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    fun patch(params: LangfusePatchParams): CompletableFuture<LangfusePatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: LangfusePatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfusePatchResponse>

    /**
     * A view of [LangfuseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: LangfuseCreateParams
        ): CompletableFuture<HttpResponseFor<LangfuseCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LangfuseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LangfuseRetrieveParams
        ): CompletableFuture<HttpResponseFor<LangfuseRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LangfuseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: LangfuseUpdateParams
        ): CompletableFuture<HttpResponseFor<LangfuseUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LangfuseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /langfuse/{endpoint}`, but is otherwise the same
         * as [LangfuseServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: LangfuseDeleteParams
        ): CompletableFuture<HttpResponseFor<LangfuseDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: LangfuseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseDeleteResponse>>

        /**
         * Returns a raw HTTP response for `patch /langfuse/{endpoint}`, but is otherwise the same
         * as [LangfuseServiceAsync.patch].
         */
        @MustBeClosed
        fun patch(
            params: LangfusePatchParams
        ): CompletableFuture<HttpResponseFor<LangfusePatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: LangfusePatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfusePatchResponse>>
    }
}
