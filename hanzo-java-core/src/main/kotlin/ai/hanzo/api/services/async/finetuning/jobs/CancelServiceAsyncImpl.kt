// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.finetuning.jobs

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
import ai.hanzo.api.models.finetuning.jobs.cancel.CancelCreateParams
import ai.hanzo.api.models.finetuning.jobs.cancel.CancelCreateResponse
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
