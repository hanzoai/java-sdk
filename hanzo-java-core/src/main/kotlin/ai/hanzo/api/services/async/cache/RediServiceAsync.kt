// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.cache

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.cache.redis.RediRetrieveInfoParams
import ai.hanzo.api.models.cache.redis.RediRetrieveInfoResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RediServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RediServiceAsync

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RediServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cache/redis/info`, but is otherwise the same as
         * [RediServiceAsync.retrieveInfo].
         */
        fun retrieveInfo(): CompletableFuture<HttpResponseFor<RediRetrieveInfoResponse>> =
            retrieveInfo(RediRetrieveInfoParams.none())

        /** @see [retrieveInfo] */
        fun retrieveInfo(
            params: RediRetrieveInfoParams = RediRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RediRetrieveInfoResponse>>

        /** @see [retrieveInfo] */
        fun retrieveInfo(
            params: RediRetrieveInfoParams = RediRetrieveInfoParams.none()
        ): CompletableFuture<HttpResponseFor<RediRetrieveInfoResponse>> =
            retrieveInfo(params, RequestOptions.none())

        /** @see [retrieveInfo] */
        fun retrieveInfo(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RediRetrieveInfoResponse>> =
            retrieveInfo(RediRetrieveInfoParams.none(), requestOptions)
    }
}
