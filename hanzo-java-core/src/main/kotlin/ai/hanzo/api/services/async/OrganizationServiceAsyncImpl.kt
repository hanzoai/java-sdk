// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.handlers.errorBodyHandler
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse
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
import ai.hanzo.api.models.organization.OrganizationListParams
import ai.hanzo.api.models.organization.OrganizationMembershipTable
import ai.hanzo.api.models.organization.OrganizationTableWithMembers
import ai.hanzo.api.models.organization.OrganizationUpdateMemberParams
import ai.hanzo.api.models.organization.OrganizationUpdateParams
import ai.hanzo.api.services.async.organization.InfoServiceAsync
import ai.hanzo.api.services.async.organization.InfoServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class OrganizationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OrganizationServiceAsync {

    private val withRawResponse: OrganizationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val info: InfoServiceAsync by lazy { InfoServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OrganizationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationServiceAsync =
        OrganizationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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
    ): CompletableFuture<OrganizationTableWithMembers> =
        // patch /organization/update
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: OrganizationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<OrganizationTableWithMembers>> =
        // get /organization/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<OrganizationTableWithMembers>> =
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
    ): CompletableFuture<OrganizationMembershipTable> =
        // patch /organization/member_update
        withRawResponse().updateMember(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrganizationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val info: InfoServiceAsync.WithRawResponse by lazy {
            InfoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrganizationServiceAsync.WithRawResponse =
            OrganizationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun info(): InfoServiceAsync.WithRawResponse = info

        private val createHandler: Handler<OrganizationCreateResponse> =
            jsonHandler<OrganizationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: OrganizationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("organization", "new")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<OrganizationTableWithMembers> =
            jsonHandler<OrganizationTableWithMembers>(clientOptions.jsonMapper)

        override fun update(
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationTableWithMembers>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("organization", "update")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val listHandler: Handler<List<OrganizationTableWithMembers>> =
            jsonHandler<List<OrganizationTableWithMembers>>(clientOptions.jsonMapper)

        override fun list(
            params: OrganizationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<OrganizationTableWithMembers>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("organization", "list")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val deleteHandler: Handler<List<OrganizationTableWithMembers>> =
            jsonHandler<List<OrganizationTableWithMembers>>(clientOptions.jsonMapper)

        override fun delete(
            params: OrganizationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<OrganizationTableWithMembers>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("organization", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        override fun addMember(
            params: OrganizationAddMemberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationAddMemberResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("organization", "member_add")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        override fun deleteMember(
            params: OrganizationDeleteMemberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationDeleteMemberResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("organization", "member_delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateMemberHandler: Handler<OrganizationMembershipTable> =
            jsonHandler<OrganizationMembershipTable>(clientOptions.jsonMapper)

        override fun updateMember(
            params: OrganizationUpdateMemberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationMembershipTable>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("organization", "member_update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
