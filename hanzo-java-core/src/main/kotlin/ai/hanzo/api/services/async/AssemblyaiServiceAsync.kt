// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.assemblyai.AssemblyaiCreateParams
import ai.hanzo.api.models.assemblyai.AssemblyaiCreateResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiDeleteParams
import ai.hanzo.api.models.assemblyai.AssemblyaiDeleteResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiPatchParams
import ai.hanzo.api.models.assemblyai.AssemblyaiPatchResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiRetrieveParams
import ai.hanzo.api.models.assemblyai.AssemblyaiRetrieveResponse
import ai.hanzo.api.models.assemblyai.AssemblyaiUpdateParams
import ai.hanzo.api.models.assemblyai.AssemblyaiUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AssemblyaiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssemblyaiServiceAsync

    /** Assemblyai Proxy Route */
    fun create(endpoint: String): CompletableFuture<AssemblyaiCreateResponse> =
        create(endpoint, AssemblyaiCreateParams.none())

    /** @see create */
    fun create(
        endpoint: String,
        params: AssemblyaiCreateParams = AssemblyaiCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiCreateResponse> =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    fun create(
        endpoint: String,
        params: AssemblyaiCreateParams = AssemblyaiCreateParams.none(),
    ): CompletableFuture<AssemblyaiCreateResponse> = create(endpoint, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AssemblyaiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiCreateResponse>

    /** @see create */
    fun create(params: AssemblyaiCreateParams): CompletableFuture<AssemblyaiCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssemblyaiCreateResponse> =
        create(endpoint, AssemblyaiCreateParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun retrieve(endpoint: String): CompletableFuture<AssemblyaiRetrieveResponse> =
        retrieve(endpoint, AssemblyaiRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        params: AssemblyaiRetrieveParams = AssemblyaiRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiRetrieveResponse> =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        params: AssemblyaiRetrieveParams = AssemblyaiRetrieveParams.none(),
    ): CompletableFuture<AssemblyaiRetrieveResponse> =
        retrieve(endpoint, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AssemblyaiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AssemblyaiRetrieveParams): CompletableFuture<AssemblyaiRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssemblyaiRetrieveResponse> =
        retrieve(endpoint, AssemblyaiRetrieveParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun update(endpoint: String): CompletableFuture<AssemblyaiUpdateResponse> =
        update(endpoint, AssemblyaiUpdateParams.none())

    /** @see update */
    fun update(
        endpoint: String,
        params: AssemblyaiUpdateParams = AssemblyaiUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiUpdateResponse> =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    fun update(
        endpoint: String,
        params: AssemblyaiUpdateParams = AssemblyaiUpdateParams.none(),
    ): CompletableFuture<AssemblyaiUpdateResponse> = update(endpoint, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AssemblyaiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiUpdateResponse>

    /** @see update */
    fun update(params: AssemblyaiUpdateParams): CompletableFuture<AssemblyaiUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssemblyaiUpdateResponse> =
        update(endpoint, AssemblyaiUpdateParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun delete(endpoint: String): CompletableFuture<AssemblyaiDeleteResponse> =
        delete(endpoint, AssemblyaiDeleteParams.none())

    /** @see delete */
    fun delete(
        endpoint: String,
        params: AssemblyaiDeleteParams = AssemblyaiDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiDeleteResponse> =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    fun delete(
        endpoint: String,
        params: AssemblyaiDeleteParams = AssemblyaiDeleteParams.none(),
    ): CompletableFuture<AssemblyaiDeleteResponse> = delete(endpoint, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssemblyaiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiDeleteResponse>

    /** @see delete */
    fun delete(params: AssemblyaiDeleteParams): CompletableFuture<AssemblyaiDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssemblyaiDeleteResponse> =
        delete(endpoint, AssemblyaiDeleteParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun patch(endpoint: String): CompletableFuture<AssemblyaiPatchResponse> =
        patch(endpoint, AssemblyaiPatchParams.none())

    /** @see patch */
    fun patch(
        endpoint: String,
        params: AssemblyaiPatchParams = AssemblyaiPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiPatchResponse> =
        patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see patch */
    fun patch(
        endpoint: String,
        params: AssemblyaiPatchParams = AssemblyaiPatchParams.none(),
    ): CompletableFuture<AssemblyaiPatchResponse> = patch(endpoint, params, RequestOptions.none())

    /** @see patch */
    fun patch(
        params: AssemblyaiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiPatchResponse>

    /** @see patch */
    fun patch(params: AssemblyaiPatchParams): CompletableFuture<AssemblyaiPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see patch */
    fun patch(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssemblyaiPatchResponse> =
        patch(endpoint, AssemblyaiPatchParams.none(), requestOptions)

    /**
     * A view of [AssemblyaiServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssemblyaiServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.create].
         */
        fun create(endpoint: String): CompletableFuture<HttpResponseFor<AssemblyaiCreateResponse>> =
            create(endpoint, AssemblyaiCreateParams.none())

        /** @see create */
        fun create(
            endpoint: String,
            params: AssemblyaiCreateParams = AssemblyaiCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiCreateResponse>> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        fun create(
            endpoint: String,
            params: AssemblyaiCreateParams = AssemblyaiCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiCreateResponse>> =
            create(endpoint, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AssemblyaiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiCreateResponse>>

        /** @see create */
        fun create(
            params: AssemblyaiCreateParams
        ): CompletableFuture<HttpResponseFor<AssemblyaiCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssemblyaiCreateResponse>> =
            create(endpoint, AssemblyaiCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.retrieve].
         */
        fun retrieve(
            endpoint: String
        ): CompletableFuture<HttpResponseFor<AssemblyaiRetrieveResponse>> =
            retrieve(endpoint, AssemblyaiRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            params: AssemblyaiRetrieveParams = AssemblyaiRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiRetrieveResponse>> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            params: AssemblyaiRetrieveParams = AssemblyaiRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiRetrieveResponse>> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AssemblyaiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AssemblyaiRetrieveParams
        ): CompletableFuture<HttpResponseFor<AssemblyaiRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssemblyaiRetrieveResponse>> =
            retrieve(endpoint, AssemblyaiRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.update].
         */
        fun update(endpoint: String): CompletableFuture<HttpResponseFor<AssemblyaiUpdateResponse>> =
            update(endpoint, AssemblyaiUpdateParams.none())

        /** @see update */
        fun update(
            endpoint: String,
            params: AssemblyaiUpdateParams = AssemblyaiUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiUpdateResponse>> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        fun update(
            endpoint: String,
            params: AssemblyaiUpdateParams = AssemblyaiUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiUpdateResponse>> =
            update(endpoint, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AssemblyaiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiUpdateResponse>>

        /** @see update */
        fun update(
            params: AssemblyaiUpdateParams
        ): CompletableFuture<HttpResponseFor<AssemblyaiUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssemblyaiUpdateResponse>> =
            update(endpoint, AssemblyaiUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /assemblyai/{endpoint}`, but is otherwise the
         * same as [AssemblyaiServiceAsync.delete].
         */
        fun delete(endpoint: String): CompletableFuture<HttpResponseFor<AssemblyaiDeleteResponse>> =
            delete(endpoint, AssemblyaiDeleteParams.none())

        /** @see delete */
        fun delete(
            endpoint: String,
            params: AssemblyaiDeleteParams = AssemblyaiDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiDeleteResponse>> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        fun delete(
            endpoint: String,
            params: AssemblyaiDeleteParams = AssemblyaiDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiDeleteResponse>> =
            delete(endpoint, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AssemblyaiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiDeleteResponse>>

        /** @see delete */
        fun delete(
            params: AssemblyaiDeleteParams
        ): CompletableFuture<HttpResponseFor<AssemblyaiDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssemblyaiDeleteResponse>> =
            delete(endpoint, AssemblyaiDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.patch].
         */
        fun patch(endpoint: String): CompletableFuture<HttpResponseFor<AssemblyaiPatchResponse>> =
            patch(endpoint, AssemblyaiPatchParams.none())

        /** @see patch */
        fun patch(
            endpoint: String,
            params: AssemblyaiPatchParams = AssemblyaiPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiPatchResponse>> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see patch */
        fun patch(
            endpoint: String,
            params: AssemblyaiPatchParams = AssemblyaiPatchParams.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiPatchResponse>> =
            patch(endpoint, params, RequestOptions.none())

        /** @see patch */
        fun patch(
            params: AssemblyaiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiPatchResponse>>

        /** @see patch */
        fun patch(
            params: AssemblyaiPatchParams
        ): CompletableFuture<HttpResponseFor<AssemblyaiPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see patch */
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssemblyaiPatchResponse>> =
            patch(endpoint, AssemblyaiPatchParams.none(), requestOptions)
    }
}
