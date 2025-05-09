// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.engines

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
import ai.hanzo.api.models.engines.chat.ChatCompleteParams
import ai.hanzo.api.models.engines.chat.ChatCompleteResponse
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class ChatServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChatServiceAsync {

    private val withRawResponse: ChatServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChatServiceAsync.WithRawResponse = withRawResponse

    override fun complete(
        params: ChatCompleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatCompleteResponse> =
        // post /engines/{model}/chat/completions
        withRawResponse().complete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val completeHandler: Handler<ChatCompleteResponse> =
            jsonHandler<ChatCompleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun complete(
            params: ChatCompleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatCompleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("model", params.model().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("engines", params._pathParam(0), "chat", "completions")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { completeHandler.handle(it) }
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
