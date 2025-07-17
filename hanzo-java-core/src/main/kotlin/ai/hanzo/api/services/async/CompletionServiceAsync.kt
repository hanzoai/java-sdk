// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.completions.CompletionCreateParams
import ai.hanzo.api.models.completions.CompletionCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CompletionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompletionServiceAsync

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CompletionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /completions`, but is otherwise the same as
         * [CompletionServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<CompletionCreateResponse>> =
            create(CompletionCreateParams.none())

        /** @see [create] */
        fun create(
            params: CompletionCreateParams = CompletionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompletionCreateResponse>>

        /** @see [create] */
        fun create(
            params: CompletionCreateParams = CompletionCreateParams.none()
        ): CompletableFuture<HttpResponseFor<CompletionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CompletionCreateResponse>> =
            create(CompletionCreateParams.none(), requestOptions)
    }
}
