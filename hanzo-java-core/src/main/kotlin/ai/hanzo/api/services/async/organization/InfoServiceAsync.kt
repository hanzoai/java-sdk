// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.organization

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.organization.info.InfoDeprecatedParams
import ai.hanzo.api.models.organization.info.InfoDeprecatedResponse
import ai.hanzo.api.models.organization.info.InfoRetrieveParams
import ai.hanzo.api.models.organization.info.InfoRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface InfoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the org specific information */
    fun retrieve(params: InfoRetrieveParams): CompletableFuture<InfoRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InfoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InfoRetrieveResponse>

    /** DEPRECATED: Use GET /organization/info instead */
    fun deprecated(params: InfoDeprecatedParams): CompletableFuture<InfoDeprecatedResponse> =
        deprecated(params, RequestOptions.none())

    /** @see [deprecated] */
    fun deprecated(
        params: InfoDeprecatedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InfoDeprecatedResponse>

    /** A view of [InfoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /organization/info`, but is otherwise the same as
         * [InfoServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: InfoRetrieveParams
        ): CompletableFuture<HttpResponseFor<InfoRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InfoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfoRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post /organization/info`, but is otherwise the same as
         * [InfoServiceAsync.deprecated].
         */
        @MustBeClosed
        fun deprecated(
            params: InfoDeprecatedParams
        ): CompletableFuture<HttpResponseFor<InfoDeprecatedResponse>> =
            deprecated(params, RequestOptions.none())

        /** @see [deprecated] */
        @MustBeClosed
        fun deprecated(
            params: InfoDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfoDeprecatedResponse>>
    }
}
