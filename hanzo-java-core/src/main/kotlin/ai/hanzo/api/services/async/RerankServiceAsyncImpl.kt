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
import ai.hanzo.api.models.rerank.RerankCreateParams
import ai.hanzo.api.models.rerank.RerankCreateResponse
import ai.hanzo.api.models.rerank.RerankCreateV1Params
import ai.hanzo.api.models.rerank.RerankCreateV1Response
import ai.hanzo.api.models.rerank.RerankCreateV2Params
import ai.hanzo.api.models.rerank.RerankCreateV2Response
import java.util.concurrent.CompletableFuture

class RerankServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RerankServiceAsync {

    private val withRawResponse: RerankServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RerankServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: RerankCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RerankCreateResponse> =
        // post /rerank
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun createV1(
        params: RerankCreateV1Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<RerankCreateV1Response> =
        // post /v1/rerank
        withRawResponse().createV1(params, requestOptions).thenApply { it.parse() }

    override fun createV2(
        params: RerankCreateV2Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<RerankCreateV2Response> =
        // post /v2/rerank
        withRawResponse().createV2(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RerankServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<RerankCreateResponse> =
            jsonHandler<RerankCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: RerankCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RerankCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("rerank")
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

        private val createV1Handler: Handler<RerankCreateV1Response> =
            jsonHandler<RerankCreateV1Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createV1(
            params: RerankCreateV1Params,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RerankCreateV1Response>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "rerank")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createV1Handler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createV2Handler: Handler<RerankCreateV2Response> =
            jsonHandler<RerankCreateV2Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createV2(
            params: RerankCreateV2Params,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RerankCreateV2Response>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "rerank")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createV2Handler.handle(it) }
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
