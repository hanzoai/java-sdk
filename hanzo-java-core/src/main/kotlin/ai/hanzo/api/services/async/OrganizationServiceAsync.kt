// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.organization.OrganizationAddMemberParams
import ai.hanzo.api.models.organization.OrganizationAddMemberResponse
import ai.hanzo.api.models.organization.OrganizationCreateParams
import ai.hanzo.api.models.organization.OrganizationCreateResponse
import ai.hanzo.api.models.organization.OrganizationDeleteMemberParams
import ai.hanzo.api.models.organization.OrganizationDeleteMemberResponse
import ai.hanzo.api.models.organization.OrganizationDeleteParams
import ai.hanzo.api.models.organization.OrganizationDeleteResponse
import ai.hanzo.api.models.organization.OrganizationListParams
import ai.hanzo.api.models.organization.OrganizationListResponse
import ai.hanzo.api.models.organization.OrganizationUpdateMemberParams
import ai.hanzo.api.models.organization.OrganizationUpdateMemberResponse
import ai.hanzo.api.models.organization.OrganizationUpdateParams
import ai.hanzo.api.models.organization.OrganizationUpdateResponse
import ai.hanzo.api.services.async.organization.InfoServiceAsync
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface OrganizationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun info(): InfoServiceAsync

    /**
     * Allow orgs to own teams
     *
     * Set org level budgets + model access.
     *
     * Only admins can create orgs.
     *
     * # Parameters
     * - organization_alias: _str_ - The name of the organization.
     * - models: _List_ - The models the organization has access to.
     * - budget_id: _Optional[str]_ - The id for a budget (tpm/rpm/max budget) for the organization.
     *
     * ### IF NO BUDGET ID - CREATE ONE WITH THESE PARAMS
     * - max_budget: _Optional[float]_ - Max budget for org
     * - tpm_limit: _Optional[int]_ - Max tpm limit for org
     * - rpm_limit: _Optional[int]_ - Max rpm limit for org
     * - max_parallel_requests: _Optional[int]_ - [Not Implemented Yet] Max parallel requests for
     *   org
     * - soft_budget: _Optional[float]_ - [Not Implemented Yet] Get a slack alert when this soft
     *   budget is reached. Don't block requests.
     * - model_max_budget: _Optional[dict]_ - Max budget for a specific model
     * - budget_duration: _Optional[str]_ - Frequency of reseting org budget
     * - metadata: _Optional[dict]_ - Metadata for organization, store information for organization.
     *   Example metadata - {"extra_info": "some info"}
     * - blocked: _bool_ - Flag indicating if the org is blocked or not - will stop all calls from
     *   keys with this org_id.
     * - tags: _Optional[List[str]]_ - Tags for
     *   [tracking spend](https://llm.vercel.app/docs/proxy/enterprise#tracking-spend-for-custom-tags)
     *   and/or doing [tag-based routing](https://llm.vercel.app/docs/proxy/tag_routing).
     * - organization_id: _Optional[str]_ - The organization id of the team. Default is None. Create
     *   via `/organization/new`.
     * - model_aliases: Optional[dict] - Model aliases for the team.
     *   [Docs](https://docs.hanzo.ai/docs/proxy/team_based_routing#create-team-with-model-alias)
     *
     * Case 1: Create new org **without** a budget_id
     *
     * ```bash
     * curl --location 'http://0.0.0.0:4000/organization/new'
     * --header 'Authorization: Bearer sk-1234'
     * --header 'Content-Type: application/json'
     * --data '{
     *     "organization_alias": "my-secret-org",
     *     "models": ["model1", "model2"],
     *     "max_budget": 100
     * }'
     *
     *
     * ```
     *
     * Case 2: Create new org **with** a budget_id
     *
     * ```bash
     * curl --location 'http://0.0.0.0:4000/organization/new'
     * --header 'Authorization: Bearer sk-1234'
     * --header 'Content-Type: application/json'
     * --data '{
     *     "organization_alias": "my-secret-org",
     *     "models": ["model1", "model2"],
     *     "budget_id": "428eeaa8-f3ac-4e85-a8fb-7dc8d7aa8689"
     * }'
     * ```
     */
    fun create(params: OrganizationCreateParams): CompletableFuture<OrganizationCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: OrganizationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationCreateResponse>

    /** Update an organization */
    fun update(): CompletableFuture<OrganizationUpdateResponse> =
        update(OrganizationUpdateParams.none())

    /** @see [update] */
    fun update(
        params: OrganizationUpdateParams = OrganizationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationUpdateResponse>

    /** @see [update] */
    fun update(
        params: OrganizationUpdateParams = OrganizationUpdateParams.none()
    ): CompletableFuture<OrganizationUpdateResponse> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(requestOptions: RequestOptions): CompletableFuture<OrganizationUpdateResponse> =
        update(OrganizationUpdateParams.none(), requestOptions)

    /**
     * ```
     * curl --location --request GET 'http://0.0.0.0:4000/organization/list'         --header 'Authorization: Bearer sk-1234'
     * ```
     */
    fun list(): CompletableFuture<List<OrganizationListResponse>> =
        list(OrganizationListParams.none())

    /** @see [list] */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrganizationListResponse>>

    /** @see [list] */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none()
    ): CompletableFuture<List<OrganizationListResponse>> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<OrganizationListResponse>> =
        list(OrganizationListParams.none(), requestOptions)

    /**
     * Delete an organization
     *
     * # Parameters:
     * - organization_ids: List[str] - The organization ids to delete.
     */
    fun delete(
        params: OrganizationDeleteParams
    ): CompletableFuture<List<OrganizationDeleteResponse>> = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<OrganizationDeleteResponse>>

    /**
     * [BETA]
     *
     * Add new members (either via user_email or user_id) to an organization
     *
     * If user doesn't exist, new user row will also be added to User Table
     *
     * Only proxy_admin or org_admin of organization, allowed to access this endpoint.
     *
     * # Parameters:
     * - organization_id: str (required)
     * - member: Union[List[Member], Member] (required)
     *     - role: Literal[LLMUserRoles] (required)
     *     - user_id: Optional[str]
     *     - user_email: Optional[str]
     *
     * Note: Either user_id or user_email must be provided for each member.
     *
     * Example:
     * ```
     * curl -X POST 'http://0.0.0.0:4000/organization/member_add'     -H 'Authorization: Bearer sk-1234'     -H 'Content-Type: application/json'     -d '{
     *     "organization_id": "45e3e396-ee08-4a61-a88e-16b3ce7e0849",
     *     "member": {
     *         "role": "internal_user",
     *         "user_id": "dev247652@hanzo.ai"
     *     },
     *     "max_budget_in_organization": 100.0
     * }'
     * ```
     *
     * The following is executed in this function:
     * 1. Check if organization exists
     * 2. Creates a new Internal User if the user_id or user_email is not found in LLM_UserTable
     * 3. Add Internal User to the `LLM_OrganizationMembership` table
     */
    fun addMember(
        params: OrganizationAddMemberParams
    ): CompletableFuture<OrganizationAddMemberResponse> = addMember(params, RequestOptions.none())

    /** @see [addMember] */
    fun addMember(
        params: OrganizationAddMemberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationAddMemberResponse>

    /** Delete a member from an organization */
    fun deleteMember(
        params: OrganizationDeleteMemberParams
    ): CompletableFuture<OrganizationDeleteMemberResponse> =
        deleteMember(params, RequestOptions.none())

    /** @see [deleteMember] */
    fun deleteMember(
        params: OrganizationDeleteMemberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationDeleteMemberResponse>

    /** Update a member's role in an organization */
    fun updateMember(
        params: OrganizationUpdateMemberParams
    ): CompletableFuture<OrganizationUpdateMemberResponse> =
        updateMember(params, RequestOptions.none())

    /** @see [updateMember] */
    fun updateMember(
        params: OrganizationUpdateMemberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationUpdateMemberResponse>

    /**
     * A view of [OrganizationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun info(): InfoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organization/new`, but is otherwise the same as
         * [OrganizationServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: OrganizationCreateParams
        ): CompletableFuture<HttpResponseFor<OrganizationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: OrganizationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch /organization/update`, but is otherwise the same
         * as [OrganizationServiceAsync.update].
         */
        @MustBeClosed
        fun update(): CompletableFuture<HttpResponseFor<OrganizationUpdateResponse>> =
            update(OrganizationUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: OrganizationUpdateParams = OrganizationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationUpdateResponse>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: OrganizationUpdateParams = OrganizationUpdateParams.none()
        ): CompletableFuture<HttpResponseFor<OrganizationUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrganizationUpdateResponse>> =
            update(OrganizationUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organization/list`, but is otherwise the same as
         * [OrganizationServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<List<OrganizationListResponse>>> =
            list(OrganizationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: OrganizationListParams = OrganizationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrganizationListResponse>>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: OrganizationListParams = OrganizationListParams.none()
        ): CompletableFuture<HttpResponseFor<List<OrganizationListResponse>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<OrganizationListResponse>>> =
            list(OrganizationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organization/delete`, but is otherwise the same
         * as [OrganizationServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: OrganizationDeleteParams
        ): CompletableFuture<HttpResponseFor<List<OrganizationDeleteResponse>>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: OrganizationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<OrganizationDeleteResponse>>>

        /**
         * Returns a raw HTTP response for `post /organization/member_add`, but is otherwise the
         * same as [OrganizationServiceAsync.addMember].
         */
        @MustBeClosed
        fun addMember(
            params: OrganizationAddMemberParams
        ): CompletableFuture<HttpResponseFor<OrganizationAddMemberResponse>> =
            addMember(params, RequestOptions.none())

        /** @see [addMember] */
        @MustBeClosed
        fun addMember(
            params: OrganizationAddMemberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationAddMemberResponse>>

        /**
         * Returns a raw HTTP response for `delete /organization/member_delete`, but is otherwise
         * the same as [OrganizationServiceAsync.deleteMember].
         */
        @MustBeClosed
        fun deleteMember(
            params: OrganizationDeleteMemberParams
        ): CompletableFuture<HttpResponseFor<OrganizationDeleteMemberResponse>> =
            deleteMember(params, RequestOptions.none())

        /** @see [deleteMember] */
        @MustBeClosed
        fun deleteMember(
            params: OrganizationDeleteMemberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationDeleteMemberResponse>>

        /**
         * Returns a raw HTTP response for `patch /organization/member_update`, but is otherwise the
         * same as [OrganizationServiceAsync.updateMember].
         */
        @MustBeClosed
        fun updateMember(
            params: OrganizationUpdateMemberParams
        ): CompletableFuture<HttpResponseFor<OrganizationUpdateMemberResponse>> =
            updateMember(params, RequestOptions.none())

        /** @see [updateMember] */
        @MustBeClosed
        fun updateMember(
            params: OrganizationUpdateMemberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationUpdateMemberResponse>>
    }
}
