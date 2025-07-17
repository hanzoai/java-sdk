// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.gemini.GeminiCreateParams
import ai.hanzo.api.models.gemini.GeminiCreateResponse
import ai.hanzo.api.models.gemini.GeminiDeleteParams
import ai.hanzo.api.models.gemini.GeminiDeleteResponse
import ai.hanzo.api.models.gemini.GeminiPatchParams
import ai.hanzo.api.models.gemini.GeminiPatchResponse
import ai.hanzo.api.models.gemini.GeminiRetrieveParams
import ai.hanzo.api.models.gemini.GeminiRetrieveResponse
import ai.hanzo.api.models.gemini.GeminiUpdateParams
import ai.hanzo.api.models.gemini.GeminiUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GeminiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeminiServiceAsync

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/google_ai_studio) */
    fun create(endpoint: String): CompletableFuture<GeminiCreateResponse> =
        create(endpoint, GeminiCreateParams.none())

    /** @see [create] */
    fun create(
        endpoint: String,
        params: GeminiCreateParams = GeminiCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiCreateResponse> =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [create] */
    fun create(
        endpoint: String,
        params: GeminiCreateParams = GeminiCreateParams.none(),
    ): CompletableFuture<GeminiCreateResponse> = create(endpoint, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: GeminiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiCreateResponse>

    /** @see [create] */
    fun create(params: GeminiCreateParams): CompletableFuture<GeminiCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeminiCreateResponse> =
        create(endpoint, GeminiCreateParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/google_ai_studio) */
    fun retrieve(endpoint: String): CompletableFuture<GeminiRetrieveResponse> =
        retrieve(endpoint, GeminiRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        endpoint: String,
        params: GeminiRetrieveParams = GeminiRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiRetrieveResponse> =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        endpoint: String,
        params: GeminiRetrieveParams = GeminiRetrieveParams.none(),
    ): CompletableFuture<GeminiRetrieveResponse> = retrieve(endpoint, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: GeminiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: GeminiRetrieveParams): CompletableFuture<GeminiRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeminiRetrieveResponse> =
        retrieve(endpoint, GeminiRetrieveParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/google_ai_studio) */
    fun update(endpoint: String): CompletableFuture<GeminiUpdateResponse> =
        update(endpoint, GeminiUpdateParams.none())

    /** @see [update] */
    fun update(
        endpoint: String,
        params: GeminiUpdateParams = GeminiUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiUpdateResponse> =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [update] */
    fun update(
        endpoint: String,
        params: GeminiUpdateParams = GeminiUpdateParams.none(),
    ): CompletableFuture<GeminiUpdateResponse> = update(endpoint, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: GeminiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiUpdateResponse>

    /** @see [update] */
    fun update(params: GeminiUpdateParams): CompletableFuture<GeminiUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeminiUpdateResponse> =
        update(endpoint, GeminiUpdateParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/google_ai_studio) */
    fun delete(endpoint: String): CompletableFuture<GeminiDeleteResponse> =
        delete(endpoint, GeminiDeleteParams.none())

    /** @see [delete] */
    fun delete(
        endpoint: String,
        params: GeminiDeleteParams = GeminiDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiDeleteResponse> =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        endpoint: String,
        params: GeminiDeleteParams = GeminiDeleteParams.none(),
    ): CompletableFuture<GeminiDeleteResponse> = delete(endpoint, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: GeminiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiDeleteResponse>

    /** @see [delete] */
    fun delete(params: GeminiDeleteParams): CompletableFuture<GeminiDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeminiDeleteResponse> =
        delete(endpoint, GeminiDeleteParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/google_ai_studio) */
    fun patch(endpoint: String): CompletableFuture<GeminiPatchResponse> =
        patch(endpoint, GeminiPatchParams.none())

    /** @see [patch] */
    fun patch(
        endpoint: String,
        params: GeminiPatchParams = GeminiPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiPatchResponse> =
        patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [patch] */
    fun patch(
        endpoint: String,
        params: GeminiPatchParams = GeminiPatchParams.none(),
    ): CompletableFuture<GeminiPatchResponse> = patch(endpoint, params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: GeminiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiPatchResponse>

    /** @see [patch] */
    fun patch(params: GeminiPatchParams): CompletableFuture<GeminiPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeminiPatchResponse> =
        patch(endpoint, GeminiPatchParams.none(), requestOptions)

    /**
     * A view of [GeminiServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GeminiServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.create].
         */
        fun create(endpoint: String): CompletableFuture<HttpResponseFor<GeminiCreateResponse>> =
            create(endpoint, GeminiCreateParams.none())

        /** @see [create] */
        fun create(
            endpoint: String,
            params: GeminiCreateParams = GeminiCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiCreateResponse>> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [create] */
        fun create(
            endpoint: String,
            params: GeminiCreateParams = GeminiCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<GeminiCreateResponse>> =
            create(endpoint, params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: GeminiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiCreateResponse>>

        /** @see [create] */
        fun create(
            params: GeminiCreateParams
        ): CompletableFuture<HttpResponseFor<GeminiCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeminiCreateResponse>> =
            create(endpoint, GeminiCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.retrieve].
         */
        fun retrieve(endpoint: String): CompletableFuture<HttpResponseFor<GeminiRetrieveResponse>> =
            retrieve(endpoint, GeminiRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            endpoint: String,
            params: GeminiRetrieveParams = GeminiRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiRetrieveResponse>> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            endpoint: String,
            params: GeminiRetrieveParams = GeminiRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<GeminiRetrieveResponse>> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: GeminiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: GeminiRetrieveParams
        ): CompletableFuture<HttpResponseFor<GeminiRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeminiRetrieveResponse>> =
            retrieve(endpoint, GeminiRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.update].
         */
        fun update(endpoint: String): CompletableFuture<HttpResponseFor<GeminiUpdateResponse>> =
            update(endpoint, GeminiUpdateParams.none())

        /** @see [update] */
        fun update(
            endpoint: String,
            params: GeminiUpdateParams = GeminiUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiUpdateResponse>> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [update] */
        fun update(
            endpoint: String,
            params: GeminiUpdateParams = GeminiUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<GeminiUpdateResponse>> =
            update(endpoint, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: GeminiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiUpdateResponse>>

        /** @see [update] */
        fun update(
            params: GeminiUpdateParams
        ): CompletableFuture<HttpResponseFor<GeminiUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeminiUpdateResponse>> =
            update(endpoint, GeminiUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.delete].
         */
        fun delete(endpoint: String): CompletableFuture<HttpResponseFor<GeminiDeleteResponse>> =
            delete(endpoint, GeminiDeleteParams.none())

        /** @see [delete] */
        fun delete(
            endpoint: String,
            params: GeminiDeleteParams = GeminiDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiDeleteResponse>> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            endpoint: String,
            params: GeminiDeleteParams = GeminiDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<GeminiDeleteResponse>> =
            delete(endpoint, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: GeminiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiDeleteResponse>>

        /** @see [delete] */
        fun delete(
            params: GeminiDeleteParams
        ): CompletableFuture<HttpResponseFor<GeminiDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeminiDeleteResponse>> =
            delete(endpoint, GeminiDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.patch].
         */
        fun patch(endpoint: String): CompletableFuture<HttpResponseFor<GeminiPatchResponse>> =
            patch(endpoint, GeminiPatchParams.none())

        /** @see [patch] */
        fun patch(
            endpoint: String,
            params: GeminiPatchParams = GeminiPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiPatchResponse>> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [patch] */
        fun patch(
            endpoint: String,
            params: GeminiPatchParams = GeminiPatchParams.none(),
        ): CompletableFuture<HttpResponseFor<GeminiPatchResponse>> =
            patch(endpoint, params, RequestOptions.none())

        /** @see [patch] */
        fun patch(
            params: GeminiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiPatchResponse>>

        /** @see [patch] */
        fun patch(
            params: GeminiPatchParams
        ): CompletableFuture<HttpResponseFor<GeminiPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeminiPatchResponse>> =
            patch(endpoint, GeminiPatchParams.none(), requestOptions)
    }
}
