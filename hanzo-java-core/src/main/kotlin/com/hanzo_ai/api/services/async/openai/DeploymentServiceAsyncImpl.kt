// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.openai

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
import com.hanzo_ai.api.models.openai.deployments.DeploymentCompleteParams
import com.hanzo_ai.api.models.openai.deployments.DeploymentCompleteResponse
import com.hanzo_ai.api.models.openai.deployments.DeploymentEmbedParams
import com.hanzo_ai.api.models.openai.deployments.DeploymentEmbedResponse
import com.hanzo_ai.api.services.async.openai.deployments.ChatServiceAsync
import com.hanzo_ai.api.services.async.openai.deployments.ChatServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class DeploymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DeploymentServiceAsync {

    private val withRawResponse: DeploymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DeploymentServiceAsync.WithRawResponse = withRawResponse

    override fun chat(): ChatServiceAsync = chat

    override fun complete(
        params: DeploymentCompleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeploymentCompleteResponse> =
        // post /openai/deployments/{model}/completions
        withRawResponse().complete(params, requestOptions).thenApply { it.parse() }

    override fun embed(
        params: DeploymentEmbedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeploymentEmbedResponse> =
        // post /openai/deployments/{model}/embeddings
        withRawResponse().embed(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeploymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val chat: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun chat(): ChatServiceAsync.WithRawResponse = chat

        private val completeHandler: Handler<DeploymentCompleteResponse> =
            jsonHandler<DeploymentCompleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun complete(
            params: DeploymentCompleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeploymentCompleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("openai", "deployments", params._pathParam(0), "completions")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { completeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val embedHandler: Handler<DeploymentEmbedResponse> =
            jsonHandler<DeploymentEmbedResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun embed(
            params: DeploymentEmbedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeploymentEmbedResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("openai", "deployments", params._pathParam(0), "embeddings")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { embedHandler.handle(it) }
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
