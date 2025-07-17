// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LangfuseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LangfuseServiceAsync

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    fun create(endpoint: String): CompletableFuture<LangfuseCreateResponse> =
        create(endpoint, LangfuseCreateParams.none())

    /** @see [create] */
    fun create(
        endpoint: String,
        params: LangfuseCreateParams = LangfuseCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfuseCreateResponse> =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [create] */
    fun create(
        endpoint: String,
        params: LangfuseCreateParams = LangfuseCreateParams.none(),
    ): CompletableFuture<LangfuseCreateResponse> = create(endpoint, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LangfuseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfuseCreateResponse>

    /** @see [create] */
    fun create(params: LangfuseCreateParams): CompletableFuture<LangfuseCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LangfuseCreateResponse> =
        create(endpoint, LangfuseCreateParams.none(), requestOptions)

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    fun retrieve(endpoint: String): CompletableFuture<LangfuseRetrieveResponse> =
        retrieve(endpoint, LangfuseRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        endpoint: String,
        params: LangfuseRetrieveParams = LangfuseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfuseRetrieveResponse> =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        endpoint: String,
        params: LangfuseRetrieveParams = LangfuseRetrieveParams.none(),
    ): CompletableFuture<LangfuseRetrieveResponse> =
        retrieve(endpoint, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LangfuseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfuseRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: LangfuseRetrieveParams): CompletableFuture<LangfuseRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LangfuseRetrieveResponse> =
        retrieve(endpoint, LangfuseRetrieveParams.none(), requestOptions)

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    fun update(endpoint: String): CompletableFuture<LangfuseUpdateResponse> =
        update(endpoint, LangfuseUpdateParams.none())

    /** @see [update] */
    fun update(
        endpoint: String,
        params: LangfuseUpdateParams = LangfuseUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfuseUpdateResponse> =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [update] */
    fun update(
        endpoint: String,
        params: LangfuseUpdateParams = LangfuseUpdateParams.none(),
    ): CompletableFuture<LangfuseUpdateResponse> = update(endpoint, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LangfuseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfuseUpdateResponse>

    /** @see [update] */
    fun update(params: LangfuseUpdateParams): CompletableFuture<LangfuseUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LangfuseUpdateResponse> =
        update(endpoint, LangfuseUpdateParams.none(), requestOptions)

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    fun delete(endpoint: String): CompletableFuture<LangfuseDeleteResponse> =
        delete(endpoint, LangfuseDeleteParams.none())

    /** @see [delete] */
    fun delete(
        endpoint: String,
        params: LangfuseDeleteParams = LangfuseDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfuseDeleteResponse> =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        endpoint: String,
        params: LangfuseDeleteParams = LangfuseDeleteParams.none(),
    ): CompletableFuture<LangfuseDeleteResponse> = delete(endpoint, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: LangfuseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfuseDeleteResponse>

    /** @see [delete] */
    fun delete(params: LangfuseDeleteParams): CompletableFuture<LangfuseDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LangfuseDeleteResponse> =
        delete(endpoint, LangfuseDeleteParams.none(), requestOptions)

    /**
     * Call Langfuse via LLM proxy. Works with Langfuse SDK.
     *
     * [Docs](https://docs.hanzo.ai/docs/pass_through/langfuse)
     */
    fun patch(endpoint: String): CompletableFuture<LangfusePatchResponse> =
        patch(endpoint, LangfusePatchParams.none())

    /** @see [patch] */
    fun patch(
        endpoint: String,
        params: LangfusePatchParams = LangfusePatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfusePatchResponse> =
        patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [patch] */
    fun patch(
        endpoint: String,
        params: LangfusePatchParams = LangfusePatchParams.none(),
    ): CompletableFuture<LangfusePatchResponse> = patch(endpoint, params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: LangfusePatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LangfusePatchResponse>

    /** @see [patch] */
    fun patch(params: LangfusePatchParams): CompletableFuture<LangfusePatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LangfusePatchResponse> =
        patch(endpoint, LangfusePatchParams.none(), requestOptions)

    /**
     * A view of [LangfuseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LangfuseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseServiceAsync.create].
         */
        fun create(endpoint: String): CompletableFuture<HttpResponseFor<LangfuseCreateResponse>> =
            create(endpoint, LangfuseCreateParams.none())

        /** @see [create] */
        fun create(
            endpoint: String,
            params: LangfuseCreateParams = LangfuseCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseCreateResponse>> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [create] */
        fun create(
            endpoint: String,
            params: LangfuseCreateParams = LangfuseCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseCreateResponse>> =
            create(endpoint, params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: LangfuseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseCreateResponse>>

        /** @see [create] */
        fun create(
            params: LangfuseCreateParams
        ): CompletableFuture<HttpResponseFor<LangfuseCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LangfuseCreateResponse>> =
            create(endpoint, LangfuseCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseServiceAsync.retrieve].
         */
        fun retrieve(
            endpoint: String
        ): CompletableFuture<HttpResponseFor<LangfuseRetrieveResponse>> =
            retrieve(endpoint, LangfuseRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            endpoint: String,
            params: LangfuseRetrieveParams = LangfuseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseRetrieveResponse>> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            endpoint: String,
            params: LangfuseRetrieveParams = LangfuseRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseRetrieveResponse>> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: LangfuseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: LangfuseRetrieveParams
        ): CompletableFuture<HttpResponseFor<LangfuseRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LangfuseRetrieveResponse>> =
            retrieve(endpoint, LangfuseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /langfuse/{endpoint}`, but is otherwise the same as
         * [LangfuseServiceAsync.update].
         */
        fun update(endpoint: String): CompletableFuture<HttpResponseFor<LangfuseUpdateResponse>> =
            update(endpoint, LangfuseUpdateParams.none())

        /** @see [update] */
        fun update(
            endpoint: String,
            params: LangfuseUpdateParams = LangfuseUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseUpdateResponse>> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [update] */
        fun update(
            endpoint: String,
            params: LangfuseUpdateParams = LangfuseUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseUpdateResponse>> =
            update(endpoint, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: LangfuseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseUpdateResponse>>

        /** @see [update] */
        fun update(
            params: LangfuseUpdateParams
        ): CompletableFuture<HttpResponseFor<LangfuseUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LangfuseUpdateResponse>> =
            update(endpoint, LangfuseUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /langfuse/{endpoint}`, but is otherwise the same
         * as [LangfuseServiceAsync.delete].
         */
        fun delete(endpoint: String): CompletableFuture<HttpResponseFor<LangfuseDeleteResponse>> =
            delete(endpoint, LangfuseDeleteParams.none())

        /** @see [delete] */
        fun delete(
            endpoint: String,
            params: LangfuseDeleteParams = LangfuseDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseDeleteResponse>> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            endpoint: String,
            params: LangfuseDeleteParams = LangfuseDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseDeleteResponse>> =
            delete(endpoint, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: LangfuseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfuseDeleteResponse>>

        /** @see [delete] */
        fun delete(
            params: LangfuseDeleteParams
        ): CompletableFuture<HttpResponseFor<LangfuseDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LangfuseDeleteResponse>> =
            delete(endpoint, LangfuseDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /langfuse/{endpoint}`, but is otherwise the same
         * as [LangfuseServiceAsync.patch].
         */
        fun patch(endpoint: String): CompletableFuture<HttpResponseFor<LangfusePatchResponse>> =
            patch(endpoint, LangfusePatchParams.none())

        /** @see [patch] */
        fun patch(
            endpoint: String,
            params: LangfusePatchParams = LangfusePatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfusePatchResponse>> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [patch] */
        fun patch(
            endpoint: String,
            params: LangfusePatchParams = LangfusePatchParams.none(),
        ): CompletableFuture<HttpResponseFor<LangfusePatchResponse>> =
            patch(endpoint, params, RequestOptions.none())

        /** @see [patch] */
        fun patch(
            params: LangfusePatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LangfusePatchResponse>>

        /** @see [patch] */
        fun patch(
            params: LangfusePatchParams
        ): CompletableFuture<HttpResponseFor<LangfusePatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LangfusePatchResponse>> =
            patch(endpoint, LangfusePatchParams.none(), requestOptions)
    }
}
