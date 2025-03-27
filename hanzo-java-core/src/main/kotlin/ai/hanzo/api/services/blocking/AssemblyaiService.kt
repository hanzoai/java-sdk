// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

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

interface AssemblyaiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Assemblyai Proxy Route */
    fun create(params: AssemblyaiCreateParams): AssemblyaiCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AssemblyaiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiCreateResponse

    /** Assemblyai Proxy Route */
    fun retrieve(params: AssemblyaiRetrieveParams): AssemblyaiRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AssemblyaiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiRetrieveResponse

    /** Assemblyai Proxy Route */
    fun update(params: AssemblyaiUpdateParams): AssemblyaiUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AssemblyaiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiUpdateResponse

    /** Assemblyai Proxy Route */
    fun delete(params: AssemblyaiDeleteParams): AssemblyaiDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AssemblyaiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiDeleteResponse

    /** Assemblyai Proxy Route */
    fun patch(params: AssemblyaiPatchParams): AssemblyaiPatchResponse =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: AssemblyaiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssemblyaiPatchResponse

    /** A view of [AssemblyaiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiService.create].
         */
        @MustBeClosed
        fun create(params: AssemblyaiCreateParams): HttpResponseFor<AssemblyaiCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AssemblyaiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiCreateResponse>

        /**
         * Returns a raw HTTP response for `get /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AssemblyaiRetrieveParams
        ): HttpResponseFor<AssemblyaiRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AssemblyaiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiService.update].
         */
        @MustBeClosed
        fun update(params: AssemblyaiUpdateParams): HttpResponseFor<AssemblyaiUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AssemblyaiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /assemblyai/{endpoint}`, but is otherwise the
         * same as [AssemblyaiService.delete].
         */
        @MustBeClosed
        fun delete(params: AssemblyaiDeleteParams): HttpResponseFor<AssemblyaiDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AssemblyaiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiService.patch].
         */
        @MustBeClosed
        fun patch(params: AssemblyaiPatchParams): HttpResponseFor<AssemblyaiPatchResponse> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: AssemblyaiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssemblyaiPatchResponse>
    }
}
