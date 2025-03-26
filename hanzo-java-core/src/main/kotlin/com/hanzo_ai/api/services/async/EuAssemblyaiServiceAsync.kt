// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiCreateParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiCreateResponse
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiDeleteParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiDeleteResponse
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiPatchParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiPatchResponse
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiRetrieveParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiRetrieveResponse
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiUpdateParams
import com.hanzo_ai.api.models.euassemblyai.EuAssemblyaiUpdateResponse
import java.util.concurrent.CompletableFuture

interface EuAssemblyaiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Assemblyai Proxy Route */
    fun create(params: EuAssemblyaiCreateParams): CompletableFuture<EuAssemblyaiCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: EuAssemblyaiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiCreateResponse>

    /** Assemblyai Proxy Route */
    fun retrieve(
        params: EuAssemblyaiRetrieveParams
    ): CompletableFuture<EuAssemblyaiRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EuAssemblyaiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiRetrieveResponse>

    /** Assemblyai Proxy Route */
    fun update(params: EuAssemblyaiUpdateParams): CompletableFuture<EuAssemblyaiUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: EuAssemblyaiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiUpdateResponse>

    /** Assemblyai Proxy Route */
    fun delete(params: EuAssemblyaiDeleteParams): CompletableFuture<EuAssemblyaiDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: EuAssemblyaiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiDeleteResponse>

    /** Assemblyai Proxy Route */
    fun patch(params: EuAssemblyaiPatchParams): CompletableFuture<EuAssemblyaiPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: EuAssemblyaiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EuAssemblyaiPatchResponse>

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
            params: EuAssemblyaiCreateParams
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EuAssemblyaiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: EuAssemblyaiRetrieveParams
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EuAssemblyaiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: EuAssemblyaiUpdateParams
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: EuAssemblyaiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: EuAssemblyaiDeleteParams
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: EuAssemblyaiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiDeleteResponse>>

        /**
         * Returns a raw HTTP response for `patch /eu.assemblyai/{endpoint}`, but is otherwise the
         * same as [EuAssemblyaiServiceAsync.patch].
         */
        @MustBeClosed
        fun patch(
            params: EuAssemblyaiPatchParams
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: EuAssemblyaiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EuAssemblyaiPatchResponse>>
    }
}
