// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.moderations.ModerationCreateParams
import ai.hanzo.api.models.moderations.ModerationCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ModerationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModerationServiceAsync

    /**
     * The moderations endpoint is a tool you can use to check whether content complies with an LLM
     * Providers policies.
     *
     * Quick Start
     *
     * ```
     * curl --location 'http://0.0.0.0:4000/moderations'     --header 'Content-Type: application/json'     --header 'Authorization: Bearer sk-1234'     --data '{"input": "Sample text goes here", "model": "text-moderation-stable"}'
     * ```
     */
    fun create(): CompletableFuture<ModerationCreateResponse> =
        create(ModerationCreateParams.none())

    /** @see create */
    fun create(
        params: ModerationCreateParams = ModerationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModerationCreateResponse>

    /** @see create */
    fun create(
        params: ModerationCreateParams = ModerationCreateParams.none()
    ): CompletableFuture<ModerationCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<ModerationCreateResponse> =
        create(ModerationCreateParams.none(), requestOptions)

    /**
     * A view of [ModerationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ModerationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/moderations`, but is otherwise the same as
         * [ModerationServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<ModerationCreateResponse>> =
            create(ModerationCreateParams.none())

        /** @see create */
        fun create(
            params: ModerationCreateParams = ModerationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModerationCreateResponse>>

        /** @see create */
        fun create(
            params: ModerationCreateParams = ModerationCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ModerationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ModerationCreateResponse>> =
            create(ModerationCreateParams.none(), requestOptions)
    }
}
