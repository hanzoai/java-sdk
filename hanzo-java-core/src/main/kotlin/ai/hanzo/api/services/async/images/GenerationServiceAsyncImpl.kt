// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.images

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
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
import ai.hanzo.api.models.images.generations.GenerationCreateParams
import ai.hanzo.api.models.images.generations.GenerationCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class GenerationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GenerationServiceAsync {

    private val withRawResponse: GenerationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GenerationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GenerationServiceAsync =
        GenerationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GenerationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GenerationCreateResponse> =
        // post /v1/images/generations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GenerationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GenerationServiceAsync.WithRawResponse =
            GenerationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<GenerationCreateResponse> =
            jsonHandler<GenerationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GenerationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GenerationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "images", "generations")
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
    }
}
