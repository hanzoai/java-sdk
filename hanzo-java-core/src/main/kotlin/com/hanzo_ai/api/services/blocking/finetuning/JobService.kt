// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking.finetuning

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.finetuning.jobs.JobCreateParams
import com.hanzo_ai.api.models.finetuning.jobs.JobCreateResponse
import com.hanzo_ai.api.models.finetuning.jobs.JobListParams
import com.hanzo_ai.api.models.finetuning.jobs.JobListResponse
import com.hanzo_ai.api.models.finetuning.jobs.JobRetrieveParams
import com.hanzo_ai.api.models.finetuning.jobs.JobRetrieveResponse
import com.hanzo_ai.api.services.blocking.finetuning.jobs.CancelService

interface JobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun cancel(): CancelService

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given
     * dataset. This is the equivalent of POST https://api.openai.com/v1/fine_tuning/jobs
     *
     * Supports Identical Params as:
     * https://platform.openai.com/docs/api-reference/fine-tuning/create
     *
     * Example Curl:
     * ```
     * curl http://localhost:4000/v1/fine_tuning/jobs       -H "Content-Type: application/json"       -H "Authorization: Bearer sk-1234"       -d '{
     *     "model": "gpt-3.5-turbo",
     *     "training_file": "file-abc123",
     *     "hyperparameters": {
     *       "n_epochs": 4
     *     }
     *   }'
     * ```
     */
    fun create(params: JobCreateParams): JobCreateResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: JobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobCreateResponse

    /**
     * Retrieves a fine-tuning job. This is the equivalent of GET
     * https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}
     *
     * Supported Query Params:
     * - `custom_llm_provider`: Name of the LLM provider
     * - `fine_tuning_job_id`: The ID of the fine-tuning job to retrieve.
     */
    fun retrieve(params: JobRetrieveParams): JobRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobRetrieveResponse

    /**
     * Lists fine-tuning jobs for the organization. This is the equivalent of GET
     * https://api.openai.com/v1/fine_tuning/jobs
     *
     * Supported Query Params:
     * - `custom_llm_provider`: Name of the LLM provider
     * - `after`: Identifier for the last job from the previous pagination request.
     * - `limit`: Number of fine-tuning jobs to retrieve (default is 20).
     */
    fun list(params: JobListParams): JobListResponse = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: JobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobListResponse

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun cancel(): CancelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/fine_tuning/jobs`, but is otherwise the same as
         * [JobService.create].
         */
        @MustBeClosed
        fun create(params: JobCreateParams): HttpResponseFor<JobCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: JobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/fine_tuning/jobs/{fine_tuning_job_id}`, but is
         * otherwise the same as [JobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: JobRetrieveParams): HttpResponseFor<JobRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/fine_tuning/jobs`, but is otherwise the same as
         * [JobService.list].
         */
        @MustBeClosed
        fun list(params: JobListParams): HttpResponseFor<JobListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: JobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobListResponse>
    }
}
