// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.handlers.errorBodyHandler
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.gemini.GeminiCreateParams
import ai.hanzo.api.models.gemini.GeminiCreateResponse
import ai.hanzo.api.models.gemini.GeminiDeleteParams
import ai.hanzo.api.models.gemini.GeminiDeleteResponse
import ai.hanzo.api.models.gemini.GeminiPatchParams
import ai.hanzo.api.models.gemini.GeminiPatchResponse
import ai.hanzo.api.models.gemini.GeminiRetrieveParams
import ai.hanzo.api.models.gemini.GeminiRetrieveResponse
import ai.hanzo.api.models.gemini.GeminiUpdateParams
import ai.hanzo.api.models.gemini.GeminiUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GeminiServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GeminiServiceAsync {

    private val withRawResponse: GeminiServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GeminiServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeminiServiceAsync =
        GeminiServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GeminiCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeminiCreateResponse> =
        // post /gemini/{endpoint}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: GeminiRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeminiRetrieveResponse> =
        // get /gemini/{endpoint}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: GeminiUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeminiUpdateResponse> =
        // put /gemini/{endpoint}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: GeminiDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeminiDeleteResponse> =
        // delete /gemini/{endpoint}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun patch(
        params: GeminiPatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeminiPatchResponse> =
        // patch /gemini/{endpoint}
        withRawResponse().patch(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GeminiServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GeminiServiceAsync.WithRawResponse =
            GeminiServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<GeminiCreateResponse> =
            jsonHandler<GeminiCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GeminiCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeminiCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("gemini", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val retrieveHandler: Handler<GeminiRetrieveResponse> =
            jsonHandler<GeminiRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GeminiRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeminiRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("gemini", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<GeminiUpdateResponse> =
            jsonHandler<GeminiUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: GeminiUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeminiUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("gemini", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val deleteHandler: Handler<GeminiDeleteResponse> =
            jsonHandler<GeminiDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: GeminiDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeminiDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("gemini", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val patchHandler: Handler<GeminiPatchResponse> =
            jsonHandler<GeminiPatchResponse>(clientOptions.jsonMapper)

        override fun patch(
            params: GeminiPatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeminiPatchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("gemini", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { patchHandler.handle(it) }
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
