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
import com.hanzo_ai.api.models.user.UserCreateParams
import com.hanzo_ai.api.models.user.UserCreateResponse
import com.hanzo_ai.api.models.user.UserDeleteParams
import com.hanzo_ai.api.models.user.UserDeleteResponse
import com.hanzo_ai.api.models.user.UserListParams
import com.hanzo_ai.api.models.user.UserListResponse
import com.hanzo_ai.api.models.user.UserRetrieveInfoParams
import com.hanzo_ai.api.models.user.UserRetrieveInfoResponse
import com.hanzo_ai.api.models.user.UserUpdateParams
import com.hanzo_ai.api.models.user.UserUpdateResponse
import java.util.concurrent.CompletableFuture

class UserServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserCreateResponse> =
        // post /user/new
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserUpdateResponse> =
        // post /user/update
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: UserListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserListResponse> =
        // get /user/get_users
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserDeleteResponse> =
        // post /user/delete
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveInfo(
        params: UserRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserRetrieveInfoResponse> =
        // get /user/info
        withRawResponse().retrieveInfo(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<UserCreateResponse> =
            jsonHandler<UserCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("user", "new")
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

        private val updateHandler: Handler<UserUpdateResponse> =
            jsonHandler<UserUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("user", "update")
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

        private val listHandler: Handler<UserListResponse> =
            jsonHandler<UserListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: UserListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("user", "get_users")
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

        private val deleteHandler: Handler<UserDeleteResponse> =
            jsonHandler<UserDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("user", "delete")
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

        private val retrieveInfoHandler: Handler<UserRetrieveInfoResponse> =
            jsonHandler<UserRetrieveInfoResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveInfo(
            params: UserRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserRetrieveInfoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("user", "info")
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
    }
}
