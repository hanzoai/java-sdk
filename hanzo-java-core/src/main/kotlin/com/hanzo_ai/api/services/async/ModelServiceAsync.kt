// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.model.ModelCreateParams
import com.hanzo_ai.api.models.model.ModelCreateResponse
import com.hanzo_ai.api.models.model.ModelDeleteParams
import com.hanzo_ai.api.models.model.ModelDeleteResponse
import com.hanzo_ai.api.services.async.model.InfoServiceAsync
import com.hanzo_ai.api.services.async.model.UpdateServiceAsync
import java.util.concurrent.CompletableFuture

interface ModelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun info(): InfoServiceAsync

    fun update(): UpdateServiceAsync

    /** Allows adding new models to the model list in the config.yaml */
    fun create(params: ModelCreateParams): CompletableFuture<ModelCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ModelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelCreateResponse>

    /** Allows deleting models in the model list in the config.yaml */
    fun delete(params: ModelDeleteParams): CompletableFuture<ModelDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ModelDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelDeleteResponse>

    /** A view of [ModelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun info(): InfoServiceAsync.WithRawResponse

        fun update(): UpdateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /model/new`, but is otherwise the same as
         * [ModelServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: ModelCreateParams
        ): CompletableFuture<HttpResponseFor<ModelCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ModelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /model/delete`, but is otherwise the same as
         * [ModelServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: ModelDeleteParams
        ): CompletableFuture<HttpResponseFor<ModelDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ModelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelDeleteResponse>>
    }
}
