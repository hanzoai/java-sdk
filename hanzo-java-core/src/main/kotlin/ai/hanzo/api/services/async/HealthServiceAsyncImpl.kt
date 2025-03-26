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
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.health.HealthCheckAllParams
import ai.hanzo.api.models.health.HealthCheckAllResponse
import ai.hanzo.api.models.health.HealthCheckLivelinessParams
import ai.hanzo.api.models.health.HealthCheckLivelinessResponse
import ai.hanzo.api.models.health.HealthCheckLivenessParams
import ai.hanzo.api.models.health.HealthCheckLivenessResponse
import ai.hanzo.api.models.health.HealthCheckReadinessParams
import ai.hanzo.api.models.health.HealthCheckReadinessResponse
import ai.hanzo.api.models.health.HealthCheckServicesParams
import ai.hanzo.api.models.health.HealthCheckServicesResponse
import java.util.concurrent.CompletableFuture

class HealthServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    HealthServiceAsync {

    private val withRawResponse: HealthServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HealthServiceAsync.WithRawResponse = withRawResponse

    override fun checkAll(
        params: HealthCheckAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HealthCheckAllResponse> =
        // get /health
        withRawResponse().checkAll(params, requestOptions).thenApply { it.parse() }

    override fun checkLiveliness(
        params: HealthCheckLivelinessParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HealthCheckLivelinessResponse> =
        // get /health/liveliness
        withRawResponse().checkLiveliness(params, requestOptions).thenApply { it.parse() }

    override fun checkLiveness(
        params: HealthCheckLivenessParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HealthCheckLivenessResponse> =
        // get /health/liveness
        withRawResponse().checkLiveness(params, requestOptions).thenApply { it.parse() }

    override fun checkReadiness(
        params: HealthCheckReadinessParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HealthCheckReadinessResponse> =
        // get /health/readiness
        withRawResponse().checkReadiness(params, requestOptions).thenApply { it.parse() }

    override fun checkServices(
        params: HealthCheckServicesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HealthCheckServicesResponse> =
        // get /health/services
        withRawResponse().checkServices(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HealthServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val checkAllHandler: Handler<HealthCheckAllResponse> =
            jsonHandler<HealthCheckAllResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun checkAll(
            params: HealthCheckAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HealthCheckAllResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("health")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { checkAllHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val checkLivelinessHandler: Handler<HealthCheckLivelinessResponse> =
            jsonHandler<HealthCheckLivelinessResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun checkLiveliness(
            params: HealthCheckLivelinessParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HealthCheckLivelinessResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("health", "liveliness")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { checkLivelinessHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val checkLivenessHandler: Handler<HealthCheckLivenessResponse> =
            jsonHandler<HealthCheckLivenessResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun checkLiveness(
            params: HealthCheckLivenessParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HealthCheckLivenessResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("health", "liveness")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { checkLivenessHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val checkReadinessHandler: Handler<HealthCheckReadinessResponse> =
            jsonHandler<HealthCheckReadinessResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun checkReadiness(
            params: HealthCheckReadinessParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HealthCheckReadinessResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("health", "readiness")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { checkReadinessHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val checkServicesHandler: Handler<HealthCheckServicesResponse> =
            jsonHandler<HealthCheckServicesResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun checkServices(
            params: HealthCheckServicesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HealthCheckServicesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("health", "services")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { checkServicesHandler.handle(it) }
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
