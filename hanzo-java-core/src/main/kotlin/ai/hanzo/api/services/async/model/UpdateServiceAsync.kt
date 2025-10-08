// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.model

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.model.update.UpdateDeployment
import ai.hanzo.api.models.model.update.UpdateFullParams
import ai.hanzo.api.models.model.update.UpdateFullResponse
import ai.hanzo.api.models.model.update.UpdatePartialParams
import ai.hanzo.api.models.model.update.UpdatePartialResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UpdateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UpdateServiceAsync

    /** Edit existing model params */
    fun full(params: UpdateFullParams): CompletableFuture<UpdateFullResponse> =
        full(params, RequestOptions.none())

    /** @see full */
    fun full(
        params: UpdateFullParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UpdateFullResponse>

    /** @see full */
    fun full(
        updateDeployment: UpdateDeployment,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UpdateFullResponse> =
        full(UpdateFullParams.builder().updateDeployment(updateDeployment).build(), requestOptions)

    /** @see full */
    fun full(updateDeployment: UpdateDeployment): CompletableFuture<UpdateFullResponse> =
        full(updateDeployment, RequestOptions.none())

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
    fun partial(
        modelId: String,
        params: UpdatePartialParams,
    ): CompletableFuture<UpdatePartialResponse> = partial(modelId, params, RequestOptions.none())

    /** @see partial */
    fun partial(
        modelId: String,
        params: UpdatePartialParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UpdatePartialResponse> =
        partial(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see partial */
    fun partial(params: UpdatePartialParams): CompletableFuture<UpdatePartialResponse> =
        partial(params, RequestOptions.none())

    /** @see partial */
    fun partial(
        params: UpdatePartialParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UpdatePartialResponse>

    /**
     * A view of [UpdateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UpdateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /model/update`, but is otherwise the same as
         * [UpdateServiceAsync.full].
         */
        fun full(params: UpdateFullParams): CompletableFuture<HttpResponseFor<UpdateFullResponse>> =
            full(params, RequestOptions.none())

        /** @see full */
        fun full(
            params: UpdateFullParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UpdateFullResponse>>

        /** @see full */
        fun full(
            updateDeployment: UpdateDeployment,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UpdateFullResponse>> =
            full(
                UpdateFullParams.builder().updateDeployment(updateDeployment).build(),
                requestOptions,
            )

        /** @see full */
        fun full(
            updateDeployment: UpdateDeployment
        ): CompletableFuture<HttpResponseFor<UpdateFullResponse>> =
            full(updateDeployment, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /model/{model_id}/update`, but is otherwise the
         * same as [UpdateServiceAsync.partial].
         */
        fun partial(
            modelId: String,
            params: UpdatePartialParams,
        ): CompletableFuture<HttpResponseFor<UpdatePartialResponse>> =
            partial(modelId, params, RequestOptions.none())

        /** @see partial */
        fun partial(
            modelId: String,
            params: UpdatePartialParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UpdatePartialResponse>> =
            partial(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see partial */
        fun partial(
            params: UpdatePartialParams
        ): CompletableFuture<HttpResponseFor<UpdatePartialResponse>> =
            partial(params, RequestOptions.none())

        /** @see partial */
        fun partial(
            params: UpdatePartialParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UpdatePartialResponse>>
    }
}
