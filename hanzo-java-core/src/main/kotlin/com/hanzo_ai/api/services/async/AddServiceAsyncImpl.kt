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
import com.hanzo_ai.api.models.add.AddAddAllowedIpParams
import com.hanzo_ai.api.models.add.AddAddAllowedIpResponse
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
