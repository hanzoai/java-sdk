// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.model

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.model.info.InfoListParams
import ai.hanzo.api.models.model.info.InfoListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InfoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoServiceAsync

    /**
     * Provides more info about each model in /models, including config.yaml descriptions (except
     * api key and api base)
     *
     * Parameters: llm_model_id: Optional[str] = None (this is the value of `x-llm-model-id`
     * returned in response headers)
     *
     *     - When llm_model_id is passed, it will return the info for that specific model
     *     - When llm_model_id is not passed, it will return the info for all models
     *
     * Returns: Returns a dictionary containing information about each model.
     *
     * Example Response:
     * ```json
     * {
     *   "data": [
     *     {
     *       "model_name": "fake-openai-endpoint",
     *       "llm_params": {
     *         "api_base": "https://exampleopenaiendpoint-production.up.railway.app/",
     *         "model": "openai/fake"
     *       },
     *       "model_info": {
     *         "id": "112f74fab24a7a5245d2ced3536dd8f5f9192c57ee6e332af0f0512e08bed5af",
     *         "db_model": false
     *       }
     *     }
     *   ]
     * }
     * ```
     */
    fun list(): CompletableFuture<InfoListResponse> = list(InfoListParams.none())

    /** @see [list] */
    fun list(
        params: InfoListParams = InfoListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InfoListResponse>

    /** @see [list] */
    fun list(params: InfoListParams = InfoListParams.none()): CompletableFuture<InfoListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<InfoListResponse> =
        list(InfoListParams.none(), requestOptions)

    /** A view of [InfoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /model/info`, but is otherwise the same as
         * [InfoServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InfoListResponse>> =
            list(InfoListParams.none())

        /** @see [list] */
        fun list(
            params: InfoListParams = InfoListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfoListResponse>>

        /** @see [list] */
        fun list(
            params: InfoListParams = InfoListParams.none()
        ): CompletableFuture<HttpResponseFor<InfoListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InfoListResponse>> =
            list(InfoListParams.none(), requestOptions)
    }
}
