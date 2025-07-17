// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.images

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.images.generations.GenerationCreateParams
import ai.hanzo.api.models.images.generations.GenerationCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GenerationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GenerationServiceAsync

    /** Image Generation */
    fun create(): CompletableFuture<GenerationCreateResponse> =
        create(GenerationCreateParams.none())

    /** @see [create] */
    fun create(
        params: GenerationCreateParams = GenerationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GenerationCreateResponse>

    /** @see [create] */
    fun create(
        params: GenerationCreateParams = GenerationCreateParams.none()
    ): CompletableFuture<GenerationCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<GenerationCreateResponse> =
        create(GenerationCreateParams.none(), requestOptions)

    /**
     * A view of [GenerationServiceAsync] that provides access to raw HTTP responses for each
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
        ): GenerationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/images/generations`, but is otherwise the same
         * as [GenerationServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<GenerationCreateResponse>> =
            create(GenerationCreateParams.none())

        /** @see [create] */
        fun create(
            params: GenerationCreateParams = GenerationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GenerationCreateResponse>>

        /** @see [create] */
        fun create(
            params: GenerationCreateParams = GenerationCreateParams.none()
        ): CompletableFuture<HttpResponseFor<GenerationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GenerationCreateResponse>> =
            create(GenerationCreateParams.none(), requestOptions)
    }
}
