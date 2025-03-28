// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.finetuning

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
import ai.hanzo.api.models.finetuning.jobs.JobCreateParams
import ai.hanzo.api.models.finetuning.jobs.JobCreateResponse
import ai.hanzo.api.models.finetuning.jobs.JobListParams
import ai.hanzo.api.models.finetuning.jobs.JobListResponse
import ai.hanzo.api.models.finetuning.jobs.JobRetrieveParams
import ai.hanzo.api.models.finetuning.jobs.JobRetrieveResponse
import ai.hanzo.api.services.async.finetuning.jobs.CancelServiceAsync
import ai.hanzo.api.services.async.finetuning.jobs.CancelServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class JobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JobServiceAsync {

    private val withRawResponse: JobServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val cancel: CancelServiceAsync by lazy { CancelServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): JobServiceAsync.WithRawResponse = withRawResponse

    override fun cancel(): CancelServiceAsync = cancel

    override fun create(
        params: JobCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobCreateResponse> =
        // post /v1/fine_tuning/jobs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobRetrieveResponse> =
        // get /v1/fine_tuning/jobs/{fine_tuning_job_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: JobListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobListResponse> =
        // get /v1/fine_tuning/jobs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val cancel: CancelServiceAsync.WithRawResponse by lazy {
            CancelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun cancel(): CancelServiceAsync.WithRawResponse = cancel

        private val createHandler: Handler<JobCreateResponse> =
            jsonHandler<JobCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: JobCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "fine_tuning", "jobs")
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

        private val retrieveHandler: Handler<JobRetrieveResponse> =
            jsonHandler<JobRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "fine_tuning", "jobs", params._pathParam(0))
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

        private val listHandler: Handler<JobListResponse> =
            jsonHandler<JobListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: JobListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "fine_tuning", "jobs")
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
    }
}
