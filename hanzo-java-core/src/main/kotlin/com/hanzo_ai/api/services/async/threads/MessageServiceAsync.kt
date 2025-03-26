// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.threads

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.threads.messages.MessageCreateParams
import com.hanzo_ai.api.models.threads.messages.MessageCreateResponse
import com.hanzo_ai.api.models.threads.messages.MessageListParams
import com.hanzo_ai.api.models.threads.messages.MessageListResponse
import java.util.concurrent.CompletableFuture

interface MessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a message.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/messages/createMessage
     */
    fun create(params: MessageCreateParams): CompletableFuture<MessageCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageCreateResponse>

    /**
     * Returns a list of messages for a given thread.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/messages/listMessages
     */
    fun list(params: MessageListParams): CompletableFuture<MessageListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListResponse>

    /**
     * A view of [MessageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/threads/{thread_id}/messages`, but is otherwise
         * the same as [MessageServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: MessageCreateParams
        ): CompletableFuture<HttpResponseFor<MessageCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/threads/{thread_id}/messages`, but is otherwise
         * the same as [MessageServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: MessageListParams
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListResponse>>
    }
}
