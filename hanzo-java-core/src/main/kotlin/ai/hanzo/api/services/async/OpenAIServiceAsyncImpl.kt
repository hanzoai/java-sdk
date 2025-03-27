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
import ai.hanzo.api.models.openai.OpenAICreateParams
import ai.hanzo.api.models.openai.OpenAICreateResponse
import ai.hanzo.api.models.openai.OpenAIDeleteParams
import ai.hanzo.api.models.openai.OpenAIDeleteResponse
import ai.hanzo.api.models.openai.OpenAIPatchParams
import ai.hanzo.api.models.openai.OpenAIPatchResponse
import ai.hanzo.api.models.openai.OpenAIRetrieveParams
import ai.hanzo.api.models.openai.OpenAIRetrieveResponse
import ai.hanzo.api.models.openai.OpenAIUpdateParams
import ai.hanzo.api.models.openai.OpenAIUpdateResponse
import ai.hanzo.api.services.async.openai.DeploymentServiceAsync
import ai.hanzo.api.services.async.openai.DeploymentServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class OpenAIServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OpenAIServiceAsync {

    private val withRawResponse: OpenAIServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val deployments: DeploymentServiceAsync by lazy {
        DeploymentServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): OpenAIServiceAsync.WithRawResponse = withRawResponse

    override fun deployments(): DeploymentServiceAsync = deployments

    override fun create(
        params: OpenAICreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenAICreateResponse> =
        // post /openai/{endpoint}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: OpenAIRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenAIRetrieveResponse> =
        // get /openai/{endpoint}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: OpenAIUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenAIUpdateResponse> =
        // put /openai/{endpoint}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: OpenAIDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenAIDeleteResponse> =
        // delete /openai/{endpoint}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun patch(
        params: OpenAIPatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenAIPatchResponse> =
        // patch /openai/{endpoint}
        withRawResponse().patch(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OpenAIServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val deployments: DeploymentServiceAsync.WithRawResponse by lazy {
            DeploymentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun deployments(): DeploymentServiceAsync.WithRawResponse = deployments

        private val createHandler: Handler<OpenAICreateResponse> =
            jsonHandler<OpenAICreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: OpenAICreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenAICreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("openai", params._pathParam(0))
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

        private val retrieveHandler: Handler<OpenAIRetrieveResponse> =
            jsonHandler<OpenAIRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: OpenAIRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenAIRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("openai", params._pathParam(0))
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

        private val updateHandler: Handler<OpenAIUpdateResponse> =
            jsonHandler<OpenAIUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: OpenAIUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenAIUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("openai", params._pathParam(0))
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

        private val deleteHandler: Handler<OpenAIDeleteResponse> =
            jsonHandler<OpenAIDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: OpenAIDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenAIDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("openai", params._pathParam(0))
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

        private val patchHandler: Handler<OpenAIPatchResponse> =
            jsonHandler<OpenAIPatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun patch(
            params: OpenAIPatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenAIPatchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("openai", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { patchHandler.handle(it) }
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
