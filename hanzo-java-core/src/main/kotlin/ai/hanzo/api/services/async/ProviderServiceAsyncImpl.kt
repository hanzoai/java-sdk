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
import ai.hanzo.api.models.provider.ProviderListBudgetsParams
import ai.hanzo.api.models.provider.ProviderListBudgetsResponse
import java.util.concurrent.CompletableFuture

class ProviderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProviderServiceAsync {

    private val withRawResponse: ProviderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProviderServiceAsync.WithRawResponse = withRawResponse

    override fun listBudgets(
        params: ProviderListBudgetsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProviderListBudgetsResponse> =
        // get /provider/budgets
        withRawResponse().listBudgets(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProviderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listBudgetsHandler: Handler<ProviderListBudgetsResponse> =
            jsonHandler<ProviderListBudgetsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listBudgets(
            params: ProviderListBudgetsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProviderListBudgetsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("provider", "budgets")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listBudgetsHandler.handle(it) }
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
