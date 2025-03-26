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
import com.hanzo_ai.api.models.key.GenerateKeyResponse
import com.hanzo_ai.api.models.key.KeyBlockParams
import com.hanzo_ai.api.models.key.KeyBlockResponse
import com.hanzo_ai.api.models.key.KeyCheckHealthParams
import com.hanzo_ai.api.models.key.KeyCheckHealthResponse
import com.hanzo_ai.api.models.key.KeyDeleteParams
import com.hanzo_ai.api.models.key.KeyDeleteResponse
import com.hanzo_ai.api.models.key.KeyGenerateParams
import com.hanzo_ai.api.models.key.KeyListParams
import com.hanzo_ai.api.models.key.KeyListResponse
import com.hanzo_ai.api.models.key.KeyRegenerateByKeyParams
import com.hanzo_ai.api.models.key.KeyRetrieveInfoParams
import com.hanzo_ai.api.models.key.KeyRetrieveInfoResponse
import com.hanzo_ai.api.models.key.KeyUnblockParams
import com.hanzo_ai.api.models.key.KeyUnblockResponse
import com.hanzo_ai.api.models.key.KeyUpdateParams
import com.hanzo_ai.api.models.key.KeyUpdateResponse
import com.hanzo_ai.api.services.async.key.RegenerateServiceAsync
import com.hanzo_ai.api.services.async.key.RegenerateServiceAsyncImpl
import java.util.Optional
import java.util.concurrent.CompletableFuture

class KeyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    KeyServiceAsync {

    private val withRawResponse: KeyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val regenerate: RegenerateServiceAsync by lazy {
        RegenerateServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): KeyServiceAsync.WithRawResponse = withRawResponse

    override fun regenerate(): RegenerateServiceAsync = regenerate

    override fun update(
        params: KeyUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KeyUpdateResponse> =
        // post /key/update
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: KeyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KeyListResponse> =
        // get /key/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: KeyDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KeyDeleteResponse> =
        // post /key/delete
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun block(
        params: KeyBlockParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Optional<KeyBlockResponse>> =
        // post /key/block
        withRawResponse().block(params, requestOptions).thenApply { it.parse() }

    override fun checkHealth(
        params: KeyCheckHealthParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KeyCheckHealthResponse> =
        // post /key/health
        withRawResponse().checkHealth(params, requestOptions).thenApply { it.parse() }

    override fun generate(
        params: KeyGenerateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GenerateKeyResponse> =
        // post /key/generate
        withRawResponse().generate(params, requestOptions).thenApply { it.parse() }

    override fun regenerateByKey(
        params: KeyRegenerateByKeyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Optional<GenerateKeyResponse>> =
        // post /key/{key}/regenerate
        withRawResponse().regenerateByKey(params, requestOptions).thenApply { it.parse() }

    override fun retrieveInfo(
        params: KeyRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KeyRetrieveInfoResponse> =
        // get /key/info
        withRawResponse().retrieveInfo(params, requestOptions).thenApply { it.parse() }

    override fun unblock(
        params: KeyUnblockParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<KeyUnblockResponse> =
        // post /key/unblock
        withRawResponse().unblock(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KeyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val regenerate: RegenerateServiceAsync.WithRawResponse by lazy {
            RegenerateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun regenerate(): RegenerateServiceAsync.WithRawResponse = regenerate

        private val updateHandler: Handler<KeyUpdateResponse> =
            jsonHandler<KeyUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: KeyUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KeyUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<KeyListResponse> =
            jsonHandler<KeyListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: KeyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KeyListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("key", "list")
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

        private val deleteHandler: Handler<KeyDeleteResponse> =
            jsonHandler<KeyDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: KeyDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KeyDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val blockHandler: Handler<Optional<KeyBlockResponse>> =
            jsonHandler<Optional<KeyBlockResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun block(
            params: KeyBlockParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Optional<KeyBlockResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", "block")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { blockHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.ifPresent { it.validate() }
                                }
                            }
                    }
                }
        }

        private val checkHealthHandler: Handler<KeyCheckHealthResponse> =
            jsonHandler<KeyCheckHealthResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun checkHealth(
            params: KeyCheckHealthParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KeyCheckHealthResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", "health")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { checkHealthHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val generateHandler: Handler<GenerateKeyResponse> =
            jsonHandler<GenerateKeyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun generate(
            params: KeyGenerateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GenerateKeyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", "generate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { generateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val regenerateByKeyHandler: Handler<Optional<GenerateKeyResponse>> =
            jsonHandler<Optional<GenerateKeyResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun regenerateByKey(
            params: KeyRegenerateByKeyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Optional<GenerateKeyResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", params._pathParam(0), "regenerate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { regenerateByKeyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.ifPresent { it.validate() }
                                }
                            }
                    }
                }
        }

        private val retrieveInfoHandler: Handler<KeyRetrieveInfoResponse> =
            jsonHandler<KeyRetrieveInfoResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveInfo(
            params: KeyRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KeyRetrieveInfoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("key", "info")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveInfoHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unblockHandler: Handler<KeyUnblockResponse> =
            jsonHandler<KeyUnblockResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun unblock(
            params: KeyUnblockParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<KeyUnblockResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("key", "unblock")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { unblockHandler.handle(it) }
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
