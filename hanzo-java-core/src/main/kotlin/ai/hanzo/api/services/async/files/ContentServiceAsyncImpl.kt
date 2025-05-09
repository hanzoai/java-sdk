// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.files

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
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.files.content.ContentRetrieveParams
import ai.hanzo.api.models.files.content.ContentRetrieveResponse
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class ContentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ContentServiceAsync {

    private val withRawResponse: ContentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContentServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: ContentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContentRetrieveResponse> =
        // get /{provider}/v1/files/{file_id}/content
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ContentRetrieveResponse> =
            jsonHandler<ContentRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ContentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContentRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        params._pathParam(0),
                        "v1",
                        "files",
                        params._pathParam(1),
                        "content",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
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
