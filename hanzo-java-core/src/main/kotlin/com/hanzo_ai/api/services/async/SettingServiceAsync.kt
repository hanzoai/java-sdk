// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.settings.SettingRetrieveParams
import com.hanzo_ai.api.models.settings.SettingRetrieveResponse
import java.util.concurrent.CompletableFuture

interface SettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a list of llm level settings
     *
     * This is useful for debugging and ensuring the proxy server is configured correctly.
     *
     * Response schema:
     * ```
     * {
     *     "alerting": _alerting,
     *     "llm.callbacks": llm_callbacks,
     *     "llm.input_callback": llm_input_callbacks,
     *     "llm.failure_callback": llm_failure_callbacks,
     *     "llm.success_callback": llm_success_callbacks,
     *     "llm._async_success_callback": llm_async_success_callbacks,
     *     "llm._async_failure_callback": llm_async_failure_callbacks,
     *     "llm._async_input_callback": llm_async_input_callbacks,
     *     "all_llm_callbacks": all_llm_callbacks,
     *     "num_callbacks": len(all_llm_callbacks),
     *     "num_alerting": _num_alerting,
     *     "llm.request_timeout": llm.request_timeout,
     * }
     * ```
     */
    fun retrieve(): CompletableFuture<SettingRetrieveResponse> =
        retrieve(SettingRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SettingRetrieveParams = SettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: SettingRetrieveParams = SettingRetrieveParams.none()
    ): CompletableFuture<SettingRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<SettingRetrieveResponse> =
        retrieve(SettingRetrieveParams.none(), requestOptions)

    /**
     * A view of [SettingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /settings`, but is otherwise the same as
         * [SettingServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>> =
            retrieve(SettingRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>> =
            retrieve(SettingRetrieveParams.none(), requestOptions)
    }
}
