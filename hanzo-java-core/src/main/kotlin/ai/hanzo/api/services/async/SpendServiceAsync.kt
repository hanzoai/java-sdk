// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.spend.SpendCalculateSpendParams
import ai.hanzo.api.models.spend.SpendCalculateSpendResponse
import ai.hanzo.api.models.spend.SpendListLogsParams
import ai.hanzo.api.models.spend.SpendListLogsResponse
import ai.hanzo.api.models.spend.SpendListTagsParams
import ai.hanzo.api.models.spend.SpendListTagsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface SpendServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Accepts all the params of completion_cost.
     *
     * Calculate spend **before** making call:
     *
     * Note: If you see a spend of $0.0 you need to set custom_pricing for your model:
     * https://docs.llm.ai/docs/proxy/custom_pricing
     *
     * ```
     * curl --location 'http://localhost:4000/spend/calculate'
     * --header 'Authorization: Bearer sk-1234'
     * --header 'Content-Type: application/json'
     * --data '{
     *     "model": "anthropic.claude-v2",
     *     "messages": [{"role": "user", "content": "Hey, how'''s it going?"}]
     * }'
     * ```
     *
     * Calculate spend **after** making call:
     * ```
     * curl --location 'http://localhost:4000/spend/calculate'
     * --header 'Authorization: Bearer sk-1234'
     * --header 'Content-Type: application/json'
     * --data '{
     *     "completion_response": {
     *         "id": "chatcmpl-123",
     *         "object": "chat.completion",
     *         "created": 1677652288,
     *         "model": "gpt-3.5-turbo-0125",
     *         "system_fingerprint": "fp_44709d6fcb",
     *         "choices": [{
     *             "index": 0,
     *             "message": {
     *                 "role": "assistant",
     *                 "content": "Hello there, how may I assist you today?"
     *             },
     *             "logprobs": null,
     *             "finish_reason": "stop"
     *         }]
     *         "usage": {
     *             "prompt_tokens": 9,
     *             "completion_tokens": 12,
     *             "total_tokens": 21
     *         }
     *     }
     * }'
     * ```
     */
    fun calculateSpend(): CompletableFuture<SpendCalculateSpendResponse> =
        calculateSpend(SpendCalculateSpendParams.none())

    /** @see [calculateSpend] */
    fun calculateSpend(
        params: SpendCalculateSpendParams = SpendCalculateSpendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendCalculateSpendResponse>

    /** @see [calculateSpend] */
    fun calculateSpend(
        params: SpendCalculateSpendParams = SpendCalculateSpendParams.none()
    ): CompletableFuture<SpendCalculateSpendResponse> =
        calculateSpend(params, RequestOptions.none())

    /** @see [calculateSpend] */
    fun calculateSpend(
        requestOptions: RequestOptions
    ): CompletableFuture<SpendCalculateSpendResponse> =
        calculateSpend(SpendCalculateSpendParams.none(), requestOptions)

    /**
     * View all spend logs, if request_id is provided, only logs for that request_id will be
     * returned
     *
     * Example Request for all logs
     *
     * ```
     * curl -X GET "http://0.0.0.0:8000/spend/logs" -H "Authorization: Bearer sk-1234"
     * ```
     *
     * Example Request for specific request_id
     *
     * ```
     * curl -X GET "http://0.0.0.0:8000/spend/logs?request_id=chatcmpl-6dcb2540-d3d7-4e49-bb27-291f863f112e" -H "Authorization: Bearer sk-1234"
     * ```
     *
     * Example Request for specific api_key
     *
     * ```
     * curl -X GET "http://0.0.0.0:8000/spend/logs?api_key=sk-Fn8Ej39NkBQmUagFEoUWPQ" -H "Authorization: Bearer sk-1234"
     * ```
     *
     * Example Request for specific user_id
     *
     * ```
     * curl -X GET "http://0.0.0.0:8000/spend/logs?user_id=z@hanzo.ai" -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun listLogs(): CompletableFuture<List<SpendListLogsResponse>> =
        listLogs(SpendListLogsParams.none())

    /** @see [listLogs] */
    fun listLogs(
        params: SpendListLogsParams = SpendListLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SpendListLogsResponse>>

    /** @see [listLogs] */
    fun listLogs(
        params: SpendListLogsParams = SpendListLogsParams.none()
    ): CompletableFuture<List<SpendListLogsResponse>> = listLogs(params, RequestOptions.none())

    /** @see [listLogs] */
    fun listLogs(requestOptions: RequestOptions): CompletableFuture<List<SpendListLogsResponse>> =
        listLogs(SpendListLogsParams.none(), requestOptions)

    /**
     * LLM Enterprise - View Spend Per Request Tag
     *
     * Example Request:
     * ```
     * curl -X GET "http://0.0.0.0:8000/spend/tags" -H "Authorization: Bearer sk-1234"
     * ```
     *
     * Spend with Start Date and End Date
     *
     * ```
     * curl -X GET "http://0.0.0.0:8000/spend/tags?start_date=2022-01-01&end_date=2022-02-01" -H "Authorization: Bearer sk-1234"
     * ```
     */
    fun listTags(): CompletableFuture<List<SpendListTagsResponse>> =
        listTags(SpendListTagsParams.none())

    /** @see [listTags] */
    fun listTags(
        params: SpendListTagsParams = SpendListTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SpendListTagsResponse>>

    /** @see [listTags] */
    fun listTags(
        params: SpendListTagsParams = SpendListTagsParams.none()
    ): CompletableFuture<List<SpendListTagsResponse>> = listTags(params, RequestOptions.none())

    /** @see [listTags] */
    fun listTags(requestOptions: RequestOptions): CompletableFuture<List<SpendListTagsResponse>> =
        listTags(SpendListTagsParams.none(), requestOptions)

    /** A view of [SpendServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /spend/calculate`, but is otherwise the same as
         * [SpendServiceAsync.calculateSpend].
         */
        @MustBeClosed
        fun calculateSpend(): CompletableFuture<HttpResponseFor<SpendCalculateSpendResponse>> =
            calculateSpend(SpendCalculateSpendParams.none())

        /** @see [calculateSpend] */
        @MustBeClosed
        fun calculateSpend(
            params: SpendCalculateSpendParams = SpendCalculateSpendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendCalculateSpendResponse>>

        /** @see [calculateSpend] */
        @MustBeClosed
        fun calculateSpend(
            params: SpendCalculateSpendParams = SpendCalculateSpendParams.none()
        ): CompletableFuture<HttpResponseFor<SpendCalculateSpendResponse>> =
            calculateSpend(params, RequestOptions.none())

        /** @see [calculateSpend] */
        @MustBeClosed
        fun calculateSpend(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SpendCalculateSpendResponse>> =
            calculateSpend(SpendCalculateSpendParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /spend/logs`, but is otherwise the same as
         * [SpendServiceAsync.listLogs].
         */
        @MustBeClosed
        fun listLogs(): CompletableFuture<HttpResponseFor<List<SpendListLogsResponse>>> =
            listLogs(SpendListLogsParams.none())

        /** @see [listLogs] */
        @MustBeClosed
        fun listLogs(
            params: SpendListLogsParams = SpendListLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SpendListLogsResponse>>>

        /** @see [listLogs] */
        @MustBeClosed
        fun listLogs(
            params: SpendListLogsParams = SpendListLogsParams.none()
        ): CompletableFuture<HttpResponseFor<List<SpendListLogsResponse>>> =
            listLogs(params, RequestOptions.none())

        /** @see [listLogs] */
        @MustBeClosed
        fun listLogs(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<SpendListLogsResponse>>> =
            listLogs(SpendListLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /spend/tags`, but is otherwise the same as
         * [SpendServiceAsync.listTags].
         */
        @MustBeClosed
        fun listTags(): CompletableFuture<HttpResponseFor<List<SpendListTagsResponse>>> =
            listTags(SpendListTagsParams.none())

        /** @see [listTags] */
        @MustBeClosed
        fun listTags(
            params: SpendListTagsParams = SpendListTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SpendListTagsResponse>>>

        /** @see [listTags] */
        @MustBeClosed
        fun listTags(
            params: SpendListTagsParams = SpendListTagsParams.none()
        ): CompletableFuture<HttpResponseFor<List<SpendListTagsResponse>>> =
            listTags(params, RequestOptions.none())

        /** @see [listTags] */
        @MustBeClosed
        fun listTags(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<SpendListTagsResponse>>> =
            listTags(SpendListTagsParams.none(), requestOptions)
    }
}
