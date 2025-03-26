// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.finetuning.jobs

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.finetuning.jobs.cancel.CancelCreateParams
import com.hanzo_ai.api.models.finetuning.jobs.cancel.CancelCreateResponse
import java.util.concurrent.CompletableFuture

interface CancelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Cancel a fine-tuning job.
     *
     * This is the equivalent of POST
     * https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel
     *
     * Supported Query Params:
     * - `custom_llm_provider`: Name of the LLM provider
     * - `fine_tuning_job_id`: The ID of the fine-tuning job to cancel.
     */
    fun create(params: CancelCreateParams): CompletableFuture<CancelCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CancelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelCreateResponse>

    /**
     * A view of [CancelServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel`,
         * but is otherwise the same as [CancelServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CancelCreateParams
        ): CompletableFuture<HttpResponseFor<CancelCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CancelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelCreateResponse>>
    }
}
