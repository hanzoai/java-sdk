// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.model

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
import ai.hanzo.api.models.model.update.UpdateFullParams
import ai.hanzo.api.models.model.update.UpdateFullResponse
import ai.hanzo.api.models.model.update.UpdatePartialParams
import ai.hanzo.api.models.model.update.UpdatePartialResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UpdateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UpdateServiceAsync {

    private val withRawResponse: UpdateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UpdateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UpdateServiceAsync =
        UpdateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun full(
        params: UpdateFullParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UpdateFullResponse> =
        // post /model/update
        withRawResponse().full(params, requestOptions).thenApply { it.parse() }

    override fun partial(
        params: UpdatePartialParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UpdatePartialResponse> =
        // patch /model/{model_id}/update
        withRawResponse().partial(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UpdateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UpdateServiceAsync.WithRawResponse =
            UpdateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val fullHandler: Handler<UpdateFullResponse> =
            jsonHandler<UpdateFullResponse>(clientOptions.jsonMapper)

        override fun full(
            params: UpdateFullParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UpdateFullResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("model", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { fullHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val partialHandler: Handler<UpdatePartialResponse> =
            jsonHandler<UpdatePartialResponse>(clientOptions.jsonMapper)

        override fun partial(
            params: UpdatePartialParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UpdatePartialResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("modelId", params.modelId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("model", params._pathParam(0), "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { partialHandler.handle(it) }
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
