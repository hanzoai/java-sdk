// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.threads

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.threads.runs.RunCreateParams
import ai.hanzo.api.models.threads.runs.RunCreateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    /**
     * Create a run.
     *
     * API Reference: https://platform.openai.com/docs/api-reference/runs/createRun
     */
    fun create(threadId: String): RunCreateResponse = create(threadId, RunCreateParams.none())

    /** @see create */
    fun create(
        threadId: String,
        params: RunCreateParams = RunCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCreateResponse = create(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see create */
    fun create(
        threadId: String,
        params: RunCreateParams = RunCreateParams.none(),
    ): RunCreateResponse = create(threadId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCreateResponse

    /** @see create */
    fun create(params: RunCreateParams): RunCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(threadId: String, requestOptions: RequestOptions): RunCreateResponse =
        create(threadId, RunCreateParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/threads/{thread_id}/runs`, but is otherwise the
         * same as [RunService.create].
         */
        @MustBeClosed
        fun create(threadId: String): HttpResponseFor<RunCreateResponse> =
            create(threadId, RunCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            threadId: String,
            params: RunCreateParams = RunCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCreateResponse> =
            create(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            threadId: String,
            params: RunCreateParams = RunCreateParams.none(),
        ): HttpResponseFor<RunCreateResponse> = create(threadId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: RunCreateParams): HttpResponseFor<RunCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            threadId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunCreateResponse> =
            create(threadId, RunCreateParams.none(), requestOptions)
    }
}
