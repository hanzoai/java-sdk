// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.model

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
import com.hanzo_ai.api.core.http.parseable
import com.hanzo_ai.api.core.prepareAsync
import com.hanzo_ai.api.models.model.info.InfoListParams
import com.hanzo_ai.api.models.model.info.InfoListResponse
import java.util.concurrent.CompletableFuture

class InfoServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InfoServiceAsync {

    private val withRawResponse: InfoServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InfoServiceAsync.WithRawResponse = withRawResponse

    override fun list(
        params: InfoListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InfoListResponse> =
        // get /model/info
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InfoServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<InfoListResponse> =
            jsonHandler<InfoListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: InfoListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InfoListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("model", "info")
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
