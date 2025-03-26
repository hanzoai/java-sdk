// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.config

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointCreateResponse
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointResponse
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointUpdateParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointUpdateResponse
import java.util.concurrent.CompletableFuture

interface PassThroughEndpointServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create new pass-through endpoint */
    fun create(
        params: PassThroughEndpointCreateParams
    ): CompletableFuture<PassThroughEndpointCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PassThroughEndpointCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassThroughEndpointCreateResponse>

    /** Update a pass-through endpoint */
    fun update(
        params: PassThroughEndpointUpdateParams
    ): CompletableFuture<PassThroughEndpointUpdateResponse> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PassThroughEndpointUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassThroughEndpointUpdateResponse>

    /**
     * GET configured pass through endpoint.
     *
     * If no endpoint_id given, return all configured endpoints.
     */
    fun list(): CompletableFuture<PassThroughEndpointResponse> =
        list(PassThroughEndpointListParams.none())

    /** @see [list] */
    fun list(
        params: PassThroughEndpointListParams = PassThroughEndpointListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassThroughEndpointResponse>

    /** @see [list] */
    fun list(
        params: PassThroughEndpointListParams = PassThroughEndpointListParams.none()
    ): CompletableFuture<PassThroughEndpointResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PassThroughEndpointResponse> =
        list(PassThroughEndpointListParams.none(), requestOptions)

    /**
     * Delete a pass-through endpoint
     *
     * Returns - the deleted endpoint
     */
    fun delete(
        params: PassThroughEndpointDeleteParams
    ): CompletableFuture<PassThroughEndpointResponse> = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PassThroughEndpointDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassThroughEndpointResponse>

    /**
     * A view of [PassThroughEndpointServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /config/pass_through_endpoint`, but is otherwise
         * the same as [PassThroughEndpointServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: PassThroughEndpointCreateParams
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PassThroughEndpointCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /config/pass_through_endpoint/{endpoint_id}`, but
         * is otherwise the same as [PassThroughEndpointServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: PassThroughEndpointUpdateParams
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PassThroughEndpointUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /config/pass_through_endpoint`, but is otherwise the
         * same as [PassThroughEndpointServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>> =
            list(PassThroughEndpointListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PassThroughEndpointListParams = PassThroughEndpointListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PassThroughEndpointListParams = PassThroughEndpointListParams.none()
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>> =
            list(PassThroughEndpointListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /config/pass_through_endpoint`, but is otherwise
         * the same as [PassThroughEndpointServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: PassThroughEndpointDeleteParams
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PassThroughEndpointDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>>
    }
}
