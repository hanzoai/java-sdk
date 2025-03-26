// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.config

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
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointCreateResponse
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointResponse
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointUpdateParams
import com.hanzo_ai.api.models.config.passthroughendpoint.PassThroughEndpointUpdateResponse
import java.util.concurrent.CompletableFuture

class PassThroughEndpointServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PassThroughEndpointServiceAsync {

    private val withRawResponse: PassThroughEndpointServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PassThroughEndpointServiceAsync.WithRawResponse =
        withRawResponse

    override fun create(
        params: PassThroughEndpointCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PassThroughEndpointCreateResponse> =
        // post /config/pass_through_endpoint
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PassThroughEndpointUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PassThroughEndpointUpdateResponse> =
        // post /config/pass_through_endpoint/{endpoint_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PassThroughEndpointListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PassThroughEndpointResponse> =
        // get /config/pass_through_endpoint
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PassThroughEndpointDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PassThroughEndpointResponse> =
        // delete /config/pass_through_endpoint
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PassThroughEndpointServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PassThroughEndpointCreateResponse> =
            jsonHandler<PassThroughEndpointCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: PassThroughEndpointCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("config", "pass_through_endpoint")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val updateHandler: Handler<PassThroughEndpointUpdateResponse> =
            jsonHandler<PassThroughEndpointUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: PassThroughEndpointUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("config", "pass_through_endpoint", params._pathParam(0))
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

        private val listHandler: Handler<PassThroughEndpointResponse> =
            jsonHandler<PassThroughEndpointResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PassThroughEndpointListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("config", "pass_through_endpoint")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<PassThroughEndpointResponse> =
            jsonHandler<PassThroughEndpointResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: PassThroughEndpointDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("config", "pass_through_endpoint")
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
    }
}
