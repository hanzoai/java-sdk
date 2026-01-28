// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.engines.EngineCompleteParams
import ai.hanzo.api.models.engines.EngineCompleteResponse
import ai.hanzo.api.models.engines.EngineEmbedParams
import ai.hanzo.api.models.engines.EngineEmbedResponse
import ai.hanzo.api.services.async.engines.ChatServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EngineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EngineServiceAsync

    fun chat(): ChatServiceAsync

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
    fun complete(model: String): CompletableFuture<EngineCompleteResponse> =
        complete(model, EngineCompleteParams.none())

    /** @see complete */
    fun complete(
        model: String,
        params: EngineCompleteParams = EngineCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EngineCompleteResponse> =
        complete(params.toBuilder().model(model).build(), requestOptions)

    /** @see complete */
    fun complete(
        model: String,
        params: EngineCompleteParams = EngineCompleteParams.none(),
    ): CompletableFuture<EngineCompleteResponse> = complete(model, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: EngineCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EngineCompleteResponse>

    /** @see complete */
    fun complete(params: EngineCompleteParams): CompletableFuture<EngineCompleteResponse> =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        model: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EngineCompleteResponse> =
        complete(model, EngineCompleteParams.none(), requestOptions)

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
    fun embed(
        pathModel: String,
        params: EngineEmbedParams,
    ): CompletableFuture<EngineEmbedResponse> = embed(pathModel, params, RequestOptions.none())

    /** @see embed */
    fun embed(
        pathModel: String,
        params: EngineEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EngineEmbedResponse> =
        embed(params.toBuilder().pathModel(pathModel).build(), requestOptions)

    /** @see embed */
    fun embed(params: EngineEmbedParams): CompletableFuture<EngineEmbedResponse> =
        embed(params, RequestOptions.none())

    /** @see embed */
    fun embed(
        params: EngineEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EngineEmbedResponse>

    /**
     * A view of [EngineServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EngineServiceAsync.WithRawResponse

        fun chat(): ChatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /engines/{model}/completions`, but is otherwise the
         * same as [EngineServiceAsync.complete].
         */
        fun complete(model: String): CompletableFuture<HttpResponseFor<EngineCompleteResponse>> =
            complete(model, EngineCompleteParams.none())

        /** @see complete */
        fun complete(
            model: String,
            params: EngineCompleteParams = EngineCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EngineCompleteResponse>> =
            complete(params.toBuilder().model(model).build(), requestOptions)

        /** @see complete */
        fun complete(
            model: String,
            params: EngineCompleteParams = EngineCompleteParams.none(),
        ): CompletableFuture<HttpResponseFor<EngineCompleteResponse>> =
            complete(model, params, RequestOptions.none())

        /** @see complete */
        fun complete(
            params: EngineCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EngineCompleteResponse>>

        /** @see complete */
        fun complete(
            params: EngineCompleteParams
        ): CompletableFuture<HttpResponseFor<EngineCompleteResponse>> =
            complete(params, RequestOptions.none())

        /** @see complete */
        fun complete(
            model: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EngineCompleteResponse>> =
            complete(model, EngineCompleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /engines/{model}/embeddings`, but is otherwise the
         * same as [EngineServiceAsync.embed].
         */
        fun embed(
            pathModel: String,
            params: EngineEmbedParams,
        ): CompletableFuture<HttpResponseFor<EngineEmbedResponse>> =
            embed(pathModel, params, RequestOptions.none())

        /** @see embed */
        fun embed(
            pathModel: String,
            params: EngineEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EngineEmbedResponse>> =
            embed(params.toBuilder().pathModel(pathModel).build(), requestOptions)

        /** @see embed */
        fun embed(
            params: EngineEmbedParams
        ): CompletableFuture<HttpResponseFor<EngineEmbedResponse>> =
            embed(params, RequestOptions.none())

        /** @see embed */
        fun embed(
            params: EngineEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EngineEmbedResponse>>
    }
}
