// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.model

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.model.update.UpdateFullParams
import com.hanzo_ai.api.models.model.update.UpdateFullResponse
import com.hanzo_ai.api.models.model.update.UpdatePartialParams
import com.hanzo_ai.api.models.model.update.UpdatePartialResponse
import java.util.concurrent.CompletableFuture

interface UpdateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Edit existing model params */
    fun full(params: UpdateFullParams): CompletableFuture<UpdateFullResponse> =
        full(params, RequestOptions.none())

    /** @see [full] */
    fun full(
        params: UpdateFullParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UpdateFullResponse>

    /**
     * PATCH Endpoint for partial model updates.
     *
     * Only updates the fields specified in the request while preserving other existing values.
     * Follows proper PATCH semantics by only modifying provided fields.
     *
     * Args: model_id: The ID of the model to update patch_data: The fields to update and their new
     * values user_api_key_dict: User authentication information
     *
     * Returns: Updated model information
     *
     * Raises: ProxyException: For various error conditions including authentication and database
     * errors
     */
    fun partial(params: UpdatePartialParams): CompletableFuture<UpdatePartialResponse> =
        partial(params, RequestOptions.none())

    /** @see [partial] */
    fun partial(
        params: UpdatePartialParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UpdatePartialResponse>

    /**
     * A view of [UpdateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /model/update`, but is otherwise the same as
         * [UpdateServiceAsync.full].
         */
        @MustBeClosed
        fun full(params: UpdateFullParams): CompletableFuture<HttpResponseFor<UpdateFullResponse>> =
            full(params, RequestOptions.none())

        /** @see [full] */
        @MustBeClosed
        fun full(
            params: UpdateFullParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UpdateFullResponse>>

        /**
         * Returns a raw HTTP response for `patch /model/{model_id}/update`, but is otherwise the
         * same as [UpdateServiceAsync.partial].
         */
        @MustBeClosed
        fun partial(
            params: UpdatePartialParams
        ): CompletableFuture<HttpResponseFor<UpdatePartialResponse>> =
            partial(params, RequestOptions.none())

        /** @see [partial] */
        @MustBeClosed
        fun partial(
            params: UpdatePartialParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UpdatePartialResponse>>
    }
}
