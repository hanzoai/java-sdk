// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.threads.ThreadCreateParams
import ai.hanzo.api.models.threads.ThreadCreateResponse
import ai.hanzo.api.models.threads.ThreadRetrieveParams
import ai.hanzo.api.models.threads.ThreadRetrieveResponse
import ai.hanzo.api.services.async.threads.MessageServiceAsync
import ai.hanzo.api.services.async.threads.RunServiceAsync
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface ThreadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun messages(): MessageServiceAsync

    fun runs(): RunServiceAsync

    /**
     * Create a thread.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/threads/createThread
     */
    fun create(): CompletableFuture<ThreadCreateResponse> = create(ThreadCreateParams.none())

    /** @see [create] */
    fun create(
        params: ThreadCreateParams = ThreadCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadCreateResponse>

    /** @see [create] */
    fun create(
        params: ThreadCreateParams = ThreadCreateParams.none()
    ): CompletableFuture<ThreadCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<ThreadCreateResponse> =
        create(ThreadCreateParams.none(), requestOptions)

    /**
     * Retrieves a thread.
     *
     * API Reference - https://platform.openai.com/docs/api-reference/threads/getThread
     */
    fun retrieve(params: ThreadRetrieveParams): CompletableFuture<ThreadRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ThreadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadRetrieveResponse>

    /**
     * A view of [ThreadServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun messages(): MessageServiceAsync.WithRawResponse

        fun runs(): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/threads`, but is otherwise the same as
         * [ThreadServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<ThreadCreateResponse>> =
            create(ThreadCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ThreadCreateParams = ThreadCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ThreadCreateParams = ThreadCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ThreadCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ThreadCreateResponse>> =
            create(ThreadCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/threads/{thread_id}`, but is otherwise the same
         * as [ThreadServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ThreadRetrieveParams
        ): CompletableFuture<HttpResponseFor<ThreadRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ThreadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadRetrieveResponse>>
    }
}
