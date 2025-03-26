// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.cache

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.cache.redis.RediRetrieveInfoParams
import com.hanzo_ai.api.models.cache.redis.RediRetrieveInfoResponse
import java.util.concurrent.CompletableFuture

interface RediServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Endpoint for getting /redis/info */
    fun retrieveInfo(): CompletableFuture<RediRetrieveInfoResponse> =
        retrieveInfo(RediRetrieveInfoParams.none())

    /** @see [retrieveInfo] */
    fun retrieveInfo(
        params: RediRetrieveInfoParams = RediRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RediRetrieveInfoResponse>

    /** @see [retrieveInfo] */
    fun retrieveInfo(
        params: RediRetrieveInfoParams = RediRetrieveInfoParams.none()
    ): CompletableFuture<RediRetrieveInfoResponse> = retrieveInfo(params, RequestOptions.none())

    /** @see [retrieveInfo] */
    fun retrieveInfo(requestOptions: RequestOptions): CompletableFuture<RediRetrieveInfoResponse> =
        retrieveInfo(RediRetrieveInfoParams.none(), requestOptions)

    /** A view of [RediServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /cache/redis/info`, but is otherwise the same as
         * [RediServiceAsync.retrieveInfo].
         */
        @MustBeClosed
        fun retrieveInfo(): CompletableFuture<HttpResponseFor<RediRetrieveInfoResponse>> =
            retrieveInfo(RediRetrieveInfoParams.none())

        /** @see [retrieveInfo] */
        @MustBeClosed
        fun retrieveInfo(
            params: RediRetrieveInfoParams = RediRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RediRetrieveInfoResponse>>

        /** @see [retrieveInfo] */
        @MustBeClosed
        fun retrieveInfo(
            params: RediRetrieveInfoParams = RediRetrieveInfoParams.none()
        ): CompletableFuture<HttpResponseFor<RediRetrieveInfoResponse>> =
            retrieveInfo(params, RequestOptions.none())

        /** @see [retrieveInfo] */
        @MustBeClosed
        fun retrieveInfo(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RediRetrieveInfoResponse>> =
            retrieveInfo(RediRetrieveInfoParams.none(), requestOptions)
    }
}
