// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.threads

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
import ai.hanzo.api.models.threads.messages.MessageCreateParams
import ai.hanzo.api.models.threads.messages.MessageCreateResponse
import ai.hanzo.api.models.threads.messages.MessageListParams
import ai.hanzo.api.models.threads.messages.MessageListResponse
import java.util.concurrent.CompletableFuture

class MessageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MessageServiceAsync {

    private val withRawResponse: MessageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessageServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: MessageCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageCreateResponse> =
        // post /v1/threads/{thread_id}/messages
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MessageListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageListResponse> =
        // get /v1/threads/{thread_id}/messages
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<MessageCreateResponse> =
            jsonHandler<MessageCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: MessageCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "threads", params._pathParam(0), "messages")
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

        private val listHandler: Handler<MessageListResponse> =
            jsonHandler<MessageListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: MessageListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "threads", params._pathParam(0), "messages")
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
