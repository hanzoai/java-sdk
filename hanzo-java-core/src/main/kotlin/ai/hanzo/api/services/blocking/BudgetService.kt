// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

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
import ai.hanzo.api.models.budget.BudgetNew
import ai.hanzo.api.models.budget.BudgetSettingsParams
import ai.hanzo.api.models.budget.BudgetSettingsResponse
import ai.hanzo.api.models.budget.BudgetUpdateParams
import ai.hanzo.api.models.budget.BudgetUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface BudgetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BudgetService

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
    fun create(params: BudgetCreateParams): BudgetCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BudgetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetCreateResponse

    /** @see create */
    fun create(
        budgetNew: BudgetNew,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetCreateResponse =
        create(BudgetCreateParams.builder().budgetNew(budgetNew).build(), requestOptions)

    /** @see create */
    fun create(budgetNew: BudgetNew): BudgetCreateResponse =
        create(budgetNew, RequestOptions.none())

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
    fun update(params: BudgetUpdateParams): BudgetUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BudgetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetUpdateResponse

    /** @see update */
    fun update(
        budgetNew: BudgetNew,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetUpdateResponse =
        update(BudgetUpdateParams.builder().budgetNew(budgetNew).build(), requestOptions)

    /** @see update */
    fun update(budgetNew: BudgetNew): BudgetUpdateResponse =
        update(budgetNew, RequestOptions.none())

    /** List all the created budgets in proxy db. Used on Admin UI. */
    fun list(): BudgetListResponse = list(BudgetListParams.none())

    /** @see list */
    fun list(
        params: BudgetListParams = BudgetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetListResponse

    /** @see list */
    fun list(params: BudgetListParams = BudgetListParams.none()): BudgetListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BudgetListResponse =
        list(BudgetListParams.none(), requestOptions)

    /**
     * Delete budget
     *
     * Parameters:
     * - id: str - The budget id to delete
     */
    fun delete(params: BudgetDeleteParams): BudgetDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BudgetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetDeleteResponse

    /**
     * Get the budget id specific information
     *
     * Parameters:
     * - budgets: List[str] - The list of budget ids to get information for
     */
    fun info(params: BudgetInfoParams): BudgetInfoResponse = info(params, RequestOptions.none())

    /** @see info */
    fun info(
        params: BudgetInfoParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetInfoResponse

    /**
     * Get list of configurable params + current value for a budget item + description of each field
     *
     * Used on Admin UI.
     *
     * Query Parameters:
     * - budget_id: str - The budget id to get information for
     */
    fun settings(params: BudgetSettingsParams): BudgetSettingsResponse =
        settings(params, RequestOptions.none())

    /** @see settings */
    fun settings(
        params: BudgetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BudgetSettingsResponse

    /** A view of [BudgetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BudgetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /budget/new`, but is otherwise the same as
         * [BudgetService.create].
         */
        @MustBeClosed
        fun create(params: BudgetCreateParams): HttpResponseFor<BudgetCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BudgetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            budgetNew: BudgetNew,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetCreateResponse> =
            create(BudgetCreateParams.builder().budgetNew(budgetNew).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(budgetNew: BudgetNew): HttpResponseFor<BudgetCreateResponse> =
            create(budgetNew, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /budget/update`, but is otherwise the same as
         * [BudgetService.update].
         */
        @MustBeClosed
        fun update(params: BudgetUpdateParams): HttpResponseFor<BudgetUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BudgetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            budgetNew: BudgetNew,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetUpdateResponse> =
            update(BudgetUpdateParams.builder().budgetNew(budgetNew).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(budgetNew: BudgetNew): HttpResponseFor<BudgetUpdateResponse> =
            update(budgetNew, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /budget/list`, but is otherwise the same as
         * [BudgetService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BudgetListResponse> = list(BudgetListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BudgetListParams = BudgetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BudgetListParams = BudgetListParams.none()
        ): HttpResponseFor<BudgetListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BudgetListResponse> =
            list(BudgetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /budget/delete`, but is otherwise the same as
         * [BudgetService.delete].
         */
        @MustBeClosed
        fun delete(params: BudgetDeleteParams): HttpResponseFor<BudgetDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BudgetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /budget/info`, but is otherwise the same as
         * [BudgetService.info].
         */
        @MustBeClosed
        fun info(params: BudgetInfoParams): HttpResponseFor<BudgetInfoResponse> =
            info(params, RequestOptions.none())

        /** @see info */
        @MustBeClosed
        fun info(
            params: BudgetInfoParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetInfoResponse>

        /**
         * Returns a raw HTTP response for `get /budget/settings`, but is otherwise the same as
         * [BudgetService.settings].
         */
        @MustBeClosed
        fun settings(params: BudgetSettingsParams): HttpResponseFor<BudgetSettingsResponse> =
            settings(params, RequestOptions.none())

        /** @see settings */
        @MustBeClosed
        fun settings(
            params: BudgetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BudgetSettingsResponse>
    }
}
