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
import ai.hanzo.api.core.http.multipartFormData
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.files.FileCreateParams
import ai.hanzo.api.models.files.FileCreateResponse
import ai.hanzo.api.models.files.FileDeleteParams
import ai.hanzo.api.models.files.FileDeleteResponse
import ai.hanzo.api.models.files.FileListParams
import ai.hanzo.api.models.files.FileListResponse
import ai.hanzo.api.models.files.FileRetrieveParams
import ai.hanzo.api.models.files.FileRetrieveResponse
import ai.hanzo.api.services.async.files.ContentServiceAsync
import ai.hanzo.api.services.async.files.ContentServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class FileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FileServiceAsync {

    private val withRawResponse: FileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val content: ContentServiceAsync by lazy { ContentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FileServiceAsync.WithRawResponse = withRawResponse

    override fun content(): ContentServiceAsync = content

    override fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileCreateResponse> =
        // post /{provider}/v1/files
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileRetrieveResponse> =
        // get /{provider}/v1/files/{file_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FileListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileListResponse> =
        // get /{provider}/v1/files
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileDeleteResponse> =
        // delete /{provider}/v1/files/{file_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val content: ContentServiceAsync.WithRawResponse by lazy {
            ContentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun content(): ContentServiceAsync.WithRawResponse = content

        private val createHandler: Handler<FileCreateResponse> =
            jsonHandler<FileCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(params._pathParam(0), "v1", "files")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val retrieveHandler: Handler<FileRetrieveResponse> =
            jsonHandler<FileRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(params._pathParam(0), "v1", "files", params._pathParam(1))
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

        private val listHandler: Handler<FileListResponse> =
            jsonHandler<FileListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: FileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(params._pathParam(0), "v1", "files")
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

        private val deleteHandler: Handler<FileDeleteResponse> =
            jsonHandler<FileDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(params._pathParam(0), "v1", "files", params._pathParam(1))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
