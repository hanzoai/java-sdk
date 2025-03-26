// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.assistants.AssistantCreateParams
import com.hanzo_ai.api.models.assistants.AssistantCreateResponse
import com.hanzo_ai.api.models.assistants.AssistantDeleteParams
import com.hanzo_ai.api.models.assistants.AssistantDeleteResponse
import com.hanzo_ai.api.models.assistants.AssistantListParams
import com.hanzo_ai.api.models.assistants.AssistantListResponse
import java.util.concurrent.CompletableFuture

interface AssistantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create assistant
     *
     * API Reference docs -
     * https://platform.openai.com/docs/api-reference/assistants/createAssistant
     */
    fun create(): CompletableFuture<AssistantCreateResponse> = create(AssistantCreateParams.none())

    /** @see [create] */
    fun create(
        params: AssistantCreateParams = AssistantCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantCreateResponse>

    /** @see [create] */
    fun create(
        params: AssistantCreateParams = AssistantCreateParams.none()
    ): CompletableFuture<AssistantCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<AssistantCreateResponse> =
        create(AssistantCreateParams.none(), requestOptions)

    /**
     * Returns a list of assistants.
     *
     * API Reference docs - https://platform.openai.com/docs/api-reference/assistants/listAssistants
     */
    fun list(): CompletableFuture<AssistantListResponse> = list(AssistantListParams.none())

    /** @see [list] */
    fun list(
        params: AssistantListParams = AssistantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantListResponse>

    /** @see [list] */
    fun list(
        params: AssistantListParams = AssistantListParams.none()
    ): CompletableFuture<AssistantListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AssistantListResponse> =
        list(AssistantListParams.none(), requestOptions)

    /**
     * Delete assistant
     *
     * API Reference docs -
     * https://platform.openai.com/docs/api-reference/assistants/createAssistant
     */
    fun delete(params: AssistantDeleteParams): CompletableFuture<AssistantDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AssistantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantDeleteResponse>

    /**
     * A view of [AssistantServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/assistants`, but is otherwise the same as
         * [AssistantServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<AssistantCreateResponse>> =
            create(AssistantCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AssistantCreateParams = AssistantCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AssistantCreateParams = AssistantCreateParams.none()
        ): CompletableFuture<HttpResponseFor<AssistantCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AssistantCreateResponse>> =
            create(AssistantCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/assistants`, but is otherwise the same as
         * [AssistantServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AssistantListResponse>> =
            list(AssistantListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AssistantListParams = AssistantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AssistantListParams = AssistantListParams.none()
        ): CompletableFuture<HttpResponseFor<AssistantListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AssistantListResponse>> =
            list(AssistantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/assistants/{assistant_id}`, but is otherwise
         * the same as [AssistantServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: AssistantDeleteParams
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AssistantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>>
    }
}
