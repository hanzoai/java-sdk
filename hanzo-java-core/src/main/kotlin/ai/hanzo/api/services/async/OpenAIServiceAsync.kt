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
    fun create(endpoint: String): CompletableFuture<OpenAICreateResponse> =
        create(endpoint, OpenAICreateParams.none())

    /** @see [create] */
    fun create(
        endpoint: String,
        params: OpenAICreateParams = OpenAICreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAICreateResponse> =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [create] */
    fun create(
        endpoint: String,
        params: OpenAICreateParams = OpenAICreateParams.none(),
    ): CompletableFuture<OpenAICreateResponse> = create(endpoint, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: OpenAICreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAICreateResponse>

    /** @see [create] */
    fun create(params: OpenAICreateParams): CompletableFuture<OpenAICreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenAICreateResponse> =
        create(endpoint, OpenAICreateParams.none(), requestOptions)

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun retrieve(endpoint: String): CompletableFuture<OpenAIRetrieveResponse> =
        retrieve(endpoint, OpenAIRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        endpoint: String,
        params: OpenAIRetrieveParams = OpenAIRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIRetrieveResponse> =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        endpoint: String,
        params: OpenAIRetrieveParams = OpenAIRetrieveParams.none(),
    ): CompletableFuture<OpenAIRetrieveResponse> = retrieve(endpoint, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: OpenAIRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: OpenAIRetrieveParams): CompletableFuture<OpenAIRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenAIRetrieveResponse> =
        retrieve(endpoint, OpenAIRetrieveParams.none(), requestOptions)

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun update(endpoint: String): CompletableFuture<OpenAIUpdateResponse> =
        update(endpoint, OpenAIUpdateParams.none())

    /** @see [update] */
    fun update(
        endpoint: String,
        params: OpenAIUpdateParams = OpenAIUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIUpdateResponse> =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [update] */
    fun update(
        endpoint: String,
        params: OpenAIUpdateParams = OpenAIUpdateParams.none(),
    ): CompletableFuture<OpenAIUpdateResponse> = update(endpoint, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: OpenAIUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIUpdateResponse>

    /** @see [update] */
    fun update(params: OpenAIUpdateParams): CompletableFuture<OpenAIUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenAIUpdateResponse> =
        update(endpoint, OpenAIUpdateParams.none(), requestOptions)

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun delete(endpoint: String): CompletableFuture<OpenAIDeleteResponse> =
        delete(endpoint, OpenAIDeleteParams.none())

    /** @see [delete] */
    fun delete(
        endpoint: String,
        params: OpenAIDeleteParams = OpenAIDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIDeleteResponse> =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        endpoint: String,
        params: OpenAIDeleteParams = OpenAIDeleteParams.none(),
    ): CompletableFuture<OpenAIDeleteResponse> = delete(endpoint, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: OpenAIDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIDeleteResponse>

    /** @see [delete] */
    fun delete(params: OpenAIDeleteParams): CompletableFuture<OpenAIDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenAIDeleteResponse> =
        delete(endpoint, OpenAIDeleteParams.none(), requestOptions)

    /**
     * Simple pass-through for OpenAI. Use this if you want to directly send a request to OpenAI.
     */
    fun patch(endpoint: String): CompletableFuture<OpenAIPatchResponse> =
        patch(endpoint, OpenAIPatchParams.none())

    /** @see [patch] */
    fun patch(
        endpoint: String,
        params: OpenAIPatchParams = OpenAIPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIPatchResponse> =
        patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see [patch] */
    fun patch(
        endpoint: String,
        params: OpenAIPatchParams = OpenAIPatchParams.none(),
    ): CompletableFuture<OpenAIPatchResponse> = patch(endpoint, params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: OpenAIPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenAIPatchResponse>

    /** @see [patch] */
    fun patch(params: OpenAIPatchParams): CompletableFuture<OpenAIPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenAIPatchResponse> =
        patch(endpoint, OpenAIPatchParams.none(), requestOptions)

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
        fun create(endpoint: String): CompletableFuture<HttpResponseFor<OpenAICreateResponse>> =
            create(endpoint, OpenAICreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: OpenAICreateParams = OpenAICreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAICreateResponse>> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            endpoint: String,
            params: OpenAICreateParams = OpenAICreateParams.none(),
        ): CompletableFuture<HttpResponseFor<OpenAICreateResponse>> =
            create(endpoint, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: OpenAICreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAICreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: OpenAICreateParams
        ): CompletableFuture<HttpResponseFor<OpenAICreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenAICreateResponse>> =
            create(endpoint, OpenAICreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(endpoint: String): CompletableFuture<HttpResponseFor<OpenAIRetrieveResponse>> =
            retrieve(endpoint, OpenAIRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: OpenAIRetrieveParams = OpenAIRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIRetrieveResponse>> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            params: OpenAIRetrieveParams = OpenAIRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIRetrieveResponse>> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: OpenAIRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: OpenAIRetrieveParams
        ): CompletableFuture<HttpResponseFor<OpenAIRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenAIRetrieveResponse>> =
            retrieve(endpoint, OpenAIRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.update].
         */
        @MustBeClosed
        fun update(endpoint: String): CompletableFuture<HttpResponseFor<OpenAIUpdateResponse>> =
            update(endpoint, OpenAIUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: OpenAIUpdateParams = OpenAIUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIUpdateResponse>> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            endpoint: String,
            params: OpenAIUpdateParams = OpenAIUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIUpdateResponse>> =
            update(endpoint, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: OpenAIUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIUpdateResponse>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: OpenAIUpdateParams
        ): CompletableFuture<HttpResponseFor<OpenAIUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenAIUpdateResponse>> =
            update(endpoint, OpenAIUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(endpoint: String): CompletableFuture<HttpResponseFor<OpenAIDeleteResponse>> =
            delete(endpoint, OpenAIDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: OpenAIDeleteParams = OpenAIDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIDeleteResponse>> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            endpoint: String,
            params: OpenAIDeleteParams = OpenAIDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIDeleteResponse>> =
            delete(endpoint, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: OpenAIDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIDeleteResponse>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: OpenAIDeleteParams
        ): CompletableFuture<HttpResponseFor<OpenAIDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenAIDeleteResponse>> =
            delete(endpoint, OpenAIDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /openai/{endpoint}`, but is otherwise the same as
         * [OpenAIServiceAsync.patch].
         */
        @MustBeClosed
        fun patch(endpoint: String): CompletableFuture<HttpResponseFor<OpenAIPatchResponse>> =
            patch(endpoint, OpenAIPatchParams.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: OpenAIPatchParams = OpenAIPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIPatchResponse>> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            endpoint: String,
            params: OpenAIPatchParams = OpenAIPatchParams.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIPatchResponse>> =
            patch(endpoint, params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: OpenAIPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenAIPatchResponse>>

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: OpenAIPatchParams
        ): CompletableFuture<HttpResponseFor<OpenAIPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenAIPatchResponse>> =
            patch(endpoint, OpenAIPatchParams.none(), requestOptions)
    }
}
