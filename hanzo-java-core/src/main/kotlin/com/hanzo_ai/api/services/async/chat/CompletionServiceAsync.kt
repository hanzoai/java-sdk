// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.chat

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.chat.completions.CompletionCreateParams
import com.hanzo_ai.api.models.chat.completions.CompletionCreateResponse
import java.util.concurrent.CompletableFuture

interface CompletionServiceAsync {

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
    fun create(): CompletableFuture<CompletionCreateResponse> =
        create(CompletionCreateParams.none())

    /** @see [create] */
    fun create(
        params: CompletionCreateParams = CompletionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompletionCreateResponse>

    /** @see [create] */
    fun create(
        params: CompletionCreateParams = CompletionCreateParams.none()
    ): CompletableFuture<CompletionCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<CompletionCreateResponse> =
        create(CompletionCreateParams.none(), requestOptions)

    /**
     * A view of [CompletionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/chat/completions`, but is otherwise the same as
         * [CompletionServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<CompletionCreateResponse>> =
            create(CompletionCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CompletionCreateParams = CompletionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompletionCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CompletionCreateParams = CompletionCreateParams.none()
        ): CompletableFuture<HttpResponseFor<CompletionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CompletionCreateResponse>> =
            create(CompletionCreateParams.none(), requestOptions)
    }
}
