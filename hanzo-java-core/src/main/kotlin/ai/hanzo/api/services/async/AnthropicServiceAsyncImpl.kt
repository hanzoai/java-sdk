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
import ai.hanzo.api.models.anthropic.AnthropicCreateParams
import ai.hanzo.api.models.anthropic.AnthropicCreateResponse
import ai.hanzo.api.models.anthropic.AnthropicDeleteParams
import ai.hanzo.api.models.anthropic.AnthropicDeleteResponse
import ai.hanzo.api.models.anthropic.AnthropicModifyParams
import ai.hanzo.api.models.anthropic.AnthropicModifyResponse
import ai.hanzo.api.models.anthropic.AnthropicRetrieveParams
import ai.hanzo.api.models.anthropic.AnthropicRetrieveResponse
import ai.hanzo.api.models.anthropic.AnthropicUpdateParams
import ai.hanzo.api.models.anthropic.AnthropicUpdateResponse
import java.util.concurrent.CompletableFuture

class AnthropicServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AnthropicServiceAsync {

    private val withRawResponse: AnthropicServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AnthropicServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: AnthropicCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnthropicCreateResponse> =
        // post /anthropic/{endpoint}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AnthropicRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnthropicRetrieveResponse> =
        // get /anthropic/{endpoint}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AnthropicUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnthropicUpdateResponse> =
        // put /anthropic/{endpoint}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AnthropicDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnthropicDeleteResponse> =
        // delete /anthropic/{endpoint}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun modify(
        params: AnthropicModifyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnthropicModifyResponse> =
        // patch /anthropic/{endpoint}
        withRawResponse().modify(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AnthropicServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AnthropicCreateResponse> =
            jsonHandler<AnthropicCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AnthropicCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnthropicCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("anthropic", params._pathParam(0))
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

        private val retrieveHandler: Handler<AnthropicRetrieveResponse> =
            jsonHandler<AnthropicRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: AnthropicRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnthropicRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("anthropic", params._pathParam(0))
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

        private val updateHandler: Handler<AnthropicUpdateResponse> =
            jsonHandler<AnthropicUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: AnthropicUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnthropicUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("anthropic", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<AnthropicDeleteResponse> =
            jsonHandler<AnthropicDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: AnthropicDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnthropicDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("anthropic", params._pathParam(0))
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

        private val modifyHandler: Handler<AnthropicModifyResponse> =
            jsonHandler<AnthropicModifyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun modify(
            params: AnthropicModifyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnthropicModifyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("anthropic", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { modifyHandler.handle(it) }
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
