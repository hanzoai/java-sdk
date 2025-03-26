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
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepareAsync
import ai.hanzo.api.models.organization.OrganizationAddMemberParams
import ai.hanzo.api.models.organization.OrganizationAddMemberResponse
import ai.hanzo.api.models.organization.OrganizationCreateParams
import ai.hanzo.api.models.organization.OrganizationCreateResponse
import ai.hanzo.api.models.organization.OrganizationDeleteMemberParams
import ai.hanzo.api.models.organization.OrganizationDeleteMemberResponse
import ai.hanzo.api.models.organization.OrganizationDeleteParams
import ai.hanzo.api.models.organization.OrganizationDeleteResponse
import ai.hanzo.api.models.organization.OrganizationListParams
import ai.hanzo.api.models.organization.OrganizationListResponse
import ai.hanzo.api.models.organization.OrganizationUpdateMemberParams
import ai.hanzo.api.models.organization.OrganizationUpdateMemberResponse
import ai.hanzo.api.models.organization.OrganizationUpdateParams
import ai.hanzo.api.models.organization.OrganizationUpdateResponse
import ai.hanzo.api.services.async.organization.InfoServiceAsync
import ai.hanzo.api.services.async.organization.InfoServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class OrganizationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OrganizationServiceAsync {

    private val withRawResponse: OrganizationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val info: InfoServiceAsync by lazy { InfoServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OrganizationServiceAsync.WithRawResponse = withRawResponse

    override fun info(): InfoServiceAsync = info

    override fun create(
        params: OrganizationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrganizationCreateResponse> =
        // post /organization/new
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrganizationUpdateResponse> =
        // patch /organization/update
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: OrganizationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<OrganizationListResponse>> =
        // get /organization/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<OrganizationDeleteResponse>> =
        // delete /organization/delete
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun addMember(
        params: OrganizationAddMemberParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrganizationAddMemberResponse> =
        // post /organization/member_add
        withRawResponse().addMember(params, requestOptions).thenApply { it.parse() }

    override fun deleteMember(
        params: OrganizationDeleteMemberParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrganizationDeleteMemberResponse> =
        // delete /organization/member_delete
        withRawResponse().deleteMember(params, requestOptions).thenApply { it.parse() }

    override fun updateMember(
        params: OrganizationUpdateMemberParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrganizationUpdateMemberResponse> =
        // patch /organization/member_update
        withRawResponse().updateMember(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrganizationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val info: InfoServiceAsync.WithRawResponse by lazy {
            InfoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun info(): InfoServiceAsync.WithRawResponse = info

        private val createHandler: Handler<OrganizationCreateResponse> =
            jsonHandler<OrganizationCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: OrganizationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organization", "new")
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

        private val updateHandler: Handler<OrganizationUpdateResponse> =
            jsonHandler<OrganizationUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("organization", "update")
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

        private val listHandler: Handler<List<OrganizationListResponse>> =
            jsonHandler<List<OrganizationListResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: OrganizationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<OrganizationListResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organization", "list")
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

        private val deleteHandler: Handler<List<OrganizationDeleteResponse>> =
            jsonHandler<List<OrganizationDeleteResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: OrganizationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<OrganizationDeleteResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("organization", "delete")
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
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val addMemberHandler: Handler<OrganizationAddMemberResponse> =
            jsonHandler<OrganizationAddMemberResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addMember(
            params: OrganizationAddMemberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationAddMemberResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organization", "member_add")
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

        private val deleteMemberHandler: Handler<OrganizationDeleteMemberResponse> =
            jsonHandler<OrganizationDeleteMemberResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun deleteMember(
            params: OrganizationDeleteMemberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationDeleteMemberResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("organization", "member_delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { deleteMemberHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateMemberHandler: Handler<OrganizationUpdateMemberResponse> =
            jsonHandler<OrganizationUpdateMemberResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun updateMember(
            params: OrganizationUpdateMemberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationUpdateMemberResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("organization", "member_update")
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
