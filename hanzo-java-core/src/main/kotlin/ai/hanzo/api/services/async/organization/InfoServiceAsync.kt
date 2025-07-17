// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.organization

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.organization.info.InfoDeprecatedParams
import ai.hanzo.api.models.organization.info.InfoDeprecatedResponse
import ai.hanzo.api.models.organization.info.InfoRetrieveParams
import ai.hanzo.api.models.organization.info.InfoRetrieveResponse
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /organization/info`, but is otherwise the same as
         * [InfoServiceAsync.retrieve].
         */
        fun retrieve(
            params: InfoRetrieveParams
        ): CompletableFuture<HttpResponseFor<InfoRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: InfoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfoRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post /organization/info`, but is otherwise the same as
         * [InfoServiceAsync.deprecated].
         */
        fun deprecated(
            params: InfoDeprecatedParams
        ): CompletableFuture<HttpResponseFor<InfoDeprecatedResponse>> =
            deprecated(params, RequestOptions.none())

        /** @see [deprecated] */
        fun deprecated(
            params: InfoDeprecatedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfoDeprecatedResponse>>
    }
}
