// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AssemblyaiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssemblyaiService

    /** Assemblyai Proxy Route */
    fun create(endpoint: String): AssemblyaiCreateResponse =
        create(endpoint, AssemblyaiCreateParams.none())

    /** @see create */
    fun create(
        endpoint: String,
        params: AssemblyaiCreateParams = AssemblyaiCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiCreateResponse =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    fun create(
        endpoint: String,
        params: AssemblyaiCreateParams = AssemblyaiCreateParams.none(),
    ): AssemblyaiCreateResponse = create(endpoint, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AssemblyaiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiCreateResponse

    /** @see create */
    fun create(params: AssemblyaiCreateParams): AssemblyaiCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(endpoint: String, requestOptions: RequestOptions): AssemblyaiCreateResponse =
        create(endpoint, AssemblyaiCreateParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun retrieve(endpoint: String): AssemblyaiRetrieveResponse =
        retrieve(endpoint, AssemblyaiRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        params: AssemblyaiRetrieveParams = AssemblyaiRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiRetrieveResponse =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        params: AssemblyaiRetrieveParams = AssemblyaiRetrieveParams.none(),
    ): AssemblyaiRetrieveResponse = retrieve(endpoint, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AssemblyaiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AssemblyaiRetrieveParams): AssemblyaiRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(endpoint: String, requestOptions: RequestOptions): AssemblyaiRetrieveResponse =
        retrieve(endpoint, AssemblyaiRetrieveParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun update(endpoint: String): AssemblyaiUpdateResponse =
        update(endpoint, AssemblyaiUpdateParams.none())

    /** @see update */
    fun update(
        endpoint: String,
        params: AssemblyaiUpdateParams = AssemblyaiUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiUpdateResponse =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    fun update(
        endpoint: String,
        params: AssemblyaiUpdateParams = AssemblyaiUpdateParams.none(),
    ): AssemblyaiUpdateResponse = update(endpoint, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AssemblyaiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiUpdateResponse

    /** @see update */
    fun update(params: AssemblyaiUpdateParams): AssemblyaiUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(endpoint: String, requestOptions: RequestOptions): AssemblyaiUpdateResponse =
        update(endpoint, AssemblyaiUpdateParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun delete(endpoint: String): AssemblyaiDeleteResponse =
        delete(endpoint, AssemblyaiDeleteParams.none())

    /** @see delete */
    fun delete(
        endpoint: String,
        params: AssemblyaiDeleteParams = AssemblyaiDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiDeleteResponse =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    fun delete(
        endpoint: String,
        params: AssemblyaiDeleteParams = AssemblyaiDeleteParams.none(),
    ): AssemblyaiDeleteResponse = delete(endpoint, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssemblyaiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiDeleteResponse

    /** @see delete */
    fun delete(params: AssemblyaiDeleteParams): AssemblyaiDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(endpoint: String, requestOptions: RequestOptions): AssemblyaiDeleteResponse =
        delete(endpoint, AssemblyaiDeleteParams.none(), requestOptions)

    /** Assemblyai Proxy Route */
    fun patch(endpoint: String): AssemblyaiPatchResponse =
        patch(endpoint, AssemblyaiPatchParams.none())

    /** @see patch */
    fun patch(
        endpoint: String,
        params: AssemblyaiPatchParams = AssemblyaiPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiPatchResponse =
        patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see patch */
    fun patch(
        endpoint: String,
        params: AssemblyaiPatchParams = AssemblyaiPatchParams.none(),
    ): AssemblyaiPatchResponse = patch(endpoint, params, RequestOptions.none())

    /** @see patch */
    fun patch(
        params: AssemblyaiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiPatchResponse

    /** @see patch */
    fun patch(params: AssemblyaiPatchParams): AssemblyaiPatchResponse =
        patch(params, RequestOptions.none())

    /** @see patch */
    fun patch(endpoint: String, requestOptions: RequestOptions): AssemblyaiPatchResponse =
        patch(endpoint, AssemblyaiPatchParams.none(), requestOptions)

    /** A view of [AssemblyaiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssemblyaiService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiService.create].
         */
        @MustBeClosed
        fun create(endpoint: String): HttpResponseFor<AssemblyaiCreateResponse> =
            create(endpoint, AssemblyaiCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: AssemblyaiCreateParams = AssemblyaiCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiCreateResponse> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: AssemblyaiCreateParams = AssemblyaiCreateParams.none(),
        ): HttpResponseFor<AssemblyaiCreateResponse> =
            create(endpoint, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AssemblyaiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: AssemblyaiCreateParams): HttpResponseFor<AssemblyaiCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiCreateResponse> =
            create(endpoint, AssemblyaiCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiService.retrieve].
         */
        @MustBeClosed
        fun retrieve(endpoint: String): HttpResponseFor<AssemblyaiRetrieveResponse> =
            retrieve(endpoint, AssemblyaiRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: AssemblyaiRetrieveParams = AssemblyaiRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiRetrieveResponse> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: AssemblyaiRetrieveParams = AssemblyaiRetrieveParams.none(),
        ): HttpResponseFor<AssemblyaiRetrieveResponse> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AssemblyaiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AssemblyaiRetrieveParams
        ): HttpResponseFor<AssemblyaiRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiRetrieveResponse> =
            retrieve(endpoint, AssemblyaiRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiService.update].
         */
        @MustBeClosed
        fun update(endpoint: String): HttpResponseFor<AssemblyaiUpdateResponse> =
            update(endpoint, AssemblyaiUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: AssemblyaiUpdateParams = AssemblyaiUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiUpdateResponse> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: AssemblyaiUpdateParams = AssemblyaiUpdateParams.none(),
        ): HttpResponseFor<AssemblyaiUpdateResponse> =
            update(endpoint, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AssemblyaiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: AssemblyaiUpdateParams): HttpResponseFor<AssemblyaiUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiUpdateResponse> =
            update(endpoint, AssemblyaiUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /assemblyai/{endpoint}`, but is otherwise the
         * same as [AssemblyaiService.delete].
         */
        @MustBeClosed
        fun delete(endpoint: String): HttpResponseFor<AssemblyaiDeleteResponse> =
            delete(endpoint, AssemblyaiDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: AssemblyaiDeleteParams = AssemblyaiDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiDeleteResponse> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: AssemblyaiDeleteParams = AssemblyaiDeleteParams.none(),
        ): HttpResponseFor<AssemblyaiDeleteResponse> =
            delete(endpoint, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AssemblyaiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: AssemblyaiDeleteParams): HttpResponseFor<AssemblyaiDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiDeleteResponse> =
            delete(endpoint, AssemblyaiDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiService.patch].
         */
        @MustBeClosed
        fun patch(endpoint: String): HttpResponseFor<AssemblyaiPatchResponse> =
            patch(endpoint, AssemblyaiPatchParams.none())

        /** @see patch */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: AssemblyaiPatchParams = AssemblyaiPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiPatchResponse> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see patch */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: AssemblyaiPatchParams = AssemblyaiPatchParams.none(),
        ): HttpResponseFor<AssemblyaiPatchResponse> = patch(endpoint, params, RequestOptions.none())

        /** @see patch */
        @MustBeClosed
        fun patch(
            params: AssemblyaiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiPatchResponse>

        /** @see patch */
        @MustBeClosed
        fun patch(params: AssemblyaiPatchParams): HttpResponseFor<AssemblyaiPatchResponse> =
            patch(params, RequestOptions.none())

        /** @see patch */
        @MustBeClosed
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssemblyaiPatchResponse> =
            patch(endpoint, AssemblyaiPatchParams.none(), requestOptions)
    }
}
