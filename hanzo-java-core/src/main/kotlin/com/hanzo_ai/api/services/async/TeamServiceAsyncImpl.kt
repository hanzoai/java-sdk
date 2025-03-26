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
import com.hanzo_ai.api.models.team.TeamAddMemberParams
import com.hanzo_ai.api.models.team.TeamAddMemberResponse
import com.hanzo_ai.api.models.team.TeamBlockParams
import com.hanzo_ai.api.models.team.TeamBlockResponse
import com.hanzo_ai.api.models.team.TeamCreateParams
import com.hanzo_ai.api.models.team.TeamCreateResponse
import com.hanzo_ai.api.models.team.TeamDeleteParams
import com.hanzo_ai.api.models.team.TeamDeleteResponse
import com.hanzo_ai.api.models.team.TeamDisableLoggingParams
import com.hanzo_ai.api.models.team.TeamDisableLoggingResponse
import com.hanzo_ai.api.models.team.TeamListAvailableParams
import com.hanzo_ai.api.models.team.TeamListAvailableResponse
import com.hanzo_ai.api.models.team.TeamListParams
import com.hanzo_ai.api.models.team.TeamListResponse
import com.hanzo_ai.api.models.team.TeamRemoveMemberParams
import com.hanzo_ai.api.models.team.TeamRemoveMemberResponse
import com.hanzo_ai.api.models.team.TeamRetrieveInfoParams
import com.hanzo_ai.api.models.team.TeamRetrieveInfoResponse
import com.hanzo_ai.api.models.team.TeamUnblockParams
import com.hanzo_ai.api.models.team.TeamUnblockResponse
import com.hanzo_ai.api.models.team.TeamUpdateMemberParams
import com.hanzo_ai.api.models.team.TeamUpdateMemberResponse
import com.hanzo_ai.api.models.team.TeamUpdateParams
import com.hanzo_ai.api.models.team.TeamUpdateResponse
import com.hanzo_ai.api.services.async.team.CallbackServiceAsync
import com.hanzo_ai.api.services.async.team.CallbackServiceAsyncImpl
import com.hanzo_ai.api.services.async.team.ModelServiceAsync
import com.hanzo_ai.api.services.async.team.ModelServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class TeamServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TeamServiceAsync {

    private val withRawResponse: TeamServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val model: ModelServiceAsync by lazy { ModelServiceAsyncImpl(clientOptions) }

    private val callback: CallbackServiceAsync by lazy { CallbackServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TeamServiceAsync.WithRawResponse = withRawResponse

    override fun model(): ModelServiceAsync = model

    override fun callback(): CallbackServiceAsync = callback

    override fun create(
        params: TeamCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamCreateResponse> =
        // post /team/new
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TeamUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamUpdateResponse> =
        // post /team/update
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TeamListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamListResponse> =
        // get /team/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TeamDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamDeleteResponse> =
        // post /team/delete
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun addMember(
        params: TeamAddMemberParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamAddMemberResponse> =
        // post /team/member_add
        withRawResponse().addMember(params, requestOptions).thenApply { it.parse() }

    override fun block(
        params: TeamBlockParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamBlockResponse> =
        // post /team/block
        withRawResponse().block(params, requestOptions).thenApply { it.parse() }

    override fun disableLogging(
        params: TeamDisableLoggingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamDisableLoggingResponse> =
        // post /team/{team_id}/disable_logging
        withRawResponse().disableLogging(params, requestOptions).thenApply { it.parse() }

    override fun listAvailable(
        params: TeamListAvailableParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamListAvailableResponse> =
        // get /team/available
        withRawResponse().listAvailable(params, requestOptions).thenApply { it.parse() }

    override fun removeMember(
        params: TeamRemoveMemberParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamRemoveMemberResponse> =
        // post /team/member_delete
        withRawResponse().removeMember(params, requestOptions).thenApply { it.parse() }

    override fun retrieveInfo(
        params: TeamRetrieveInfoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamRetrieveInfoResponse> =
        // get /team/info
        withRawResponse().retrieveInfo(params, requestOptions).thenApply { it.parse() }

    override fun unblock(
        params: TeamUnblockParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamUnblockResponse> =
        // post /team/unblock
        withRawResponse().unblock(params, requestOptions).thenApply { it.parse() }

    override fun updateMember(
        params: TeamUpdateMemberParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamUpdateMemberResponse> =
        // post /team/member_update
        withRawResponse().updateMember(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TeamServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val model: ModelServiceAsync.WithRawResponse by lazy {
            ModelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val callback: CallbackServiceAsync.WithRawResponse by lazy {
            CallbackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun model(): ModelServiceAsync.WithRawResponse = model

        override fun callback(): CallbackServiceAsync.WithRawResponse = callback

        private val createHandler: Handler<TeamCreateResponse> =
            jsonHandler<TeamCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: TeamCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "new")
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

        private val updateHandler: Handler<TeamUpdateResponse> =
            jsonHandler<TeamUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: TeamUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "update")
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

        private val listHandler: Handler<TeamListResponse> =
            jsonHandler<TeamListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: TeamListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("team", "list")
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

        private val deleteHandler: Handler<TeamDeleteResponse> =
            jsonHandler<TeamDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: TeamDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "delete")
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

        private val addMemberHandler: Handler<TeamAddMemberResponse> =
            jsonHandler<TeamAddMemberResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addMember(
            params: TeamAddMemberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamAddMemberResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "member_add")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { addMemberHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val blockHandler: Handler<TeamBlockResponse> =
            jsonHandler<TeamBlockResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun block(
            params: TeamBlockParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamBlockResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "block")
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

        private val disableLoggingHandler: Handler<TeamDisableLoggingResponse> =
            jsonHandler<TeamDisableLoggingResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun disableLogging(
            params: TeamDisableLoggingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamDisableLoggingResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", params._pathParam(0), "disable_logging")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { disableLoggingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listAvailableHandler: Handler<TeamListAvailableResponse> =
            jsonHandler<TeamListAvailableResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listAvailable(
            params: TeamListAvailableParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamListAvailableResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("team", "available")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listAvailableHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val removeMemberHandler: Handler<TeamRemoveMemberResponse> =
            jsonHandler<TeamRemoveMemberResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun removeMember(
            params: TeamRemoveMemberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamRemoveMemberResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "member_delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { removeMemberHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveInfoHandler: Handler<TeamRetrieveInfoResponse> =
            jsonHandler<TeamRetrieveInfoResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveInfo(
            params: TeamRetrieveInfoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamRetrieveInfoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("team", "info")
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

        private val unblockHandler: Handler<TeamUnblockResponse> =
            jsonHandler<TeamUnblockResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun unblock(
            params: TeamUnblockParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamUnblockResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "unblock")
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

        private val updateMemberHandler: Handler<TeamUpdateMemberResponse> =
            jsonHandler<TeamUpdateMemberResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun updateMember(
            params: TeamUpdateMemberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamUpdateMemberResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("team", "member_update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateMemberHandler.handle(it) }
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
