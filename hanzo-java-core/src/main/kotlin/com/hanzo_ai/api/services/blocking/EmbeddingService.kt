// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.embeddings.EmbeddingCreateParams
import com.hanzo_ai.api.models.embeddings.EmbeddingCreateResponse

interface EmbeddingService {

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
    fun create(): EmbeddingCreateResponse = create(EmbeddingCreateParams.none())

    /** @see [create] */
    fun create(
        params: EmbeddingCreateParams = EmbeddingCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddingCreateResponse

    /** @see [create] */
    fun create(
        params: EmbeddingCreateParams = EmbeddingCreateParams.none()
    ): EmbeddingCreateResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): EmbeddingCreateResponse =
        create(EmbeddingCreateParams.none(), requestOptions)

    /** A view of [EmbeddingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /embeddings`, but is otherwise the same as
         * [EmbeddingService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<EmbeddingCreateResponse> =
            create(EmbeddingCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EmbeddingCreateParams = EmbeddingCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddingCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EmbeddingCreateParams = EmbeddingCreateParams.none()
        ): HttpResponseFor<EmbeddingCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<EmbeddingCreateResponse> =
            create(EmbeddingCreateParams.none(), requestOptions)
    }
}
