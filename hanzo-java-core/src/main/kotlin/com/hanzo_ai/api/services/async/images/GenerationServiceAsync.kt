// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.images

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.images.generations.GenerationCreateParams
import com.hanzo_ai.api.models.images.generations.GenerationCreateResponse
import java.util.concurrent.CompletableFuture

interface GenerationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
         * Returns a raw HTTP response for `post /v1/images/generations`, but is otherwise the same
         * as [GenerationServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<GenerationCreateResponse>> =
            create(GenerationCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: GenerationCreateParams = GenerationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GenerationCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: GenerationCreateParams = GenerationCreateParams.none()
        ): CompletableFuture<HttpResponseFor<GenerationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GenerationCreateResponse>> =
            create(GenerationCreateParams.none(), requestOptions)
    }
}
