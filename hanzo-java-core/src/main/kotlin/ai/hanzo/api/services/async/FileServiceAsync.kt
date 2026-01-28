// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.files.FileCreateParams
import ai.hanzo.api.models.files.FileCreateResponse
import ai.hanzo.api.models.files.FileDeleteParams
import ai.hanzo.api.models.files.FileDeleteResponse
import ai.hanzo.api.models.files.FileListParams
import ai.hanzo.api.models.files.FileListResponse
import ai.hanzo.api.models.files.FileRetrieveParams
import ai.hanzo.api.models.files.FileRetrieveResponse
import ai.hanzo.api.services.async.files.ContentServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync

    fun content(): ContentServiceAsync

    /**
     * Upload a file that can be used across - Assistants API, Batch API This is the equivalent of
     * POST https://api.openai.com/v1/files
     *
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/files/create
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/files         -H "Authorization: Bearer sk-1234"         -F purpose="batch"         -F file="@mydata.jsonl"
     *     -F expires_after[anchor]="created_at"         -F expires_after[seconds]=2592000
     * ```
     */
    fun create(provider: String, params: FileCreateParams): CompletableFuture<FileCreateResponse> =
        create(provider, params, RequestOptions.none())

    /** @see create */
    fun create(
        provider: String,
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileCreateResponse> =
        create(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see create */
    fun create(params: FileCreateParams): CompletableFuture<FileCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileCreateResponse>

    /**
     * Returns information about a specific file. that can be used across - Assistants API, Batch
     * API This is the equivalent of GET https://api.openai.com/v1/files/{file_id}
     *
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/files/retrieve
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/files/file-abc123         -H "Authorization: Bearer sk-1234"
     *
     * ```
     */
    fun retrieve(
        fileId: String,
        params: FileRetrieveParams,
    ): CompletableFuture<FileRetrieveResponse> = retrieve(fileId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        fileId: String,
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileRetrieveResponse> =
        retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: FileRetrieveParams): CompletableFuture<FileRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileRetrieveResponse>

    /**
     * Returns information about a specific file. that can be used across - Assistants API, Batch
     * API This is the equivalent of GET https://api.openai.com/v1/files/
     *
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/files/list
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/files        -H "Authorization: Bearer sk-1234"
     *
     * ```
     */
    fun list(provider: String): CompletableFuture<FileListResponse> =
        list(provider, FileListParams.none())

    /** @see list */
    fun list(
        provider: String,
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileListResponse> =
        list(params.toBuilder().provider(provider).build(), requestOptions)

    /** @see list */
    fun list(
        provider: String,
        params: FileListParams = FileListParams.none(),
    ): CompletableFuture<FileListResponse> = list(provider, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileListResponse>

    /** @see list */
    fun list(params: FileListParams): CompletableFuture<FileListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        provider: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileListResponse> = list(provider, FileListParams.none(), requestOptions)

    /**
     * Deletes a specified file. that can be used across - Assistants API, Batch API This is the
     * equivalent of DELETE https://api.openai.com/v1/files/{file_id}
     *
     * Supports Identical Params as: https://platform.openai.com/docs/api-reference/files/delete
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/files/file-abc123     -X DELETE     -H "Authorization: Bearer $OPENAI_API_KEY"
     *
     * ```
     */
    fun delete(fileId: String, params: FileDeleteParams): CompletableFuture<FileDeleteResponse> =
        delete(fileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        fileId: String,
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileDeleteResponse> =
        delete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see delete */
    fun delete(params: FileDeleteParams): CompletableFuture<FileDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileDeleteResponse>

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        fun content(): ContentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /{provider}/v1/files`, but is otherwise the same as
         * [FileServiceAsync.create].
         */
        fun create(
            provider: String,
            params: FileCreateParams,
        ): CompletableFuture<HttpResponseFor<FileCreateResponse>> =
            create(provider, params, RequestOptions.none())

        /** @see create */
        fun create(
            provider: String,
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileCreateResponse>> =
            create(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see create */
        fun create(
            params: FileCreateParams
        ): CompletableFuture<HttpResponseFor<FileCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/files/{file_id}`, but is otherwise
         * the same as [FileServiceAsync.retrieve].
         */
        fun retrieve(
            fileId: String,
            params: FileRetrieveParams,
        ): CompletableFuture<HttpResponseFor<FileRetrieveResponse>> =
            retrieve(fileId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            fileId: String,
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileRetrieveResponse>> =
            retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: FileRetrieveParams
        ): CompletableFuture<HttpResponseFor<FileRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/files`, but is otherwise the same as
         * [FileServiceAsync.list].
         */
        fun list(provider: String): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(provider, FileListParams.none())

        /** @see list */
        fun list(
            provider: String,
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(params.toBuilder().provider(provider).build(), requestOptions)

        /** @see list */
        fun list(
            provider: String,
            params: FileListParams = FileListParams.none(),
        ): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(provider, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FileListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileListResponse>>

        /** @see list */
        fun list(params: FileListParams): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            provider: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(provider, FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /{provider}/v1/files/{file_id}`, but is otherwise
         * the same as [FileServiceAsync.delete].
         */
        fun delete(
            fileId: String,
            params: FileDeleteParams,
        ): CompletableFuture<HttpResponseFor<FileDeleteResponse>> =
            delete(fileId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            fileId: String,
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileDeleteResponse>> =
            delete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: FileDeleteParams
        ): CompletableFuture<HttpResponseFor<FileDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileDeleteResponse>>
    }
}
