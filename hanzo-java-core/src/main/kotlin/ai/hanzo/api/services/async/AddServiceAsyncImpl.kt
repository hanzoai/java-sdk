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
import ai.hanzo.api.models.add.AddAddAllowedIpParams
import ai.hanzo.api.models.add.AddAddAllowedIpResponse
import java.util.concurrent.CompletableFuture

class AddServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AddServiceAsync {

    private val withRawResponse: AddServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AddServiceAsync.WithRawResponse = withRawResponse

    override fun addAllowedIp(
        params: AddAddAllowedIpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddAddAllowedIpResponse> =
        // post /add/allowed_ip
        withRawResponse().addAllowedIp(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AddServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val addAllowedIpHandler: Handler<AddAddAllowedIpResponse> =
            jsonHandler<AddAddAllowedIpResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addAllowedIp(
            params: AddAddAllowedIpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddAddAllowedIpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("add", "allowed_ip")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { addAllowedIpHandler.handle(it) }
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
