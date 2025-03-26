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
import com.hanzo_ai.api.models.threads.ThreadCreateParams
import com.hanzo_ai.api.models.threads.ThreadCreateResponse
import com.hanzo_ai.api.models.threads.ThreadRetrieveParams
import com.hanzo_ai.api.models.threads.ThreadRetrieveResponse
import com.hanzo_ai.api.services.async.threads.MessageServiceAsync
import com.hanzo_ai.api.services.async.threads.MessageServiceAsyncImpl
import com.hanzo_ai.api.services.async.threads.RunServiceAsync
import com.hanzo_ai.api.services.async.threads.RunServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class ThreadServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ThreadServiceAsync {

    private val withRawResponse: ThreadServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messages: MessageServiceAsync by lazy { MessageServiceAsyncImpl(clientOptions) }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ThreadServiceAsync.WithRawResponse = withRawResponse

    override fun messages(): MessageServiceAsync = messages

    override fun runs(): RunServiceAsync = runs

    override fun create(
        params: ThreadCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadCreateResponse> =
        // post /v1/threads
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ThreadRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadRetrieveResponse> =
        // get /v1/threads/{thread_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ThreadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        override fun runs(): RunServiceAsync.WithRawResponse = runs

        private val createHandler: Handler<ThreadCreateResponse> =
            jsonHandler<ThreadCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ThreadCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "threads")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<ThreadRetrieveResponse> =
            jsonHandler<ThreadRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ThreadRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "threads", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
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
