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
import com.hanzo_ai.api.models.cohere.CohereCreateParams
import com.hanzo_ai.api.models.cohere.CohereCreateResponse
import com.hanzo_ai.api.models.cohere.CohereDeleteParams
import com.hanzo_ai.api.models.cohere.CohereDeleteResponse
import com.hanzo_ai.api.models.cohere.CohereModifyParams
import com.hanzo_ai.api.models.cohere.CohereModifyResponse
import com.hanzo_ai.api.models.cohere.CohereRetrieveParams
import com.hanzo_ai.api.models.cohere.CohereRetrieveResponse
import com.hanzo_ai.api.models.cohere.CohereUpdateParams
import com.hanzo_ai.api.models.cohere.CohereUpdateResponse
import java.util.concurrent.CompletableFuture

class CohereServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CohereServiceAsync {

    private val withRawResponse: CohereServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CohereServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: CohereCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CohereCreateResponse> =
        // post /cohere/{endpoint}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CohereRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CohereRetrieveResponse> =
        // get /cohere/{endpoint}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CohereUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CohereUpdateResponse> =
        // put /cohere/{endpoint}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CohereDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CohereDeleteResponse> =
        // delete /cohere/{endpoint}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun modify(
        params: CohereModifyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CohereModifyResponse> =
        // patch /cohere/{endpoint}
        withRawResponse().modify(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CohereServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CohereCreateResponse> =
            jsonHandler<CohereCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: CohereCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CohereCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("cohere", params._pathParam(0))
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

        private val retrieveHandler: Handler<CohereRetrieveResponse> =
            jsonHandler<CohereRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CohereRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CohereRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("cohere", params._pathParam(0))
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

        private val updateHandler: Handler<CohereUpdateResponse> =
            jsonHandler<CohereUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: CohereUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CohereUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("cohere", params._pathParam(0))
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

        private val deleteHandler: Handler<CohereDeleteResponse> =
            jsonHandler<CohereDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: CohereDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CohereDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("cohere", params._pathParam(0))
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

        private val modifyHandler: Handler<CohereModifyResponse> =
            jsonHandler<CohereModifyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun modify(
            params: CohereModifyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CohereModifyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("cohere", params._pathParam(0))
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
