// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.routes.RouteListParams
import ai.hanzo.api.models.routes.RouteListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteServiceAsync

    /** Get a list of available routes in the FastAPI application. */
    fun list(): CompletableFuture<RouteListResponse> = list(RouteListParams.none())

    /** @see [list] */
    fun list(
        params: RouteListParams = RouteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RouteListResponse>

    /** @see [list] */
    fun list(
        params: RouteListParams = RouteListParams.none()
    ): CompletableFuture<RouteListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<RouteListResponse> =
        list(RouteListParams.none(), requestOptions)

    /** A view of [RouteServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RouteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /routes`, but is otherwise the same as
         * [RouteServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RouteListResponse>> =
            list(RouteListParams.none())

        /** @see [list] */
        fun list(
            params: RouteListParams = RouteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RouteListResponse>>

        /** @see [list] */
        fun list(
            params: RouteListParams = RouteListParams.none()
        ): CompletableFuture<HttpResponseFor<RouteListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RouteListResponse>> =
            list(RouteListParams.none(), requestOptions)
    }
}
