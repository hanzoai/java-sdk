// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.checkRequired
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
import ai.hanzo.api.models.batches.BatchCancelWithProviderParams
import ai.hanzo.api.models.batches.BatchCancelWithProviderResponse
import ai.hanzo.api.models.batches.BatchCreateParams
import ai.hanzo.api.models.batches.BatchCreateResponse
import ai.hanzo.api.models.batches.BatchCreateWithProviderParams
import ai.hanzo.api.models.batches.BatchCreateWithProviderResponse
import ai.hanzo.api.models.batches.BatchListParams
import ai.hanzo.api.models.batches.BatchListResponse
import ai.hanzo.api.models.batches.BatchListWithProviderParams
import ai.hanzo.api.models.batches.BatchListWithProviderResponse
import ai.hanzo.api.models.batches.BatchRetrieveParams
import ai.hanzo.api.models.batches.BatchRetrieveResponse
import ai.hanzo.api.models.batches.BatchRetrieveWithProviderParams
import ai.hanzo.api.models.batches.BatchRetrieveWithProviderResponse
import ai.hanzo.api.services.async.batches.CancelServiceAsync
import ai.hanzo.api.services.async.batches.CancelServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class BatchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchServiceAsync {

    private val withRawResponse: BatchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val cancel: CancelServiceAsync by lazy { CancelServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BatchServiceAsync.WithRawResponse = withRawResponse

    override fun cancel(): CancelServiceAsync = cancel

    override fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchCreateResponse> =
        // post /v1/batches
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BatchRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchRetrieveResponse> =
        // get /v1/batches/{batch_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BatchListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchListResponse> =
        // get /v1/batches
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cancelWithProvider(
        params: BatchCancelWithProviderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchCancelWithProviderResponse> =
        // post /{provider}/v1/batches/{batch_id}/cancel
        withRawResponse().cancelWithProvider(params, requestOptions).thenApply { it.parse() }

    override fun createWithProvider(
        params: BatchCreateWithProviderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchCreateWithProviderResponse> =
        // post /{provider}/v1/batches
        withRawResponse().createWithProvider(params, requestOptions).thenApply { it.parse() }

    override fun listWithProvider(
        params: BatchListWithProviderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchListWithProviderResponse> =
        // get /{provider}/v1/batches
        withRawResponse().listWithProvider(params, requestOptions).thenApply { it.parse() }

    override fun retrieveWithProvider(
        params: BatchRetrieveWithProviderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchRetrieveWithProviderResponse> =
        // get /{provider}/v1/batches/{batch_id}
        withRawResponse().retrieveWithProvider(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val cancel: CancelServiceAsync.WithRawResponse by lazy {
            CancelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun cancel(): CancelServiceAsync.WithRawResponse = cancel

        private val createHandler: Handler<BatchCreateResponse> =
            jsonHandler<BatchCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "batches")
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

        private val retrieveHandler: Handler<BatchRetrieveResponse> =
            jsonHandler<BatchRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: BatchRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("batchId", params.batchId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "batches", params._pathParam(0))
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

        private val listHandler: Handler<BatchListResponse> =
            jsonHandler<BatchListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: BatchListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "batches")
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

        private val cancelWithProviderHandler: Handler<BatchCancelWithProviderResponse> =
            jsonHandler<BatchCancelWithProviderResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun cancelWithProvider(
            params: BatchCancelWithProviderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchCancelWithProviderResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("batchId", params.batchId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        params._pathParam(0),
                        "v1",
                        "batches",
                        params._pathParam(1),
                        "cancel",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { cancelWithProviderHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createWithProviderHandler: Handler<BatchCreateWithProviderResponse> =
            jsonHandler<BatchCreateWithProviderResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createWithProvider(
            params: BatchCreateWithProviderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchCreateWithProviderResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("provider", params.provider().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(params._pathParam(0), "v1", "batches")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createWithProviderHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listWithProviderHandler: Handler<BatchListWithProviderResponse> =
            jsonHandler<BatchListWithProviderResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listWithProvider(
            params: BatchListWithProviderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchListWithProviderResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("provider", params.provider().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(params._pathParam(0), "v1", "batches")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listWithProviderHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveWithProviderHandler: Handler<BatchRetrieveWithProviderResponse> =
            jsonHandler<BatchRetrieveWithProviderResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveWithProvider(
            params: BatchRetrieveWithProviderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchRetrieveWithProviderResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("batchId", params.batchId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(params._pathParam(0), "v1", "batches", params._pathParam(1))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveWithProviderHandler.handle(it) }
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
