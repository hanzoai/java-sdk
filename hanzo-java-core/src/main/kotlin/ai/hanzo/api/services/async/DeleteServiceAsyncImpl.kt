// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

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
import ai.hanzo.api.models.delete.DeleteCreateAllowedIpParams
import ai.hanzo.api.models.delete.DeleteCreateAllowedIpResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class DeleteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DeleteServiceAsync {

    private val withRawResponse: DeleteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeleteServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeleteServiceAsync =
        DeleteServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createAllowedIp(
        params: DeleteCreateAllowedIpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeleteCreateAllowedIpResponse> =
        // post /delete/allowed_ip
        withRawResponse().createAllowedIp(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeleteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeleteServiceAsync.WithRawResponse =
            DeleteServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createAllowedIpHandler: Handler<DeleteCreateAllowedIpResponse> =
            jsonHandler<DeleteCreateAllowedIpResponse>(clientOptions.jsonMapper)

        override fun createAllowedIp(
            params: DeleteCreateAllowedIpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeleteCreateAllowedIpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("delete", "allowed_ip")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createAllowedIpHandler.handle(it) }
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
