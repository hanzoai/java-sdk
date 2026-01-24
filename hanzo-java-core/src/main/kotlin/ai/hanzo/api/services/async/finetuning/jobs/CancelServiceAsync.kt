// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.finetuning.jobs

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.finetuning.jobs.cancel.CancelCreateParams
import ai.hanzo.api.models.finetuning.jobs.cancel.CancelCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CancelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CancelServiceAsync

    /**
     * Cancel a fine-tuning job.
     *
     * This is the equivalent of POST
     * https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel
     *
     * Supported Query Params:
     * - `custom_llm_provider`: Name of the LiteLLM provider
     * - `fine_tuning_job_id`: The ID of the fine-tuning job to cancel.
     */
    fun create(fineTuningJobId: String): CompletableFuture<CancelCreateResponse> =
        create(fineTuningJobId, CancelCreateParams.none())

    /** @see create */
    fun create(
        fineTuningJobId: String,
        params: CancelCreateParams = CancelCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelCreateResponse> =
        create(params.toBuilder().fineTuningJobId(fineTuningJobId).build(), requestOptions)

    /** @see create */
    fun create(
        fineTuningJobId: String,
        params: CancelCreateParams = CancelCreateParams.none(),
    ): CompletableFuture<CancelCreateResponse> =
        create(fineTuningJobId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CancelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelCreateResponse>

    /** @see create */
    fun create(params: CancelCreateParams): CompletableFuture<CancelCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        fineTuningJobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CancelCreateResponse> =
        create(fineTuningJobId, CancelCreateParams.none(), requestOptions)

    /**
     * A view of [CancelServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CancelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel`,
         * but is otherwise the same as [CancelServiceAsync.create].
         */
        fun create(
            fineTuningJobId: String
        ): CompletableFuture<HttpResponseFor<CancelCreateResponse>> =
            create(fineTuningJobId, CancelCreateParams.none())

        /** @see create */
        fun create(
            fineTuningJobId: String,
            params: CancelCreateParams = CancelCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelCreateResponse>> =
            create(params.toBuilder().fineTuningJobId(fineTuningJobId).build(), requestOptions)

        /** @see create */
        fun create(
            fineTuningJobId: String,
            params: CancelCreateParams = CancelCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<CancelCreateResponse>> =
            create(fineTuningJobId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CancelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelCreateResponse>>

        /** @see create */
        fun create(
            params: CancelCreateParams
        ): CompletableFuture<HttpResponseFor<CancelCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            fineTuningJobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CancelCreateResponse>> =
            create(fineTuningJobId, CancelCreateParams.none(), requestOptions)
    }
}
