// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.handlers.errorHandler
import com.hanzo_ai.api.core.handlers.jsonHandler
import com.hanzo_ai.api.core.handlers.withErrorHandler
import com.hanzo_ai.api.core.http.HttpMethod
import com.hanzo_ai.api.core.http.HttpRequest
import com.hanzo_ai.api.core.http.HttpResponse.Handler
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.core.http.json
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepareAsync
import com.hanzo_ai.api.models.cache.CacheDeleteParams
import com.hanzo_ai.api.models.cache.CacheDeleteResponse
import com.hanzo_ai.api.models.cache.CacheFlushAllParams
import com.hanzo_ai.api.models.cache.CacheFlushAllResponse
import com.hanzo_ai.api.models.cache.CachePingParams
import com.hanzo_ai.api.models.cache.CachePingResponse
import com.hanzo_ai.api.services.async.cache.RediServiceAsync
import com.hanzo_ai.api.services.async.cache.RediServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class CacheServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CacheServiceAsync {

    private val withRawResponse: CacheServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val redis: RediServiceAsync by lazy { RediServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CacheServiceAsync.WithRawResponse = withRawResponse

    override fun redis(): RediServiceAsync = redis

    override fun delete(
        params: CacheDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CacheDeleteResponse> =
        // post /cache/delete
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun flushAll(
        params: CacheFlushAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CacheFlushAllResponse> =
        // post /cache/flushall
        withRawResponse().flushAll(params, requestOptions).thenApply { it.parse() }

    override fun ping(
        params: CachePingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CachePingResponse> =
        // get /cache/ping
        withRawResponse().ping(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CacheServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val redis: RediServiceAsync.WithRawResponse by lazy {
            RediServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun redis(): RediServiceAsync.WithRawResponse = redis

        private val deleteHandler: Handler<CacheDeleteResponse> =
            jsonHandler<CacheDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: CacheDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CacheDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("cache", "delete")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val flushAllHandler: Handler<CacheFlushAllResponse> =
            jsonHandler<CacheFlushAllResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun flushAll(
            params: CacheFlushAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CacheFlushAllResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("cache", "flushall")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { flushAllHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val pingHandler: Handler<CachePingResponse> =
            jsonHandler<CachePingResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun ping(
            params: CachePingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CachePingResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("cache", "ping")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { pingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
