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
import ai.hanzo.api.models.active.ActiveListCallbacksParams
import ai.hanzo.api.models.active.ActiveListCallbacksResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ActiveServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActiveServiceAsync {

    private val withRawResponse: ActiveServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActiveServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActiveServiceAsync =
        ActiveServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listCallbacks(
        params: ActiveListCallbacksParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActiveListCallbacksResponse> =
        // get /active/callbacks
        withRawResponse().listCallbacks(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActiveServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActiveServiceAsync.WithRawResponse =
            ActiveServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listCallbacksHandler: Handler<ActiveListCallbacksResponse> =
            jsonHandler<ActiveListCallbacksResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listCallbacks(
            params: ActiveListCallbacksParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActiveListCallbacksResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "callbacks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listCallbacksHandler.handle(it) }
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
