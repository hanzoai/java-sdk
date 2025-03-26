// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.customer.CustomerBlockParams
import com.hanzo_ai.api.models.customer.CustomerBlockResponse
import com.hanzo_ai.api.models.customer.CustomerCreateParams
import com.hanzo_ai.api.models.customer.CustomerCreateResponse
import com.hanzo_ai.api.models.customer.CustomerDeleteParams
import com.hanzo_ai.api.models.customer.CustomerDeleteResponse
import com.hanzo_ai.api.models.customer.CustomerListParams
import com.hanzo_ai.api.models.customer.CustomerListResponse
import com.hanzo_ai.api.models.customer.CustomerRetrieveInfoParams
import com.hanzo_ai.api.models.customer.CustomerRetrieveInfoResponse
import com.hanzo_ai.api.models.customer.CustomerUnblockParams
import com.hanzo_ai.api.models.customer.CustomerUnblockResponse
import com.hanzo_ai.api.models.customer.CustomerUpdateParams
import com.hanzo_ai.api.models.customer.CustomerUpdateResponse

interface CustomerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Allow creating a new Customer
     *
     * Parameters:
     * - user_id: str - The unique identifier for the user.
     * - alias: Optional[str] - A human-friendly alias for the user.
     * - blocked: bool - Flag to allow or disallow requests for this end-user. Default is False.
     * - max_budget: Optional[float] - The maximum budget allocated to the user. Either 'max_budget'
     *   or 'budget_id' should be provided, not both.
     * - budget_id: Optional[str] - The identifier for an existing budget allocated to the user.
     *   Either 'max_budget' or 'budget_id' should be provided, not both.
     * - allowed_model_region: Optional[Union[Literal["eu"], Literal["us"]]] - Require all user
     *   requests to use models in this specific region.
     * - default_model: Optional[str] - If no equivalent model in the allowed region, default all
     *   requests to this model.
     * - metadata: Optional[dict] = Metadata for customer, store information for customer. Example
     *   metadata = {"data_training_opt_out": True}
     * - budget_duration: Optional[str] - Budget is reset at the end of specified duration. If not
     *   set, budget is never reset. You can set duration as seconds ("30s"), minutes ("30m"), hours
     *   ("30h"), days ("30d").
     * - tpm_limit: Optional[int] - [Not Implemented Yet] Specify tpm limit for a given customer
     *   (Tokens per minute)
     * - rpm_limit: Optional[int] - [Not Implemented Yet] Specify rpm limit for a given customer
     *   (Requests per minute)
     * - model_max_budget: Optional[dict] - [Not Implemented Yet] Specify max budget for a given
     *   model. Example: {"openai/gpt-4o-mini": {"max_budget": 100.0, "budget_duration": "1d"}}
     * - max_parallel_requests: Optional[int] - [Not Implemented Yet] Specify max parallel requests
     *   for a given customer.
     * - soft_budget: Optional[float] - [Not Implemented Yet] Get alerts when customer crosses given
     *   budget, doesn't block requests.
     * - Allow specifying allowed regions
     * - Allow specifying default model
     *
     * Example curl:
     * ```
     * curl --location 'http://0.0.0.0:4000/customer/new'         --header 'Authorization: Bearer sk-1234'         --header 'Content-Type: application/json'         --data '{
     *         "user_id" : "z-jaff-3",
     *         "allowed_region": "eu",
     *         "budget_id": "free_tier",
     *         "default_model": "azure/gpt-3.5-turbo-eu" <- all calls from this user, use this model?
     *     }'
     *
     *     # return end-user object
     * ```
     *
     * NOTE: This used to be called `/end_user/new`, we will still be maintaining compatibility for
     * /end_user/XXX for these endpoints
     */
    fun create(params: CustomerCreateParams): CustomerCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreateResponse

    /**
     * Example curl
     *
     * Parameters:
     * - user_id: str
     * - alias: Optional[str] = None # human-friendly alias
     * - blocked: bool = False # allow/disallow requests for this end-user
     * - max_budget: Optional[float] = None
     * - budget_id: Optional[str] = None # give either a budget_id or max_budget
     * - allowed_model_region: Optional[AllowedModelRegion] = ( None # require all user requests to
     *   use models in this specific region )
     * - default_model: Optional[str] = ( None # if no equivalent model in allowed region - default
     *   all requests to this model )
     *
     * Example curl:
     * ```
     * curl --location 'http://0.0.0.0:4000/customer/update'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "user_id": "test-llm-user-4",
     *     "budget_id": "paid_tier"
     * }'
     *
     * See below for all params
     * ```
     */
    fun update(params: CustomerUpdateParams): CustomerUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerUpdateResponse

    /**
     * [Admin-only] List all available customers
     *
     * Example curl:
     * ```
     * curl --location --request GET 'http://0.0.0.0:4000/customer/list'         --header 'Authorization: Bearer sk-1234'
     * ```
     */
    fun list(): List<CustomerListResponse> = list(CustomerListParams.none())

    /** @see [list] */
    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CustomerListResponse>

    /** @see [list] */
    fun list(params: CustomerListParams = CustomerListParams.none()): List<CustomerListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<CustomerListResponse> =
        list(CustomerListParams.none(), requestOptions)

    /**
     * Delete multiple end-users.
     *
     * Parameters:
     * - user_ids (List[str], required): The unique `user_id`s for the users to delete
     *
     * Example curl:
     * ```
     * curl --location 'http://0.0.0.0:4000/customer/delete'         --header 'Authorization: Bearer sk-1234'         --header 'Content-Type: application/json'         --data '{
     *         "user_ids" :["z-jaff-5"]
     * }'
     *
     * See below for all params
     * ```
     */
    fun delete(params: CustomerDeleteParams): CustomerDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CustomerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerDeleteResponse

    /**
     * [BETA] Reject calls with this end-user id
     *
     * Parameters:
     * - user_ids (List[str], required): The unique `user_id`s for the users to block
     *
     *   (any /chat/completion call with this user={end-user-id} param, will be rejected.)
     *
     *   ``` curl -X POST "http://0.0.0.0:8000/user/block" -H "Authorization: Bearer sk-1234" -d '{
     *   "user_ids": [<user_id>, ...] }' ```
     */
    fun block(params: CustomerBlockParams): CustomerBlockResponse =
        block(params, RequestOptions.none())

    /** @see [block] */
    fun block(
        params: CustomerBlockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerBlockResponse

    /**
     * Get information about an end-user. An `end_user` is a customer (external user) of the proxy.
     *
     * Parameters:
     * - end_user_id (str, required): The unique identifier for the end-user
     *
     * Example curl:
     * ```
     * curl -X GET 'http://localhost:4000/customer/info?end_user_id=test-llm-user-4'         -H 'Authorization: Bearer sk-1234'
     * ```
     */
    fun retrieveInfo(params: CustomerRetrieveInfoParams): CustomerRetrieveInfoResponse =
        retrieveInfo(params, RequestOptions.none())

    /** @see [retrieveInfo] */
    fun retrieveInfo(
        params: CustomerRetrieveInfoParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerRetrieveInfoResponse

    /**
     * [BETA] Unblock calls with this user id
     *
     * Example
     *
     * ```
     * curl -X POST "http://0.0.0.0:8000/user/unblock"
     * -H "Authorization: Bearer sk-1234"
     * -d '{
     * "user_ids": [<user_id>, ...]
     * }'
     * ```
     */
    fun unblock(params: CustomerUnblockParams): CustomerUnblockResponse =
        unblock(params, RequestOptions.none())

    /** @see [unblock] */
    fun unblock(
        params: CustomerUnblockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerUnblockResponse

    /** A view of [CustomerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /customer/new`, but is otherwise the same as
         * [CustomerService.create].
         */
        @MustBeClosed
        fun create(params: CustomerCreateParams): HttpResponseFor<CustomerCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerCreateResponse>

        /**
         * Returns a raw HTTP response for `post /customer/update`, but is otherwise the same as
         * [CustomerService.update].
         */
        @MustBeClosed
        fun update(params: CustomerUpdateParams): HttpResponseFor<CustomerUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /customer/list`, but is otherwise the same as
         * [CustomerService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<CustomerListResponse>> = list(CustomerListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CustomerListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none()
        ): HttpResponseFor<List<CustomerListResponse>> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<CustomerListResponse>> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /customer/delete`, but is otherwise the same as
         * [CustomerService.delete].
         */
        @MustBeClosed
        fun delete(params: CustomerDeleteParams): HttpResponseFor<CustomerDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /customer/block`, but is otherwise the same as
         * [CustomerService.block].
         */
        @MustBeClosed
        fun block(params: CustomerBlockParams): HttpResponseFor<CustomerBlockResponse> =
            block(params, RequestOptions.none())

        /** @see [block] */
        @MustBeClosed
        fun block(
            params: CustomerBlockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerBlockResponse>

        /**
         * Returns a raw HTTP response for `get /customer/info`, but is otherwise the same as
         * [CustomerService.retrieveInfo].
         */
        @MustBeClosed
        fun retrieveInfo(
            params: CustomerRetrieveInfoParams
        ): HttpResponseFor<CustomerRetrieveInfoResponse> =
            retrieveInfo(params, RequestOptions.none())

        /** @see [retrieveInfo] */
        @MustBeClosed
        fun retrieveInfo(
            params: CustomerRetrieveInfoParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerRetrieveInfoResponse>

        /**
         * Returns a raw HTTP response for `post /customer/unblock`, but is otherwise the same as
         * [CustomerService.unblock].
         */
        @MustBeClosed
        fun unblock(params: CustomerUnblockParams): HttpResponseFor<CustomerUnblockResponse> =
            unblock(params, RequestOptions.none())

        /** @see [unblock] */
        @MustBeClosed
        fun unblock(
            params: CustomerUnblockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerUnblockResponse>
    }
}
