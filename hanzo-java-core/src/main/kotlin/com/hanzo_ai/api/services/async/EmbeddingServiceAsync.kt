// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.embeddings.EmbeddingCreateParams
import com.hanzo_ai.api.models.embeddings.EmbeddingCreateResponse
import java.util.concurrent.CompletableFuture

interface EmbeddingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Follows the exact same API spec as `OpenAI's Embeddings API
     * https://platform.openai.com/docs/api-reference/embeddings`
     *
     * ```bash
     * curl -X POST http://localhost:4000/v1/embeddings
     * -H "Content-Type: application/json"
     * -H "Authorization: Bearer sk-1234"
     * -d '{
     *     "model": "text-embedding-ada-002",
     *     "input": "The quick brown fox jumps over the lazy dog"
     * }'
     * ```
     */
    fun create(): CompletableFuture<EmbeddingCreateResponse> = create(EmbeddingCreateParams.none())

    /** @see [create] */
    fun create(
        params: EmbeddingCreateParams = EmbeddingCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddingCreateResponse>

    /** @see [create] */
    fun create(
        params: EmbeddingCreateParams = EmbeddingCreateParams.none()
    ): CompletableFuture<EmbeddingCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<EmbeddingCreateResponse> =
        create(EmbeddingCreateParams.none(), requestOptions)

    /**
     * A view of [EmbeddingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /embeddings`, but is otherwise the same as
         * [EmbeddingServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<EmbeddingCreateResponse>> =
            create(EmbeddingCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EmbeddingCreateParams = EmbeddingCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddingCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EmbeddingCreateParams = EmbeddingCreateParams.none()
        ): CompletableFuture<HttpResponseFor<EmbeddingCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmbeddingCreateResponse>> =
            create(EmbeddingCreateParams.none(), requestOptions)
    }
}
