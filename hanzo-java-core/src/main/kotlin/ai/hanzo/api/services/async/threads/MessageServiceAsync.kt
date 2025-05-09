// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.threads

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.threads.messages.MessageCreateParams
import ai.hanzo.api.models.threads.messages.MessageCreateResponse
import ai.hanzo.api.models.threads.messages.MessageListParams
import ai.hanzo.api.models.threads.messages.MessageListResponse
import com.google.errorprone.annotations.MustBeClosed
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
    fun create(threadId: String): CompletableFuture<MessageCreateResponse> =
        create(threadId, MessageCreateParams.none())

    /** @see [create] */
    fun create(
        threadId: String,
        params: MessageCreateParams = MessageCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageCreateResponse> =
        create(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see [create] */
    fun create(
        threadId: String,
        params: MessageCreateParams = MessageCreateParams.none(),
    ): CompletableFuture<MessageCreateResponse> = create(threadId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageCreateResponse>

    /** @see [create] */
    fun create(params: MessageCreateParams): CompletableFuture<MessageCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        threadId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageCreateResponse> =
        create(threadId, MessageCreateParams.none(), requestOptions)

    /**
     * Returns a list of messages for a given thread.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/messages/listMessages
     */
    fun list(threadId: String): CompletableFuture<MessageListResponse> =
        list(threadId, MessageListParams.none())

    /** @see [list] */
    fun list(
        threadId: String,
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListResponse> =
        list(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see [list] */
    fun list(
        threadId: String,
        params: MessageListParams = MessageListParams.none(),
    ): CompletableFuture<MessageListResponse> = list(threadId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListResponse>

    /** @see [list] */
    fun list(params: MessageListParams): CompletableFuture<MessageListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        threadId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageListResponse> =
        list(threadId, MessageListParams.none(), requestOptions)

    /**
     * A view of [MessageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/threads/{thread_id}/messages`, but is otherwise
         * the same as [MessageServiceAsync.create].
         */
        @MustBeClosed
        fun create(threadId: String): CompletableFuture<HttpResponseFor<MessageCreateResponse>> =
            create(threadId, MessageCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            threadId: String,
            params: MessageCreateParams = MessageCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageCreateResponse>> =
            create(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            threadId: String,
            params: MessageCreateParams = MessageCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageCreateResponse>> =
            create(threadId, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: MessageCreateParams
        ): CompletableFuture<HttpResponseFor<MessageCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            threadId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageCreateResponse>> =
            create(threadId, MessageCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/threads/{thread_id}/messages`, but is otherwise
         * the same as [MessageServiceAsync.list].
         */
        @MustBeClosed
        fun list(threadId: String): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(threadId, MessageListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            threadId: String,
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            threadId: String,
            params: MessageListParams = MessageListParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(threadId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: MessageListParams
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            threadId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(threadId, MessageListParams.none(), requestOptions)
    }
}
