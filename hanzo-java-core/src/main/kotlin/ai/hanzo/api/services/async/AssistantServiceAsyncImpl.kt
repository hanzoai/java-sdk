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
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.assistants.AssistantCreateParams
import ai.hanzo.api.models.assistants.AssistantCreateResponse
import ai.hanzo.api.models.assistants.AssistantDeleteParams
import ai.hanzo.api.models.assistants.AssistantDeleteResponse
import ai.hanzo.api.models.assistants.AssistantListParams
import ai.hanzo.api.models.assistants.AssistantListResponse
import java.util.concurrent.CompletableFuture

class AssistantServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AssistantServiceAsync {

    private val withRawResponse: AssistantServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AssistantServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: AssistantCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantCreateResponse> =
        // post /v1/assistants
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AssistantListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantListResponse> =
        // get /v1/assistants
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AssistantDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantDeleteResponse> =
        // delete /v1/assistants/{assistant_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssistantServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AssistantCreateResponse> =
            jsonHandler<AssistantCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AssistantCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "assistants")
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

        private val listHandler: Handler<AssistantListResponse> =
            jsonHandler<AssistantListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AssistantListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "assistants")
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

        private val deleteHandler: Handler<AssistantDeleteResponse> =
            jsonHandler<AssistantDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: AssistantDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "assistants", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
