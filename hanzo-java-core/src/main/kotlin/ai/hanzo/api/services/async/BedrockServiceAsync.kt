// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.bedrock.BedrockCreateParams
import ai.hanzo.api.models.bedrock.BedrockCreateResponse
import ai.hanzo.api.models.bedrock.BedrockDeleteParams
import ai.hanzo.api.models.bedrock.BedrockDeleteResponse
import ai.hanzo.api.models.bedrock.BedrockPatchParams
import ai.hanzo.api.models.bedrock.BedrockPatchResponse
import ai.hanzo.api.models.bedrock.BedrockRetrieveParams
import ai.hanzo.api.models.bedrock.BedrockRetrieveResponse
import ai.hanzo.api.models.bedrock.BedrockUpdateParams
import ai.hanzo.api.models.bedrock.BedrockUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BedrockServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BedrockServiceAsync

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/bedrock) */
    fun create(endpoint: String): CompletableFuture<BedrockCreateResponse> =
        create(endpoint, BedrockCreateParams.none())

    /** @see create */
    fun create(
        endpoint: String,
        params: BedrockCreateParams = BedrockCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockCreateResponse> =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    fun create(
        endpoint: String,
        params: BedrockCreateParams = BedrockCreateParams.none(),
    ): CompletableFuture<BedrockCreateResponse> = create(endpoint, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BedrockCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockCreateResponse>

    /** @see create */
    fun create(params: BedrockCreateParams): CompletableFuture<BedrockCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BedrockCreateResponse> =
        create(endpoint, BedrockCreateParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/bedrock) */
    fun retrieve(endpoint: String): CompletableFuture<BedrockRetrieveResponse> =
        retrieve(endpoint, BedrockRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        params: BedrockRetrieveParams = BedrockRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockRetrieveResponse> =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        params: BedrockRetrieveParams = BedrockRetrieveParams.none(),
    ): CompletableFuture<BedrockRetrieveResponse> =
        retrieve(endpoint, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BedrockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: BedrockRetrieveParams): CompletableFuture<BedrockRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BedrockRetrieveResponse> =
        retrieve(endpoint, BedrockRetrieveParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/bedrock) */
    fun update(endpoint: String): CompletableFuture<BedrockUpdateResponse> =
        update(endpoint, BedrockUpdateParams.none())

    /** @see update */
    fun update(
        endpoint: String,
        params: BedrockUpdateParams = BedrockUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockUpdateResponse> =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    fun update(
        endpoint: String,
        params: BedrockUpdateParams = BedrockUpdateParams.none(),
    ): CompletableFuture<BedrockUpdateResponse> = update(endpoint, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BedrockUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockUpdateResponse>

    /** @see update */
    fun update(params: BedrockUpdateParams): CompletableFuture<BedrockUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BedrockUpdateResponse> =
        update(endpoint, BedrockUpdateParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/bedrock) */
    fun delete(endpoint: String): CompletableFuture<BedrockDeleteResponse> =
        delete(endpoint, BedrockDeleteParams.none())

    /** @see delete */
    fun delete(
        endpoint: String,
        params: BedrockDeleteParams = BedrockDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockDeleteResponse> =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    fun delete(
        endpoint: String,
        params: BedrockDeleteParams = BedrockDeleteParams.none(),
    ): CompletableFuture<BedrockDeleteResponse> = delete(endpoint, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BedrockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockDeleteResponse>

    /** @see delete */
    fun delete(params: BedrockDeleteParams): CompletableFuture<BedrockDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BedrockDeleteResponse> =
        delete(endpoint, BedrockDeleteParams.none(), requestOptions)

    /** [Docs](https://docs.hanzo.ai/docs/pass_through/bedrock) */
    fun patch(endpoint: String): CompletableFuture<BedrockPatchResponse> =
        patch(endpoint, BedrockPatchParams.none())

    /** @see patch */
    fun patch(
        endpoint: String,
        params: BedrockPatchParams = BedrockPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockPatchResponse> =
        patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see patch */
    fun patch(
        endpoint: String,
        params: BedrockPatchParams = BedrockPatchParams.none(),
    ): CompletableFuture<BedrockPatchResponse> = patch(endpoint, params, RequestOptions.none())

    /** @see patch */
    fun patch(
        params: BedrockPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BedrockPatchResponse>

    /** @see patch */
    fun patch(params: BedrockPatchParams): CompletableFuture<BedrockPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see patch */
    fun patch(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BedrockPatchResponse> =
        patch(endpoint, BedrockPatchParams.none(), requestOptions)

    /**
     * A view of [BedrockServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BedrockServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockServiceAsync.create].
         */
        fun create(endpoint: String): CompletableFuture<HttpResponseFor<BedrockCreateResponse>> =
            create(endpoint, BedrockCreateParams.none())

        /** @see create */
        fun create(
            endpoint: String,
            params: BedrockCreateParams = BedrockCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockCreateResponse>> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        fun create(
            endpoint: String,
            params: BedrockCreateParams = BedrockCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<BedrockCreateResponse>> =
            create(endpoint, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BedrockCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockCreateResponse>>

        /** @see create */
        fun create(
            params: BedrockCreateParams
        ): CompletableFuture<HttpResponseFor<BedrockCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BedrockCreateResponse>> =
            create(endpoint, BedrockCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockServiceAsync.retrieve].
         */
        fun retrieve(
            endpoint: String
        ): CompletableFuture<HttpResponseFor<BedrockRetrieveResponse>> =
            retrieve(endpoint, BedrockRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            params: BedrockRetrieveParams = BedrockRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockRetrieveResponse>> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            params: BedrockRetrieveParams = BedrockRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BedrockRetrieveResponse>> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BedrockRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BedrockRetrieveParams
        ): CompletableFuture<HttpResponseFor<BedrockRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BedrockRetrieveResponse>> =
            retrieve(endpoint, BedrockRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockServiceAsync.update].
         */
        fun update(endpoint: String): CompletableFuture<HttpResponseFor<BedrockUpdateResponse>> =
            update(endpoint, BedrockUpdateParams.none())

        /** @see update */
        fun update(
            endpoint: String,
            params: BedrockUpdateParams = BedrockUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockUpdateResponse>> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        fun update(
            endpoint: String,
            params: BedrockUpdateParams = BedrockUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<BedrockUpdateResponse>> =
            update(endpoint, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BedrockUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockUpdateResponse>>

        /** @see update */
        fun update(
            params: BedrockUpdateParams
        ): CompletableFuture<HttpResponseFor<BedrockUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BedrockUpdateResponse>> =
            update(endpoint, BedrockUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /bedrock/{endpoint}`, but is otherwise the same
         * as [BedrockServiceAsync.delete].
         */
        fun delete(endpoint: String): CompletableFuture<HttpResponseFor<BedrockDeleteResponse>> =
            delete(endpoint, BedrockDeleteParams.none())

        /** @see delete */
        fun delete(
            endpoint: String,
            params: BedrockDeleteParams = BedrockDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockDeleteResponse>> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        fun delete(
            endpoint: String,
            params: BedrockDeleteParams = BedrockDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<BedrockDeleteResponse>> =
            delete(endpoint, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BedrockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockDeleteResponse>>

        /** @see delete */
        fun delete(
            params: BedrockDeleteParams
        ): CompletableFuture<HttpResponseFor<BedrockDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BedrockDeleteResponse>> =
            delete(endpoint, BedrockDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /bedrock/{endpoint}`, but is otherwise the same as
         * [BedrockServiceAsync.patch].
         */
        fun patch(endpoint: String): CompletableFuture<HttpResponseFor<BedrockPatchResponse>> =
            patch(endpoint, BedrockPatchParams.none())

        /** @see patch */
        fun patch(
            endpoint: String,
            params: BedrockPatchParams = BedrockPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockPatchResponse>> =
            patch(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see patch */
        fun patch(
            endpoint: String,
            params: BedrockPatchParams = BedrockPatchParams.none(),
        ): CompletableFuture<HttpResponseFor<BedrockPatchResponse>> =
            patch(endpoint, params, RequestOptions.none())

        /** @see patch */
        fun patch(
            params: BedrockPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BedrockPatchResponse>>

        /** @see patch */
        fun patch(
            params: BedrockPatchParams
        ): CompletableFuture<HttpResponseFor<BedrockPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see patch */
        fun patch(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BedrockPatchResponse>> =
            patch(endpoint, BedrockPatchParams.none(), requestOptions)
    }
}
