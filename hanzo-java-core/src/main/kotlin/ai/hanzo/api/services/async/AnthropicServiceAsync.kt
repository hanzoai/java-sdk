// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AnthropicServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnthropicServiceAsync

    /** [Docs](https://docs.litellm.ai/docs/pass_through/anthropic_completion) */
    fun create(endpoint: String): CompletableFuture<AnthropicCreateResponse> =
        create(endpoint, AnthropicCreateParams.none())

    /** @see create */
    fun create(
        endpoint: String,
        params: AnthropicCreateParams = AnthropicCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicCreateResponse> =
        create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see create */
    fun create(
        endpoint: String,
        params: AnthropicCreateParams = AnthropicCreateParams.none(),
    ): CompletableFuture<AnthropicCreateResponse> = create(endpoint, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AnthropicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicCreateResponse>

    /** @see create */
    fun create(params: AnthropicCreateParams): CompletableFuture<AnthropicCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnthropicCreateResponse> =
        create(endpoint, AnthropicCreateParams.none(), requestOptions)

    /** [Docs](https://docs.litellm.ai/docs/pass_through/anthropic_completion) */
    fun retrieve(endpoint: String): CompletableFuture<AnthropicRetrieveResponse> =
        retrieve(endpoint, AnthropicRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        params: AnthropicRetrieveParams = AnthropicRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicRetrieveResponse> =
        retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        params: AnthropicRetrieveParams = AnthropicRetrieveParams.none(),
    ): CompletableFuture<AnthropicRetrieveResponse> =
        retrieve(endpoint, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AnthropicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AnthropicRetrieveParams): CompletableFuture<AnthropicRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnthropicRetrieveResponse> =
        retrieve(endpoint, AnthropicRetrieveParams.none(), requestOptions)

    /** [Docs](https://docs.litellm.ai/docs/pass_through/anthropic_completion) */
    fun update(endpoint: String): CompletableFuture<AnthropicUpdateResponse> =
        update(endpoint, AnthropicUpdateParams.none())

    /** @see update */
    fun update(
        endpoint: String,
        params: AnthropicUpdateParams = AnthropicUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicUpdateResponse> =
        update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see update */
    fun update(
        endpoint: String,
        params: AnthropicUpdateParams = AnthropicUpdateParams.none(),
    ): CompletableFuture<AnthropicUpdateResponse> = update(endpoint, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AnthropicUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicUpdateResponse>

    /** @see update */
    fun update(params: AnthropicUpdateParams): CompletableFuture<AnthropicUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnthropicUpdateResponse> =
        update(endpoint, AnthropicUpdateParams.none(), requestOptions)

    /** [Docs](https://docs.litellm.ai/docs/pass_through/anthropic_completion) */
    fun delete(endpoint: String): CompletableFuture<AnthropicDeleteResponse> =
        delete(endpoint, AnthropicDeleteParams.none())

    /** @see delete */
    fun delete(
        endpoint: String,
        params: AnthropicDeleteParams = AnthropicDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicDeleteResponse> =
        delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see delete */
    fun delete(
        endpoint: String,
        params: AnthropicDeleteParams = AnthropicDeleteParams.none(),
    ): CompletableFuture<AnthropicDeleteResponse> = delete(endpoint, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AnthropicDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicDeleteResponse>

    /** @see delete */
    fun delete(params: AnthropicDeleteParams): CompletableFuture<AnthropicDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnthropicDeleteResponse> =
        delete(endpoint, AnthropicDeleteParams.none(), requestOptions)

    /** [Docs](https://docs.litellm.ai/docs/pass_through/anthropic_completion) */
    fun modify(endpoint: String): CompletableFuture<AnthropicModifyResponse> =
        modify(endpoint, AnthropicModifyParams.none())

    /** @see modify */
    fun modify(
        endpoint: String,
        params: AnthropicModifyParams = AnthropicModifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicModifyResponse> =
        modify(params.toBuilder().endpoint(endpoint).build(), requestOptions)

    /** @see modify */
    fun modify(
        endpoint: String,
        params: AnthropicModifyParams = AnthropicModifyParams.none(),
    ): CompletableFuture<AnthropicModifyResponse> = modify(endpoint, params, RequestOptions.none())

    /** @see modify */
    fun modify(
        params: AnthropicModifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnthropicModifyResponse>

    /** @see modify */
    fun modify(params: AnthropicModifyParams): CompletableFuture<AnthropicModifyResponse> =
        modify(params, RequestOptions.none())

    /** @see modify */
    fun modify(
        endpoint: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnthropicModifyResponse> =
        modify(endpoint, AnthropicModifyParams.none(), requestOptions)

    /**
     * A view of [AnthropicServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AnthropicServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicServiceAsync.create].
         */
        fun create(endpoint: String): CompletableFuture<HttpResponseFor<AnthropicCreateResponse>> =
            create(endpoint, AnthropicCreateParams.none())

        /** @see create */
        fun create(
            endpoint: String,
            params: AnthropicCreateParams = AnthropicCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicCreateResponse>> =
            create(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see create */
        fun create(
            endpoint: String,
            params: AnthropicCreateParams = AnthropicCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicCreateResponse>> =
            create(endpoint, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AnthropicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicCreateResponse>>

        /** @see create */
        fun create(
            params: AnthropicCreateParams
        ): CompletableFuture<HttpResponseFor<AnthropicCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnthropicCreateResponse>> =
            create(endpoint, AnthropicCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /anthropic/{endpoint}`, but is otherwise the same as
         * [AnthropicServiceAsync.retrieve].
         */
        fun retrieve(
            endpoint: String
        ): CompletableFuture<HttpResponseFor<AnthropicRetrieveResponse>> =
            retrieve(endpoint, AnthropicRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            params: AnthropicRetrieveParams = AnthropicRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicRetrieveResponse>> =
            retrieve(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            params: AnthropicRetrieveParams = AnthropicRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicRetrieveResponse>> =
            retrieve(endpoint, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AnthropicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AnthropicRetrieveParams
        ): CompletableFuture<HttpResponseFor<AnthropicRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnthropicRetrieveResponse>> =
            retrieve(endpoint, AnthropicRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /anthropic/{endpoint}`, but is otherwise the same as
         * [AnthropicServiceAsync.update].
         */
        fun update(endpoint: String): CompletableFuture<HttpResponseFor<AnthropicUpdateResponse>> =
            update(endpoint, AnthropicUpdateParams.none())

        /** @see update */
        fun update(
            endpoint: String,
            params: AnthropicUpdateParams = AnthropicUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicUpdateResponse>> =
            update(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see update */
        fun update(
            endpoint: String,
            params: AnthropicUpdateParams = AnthropicUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicUpdateResponse>> =
            update(endpoint, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AnthropicUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicUpdateResponse>>

        /** @see update */
        fun update(
            params: AnthropicUpdateParams
        ): CompletableFuture<HttpResponseFor<AnthropicUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnthropicUpdateResponse>> =
            update(endpoint, AnthropicUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicServiceAsync.delete].
         */
        fun delete(endpoint: String): CompletableFuture<HttpResponseFor<AnthropicDeleteResponse>> =
            delete(endpoint, AnthropicDeleteParams.none())

        /** @see delete */
        fun delete(
            endpoint: String,
            params: AnthropicDeleteParams = AnthropicDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicDeleteResponse>> =
            delete(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see delete */
        fun delete(
            endpoint: String,
            params: AnthropicDeleteParams = AnthropicDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicDeleteResponse>> =
            delete(endpoint, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AnthropicDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicDeleteResponse>>

        /** @see delete */
        fun delete(
            params: AnthropicDeleteParams
        ): CompletableFuture<HttpResponseFor<AnthropicDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnthropicDeleteResponse>> =
            delete(endpoint, AnthropicDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /anthropic/{endpoint}`, but is otherwise the same
         * as [AnthropicServiceAsync.modify].
         */
        fun modify(endpoint: String): CompletableFuture<HttpResponseFor<AnthropicModifyResponse>> =
            modify(endpoint, AnthropicModifyParams.none())

        /** @see modify */
        fun modify(
            endpoint: String,
            params: AnthropicModifyParams = AnthropicModifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicModifyResponse>> =
            modify(params.toBuilder().endpoint(endpoint).build(), requestOptions)

        /** @see modify */
        fun modify(
            endpoint: String,
            params: AnthropicModifyParams = AnthropicModifyParams.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicModifyResponse>> =
            modify(endpoint, params, RequestOptions.none())

        /** @see modify */
        fun modify(
            params: AnthropicModifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnthropicModifyResponse>>

        /** @see modify */
        fun modify(
            params: AnthropicModifyParams
        ): CompletableFuture<HttpResponseFor<AnthropicModifyResponse>> =
            modify(params, RequestOptions.none())

        /** @see modify */
        fun modify(
            endpoint: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnthropicModifyResponse>> =
            modify(endpoint, AnthropicModifyParams.none(), requestOptions)
    }
}
