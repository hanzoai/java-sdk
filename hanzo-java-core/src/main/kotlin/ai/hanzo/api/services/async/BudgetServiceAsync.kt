// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.budget.BudgetCreateParams
import ai.hanzo.api.models.budget.BudgetCreateResponse
import ai.hanzo.api.models.budget.BudgetDeleteParams
import ai.hanzo.api.models.budget.BudgetDeleteResponse
import ai.hanzo.api.models.budget.BudgetInfoParams
import ai.hanzo.api.models.budget.BudgetInfoResponse
import ai.hanzo.api.models.budget.BudgetListParams
import ai.hanzo.api.models.budget.BudgetListResponse
import ai.hanzo.api.models.budget.BudgetSettingsParams
import ai.hanzo.api.models.budget.BudgetSettingsResponse
import ai.hanzo.api.models.budget.BudgetUpdateParams
import ai.hanzo.api.models.budget.BudgetUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BudgetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BudgetServiceAsync

    /**
     * Create a new budget object. Can apply this to teams, orgs, end-users, keys.
     *
     * Parameters:
     * - budget_duration: Optional[str] - Budget reset period ("30d", "1h", etc.)
     * - budget_id: Optional[str] - The id of the budget. If not provided, a new id will be
     *   generated.
     * - max_budget: Optional[float] - The max budget for the budget.
     * - soft_budget: Optional[float] - The soft budget for the budget.
     * - max_parallel_requests: Optional[int] - The max number of parallel requests for the budget.
     * - tpm_limit: Optional[int] - The tokens per minute limit for the budget.
     * - rpm_limit: Optional[int] - The requests per minute limit for the budget.
     * - model_max_budget: Optional[dict] - Specify max budget for a given model. Example:
     *   {"openai/gpt-4o-mini": {"max_budget": 100.0, "budget_duration": "1d", "tpm_limit": 100000,
     *   "rpm_limit": 100000}}
     */
    fun create(params: BudgetCreateParams): CompletableFuture<BudgetCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BudgetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BudgetCreateResponse>

    /**
     * Update an existing budget object.
     *
     * Parameters:
     * - budget_duration: Optional[str] - Budget reset period ("30d", "1h", etc.)
     * - budget_id: Optional[str] - The id of the budget. If not provided, a new id will be
     *   generated.
     * - max_budget: Optional[float] - The max budget for the budget.
     * - soft_budget: Optional[float] - The soft budget for the budget.
     * - max_parallel_requests: Optional[int] - The max number of parallel requests for the budget.
     * - tpm_limit: Optional[int] - The tokens per minute limit for the budget.
     * - rpm_limit: Optional[int] - The requests per minute limit for the budget.
     * - model_max_budget: Optional[dict] - Specify max budget for a given model. Example:
     *   {"openai/gpt-4o-mini": {"max_budget": 100.0, "budget_duration": "1d", "tpm_limit": 100000,
     *   "rpm_limit": 100000}}
     */
    fun update(params: BudgetUpdateParams): CompletableFuture<BudgetUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BudgetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BudgetUpdateResponse>

    /** List all the created budgets in proxy db. Used on Admin UI. */
    fun list(): CompletableFuture<BudgetListResponse> = list(BudgetListParams.none())

    /** @see list */
    fun list(
        params: BudgetListParams = BudgetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BudgetListResponse>

    /** @see list */
    fun list(
        params: BudgetListParams = BudgetListParams.none()
    ): CompletableFuture<BudgetListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BudgetListResponse> =
        list(BudgetListParams.none(), requestOptions)

    /**
     * Delete budget
     *
     * Parameters:
     * - id: str - The budget id to delete
     */
    fun delete(params: BudgetDeleteParams): CompletableFuture<BudgetDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BudgetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BudgetDeleteResponse>

    /**
     * Get the budget id specific information
     *
     * Parameters:
     * - budgets: List[str] - The list of budget ids to get information for
     */
    fun info(params: BudgetInfoParams): CompletableFuture<BudgetInfoResponse> =
        info(params, RequestOptions.none())

    /** @see info */
    fun info(
        params: BudgetInfoParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BudgetInfoResponse>

    /**
     * Get list of configurable params + current value for a budget item + description of each field
     *
     * Used on Admin UI.
     *
     * Query Parameters:
     * - budget_id: str - The budget id to get information for
     */
    fun settings(params: BudgetSettingsParams): CompletableFuture<BudgetSettingsResponse> =
        settings(params, RequestOptions.none())

    /** @see settings */
    fun settings(
        params: BudgetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BudgetSettingsResponse>

    /**
     * A view of [BudgetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BudgetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /budget/new`, but is otherwise the same as
         * [BudgetServiceAsync.create].
         */
        fun create(
            params: BudgetCreateParams
        ): CompletableFuture<HttpResponseFor<BudgetCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BudgetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BudgetCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /budget/update`, but is otherwise the same as
         * [BudgetServiceAsync.update].
         */
        fun update(
            params: BudgetUpdateParams
        ): CompletableFuture<HttpResponseFor<BudgetUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BudgetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BudgetUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /budget/list`, but is otherwise the same as
         * [BudgetServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BudgetListResponse>> =
            list(BudgetListParams.none())

        /** @see list */
        fun list(
            params: BudgetListParams = BudgetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BudgetListResponse>>

        /** @see list */
        fun list(
            params: BudgetListParams = BudgetListParams.none()
        ): CompletableFuture<HttpResponseFor<BudgetListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BudgetListResponse>> =
            list(BudgetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /budget/delete`, but is otherwise the same as
         * [BudgetServiceAsync.delete].
         */
        fun delete(
            params: BudgetDeleteParams
        ): CompletableFuture<HttpResponseFor<BudgetDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BudgetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BudgetDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /budget/info`, but is otherwise the same as
         * [BudgetServiceAsync.info].
         */
        fun info(params: BudgetInfoParams): CompletableFuture<HttpResponseFor<BudgetInfoResponse>> =
            info(params, RequestOptions.none())

        /** @see info */
        fun info(
            params: BudgetInfoParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BudgetInfoResponse>>

        /**
         * Returns a raw HTTP response for `get /budget/settings`, but is otherwise the same as
         * [BudgetServiceAsync.settings].
         */
        fun settings(
            params: BudgetSettingsParams
        ): CompletableFuture<HttpResponseFor<BudgetSettingsResponse>> =
            settings(params, RequestOptions.none())

        /** @see settings */
        fun settings(
            params: BudgetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BudgetSettingsResponse>>
    }
}
