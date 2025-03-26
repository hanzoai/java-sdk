// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.assemblyai.AssemblyaiCreateParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiCreateResponse
import com.hanzo_ai.api.models.assemblyai.AssemblyaiDeleteParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiDeleteResponse
import com.hanzo_ai.api.models.assemblyai.AssemblyaiPatchParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiPatchResponse
import com.hanzo_ai.api.models.assemblyai.AssemblyaiRetrieveParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiRetrieveResponse
import com.hanzo_ai.api.models.assemblyai.AssemblyaiUpdateParams
import com.hanzo_ai.api.models.assemblyai.AssemblyaiUpdateResponse
import java.util.concurrent.CompletableFuture

interface AssemblyaiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Assemblyai Proxy Route */
    fun create(params: AssemblyaiCreateParams): CompletableFuture<AssemblyaiCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AssemblyaiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiCreateResponse>

    /** Assemblyai Proxy Route */
    fun retrieve(params: AssemblyaiRetrieveParams): CompletableFuture<AssemblyaiRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AssemblyaiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiRetrieveResponse>

    /** Assemblyai Proxy Route */
    fun update(params: AssemblyaiUpdateParams): CompletableFuture<AssemblyaiUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AssemblyaiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiUpdateResponse>

    /** Assemblyai Proxy Route */
    fun delete(params: AssemblyaiDeleteParams): CompletableFuture<AssemblyaiDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AssemblyaiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiDeleteResponse>

    /** Assemblyai Proxy Route */
    fun patch(params: AssemblyaiPatchParams): CompletableFuture<AssemblyaiPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: AssemblyaiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssemblyaiPatchResponse>

    /**
     * A view of [AssemblyaiServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: AssemblyaiCreateParams
        ): CompletableFuture<HttpResponseFor<AssemblyaiCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AssemblyaiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AssemblyaiRetrieveParams
        ): CompletableFuture<HttpResponseFor<AssemblyaiRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AssemblyaiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: AssemblyaiUpdateParams
        ): CompletableFuture<HttpResponseFor<AssemblyaiUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AssemblyaiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /assemblyai/{endpoint}`, but is otherwise the
         * same as [AssemblyaiServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: AssemblyaiDeleteParams
        ): CompletableFuture<HttpResponseFor<AssemblyaiDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AssemblyaiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiDeleteResponse>>

        /**
         * Returns a raw HTTP response for `patch /assemblyai/{endpoint}`, but is otherwise the same
         * as [AssemblyaiServiceAsync.patch].
         */
        @MustBeClosed
        fun patch(
            params: AssemblyaiPatchParams
        ): CompletableFuture<HttpResponseFor<AssemblyaiPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: AssemblyaiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssemblyaiPatchResponse>>
    }
}
