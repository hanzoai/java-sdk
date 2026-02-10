// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.cache.CacheDeleteParams
import ai.hanzo.api.models.cache.CacheDeleteResponse
import ai.hanzo.api.models.cache.CacheFlushAllParams
import ai.hanzo.api.models.cache.CacheFlushAllResponse
import ai.hanzo.api.models.cache.CachePingParams
import ai.hanzo.api.models.cache.CachePingResponse
import ai.hanzo.api.services.async.cache.RediServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CacheServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CacheServiceAsync

    fun redis(): RediServiceAsync

    /**
     * Endpoint for deleting a key from the cache. All responses from llm proxy have
     * `x-llm-cache-key` in the headers
     *
     * Parameters:
     * - **keys**: *Optional[List[str]]* - A list of keys to delete from the cache. Example {"keys":
     *   ["key1", "key2"]}
     *
     * ```shell
     * curl -X POST "http://0.0.0.0:4000/cache/delete"     -H "Authorization: Bearer sk-1234"     -d '{"keys": ["key1", "key2"]}'
     * ```
     */
    fun delete(): CompletableFuture<CacheDeleteResponse> = delete(CacheDeleteParams.none())

    /** @see delete */
    fun delete(
        params: CacheDeleteParams = CacheDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CacheDeleteResponse>

    /** @see delete */
    fun delete(
        params: CacheDeleteParams = CacheDeleteParams.none()
    ): CompletableFuture<CacheDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(requestOptions: RequestOptions): CompletableFuture<CacheDeleteResponse> =
        delete(CacheDeleteParams.none(), requestOptions)

    /**
     * A function to flush all items from the cache. (All items will be deleted from the cache with
     * this) Raises HTTPException if the cache is not initialized or if the cache type does not
     * support flushing. Returns a dictionary with the status of the operation.
     *
     * Usage:
     * ```
     * curl -X POST http://0.0.0.0:4000/cache/flushall -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun flushAll(): CompletableFuture<CacheFlushAllResponse> = flushAll(CacheFlushAllParams.none())

    /** @see flushAll */
    fun flushAll(
        params: CacheFlushAllParams = CacheFlushAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CacheFlushAllResponse>

    /** @see flushAll */
    fun flushAll(
        params: CacheFlushAllParams = CacheFlushAllParams.none()
    ): CompletableFuture<CacheFlushAllResponse> = flushAll(params, RequestOptions.none())

    /** @see flushAll */
    fun flushAll(requestOptions: RequestOptions): CompletableFuture<CacheFlushAllResponse> =
        flushAll(CacheFlushAllParams.none(), requestOptions)

    /** Endpoint for checking if cache can be pinged */
    fun ping(): CompletableFuture<CachePingResponse> = ping(CachePingParams.none())

    /** @see ping */
    fun ping(
        params: CachePingParams = CachePingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CachePingResponse>

    /** @see ping */
    fun ping(
        params: CachePingParams = CachePingParams.none()
    ): CompletableFuture<CachePingResponse> = ping(params, RequestOptions.none())

    /** @see ping */
    fun ping(requestOptions: RequestOptions): CompletableFuture<CachePingResponse> =
        ping(CachePingParams.none(), requestOptions)

    /** A view of [CacheServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CacheServiceAsync.WithRawResponse

        fun redis(): RediServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cache/delete`, but is otherwise the same as
         * [CacheServiceAsync.delete].
         */
        fun delete(): CompletableFuture<HttpResponseFor<CacheDeleteResponse>> =
            delete(CacheDeleteParams.none())

        /** @see delete */
        fun delete(
            params: CacheDeleteParams = CacheDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CacheDeleteResponse>>

        /** @see delete */
        fun delete(
            params: CacheDeleteParams = CacheDeleteParams.none()
        ): CompletableFuture<HttpResponseFor<CacheDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CacheDeleteResponse>> =
            delete(CacheDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cache/flushall`, but is otherwise the same as
         * [CacheServiceAsync.flushAll].
         */
        fun flushAll(): CompletableFuture<HttpResponseFor<CacheFlushAllResponse>> =
            flushAll(CacheFlushAllParams.none())

        /** @see flushAll */
        fun flushAll(
            params: CacheFlushAllParams = CacheFlushAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CacheFlushAllResponse>>

        /** @see flushAll */
        fun flushAll(
            params: CacheFlushAllParams = CacheFlushAllParams.none()
        ): CompletableFuture<HttpResponseFor<CacheFlushAllResponse>> =
            flushAll(params, RequestOptions.none())

        /** @see flushAll */
        fun flushAll(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CacheFlushAllResponse>> =
            flushAll(CacheFlushAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cache/ping`, but is otherwise the same as
         * [CacheServiceAsync.ping].
         */
        fun ping(): CompletableFuture<HttpResponseFor<CachePingResponse>> =
            ping(CachePingParams.none())

        /** @see ping */
        fun ping(
            params: CachePingParams = CachePingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CachePingResponse>>

        /** @see ping */
        fun ping(
            params: CachePingParams = CachePingParams.none()
        ): CompletableFuture<HttpResponseFor<CachePingResponse>> =
            ping(params, RequestOptions.none())

        /** @see ping */
        fun ping(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CachePingResponse>> =
            ping(CachePingParams.none(), requestOptions)
    }
}
