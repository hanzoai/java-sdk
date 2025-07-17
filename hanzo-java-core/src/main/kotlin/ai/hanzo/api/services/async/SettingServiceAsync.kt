// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.settings.SettingRetrieveParams
import ai.hanzo.api.models.settings.SettingRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /settings`, but is otherwise the same as
         * [SettingServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>> =
            retrieve(SettingRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: SettingRetrieveParams = SettingRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>> =
            retrieve(SettingRetrieveParams.none(), requestOptions)
    }
}
