// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.anthropic.AnthropicCreateParams
import ai.hanzo.api.models.anthropic.AnthropicCreateResponse
import ai.hanzo.api.models.anthropic.AnthropicDeleteParams
import ai.hanzo.api.models.anthropic.AnthropicDeleteResponse
import ai.hanzo.api.models.anthropic.AnthropicModifyParams
import ai.hanzo.api.models.anthropic.AnthropicModifyResponse
import ai.hanzo.api.models.anthropic.AnthropicRetrieveParams
import ai.hanzo.api.models.anthropic.AnthropicRetrieveResponse
import ai.hanzo.api.models.anthropic.AnthropicUpdateParams
import ai.hanzo.api.models.anthropic.AnthropicUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface AnthropicServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** [Docs](https://docs.hanzo.ai/docs/anthropic_completion) */
    fun create(params: AnthropicCreateParams): CompletableFuture<AnthropicCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AnthropicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicCreateResponse>

    /** [Docs](https://docs.hanzo.ai/docs/anthropic_completion) */
    fun retrieve(params: AnthropicRetrieveParams): CompletableFuture<AnthropicRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AnthropicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicRetrieveResponse>

    /** [Docs](https://docs.hanzo.ai/docs/anthropic_completion) */
    fun update(params: AnthropicUpdateParams): CompletableFuture<AnthropicUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AnthropicUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicUpdateResponse>

    /** [Docs](https://docs.hanzo.ai/docs/anthropic_completion) */
    fun delete(params: AnthropicDeleteParams): CompletableFuture<AnthropicDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AnthropicDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicDeleteResponse>

    /** [Docs](https://docs.hanzo.ai/docs/anthropic_completion) */
    fun modify(params: AnthropicModifyParams): CompletableFuture<AnthropicModifyResponse> =
        modify(params, RequestOptions.none())

    /** @see [modify] */
    fun modify(
        params: AnthropicModifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicModifyResponse>

    /**
     * A view of [AnthropicServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: AnthropicCreateParams
        ): CompletableFuture<HttpResponseFor<AnthropicCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AnthropicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /anthropic/{endpoint}`, but is otherwise the same as
         * [AnthropicServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AnthropicRetrieveParams
        ): CompletableFuture<HttpResponseFor<AnthropicRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AnthropicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /anthropic/{endpoint}`, but is otherwise the same as
         * [AnthropicServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: AnthropicUpdateParams
        ): CompletableFuture<HttpResponseFor<AnthropicUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AnthropicUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: AnthropicDeleteParams
        ): CompletableFuture<HttpResponseFor<AnthropicDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AnthropicDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicDeleteResponse>>

        /**
         * Returns a raw HTTP response for `patch /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicServiceAsync.modify].
         */
        @MustBeClosed
        fun modify(
            params: AnthropicModifyParams
        ): CompletableFuture<HttpResponseFor<AnthropicModifyResponse>> =
            modify(params, RequestOptions.none())

        /** @see [modify] */
        @MustBeClosed
        fun modify(
            params: AnthropicModifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicModifyResponse>>
    }
}
