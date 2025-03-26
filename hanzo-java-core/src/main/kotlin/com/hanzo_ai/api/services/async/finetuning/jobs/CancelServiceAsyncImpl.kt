// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.finetuning.jobs

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
import com.hanzo_ai.api.models.finetuning.jobs.cancel.CancelCreateParams
import com.hanzo_ai.api.models.finetuning.jobs.cancel.CancelCreateResponse
import java.util.concurrent.CompletableFuture

class CancelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CancelServiceAsync {

    private val withRawResponse: CancelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CancelServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: CancelCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CancelCreateResponse> =
        // post /v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CancelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CancelCreateResponse> =
            jsonHandler<CancelCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: CancelCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CancelCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "fine_tuning", "jobs", params._pathParam(0), "cancel")
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
    }
}
