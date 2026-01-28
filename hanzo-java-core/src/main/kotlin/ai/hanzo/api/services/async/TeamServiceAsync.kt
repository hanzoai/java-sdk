// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.team.BlockTeamRequest
import ai.hanzo.api.models.team.TeamAddMemberParams
import ai.hanzo.api.models.team.TeamAddMemberResponse
import ai.hanzo.api.models.team.TeamBlockParams
import ai.hanzo.api.models.team.TeamBlockResponse
import ai.hanzo.api.models.team.TeamCreateParams
import ai.hanzo.api.models.team.TeamCreateResponse
import ai.hanzo.api.models.team.TeamDeleteParams
import ai.hanzo.api.models.team.TeamDeleteResponse
import ai.hanzo.api.models.team.TeamDisableLoggingParams
import ai.hanzo.api.models.team.TeamDisableLoggingResponse
import ai.hanzo.api.models.team.TeamListAvailableParams
import ai.hanzo.api.models.team.TeamListAvailableResponse
import ai.hanzo.api.models.team.TeamListParams
import ai.hanzo.api.models.team.TeamListResponse
import ai.hanzo.api.models.team.TeamRemoveMemberParams
import ai.hanzo.api.models.team.TeamRemoveMemberResponse
import ai.hanzo.api.models.team.TeamRetrieveInfoParams
import ai.hanzo.api.models.team.TeamRetrieveInfoResponse
import ai.hanzo.api.models.team.TeamUnblockParams
import ai.hanzo.api.models.team.TeamUnblockResponse
import ai.hanzo.api.models.team.TeamUpdateMemberParams
import ai.hanzo.api.models.team.TeamUpdateMemberResponse
import ai.hanzo.api.models.team.TeamUpdateParams
import ai.hanzo.api.models.team.TeamUpdateResponse
import ai.hanzo.api.services.async.team.CallbackServiceAsync
import ai.hanzo.api.services.async.team.ModelServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TeamServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamServiceAsync

    fun model(): ModelServiceAsync

    fun callback(): CallbackServiceAsync

    /**
     * Allow users to create a new team. Apply user permissions to their team.
     *
     * 👉 [Detailed Doc on setting team budgets](https://docs.litellm.ai/docs/proxy/team_budgets)
     *
     * Parameters:
     * - team_alias: Optional[str] - User defined team alias
     * - team_id: Optional[str] - The team id of the user. If none passed, we'll generate it.
     * - members_with_roles: List[{"role": "admin" or "user", "user_id": "<user-id>"}] - A list of
     *   users and their roles in the team. Get user_id when making a new user via `/user/new`.
     * - team_member_permissions: Optional[List[str]] - A list of routes that non-admin team members
     *   can access. example: ["/key/generate", "/key/update", "/key/delete"]
     * - metadata: Optional[dict] - Metadata for team, store information for team. Example metadata
     *   = {"extra_info": "some info"}
     * - model_rpm_limit: Optional[Dict[str, int]] - The RPM (Requests Per Minute) limit for this
     *   team - applied across all keys for this team.
     * - model_tpm_limit: Optional[Dict[str, int]] - The TPM (Tokens Per Minute) limit for this
     *   team - applied across all keys for this team.
     * - tpm_limit: Optional[int] - The TPM (Tokens Per Minute) limit for this team - all keys with
     *   this team_id will have at max this TPM limit
     * - rpm_limit: Optional[int] - The RPM (Requests Per Minute) limit for this team - all keys
     *   associated with this team_id will have at max this RPM limit
     * - rpm_limit_type: Optional[Literal["guaranteed_throughput", "best_effort_throughput"]] - The
     *   type of RPM limit enforcement. Use "guaranteed_throughput" to raise an error if
     *   overallocating RPM, or "best_effort_throughput" for best effort enforcement.
     * - tpm_limit_type: Optional[Literal["guaranteed_throughput", "best_effort_throughput"]] - The
     *   type of TPM limit enforcement. Use "guaranteed_throughput" to raise an error if
     *   overallocating TPM, or "best_effort_throughput" for best effort enforcement.
     * - max_budget: Optional[float] - The maximum budget allocated to the team - all keys for this
     *   team_id will have at max this max_budget
     * - budget_duration: Optional[str] - The duration of the budget for the team. Doc
     *   [here](https://docs.litellm.ai/docs/proxy/team_budgets)
     * - models: Optional[list] - A list of models associated with the team - all keys for this
     *   team_id will have at most, these models. If empty, assumes all models are allowed.
     * - blocked: bool - Flag indicating if the team is blocked or not - will stop all calls from
     *   keys with this team_id.
     * - members: Optional[List] - Control team members via `/team/member/add` and
     *   `/team/member/delete`.
     * - tags: Optional[List[str]] - Tags for
     *   [tracking spend](https://litellm.vercel.app/docs/proxy/enterprise#tracking-spend-for-custom-tags)
     *   and/or doing [tag-based routing](https://litellm.vercel.app/docs/proxy/tag_routing).
     * - prompts: Optional[List[str]] - List of prompts that the team is allowed to use.
     * - organization_id: Optional[str] - The organization id of the team. Default is None. Create
     *   via `/organization/new`.
     * - model_aliases: Optional[dict] - Model aliases for the team.
     *   [Docs](https://docs.litellm.ai/docs/proxy/team_based_routing#create-team-with-model-alias)
     * - guardrails: Optional[List[str]] - Guardrails for the team.
     *   [Docs](https://docs.litellm.ai/docs/proxy/guardrails)
     * - disable_global_guardrails: Optional[bool] - Whether to disable global guardrails for the
     *   key.
     * - object_permission: Optional[LiteLLM_ObjectPermissionBase] - team-specific object
     *   permission. Example - {"vector_stores": ["vector_store_1", "vector_store_2"], "agents":
     *   ["agent_1", "agent_2"], "agent_access_groups": ["dev_group"]}. IF null or {} then no object
     *   permission.
     * - team_member_budget: Optional[float] - The maximum budget allocated to an individual team
     *   member.
     * - team_member_rpm_limit: Optional[int] - The RPM (Requests Per Minute) limit for individual
     *   team members.
     * - team_member_tpm_limit: Optional[int] - The TPM (Tokens Per Minute) limit for individual
     *   team members.
     * - team_member_key_duration: Optional[str] - The duration for a team member's key. e.g. "1d",
     *   "1w", "1mo"
     * - allowed_passthrough_routes: Optional[List[str]] - List of allowed pass through routes for
     *   the team.
     * - allowed_vector_store_indexes: Optional[List[dict]] - List of allowed vector store indexes
     *   for the key.
     *   Example - [{"index_name": "my-index", "index_permissions": ["write", "read"]}]. If
     *   specified, the key will only be able to use these specific vector store indexes. Create
     *   index, using `/v1/indexes` endpoint.
     * - secret_manager_settings: Optional[dict] - Secret manager settings for the team.
     *   [Docs](https://docs.litellm.ai/docs/secret_managers/overview)
     * - router_settings: Optional[UpdateRouterConfig] - team-specific router settings. Example -
     *   {"model_group_retry_policy": {"max_retries": 5}}. IF null or {} then no router settings.
     *
     * Returns:
     * - team_id: (str) Unique team id - used for tracking spend across multiple keys for same team
     *   id.
     *
     * _deprecated_params:
     * - admins: list - A list of user_id's for the admin role
     * - users: list - A list of user_id's for the user role
     *
     * Example Request:
     * ```
     * curl --location 'http://0.0.0.0:4000/team/new'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *   "team_alias": "my-new-team_2",
     *   "members_with_roles": [{"role": "admin", "user_id": "user-1234"},
     *     {"role": "user", "user_id": "user-2434"}]
     * }'
     *
     * ```
     *  ```
     * curl --location 'http://0.0.0.0:4000/team/new'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *             "team_alias": "QA Prod Bot",
     *             "max_budget": 0.000000001,
     *             "budget_duration": "1d"
     *         }'
     * ```
     */
    fun create(): CompletableFuture<TeamCreateResponse> = create(TeamCreateParams.none())

    /** @see create */
    fun create(
        params: TeamCreateParams = TeamCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamCreateResponse>

    /** @see create */
    fun create(
        params: TeamCreateParams = TeamCreateParams.none()
    ): CompletableFuture<TeamCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<TeamCreateResponse> =
        create(TeamCreateParams.none(), requestOptions)

    /**
     * Use `/team/member_add` AND `/team/member/delete` to add/remove new team members
     *
     * You can now update team budget / rate limits via /team/update
     *
     * Parameters:
     * - team_id: str - The team id of the user. Required param.
     * - team_alias: Optional[str] - User defined team alias
     * - team_member_permissions: Optional[List[str]] - A list of routes that non-admin team members
     *   can access. example: ["/key/generate", "/key/update", "/key/delete"]
     * - metadata: Optional[dict] - Metadata for team, store information for team. Example metadata
     *   = {"team": "core-infra", "app": "app2", "email": "ishaan@berri.ai" }
     * - tpm_limit: Optional[int] - The TPM (Tokens Per Minute) limit for this team - all keys with
     *   this team_id will have at max this TPM limit
     * - rpm_limit: Optional[int] - The RPM (Requests Per Minute) limit for this team - all keys
     *   associated with this team_id will have at max this RPM limit
     * - max_budget: Optional[float] - The maximum budget allocated to the team - all keys for this
     *   team_id will have at max this max_budget
     * - budget_duration: Optional[str] - The duration of the budget for the team. Doc
     *   [here](https://docs.litellm.ai/docs/proxy/team_budgets)
     * - models: Optional[list] - A list of models associated with the team - all keys for this
     *   team_id will have at most, these models. If empty, assumes all models are allowed.
     * - prompts: Optional[List[str]] - List of prompts that the team is allowed to use.
     * - blocked: bool - Flag indicating if the team is blocked or not - will stop all calls from
     *   keys with this team_id.
     * - tags: Optional[List[str]] - Tags for
     *   [tracking spend](https://litellm.vercel.app/docs/proxy/enterprise#tracking-spend-for-custom-tags)
     *   and/or doing [tag-based routing](https://litellm.vercel.app/docs/proxy/tag_routing).
     * - organization_id: Optional[str] - The organization id of the team. Default is None. Create
     *   via `/organization/new`.
     * - model_aliases: Optional[dict] - Model aliases for the team.
     *   [Docs](https://docs.litellm.ai/docs/proxy/team_based_routing#create-team-with-model-alias)
     * - guardrails: Optional[List[str]] - Guardrails for the team.
     *   [Docs](https://docs.litellm.ai/docs/proxy/guardrails)
     * - disable_global_guardrails: Optional[bool] - Whether to disable global guardrails for the
     *   key.
     * - object_permission: Optional[LiteLLM_ObjectPermissionBase] - team-specific object
     *   permission. Example - {"vector_stores": ["vector_store_1", "vector_store_2"], "agents":
     *   ["agent_1", "agent_2"], "agent_access_groups": ["dev_group"]}. IF null or {} then no object
     *   permission.
     * - team_member_budget: Optional[float] - The maximum budget allocated to an individual team
     *   member.
     * - team_member_budget_duration: Optional[str] - The duration of the budget for the team
     *   member. Doc [here](https://docs.litellm.ai/docs/proxy/team_budgets)
     * - team_member_rpm_limit: Optional[int] - The RPM (Requests Per Minute) limit for individual
     *   team members.
     * - team_member_tpm_limit: Optional[int] - The TPM (Tokens Per Minute) limit for individual
     *   team members.
     * - team_member_key_duration: Optional[str] - The duration for a team member's key. e.g. "1d",
     *   "1w", "1mo"
     * - allowed_passthrough_routes: Optional[List[str]] - List of allowed pass through routes for
     *   the team.
     * - model_rpm_limit: Optional[Dict[str, int]] - The RPM (Requests Per Minute) limit per model
     *   for this team. Example: {"gpt-4": 100, "gpt-3.5-turbo": 200}
     * - model_tpm_limit: Optional[Dict[str, int]] - The TPM (Tokens Per Minute) limit per model for
     *   this team. Example: {"gpt-4": 10000, "gpt-3.5-turbo": 20000} Example - update team TPM
     *   Limit
     * - allowed_vector_store_indexes: Optional[List[dict]] - List of allowed vector store indexes
     *   for the key.
     *   Example - [{"index_name": "my-index", "index_permissions": ["write", "read"]}]. If
     *   specified, the key will only be able to use these specific vector store indexes. Create
     *   index, using `/v1/indexes` endpoint.
     * - secret_manager_settings: Optional[dict] - Secret manager settings for the team.
     *   [Docs](https://docs.litellm.ai/docs/secret_managers/overview)
     * - router_settings: Optional[UpdateRouterConfig] - team-specific router settings. Example -
     *   {"model_group_retry_policy": {"max_retries": 5}}. IF null or {} then no router settings.
     *
     * ```
     * curl --location 'http://0.0.0.0:4000/team/update'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data-raw '{
     *     "team_id": "8d916b1c-510d-4894-a334-1c16a93344f5",
     *     "tpm_limit": 100
     * }'
     * ```
     *
     * Example - Update Team `max_budget` budget
     *
     * ```
     * curl --location 'http://0.0.0.0:4000/team/update'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data-raw '{
     *     "team_id": "8d916b1c-510d-4894-a334-1c16a93344f5",
     *     "max_budget": 10
     * }'
     * ```
     */
    fun update(params: TeamUpdateParams): CompletableFuture<TeamUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TeamUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamUpdateResponse>

    /**
     * ```
     * curl --location --request GET 'http://0.0.0.0:4000/team/list'         --header 'Authorization: Bearer sk-1234'
     * ```
     *
     * Parameters:
     * - user_id: str - Optional. If passed will only return teams that the user_id is a member of.
     * - organization_id: str - Optional. If passed will only return teams that belong to the
     *   organization_id. Pass 'default_organization' to get all teams without organization_id.
     */
    fun list(): CompletableFuture<TeamListResponse> = list(TeamListParams.none())

    /** @see list */
    fun list(
        params: TeamListParams = TeamListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamListResponse>

    /** @see list */
    fun list(params: TeamListParams = TeamListParams.none()): CompletableFuture<TeamListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TeamListResponse> =
        list(TeamListParams.none(), requestOptions)

    /**
     * delete team and associated team keys
     *
     * Parameters:
     * - team_ids: List[str] - Required. List of team IDs to delete. Example:
     *   ["team-1234", "team-5678"]
     *
     * ```
     * curl --location 'http://0.0.0.0:4000/team/delete'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data-raw '{
     *     "team_ids": ["8d916b1c-510d-4894-a334-1c16a93344f5"]
     * }'
     * ```
     */
    fun delete(params: TeamDeleteParams): CompletableFuture<TeamDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TeamDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamDeleteResponse>

    /**
     * Add new members (either via user_email or user_id) to a team
     *
     * If user doesn't exist, new user row will also be added to User Table
     *
     * Only proxy_admin or admin of team, allowed to access this endpoint.
     *
     * ```
     *
     * curl -X POST 'http://0.0.0.0:4000/team/member_add'     -H 'Authorization: Bearer sk-1234'     -H 'Content-Type: application/json'     -d '{"team_id": "45e3e396-ee08-4a61-a88e-16b3ce7e0849", "member": {"role": "user", "user_id": "krrish247652@berri.ai"}}'
     *
     * ```
     */
    fun addMember(params: TeamAddMemberParams): CompletableFuture<TeamAddMemberResponse> =
        addMember(params, RequestOptions.none())

    /** @see addMember */
    fun addMember(
        params: TeamAddMemberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamAddMemberResponse>

    /**
     * Blocks all calls from keys with this team id.
     *
     * Parameters:
     * - team_id: str - Required. The unique identifier of the team to block.
     *
     * Example:
     * ```
     * curl --location 'http://0.0.0.0:4000/team/block'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "team_id": "team-1234"
     * }'
     * ```
     *
     * Returns:
     * - The updated team record with blocked=True
     */
    fun block(params: TeamBlockParams): CompletableFuture<TeamBlockResponse> =
        block(params, RequestOptions.none())

    /** @see block */
    fun block(
        params: TeamBlockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamBlockResponse>

    /** @see block */
    fun block(
        blockTeamRequest: BlockTeamRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamBlockResponse> =
        block(TeamBlockParams.builder().blockTeamRequest(blockTeamRequest).build(), requestOptions)

    /** @see block */
    fun block(blockTeamRequest: BlockTeamRequest): CompletableFuture<TeamBlockResponse> =
        block(blockTeamRequest, RequestOptions.none())

    /**
     * Disable all logging callbacks for a team
     *
     * Parameters:
     * - team_id (str, required): The unique identifier for the team
     *
     * Example curl:
     * ```
     * curl -X POST 'http://localhost:4000/team/dbe2f686-a686-4896-864a-4c3924458709/disable_logging'         -H 'Authorization: Bearer sk-1234'
     * ```
     */
    fun disableLogging(teamId: String): CompletableFuture<TeamDisableLoggingResponse> =
        disableLogging(teamId, TeamDisableLoggingParams.none())

    /** @see disableLogging */
    fun disableLogging(
        teamId: String,
        params: TeamDisableLoggingParams = TeamDisableLoggingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamDisableLoggingResponse> =
        disableLogging(params.toBuilder().teamId(teamId).build(), requestOptions)

    /** @see disableLogging */
    fun disableLogging(
        teamId: String,
        params: TeamDisableLoggingParams = TeamDisableLoggingParams.none(),
    ): CompletableFuture<TeamDisableLoggingResponse> =
        disableLogging(teamId, params, RequestOptions.none())

    /** @see disableLogging */
    fun disableLogging(
        params: TeamDisableLoggingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamDisableLoggingResponse>

    /** @see disableLogging */
    fun disableLogging(
        params: TeamDisableLoggingParams
    ): CompletableFuture<TeamDisableLoggingResponse> = disableLogging(params, RequestOptions.none())

    /** @see disableLogging */
    fun disableLogging(
        teamId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TeamDisableLoggingResponse> =
        disableLogging(teamId, TeamDisableLoggingParams.none(), requestOptions)

    /** List Available Teams */
    fun listAvailable(): CompletableFuture<TeamListAvailableResponse> =
        listAvailable(TeamListAvailableParams.none())

    /** @see listAvailable */
    fun listAvailable(
        params: TeamListAvailableParams = TeamListAvailableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamListAvailableResponse>

    /** @see listAvailable */
    fun listAvailable(
        params: TeamListAvailableParams = TeamListAvailableParams.none()
    ): CompletableFuture<TeamListAvailableResponse> = listAvailable(params, RequestOptions.none())

    /** @see listAvailable */
    fun listAvailable(
        requestOptions: RequestOptions
    ): CompletableFuture<TeamListAvailableResponse> =
        listAvailable(TeamListAvailableParams.none(), requestOptions)

    /**
     * [BETA]
     *
     * delete members (either via user_email or user_id) from a team
     *
     * If user doesn't exist, an exception will be raised
     *
     * ```
     * curl -X POST 'http://0.0.0.0:8000/team/member_delete'
     * -H 'Authorization: Bearer sk-1234'
     * -H 'Content-Type: application/json'
     * -d '{
     *     "team_id": "45e3e396-ee08-4a61-a88e-16b3ce7e0849",
     *     "user_id": "krrish247652@berri.ai"
     * }'
     * ```
     */
    fun removeMember(params: TeamRemoveMemberParams): CompletableFuture<TeamRemoveMemberResponse> =
        removeMember(params, RequestOptions.none())

    /** @see removeMember */
    fun removeMember(
        params: TeamRemoveMemberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamRemoveMemberResponse>

    /**
     * get info on team + related keys
     *
     * Parameters:
     * - team_id: str - Required. The unique identifier of the team to get info on.
     *
     * ```
     * curl --location 'http://localhost:4000/team/info?team_id=your_team_id_here'     --header 'Authorization: Bearer your_api_key_here'
     * ```
     */
    fun retrieveInfo(): CompletableFuture<TeamRetrieveInfoResponse> =
        retrieveInfo(TeamRetrieveInfoParams.none())

    /** @see retrieveInfo */
    fun retrieveInfo(
        params: TeamRetrieveInfoParams = TeamRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamRetrieveInfoResponse>

    /** @see retrieveInfo */
    fun retrieveInfo(
        params: TeamRetrieveInfoParams = TeamRetrieveInfoParams.none()
    ): CompletableFuture<TeamRetrieveInfoResponse> = retrieveInfo(params, RequestOptions.none())

    /** @see retrieveInfo */
    fun retrieveInfo(requestOptions: RequestOptions): CompletableFuture<TeamRetrieveInfoResponse> =
        retrieveInfo(TeamRetrieveInfoParams.none(), requestOptions)

    /**
     * Blocks all calls from keys with this team id.
     *
     * Parameters:
     * - team_id: str - Required. The unique identifier of the team to unblock.
     *
     * Example:
     * ```
     * curl --location 'http://0.0.0.0:4000/team/unblock'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "team_id": "team-1234"
     * }'
     * ```
     */
    fun unblock(params: TeamUnblockParams): CompletableFuture<TeamUnblockResponse> =
        unblock(params, RequestOptions.none())

    /** @see unblock */
    fun unblock(
        params: TeamUnblockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamUnblockResponse>

    /** @see unblock */
    fun unblock(
        blockTeamRequest: BlockTeamRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamUnblockResponse> =
        unblock(
            TeamUnblockParams.builder().blockTeamRequest(blockTeamRequest).build(),
            requestOptions,
        )

    /** @see unblock */
    fun unblock(blockTeamRequest: BlockTeamRequest): CompletableFuture<TeamUnblockResponse> =
        unblock(blockTeamRequest, RequestOptions.none())

    /**
     * [BETA]
     *
     * Update team member budgets and team member role
     */
    fun updateMember(params: TeamUpdateMemberParams): CompletableFuture<TeamUpdateMemberResponse> =
        updateMember(params, RequestOptions.none())

    /** @see updateMember */
    fun updateMember(
        params: TeamUpdateMemberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TeamUpdateMemberResponse>

    /** A view of [TeamServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TeamServiceAsync.WithRawResponse

        fun model(): ModelServiceAsync.WithRawResponse

        fun callback(): CallbackServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /team/new`, but is otherwise the same as
         * [TeamServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<TeamCreateResponse>> =
            create(TeamCreateParams.none())

        /** @see create */
        fun create(
            params: TeamCreateParams = TeamCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamCreateResponse>>

        /** @see create */
        fun create(
            params: TeamCreateParams = TeamCreateParams.none()
        ): CompletableFuture<HttpResponseFor<TeamCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TeamCreateResponse>> =
            create(TeamCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /team/update`, but is otherwise the same as
         * [TeamServiceAsync.update].
         */
        fun update(
            params: TeamUpdateParams
        ): CompletableFuture<HttpResponseFor<TeamUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TeamUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /team/list`, but is otherwise the same as
         * [TeamServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TeamListResponse>> =
            list(TeamListParams.none())

        /** @see list */
        fun list(
            params: TeamListParams = TeamListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamListResponse>>

        /** @see list */
        fun list(
            params: TeamListParams = TeamListParams.none()
        ): CompletableFuture<HttpResponseFor<TeamListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TeamListResponse>> =
            list(TeamListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /team/delete`, but is otherwise the same as
         * [TeamServiceAsync.delete].
         */
        fun delete(
            params: TeamDeleteParams
        ): CompletableFuture<HttpResponseFor<TeamDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TeamDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /team/member_add`, but is otherwise the same as
         * [TeamServiceAsync.addMember].
         */
        fun addMember(
            params: TeamAddMemberParams
        ): CompletableFuture<HttpResponseFor<TeamAddMemberResponse>> =
            addMember(params, RequestOptions.none())

        /** @see addMember */
        fun addMember(
            params: TeamAddMemberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamAddMemberResponse>>

        /**
         * Returns a raw HTTP response for `post /team/block`, but is otherwise the same as
         * [TeamServiceAsync.block].
         */
        fun block(params: TeamBlockParams): CompletableFuture<HttpResponseFor<TeamBlockResponse>> =
            block(params, RequestOptions.none())

        /** @see block */
        fun block(
            params: TeamBlockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamBlockResponse>>

        /** @see block */
        fun block(
            blockTeamRequest: BlockTeamRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamBlockResponse>> =
            block(
                TeamBlockParams.builder().blockTeamRequest(blockTeamRequest).build(),
                requestOptions,
            )

        /** @see block */
        fun block(
            blockTeamRequest: BlockTeamRequest
        ): CompletableFuture<HttpResponseFor<TeamBlockResponse>> =
            block(blockTeamRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /team/{team_id}/disable_logging`, but is otherwise
         * the same as [TeamServiceAsync.disableLogging].
         */
        fun disableLogging(
            teamId: String
        ): CompletableFuture<HttpResponseFor<TeamDisableLoggingResponse>> =
            disableLogging(teamId, TeamDisableLoggingParams.none())

        /** @see disableLogging */
        fun disableLogging(
            teamId: String,
            params: TeamDisableLoggingParams = TeamDisableLoggingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamDisableLoggingResponse>> =
            disableLogging(params.toBuilder().teamId(teamId).build(), requestOptions)

        /** @see disableLogging */
        fun disableLogging(
            teamId: String,
            params: TeamDisableLoggingParams = TeamDisableLoggingParams.none(),
        ): CompletableFuture<HttpResponseFor<TeamDisableLoggingResponse>> =
            disableLogging(teamId, params, RequestOptions.none())

        /** @see disableLogging */
        fun disableLogging(
            params: TeamDisableLoggingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamDisableLoggingResponse>>

        /** @see disableLogging */
        fun disableLogging(
            params: TeamDisableLoggingParams
        ): CompletableFuture<HttpResponseFor<TeamDisableLoggingResponse>> =
            disableLogging(params, RequestOptions.none())

        /** @see disableLogging */
        fun disableLogging(
            teamId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TeamDisableLoggingResponse>> =
            disableLogging(teamId, TeamDisableLoggingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /team/available`, but is otherwise the same as
         * [TeamServiceAsync.listAvailable].
         */
        fun listAvailable(): CompletableFuture<HttpResponseFor<TeamListAvailableResponse>> =
            listAvailable(TeamListAvailableParams.none())

        /** @see listAvailable */
        fun listAvailable(
            params: TeamListAvailableParams = TeamListAvailableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamListAvailableResponse>>

        /** @see listAvailable */
        fun listAvailable(
            params: TeamListAvailableParams = TeamListAvailableParams.none()
        ): CompletableFuture<HttpResponseFor<TeamListAvailableResponse>> =
            listAvailable(params, RequestOptions.none())

        /** @see listAvailable */
        fun listAvailable(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TeamListAvailableResponse>> =
            listAvailable(TeamListAvailableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /team/member_delete`, but is otherwise the same as
         * [TeamServiceAsync.removeMember].
         */
        fun removeMember(
            params: TeamRemoveMemberParams
        ): CompletableFuture<HttpResponseFor<TeamRemoveMemberResponse>> =
            removeMember(params, RequestOptions.none())

        /** @see removeMember */
        fun removeMember(
            params: TeamRemoveMemberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamRemoveMemberResponse>>

        /**
         * Returns a raw HTTP response for `get /team/info`, but is otherwise the same as
         * [TeamServiceAsync.retrieveInfo].
         */
        fun retrieveInfo(): CompletableFuture<HttpResponseFor<TeamRetrieveInfoResponse>> =
            retrieveInfo(TeamRetrieveInfoParams.none())

        /** @see retrieveInfo */
        fun retrieveInfo(
            params: TeamRetrieveInfoParams = TeamRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamRetrieveInfoResponse>>

        /** @see retrieveInfo */
        fun retrieveInfo(
            params: TeamRetrieveInfoParams = TeamRetrieveInfoParams.none()
        ): CompletableFuture<HttpResponseFor<TeamRetrieveInfoResponse>> =
            retrieveInfo(params, RequestOptions.none())

        /** @see retrieveInfo */
        fun retrieveInfo(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TeamRetrieveInfoResponse>> =
            retrieveInfo(TeamRetrieveInfoParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /team/unblock`, but is otherwise the same as
         * [TeamServiceAsync.unblock].
         */
        fun unblock(
            params: TeamUnblockParams
        ): CompletableFuture<HttpResponseFor<TeamUnblockResponse>> =
            unblock(params, RequestOptions.none())

        /** @see unblock */
        fun unblock(
            params: TeamUnblockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamUnblockResponse>>

        /** @see unblock */
        fun unblock(
            blockTeamRequest: BlockTeamRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamUnblockResponse>> =
            unblock(
                TeamUnblockParams.builder().blockTeamRequest(blockTeamRequest).build(),
                requestOptions,
            )

        /** @see unblock */
        fun unblock(
            blockTeamRequest: BlockTeamRequest
        ): CompletableFuture<HttpResponseFor<TeamUnblockResponse>> =
            unblock(blockTeamRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /team/member_update`, but is otherwise the same as
         * [TeamServiceAsync.updateMember].
         */
        fun updateMember(
            params: TeamUpdateMemberParams
        ): CompletableFuture<HttpResponseFor<TeamUpdateMemberResponse>> =
            updateMember(params, RequestOptions.none())

        /** @see updateMember */
        fun updateMember(
            params: TeamUpdateMemberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TeamUpdateMemberResponse>>
    }
}
