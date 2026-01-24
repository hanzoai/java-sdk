// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.organization

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.organization.OrganizationTableWithMembers
import ai.hanzo.api.models.organization.info.InfoDeprecatedParams
import ai.hanzo.api.models.organization.info.InfoDeprecatedResponse
import ai.hanzo.api.models.organization.info.InfoRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface InfoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoService

    /** Get the org specific information */
    fun retrieve(params: InfoRetrieveParams): OrganizationTableWithMembers =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InfoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationTableWithMembers

    /** DEPRECATED: Use GET /organization/info instead */
    fun deprecated(params: InfoDeprecatedParams): InfoDeprecatedResponse =
        deprecated(params, RequestOptions.none())

    /** @see deprecated */
    fun deprecated(
        params: InfoDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfoDeprecatedResponse

    /** A view of [InfoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /organization/info`, but is otherwise the same as
         * [InfoService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: InfoRetrieveParams): HttpResponseFor<OrganizationTableWithMembers> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InfoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationTableWithMembers>

        /**
         * Returns a raw HTTP response for `post /organization/info`, but is otherwise the same as
         * [InfoService.deprecated].
         */
        @MustBeClosed
        fun deprecated(params: InfoDeprecatedParams): HttpResponseFor<InfoDeprecatedResponse> =
            deprecated(params, RequestOptions.none())

        /** @see deprecated */
        @MustBeClosed
        fun deprecated(
            params: InfoDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfoDeprecatedResponse>
    }
}
