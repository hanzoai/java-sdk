// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.openai.deployments

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.openai.deployments.chat.ChatCompleteParams
import ai.hanzo.api.models.openai.deployments.chat.ChatCompleteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChatServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync

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
    fun complete(
        pathModel: String,
        params: ChatCompleteParams,
    ): CompletableFuture<ChatCompleteResponse> = complete(pathModel, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        pathModel: String,
        params: ChatCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatCompleteResponse> =
        complete(params.toBuilder().pathModel(pathModel).build(), requestOptions)

    /** @see complete */
    fun complete(params: ChatCompleteParams): CompletableFuture<ChatCompleteResponse> =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: ChatCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatCompleteResponse>

    /** A view of [ChatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /openai/deployments/{model}/chat/completions`, but
         * is otherwise the same as [ChatServiceAsync.complete].
         */
        fun complete(
            pathModel: String,
            params: ChatCompleteParams,
        ): CompletableFuture<HttpResponseFor<ChatCompleteResponse>> =
            complete(pathModel, params, RequestOptions.none())

        /** @see complete */
        fun complete(
            pathModel: String,
            params: ChatCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatCompleteResponse>> =
            complete(params.toBuilder().pathModel(pathModel).build(), requestOptions)

        /** @see complete */
        fun complete(
            params: ChatCompleteParams
        ): CompletableFuture<HttpResponseFor<ChatCompleteResponse>> =
            complete(params, RequestOptions.none())

        /** @see complete */
        fun complete(
            params: ChatCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatCompleteResponse>>
    }
}
