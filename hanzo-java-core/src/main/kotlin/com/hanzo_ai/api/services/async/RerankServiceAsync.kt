// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.rerank.RerankCreateParams
import com.hanzo_ai.api.models.rerank.RerankCreateResponse
import com.hanzo_ai.api.models.rerank.RerankCreateV1Params
import com.hanzo_ai.api.models.rerank.RerankCreateV1Response
import com.hanzo_ai.api.models.rerank.RerankCreateV2Params
import com.hanzo_ai.api.models.rerank.RerankCreateV2Response
import java.util.concurrent.CompletableFuture

interface RerankServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Rerank */
    fun create(): CompletableFuture<RerankCreateResponse> = create(RerankCreateParams.none())

    /** @see [create] */
    fun create(
        params: RerankCreateParams = RerankCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RerankCreateResponse>

    /** @see [create] */
    fun create(
        params: RerankCreateParams = RerankCreateParams.none()
    ): CompletableFuture<RerankCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<RerankCreateResponse> =
        create(RerankCreateParams.none(), requestOptions)

    /** Rerank */
    fun createV1(): CompletableFuture<RerankCreateV1Response> =
        createV1(RerankCreateV1Params.none())

    /** @see [createV1] */
    fun createV1(
        params: RerankCreateV1Params = RerankCreateV1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RerankCreateV1Response>

    /** @see [createV1] */
    fun createV1(
        params: RerankCreateV1Params = RerankCreateV1Params.none()
    ): CompletableFuture<RerankCreateV1Response> = createV1(params, RequestOptions.none())

    /** @see [createV1] */
    fun createV1(requestOptions: RequestOptions): CompletableFuture<RerankCreateV1Response> =
        createV1(RerankCreateV1Params.none(), requestOptions)

    /** Rerank */
    fun createV2(): CompletableFuture<RerankCreateV2Response> =
        createV2(RerankCreateV2Params.none())

    /** @see [createV2] */
    fun createV2(
        params: RerankCreateV2Params = RerankCreateV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RerankCreateV2Response>

    /** @see [createV2] */
    fun createV2(
        params: RerankCreateV2Params = RerankCreateV2Params.none()
    ): CompletableFuture<RerankCreateV2Response> = createV2(params, RequestOptions.none())

    /** @see [createV2] */
    fun createV2(requestOptions: RequestOptions): CompletableFuture<RerankCreateV2Response> =
        createV2(RerankCreateV2Params.none(), requestOptions)

    /**
     * A view of [RerankServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /rerank`, but is otherwise the same as
         * [RerankServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<RerankCreateResponse>> =
            create(RerankCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: RerankCreateParams = RerankCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RerankCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: RerankCreateParams = RerankCreateParams.none()
        ): CompletableFuture<HttpResponseFor<RerankCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RerankCreateResponse>> =
            create(RerankCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/rerank`, but is otherwise the same as
         * [RerankServiceAsync.createV1].
         */
        @MustBeClosed
        fun createV1(): CompletableFuture<HttpResponseFor<RerankCreateV1Response>> =
            createV1(RerankCreateV1Params.none())

        /** @see [createV1] */
        @MustBeClosed
        fun createV1(
            params: RerankCreateV1Params = RerankCreateV1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RerankCreateV1Response>>

        /** @see [createV1] */
        @MustBeClosed
        fun createV1(
            params: RerankCreateV1Params = RerankCreateV1Params.none()
        ): CompletableFuture<HttpResponseFor<RerankCreateV1Response>> =
            createV1(params, RequestOptions.none())

        /** @see [createV1] */
        @MustBeClosed
        fun createV1(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RerankCreateV1Response>> =
            createV1(RerankCreateV1Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/rerank`, but is otherwise the same as
         * [RerankServiceAsync.createV2].
         */
        @MustBeClosed
        fun createV2(): CompletableFuture<HttpResponseFor<RerankCreateV2Response>> =
            createV2(RerankCreateV2Params.none())

        /** @see [createV2] */
        @MustBeClosed
        fun createV2(
            params: RerankCreateV2Params = RerankCreateV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RerankCreateV2Response>>

        /** @see [createV2] */
        @MustBeClosed
        fun createV2(
            params: RerankCreateV2Params = RerankCreateV2Params.none()
        ): CompletableFuture<HttpResponseFor<RerankCreateV2Response>> =
            createV2(params, RequestOptions.none())

        /** @see [createV2] */
        @MustBeClosed
        fun createV2(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RerankCreateV2Response>> =
            createV2(RerankCreateV2Params.none(), requestOptions)
    }
}
