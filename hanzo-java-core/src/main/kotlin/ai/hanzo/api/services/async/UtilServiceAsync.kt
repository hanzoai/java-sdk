// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.utils.UtilGetSupportedOpenAIParamsParams
import ai.hanzo.api.models.utils.UtilGetSupportedOpenAIParamsResponse
import ai.hanzo.api.models.utils.UtilTokenCounterParams
import ai.hanzo.api.models.utils.UtilTokenCounterResponse
import ai.hanzo.api.models.utils.UtilTransformRequestParams
import ai.hanzo.api.models.utils.UtilTransformRequestResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface UtilServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns supported openai params for a given llm model name
     *
     * e.g. `gpt-4` vs `gpt-3.5-turbo`
     *
     * Example curl:
     * ```
     * curl -X GET --location 'http://localhost:4000/utils/supported_openai_params?model=gpt-3.5-turbo-16k'         --header 'Authorization: Bearer sk-1234'
     * ```
     */
    fun getSupportedOpenAIParams(
        params: UtilGetSupportedOpenAIParamsParams
    ): CompletableFuture<UtilGetSupportedOpenAIParamsResponse> =
        getSupportedOpenAIParams(params, RequestOptions.none())

    /** @see [getSupportedOpenAIParams] */
    fun getSupportedOpenAIParams(
        params: UtilGetSupportedOpenAIParamsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UtilGetSupportedOpenAIParamsResponse>

    /** Token Counter */
    fun tokenCounter(params: UtilTokenCounterParams): CompletableFuture<UtilTokenCounterResponse> =
        tokenCounter(params, RequestOptions.none())

    /** @see [tokenCounter] */
    fun tokenCounter(
        params: UtilTokenCounterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UtilTokenCounterResponse>

    /** Transform Request */
    fun transformRequest(
        params: UtilTransformRequestParams
    ): CompletableFuture<UtilTransformRequestResponse> =
        transformRequest(params, RequestOptions.none())

    /** @see [transformRequest] */
    fun transformRequest(
        params: UtilTransformRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UtilTransformRequestResponse>

    /** A view of [UtilServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /utils/supported_openai_params`, but is otherwise
         * the same as [UtilServiceAsync.getSupportedOpenAIParams].
         */
        @MustBeClosed
        fun getSupportedOpenAIParams(
            params: UtilGetSupportedOpenAIParamsParams
        ): CompletableFuture<HttpResponseFor<UtilGetSupportedOpenAIParamsResponse>> =
            getSupportedOpenAIParams(params, RequestOptions.none())

        /** @see [getSupportedOpenAIParams] */
        @MustBeClosed
        fun getSupportedOpenAIParams(
            params: UtilGetSupportedOpenAIParamsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UtilGetSupportedOpenAIParamsResponse>>

        /**
         * Returns a raw HTTP response for `post /utils/token_counter`, but is otherwise the same as
         * [UtilServiceAsync.tokenCounter].
         */
        @MustBeClosed
        fun tokenCounter(
            params: UtilTokenCounterParams
        ): CompletableFuture<HttpResponseFor<UtilTokenCounterResponse>> =
            tokenCounter(params, RequestOptions.none())

        /** @see [tokenCounter] */
        @MustBeClosed
        fun tokenCounter(
            params: UtilTokenCounterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UtilTokenCounterResponse>>

        /**
         * Returns a raw HTTP response for `post /utils/transform_request`, but is otherwise the
         * same as [UtilServiceAsync.transformRequest].
         */
        @MustBeClosed
        fun transformRequest(
            params: UtilTransformRequestParams
        ): CompletableFuture<HttpResponseFor<UtilTransformRequestResponse>> =
            transformRequest(params, RequestOptions.none())

        /** @see [transformRequest] */
        @MustBeClosed
        fun transformRequest(
            params: UtilTransformRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UtilTransformRequestResponse>>
    }
}
