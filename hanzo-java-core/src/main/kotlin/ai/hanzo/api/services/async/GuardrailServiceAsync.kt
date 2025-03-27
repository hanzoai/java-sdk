// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.guardrails.GuardrailListParams
import ai.hanzo.api.models.guardrails.GuardrailListResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface GuardrailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * List the guardrails that are available on the proxy server
     *
     * 👉 [Guardrail docs](https://docs.hanzo.ai/docs/proxy/guardrails/quick_start)
     *
     * Example Request:
     * ```bash
     * curl -X GET "http://localhost:4000/guardrails/list" -H "Authorization: Bearer <your_api_key>"
     * ```
     *
     * Example Response:
     * ```json
     * {
     *   "guardrails": [
     *     {
     *       "guardrail_name": "bedrock-pre-guard",
     *       "guardrail_info": {
     *         "params": [
     *           {
     *             "name": "toxicity_score",
     *             "type": "float",
     *             "description": "Score between 0-1 indicating content toxicity level"
     *           },
     *           {
     *             "name": "pii_detection",
     *             "type": "boolean"
     *           }
     *         ]
     *       }
     *     }
     *   ]
     * }
     * ```
     */
    fun list(): CompletableFuture<GuardrailListResponse> = list(GuardrailListParams.none())

    /** @see [list] */
    fun list(
        params: GuardrailListParams = GuardrailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GuardrailListResponse>

    /** @see [list] */
    fun list(
        params: GuardrailListParams = GuardrailListParams.none()
    ): CompletableFuture<GuardrailListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<GuardrailListResponse> =
        list(GuardrailListParams.none(), requestOptions)

    /**
     * A view of [GuardrailServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /guardrails/list`, but is otherwise the same as
         * [GuardrailServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<GuardrailListResponse>> =
            list(GuardrailListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: GuardrailListParams = GuardrailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GuardrailListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: GuardrailListParams = GuardrailListParams.none()
        ): CompletableFuture<HttpResponseFor<GuardrailListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GuardrailListResponse>> =
            list(GuardrailListParams.none(), requestOptions)
    }
}
