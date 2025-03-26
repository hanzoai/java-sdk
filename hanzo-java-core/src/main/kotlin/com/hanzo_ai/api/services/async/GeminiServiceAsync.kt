// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.gemini.GeminiCreateParams
import com.hanzo_ai.api.models.gemini.GeminiCreateResponse
import com.hanzo_ai.api.models.gemini.GeminiDeleteParams
import com.hanzo_ai.api.models.gemini.GeminiDeleteResponse
import com.hanzo_ai.api.models.gemini.GeminiPatchParams
import com.hanzo_ai.api.models.gemini.GeminiPatchResponse
import com.hanzo_ai.api.models.gemini.GeminiRetrieveParams
import com.hanzo_ai.api.models.gemini.GeminiRetrieveResponse
import com.hanzo_ai.api.models.gemini.GeminiUpdateParams
import com.hanzo_ai.api.models.gemini.GeminiUpdateResponse
import java.util.concurrent.CompletableFuture

interface GeminiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    fun create(params: GeminiCreateParams): CompletableFuture<GeminiCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: GeminiCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiCreateResponse>

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    fun retrieve(params: GeminiRetrieveParams): CompletableFuture<GeminiRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: GeminiRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiRetrieveResponse>

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    fun update(params: GeminiUpdateParams): CompletableFuture<GeminiUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: GeminiUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiUpdateResponse>

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    fun delete(params: GeminiDeleteParams): CompletableFuture<GeminiDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: GeminiDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiDeleteResponse>

    /** [Docs](https://docs.llm.ai/docs/pass_through/google_ai_studio) */
    fun patch(params: GeminiPatchParams): CompletableFuture<GeminiPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: GeminiPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeminiPatchResponse>

    /**
     * A view of [GeminiServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: GeminiCreateParams
        ): CompletableFuture<HttpResponseFor<GeminiCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: GeminiCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: GeminiRetrieveParams
        ): CompletableFuture<HttpResponseFor<GeminiRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: GeminiRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: GeminiUpdateParams
        ): CompletableFuture<HttpResponseFor<GeminiUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: GeminiUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: GeminiDeleteParams
        ): CompletableFuture<HttpResponseFor<GeminiDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: GeminiDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiDeleteResponse>>

        /**
         * Returns a raw HTTP response for `patch /gemini/{endpoint}`, but is otherwise the same as
         * [GeminiServiceAsync.patch].
         */
        @MustBeClosed
        fun patch(
            params: GeminiPatchParams
        ): CompletableFuture<HttpResponseFor<GeminiPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: GeminiPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeminiPatchResponse>>
    }
}
