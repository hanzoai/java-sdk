// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.rerank.RerankCreateParams
import com.hanzo_ai.api.models.rerank.RerankCreateResponse
import com.hanzo_ai.api.models.rerank.RerankCreateV1Params
import com.hanzo_ai.api.models.rerank.RerankCreateV1Response
import com.hanzo_ai.api.models.rerank.RerankCreateV2Params
import com.hanzo_ai.api.models.rerank.RerankCreateV2Response

interface RerankService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Rerank */
    fun create(): RerankCreateResponse = create(RerankCreateParams.none())

    /** @see [create] */
    fun create(
        params: RerankCreateParams = RerankCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RerankCreateResponse

    /** @see [create] */
    fun create(params: RerankCreateParams = RerankCreateParams.none()): RerankCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): RerankCreateResponse =
        create(RerankCreateParams.none(), requestOptions)

    /** Rerank */
    fun createV1(): RerankCreateV1Response = createV1(RerankCreateV1Params.none())

    /** @see [createV1] */
    fun createV1(
        params: RerankCreateV1Params = RerankCreateV1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RerankCreateV1Response

    /** @see [createV1] */
    fun createV1(
        params: RerankCreateV1Params = RerankCreateV1Params.none()
    ): RerankCreateV1Response = createV1(params, RequestOptions.none())

    /** @see [createV1] */
    fun createV1(requestOptions: RequestOptions): RerankCreateV1Response =
        createV1(RerankCreateV1Params.none(), requestOptions)

    /** Rerank */
    fun createV2(): RerankCreateV2Response = createV2(RerankCreateV2Params.none())

    /** @see [createV2] */
    fun createV2(
        params: RerankCreateV2Params = RerankCreateV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RerankCreateV2Response

    /** @see [createV2] */
    fun createV2(
        params: RerankCreateV2Params = RerankCreateV2Params.none()
    ): RerankCreateV2Response = createV2(params, RequestOptions.none())

    /** @see [createV2] */
    fun createV2(requestOptions: RequestOptions): RerankCreateV2Response =
        createV2(RerankCreateV2Params.none(), requestOptions)

    /** A view of [RerankService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /rerank`, but is otherwise the same as
         * [RerankService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<RerankCreateResponse> = create(RerankCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: RerankCreateParams = RerankCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RerankCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: RerankCreateParams = RerankCreateParams.none()
        ): HttpResponseFor<RerankCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<RerankCreateResponse> =
            create(RerankCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/rerank`, but is otherwise the same as
         * [RerankService.createV1].
         */
        @MustBeClosed
        fun createV1(): HttpResponseFor<RerankCreateV1Response> =
            createV1(RerankCreateV1Params.none())

        /** @see [createV1] */
        @MustBeClosed
        fun createV1(
            params: RerankCreateV1Params = RerankCreateV1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RerankCreateV1Response>

        /** @see [createV1] */
        @MustBeClosed
        fun createV1(
            params: RerankCreateV1Params = RerankCreateV1Params.none()
        ): HttpResponseFor<RerankCreateV1Response> = createV1(params, RequestOptions.none())

        /** @see [createV1] */
        @MustBeClosed
        fun createV1(requestOptions: RequestOptions): HttpResponseFor<RerankCreateV1Response> =
            createV1(RerankCreateV1Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/rerank`, but is otherwise the same as
         * [RerankService.createV2].
         */
        @MustBeClosed
        fun createV2(): HttpResponseFor<RerankCreateV2Response> =
            createV2(RerankCreateV2Params.none())

        /** @see [createV2] */
        @MustBeClosed
        fun createV2(
            params: RerankCreateV2Params = RerankCreateV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RerankCreateV2Response>

        /** @see [createV2] */
        @MustBeClosed
        fun createV2(
            params: RerankCreateV2Params = RerankCreateV2Params.none()
        ): HttpResponseFor<RerankCreateV2Response> = createV2(params, RequestOptions.none())

        /** @see [createV2] */
        @MustBeClosed
        fun createV2(requestOptions: RequestOptions): HttpResponseFor<RerankCreateV2Response> =
            createV2(RerankCreateV2Params.none(), requestOptions)
    }
}
