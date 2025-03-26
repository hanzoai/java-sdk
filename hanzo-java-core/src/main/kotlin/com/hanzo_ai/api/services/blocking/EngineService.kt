// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.engines.EngineCompleteParams
import com.hanzo_ai.api.models.engines.EngineCompleteResponse
import com.hanzo_ai.api.models.engines.EngineEmbedParams
import com.hanzo_ai.api.models.engines.EngineEmbedResponse
import com.hanzo_ai.api.services.blocking.engines.ChatService

interface EngineService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun chat(): ChatService

    /**
     * Follows the exact same API spec as `OpenAI's Completions API
     * https://platform.openai.com/docs/api-reference/completions`
     *
     * ```bash
     * curl -X POST http://localhost:4000/v1/completions
     * -H "Content-Type: application/json"
     * -H "Authorization: Bearer sk-1234"
     * -d '{
     *     "model": "gpt-3.5-turbo-instruct",
     *     "prompt": "Once upon a time",
     *     "max_tokens": 50,
     *     "temperature": 0.7
     * }'
     * ```
     */
    fun complete(params: EngineCompleteParams): EngineCompleteResponse =
        complete(params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        params: EngineCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EngineCompleteResponse

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
    fun embed(params: EngineEmbedParams): EngineEmbedResponse = embed(params, RequestOptions.none())

    /** @see [embed] */
    fun embed(
        params: EngineEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EngineEmbedResponse

    /** A view of [EngineService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun chat(): ChatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /engines/{model}/completions`, but is otherwise the
         * same as [EngineService.complete].
         */
        @MustBeClosed
        fun complete(params: EngineCompleteParams): HttpResponseFor<EngineCompleteResponse> =
            complete(params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            params: EngineCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EngineCompleteResponse>

        /**
         * Returns a raw HTTP response for `post /engines/{model}/embeddings`, but is otherwise the
         * same as [EngineService.embed].
         */
        @MustBeClosed
        fun embed(params: EngineEmbedParams): HttpResponseFor<EngineEmbedResponse> =
            embed(params, RequestOptions.none())

        /** @see [embed] */
        @MustBeClosed
        fun embed(
            params: EngineEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EngineEmbedResponse>
    }
}
