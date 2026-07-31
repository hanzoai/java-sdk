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
import ai.hanzo.api.models.responses.ResponseCreateParams
import ai.hanzo.api.models.responses.ResponseCreateResponse
import ai.hanzo.api.models.responses.ResponseDeleteParams
import ai.hanzo.api.models.responses.ResponseDeleteResponse
import ai.hanzo.api.models.responses.ResponseRetrieveParams
import ai.hanzo.api.models.responses.ResponseRetrieveResponse
import ai.hanzo.api.services.async.responses.InputItemServiceAsync
import ai.hanzo.api.services.async.responses.InputItemServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ResponseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ResponseServiceAsync {

    private val withRawResponse: ResponseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val inputItems: InputItemServiceAsync by lazy {
        InputItemServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ResponseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResponseServiceAsync =
        ResponseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun inputItems(): InputItemServiceAsync = inputItems

    override fun create(
        params: ResponseCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResponseCreateResponse> =
        // post /v1/responses
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ResponseRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResponseRetrieveResponse> =
        // get /v1/responses/{response_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ResponseDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResponseDeleteResponse> =
        // delete /v1/responses/{response_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ResponseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val inputItems: InputItemServiceAsync.WithRawResponse by lazy {
            InputItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ResponseServiceAsync.WithRawResponse =
            ResponseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun inputItems(): InputItemServiceAsync.WithRawResponse = inputItems

        private val createHandler: Handler<ResponseCreateResponse> =
            jsonHandler<ResponseCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ResponseCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResponseCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "responses")
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

        private val retrieveHandler: Handler<ResponseRetrieveResponse> =
            jsonHandler<ResponseRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ResponseRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResponseRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("responseId", params.responseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "responses", params._pathParam(0))
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

        private val deleteHandler: Handler<ResponseDeleteResponse> =
            jsonHandler<ResponseDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ResponseDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResponseDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("responseId", params.responseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "responses", params._pathParam(0))
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
    }
}
