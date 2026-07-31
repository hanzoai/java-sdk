// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.add.AddAddAllowedIpParams
import ai.hanzo.api.models.add.AddAddAllowedIpResponse
import ai.hanzo.api.models.add.IpAddress
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AddService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddService

    /** Add Allowed Ip */
    fun addAllowedIp(params: AddAddAllowedIpParams): AddAddAllowedIpResponse =
        addAllowedIp(params, RequestOptions.none())

    /** @see addAllowedIp */
    fun addAllowedIp(
        params: AddAddAllowedIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddAddAllowedIpResponse

    /** @see addAllowedIp */
    fun addAllowedIp(
        ipAddress: IpAddress,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddAddAllowedIpResponse =
        addAllowedIp(AddAddAllowedIpParams.builder().ipAddress(ipAddress).build(), requestOptions)

    /** @see addAllowedIp */
    fun addAllowedIp(ipAddress: IpAddress): AddAddAllowedIpResponse =
        addAllowedIp(ipAddress, RequestOptions.none())

    /** A view of [AddService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /add/allowed_ip`, but is otherwise the same as
         * [AddService.addAllowedIp].
         */
        @MustBeClosed
        fun addAllowedIp(params: AddAddAllowedIpParams): HttpResponseFor<AddAddAllowedIpResponse> =
            addAllowedIp(params, RequestOptions.none())

        /** @see addAllowedIp */
        @MustBeClosed
        fun addAllowedIp(
            params: AddAddAllowedIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddAddAllowedIpResponse>

        /** @see addAllowedIp */
        @MustBeClosed
        fun addAllowedIp(
            ipAddress: IpAddress,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddAddAllowedIpResponse> =
            addAllowedIp(
                AddAddAllowedIpParams.builder().ipAddress(ipAddress).build(),
                requestOptions,
            )

        /** @see addAllowedIp */
        @MustBeClosed
        fun addAllowedIp(ipAddress: IpAddress): HttpResponseFor<AddAddAllowedIpResponse> =
            addAllowedIp(ipAddress, RequestOptions.none())
    }
}
