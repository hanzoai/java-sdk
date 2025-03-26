// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.routes.RouteListParams
import com.hanzo_ai.api.models.routes.RouteListResponse
import java.util.concurrent.CompletableFuture

interface RouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get a list of available routes in the FastAPI application. */
    fun list(): CompletableFuture<RouteListResponse> = list(RouteListParams.none())

    /** @see [list] */
    fun list(
        params: RouteListParams = RouteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RouteListResponse>

    /** @see [list] */
    fun list(
        params: RouteListParams = RouteListParams.none()
    ): CompletableFuture<RouteListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<RouteListResponse> =
        list(RouteListParams.none(), requestOptions)

    /** A view of [RouteServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /routes`, but is otherwise the same as
         * [RouteServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<RouteListResponse>> =
            list(RouteListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RouteListParams = RouteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RouteListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RouteListParams = RouteListParams.none()
        ): CompletableFuture<HttpResponseFor<RouteListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RouteListResponse>> =
            list(RouteListParams.none(), requestOptions)
    }
}
