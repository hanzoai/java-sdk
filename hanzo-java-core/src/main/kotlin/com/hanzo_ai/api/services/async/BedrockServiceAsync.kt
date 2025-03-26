// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.bedrock.BedrockCreateParams
import com.hanzo_ai.api.models.bedrock.BedrockCreateResponse
import com.hanzo_ai.api.models.bedrock.BedrockDeleteParams
import com.hanzo_ai.api.models.bedrock.BedrockDeleteResponse
import com.hanzo_ai.api.models.bedrock.BedrockPatchParams
import com.hanzo_ai.api.models.bedrock.BedrockPatchResponse
import com.hanzo_ai.api.models.bedrock.BedrockRetrieveParams
import com.hanzo_ai.api.models.bedrock.BedrockRetrieveResponse
import com.hanzo_ai.api.models.bedrock.BedrockUpdateParams
import com.hanzo_ai.api.models.bedrock.BedrockUpdateResponse
import java.util.concurrent.CompletableFuture

interface BedrockServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/bedrock) */
    fun create(params: BedrockCreateParams): CompletableFuture<BedrockCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BedrockCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockCreateResponse>

    /** [Docs](https://docs.llm.ai/docs/pass_through/bedrock) */
    fun retrieve(params: BedrockRetrieveParams): CompletableFuture<BedrockRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BedrockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockRetrieveResponse>

    /** [Docs](https://docs.llm.ai/docs/pass_through/bedrock) */
    fun update(params: BedrockUpdateParams): CompletableFuture<BedrockUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BedrockUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockUpdateResponse>

    /** [Docs](https://docs.llm.ai/docs/pass_through/bedrock) */
    fun delete(params: BedrockDeleteParams): CompletableFuture<BedrockDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: BedrockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockDeleteResponse>

    /** [Docs](https://docs.llm.ai/docs/pass_through/bedrock) */
    fun patch(params: BedrockPatchParams): CompletableFuture<BedrockPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: BedrockPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockPatchResponse>

    /**
     * A view of [BedrockServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: BedrockCreateParams
        ): CompletableFuture<HttpResponseFor<BedrockCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BedrockCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BedrockRetrieveParams
        ): CompletableFuture<HttpResponseFor<BedrockRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BedrockRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: BedrockUpdateParams
        ): CompletableFuture<HttpResponseFor<BedrockUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BedrockUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /bedrock/{endpoint}`, but is otherwise the same
         * as [BedrockServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: BedrockDeleteParams
        ): CompletableFuture<HttpResponseFor<BedrockDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: BedrockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockDeleteResponse>>

        /**
         * Returns a raw HTTP response for `patch /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockServiceAsync.patch].
         */
        @MustBeClosed
        fun patch(
            params: BedrockPatchParams
        ): CompletableFuture<HttpResponseFor<BedrockPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: BedrockPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockPatchResponse>>
    }
}
