// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.global

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.global.spend.SpendListTagsParams
import ai.hanzo.api.models.global.spend.SpendListTagsResponse
import ai.hanzo.api.models.global.spend.SpendResetParams
import ai.hanzo.api.models.global.spend.SpendResetResponse
import ai.hanzo.api.models.global.spend.SpendRetrieveReportParams
import ai.hanzo.api.models.global.spend.SpendRetrieveReportResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SpendServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpendServiceAsync

    /**
     * LLM Enterprise - View Spend Per Request Tag. Used by LLM UI
     *
     * Example Request:
     * ```
     * curl -X GET "http://0.0.0.0:4000/spend/tags" -H "Authorization: Bearer sk-1234"
     * ```
     *
     * Spend with Start Date and End Date
     *
     * ```
     * curl -X GET "http://0.0.0.0:4000/spend/tags?start_date=2022-01-01&end_date=2022-02-01" -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun listTags(): CompletableFuture<List<SpendListTagsResponse>> =
        listTags(SpendListTagsParams.none())

    /** @see listTags */
    fun listTags(
        params: SpendListTagsParams = SpendListTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SpendListTagsResponse>>

    /** @see listTags */
    fun listTags(
        params: SpendListTagsParams = SpendListTagsParams.none()
    ): CompletableFuture<List<SpendListTagsResponse>> = listTags(params, RequestOptions.none())

    /** @see listTags */
    fun listTags(requestOptions: RequestOptions): CompletableFuture<List<SpendListTagsResponse>> =
        listTags(SpendListTagsParams.none(), requestOptions)

    /**
     * ADMIN ONLY / MASTER KEY Only Endpoint
     *
     * Globally reset spend for All API Keys and Teams, maintain LLM_SpendLogs
     * 1. LLM_SpendLogs will maintain the logs on spend, no data gets deleted from there
     * 2. LLM_VerificationTokens spend will be set = 0
     * 3. LLM_TeamTable spend will be set = 0
     */
    fun reset(): CompletableFuture<SpendResetResponse> = reset(SpendResetParams.none())

    /** @see reset */
    fun reset(
        params: SpendResetParams = SpendResetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendResetResponse>

    /** @see reset */
    fun reset(
        params: SpendResetParams = SpendResetParams.none()
    ): CompletableFuture<SpendResetResponse> = reset(params, RequestOptions.none())

    /** @see reset */
    fun reset(requestOptions: RequestOptions): CompletableFuture<SpendResetResponse> =
        reset(SpendResetParams.none(), requestOptions)

    /**
     * Get Daily Spend per Team, based on specific startTime and endTime. Per team, view usage by
     * each key, model
     * [ { "group-by-day": "2024-05-10", "teams": [ { "team_name": "team-1" "spend": 10, "keys": [ "key": "1213", "usage": { "model-1": { "cost": 12.50, "input_tokens": 1000, "output_tokens": 5000, "requests": 100 }, "audio-modelname1": { "cost": 25.50, "seconds": 25, "requests": 50 }, } } ]
     * ] }
     */
    fun retrieveReport(): CompletableFuture<List<SpendRetrieveReportResponse>> =
        retrieveReport(SpendRetrieveReportParams.none())

    /** @see retrieveReport */
    fun retrieveReport(
        params: SpendRetrieveReportParams = SpendRetrieveReportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SpendRetrieveReportResponse>>

    /** @see retrieveReport */
    fun retrieveReport(
        params: SpendRetrieveReportParams = SpendRetrieveReportParams.none()
    ): CompletableFuture<List<SpendRetrieveReportResponse>> =
        retrieveReport(params, RequestOptions.none())

    /** @see retrieveReport */
    fun retrieveReport(
        requestOptions: RequestOptions
    ): CompletableFuture<List<SpendRetrieveReportResponse>> =
        retrieveReport(SpendRetrieveReportParams.none(), requestOptions)

    /** A view of [SpendServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpendServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /global/spend/tags`, but is otherwise the same as
         * [SpendServiceAsync.listTags].
         */
        fun listTags(): CompletableFuture<HttpResponseFor<List<SpendListTagsResponse>>> =
            listTags(SpendListTagsParams.none())

        /** @see listTags */
        fun listTags(
            params: SpendListTagsParams = SpendListTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SpendListTagsResponse>>>

        /** @see listTags */
        fun listTags(
            params: SpendListTagsParams = SpendListTagsParams.none()
        ): CompletableFuture<HttpResponseFor<List<SpendListTagsResponse>>> =
            listTags(params, RequestOptions.none())

        /** @see listTags */
        fun listTags(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<SpendListTagsResponse>>> =
            listTags(SpendListTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /global/spend/reset`, but is otherwise the same as
         * [SpendServiceAsync.reset].
         */
        fun reset(): CompletableFuture<HttpResponseFor<SpendResetResponse>> =
            reset(SpendResetParams.none())

        /** @see reset */
        fun reset(
            params: SpendResetParams = SpendResetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendResetResponse>>

        /** @see reset */
        fun reset(
            params: SpendResetParams = SpendResetParams.none()
        ): CompletableFuture<HttpResponseFor<SpendResetResponse>> =
            reset(params, RequestOptions.none())

        /** @see reset */
        fun reset(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SpendResetResponse>> =
            reset(SpendResetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /global/spend/report`, but is otherwise the same as
         * [SpendServiceAsync.retrieveReport].
         */
        fun retrieveReport():
            CompletableFuture<HttpResponseFor<List<SpendRetrieveReportResponse>>> =
            retrieveReport(SpendRetrieveReportParams.none())

        /** @see retrieveReport */
        fun retrieveReport(
            params: SpendRetrieveReportParams = SpendRetrieveReportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SpendRetrieveReportResponse>>>

        /** @see retrieveReport */
        fun retrieveReport(
            params: SpendRetrieveReportParams = SpendRetrieveReportParams.none()
        ): CompletableFuture<HttpResponseFor<List<SpendRetrieveReportResponse>>> =
            retrieveReport(params, RequestOptions.none())

        /** @see retrieveReport */
        fun retrieveReport(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<SpendRetrieveReportResponse>>> =
            retrieveReport(SpendRetrieveReportParams.none(), requestOptions)
    }
}
