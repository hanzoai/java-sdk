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
import com.hanzo_ai.api.models.budget.BudgetCreateParams
import com.hanzo_ai.api.models.budget.BudgetCreateResponse
import com.hanzo_ai.api.models.budget.BudgetDeleteParams
import com.hanzo_ai.api.models.budget.BudgetDeleteResponse
import com.hanzo_ai.api.models.budget.BudgetInfoParams
import com.hanzo_ai.api.models.budget.BudgetInfoResponse
import com.hanzo_ai.api.models.budget.BudgetListParams
import com.hanzo_ai.api.models.budget.BudgetListResponse
import com.hanzo_ai.api.models.budget.BudgetSettingsParams
import com.hanzo_ai.api.models.budget.BudgetSettingsResponse
import com.hanzo_ai.api.models.budget.BudgetUpdateParams
import com.hanzo_ai.api.models.budget.BudgetUpdateResponse
import java.util.concurrent.CompletableFuture

class BudgetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BudgetServiceAsync {

    private val withRawResponse: BudgetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BudgetServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: BudgetCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BudgetCreateResponse> =
        // post /budget/new
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BudgetUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BudgetUpdateResponse> =
        // post /budget/update
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BudgetListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BudgetListResponse> =
        // get /budget/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: BudgetDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BudgetDeleteResponse> =
        // post /budget/delete
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun info(
        params: BudgetInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BudgetInfoResponse> =
        // post /budget/info
        withRawResponse().info(params, requestOptions).thenApply { it.parse() }

    override fun settings(
        params: BudgetSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BudgetSettingsResponse> =
        // get /budget/settings
        withRawResponse().settings(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BudgetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BudgetCreateResponse> =
            jsonHandler<BudgetCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: BudgetCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BudgetCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("budget", "new")
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

        private val updateHandler: Handler<BudgetUpdateResponse> =
            jsonHandler<BudgetUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: BudgetUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BudgetUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("budget", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val listHandler: Handler<BudgetListResponse> =
            jsonHandler<BudgetListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: BudgetListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BudgetListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("budget", "list")
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

        private val deleteHandler: Handler<BudgetDeleteResponse> =
            jsonHandler<BudgetDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: BudgetDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BudgetDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("budget", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val infoHandler: Handler<BudgetInfoResponse> =
            jsonHandler<BudgetInfoResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun info(
            params: BudgetInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BudgetInfoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("budget", "info")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { infoHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val settingsHandler: Handler<BudgetSettingsResponse> =
            jsonHandler<BudgetSettingsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun settings(
            params: BudgetSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BudgetSettingsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("budget", "settings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { settingsHandler.handle(it) }
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
