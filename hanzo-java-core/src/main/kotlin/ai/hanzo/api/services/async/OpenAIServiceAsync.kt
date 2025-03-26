// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.openai.OpenAICreateParams
import ai.hanzo.api.models.openai.OpenAICreateResponse
import ai.hanzo.api.models.openai.OpenAIDeleteParams
import ai.hanzo.api.models.openai.OpenAIDeleteResponse
import ai.hanzo.api.models.openai.OpenAIPatchParams
import ai.hanzo.api.models.openai.OpenAIPatchResponse
import ai.hanzo.api.models.openai.OpenAIRetrieveParams
import ai.hanzo.api.models.openai.OpenAIRetrieveResponse
import ai.hanzo.api.models.openai.OpenAIUpdateParams
import ai.hanzo.api.models.openai.OpenAIUpdateResponse
import ai.hanzo.api.services.async.openai.DeploymentServiceAsync
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface OpenAIServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun deployments(): DeploymentServiceAsync

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun create(params: OpenAICreateParams): CompletableFuture<OpenAICreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: OpenAICreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAICreateResponse>

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun retrieve(params: OpenAIRetrieveParams): CompletableFuture<OpenAIRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: OpenAIRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIRetrieveResponse>

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun update(params: OpenAIUpdateParams): CompletableFuture<OpenAIUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: OpenAIUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIUpdateResponse>

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun delete(params: OpenAIDeleteParams): CompletableFuture<OpenAIDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: OpenAIDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIDeleteResponse>

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun patch(params: OpenAIPatchParams): CompletableFuture<OpenAIPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: OpenAIPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIPatchResponse>

    /**
     * A view of [OpenAIServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun deployments(): DeploymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: OpenAICreateParams
        ): CompletableFuture<HttpResponseFor<OpenAICreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: OpenAICreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAICreateResponse>>

        /**
         * Returns a raw HTTP response for `get /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: OpenAIRetrieveParams
        ): CompletableFuture<HttpResponseFor<OpenAIRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: OpenAIRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: OpenAIUpdateParams
        ): CompletableFuture<HttpResponseFor<OpenAIUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: OpenAIUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: OpenAIDeleteParams
        ): CompletableFuture<HttpResponseFor<OpenAIDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: OpenAIDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIDeleteResponse>>

        /**
         * Returns a raw HTTP response for `patch /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.patch].
         */
        @MustBeClosed
        fun patch(
            params: OpenAIPatchParams
        ): CompletableFuture<HttpResponseFor<OpenAIPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: OpenAIPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIPatchResponse>>
    }
}
