// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.delete.DeleteCreateAllowedIpParams
import com.hanzo_ai.api.models.delete.DeleteCreateAllowedIpResponse
import java.util.concurrent.CompletableFuture

interface DeleteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Delete Allowed Ip */
    fun createAllowedIp(
        params: DeleteCreateAllowedIpParams
    ): CompletableFuture<DeleteCreateAllowedIpResponse> =
        createAllowedIp(params, RequestOptions.none())

    /** @see [createAllowedIp] */
    fun createAllowedIp(
        params: DeleteCreateAllowedIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeleteCreateAllowedIpResponse>

    /**
     * A view of [DeleteServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /delete/allowed_ip`, but is otherwise the same as
         * [DeleteServiceAsync.createAllowedIp].
         */
        @MustBeClosed
        fun createAllowedIp(
            params: DeleteCreateAllowedIpParams
        ): CompletableFuture<HttpResponseFor<DeleteCreateAllowedIpResponse>> =
            createAllowedIp(params, RequestOptions.none())

        /** @see [createAllowedIp] */
        @MustBeClosed
        fun createAllowedIp(
            params: DeleteCreateAllowedIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeleteCreateAllowedIpResponse>>
    }
}
