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
import com.hanzo_ai.api.models.customer.CustomerBlockParams
import com.hanzo_ai.api.models.customer.CustomerBlockResponse
import com.hanzo_ai.api.models.customer.CustomerCreateParams
import com.hanzo_ai.api.models.customer.CustomerCreateResponse
import com.hanzo_ai.api.models.customer.CustomerDeleteParams
import com.hanzo_ai.api.models.customer.CustomerDeleteResponse
import com.hanzo_ai.api.models.customer.CustomerListParams
import com.hanzo_ai.api.models.customer.CustomerListResponse
import com.hanzo_ai.api.models.customer.CustomerRetrieveInfoParams
import com.hanzo_ai.api.models.customer.CustomerRetrieveInfoResponse
import com.hanzo_ai.api.models.customer.CustomerUnblockParams
import com.hanzo_ai.api.models.customer.CustomerUnblockResponse
import com.hanzo_ai.api.models.customer.CustomerUpdateParams
import com.hanzo_ai.api.models.customer.CustomerUpdateResponse
import java.util.concurrent.CompletableFuture

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val withRawResponse: CustomerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCreateResponse> =
        // post /customer/new
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerUpdateResponse> =
        // post /customer/update
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<CustomerListResponse>> =
        // get /customer/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CustomerDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerDeleteResponse> =
        // post /customer/delete
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun block(
        params: CustomerBlockParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerBlockResponse> =
        // post /customer/block
        withRawResponse().block(params, requestOptions).thenApply { it.parse() }

    override fun retrieveInfo(
        params: CustomerRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerRetrieveInfoResponse> =
        // get /customer/info
        withRawResponse().retrieveInfo(params, requestOptions).thenApply { it.parse() }

    override fun unblock(
        params: CustomerUnblockParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerUnblockResponse> =
        // post /customer/unblock
        withRawResponse().unblock(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CustomerCreateResponse> =
            jsonHandler<CustomerCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("customer", "new")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val updateHandler: Handler<CustomerUpdateResponse> =
            jsonHandler<CustomerUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("customer", "update")
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

        private val listHandler: Handler<List<CustomerListResponse>> =
            jsonHandler<List<CustomerListResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CustomerListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<CustomerListResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customer", "list")
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
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<CustomerDeleteResponse> =
            jsonHandler<CustomerDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("customer", "delete")
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

        private val blockHandler: Handler<CustomerBlockResponse> =
            jsonHandler<CustomerBlockResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun block(
            params: CustomerBlockParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerBlockResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("customer", "block")
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
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveInfoHandler: Handler<CustomerRetrieveInfoResponse> =
            jsonHandler<CustomerRetrieveInfoResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveInfo(
            params: CustomerRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerRetrieveInfoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customer", "info")
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

        private val unblockHandler: Handler<CustomerUnblockResponse> =
            jsonHandler<CustomerUnblockResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun unblock(
            params: CustomerUnblockParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerUnblockResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("customer", "unblock")
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
