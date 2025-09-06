// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.delete.DeleteCreateAllowedIpParams
import ai.hanzo.api.models.delete.DeleteCreateAllowedIpResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DeleteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeleteServiceAsync

    /** Delete Allowed Ip */
    fun createAllowedIp(
        params: DeleteCreateAllowedIpParams
    ): CompletableFuture<DeleteCreateAllowedIpResponse> =
        createAllowedIp(params, RequestOptions.none())

    /** @see createAllowedIp */
    fun createAllowedIp(
        params: DeleteCreateAllowedIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeleteCreateAllowedIpResponse>

    /**
     * A view of [DeleteServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeleteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /delete/allowed_ip`, but is otherwise the same as
         * [DeleteServiceAsync.createAllowedIp].
         */
        fun createAllowedIp(
            params: DeleteCreateAllowedIpParams
        ): CompletableFuture<HttpResponseFor<DeleteCreateAllowedIpResponse>> =
            createAllowedIp(params, RequestOptions.none())

        /** @see createAllowedIp */
        fun createAllowedIp(
            params: DeleteCreateAllowedIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeleteCreateAllowedIpResponse>>
    }
}
