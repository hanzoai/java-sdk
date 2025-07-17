// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.files

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.files.content.ContentRetrieveParams
import ai.hanzo.api.models.files.content.ContentRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ContentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContentServiceAsync

    /**
     * Returns information about a specific file. that can be used across - Assistants API, Batch
     * API This is the equivalent of GET https://api.openai.com/v1/files/{file_id}/content
     *
     * Supports Identical Params as:
     * https://platform.openai.com/docs/api-reference/files/retrieve-contents
     *
     * Example Curl
     *
     * ```
     * curl http://localhost:4000/v1/files/file-abc123/content         -H "Authorization: Bearer sk-1234"
     *
     * ```
     */
    fun retrieve(
        fileId: String,
        params: ContentRetrieveParams,
    ): CompletableFuture<ContentRetrieveResponse> = retrieve(fileId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        fileId: String,
        params: ContentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentRetrieveResponse> =
        retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: ContentRetrieveParams): CompletableFuture<ContentRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ContentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentRetrieveResponse>

    /**
     * A view of [ContentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /{provider}/v1/files/{file_id}/content`, but is
         * otherwise the same as [ContentServiceAsync.retrieve].
         */
        fun retrieve(
            fileId: String,
            params: ContentRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ContentRetrieveResponse>> =
            retrieve(fileId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            fileId: String,
            params: ContentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentRetrieveResponse>> =
            retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            params: ContentRetrieveParams
        ): CompletableFuture<HttpResponseFor<ContentRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: ContentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentRetrieveResponse>>
    }
}
