// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async.team

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.team.model.ModelAddParams
import com.hanzo_ai.api.models.team.model.ModelAddResponse
import com.hanzo_ai.api.models.team.model.ModelRemoveParams
import com.hanzo_ai.api.models.team.model.ModelRemoveResponse
import java.util.concurrent.CompletableFuture

interface ModelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Add models to a team's allowed model list. Only proxy admin or team admin can add models.
     *
     * Parameters:
     * - team_id: str - Required. The team to add models to
     * - models: List[str] - Required. List of models to add to the team
     *
     * Example Request:
     * ```
     * curl --location 'http://0.0.0.0:4000/team/model/add'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "team_id": "team-1234",
     *     "models": ["gpt-4", "claude-2"]
     * }'
     * ```
     */
    fun add(params: ModelAddParams): CompletableFuture<ModelAddResponse> =
        add(params, RequestOptions.none())

    /** @see [add] */
    fun add(
        params: ModelAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelAddResponse>

    /**
     * Remove models from a team's allowed model list. Only proxy admin or team admin can remove
     * models.
     *
     * Parameters:
     * - team_id: str - Required. The team to remove models from
     * - models: List[str] - Required. List of models to remove from the team
     *
     * Example Request:
     * ```
     * curl --location 'http://0.0.0.0:4000/team/model/delete'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "team_id": "team-1234",
     *     "models": ["gpt-4"]
     * }'
     * ```
     */
    fun remove(params: ModelRemoveParams): CompletableFuture<ModelRemoveResponse> =
        remove(params, RequestOptions.none())

    /** @see [remove] */
    fun remove(
        params: ModelRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelRemoveResponse>

    /** A view of [ModelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /team/model/add`, but is otherwise the same as
         * [ModelServiceAsync.add].
         */
        @MustBeClosed
        fun add(params: ModelAddParams): CompletableFuture<HttpResponseFor<ModelAddResponse>> =
            add(params, RequestOptions.none())

        /** @see [add] */
        @MustBeClosed
        fun add(
            params: ModelAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelAddResponse>>

        /**
         * Returns a raw HTTP response for `post /team/model/delete`, but is otherwise the same as
         * [ModelServiceAsync.remove].
         */
        @MustBeClosed
        fun remove(
            params: ModelRemoveParams
        ): CompletableFuture<HttpResponseFor<ModelRemoveResponse>> =
            remove(params, RequestOptions.none())

        /** @see [remove] */
        @MustBeClosed
        fun remove(
            params: ModelRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelRemoveResponse>>
    }
}
