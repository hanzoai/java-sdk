// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.azure.AzureCallParams
import ai.hanzo.api.models.azure.AzureCallResponse
import ai.hanzo.api.models.azure.AzureCreateParams
import ai.hanzo.api.models.azure.AzureCreateResponse
import ai.hanzo.api.models.azure.AzureDeleteParams
import ai.hanzo.api.models.azure.AzureDeleteResponse
import ai.hanzo.api.models.azure.AzurePatchParams
import ai.hanzo.api.models.azure.AzurePatchResponse
import ai.hanzo.api.models.azure.AzureUpdateParams
import ai.hanzo.api.models.azure.AzureUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
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
    fun create(endpoint: String): CompletableFuture<AzureCreateResponse> =
        create(endpoint, AzureCreateParams.none())

    /** @see [create] */
    fun create(
        endpoint: String,
        params: AzureCreateParams = AzureCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzureCreateResponse> =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [create] */
    fun create(
        endpoint: String,
        params: AzureCreateParams = AzureCreateParams.none(),
    ): CompletableFuture<AzureCreateResponse> = create(endpoint, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AzureCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzureCreateResponse>

    /** @see [create] */
    fun create(params: AzureCreateParams): CompletableFuture<AzureCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AzureCreateResponse> =
        create(endpoint, AzureCreateParams.none(), requestOptions)

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    fun update(endpoint: String): CompletableFuture<AzureUpdateResponse> =
        update(endpoint, AzureUpdateParams.none())

    /** @see [update] */
    fun update(
        endpoint: String,
        params: AzureUpdateParams = AzureUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzureUpdateResponse> =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [update] */
    fun update(
        endpoint: String,
        params: AzureUpdateParams = AzureUpdateParams.none(),
    ): CompletableFuture<AzureUpdateResponse> = update(endpoint, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AzureUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzureUpdateResponse>

    /** @see [update] */
    fun update(params: AzureUpdateParams): CompletableFuture<AzureUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AzureUpdateResponse> =
        update(endpoint, AzureUpdateParams.none(), requestOptions)

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    fun delete(endpoint: String): CompletableFuture<AzureDeleteResponse> =
        delete(endpoint, AzureDeleteParams.none())

    /** @see [delete] */
    fun delete(
        endpoint: String,
        params: AzureDeleteParams = AzureDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzureDeleteResponse> =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        endpoint: String,
        params: AzureDeleteParams = AzureDeleteParams.none(),
    ): CompletableFuture<AzureDeleteResponse> = delete(endpoint, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AzureDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzureDeleteResponse>

    /** @see [delete] */
    fun delete(params: AzureDeleteParams): CompletableFuture<AzureDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AzureDeleteResponse> =
        delete(endpoint, AzureDeleteParams.none(), requestOptions)

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    fun call(endpoint: String): CompletableFuture<AzureCallResponse> =
        call(endpoint, AzureCallParams.none())

    /** @see [call] */
    fun call(
        endpoint: String,
        params: AzureCallParams = AzureCallParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzureCallResponse> =
        call(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [call] */
    fun call(
        endpoint: String,
        params: AzureCallParams = AzureCallParams.none(),
    ): CompletableFuture<AzureCallResponse> = call(endpoint, params, RequestOptions.none())

    /** @see [call] */
    fun call(
        params: AzureCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzureCallResponse>

    /** @see [call] */
    fun call(params: AzureCallParams): CompletableFuture<AzureCallResponse> =
        call(params, RequestOptions.none())

    /** @see [call] */
    fun call(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AzureCallResponse> = call(endpoint, AzureCallParams.none(), requestOptions)

    /**
     * Call any azure endpoint using the proxy.
     *
     * Just use `{PROXY_BASE_URL}/azure/{endpoint:path}`
     */
    fun patch(endpoint: String): CompletableFuture<AzurePatchResponse> =
        patch(endpoint, AzurePatchParams.none())

    /** @see [patch] */
    fun patch(
        endpoint: String,
        params: AzurePatchParams = AzurePatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzurePatchResponse> =
        patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [patch] */
    fun patch(
        endpoint: String,
        params: AzurePatchParams = AzurePatchParams.none(),
    ): CompletableFuture<AzurePatchResponse> = patch(endpoint, params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: AzurePatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AzurePatchResponse>

    /** @see [patch] */
    fun patch(params: AzurePatchParams): CompletableFuture<AzurePatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AzurePatchResponse> =
        patch(endpoint, AzurePatchParams.none(), requestOptions)

    /** A view of [AzureServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.create].
         */
        @MustBeClosed
        fun create(endpoint: String): CompletableFuture<HttpResponseFor<AzureCreateResponse>> =
            create(endpoint, AzureCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: AzureCreateParams = AzureCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzureCreateResponse>> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: AzureCreateParams = AzureCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<AzureCreateResponse>> =
            create(endpoint, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AzureCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzureCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AzureCreateParams
        ): CompletableFuture<HttpResponseFor<AzureCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AzureCreateResponse>> =
            create(endpoint, AzureCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.update].
         */
        @MustBeClosed
        fun update(endpoint: String): CompletableFuture<HttpResponseFor<AzureUpdateResponse>> =
            update(endpoint, AzureUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: AzureUpdateParams = AzureUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzureUpdateResponse>> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: AzureUpdateParams = AzureUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AzureUpdateResponse>> =
            update(endpoint, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AzureUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzureUpdateResponse>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AzureUpdateParams
        ): CompletableFuture<HttpResponseFor<AzureUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AzureUpdateResponse>> =
            update(endpoint, AzureUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(endpoint: String): CompletableFuture<HttpResponseFor<AzureDeleteResponse>> =
            delete(endpoint, AzureDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: AzureDeleteParams = AzureDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzureDeleteResponse>> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: AzureDeleteParams = AzureDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AzureDeleteResponse>> =
            delete(endpoint, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AzureDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzureDeleteResponse>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AzureDeleteParams
        ): CompletableFuture<HttpResponseFor<AzureDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AzureDeleteResponse>> =
            delete(endpoint, AzureDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.call].
         */
        @MustBeClosed
        fun call(endpoint: String): CompletableFuture<HttpResponseFor<AzureCallResponse>> =
            call(endpoint, AzureCallParams.none())

        /** @see [call] */
        @MustBeClosed
        fun call(
            endpoint: String,
            params: AzureCallParams = AzureCallParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzureCallResponse>> =
            call(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [call] */
        @MustBeClosed
        fun call(
            endpoint: String,
            params: AzureCallParams = AzureCallParams.none(),
        ): CompletableFuture<HttpResponseFor<AzureCallResponse>> =
            call(endpoint, params, RequestOptions.none())

        /** @see [call] */
        @MustBeClosed
        fun call(
            params: AzureCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzureCallResponse>>

        /** @see [call] */
        @MustBeClosed
        fun call(params: AzureCallParams): CompletableFuture<HttpResponseFor<AzureCallResponse>> =
            call(params, RequestOptions.none())

        /** @see [call] */
        @MustBeClosed
        fun call(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AzureCallResponse>> =
            call(endpoint, AzureCallParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /azure/{endpoint}`, but is otherwise the same as
         * [AzureServiceAsync.patch].
         */
        @MustBeClosed
        fun patch(endpoint: String): CompletableFuture<HttpResponseFor<AzurePatchResponse>> =
            patch(endpoint, AzurePatchParams.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: AzurePatchParams = AzurePatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzurePatchResponse>> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: AzurePatchParams = AzurePatchParams.none(),
        ): CompletableFuture<HttpResponseFor<AzurePatchResponse>> =
            patch(endpoint, params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: AzurePatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AzurePatchResponse>>

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: AzurePatchParams
        ): CompletableFuture<HttpResponseFor<AzurePatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AzurePatchResponse>> =
            patch(endpoint, AzurePatchParams.none(), requestOptions)
    }
}
