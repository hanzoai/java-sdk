// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiCreateParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiCreateResponse
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiDeleteParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiDeleteResponse
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiPatchParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiPatchResponse
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiRetrieveParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiRetrieveResponse
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiUpdateParams
import ai.hanzo.api.models.euassemblyai.EuAssemblyaiUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface EuAssemblyaiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Assemblyai Proxy Route */
    fun create(endpoint: String): CompletableFuture<EuAssemblyaiCreateResponse> =
        create(endpoint, EuAssemblyaiCreateParams.none())

    /** @see [create] */
    fun create(
        endpoint: String,
        params: EuAssemblyaiCreateParams = EuAssemblyaiCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiCreateResponse> =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [create] */
    fun create(
        endpoint: String,
        params: EuAssemblyaiCreateParams = EuAssemblyaiCreateParams.none(),
    ): CompletableFuture<EuAssemblyaiCreateResponse> =
        create(endpoint, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: EuAssemblyaiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiCreateResponse>

    /** @see [create] */
    fun create(params: EuAssemblyaiCreateParams): CompletableFuture<EuAssemblyaiCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EuAssemblyaiCreateResponse> =
        create(endpoint, EuAssemblyaiCreateParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun retrieve(endpoint: String): CompletableFuture<EuAssemblyaiRetrieveResponse> =
        retrieve(endpoint, EuAssemblyaiRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        endpoint: String,
        params: EuAssemblyaiRetrieveParams = EuAssemblyaiRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiRetrieveResponse> =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        endpoint: String,
        params: EuAssemblyaiRetrieveParams = EuAssemblyaiRetrieveParams.none(),
    ): CompletableFuture<EuAssemblyaiRetrieveResponse> =
        retrieve(endpoint, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EuAssemblyaiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: EuAssemblyaiRetrieveParams
    ): CompletableFuture<EuAssemblyaiRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EuAssemblyaiRetrieveResponse> =
        retrieve(endpoint, EuAssemblyaiRetrieveParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun update(endpoint: String): CompletableFuture<EuAssemblyaiUpdateResponse> =
        update(endpoint, EuAssemblyaiUpdateParams.none())

    /** @see [update] */
    fun update(
        endpoint: String,
        params: EuAssemblyaiUpdateParams = EuAssemblyaiUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiUpdateResponse> =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [update] */
    fun update(
        endpoint: String,
        params: EuAssemblyaiUpdateParams = EuAssemblyaiUpdateParams.none(),
    ): CompletableFuture<EuAssemblyaiUpdateResponse> =
        update(endpoint, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: EuAssemblyaiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiUpdateResponse>

    /** @see [update] */
    fun update(params: EuAssemblyaiUpdateParams): CompletableFuture<EuAssemblyaiUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EuAssemblyaiUpdateResponse> =
        update(endpoint, EuAssemblyaiUpdateParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun delete(endpoint: String): CompletableFuture<EuAssemblyaiDeleteResponse> =
        delete(endpoint, EuAssemblyaiDeleteParams.none())

    /** @see [delete] */
    fun delete(
        endpoint: String,
        params: EuAssemblyaiDeleteParams = EuAssemblyaiDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiDeleteResponse> =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        endpoint: String,
        params: EuAssemblyaiDeleteParams = EuAssemblyaiDeleteParams.none(),
    ): CompletableFuture<EuAssemblyaiDeleteResponse> =
        delete(endpoint, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: EuAssemblyaiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiDeleteResponse>

    /** @see [delete] */
    fun delete(params: EuAssemblyaiDeleteParams): CompletableFuture<EuAssemblyaiDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EuAssemblyaiDeleteResponse> =
        delete(endpoint, EuAssemblyaiDeleteParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun patch(endpoint: String): CompletableFuture<EuAssemblyaiPatchResponse> =
        patch(endpoint, EuAssemblyaiPatchParams.none())

    /** @see [patch] */
    fun patch(
        endpoint: String,
        params: EuAssemblyaiPatchParams = EuAssemblyaiPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiPatchResponse> =
        patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [patch] */
    fun patch(
        endpoint: String,
        params: EuAssemblyaiPatchParams = EuAssemblyaiPatchParams.none(),
    ): CompletableFuture<EuAssemblyaiPatchResponse> = patch(endpoint, params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: EuAssemblyaiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiPatchResponse>

    /** @see [patch] */
    fun patch(params: EuAssemblyaiPatchParams): CompletableFuture<EuAssemblyaiPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EuAssemblyaiPatchResponse> =
        patch(endpoint, EuAssemblyaiPatchParams.none(), requestOptions)

    /**
     * A view of [EuAssemblyaiServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            endpoint: String
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiCreateResponse>> =
            create(endpoint, EuAssemblyaiCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: EuAssemblyaiCreateParams = EuAssemblyaiCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiCreateResponse>> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: EuAssemblyaiCreateParams = EuAssemblyaiCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiCreateResponse>> =
            create(endpoint, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EuAssemblyaiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EuAssemblyaiCreateParams
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiCreateResponse>> =
            create(endpoint, EuAssemblyaiCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            endpoint: String
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiRetrieveResponse>> =
            retrieve(endpoint, EuAssemblyaiRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: EuAssemblyaiRetrieveParams = EuAssemblyaiRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiRetrieveResponse>> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: EuAssemblyaiRetrieveParams = EuAssemblyaiRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiRetrieveResponse>> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EuAssemblyaiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EuAssemblyaiRetrieveParams
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiRetrieveResponse>> =
            retrieve(endpoint, EuAssemblyaiRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            endpoint: String
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiUpdateResponse>> =
            update(endpoint, EuAssemblyaiUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: EuAssemblyaiUpdateParams = EuAssemblyaiUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiUpdateResponse>> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: EuAssemblyaiUpdateParams = EuAssemblyaiUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiUpdateResponse>> =
            update(endpoint, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: EuAssemblyaiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiUpdateResponse>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: EuAssemblyaiUpdateParams
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiUpdateResponse>> =
            update(endpoint, EuAssemblyaiUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            endpoint: String
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiDeleteResponse>> =
            delete(endpoint, EuAssemblyaiDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: EuAssemblyaiDeleteParams = EuAssemblyaiDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiDeleteResponse>> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: EuAssemblyaiDeleteParams = EuAssemblyaiDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiDeleteResponse>> =
            delete(endpoint, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: EuAssemblyaiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiDeleteResponse>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: EuAssemblyaiDeleteParams
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiDeleteResponse>> =
            delete(endpoint, EuAssemblyaiDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.patch].
         */
        @MustBeClosed
        fun patch(endpoint: String): CompletableFuture<HttpResponseFor<EuAssemblyaiPatchResponse>> =
            patch(endpoint, EuAssemblyaiPatchParams.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: EuAssemblyaiPatchParams = EuAssemblyaiPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiPatchResponse>> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: EuAssemblyaiPatchParams = EuAssemblyaiPatchParams.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiPatchResponse>> =
            patch(endpoint, params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: EuAssemblyaiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiPatchResponse>>

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: EuAssemblyaiPatchParams
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiPatchResponse>> =
            patch(endpoint, EuAssemblyaiPatchParams.none(), requestOptions)
    }
}
