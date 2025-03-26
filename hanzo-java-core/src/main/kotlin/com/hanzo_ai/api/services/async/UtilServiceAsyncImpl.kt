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
import com.hanzo_ai.api.models.utils.UtilGetSupportedOpenAIParamsParams
import com.hanzo_ai.api.models.utils.UtilGetSupportedOpenAIParamsResponse
import com.hanzo_ai.api.models.utils.UtilTokenCounterParams
import com.hanzo_ai.api.models.utils.UtilTokenCounterResponse
import com.hanzo_ai.api.models.utils.UtilTransformRequestParams
import com.hanzo_ai.api.models.utils.UtilTransformRequestResponse
import java.util.concurrent.CompletableFuture

class UtilServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UtilServiceAsync {

    private val withRawResponse: UtilServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UtilServiceAsync.WithRawResponse = withRawResponse

    override fun getSupportedOpenAIParams(
        params: UtilGetSupportedOpenAIParamsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UtilGetSupportedOpenAIParamsResponse> =
        // get /utils/supported_openai_params
        withRawResponse().getSupportedOpenAIParams(params, requestOptions).thenApply { it.parse() }

    override fun tokenCounter(
        params: UtilTokenCounterParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UtilTokenCounterResponse> =
        // post /utils/token_counter
        withRawResponse().tokenCounter(params, requestOptions).thenApply { it.parse() }

    override fun transformRequest(
        params: UtilTransformRequestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UtilTransformRequestResponse> =
        // post /utils/transform_request
        withRawResponse().transformRequest(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UtilServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val getSupportedOpenAIParamsHandler: Handler<UtilGetSupportedOpenAIParamsResponse> =
            jsonHandler<UtilGetSupportedOpenAIParamsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getSupportedOpenAIParams(
            params: UtilGetSupportedOpenAIParamsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UtilGetSupportedOpenAIParamsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("utils", "supported_openai_params")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { getSupportedOpenAIParamsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val tokenCounterHandler: Handler<UtilTokenCounterResponse> =
            jsonHandler<UtilTokenCounterResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun tokenCounter(
            params: UtilTokenCounterParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UtilTokenCounterResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("utils", "token_counter")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { tokenCounterHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val transformRequestHandler: Handler<UtilTransformRequestResponse> =
            jsonHandler<UtilTransformRequestResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun transformRequest(
            params: UtilTransformRequestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UtilTransformRequestResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("utils", "transform_request")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { transformRequestHandler.handle(it) }
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
