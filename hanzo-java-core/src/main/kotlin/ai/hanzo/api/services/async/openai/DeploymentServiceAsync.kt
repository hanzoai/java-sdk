// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.openai

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.openai.deployments.DeploymentCompleteParams
import ai.hanzo.api.models.openai.deployments.DeploymentCompleteResponse
import ai.hanzo.api.models.openai.deployments.DeploymentEmbedParams
import ai.hanzo.api.models.openai.deployments.DeploymentEmbedResponse
import ai.hanzo.api.services.async.openai.deployments.ChatServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DeploymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeploymentServiceAsync

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
    fun complete(model: String): CompletableFuture<DeploymentCompleteResponse> =
        complete(model, DeploymentCompleteParams.none())

    /** @see [complete] */
    fun complete(
        model: String,
        params: DeploymentCompleteParams = DeploymentCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeploymentCompleteResponse> =
        complete(params.toBuilder().model(model).build(), requestOptions)

    /** @see [complete] */
    fun complete(
        model: String,
        params: DeploymentCompleteParams = DeploymentCompleteParams.none(),
    ): CompletableFuture<DeploymentCompleteResponse> =
        complete(model, params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        params: DeploymentCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeploymentCompleteResponse>

    /** @see [complete] */
    fun complete(params: DeploymentCompleteParams): CompletableFuture<DeploymentCompleteResponse> =
        complete(params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        model: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeploymentCompleteResponse> =
        complete(model, DeploymentCompleteParams.none(), requestOptions)

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
    fun embed(model: String): CompletableFuture<DeploymentEmbedResponse> =
        embed(model, DeploymentEmbedParams.none())

    /** @see [embed] */
    fun embed(
        model: String,
        params: DeploymentEmbedParams = DeploymentEmbedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeploymentEmbedResponse> =
        embed(params.toBuilder().model(model).build(), requestOptions)

    /** @see [embed] */
    fun embed(
        model: String,
        params: DeploymentEmbedParams = DeploymentEmbedParams.none(),
    ): CompletableFuture<DeploymentEmbedResponse> = embed(model, params, RequestOptions.none())

    /** @see [embed] */
    fun embed(
        params: DeploymentEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeploymentEmbedResponse>

    /** @see [embed] */
    fun embed(params: DeploymentEmbedParams): CompletableFuture<DeploymentEmbedResponse> =
        embed(params, RequestOptions.none())

    /** @see [embed] */
    fun embed(
        model: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeploymentEmbedResponse> =
        embed(model, DeploymentEmbedParams.none(), requestOptions)

    /**
     * A view of [DeploymentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeploymentServiceAsync.WithRawResponse

        fun chat(): ChatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /openai/deployments/{model}/completions`, but is
         * otherwise the same as [DeploymentServiceAsync.complete].
         */
        fun complete(
            model: String
        ): CompletableFuture<HttpResponseFor<DeploymentCompleteResponse>> =
            complete(model, DeploymentCompleteParams.none())

        /** @see [complete] */
        fun complete(
            model: String,
            params: DeploymentCompleteParams = DeploymentCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeploymentCompleteResponse>> =
            complete(params.toBuilder().model(model).build(), requestOptions)

        /** @see [complete] */
        fun complete(
            model: String,
            params: DeploymentCompleteParams = DeploymentCompleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DeploymentCompleteResponse>> =
            complete(model, params, RequestOptions.none())

        /** @see [complete] */
        fun complete(
            params: DeploymentCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeploymentCompleteResponse>>

        /** @see [complete] */
        fun complete(
            params: DeploymentCompleteParams
        ): CompletableFuture<HttpResponseFor<DeploymentCompleteResponse>> =
            complete(params, RequestOptions.none())

        /** @see [complete] */
        fun complete(
            model: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeploymentCompleteResponse>> =
            complete(model, DeploymentCompleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /openai/deployments/{model}/embeddings`, but is
         * otherwise the same as [DeploymentServiceAsync.embed].
         */
        fun embed(model: String): CompletableFuture<HttpResponseFor<DeploymentEmbedResponse>> =
            embed(model, DeploymentEmbedParams.none())

        /** @see [embed] */
        fun embed(
            model: String,
            params: DeploymentEmbedParams = DeploymentEmbedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeploymentEmbedResponse>> =
            embed(params.toBuilder().model(model).build(), requestOptions)

        /** @see [embed] */
        fun embed(
            model: String,
            params: DeploymentEmbedParams = DeploymentEmbedParams.none(),
        ): CompletableFuture<HttpResponseFor<DeploymentEmbedResponse>> =
            embed(model, params, RequestOptions.none())

        /** @see [embed] */
        fun embed(
            params: DeploymentEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeploymentEmbedResponse>>

        /** @see [embed] */
        fun embed(
            params: DeploymentEmbedParams
        ): CompletableFuture<HttpResponseFor<DeploymentEmbedResponse>> =
            embed(params, RequestOptions.none())

        /** @see [embed] */
        fun embed(
            model: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeploymentEmbedResponse>> =
            embed(model, DeploymentEmbedParams.none(), requestOptions)
    }
}
