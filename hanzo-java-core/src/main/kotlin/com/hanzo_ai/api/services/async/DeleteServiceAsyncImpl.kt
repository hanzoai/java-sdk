// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.handlers.errorHandler
import com.hanzo_ai.api.core.handlers.jsonHandler
import com.hanzo_ai.api.core.handlers.withErrorHandler
import com.hanzo_ai.api.core.http.HttpMethod
import com.hanzo_ai.api.core.http.HttpRequest
import com.hanzo_ai.api.core.http.HttpResponse.Handler
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.core.http.json
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepareAsync
import com.hanzo_ai.api.models.delete.DeleteCreateAllowedIpParams
import com.hanzo_ai.api.models.delete.DeleteCreateAllowedIpResponse
import java.util.concurrent.CompletableFuture

class DeleteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DeleteServiceAsync {

    private val withRawResponse: DeleteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeleteServiceAsync.WithRawResponse = withRawResponse

    override fun createAllowedIp(
        params: DeleteCreateAllowedIpParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeleteCreateAllowedIpResponse> =
        // post /delete/allowed_ip
        withRawResponse().createAllowedIp(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeleteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createAllowedIpHandler: Handler<DeleteCreateAllowedIpResponse> =
            jsonHandler<DeleteCreateAllowedIpResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createAllowedIp(
            params: DeleteCreateAllowedIpParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeleteCreateAllowedIpResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("delete", "allowed_ip")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
