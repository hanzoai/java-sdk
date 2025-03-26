// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.azure.AzureCallParams
import com.hanzo_ai.api.models.azure.AzureCallResponse
import com.hanzo_ai.api.models.azure.AzureCreateParams
import com.hanzo_ai.api.models.azure.AzureCreateResponse
import com.hanzo_ai.api.models.azure.AzureDeleteParams
import com.hanzo_ai.api.models.azure.AzureDeleteResponse
import com.hanzo_ai.api.models.azure.AzurePatchParams
import com.hanzo_ai.api.models.azure.AzurePatchResponse
import com.hanzo_ai.api.models.azure.AzureUpdateParams
import com.hanzo_ai.api.models.azure.AzureUpdateResponse
import java.util.concurrent.CompletableFuture

interface AzureServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    fun create(params: AzureCreateParams): CompletableFuture<AzureCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AzureCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzureCreateResponse>

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    fun update(params: AzureUpdateParams): CompletableFuture<AzureUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AzureUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzureUpdateResponse>

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    fun delete(params: AzureDeleteParams): CompletableFuture<AzureDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AzureDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzureDeleteResponse>

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    fun call(params: AzureCallParams): CompletableFuture<AzureCallResponse> =
        call(params, RequestOptions.none())

    /** @see [call] */
    fun call(
        params: AzureCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzureCallResponse>

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    fun patch(params: AzurePatchParams): CompletableFuture<AzurePatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: AzurePatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzurePatchResponse>

    /** A view of [AzureServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: AzureCreateParams
        ): CompletableFuture<HttpResponseFor<AzureCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AzureCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzureCreateResponse>>

        /**
         * Returns a raw HTTP response for `put /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: AzureUpdateParams
        ): CompletableFuture<HttpResponseFor<AzureUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AzureUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzureUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: AzureDeleteParams
        ): CompletableFuture<HttpResponseFor<AzureDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AzureDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzureDeleteResponse>>

        /**
         * Returns a raw HTTP response for `get /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.call].
         */
        @MustBeClosed
        fun call(params: AzureCallParams): CompletableFuture<HttpResponseFor<AzureCallResponse>> =
            call(params, RequestOptions.none())

        /** @see [call] */
        @MustBeClosed
        fun call(
            params: AzureCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzureCallResponse>>

        /**
         * Returns a raw HTTP response for `patch /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.patch].
         */
        @MustBeClosed
        fun patch(
            params: AzurePatchParams
        ): CompletableFuture<HttpResponseFor<AzurePatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: AzurePatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzurePatchResponse>>
    }
}
