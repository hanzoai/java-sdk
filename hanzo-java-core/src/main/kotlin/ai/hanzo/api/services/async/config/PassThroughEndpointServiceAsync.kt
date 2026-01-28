// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.config

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointCreateParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointCreateResponse
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointDeleteParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointListParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointResponse
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointUpdateParams
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughEndpointUpdateResponse
import ai.hanzo.api.models.config.passthroughendpoint.PassThroughGenericEndpoint
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PassThroughEndpointServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PassThroughEndpointServiceAsync

    /** Create new pass-through endpoint */
    fun create(
        params: PassThroughEndpointCreateParams
    ): CompletableFuture<PassThroughEndpointCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PassThroughEndpointCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassThroughEndpointCreateResponse>

    /** @see create */
    fun create(
        passThroughGenericEndpoint: PassThroughGenericEndpoint,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassThroughEndpointCreateResponse> =
        create(
            PassThroughEndpointCreateParams.builder()
                .passThroughGenericEndpoint(passThroughGenericEndpoint)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        passThroughGenericEndpoint: PassThroughGenericEndpoint
    ): CompletableFuture<PassThroughEndpointCreateResponse> =
        create(passThroughGenericEndpoint, RequestOptions.none())

    /** Update a pass-through endpoint by ID. */
    fun update(
        endpointId: String,
        params: PassThroughEndpointUpdateParams,
    ): CompletableFuture<PassThroughEndpointUpdateResponse> =
        update(endpointId, params, RequestOptions.none())

    /** @see update */
    fun update(
        endpointId: String,
        params: PassThroughEndpointUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassThroughEndpointUpdateResponse> =
        update(params.toBuilder().endpointId(endpointId).build(), requestOptions)

    /** @see update */
    fun update(
        params: PassThroughEndpointUpdateParams
    ): CompletableFuture<PassThroughEndpointUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PassThroughEndpointUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassThroughEndpointUpdateResponse>

    /**
     * GET configured pass through endpoint.
     *
     * If no endpoint_id given, return all configured endpoints.
     */
    fun list(): CompletableFuture<PassThroughEndpointResponse> =
        list(PassThroughEndpointListParams.none())

    /** @see list */
    fun list(
        params: PassThroughEndpointListParams = PassThroughEndpointListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassThroughEndpointResponse>

    /** @see list */
    fun list(
        params: PassThroughEndpointListParams = PassThroughEndpointListParams.none()
    ): CompletableFuture<PassThroughEndpointResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PassThroughEndpointResponse> =
        list(PassThroughEndpointListParams.none(), requestOptions)

    /**
     * Delete a pass-through endpoint by ID.
     *
     * Returns - the deleted endpoint
     */
    fun delete(
        params: PassThroughEndpointDeleteParams
    ): CompletableFuture<PassThroughEndpointResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PassThroughEndpointDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PassThroughEndpointResponse>

    /**
     * A view of [PassThroughEndpointServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PassThroughEndpointServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /config/pass_through_endpoint`, but is otherwise
         * the same as [PassThroughEndpointServiceAsync.create].
         */
        fun create(
            params: PassThroughEndpointCreateParams
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PassThroughEndpointCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointCreateResponse>>

        /** @see create */
        fun create(
            passThroughGenericEndpoint: PassThroughGenericEndpoint,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointCreateResponse>> =
            create(
                PassThroughEndpointCreateParams.builder()
                    .passThroughGenericEndpoint(passThroughGenericEndpoint)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            passThroughGenericEndpoint: PassThroughGenericEndpoint
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointCreateResponse>> =
            create(passThroughGenericEndpoint, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /config/pass_through_endpoint/{endpoint_id}`, but
         * is otherwise the same as [PassThroughEndpointServiceAsync.update].
         */
        fun update(
            endpointId: String,
            params: PassThroughEndpointUpdateParams,
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointUpdateResponse>> =
            update(endpointId, params, RequestOptions.none())

        /** @see update */
        fun update(
            endpointId: String,
            params: PassThroughEndpointUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointUpdateResponse>> =
            update(params.toBuilder().endpointId(endpointId).build(), requestOptions)

        /** @see update */
        fun update(
            params: PassThroughEndpointUpdateParams
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PassThroughEndpointUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /config/pass_through_endpoint`, but is otherwise the
         * same as [PassThroughEndpointServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>> =
            list(PassThroughEndpointListParams.none())

        /** @see list */
        fun list(
            params: PassThroughEndpointListParams = PassThroughEndpointListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>>

        /** @see list */
        fun list(
            params: PassThroughEndpointListParams = PassThroughEndpointListParams.none()
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>> =
            list(PassThroughEndpointListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /config/pass_through_endpoint`, but is otherwise
         * the same as [PassThroughEndpointServiceAsync.delete].
         */
        fun delete(
            params: PassThroughEndpointDeleteParams
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PassThroughEndpointDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PassThroughEndpointResponse>>
    }
}
