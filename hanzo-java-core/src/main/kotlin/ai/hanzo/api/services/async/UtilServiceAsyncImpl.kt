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
import ai.hanzo.api.models.utils.UtilGetSupportedOpenAIParamsParams
import ai.hanzo.api.models.utils.UtilGetSupportedOpenAIParamsResponse
import ai.hanzo.api.models.utils.UtilTokenCounterParams
import ai.hanzo.api.models.utils.UtilTokenCounterResponse
import ai.hanzo.api.models.utils.UtilTransformRequestParams
import ai.hanzo.api.models.utils.UtilTransformRequestResponse
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
