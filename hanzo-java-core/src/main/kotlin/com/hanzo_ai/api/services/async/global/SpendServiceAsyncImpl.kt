// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.global

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
import com.hanzo_ai.api.models.global.spend.SpendListTagsParams
import com.hanzo_ai.api.models.global.spend.SpendListTagsResponse
import com.hanzo_ai.api.models.global.spend.SpendResetParams
import com.hanzo_ai.api.models.global.spend.SpendResetResponse
import com.hanzo_ai.api.models.global.spend.SpendRetrieveReportParams
import com.hanzo_ai.api.models.global.spend.SpendRetrieveReportResponse
import java.util.concurrent.CompletableFuture

class SpendServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SpendServiceAsync {

    private val withRawResponse: SpendServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpendServiceAsync.WithRawResponse = withRawResponse

    override fun listTags(
        params: SpendListTagsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<SpendListTagsResponse>> =
        // get /global/spend/tags
        withRawResponse().listTags(params, requestOptions).thenApply { it.parse() }

    override fun reset(
        params: SpendResetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpendResetResponse> =
        // post /global/spend/reset
        withRawResponse().reset(params, requestOptions).thenApply { it.parse() }

    override fun retrieveReport(
        params: SpendRetrieveReportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<SpendRetrieveReportResponse>> =
        // get /global/spend/report
        withRawResponse().retrieveReport(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpendServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listTagsHandler: Handler<List<SpendListTagsResponse>> =
            jsonHandler<List<SpendListTagsResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listTags(
            params: SpendListTagsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<SpendListTagsResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("global", "spend", "tags")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listTagsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val resetHandler: Handler<SpendResetResponse> =
            jsonHandler<SpendResetResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun reset(
            params: SpendResetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpendResetResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("global", "spend", "reset")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { resetHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveReportHandler: Handler<List<SpendRetrieveReportResponse>> =
            jsonHandler<List<SpendRetrieveReportResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveReport(
            params: SpendRetrieveReportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<SpendRetrieveReportResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("global", "spend", "report")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveReportHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }
    }
}
