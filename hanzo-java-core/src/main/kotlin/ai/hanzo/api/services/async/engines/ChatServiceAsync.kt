// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.engines

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.engines.chat.ChatCompleteParams
import ai.hanzo.api.models.engines.chat.ChatCompleteResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface ChatServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Follows the exact same API spec as `OpenAI's Chat API
     * https://platform.openai.com/docs/api-reference/chat`
     *
     * ```bash
     * curl -X POST http://localhost:4000/v1/chat/completions
     * -H "Content-Type: application/json"
     * -H "Authorization: Bearer sk-1234"
     * -d '{
     *     "model": "gpt-4o",
     *     "messages": [
     *         {
     *             "role": "user",
     *             "content": "Hello!"
     *         }
     *     ]
     * }'
     * ```
     */
    fun complete(model: String): CompletableFuture<ChatCompleteResponse> =
        complete(model, ChatCompleteParams.none())

    /** @see [complete] */
    fun complete(
        model: String,
        params: ChatCompleteParams = ChatCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatCompleteResponse> =
        complete(params.toBuilder().model(model).build(), requestOptions)

    /** @see [complete] */
    fun complete(
        model: String,
        params: ChatCompleteParams = ChatCompleteParams.none(),
    ): CompletableFuture<ChatCompleteResponse> = complete(model, params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        params: ChatCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatCompleteResponse>

    /** @see [complete] */
    fun complete(params: ChatCompleteParams): CompletableFuture<ChatCompleteResponse> =
        complete(params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        model: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatCompleteResponse> =
        complete(model, ChatCompleteParams.none(), requestOptions)

    /** A view of [ChatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /engines/{model}/chat/completions`, but is
         * otherwise the same as [ChatServiceAsync.complete].
         */
        @MustBeClosed
        fun complete(model: String): CompletableFuture<HttpResponseFor<ChatCompleteResponse>> =
            complete(model, ChatCompleteParams.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            model: String,
            params: ChatCompleteParams = ChatCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatCompleteResponse>> =
            complete(params.toBuilder().model(model).build(), requestOptions)

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            model: String,
            params: ChatCompleteParams = ChatCompleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ChatCompleteResponse>> =
            complete(model, params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            params: ChatCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatCompleteResponse>>

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            params: ChatCompleteParams
        ): CompletableFuture<HttpResponseFor<ChatCompleteResponse>> =
            complete(params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            model: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatCompleteResponse>> =
            complete(model, ChatCompleteParams.none(), requestOptions)
    }
}
