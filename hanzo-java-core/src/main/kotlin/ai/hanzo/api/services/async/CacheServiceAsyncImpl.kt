// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.handlers.withErrorHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.cache.CacheDeleteParams
import ai.hanzo.api.models.cache.CacheDeleteResponse
import ai.hanzo.api.models.cache.CacheFlushAllParams
import ai.hanzo.api.models.cache.CacheFlushAllResponse
import ai.hanzo.api.models.cache.CachePingParams
import ai.hanzo.api.models.cache.CachePingResponse
import ai.hanzo.api.services.async.cache.RediServiceAsync
import ai.hanzo.api.services.async.cache.RediServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CacheServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CacheServiceAsync {

    private val withRawResponse: CacheServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val redis: RediServiceAsync by lazy { RediServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CacheServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CacheServiceAsync =
        CacheServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CacheServiceAsync.WithRawResponse =
            CacheServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

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
                    .baseUrl(clientOptions.baseUrl())
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
                    .baseUrl(clientOptions.baseUrl())
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
                    .baseUrl(clientOptions.baseUrl())
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
