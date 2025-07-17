// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.test.TestPingParams
import ai.hanzo.api.models.test.TestPingResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestServiceAsync

    /**
     * [DEPRECATED] use `/health/liveliness` instead.
     *
     * A test endpoint that pings the proxy server to check if it's healthy.
     *
     * Parameters: request (Request): The incoming request.
     *
     * Returns: dict: A dictionary containing the route of the request URL.
     */
    fun ping(): CompletableFuture<TestPingResponse> = ping(TestPingParams.none())

    /** @see [ping] */
    fun ping(
        params: TestPingParams = TestPingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestPingResponse>

    /** @see [ping] */
    fun ping(params: TestPingParams = TestPingParams.none()): CompletableFuture<TestPingResponse> =
        ping(params, RequestOptions.none())

    /** @see [ping] */
    fun ping(requestOptions: RequestOptions): CompletableFuture<TestPingResponse> =
        ping(TestPingParams.none(), requestOptions)

    /** A view of [TestServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /test`, but is otherwise the same as
         * [TestServiceAsync.ping].
         */
        fun ping(): CompletableFuture<HttpResponseFor<TestPingResponse>> =
            ping(TestPingParams.none())

        /** @see [ping] */
        fun ping(
            params: TestPingParams = TestPingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestPingResponse>>

        /** @see [ping] */
        fun ping(
            params: TestPingParams = TestPingParams.none()
        ): CompletableFuture<HttpResponseFor<TestPingResponse>> =
            ping(params, RequestOptions.none())

        /** @see [ping] */
        fun ping(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TestPingResponse>> =
            ping(TestPingParams.none(), requestOptions)
    }
}
