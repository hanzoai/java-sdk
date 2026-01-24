// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.cohere.CohereCreateParams
import ai.hanzo.api.models.cohere.CohereCreateResponse
import ai.hanzo.api.models.cohere.CohereDeleteParams
import ai.hanzo.api.models.cohere.CohereDeleteResponse
import ai.hanzo.api.models.cohere.CohereModifyParams
import ai.hanzo.api.models.cohere.CohereModifyResponse
import ai.hanzo.api.models.cohere.CohereRetrieveParams
import ai.hanzo.api.models.cohere.CohereRetrieveResponse
import ai.hanzo.api.models.cohere.CohereUpdateParams
import ai.hanzo.api.models.cohere.CohereUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CohereServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CohereServiceAsync

    /** [Docs](https://docs.litellm.ai/docs/pass_through/cohere) */
    fun create(endpoint: String): CompletableFuture<CohereCreateResponse> =
        create(endpoint, CohereCreateParams.none())

    /** @see create */
    fun create(
        endpoint: String,
        params: CohereCreateParams = CohereCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereCreateResponse> =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    fun create(
        endpoint: String,
        params: CohereCreateParams = CohereCreateParams.none(),
    ): CompletableFuture<CohereCreateResponse> = create(endpoint, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CohereCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereCreateResponse>

    /** @see create */
    fun create(params: CohereCreateParams): CompletableFuture<CohereCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CohereCreateResponse> =
        create(endpoint, CohereCreateParams.none(), requestOptions)

    /** [Docs](https://docs.litellm.ai/docs/pass_through/cohere) */
    fun retrieve(endpoint: String): CompletableFuture<CohereRetrieveResponse> =
        retrieve(endpoint, CohereRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        params: CohereRetrieveParams = CohereRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereRetrieveResponse> =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        params: CohereRetrieveParams = CohereRetrieveParams.none(),
    ): CompletableFuture<CohereRetrieveResponse> = retrieve(endpoint, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CohereRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: CohereRetrieveParams): CompletableFuture<CohereRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CohereRetrieveResponse> =
        retrieve(endpoint, CohereRetrieveParams.none(), requestOptions)

    /** [Docs](https://docs.litellm.ai/docs/pass_through/cohere) */
    fun update(endpoint: String): CompletableFuture<CohereUpdateResponse> =
        update(endpoint, CohereUpdateParams.none())

    /** @see update */
    fun update(
        endpoint: String,
        params: CohereUpdateParams = CohereUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereUpdateResponse> =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    fun update(
        endpoint: String,
        params: CohereUpdateParams = CohereUpdateParams.none(),
    ): CompletableFuture<CohereUpdateResponse> = update(endpoint, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CohereUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereUpdateResponse>

    /** @see update */
    fun update(params: CohereUpdateParams): CompletableFuture<CohereUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CohereUpdateResponse> =
        update(endpoint, CohereUpdateParams.none(), requestOptions)

    /** [Docs](https://docs.litellm.ai/docs/pass_through/cohere) */
    fun delete(endpoint: String): CompletableFuture<CohereDeleteResponse> =
        delete(endpoint, CohereDeleteParams.none())

    /** @see delete */
    fun delete(
        endpoint: String,
        params: CohereDeleteParams = CohereDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereDeleteResponse> =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    fun delete(
        endpoint: String,
        params: CohereDeleteParams = CohereDeleteParams.none(),
    ): CompletableFuture<CohereDeleteResponse> = delete(endpoint, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CohereDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereDeleteResponse>

    /** @see delete */
    fun delete(params: CohereDeleteParams): CompletableFuture<CohereDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CohereDeleteResponse> =
        delete(endpoint, CohereDeleteParams.none(), requestOptions)

    /** [Docs](https://docs.litellm.ai/docs/pass_through/cohere) */
    fun modify(endpoint: String): CompletableFuture<CohereModifyResponse> =
        modify(endpoint, CohereModifyParams.none())

    /** @see modify */
    fun modify(
        endpoint: String,
        params: CohereModifyParams = CohereModifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereModifyResponse> =
        modify(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see modify */
    fun modify(
        endpoint: String,
        params: CohereModifyParams = CohereModifyParams.none(),
    ): CompletableFuture<CohereModifyResponse> = modify(endpoint, params, RequestOptions.none())

    /** @see modify */
    fun modify(
        params: CohereModifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CohereModifyResponse>

    /** @see modify */
    fun modify(params: CohereModifyParams): CompletableFuture<CohereModifyResponse> =
        modify(params, RequestOptions.none())

    /** @see modify */
    fun modify(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CohereModifyResponse> =
        modify(endpoint, CohereModifyParams.none(), requestOptions)

    /**
     * A view of [CohereServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CohereServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.create].
         */
        fun create(endpoint: String): CompletableFuture<HttpResponseFor<CohereCreateResponse>> =
            create(endpoint, CohereCreateParams.none())

        /** @see create */
        fun create(
            endpoint: String,
            params: CohereCreateParams = CohereCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereCreateResponse>> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        fun create(
            endpoint: String,
            params: CohereCreateParams = CohereCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<CohereCreateResponse>> =
            create(endpoint, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CohereCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereCreateResponse>>

        /** @see create */
        fun create(
            params: CohereCreateParams
        ): CompletableFuture<HttpResponseFor<CohereCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CohereCreateResponse>> =
            create(endpoint, CohereCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.retrieve].
         */
        fun retrieve(endpoint: String): CompletableFuture<HttpResponseFor<CohereRetrieveResponse>> =
            retrieve(endpoint, CohereRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            params: CohereRetrieveParams = CohereRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereRetrieveResponse>> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            params: CohereRetrieveParams = CohereRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CohereRetrieveResponse>> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CohereRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CohereRetrieveParams
        ): CompletableFuture<HttpResponseFor<CohereRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CohereRetrieveResponse>> =
            retrieve(endpoint, CohereRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.update].
         */
        fun update(endpoint: String): CompletableFuture<HttpResponseFor<CohereUpdateResponse>> =
            update(endpoint, CohereUpdateParams.none())

        /** @see update */
        fun update(
            endpoint: String,
            params: CohereUpdateParams = CohereUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereUpdateResponse>> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        fun update(
            endpoint: String,
            params: CohereUpdateParams = CohereUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<CohereUpdateResponse>> =
            update(endpoint, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CohereUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereUpdateResponse>>

        /** @see update */
        fun update(
            params: CohereUpdateParams
        ): CompletableFuture<HttpResponseFor<CohereUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CohereUpdateResponse>> =
            update(endpoint, CohereUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.delete].
         */
        fun delete(endpoint: String): CompletableFuture<HttpResponseFor<CohereDeleteResponse>> =
            delete(endpoint, CohereDeleteParams.none())

        /** @see delete */
        fun delete(
            endpoint: String,
            params: CohereDeleteParams = CohereDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereDeleteResponse>> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        fun delete(
            endpoint: String,
            params: CohereDeleteParams = CohereDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CohereDeleteResponse>> =
            delete(endpoint, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CohereDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereDeleteResponse>>

        /** @see delete */
        fun delete(
            params: CohereDeleteParams
        ): CompletableFuture<HttpResponseFor<CohereDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CohereDeleteResponse>> =
            delete(endpoint, CohereDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cohere/{endpoint}`, but is otherwise the same as
         * [CohereServiceAsync.modify].
         */
        fun modify(endpoint: String): CompletableFuture<HttpResponseFor<CohereModifyResponse>> =
            modify(endpoint, CohereModifyParams.none())

        /** @see modify */
        fun modify(
            endpoint: String,
            params: CohereModifyParams = CohereModifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereModifyResponse>> =
            modify(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see modify */
        fun modify(
            endpoint: String,
            params: CohereModifyParams = CohereModifyParams.none(),
        ): CompletableFuture<HttpResponseFor<CohereModifyResponse>> =
            modify(endpoint, params, RequestOptions.none())

        /** @see modify */
        fun modify(
            params: CohereModifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CohereModifyResponse>>

        /** @see modify */
        fun modify(
            params: CohereModifyParams
        ): CompletableFuture<HttpResponseFor<CohereModifyResponse>> =
            modify(params, RequestOptions.none())

        /** @see modify */
        fun modify(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CohereModifyResponse>> =
            modify(endpoint, CohereModifyParams.none(), requestOptions)
    }
}
