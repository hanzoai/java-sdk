// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.add.AddAddAllowedIpParams
import com.hanzo_ai.api.models.add.AddAddAllowedIpResponse
import java.util.concurrent.CompletableFuture

interface AddServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Add Allowed Ip */
    fun addAllowedIp(params: AddAddAllowedIpParams): CompletableFuture<AddAddAllowedIpResponse> =
        addAllowedIp(params, RequestOptions.none())

    /** @see [addAllowedIp] */
    fun addAllowedIp(
        params: AddAddAllowedIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddAddAllowedIpResponse>

    /** A view of [AddServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /add/allowed_ip`, but is otherwise the same as
         * [AddServiceAsync.addAllowedIp].
         */
        @MustBeClosed
        fun addAllowedIp(
            params: AddAddAllowedIpParams
        ): CompletableFuture<HttpResponseFor<AddAddAllowedIpResponse>> =
            addAllowedIp(params, RequestOptions.none())

        /** @see [addAllowedIp] */
        @MustBeClosed
        fun addAllowedIp(
            params: AddAddAllowedIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddAddAllowedIpResponse>>
    }
}
