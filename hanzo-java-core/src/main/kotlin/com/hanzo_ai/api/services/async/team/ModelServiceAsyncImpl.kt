// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.team

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
import com.hanzo_ai.api.models.team.model.ModelAddParams
import com.hanzo_ai.api.models.team.model.ModelAddResponse
import com.hanzo_ai.api.models.team.model.ModelRemoveParams
import com.hanzo_ai.api.models.team.model.ModelRemoveResponse
import java.util.concurrent.CompletableFuture

class ModelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ModelServiceAsync {

    private val withRawResponse: ModelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ModelServiceAsync.WithRawResponse = withRawResponse

    override fun add(
        params: ModelAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ModelAddResponse> =
        // post /team/model/add
        withRawResponse().add(params, requestOptions).thenApply { it.parse() }

    override fun remove(
        params: ModelRemoveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ModelRemoveResponse> =
        // post /team/model/delete
        withRawResponse().remove(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val addHandler: Handler<ModelAddResponse> =
            jsonHandler<ModelAddResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun add(
            params: ModelAddParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ModelAddResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "model", "add")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { addHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val removeHandler: Handler<ModelRemoveResponse> =
            jsonHandler<ModelRemoveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun remove(
            params: ModelRemoveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ModelRemoveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "model", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { removeHandler.handle(it) }
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
