// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.assistants.AssistantCreateParams
import ai.hanzo.api.models.assistants.AssistantCreateResponse
import ai.hanzo.api.models.assistants.AssistantDeleteParams
import ai.hanzo.api.models.assistants.AssistantDeleteResponse
import ai.hanzo.api.models.assistants.AssistantListParams
import ai.hanzo.api.models.assistants.AssistantListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AssistantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssistantServiceAsync

    /**
     * Create assistant
     *
     * API Reference docs -
     * https://platform.openai.com/docs/api-reference/assistants/createAssistant
     */
    fun create(): CompletableFuture<AssistantCreateResponse> = create(AssistantCreateParams.none())

    /** @see create */
    fun create(
        params: AssistantCreateParams = AssistantCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantCreateResponse>

    /** @see create */
    fun create(
        params: AssistantCreateParams = AssistantCreateParams.none()
    ): CompletableFuture<AssistantCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<AssistantCreateResponse> =
        create(AssistantCreateParams.none(), requestOptions)

    /**
     * Returns a list of assistants.
     *
     * API Reference docs - https://platform.openai.com/docs/api-reference/assistants/listAssistants
     */
    fun list(): CompletableFuture<AssistantListResponse> = list(AssistantListParams.none())

    /** @see list */
    fun list(
        params: AssistantListParams = AssistantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantListResponse>

    /** @see list */
    fun list(
        params: AssistantListParams = AssistantListParams.none()
    ): CompletableFuture<AssistantListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AssistantListResponse> =
        list(AssistantListParams.none(), requestOptions)

    /**
     * Delete assistant
     *
     * API Reference docs -
     * https://platform.openai.com/docs/api-reference/assistants/createAssistant
     */
    fun delete(assistantId: String): CompletableFuture<AssistantDeleteResponse> =
        delete(assistantId, AssistantDeleteParams.none())

    /** @see delete */
    fun delete(
        assistantId: String,
        params: AssistantDeleteParams = AssistantDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantDeleteResponse> =
        delete(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see delete */
    fun delete(
        assistantId: String,
        params: AssistantDeleteParams = AssistantDeleteParams.none(),
    ): CompletableFuture<AssistantDeleteResponse> =
        delete(assistantId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssistantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantDeleteResponse>

    /** @see delete */
    fun delete(params: AssistantDeleteParams): CompletableFuture<AssistantDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantDeleteResponse> =
        delete(assistantId, AssistantDeleteParams.none(), requestOptions)

    /**
     * A view of [AssistantServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssistantServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/assistants`, but is otherwise the same as
         * [AssistantServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<AssistantCreateResponse>> =
            create(AssistantCreateParams.none())

        /** @see create */
        fun create(
            params: AssistantCreateParams = AssistantCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantCreateResponse>>

        /** @see create */
        fun create(
            params: AssistantCreateParams = AssistantCreateParams.none()
        ): CompletableFuture<HttpResponseFor<AssistantCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AssistantCreateResponse>> =
            create(AssistantCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/assistants`, but is otherwise the same as
         * [AssistantServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AssistantListResponse>> =
            list(AssistantListParams.none())

        /** @see list */
        fun list(
            params: AssistantListParams = AssistantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantListResponse>>

        /** @see list */
        fun list(
            params: AssistantListParams = AssistantListParams.none()
        ): CompletableFuture<HttpResponseFor<AssistantListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AssistantListResponse>> =
            list(AssistantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/assistants/{assistant_id}`, but is otherwise
         * the same as [AssistantServiceAsync.delete].
         */
        fun delete(
            assistantId: String
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> =
            delete(assistantId, AssistantDeleteParams.none())

        /** @see delete */
        fun delete(
            assistantId: String,
            params: AssistantDeleteParams = AssistantDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> =
            delete(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see delete */
        fun delete(
            assistantId: String,
            params: AssistantDeleteParams = AssistantDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> =
            delete(assistantId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AssistantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>>

        /** @see delete */
        fun delete(
            params: AssistantDeleteParams
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> =
            delete(assistantId, AssistantDeleteParams.none(), requestOptions)
    }
}
