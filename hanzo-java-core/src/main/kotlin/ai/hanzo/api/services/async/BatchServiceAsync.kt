// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.batches.BatchCancelWithProviderParams
import ai.hanzo.api.models.batches.BatchCancelWithProviderResponse
import ai.hanzo.api.models.batches.BatchCreateParams
import ai.hanzo.api.models.batches.BatchCreateResponse
import ai.hanzo.api.models.batches.BatchCreateWithProviderParams
import ai.hanzo.api.models.batches.BatchCreateWithProviderResponse
import ai.hanzo.api.models.batches.BatchListParams
import ai.hanzo.api.models.batches.BatchListResponse
import ai.hanzo.api.models.batches.BatchListWithProviderParams
import ai.hanzo.api.models.batches.BatchListWithProviderResponse
import ai.hanzo.api.models.batches.BatchRetrieveParams
import ai.hanzo.api.models.batches.BatchRetrieveResponse
import ai.hanzo.api.models.batches.BatchRetrieveWithProviderParams
import ai.hanzo.api.models.batches.BatchRetrieveWithProviderResponse
import ai.hanzo.api.services.async.batches.CancelServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    fun cancel(): CancelServiceAsync

    /**
     * Create large batches of API requests for asynchronous processing. This is the equivalent of
     * POST https://api.openai.com/v1/batch Supports Identical Params as:
     * https://platform.openai.com/docs/api-reference/batch
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches         -H "Authorization: Bearer sk-1234"         -H "Content-Type: application/json"         -d '{
     *         "input_file_id": "file-abc123",
     *         "endpoint": "/v1/chat/completions",
     *         "completion_window": "24h"
     * }'
     * ```
     */
    fun create(): CompletableFuture<BatchCreateResponse> = create(BatchCreateParams.none())

    /** @see [create] */
    fun create(
        params: BatchCreateParams = BatchCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCreateResponse>

    /** @see [create] */
    fun create(
        params: BatchCreateParams = BatchCreateParams.none()
    ): CompletableFuture<BatchCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<BatchCreateResponse> =
        create(BatchCreateParams.none(), requestOptions)

    /**
     * Retrieves a batch. This is the equivalent of GET https://api.openai.com/v1/batches/{batch_id}
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/batch/retrieve
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches/batch_abc123     -H "Authorization: Bearer sk-1234"     -H "Content-Type: application/json"
     * ```
     */
    fun retrieve(batchId: String): CompletableFuture<BatchRetrieveResponse> =
        retrieve(batchId, BatchRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        batchId: String,
        params: BatchRetrieveParams = BatchRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchRetrieveResponse> =
        retrieve(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        batchId: String,
        params: BatchRetrieveParams = BatchRetrieveParams.none(),
    ): CompletableFuture<BatchRetrieveResponse> = retrieve(batchId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: BatchRetrieveParams): CompletableFuture<BatchRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        batchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchRetrieveResponse> =
        retrieve(batchId, BatchRetrieveParams.none(), requestOptions)

    /**
     * Lists This is the equivalent of GET https://api.openai.com/v1/batches/ Supports Identical
     * Params as: https://platform.openai.com/docs/api-reference/batch/list
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches?limit=2     -H "Authorization: Bearer sk-1234"     -H "Content-Type: application/json"
     * ```
     */
    fun list(): CompletableFuture<BatchListResponse> = list(BatchListParams.none())

    /** @see [list] */
    fun list(
        params: BatchListParams = BatchListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchListResponse>

    /** @see [list] */
    fun list(
        params: BatchListParams = BatchListParams.none()
    ): CompletableFuture<BatchListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BatchListResponse> =
        list(BatchListParams.none(), requestOptions)

    /**
     * Cancel a batch. This is the equivalent of POST
     * https://api.openai.com/v1/batches/{batch_id}/cancel
     *
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/batch/cancel
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches/batch_abc123/cancel         -H "Authorization: Bearer sk-1234"         -H "Content-Type: application/json"         -X POST
     *
     * ```
     */
    fun cancelWithProvider(
        batchId: String,
        params: BatchCancelWithProviderParams,
    ): CompletableFuture<BatchCancelWithProviderResponse> =
        cancelWithProvider(batchId, params, RequestOptions.none())

    /** @see [cancelWithProvider] */
    fun cancelWithProvider(
        batchId: String,
        params: BatchCancelWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCancelWithProviderResponse> =
        cancelWithProvider(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see [cancelWithProvider] */
    fun cancelWithProvider(
        params: BatchCancelWithProviderParams
    ): CompletableFuture<BatchCancelWithProviderResponse> =
        cancelWithProvider(params, RequestOptions.none())

    /** @see [cancelWithProvider] */
    fun cancelWithProvider(
        params: BatchCancelWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCancelWithProviderResponse>

    /**
     * Create large batches of API requests for asynchronous processing. This is the equivalent of
     * POST https://api.openai.com/v1/batch Supports Identical Params as:
     * https://platform.openai.com/docs/api-reference/batch
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches         -H "Authorization: Bearer sk-1234"         -H "Content-Type: application/json"         -d '{
     *         "input_file_id": "file-abc123",
     *         "endpoint": "/v1/chat/completions",
     *         "completion_window": "24h"
     * }'
     * ```
     */
    fun createWithProvider(provider: String): CompletableFuture<BatchCreateWithProviderResponse> =
        createWithProvider(provider, BatchCreateWithProviderParams.none())

    /** @see [createWithProvider] */
    fun createWithProvider(
        provider: String,
        params: BatchCreateWithProviderParams = BatchCreateWithProviderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCreateWithProviderResponse> =
        createWithProvider(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see [createWithProvider] */
    fun createWithProvider(
        provider: String,
        params: BatchCreateWithProviderParams = BatchCreateWithProviderParams.none(),
    ): CompletableFuture<BatchCreateWithProviderResponse> =
        createWithProvider(provider, params, RequestOptions.none())

    /** @see [createWithProvider] */
    fun createWithProvider(
        params: BatchCreateWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCreateWithProviderResponse>

    /** @see [createWithProvider] */
    fun createWithProvider(
        params: BatchCreateWithProviderParams
    ): CompletableFuture<BatchCreateWithProviderResponse> =
        createWithProvider(params, RequestOptions.none())

    /** @see [createWithProvider] */
    fun createWithProvider(
        provider: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchCreateWithProviderResponse> =
        createWithProvider(provider, BatchCreateWithProviderParams.none(), requestOptions)

    /**
     * Lists This is the equivalent of GET https://api.openai.com/v1/batches/ Supports Identical
     * Params as: https://platform.openai.com/docs/api-reference/batch/list
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches?limit=2     -H "Authorization: Bearer sk-1234"     -H "Content-Type: application/json"
     * ```
     */
    fun listWithProvider(provider: String): CompletableFuture<BatchListWithProviderResponse> =
        listWithProvider(provider, BatchListWithProviderParams.none())

    /** @see [listWithProvider] */
    fun listWithProvider(
        provider: String,
        params: BatchListWithProviderParams = BatchListWithProviderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchListWithProviderResponse> =
        listWithProvider(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see [listWithProvider] */
    fun listWithProvider(
        provider: String,
        params: BatchListWithProviderParams = BatchListWithProviderParams.none(),
    ): CompletableFuture<BatchListWithProviderResponse> =
        listWithProvider(provider, params, RequestOptions.none())

    /** @see [listWithProvider] */
    fun listWithProvider(
        params: BatchListWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchListWithProviderResponse>

    /** @see [listWithProvider] */
    fun listWithProvider(
        params: BatchListWithProviderParams
    ): CompletableFuture<BatchListWithProviderResponse> =
        listWithProvider(params, RequestOptions.none())

    /** @see [listWithProvider] */
    fun listWithProvider(
        provider: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchListWithProviderResponse> =
        listWithProvider(provider, BatchListWithProviderParams.none(), requestOptions)

    /**
     * Retrieves a batch. This is the equivalent of GET https://api.openai.com/v1/batches/{batch_id}
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/batch/retrieve
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/batches/batch_abc123     -H "Authorization: Bearer sk-1234"     -H "Content-Type: application/json"
     * ```
     */
    fun retrieveWithProvider(
        batchId: String,
        params: BatchRetrieveWithProviderParams,
    ): CompletableFuture<BatchRetrieveWithProviderResponse> =
        retrieveWithProvider(batchId, params, RequestOptions.none())

    /** @see [retrieveWithProvider] */
    fun retrieveWithProvider(
        batchId: String,
        params: BatchRetrieveWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchRetrieveWithProviderResponse> =
        retrieveWithProvider(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see [retrieveWithProvider] */
    fun retrieveWithProvider(
        params: BatchRetrieveWithProviderParams
    ): CompletableFuture<BatchRetrieveWithProviderResponse> =
        retrieveWithProvider(params, RequestOptions.none())

    /** @see [retrieveWithProvider] */
    fun retrieveWithProvider(
        params: BatchRetrieveWithProviderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchRetrieveWithProviderResponse>

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        fun cancel(): CancelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/batches`, but is otherwise the same as
         * [BatchServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<BatchCreateResponse>> =
            create(BatchCreateParams.none())

        /** @see [create] */
        fun create(
            params: BatchCreateParams = BatchCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCreateResponse>>

        /** @see [create] */
        fun create(
            params: BatchCreateParams = BatchCreateParams.none()
        ): CompletableFuture<HttpResponseFor<BatchCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BatchCreateResponse>> =
            create(BatchCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/batches/{batch_id}`, but is otherwise the same
         * as [BatchServiceAsync.retrieve].
         */
        fun retrieve(batchId: String): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>> =
            retrieve(batchId, BatchRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            batchId: String,
            params: BatchRetrieveParams = BatchRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>> =
            retrieve(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            batchId: String,
            params: BatchRetrieveParams = BatchRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>> =
            retrieve(batchId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: BatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: BatchRetrieveParams
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            batchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>> =
            retrieve(batchId, BatchRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/batches`, but is otherwise the same as
         * [BatchServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BatchListResponse>> =
            list(BatchListParams.none())

        /** @see [list] */
        fun list(
            params: BatchListParams = BatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchListResponse>>

        /** @see [list] */
        fun list(
            params: BatchListParams = BatchListParams.none()
        ): CompletableFuture<HttpResponseFor<BatchListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BatchListResponse>> =
            list(BatchListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /{provider}/v1/batches/{batch_id}/cancel`, but is
         * otherwise the same as [BatchServiceAsync.cancelWithProvider].
         */
        fun cancelWithProvider(
            batchId: String,
            params: BatchCancelWithProviderParams,
        ): CompletableFuture<HttpResponseFor<BatchCancelWithProviderResponse>> =
            cancelWithProvider(batchId, params, RequestOptions.none())

        /** @see [cancelWithProvider] */
        fun cancelWithProvider(
            batchId: String,
            params: BatchCancelWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCancelWithProviderResponse>> =
            cancelWithProvider(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see [cancelWithProvider] */
        fun cancelWithProvider(
            params: BatchCancelWithProviderParams
        ): CompletableFuture<HttpResponseFor<BatchCancelWithProviderResponse>> =
            cancelWithProvider(params, RequestOptions.none())

        /** @see [cancelWithProvider] */
        fun cancelWithProvider(
            params: BatchCancelWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCancelWithProviderResponse>>

        /**
         * Returns a raw HTTP response for `post /{provider}/v1/batches`, but is otherwise the same
         * as [BatchServiceAsync.createWithProvider].
         */
        fun createWithProvider(
            provider: String
        ): CompletableFuture<HttpResponseFor<BatchCreateWithProviderResponse>> =
            createWithProvider(provider, BatchCreateWithProviderParams.none())

        /** @see [createWithProvider] */
        fun createWithProvider(
            provider: String,
            params: BatchCreateWithProviderParams = BatchCreateWithProviderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCreateWithProviderResponse>> =
            createWithProvider(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see [createWithProvider] */
        fun createWithProvider(
            provider: String,
            params: BatchCreateWithProviderParams = BatchCreateWithProviderParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchCreateWithProviderResponse>> =
            createWithProvider(provider, params, RequestOptions.none())

        /** @see [createWithProvider] */
        fun createWithProvider(
            params: BatchCreateWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCreateWithProviderResponse>>

        /** @see [createWithProvider] */
        fun createWithProvider(
            params: BatchCreateWithProviderParams
        ): CompletableFuture<HttpResponseFor<BatchCreateWithProviderResponse>> =
            createWithProvider(params, RequestOptions.none())

        /** @see [createWithProvider] */
        fun createWithProvider(
            provider: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchCreateWithProviderResponse>> =
            createWithProvider(provider, BatchCreateWithProviderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/batches`, but is otherwise the same
         * as [BatchServiceAsync.listWithProvider].
         */
        fun listWithProvider(
            provider: String
        ): CompletableFuture<HttpResponseFor<BatchListWithProviderResponse>> =
            listWithProvider(provider, BatchListWithProviderParams.none())

        /** @see [listWithProvider] */
        fun listWithProvider(
            provider: String,
            params: BatchListWithProviderParams = BatchListWithProviderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchListWithProviderResponse>> =
            listWithProvider(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see [listWithProvider] */
        fun listWithProvider(
            provider: String,
            params: BatchListWithProviderParams = BatchListWithProviderParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchListWithProviderResponse>> =
            listWithProvider(provider, params, RequestOptions.none())

        /** @see [listWithProvider] */
        fun listWithProvider(
            params: BatchListWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchListWithProviderResponse>>

        /** @see [listWithProvider] */
        fun listWithProvider(
            params: BatchListWithProviderParams
        ): CompletableFuture<HttpResponseFor<BatchListWithProviderResponse>> =
            listWithProvider(params, RequestOptions.none())

        /** @see [listWithProvider] */
        fun listWithProvider(
            provider: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchListWithProviderResponse>> =
            listWithProvider(provider, BatchListWithProviderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/batches/{batch_id}`, but is otherwise
         * the same as [BatchServiceAsync.retrieveWithProvider].
         */
        fun retrieveWithProvider(
            batchId: String,
            params: BatchRetrieveWithProviderParams,
        ): CompletableFuture<HttpResponseFor<BatchRetrieveWithProviderResponse>> =
            retrieveWithProvider(batchId, params, RequestOptions.none())

        /** @see [retrieveWithProvider] */
        fun retrieveWithProvider(
            batchId: String,
            params: BatchRetrieveWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchRetrieveWithProviderResponse>> =
            retrieveWithProvider(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see [retrieveWithProvider] */
        fun retrieveWithProvider(
            params: BatchRetrieveWithProviderParams
        ): CompletableFuture<HttpResponseFor<BatchRetrieveWithProviderResponse>> =
            retrieveWithProvider(params, RequestOptions.none())

        /** @see [retrieveWithProvider] */
        fun retrieveWithProvider(
            params: BatchRetrieveWithProviderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchRetrieveWithProviderResponse>>
    }
}
