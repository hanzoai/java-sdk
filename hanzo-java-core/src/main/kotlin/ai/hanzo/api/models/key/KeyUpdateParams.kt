// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.Params
import ai.hanzo.api.core.checkKnown
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update an existing API key's parameters.
 *
 * Parameters:
 * - key: str - The key to update
 * - key_alias: Optional[str] - User-friendly key alias
 * - user_id: Optional[str] - User ID associated with key
 * - team_id: Optional[str] - Team ID associated with key
 * - budget_id: Optional[str] - The budget id associated with the key. Created by calling
 *   `/budget/new`.
 * - models: Optional[list] - Model_name's a user is allowed to call
 * - tags: Optional[List[str]] - Tags for organizing keys (Enterprise only)
 * - prompts: Optional[List[str]] - List of prompts that the key is allowed to use.
 * - enforced_params: Optional[List[str]] - List of enforced params for the key (Enterprise only).
 *   [Docs](https://docs.litellm.ai/docs/proxy/enterprise#enforce-required-params-for-llm-requests)
 * - spend: Optional[float] - Amount spent by key
 * - max_budget: Optional[float] - Max budget for key
 * - model_max_budget: Optional[Dict[str, BudgetConfig]] - Model-specific budgets {"gpt-4":
 *   {"budget_limit": 0.0005, "time_period": "30d"}}
 * - budget_duration: Optional[str] - Budget reset period ("30d", "1h", etc.)
 * - soft_budget: Optional[float] - [TODO] Soft budget limit (warning vs. hard stop). Will trigger a
 *   slack alert when this soft budget is reached.
 * - max_parallel_requests: Optional[int] - Rate limit for parallel requests
 * - metadata: Optional[dict] - Metadata for key. Example {"team": "core-infra", "app": "app2"}
 * - tpm_limit: Optional[int] - Tokens per minute limit
 * - rpm_limit: Optional[int] - Requests per minute limit
 * - model_rpm_limit: Optional[dict] - Model-specific RPM limits {"gpt-4": 100, "claude-v1": 200}
 * - model_tpm_limit: Optional[dict] - Model-specific TPM limits {"gpt-4": 100000, "claude-v1":
 *   200000}
 * - tpm_limit_type: Optional[str] - TPM rate limit type - "best_effort_throughput",
 *   "guaranteed_throughput", or "dynamic"
 * - rpm_limit_type: Optional[str] - RPM rate limit type - "best_effort_throughput",
 *   "guaranteed_throughput", or "dynamic"
 * - allowed_cache_controls: Optional[list] - List of allowed cache control values
 * - duration: Optional[str] - Key validity duration ("30d", "1h", etc.) or "-1" to never expire
 * - permissions: Optional[dict] - Key-specific permissions
 * - send_invite_email: Optional[bool] - Send invite email to user_id
 * - guardrails: Optional[List[str]] - List of active guardrails for the key
 * - disable_global_guardrails: Optional[bool] - Whether to disable global guardrails for the key.
 * - prompts: Optional[List[str]] - List of prompts that the key is allowed to use.
 * - blocked: Optional[bool] - Whether the key is blocked
 * - aliases: Optional[dict] - Model aliases for the
 *   key - [Docs](https://litellm.vercel.app/docs/proxy/virtual_keys#model-aliases)
 * - config: Optional[dict] - [DEPRECATED PARAM] Key-specific config.
 * - temp_budget_increase: Optional[float] - Temporary budget increase for the key (Enterprise
 *   only).
 * - temp_budget_expiry: Optional[str] - Expiry time for the temporary budget increase (Enterprise
 *   only).
 * - allowed_routes: Optional[list] - List of allowed routes for the key. Store the actual route or
 *   store a wildcard pattern for a set of routes.
 *   Example - ["/chat/completions", "/embeddings", "/keys&#47;*"]
 * - allowed_passthrough_routes: Optional[list] - List of allowed pass through routes for the key.
 *   Store the actual route or store a wildcard pattern for a set of routes.
 *   Example - ["/my-custom-endpoint"]. Use this instead of allowed_routes, if you just want to
 *   specify which pass through routes the key can access, without specifying the routes. If
 *   allowed_routes is specified, allowed_passthrough_routes is ignored.
 * - prompts: Optional[List[str]] - List of allowed prompts for the key. If specified, the key will
 *   only be able to use these specific prompts.
 * - object_permission: Optional[LiteLLM_ObjectPermissionBase] - key-specific object permission.
 *   Example - {"vector_stores": ["vector_store_1", "vector_store_2"], "agents":
 *   ["agent_1", "agent_2"], "agent_access_groups": ["dev_group"]}. IF null or {} then no object
 *   permission.
 * - auto_rotate: Optional[bool] - Whether this key should be automatically rotated
 * - rotation_interval: Optional[str] - How often to rotate this key (e.g., '30d', '90d'). Required
 *   if auto_rotate=True
 * - allowed_vector_store_indexes: Optional[List[dict]] - List of allowed vector store indexes for
 *   the key. Example - [{"index_name": "my-index", "index_permissions": ["write", "read"]}]. If
 *   specified, the key will only be able to use these specific vector store indexes. Create index,
 *   using `/v1/indexes` endpoint.
 * - router_settings: Optional[UpdateRouterConfig] - key-specific router settings. Example -
 *   {"model_group_retry_policy": {"max_retries": 5}}. IF null or {} then no router settings.
 *
 * Example:
 * ```bash
 * curl --location 'http://0.0.0.0:4000/key/update'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
 *     "key": "sk-1234",
 *     "key_alias": "my-key",
 *     "user_id": "user-1234",
 *     "team_id": "team-1234",
 *     "max_budget": 100,
 *     "metadata": {"any_key": "any-val"},
 * }'
 * ```
 */
class KeyUpdateParams
private constructor(
    private val litellmChangedBy: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The litellm-changed-by header enables tracking of actions performed by authorized users on
     * behalf of other users, providing an audit trail for accountability
     */
    fun litellmChangedBy(): Optional<String> = Optional.ofNullable(litellmChangedBy)

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun key(): String = body.key()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aliases(): Optional<Aliases> = body.aliases()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedCacheControls(): Optional<List<JsonValue>> = body.allowedCacheControls()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedPassthroughRoutes(): Optional<List<JsonValue>> = body.allowedPassthroughRoutes()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedRoutes(): Optional<List<JsonValue>> = body.allowedRoutes()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedVectorStoreIndexes(): Optional<List<AllowedVectorStoreIndex>> =
        body.allowedVectorStoreIndexes()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoRotate(): Optional<Boolean> = body.autoRotate()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blocked(): Optional<Boolean> = body.blocked()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetDuration(): Optional<String> = body.budgetDuration()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetId(): Optional<String> = body.budgetId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun config(): Optional<Config> = body.config()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun duration(): Optional<String> = body.duration()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enforcedParams(): Optional<List<String>> = body.enforcedParams()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun guardrails(): Optional<List<String>> = body.guardrails()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keyAlias(): Optional<String> = body.keyAlias()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudget(): Optional<Double> = body.maxBudget()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxParallelRequests(): Optional<Long> = body.maxParallelRequests()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelMaxBudget(): Optional<ModelMaxBudget> = body.modelMaxBudget()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelRpmLimit(): Optional<ModelRpmLimit> = body.modelRpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelTpmLimit(): Optional<ModelTpmLimit> = body.modelTpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun models(): Optional<List<JsonValue>> = body.models()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectPermission(): Optional<ObjectPermission> = body.objectPermission()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissions(): Optional<Permissions> = body.permissions()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prompts(): Optional<List<String>> = body.prompts()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rotationInterval(): Optional<String> = body.rotationInterval()

    /**
     * Set of params that you can modify via `router.update_settings()`.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routerSettings(): Optional<RouterSettings> = body.routerSettings()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rpmLimit(): Optional<Long> = body.rpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rpmLimitType(): Optional<RpmLimitType> = body.rpmLimitType()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spend(): Optional<Double> = body.spend()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamId(): Optional<String> = body.teamId()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tempBudgetExpiry(): Optional<OffsetDateTime> = body.tempBudgetExpiry()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tempBudgetIncrease(): Optional<Double> = body.tempBudgetIncrease()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Optional<Long> = body.tpmLimit()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimitType(): Optional<TpmLimitType> = body.tpmLimitType()

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = body.userId()

    /**
     * Returns the raw JSON value of [key].
     *
     * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _key(): JsonField<String> = body._key()

    /**
     * Returns the raw JSON value of [aliases].
     *
     * Unlike [aliases], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _aliases(): JsonField<Aliases> = body._aliases()

    /**
     * Returns the raw JSON value of [allowedCacheControls].
     *
     * Unlike [allowedCacheControls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allowedCacheControls(): JsonField<List<JsonValue>> = body._allowedCacheControls()

    /**
     * Returns the raw JSON value of [allowedPassthroughRoutes].
     *
     * Unlike [allowedPassthroughRoutes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _allowedPassthroughRoutes(): JsonField<List<JsonValue>> = body._allowedPassthroughRoutes()

    /**
     * Returns the raw JSON value of [allowedRoutes].
     *
     * Unlike [allowedRoutes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _allowedRoutes(): JsonField<List<JsonValue>> = body._allowedRoutes()

    /**
     * Returns the raw JSON value of [allowedVectorStoreIndexes].
     *
     * Unlike [allowedVectorStoreIndexes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _allowedVectorStoreIndexes(): JsonField<List<AllowedVectorStoreIndex>> =
        body._allowedVectorStoreIndexes()

    /**
     * Returns the raw JSON value of [autoRotate].
     *
     * Unlike [autoRotate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoRotate(): JsonField<Boolean> = body._autoRotate()

    /**
     * Returns the raw JSON value of [blocked].
     *
     * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _blocked(): JsonField<Boolean> = body._blocked()

    /**
     * Returns the raw JSON value of [budgetDuration].
     *
     * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _budgetDuration(): JsonField<String> = body._budgetDuration()

    /**
     * Returns the raw JSON value of [budgetId].
     *
     * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _budgetId(): JsonField<String> = body._budgetId()

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _config(): JsonField<Config> = body._config()

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _duration(): JsonField<String> = body._duration()

    /**
     * Returns the raw JSON value of [enforcedParams].
     *
     * Unlike [enforcedParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enforcedParams(): JsonField<List<String>> = body._enforcedParams()

    /**
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _guardrails(): JsonField<List<String>> = body._guardrails()

    /**
     * Returns the raw JSON value of [keyAlias].
     *
     * Unlike [keyAlias], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _keyAlias(): JsonField<String> = body._keyAlias()

    /**
     * Returns the raw JSON value of [maxBudget].
     *
     * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxBudget(): JsonField<Double> = body._maxBudget()

    /**
     * Returns the raw JSON value of [maxParallelRequests].
     *
     * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _maxParallelRequests(): JsonField<Long> = body._maxParallelRequests()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [modelMaxBudget].
     *
     * Unlike [modelMaxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelMaxBudget(): JsonField<ModelMaxBudget> = body._modelMaxBudget()

    /**
     * Returns the raw JSON value of [modelRpmLimit].
     *
     * Unlike [modelRpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelRpmLimit(): JsonField<ModelRpmLimit> = body._modelRpmLimit()

    /**
     * Returns the raw JSON value of [modelTpmLimit].
     *
     * Unlike [modelTpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelTpmLimit(): JsonField<ModelTpmLimit> = body._modelTpmLimit()

    /**
     * Returns the raw JSON value of [models].
     *
     * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _models(): JsonField<List<JsonValue>> = body._models()

    /**
     * Returns the raw JSON value of [objectPermission].
     *
     * Unlike [objectPermission], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _objectPermission(): JsonField<ObjectPermission> = body._objectPermission()

    /**
     * Returns the raw JSON value of [permissions].
     *
     * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _permissions(): JsonField<Permissions> = body._permissions()

    /**
     * Returns the raw JSON value of [prompts].
     *
     * Unlike [prompts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prompts(): JsonField<List<String>> = body._prompts()

    /**
     * Returns the raw JSON value of [rotationInterval].
     *
     * Unlike [rotationInterval], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _rotationInterval(): JsonField<String> = body._rotationInterval()

    /**
     * Returns the raw JSON value of [routerSettings].
     *
     * Unlike [routerSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _routerSettings(): JsonField<RouterSettings> = body._routerSettings()

    /**
     * Returns the raw JSON value of [rpmLimit].
     *
     * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rpmLimit(): JsonField<Long> = body._rpmLimit()

    /**
     * Returns the raw JSON value of [rpmLimitType].
     *
     * Unlike [rpmLimitType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rpmLimitType(): JsonField<RpmLimitType> = body._rpmLimitType()

    /**
     * Returns the raw JSON value of [spend].
     *
     * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _spend(): JsonField<Double> = body._spend()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _teamId(): JsonField<String> = body._teamId()

    /**
     * Returns the raw JSON value of [tempBudgetExpiry].
     *
     * Unlike [tempBudgetExpiry], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _tempBudgetExpiry(): JsonField<OffsetDateTime> = body._tempBudgetExpiry()

    /**
     * Returns the raw JSON value of [tempBudgetIncrease].
     *
     * Unlike [tempBudgetIncrease], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _tempBudgetIncrease(): JsonField<Double> = body._tempBudgetIncrease()

    /**
     * Returns the raw JSON value of [tpmLimit].
     *
     * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tpmLimit(): JsonField<Long> = body._tpmLimit()

    /**
     * Returns the raw JSON value of [tpmLimitType].
     *
     * Unlike [tpmLimitType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tpmLimitType(): JsonField<TpmLimitType> = body._tpmLimitType()

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userId(): JsonField<String> = body._userId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [KeyUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [KeyUpdateParams]. */
    class Builder internal constructor() {

        private var litellmChangedBy: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(keyUpdateParams: KeyUpdateParams) = apply {
            litellmChangedBy = keyUpdateParams.litellmChangedBy
            body = keyUpdateParams.body.toBuilder()
            additionalHeaders = keyUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = keyUpdateParams.additionalQueryParams.toBuilder()
        }

        /**
         * The litellm-changed-by header enables tracking of actions performed by authorized users
         * on behalf of other users, providing an audit trail for accountability
         */
        fun litellmChangedBy(litellmChangedBy: String?) = apply {
            this.litellmChangedBy = litellmChangedBy
        }

        /** Alias for calling [Builder.litellmChangedBy] with `litellmChangedBy.orElse(null)`. */
        fun litellmChangedBy(litellmChangedBy: Optional<String>) =
            litellmChangedBy(litellmChangedBy.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [key]
         * - [aliases]
         * - [allowedCacheControls]
         * - [allowedPassthroughRoutes]
         * - [allowedRoutes]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun key(key: String) = apply { body.key(key) }

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<String>) = apply { body.key(key) }

        fun aliases(aliases: Aliases?) = apply { body.aliases(aliases) }

        /** Alias for calling [Builder.aliases] with `aliases.orElse(null)`. */
        fun aliases(aliases: Optional<Aliases>) = aliases(aliases.getOrNull())

        /**
         * Sets [Builder.aliases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aliases] with a well-typed [Aliases] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun aliases(aliases: JsonField<Aliases>) = apply { body.aliases(aliases) }

        fun allowedCacheControls(allowedCacheControls: List<JsonValue>?) = apply {
            body.allowedCacheControls(allowedCacheControls)
        }

        /**
         * Alias for calling [Builder.allowedCacheControls] with
         * `allowedCacheControls.orElse(null)`.
         */
        fun allowedCacheControls(allowedCacheControls: Optional<List<JsonValue>>) =
            allowedCacheControls(allowedCacheControls.getOrNull())

        /**
         * Sets [Builder.allowedCacheControls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedCacheControls] with a well-typed
         * `List<JsonValue>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun allowedCacheControls(allowedCacheControls: JsonField<List<JsonValue>>) = apply {
            body.allowedCacheControls(allowedCacheControls)
        }

        /**
         * Adds a single [JsonValue] to [allowedCacheControls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedCacheControl(allowedCacheControl: JsonValue) = apply {
            body.addAllowedCacheControl(allowedCacheControl)
        }

        fun allowedPassthroughRoutes(allowedPassthroughRoutes: List<JsonValue>?) = apply {
            body.allowedPassthroughRoutes(allowedPassthroughRoutes)
        }

        /**
         * Alias for calling [Builder.allowedPassthroughRoutes] with
         * `allowedPassthroughRoutes.orElse(null)`.
         */
        fun allowedPassthroughRoutes(allowedPassthroughRoutes: Optional<List<JsonValue>>) =
            allowedPassthroughRoutes(allowedPassthroughRoutes.getOrNull())

        /**
         * Sets [Builder.allowedPassthroughRoutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedPassthroughRoutes] with a well-typed
         * `List<JsonValue>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun allowedPassthroughRoutes(allowedPassthroughRoutes: JsonField<List<JsonValue>>) = apply {
            body.allowedPassthroughRoutes(allowedPassthroughRoutes)
        }

        /**
         * Adds a single [JsonValue] to [allowedPassthroughRoutes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedPassthroughRoute(allowedPassthroughRoute: JsonValue) = apply {
            body.addAllowedPassthroughRoute(allowedPassthroughRoute)
        }

        fun allowedRoutes(allowedRoutes: List<JsonValue>?) = apply {
            body.allowedRoutes(allowedRoutes)
        }

        /** Alias for calling [Builder.allowedRoutes] with `allowedRoutes.orElse(null)`. */
        fun allowedRoutes(allowedRoutes: Optional<List<JsonValue>>) =
            allowedRoutes(allowedRoutes.getOrNull())

        /**
         * Sets [Builder.allowedRoutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedRoutes] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowedRoutes(allowedRoutes: JsonField<List<JsonValue>>) = apply {
            body.allowedRoutes(allowedRoutes)
        }

        /**
         * Adds a single [JsonValue] to [allowedRoutes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedRoute(allowedRoute: JsonValue) = apply { body.addAllowedRoute(allowedRoute) }

        fun allowedVectorStoreIndexes(allowedVectorStoreIndexes: List<AllowedVectorStoreIndex>?) =
            apply {
                body.allowedVectorStoreIndexes(allowedVectorStoreIndexes)
            }

        /**
         * Alias for calling [Builder.allowedVectorStoreIndexes] with
         * `allowedVectorStoreIndexes.orElse(null)`.
         */
        fun allowedVectorStoreIndexes(
            allowedVectorStoreIndexes: Optional<List<AllowedVectorStoreIndex>>
        ) = allowedVectorStoreIndexes(allowedVectorStoreIndexes.getOrNull())

        /**
         * Sets [Builder.allowedVectorStoreIndexes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedVectorStoreIndexes] with a well-typed
         * `List<AllowedVectorStoreIndex>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun allowedVectorStoreIndexes(
            allowedVectorStoreIndexes: JsonField<List<AllowedVectorStoreIndex>>
        ) = apply { body.allowedVectorStoreIndexes(allowedVectorStoreIndexes) }

        /**
         * Adds a single [AllowedVectorStoreIndex] to [allowedVectorStoreIndexes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedVectorStoreIndex(allowedVectorStoreIndex: AllowedVectorStoreIndex) = apply {
            body.addAllowedVectorStoreIndex(allowedVectorStoreIndex)
        }

        fun autoRotate(autoRotate: Boolean?) = apply { body.autoRotate(autoRotate) }

        /**
         * Alias for [Builder.autoRotate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun autoRotate(autoRotate: Boolean) = autoRotate(autoRotate as Boolean?)

        /** Alias for calling [Builder.autoRotate] with `autoRotate.orElse(null)`. */
        fun autoRotate(autoRotate: Optional<Boolean>) = autoRotate(autoRotate.getOrNull())

        /**
         * Sets [Builder.autoRotate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoRotate] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoRotate(autoRotate: JsonField<Boolean>) = apply { body.autoRotate(autoRotate) }

        fun blocked(blocked: Boolean?) = apply { body.blocked(blocked) }

        /**
         * Alias for [Builder.blocked].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun blocked(blocked: Boolean) = blocked(blocked as Boolean?)

        /** Alias for calling [Builder.blocked] with `blocked.orElse(null)`. */
        fun blocked(blocked: Optional<Boolean>) = blocked(blocked.getOrNull())

        /**
         * Sets [Builder.blocked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun blocked(blocked: JsonField<Boolean>) = apply { body.blocked(blocked) }

        fun budgetDuration(budgetDuration: String?) = apply { body.budgetDuration(budgetDuration) }

        /** Alias for calling [Builder.budgetDuration] with `budgetDuration.orElse(null)`. */
        fun budgetDuration(budgetDuration: Optional<String>) =
            budgetDuration(budgetDuration.getOrNull())

        /**
         * Sets [Builder.budgetDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetDuration] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun budgetDuration(budgetDuration: JsonField<String>) = apply {
            body.budgetDuration(budgetDuration)
        }

        fun budgetId(budgetId: String?) = apply { body.budgetId(budgetId) }

        /** Alias for calling [Builder.budgetId] with `budgetId.orElse(null)`. */
        fun budgetId(budgetId: Optional<String>) = budgetId(budgetId.getOrNull())

        /**
         * Sets [Builder.budgetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun budgetId(budgetId: JsonField<String>) = apply { body.budgetId(budgetId) }

        fun config(config: Config?) = apply { body.config(config) }

        /** Alias for calling [Builder.config] with `config.orElse(null)`. */
        fun config(config: Optional<Config>) = config(config.getOrNull())

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [Config] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<Config>) = apply { body.config(config) }

        fun duration(duration: String?) = apply { body.duration(duration) }

        /** Alias for calling [Builder.duration] with `duration.orElse(null)`. */
        fun duration(duration: Optional<String>) = duration(duration.getOrNull())

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<String>) = apply { body.duration(duration) }

        fun enforcedParams(enforcedParams: List<String>?) = apply {
            body.enforcedParams(enforcedParams)
        }

        /** Alias for calling [Builder.enforcedParams] with `enforcedParams.orElse(null)`. */
        fun enforcedParams(enforcedParams: Optional<List<String>>) =
            enforcedParams(enforcedParams.getOrNull())

        /**
         * Sets [Builder.enforcedParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enforcedParams] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enforcedParams(enforcedParams: JsonField<List<String>>) = apply {
            body.enforcedParams(enforcedParams)
        }

        /**
         * Adds a single [String] to [enforcedParams].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnforcedParam(enforcedParam: String) = apply { body.addEnforcedParam(enforcedParam) }

        fun guardrails(guardrails: List<String>?) = apply { body.guardrails(guardrails) }

        /** Alias for calling [Builder.guardrails] with `guardrails.orElse(null)`. */
        fun guardrails(guardrails: Optional<List<String>>) = guardrails(guardrails.getOrNull())

        /**
         * Sets [Builder.guardrails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guardrails] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guardrails(guardrails: JsonField<List<String>>) = apply { body.guardrails(guardrails) }

        /**
         * Adds a single [String] to [guardrails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGuardrail(guardrail: String) = apply { body.addGuardrail(guardrail) }

        fun keyAlias(keyAlias: String?) = apply { body.keyAlias(keyAlias) }

        /** Alias for calling [Builder.keyAlias] with `keyAlias.orElse(null)`. */
        fun keyAlias(keyAlias: Optional<String>) = keyAlias(keyAlias.getOrNull())

        /**
         * Sets [Builder.keyAlias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keyAlias] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keyAlias(keyAlias: JsonField<String>) = apply { body.keyAlias(keyAlias) }

        fun maxBudget(maxBudget: Double?) = apply { body.maxBudget(maxBudget) }

        /**
         * Alias for [Builder.maxBudget].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

        /** Alias for calling [Builder.maxBudget] with `maxBudget.orElse(null)`. */
        fun maxBudget(maxBudget: Optional<Double>) = maxBudget(maxBudget.getOrNull())

        /**
         * Sets [Builder.maxBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxBudget] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxBudget(maxBudget: JsonField<Double>) = apply { body.maxBudget(maxBudget) }

        fun maxParallelRequests(maxParallelRequests: Long?) = apply {
            body.maxParallelRequests(maxParallelRequests)
        }

        /**
         * Alias for [Builder.maxParallelRequests].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxParallelRequests(maxParallelRequests: Long) =
            maxParallelRequests(maxParallelRequests as Long?)

        /**
         * Alias for calling [Builder.maxParallelRequests] with `maxParallelRequests.orElse(null)`.
         */
        fun maxParallelRequests(maxParallelRequests: Optional<Long>) =
            maxParallelRequests(maxParallelRequests.getOrNull())

        /**
         * Sets [Builder.maxParallelRequests] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxParallelRequests] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
            body.maxParallelRequests(maxParallelRequests)
        }

        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun modelMaxBudget(modelMaxBudget: ModelMaxBudget?) = apply {
            body.modelMaxBudget(modelMaxBudget)
        }

        /** Alias for calling [Builder.modelMaxBudget] with `modelMaxBudget.orElse(null)`. */
        fun modelMaxBudget(modelMaxBudget: Optional<ModelMaxBudget>) =
            modelMaxBudget(modelMaxBudget.getOrNull())

        /**
         * Sets [Builder.modelMaxBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelMaxBudget] with a well-typed [ModelMaxBudget] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelMaxBudget(modelMaxBudget: JsonField<ModelMaxBudget>) = apply {
            body.modelMaxBudget(modelMaxBudget)
        }

        fun modelRpmLimit(modelRpmLimit: ModelRpmLimit?) = apply {
            body.modelRpmLimit(modelRpmLimit)
        }

        /** Alias for calling [Builder.modelRpmLimit] with `modelRpmLimit.orElse(null)`. */
        fun modelRpmLimit(modelRpmLimit: Optional<ModelRpmLimit>) =
            modelRpmLimit(modelRpmLimit.getOrNull())

        /**
         * Sets [Builder.modelRpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelRpmLimit] with a well-typed [ModelRpmLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelRpmLimit(modelRpmLimit: JsonField<ModelRpmLimit>) = apply {
            body.modelRpmLimit(modelRpmLimit)
        }

        fun modelTpmLimit(modelTpmLimit: ModelTpmLimit?) = apply {
            body.modelTpmLimit(modelTpmLimit)
        }

        /** Alias for calling [Builder.modelTpmLimit] with `modelTpmLimit.orElse(null)`. */
        fun modelTpmLimit(modelTpmLimit: Optional<ModelTpmLimit>) =
            modelTpmLimit(modelTpmLimit.getOrNull())

        /**
         * Sets [Builder.modelTpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelTpmLimit] with a well-typed [ModelTpmLimit] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelTpmLimit(modelTpmLimit: JsonField<ModelTpmLimit>) = apply {
            body.modelTpmLimit(modelTpmLimit)
        }

        fun models(models: List<JsonValue>?) = apply { body.models(models) }

        /** Alias for calling [Builder.models] with `models.orElse(null)`. */
        fun models(models: Optional<List<JsonValue>>) = models(models.getOrNull())

        /**
         * Sets [Builder.models] to an arbitrary JSON value.
         *
         * You should usually call [Builder.models] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun models(models: JsonField<List<JsonValue>>) = apply { body.models(models) }

        /**
         * Adds a single [JsonValue] to [models].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModel(model: JsonValue) = apply { body.addModel(model) }

        fun objectPermission(objectPermission: ObjectPermission?) = apply {
            body.objectPermission(objectPermission)
        }

        /** Alias for calling [Builder.objectPermission] with `objectPermission.orElse(null)`. */
        fun objectPermission(objectPermission: Optional<ObjectPermission>) =
            objectPermission(objectPermission.getOrNull())

        /**
         * Sets [Builder.objectPermission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectPermission] with a well-typed [ObjectPermission]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun objectPermission(objectPermission: JsonField<ObjectPermission>) = apply {
            body.objectPermission(objectPermission)
        }

        fun permissions(permissions: Permissions?) = apply { body.permissions(permissions) }

        /** Alias for calling [Builder.permissions] with `permissions.orElse(null)`. */
        fun permissions(permissions: Optional<Permissions>) = permissions(permissions.getOrNull())

        /**
         * Sets [Builder.permissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissions] with a well-typed [Permissions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permissions(permissions: JsonField<Permissions>) = apply {
            body.permissions(permissions)
        }

        fun prompts(prompts: List<String>?) = apply { body.prompts(prompts) }

        /** Alias for calling [Builder.prompts] with `prompts.orElse(null)`. */
        fun prompts(prompts: Optional<List<String>>) = prompts(prompts.getOrNull())

        /**
         * Sets [Builder.prompts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompts] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prompts(prompts: JsonField<List<String>>) = apply { body.prompts(prompts) }

        /**
         * Adds a single [String] to [prompts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrompt(prompt: String) = apply { body.addPrompt(prompt) }

        fun rotationInterval(rotationInterval: String?) = apply {
            body.rotationInterval(rotationInterval)
        }

        /** Alias for calling [Builder.rotationInterval] with `rotationInterval.orElse(null)`. */
        fun rotationInterval(rotationInterval: Optional<String>) =
            rotationInterval(rotationInterval.getOrNull())

        /**
         * Sets [Builder.rotationInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rotationInterval] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rotationInterval(rotationInterval: JsonField<String>) = apply {
            body.rotationInterval(rotationInterval)
        }

        /** Set of params that you can modify via `router.update_settings()`. */
        fun routerSettings(routerSettings: RouterSettings?) = apply {
            body.routerSettings(routerSettings)
        }

        /** Alias for calling [Builder.routerSettings] with `routerSettings.orElse(null)`. */
        fun routerSettings(routerSettings: Optional<RouterSettings>) =
            routerSettings(routerSettings.getOrNull())

        /**
         * Sets [Builder.routerSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routerSettings] with a well-typed [RouterSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun routerSettings(routerSettings: JsonField<RouterSettings>) = apply {
            body.routerSettings(routerSettings)
        }

        fun rpmLimit(rpmLimit: Long?) = apply { body.rpmLimit(rpmLimit) }

        /**
         * Alias for [Builder.rpmLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun rpmLimit(rpmLimit: Long) = rpmLimit(rpmLimit as Long?)

        /** Alias for calling [Builder.rpmLimit] with `rpmLimit.orElse(null)`. */
        fun rpmLimit(rpmLimit: Optional<Long>) = rpmLimit(rpmLimit.getOrNull())

        /**
         * Sets [Builder.rpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmLimit(rpmLimit: JsonField<Long>) = apply { body.rpmLimit(rpmLimit) }

        fun rpmLimitType(rpmLimitType: RpmLimitType?) = apply { body.rpmLimitType(rpmLimitType) }

        /** Alias for calling [Builder.rpmLimitType] with `rpmLimitType.orElse(null)`. */
        fun rpmLimitType(rpmLimitType: Optional<RpmLimitType>) =
            rpmLimitType(rpmLimitType.getOrNull())

        /**
         * Sets [Builder.rpmLimitType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rpmLimitType] with a well-typed [RpmLimitType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rpmLimitType(rpmLimitType: JsonField<RpmLimitType>) = apply {
            body.rpmLimitType(rpmLimitType)
        }

        fun spend(spend: Double?) = apply { body.spend(spend) }

        /**
         * Alias for [Builder.spend].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun spend(spend: Double) = spend(spend as Double?)

        /** Alias for calling [Builder.spend] with `spend.orElse(null)`. */
        fun spend(spend: Optional<Double>) = spend(spend.getOrNull())

        /**
         * Sets [Builder.spend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spend] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spend(spend: JsonField<Double>) = apply { body.spend(spend) }

        fun tags(tags: List<String>?) = apply { body.tags(tags) }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

        fun teamId(teamId: String?) = apply { body.teamId(teamId) }

        /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
        fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { body.teamId(teamId) }

        fun tempBudgetExpiry(tempBudgetExpiry: OffsetDateTime?) = apply {
            body.tempBudgetExpiry(tempBudgetExpiry)
        }

        /** Alias for calling [Builder.tempBudgetExpiry] with `tempBudgetExpiry.orElse(null)`. */
        fun tempBudgetExpiry(tempBudgetExpiry: Optional<OffsetDateTime>) =
            tempBudgetExpiry(tempBudgetExpiry.getOrNull())

        /**
         * Sets [Builder.tempBudgetExpiry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tempBudgetExpiry] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tempBudgetExpiry(tempBudgetExpiry: JsonField<OffsetDateTime>) = apply {
            body.tempBudgetExpiry(tempBudgetExpiry)
        }

        fun tempBudgetIncrease(tempBudgetIncrease: Double?) = apply {
            body.tempBudgetIncrease(tempBudgetIncrease)
        }

        /**
         * Alias for [Builder.tempBudgetIncrease].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun tempBudgetIncrease(tempBudgetIncrease: Double) =
            tempBudgetIncrease(tempBudgetIncrease as Double?)

        /**
         * Alias for calling [Builder.tempBudgetIncrease] with `tempBudgetIncrease.orElse(null)`.
         */
        fun tempBudgetIncrease(tempBudgetIncrease: Optional<Double>) =
            tempBudgetIncrease(tempBudgetIncrease.getOrNull())

        /**
         * Sets [Builder.tempBudgetIncrease] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tempBudgetIncrease] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tempBudgetIncrease(tempBudgetIncrease: JsonField<Double>) = apply {
            body.tempBudgetIncrease(tempBudgetIncrease)
        }

        fun tpmLimit(tpmLimit: Long?) = apply { body.tpmLimit(tpmLimit) }

        /**
         * Alias for [Builder.tpmLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun tpmLimit(tpmLimit: Long) = tpmLimit(tpmLimit as Long?)

        /** Alias for calling [Builder.tpmLimit] with `tpmLimit.orElse(null)`. */
        fun tpmLimit(tpmLimit: Optional<Long>) = tpmLimit(tpmLimit.getOrNull())

        /**
         * Sets [Builder.tpmLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tpmLimit(tpmLimit: JsonField<Long>) = apply { body.tpmLimit(tpmLimit) }

        fun tpmLimitType(tpmLimitType: TpmLimitType?) = apply { body.tpmLimitType(tpmLimitType) }

        /** Alias for calling [Builder.tpmLimitType] with `tpmLimitType.orElse(null)`. */
        fun tpmLimitType(tpmLimitType: Optional<TpmLimitType>) =
            tpmLimitType(tpmLimitType.getOrNull())

        /**
         * Sets [Builder.tpmLimitType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tpmLimitType] with a well-typed [TpmLimitType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tpmLimitType(tpmLimitType: JsonField<TpmLimitType>) = apply {
            body.tpmLimitType(tpmLimitType)
        }

        fun userId(userId: String?) = apply { body.userId(userId) }

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { body.userId(userId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [KeyUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): KeyUpdateParams =
            KeyUpdateParams(
                litellmChangedBy,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                litellmChangedBy?.let { put("litellm-changed-by", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val key: JsonField<String>,
        private val aliases: JsonField<Aliases>,
        private val allowedCacheControls: JsonField<List<JsonValue>>,
        private val allowedPassthroughRoutes: JsonField<List<JsonValue>>,
        private val allowedRoutes: JsonField<List<JsonValue>>,
        private val allowedVectorStoreIndexes: JsonField<List<AllowedVectorStoreIndex>>,
        private val autoRotate: JsonField<Boolean>,
        private val blocked: JsonField<Boolean>,
        private val budgetDuration: JsonField<String>,
        private val budgetId: JsonField<String>,
        private val config: JsonField<Config>,
        private val duration: JsonField<String>,
        private val enforcedParams: JsonField<List<String>>,
        private val guardrails: JsonField<List<String>>,
        private val keyAlias: JsonField<String>,
        private val maxBudget: JsonField<Double>,
        private val maxParallelRequests: JsonField<Long>,
        private val metadata: JsonField<Metadata>,
        private val modelMaxBudget: JsonField<ModelMaxBudget>,
        private val modelRpmLimit: JsonField<ModelRpmLimit>,
        private val modelTpmLimit: JsonField<ModelTpmLimit>,
        private val models: JsonField<List<JsonValue>>,
        private val objectPermission: JsonField<ObjectPermission>,
        private val permissions: JsonField<Permissions>,
        private val prompts: JsonField<List<String>>,
        private val rotationInterval: JsonField<String>,
        private val routerSettings: JsonField<RouterSettings>,
        private val rpmLimit: JsonField<Long>,
        private val rpmLimitType: JsonField<RpmLimitType>,
        private val spend: JsonField<Double>,
        private val tags: JsonField<List<String>>,
        private val teamId: JsonField<String>,
        private val tempBudgetExpiry: JsonField<OffsetDateTime>,
        private val tempBudgetIncrease: JsonField<Double>,
        private val tpmLimit: JsonField<Long>,
        private val tpmLimitType: JsonField<TpmLimitType>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aliases") @ExcludeMissing aliases: JsonField<Aliases> = JsonMissing.of(),
            @JsonProperty("allowed_cache_controls")
            @ExcludeMissing
            allowedCacheControls: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("allowed_passthrough_routes")
            @ExcludeMissing
            allowedPassthroughRoutes: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("allowed_routes")
            @ExcludeMissing
            allowedRoutes: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("allowed_vector_store_indexes")
            @ExcludeMissing
            allowedVectorStoreIndexes: JsonField<List<AllowedVectorStoreIndex>> = JsonMissing.of(),
            @JsonProperty("auto_rotate")
            @ExcludeMissing
            autoRotate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("blocked") @ExcludeMissing blocked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("budget_id")
            @ExcludeMissing
            budgetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enforced_params")
            @ExcludeMissing
            enforcedParams: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("guardrails")
            @ExcludeMissing
            guardrails: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("key_alias")
            @ExcludeMissing
            keyAlias: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_parallel_requests")
            @ExcludeMissing
            maxParallelRequests: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("model_max_budget")
            @ExcludeMissing
            modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of(),
            @JsonProperty("model_rpm_limit")
            @ExcludeMissing
            modelRpmLimit: JsonField<ModelRpmLimit> = JsonMissing.of(),
            @JsonProperty("model_tpm_limit")
            @ExcludeMissing
            modelTpmLimit: JsonField<ModelTpmLimit> = JsonMissing.of(),
            @JsonProperty("models")
            @ExcludeMissing
            models: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("object_permission")
            @ExcludeMissing
            objectPermission: JsonField<ObjectPermission> = JsonMissing.of(),
            @JsonProperty("permissions")
            @ExcludeMissing
            permissions: JsonField<Permissions> = JsonMissing.of(),
            @JsonProperty("prompts")
            @ExcludeMissing
            prompts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("rotation_interval")
            @ExcludeMissing
            rotationInterval: JsonField<String> = JsonMissing.of(),
            @JsonProperty("router_settings")
            @ExcludeMissing
            routerSettings: JsonField<RouterSettings> = JsonMissing.of(),
            @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("rpm_limit_type")
            @ExcludeMissing
            rpmLimitType: JsonField<RpmLimitType> = JsonMissing.of(),
            @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("temp_budget_expiry")
            @ExcludeMissing
            tempBudgetExpiry: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("temp_budget_increase")
            @ExcludeMissing
            tempBudgetIncrease: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tpm_limit_type")
            @ExcludeMissing
            tpmLimitType: JsonField<TpmLimitType> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(
            key,
            aliases,
            allowedCacheControls,
            allowedPassthroughRoutes,
            allowedRoutes,
            allowedVectorStoreIndexes,
            autoRotate,
            blocked,
            budgetDuration,
            budgetId,
            config,
            duration,
            enforcedParams,
            guardrails,
            keyAlias,
            maxBudget,
            maxParallelRequests,
            metadata,
            modelMaxBudget,
            modelRpmLimit,
            modelTpmLimit,
            models,
            objectPermission,
            permissions,
            prompts,
            rotationInterval,
            routerSettings,
            rpmLimit,
            rpmLimitType,
            spend,
            tags,
            teamId,
            tempBudgetExpiry,
            tempBudgetIncrease,
            tpmLimit,
            tpmLimitType,
            userId,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun aliases(): Optional<Aliases> = aliases.getOptional("aliases")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedCacheControls(): Optional<List<JsonValue>> =
            allowedCacheControls.getOptional("allowed_cache_controls")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedPassthroughRoutes(): Optional<List<JsonValue>> =
            allowedPassthroughRoutes.getOptional("allowed_passthrough_routes")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedRoutes(): Optional<List<JsonValue>> = allowedRoutes.getOptional("allowed_routes")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedVectorStoreIndexes(): Optional<List<AllowedVectorStoreIndex>> =
            allowedVectorStoreIndexes.getOptional("allowed_vector_store_indexes")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoRotate(): Optional<Boolean> = autoRotate.getOptional("auto_rotate")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun blocked(): Optional<Boolean> = blocked.getOptional("blocked")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetDuration(): Optional<String> = budgetDuration.getOptional("budget_duration")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetId(): Optional<String> = budgetId.getOptional("budget_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun config(): Optional<Config> = config.getOptional("config")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Optional<String> = duration.getOptional("duration")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enforcedParams(): Optional<List<String>> = enforcedParams.getOptional("enforced_params")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun guardrails(): Optional<List<String>> = guardrails.getOptional("guardrails")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keyAlias(): Optional<String> = keyAlias.getOptional("key_alias")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudget(): Optional<Double> = maxBudget.getOptional("max_budget")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxParallelRequests(): Optional<Long> =
            maxParallelRequests.getOptional("max_parallel_requests")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelMaxBudget(): Optional<ModelMaxBudget> =
            modelMaxBudget.getOptional("model_max_budget")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelRpmLimit(): Optional<ModelRpmLimit> = modelRpmLimit.getOptional("model_rpm_limit")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelTpmLimit(): Optional<ModelTpmLimit> = modelTpmLimit.getOptional("model_tpm_limit")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun models(): Optional<List<JsonValue>> = models.getOptional("models")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectPermission(): Optional<ObjectPermission> =
            objectPermission.getOptional("object_permission")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun permissions(): Optional<Permissions> = permissions.getOptional("permissions")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prompts(): Optional<List<String>> = prompts.getOptional("prompts")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rotationInterval(): Optional<String> = rotationInterval.getOptional("rotation_interval")

        /**
         * Set of params that you can modify via `router.update_settings()`.
         *
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun routerSettings(): Optional<RouterSettings> =
            routerSettings.getOptional("router_settings")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rpmLimit(): Optional<Long> = rpmLimit.getOptional("rpm_limit")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rpmLimitType(): Optional<RpmLimitType> = rpmLimitType.getOptional("rpm_limit_type")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spend(): Optional<Double> = spend.getOptional("spend")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun teamId(): Optional<String> = teamId.getOptional("team_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tempBudgetExpiry(): Optional<OffsetDateTime> =
            tempBudgetExpiry.getOptional("temp_budget_expiry")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tempBudgetIncrease(): Optional<Double> =
            tempBudgetIncrease.getOptional("temp_budget_increase")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tpmLimit(): Optional<Long> = tpmLimit.getOptional("tpm_limit")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tpmLimitType(): Optional<TpmLimitType> = tpmLimitType.getOptional("tpm_limit_type")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userId(): Optional<String> = userId.getOptional("user_id")

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [aliases].
         *
         * Unlike [aliases], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aliases") @ExcludeMissing fun _aliases(): JsonField<Aliases> = aliases

        /**
         * Returns the raw JSON value of [allowedCacheControls].
         *
         * Unlike [allowedCacheControls], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowed_cache_controls")
        @ExcludeMissing
        fun _allowedCacheControls(): JsonField<List<JsonValue>> = allowedCacheControls

        /**
         * Returns the raw JSON value of [allowedPassthroughRoutes].
         *
         * Unlike [allowedPassthroughRoutes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowed_passthrough_routes")
        @ExcludeMissing
        fun _allowedPassthroughRoutes(): JsonField<List<JsonValue>> = allowedPassthroughRoutes

        /**
         * Returns the raw JSON value of [allowedRoutes].
         *
         * Unlike [allowedRoutes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allowed_routes")
        @ExcludeMissing
        fun _allowedRoutes(): JsonField<List<JsonValue>> = allowedRoutes

        /**
         * Returns the raw JSON value of [allowedVectorStoreIndexes].
         *
         * Unlike [allowedVectorStoreIndexes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowed_vector_store_indexes")
        @ExcludeMissing
        fun _allowedVectorStoreIndexes(): JsonField<List<AllowedVectorStoreIndex>> =
            allowedVectorStoreIndexes

        /**
         * Returns the raw JSON value of [autoRotate].
         *
         * Unlike [autoRotate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auto_rotate")
        @ExcludeMissing
        fun _autoRotate(): JsonField<Boolean> = autoRotate

        /**
         * Returns the raw JSON value of [blocked].
         *
         * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blocked") @ExcludeMissing fun _blocked(): JsonField<Boolean> = blocked

        /**
         * Returns the raw JSON value of [budgetDuration].
         *
         * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("budget_duration")
        @ExcludeMissing
        fun _budgetDuration(): JsonField<String> = budgetDuration

        /**
         * Returns the raw JSON value of [budgetId].
         *
         * Unlike [budgetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("budget_id") @ExcludeMissing fun _budgetId(): JsonField<String> = budgetId

        /**
         * Returns the raw JSON value of [config].
         *
         * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<String> = duration

        /**
         * Returns the raw JSON value of [enforcedParams].
         *
         * Unlike [enforcedParams], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("enforced_params")
        @ExcludeMissing
        fun _enforcedParams(): JsonField<List<String>> = enforcedParams

        /**
         * Returns the raw JSON value of [guardrails].
         *
         * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("guardrails")
        @ExcludeMissing
        fun _guardrails(): JsonField<List<String>> = guardrails

        /**
         * Returns the raw JSON value of [keyAlias].
         *
         * Unlike [keyAlias], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key_alias") @ExcludeMissing fun _keyAlias(): JsonField<String> = keyAlias

        /**
         * Returns the raw JSON value of [maxBudget].
         *
         * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

        /**
         * Returns the raw JSON value of [maxParallelRequests].
         *
         * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_parallel_requests")
        @ExcludeMissing
        fun _maxParallelRequests(): JsonField<Long> = maxParallelRequests

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [modelMaxBudget].
         *
         * Unlike [modelMaxBudget], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("model_max_budget")
        @ExcludeMissing
        fun _modelMaxBudget(): JsonField<ModelMaxBudget> = modelMaxBudget

        /**
         * Returns the raw JSON value of [modelRpmLimit].
         *
         * Unlike [modelRpmLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("model_rpm_limit")
        @ExcludeMissing
        fun _modelRpmLimit(): JsonField<ModelRpmLimit> = modelRpmLimit

        /**
         * Returns the raw JSON value of [modelTpmLimit].
         *
         * Unlike [modelTpmLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("model_tpm_limit")
        @ExcludeMissing
        fun _modelTpmLimit(): JsonField<ModelTpmLimit> = modelTpmLimit

        /**
         * Returns the raw JSON value of [models].
         *
         * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("models") @ExcludeMissing fun _models(): JsonField<List<JsonValue>> = models

        /**
         * Returns the raw JSON value of [objectPermission].
         *
         * Unlike [objectPermission], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("object_permission")
        @ExcludeMissing
        fun _objectPermission(): JsonField<ObjectPermission> = objectPermission

        /**
         * Returns the raw JSON value of [permissions].
         *
         * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("permissions")
        @ExcludeMissing
        fun _permissions(): JsonField<Permissions> = permissions

        /**
         * Returns the raw JSON value of [prompts].
         *
         * Unlike [prompts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompts") @ExcludeMissing fun _prompts(): JsonField<List<String>> = prompts

        /**
         * Returns the raw JSON value of [rotationInterval].
         *
         * Unlike [rotationInterval], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rotation_interval")
        @ExcludeMissing
        fun _rotationInterval(): JsonField<String> = rotationInterval

        /**
         * Returns the raw JSON value of [routerSettings].
         *
         * Unlike [routerSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("router_settings")
        @ExcludeMissing
        fun _routerSettings(): JsonField<RouterSettings> = routerSettings

        /**
         * Returns the raw JSON value of [rpmLimit].
         *
         * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

        /**
         * Returns the raw JSON value of [rpmLimitType].
         *
         * Unlike [rpmLimitType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rpm_limit_type")
        @ExcludeMissing
        fun _rpmLimitType(): JsonField<RpmLimitType> = rpmLimitType

        /**
         * Returns the raw JSON value of [spend].
         *
         * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [teamId].
         *
         * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

        /**
         * Returns the raw JSON value of [tempBudgetExpiry].
         *
         * Unlike [tempBudgetExpiry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("temp_budget_expiry")
        @ExcludeMissing
        fun _tempBudgetExpiry(): JsonField<OffsetDateTime> = tempBudgetExpiry

        /**
         * Returns the raw JSON value of [tempBudgetIncrease].
         *
         * Unlike [tempBudgetIncrease], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("temp_budget_increase")
        @ExcludeMissing
        fun _tempBudgetIncrease(): JsonField<Double> = tempBudgetIncrease

        /**
         * Returns the raw JSON value of [tpmLimit].
         *
         * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

        /**
         * Returns the raw JSON value of [tpmLimitType].
         *
         * Unlike [tpmLimitType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tpm_limit_type")
        @ExcludeMissing
        fun _tpmLimitType(): JsonField<TpmLimitType> = tpmLimitType

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .key()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var key: JsonField<String>? = null
            private var aliases: JsonField<Aliases> = JsonMissing.of()
            private var allowedCacheControls: JsonField<MutableList<JsonValue>>? = null
            private var allowedPassthroughRoutes: JsonField<MutableList<JsonValue>>? = null
            private var allowedRoutes: JsonField<MutableList<JsonValue>>? = null
            private var allowedVectorStoreIndexes:
                JsonField<MutableList<AllowedVectorStoreIndex>>? =
                null
            private var autoRotate: JsonField<Boolean> = JsonMissing.of()
            private var blocked: JsonField<Boolean> = JsonMissing.of()
            private var budgetDuration: JsonField<String> = JsonMissing.of()
            private var budgetId: JsonField<String> = JsonMissing.of()
            private var config: JsonField<Config> = JsonMissing.of()
            private var duration: JsonField<String> = JsonMissing.of()
            private var enforcedParams: JsonField<MutableList<String>>? = null
            private var guardrails: JsonField<MutableList<String>>? = null
            private var keyAlias: JsonField<String> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of()
            private var modelRpmLimit: JsonField<ModelRpmLimit> = JsonMissing.of()
            private var modelTpmLimit: JsonField<ModelTpmLimit> = JsonMissing.of()
            private var models: JsonField<MutableList<JsonValue>>? = null
            private var objectPermission: JsonField<ObjectPermission> = JsonMissing.of()
            private var permissions: JsonField<Permissions> = JsonMissing.of()
            private var prompts: JsonField<MutableList<String>>? = null
            private var rotationInterval: JsonField<String> = JsonMissing.of()
            private var routerSettings: JsonField<RouterSettings> = JsonMissing.of()
            private var rpmLimit: JsonField<Long> = JsonMissing.of()
            private var rpmLimitType: JsonField<RpmLimitType> = JsonMissing.of()
            private var spend: JsonField<Double> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var teamId: JsonField<String> = JsonMissing.of()
            private var tempBudgetExpiry: JsonField<OffsetDateTime> = JsonMissing.of()
            private var tempBudgetIncrease: JsonField<Double> = JsonMissing.of()
            private var tpmLimit: JsonField<Long> = JsonMissing.of()
            private var tpmLimitType: JsonField<TpmLimitType> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                key = body.key
                aliases = body.aliases
                allowedCacheControls = body.allowedCacheControls.map { it.toMutableList() }
                allowedPassthroughRoutes = body.allowedPassthroughRoutes.map { it.toMutableList() }
                allowedRoutes = body.allowedRoutes.map { it.toMutableList() }
                allowedVectorStoreIndexes =
                    body.allowedVectorStoreIndexes.map { it.toMutableList() }
                autoRotate = body.autoRotate
                blocked = body.blocked
                budgetDuration = body.budgetDuration
                budgetId = body.budgetId
                config = body.config
                duration = body.duration
                enforcedParams = body.enforcedParams.map { it.toMutableList() }
                guardrails = body.guardrails.map { it.toMutableList() }
                keyAlias = body.keyAlias
                maxBudget = body.maxBudget
                maxParallelRequests = body.maxParallelRequests
                metadata = body.metadata
                modelMaxBudget = body.modelMaxBudget
                modelRpmLimit = body.modelRpmLimit
                modelTpmLimit = body.modelTpmLimit
                models = body.models.map { it.toMutableList() }
                objectPermission = body.objectPermission
                permissions = body.permissions
                prompts = body.prompts.map { it.toMutableList() }
                rotationInterval = body.rotationInterval
                routerSettings = body.routerSettings
                rpmLimit = body.rpmLimit
                rpmLimitType = body.rpmLimitType
                spend = body.spend
                tags = body.tags.map { it.toMutableList() }
                teamId = body.teamId
                tempBudgetExpiry = body.tempBudgetExpiry
                tempBudgetIncrease = body.tempBudgetIncrease
                tpmLimit = body.tpmLimit
                tpmLimitType = body.tpmLimitType
                userId = body.userId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            fun aliases(aliases: Aliases?) = aliases(JsonField.ofNullable(aliases))

            /** Alias for calling [Builder.aliases] with `aliases.orElse(null)`. */
            fun aliases(aliases: Optional<Aliases>) = aliases(aliases.getOrNull())

            /**
             * Sets [Builder.aliases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aliases] with a well-typed [Aliases] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aliases(aliases: JsonField<Aliases>) = apply { this.aliases = aliases }

            fun allowedCacheControls(allowedCacheControls: List<JsonValue>?) =
                allowedCacheControls(JsonField.ofNullable(allowedCacheControls))

            /**
             * Alias for calling [Builder.allowedCacheControls] with
             * `allowedCacheControls.orElse(null)`.
             */
            fun allowedCacheControls(allowedCacheControls: Optional<List<JsonValue>>) =
                allowedCacheControls(allowedCacheControls.getOrNull())

            /**
             * Sets [Builder.allowedCacheControls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedCacheControls] with a well-typed
             * `List<JsonValue>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowedCacheControls(allowedCacheControls: JsonField<List<JsonValue>>) = apply {
                this.allowedCacheControls = allowedCacheControls.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [allowedCacheControls].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedCacheControl(allowedCacheControl: JsonValue) = apply {
                allowedCacheControls =
                    (allowedCacheControls ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedCacheControls", it).add(allowedCacheControl)
                    }
            }

            fun allowedPassthroughRoutes(allowedPassthroughRoutes: List<JsonValue>?) =
                allowedPassthroughRoutes(JsonField.ofNullable(allowedPassthroughRoutes))

            /**
             * Alias for calling [Builder.allowedPassthroughRoutes] with
             * `allowedPassthroughRoutes.orElse(null)`.
             */
            fun allowedPassthroughRoutes(allowedPassthroughRoutes: Optional<List<JsonValue>>) =
                allowedPassthroughRoutes(allowedPassthroughRoutes.getOrNull())

            /**
             * Sets [Builder.allowedPassthroughRoutes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedPassthroughRoutes] with a well-typed
             * `List<JsonValue>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowedPassthroughRoutes(allowedPassthroughRoutes: JsonField<List<JsonValue>>) =
                apply {
                    this.allowedPassthroughRoutes =
                        allowedPassthroughRoutes.map { it.toMutableList() }
                }

            /**
             * Adds a single [JsonValue] to [allowedPassthroughRoutes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedPassthroughRoute(allowedPassthroughRoute: JsonValue) = apply {
                allowedPassthroughRoutes =
                    (allowedPassthroughRoutes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedPassthroughRoutes", it).add(allowedPassthroughRoute)
                    }
            }

            fun allowedRoutes(allowedRoutes: List<JsonValue>?) =
                allowedRoutes(JsonField.ofNullable(allowedRoutes))

            /** Alias for calling [Builder.allowedRoutes] with `allowedRoutes.orElse(null)`. */
            fun allowedRoutes(allowedRoutes: Optional<List<JsonValue>>) =
                allowedRoutes(allowedRoutes.getOrNull())

            /**
             * Sets [Builder.allowedRoutes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedRoutes] with a well-typed `List<JsonValue>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowedRoutes(allowedRoutes: JsonField<List<JsonValue>>) = apply {
                this.allowedRoutes = allowedRoutes.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [allowedRoutes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedRoute(allowedRoute: JsonValue) = apply {
                allowedRoutes =
                    (allowedRoutes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedRoutes", it).add(allowedRoute)
                    }
            }

            fun allowedVectorStoreIndexes(
                allowedVectorStoreIndexes: List<AllowedVectorStoreIndex>?
            ) = allowedVectorStoreIndexes(JsonField.ofNullable(allowedVectorStoreIndexes))

            /**
             * Alias for calling [Builder.allowedVectorStoreIndexes] with
             * `allowedVectorStoreIndexes.orElse(null)`.
             */
            fun allowedVectorStoreIndexes(
                allowedVectorStoreIndexes: Optional<List<AllowedVectorStoreIndex>>
            ) = allowedVectorStoreIndexes(allowedVectorStoreIndexes.getOrNull())

            /**
             * Sets [Builder.allowedVectorStoreIndexes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedVectorStoreIndexes] with a well-typed
             * `List<AllowedVectorStoreIndex>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun allowedVectorStoreIndexes(
                allowedVectorStoreIndexes: JsonField<List<AllowedVectorStoreIndex>>
            ) = apply {
                this.allowedVectorStoreIndexes =
                    allowedVectorStoreIndexes.map { it.toMutableList() }
            }

            /**
             * Adds a single [AllowedVectorStoreIndex] to [allowedVectorStoreIndexes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedVectorStoreIndex(allowedVectorStoreIndex: AllowedVectorStoreIndex) =
                apply {
                    allowedVectorStoreIndexes =
                        (allowedVectorStoreIndexes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("allowedVectorStoreIndexes", it).add(allowedVectorStoreIndex)
                        }
                }

            fun autoRotate(autoRotate: Boolean?) = autoRotate(JsonField.ofNullable(autoRotate))

            /**
             * Alias for [Builder.autoRotate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun autoRotate(autoRotate: Boolean) = autoRotate(autoRotate as Boolean?)

            /** Alias for calling [Builder.autoRotate] with `autoRotate.orElse(null)`. */
            fun autoRotate(autoRotate: Optional<Boolean>) = autoRotate(autoRotate.getOrNull())

            /**
             * Sets [Builder.autoRotate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoRotate] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoRotate(autoRotate: JsonField<Boolean>) = apply { this.autoRotate = autoRotate }

            fun blocked(blocked: Boolean?) = blocked(JsonField.ofNullable(blocked))

            /**
             * Alias for [Builder.blocked].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun blocked(blocked: Boolean) = blocked(blocked as Boolean?)

            /** Alias for calling [Builder.blocked] with `blocked.orElse(null)`. */
            fun blocked(blocked: Optional<Boolean>) = blocked(blocked.getOrNull())

            /**
             * Sets [Builder.blocked] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blocked] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

            fun budgetDuration(budgetDuration: String?) =
                budgetDuration(JsonField.ofNullable(budgetDuration))

            /** Alias for calling [Builder.budgetDuration] with `budgetDuration.orElse(null)`. */
            fun budgetDuration(budgetDuration: Optional<String>) =
                budgetDuration(budgetDuration.getOrNull())

            /**
             * Sets [Builder.budgetDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetDuration] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budgetDuration(budgetDuration: JsonField<String>) = apply {
                this.budgetDuration = budgetDuration
            }

            fun budgetId(budgetId: String?) = budgetId(JsonField.ofNullable(budgetId))

            /** Alias for calling [Builder.budgetId] with `budgetId.orElse(null)`. */
            fun budgetId(budgetId: Optional<String>) = budgetId(budgetId.getOrNull())

            /**
             * Sets [Builder.budgetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

            fun config(config: Config?) = config(JsonField.ofNullable(config))

            /** Alias for calling [Builder.config] with `config.orElse(null)`. */
            fun config(config: Optional<Config>) = config(config.getOrNull())

            /**
             * Sets [Builder.config] to an arbitrary JSON value.
             *
             * You should usually call [Builder.config] with a well-typed [Config] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun config(config: JsonField<Config>) = apply { this.config = config }

            fun duration(duration: String?) = duration(JsonField.ofNullable(duration))

            /** Alias for calling [Builder.duration] with `duration.orElse(null)`. */
            fun duration(duration: Optional<String>) = duration(duration.getOrNull())

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<String>) = apply { this.duration = duration }

            fun enforcedParams(enforcedParams: List<String>?) =
                enforcedParams(JsonField.ofNullable(enforcedParams))

            /** Alias for calling [Builder.enforcedParams] with `enforcedParams.orElse(null)`. */
            fun enforcedParams(enforcedParams: Optional<List<String>>) =
                enforcedParams(enforcedParams.getOrNull())

            /**
             * Sets [Builder.enforcedParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enforcedParams] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun enforcedParams(enforcedParams: JsonField<List<String>>) = apply {
                this.enforcedParams = enforcedParams.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [enforcedParams].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEnforcedParam(enforcedParam: String) = apply {
                enforcedParams =
                    (enforcedParams ?: JsonField.of(mutableListOf())).also {
                        checkKnown("enforcedParams", it).add(enforcedParam)
                    }
            }

            fun guardrails(guardrails: List<String>?) = guardrails(JsonField.ofNullable(guardrails))

            /** Alias for calling [Builder.guardrails] with `guardrails.orElse(null)`. */
            fun guardrails(guardrails: Optional<List<String>>) = guardrails(guardrails.getOrNull())

            /**
             * Sets [Builder.guardrails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrails] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guardrails(guardrails: JsonField<List<String>>) = apply {
                this.guardrails = guardrails.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [guardrails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGuardrail(guardrail: String) = apply {
                guardrails =
                    (guardrails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("guardrails", it).add(guardrail)
                    }
            }

            fun keyAlias(keyAlias: String?) = keyAlias(JsonField.ofNullable(keyAlias))

            /** Alias for calling [Builder.keyAlias] with `keyAlias.orElse(null)`. */
            fun keyAlias(keyAlias: Optional<String>) = keyAlias(keyAlias.getOrNull())

            /**
             * Sets [Builder.keyAlias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keyAlias] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keyAlias(keyAlias: JsonField<String>) = apply { this.keyAlias = keyAlias }

            fun maxBudget(maxBudget: Double?) = maxBudget(JsonField.ofNullable(maxBudget))

            /**
             * Alias for [Builder.maxBudget].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxBudget(maxBudget: Double) = maxBudget(maxBudget as Double?)

            /** Alias for calling [Builder.maxBudget] with `maxBudget.orElse(null)`. */
            fun maxBudget(maxBudget: Optional<Double>) = maxBudget(maxBudget.getOrNull())

            /**
             * Sets [Builder.maxBudget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxBudget] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxBudget(maxBudget: JsonField<Double>) = apply { this.maxBudget = maxBudget }

            fun maxParallelRequests(maxParallelRequests: Long?) =
                maxParallelRequests(JsonField.ofNullable(maxParallelRequests))

            /**
             * Alias for [Builder.maxParallelRequests].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxParallelRequests(maxParallelRequests: Long) =
                maxParallelRequests(maxParallelRequests as Long?)

            /**
             * Alias for calling [Builder.maxParallelRequests] with
             * `maxParallelRequests.orElse(null)`.
             */
            fun maxParallelRequests(maxParallelRequests: Optional<Long>) =
                maxParallelRequests(maxParallelRequests.getOrNull())

            /**
             * Sets [Builder.maxParallelRequests] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxParallelRequests] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
                this.maxParallelRequests = maxParallelRequests
            }

            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun modelMaxBudget(modelMaxBudget: ModelMaxBudget?) =
                modelMaxBudget(JsonField.ofNullable(modelMaxBudget))

            /** Alias for calling [Builder.modelMaxBudget] with `modelMaxBudget.orElse(null)`. */
            fun modelMaxBudget(modelMaxBudget: Optional<ModelMaxBudget>) =
                modelMaxBudget(modelMaxBudget.getOrNull())

            /**
             * Sets [Builder.modelMaxBudget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelMaxBudget] with a well-typed [ModelMaxBudget]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun modelMaxBudget(modelMaxBudget: JsonField<ModelMaxBudget>) = apply {
                this.modelMaxBudget = modelMaxBudget
            }

            fun modelRpmLimit(modelRpmLimit: ModelRpmLimit?) =
                modelRpmLimit(JsonField.ofNullable(modelRpmLimit))

            /** Alias for calling [Builder.modelRpmLimit] with `modelRpmLimit.orElse(null)`. */
            fun modelRpmLimit(modelRpmLimit: Optional<ModelRpmLimit>) =
                modelRpmLimit(modelRpmLimit.getOrNull())

            /**
             * Sets [Builder.modelRpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelRpmLimit] with a well-typed [ModelRpmLimit]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun modelRpmLimit(modelRpmLimit: JsonField<ModelRpmLimit>) = apply {
                this.modelRpmLimit = modelRpmLimit
            }

            fun modelTpmLimit(modelTpmLimit: ModelTpmLimit?) =
                modelTpmLimit(JsonField.ofNullable(modelTpmLimit))

            /** Alias for calling [Builder.modelTpmLimit] with `modelTpmLimit.orElse(null)`. */
            fun modelTpmLimit(modelTpmLimit: Optional<ModelTpmLimit>) =
                modelTpmLimit(modelTpmLimit.getOrNull())

            /**
             * Sets [Builder.modelTpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelTpmLimit] with a well-typed [ModelTpmLimit]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun modelTpmLimit(modelTpmLimit: JsonField<ModelTpmLimit>) = apply {
                this.modelTpmLimit = modelTpmLimit
            }

            fun models(models: List<JsonValue>?) = models(JsonField.ofNullable(models))

            /** Alias for calling [Builder.models] with `models.orElse(null)`. */
            fun models(models: Optional<List<JsonValue>>) = models(models.getOrNull())

            /**
             * Sets [Builder.models] to an arbitrary JSON value.
             *
             * You should usually call [Builder.models] with a well-typed `List<JsonValue>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun models(models: JsonField<List<JsonValue>>) = apply {
                this.models = models.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [models].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addModel(model: JsonValue) = apply {
                models =
                    (models ?: JsonField.of(mutableListOf())).also {
                        checkKnown("models", it).add(model)
                    }
            }

            fun objectPermission(objectPermission: ObjectPermission?) =
                objectPermission(JsonField.ofNullable(objectPermission))

            /**
             * Alias for calling [Builder.objectPermission] with `objectPermission.orElse(null)`.
             */
            fun objectPermission(objectPermission: Optional<ObjectPermission>) =
                objectPermission(objectPermission.getOrNull())

            /**
             * Sets [Builder.objectPermission] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectPermission] with a well-typed
             * [ObjectPermission] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun objectPermission(objectPermission: JsonField<ObjectPermission>) = apply {
                this.objectPermission = objectPermission
            }

            fun permissions(permissions: Permissions?) =
                permissions(JsonField.ofNullable(permissions))

            /** Alias for calling [Builder.permissions] with `permissions.orElse(null)`. */
            fun permissions(permissions: Optional<Permissions>) =
                permissions(permissions.getOrNull())

            /**
             * Sets [Builder.permissions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.permissions] with a well-typed [Permissions] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun permissions(permissions: JsonField<Permissions>) = apply {
                this.permissions = permissions
            }

            fun prompts(prompts: List<String>?) = prompts(JsonField.ofNullable(prompts))

            /** Alias for calling [Builder.prompts] with `prompts.orElse(null)`. */
            fun prompts(prompts: Optional<List<String>>) = prompts(prompts.getOrNull())

            /**
             * Sets [Builder.prompts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompts] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prompts(prompts: JsonField<List<String>>) = apply {
                this.prompts = prompts.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [prompts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPrompt(prompt: String) = apply {
                prompts =
                    (prompts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("prompts", it).add(prompt)
                    }
            }

            fun rotationInterval(rotationInterval: String?) =
                rotationInterval(JsonField.ofNullable(rotationInterval))

            /**
             * Alias for calling [Builder.rotationInterval] with `rotationInterval.orElse(null)`.
             */
            fun rotationInterval(rotationInterval: Optional<String>) =
                rotationInterval(rotationInterval.getOrNull())

            /**
             * Sets [Builder.rotationInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rotationInterval] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rotationInterval(rotationInterval: JsonField<String>) = apply {
                this.rotationInterval = rotationInterval
            }

            /** Set of params that you can modify via `router.update_settings()`. */
            fun routerSettings(routerSettings: RouterSettings?) =
                routerSettings(JsonField.ofNullable(routerSettings))

            /** Alias for calling [Builder.routerSettings] with `routerSettings.orElse(null)`. */
            fun routerSettings(routerSettings: Optional<RouterSettings>) =
                routerSettings(routerSettings.getOrNull())

            /**
             * Sets [Builder.routerSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routerSettings] with a well-typed [RouterSettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun routerSettings(routerSettings: JsonField<RouterSettings>) = apply {
                this.routerSettings = routerSettings
            }

            fun rpmLimit(rpmLimit: Long?) = rpmLimit(JsonField.ofNullable(rpmLimit))

            /**
             * Alias for [Builder.rpmLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rpmLimit(rpmLimit: Long) = rpmLimit(rpmLimit as Long?)

            /** Alias for calling [Builder.rpmLimit] with `rpmLimit.orElse(null)`. */
            fun rpmLimit(rpmLimit: Optional<Long>) = rpmLimit(rpmLimit.getOrNull())

            /**
             * Sets [Builder.rpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

            fun rpmLimitType(rpmLimitType: RpmLimitType?) =
                rpmLimitType(JsonField.ofNullable(rpmLimitType))

            /** Alias for calling [Builder.rpmLimitType] with `rpmLimitType.orElse(null)`. */
            fun rpmLimitType(rpmLimitType: Optional<RpmLimitType>) =
                rpmLimitType(rpmLimitType.getOrNull())

            /**
             * Sets [Builder.rpmLimitType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rpmLimitType] with a well-typed [RpmLimitType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rpmLimitType(rpmLimitType: JsonField<RpmLimitType>) = apply {
                this.rpmLimitType = rpmLimitType
            }

            fun spend(spend: Double?) = spend(JsonField.ofNullable(spend))

            /**
             * Alias for [Builder.spend].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun spend(spend: Double) = spend(spend as Double?)

            /** Alias for calling [Builder.spend] with `spend.orElse(null)`. */
            fun spend(spend: Optional<Double>) = spend(spend.getOrNull())

            /**
             * Sets [Builder.spend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spend] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

            fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

            /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
            fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

            /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
            fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

            /**
             * Sets [Builder.teamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

            fun tempBudgetExpiry(tempBudgetExpiry: OffsetDateTime?) =
                tempBudgetExpiry(JsonField.ofNullable(tempBudgetExpiry))

            /**
             * Alias for calling [Builder.tempBudgetExpiry] with `tempBudgetExpiry.orElse(null)`.
             */
            fun tempBudgetExpiry(tempBudgetExpiry: Optional<OffsetDateTime>) =
                tempBudgetExpiry(tempBudgetExpiry.getOrNull())

            /**
             * Sets [Builder.tempBudgetExpiry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tempBudgetExpiry] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun tempBudgetExpiry(tempBudgetExpiry: JsonField<OffsetDateTime>) = apply {
                this.tempBudgetExpiry = tempBudgetExpiry
            }

            fun tempBudgetIncrease(tempBudgetIncrease: Double?) =
                tempBudgetIncrease(JsonField.ofNullable(tempBudgetIncrease))

            /**
             * Alias for [Builder.tempBudgetIncrease].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tempBudgetIncrease(tempBudgetIncrease: Double) =
                tempBudgetIncrease(tempBudgetIncrease as Double?)

            /**
             * Alias for calling [Builder.tempBudgetIncrease] with
             * `tempBudgetIncrease.orElse(null)`.
             */
            fun tempBudgetIncrease(tempBudgetIncrease: Optional<Double>) =
                tempBudgetIncrease(tempBudgetIncrease.getOrNull())

            /**
             * Sets [Builder.tempBudgetIncrease] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tempBudgetIncrease] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tempBudgetIncrease(tempBudgetIncrease: JsonField<Double>) = apply {
                this.tempBudgetIncrease = tempBudgetIncrease
            }

            fun tpmLimit(tpmLimit: Long?) = tpmLimit(JsonField.ofNullable(tpmLimit))

            /**
             * Alias for [Builder.tpmLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tpmLimit(tpmLimit: Long) = tpmLimit(tpmLimit as Long?)

            /** Alias for calling [Builder.tpmLimit] with `tpmLimit.orElse(null)`. */
            fun tpmLimit(tpmLimit: Optional<Long>) = tpmLimit(tpmLimit.getOrNull())

            /**
             * Sets [Builder.tpmLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tpmLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

            fun tpmLimitType(tpmLimitType: TpmLimitType?) =
                tpmLimitType(JsonField.ofNullable(tpmLimitType))

            /** Alias for calling [Builder.tpmLimitType] with `tpmLimitType.orElse(null)`. */
            fun tpmLimitType(tpmLimitType: Optional<TpmLimitType>) =
                tpmLimitType(tpmLimitType.getOrNull())

            /**
             * Sets [Builder.tpmLimitType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tpmLimitType] with a well-typed [TpmLimitType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tpmLimitType(tpmLimitType: JsonField<TpmLimitType>) = apply {
                this.tpmLimitType = tpmLimitType
            }

            fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

            /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
            fun userId(userId: Optional<String>) = userId(userId.getOrNull())

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .key()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("key", key),
                    aliases,
                    (allowedCacheControls ?: JsonMissing.of()).map { it.toImmutable() },
                    (allowedPassthroughRoutes ?: JsonMissing.of()).map { it.toImmutable() },
                    (allowedRoutes ?: JsonMissing.of()).map { it.toImmutable() },
                    (allowedVectorStoreIndexes ?: JsonMissing.of()).map { it.toImmutable() },
                    autoRotate,
                    blocked,
                    budgetDuration,
                    budgetId,
                    config,
                    duration,
                    (enforcedParams ?: JsonMissing.of()).map { it.toImmutable() },
                    (guardrails ?: JsonMissing.of()).map { it.toImmutable() },
                    keyAlias,
                    maxBudget,
                    maxParallelRequests,
                    metadata,
                    modelMaxBudget,
                    modelRpmLimit,
                    modelTpmLimit,
                    (models ?: JsonMissing.of()).map { it.toImmutable() },
                    objectPermission,
                    permissions,
                    (prompts ?: JsonMissing.of()).map { it.toImmutable() },
                    rotationInterval,
                    routerSettings,
                    rpmLimit,
                    rpmLimitType,
                    spend,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    teamId,
                    tempBudgetExpiry,
                    tempBudgetIncrease,
                    tpmLimit,
                    tpmLimitType,
                    userId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            key()
            aliases().ifPresent { it.validate() }
            allowedCacheControls()
            allowedPassthroughRoutes()
            allowedRoutes()
            allowedVectorStoreIndexes().ifPresent { it.forEach { it.validate() } }
            autoRotate()
            blocked()
            budgetDuration()
            budgetId()
            config().ifPresent { it.validate() }
            duration()
            enforcedParams()
            guardrails()
            keyAlias()
            maxBudget()
            maxParallelRequests()
            metadata().ifPresent { it.validate() }
            modelMaxBudget().ifPresent { it.validate() }
            modelRpmLimit().ifPresent { it.validate() }
            modelTpmLimit().ifPresent { it.validate() }
            models()
            objectPermission().ifPresent { it.validate() }
            permissions().ifPresent { it.validate() }
            prompts()
            rotationInterval()
            routerSettings().ifPresent { it.validate() }
            rpmLimit()
            rpmLimitType().ifPresent { it.validate() }
            spend()
            tags()
            teamId()
            tempBudgetExpiry()
            tempBudgetIncrease()
            tpmLimit()
            tpmLimitType().ifPresent { it.validate() }
            userId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (key.asKnown().isPresent) 1 else 0) +
                (aliases.asKnown().getOrNull()?.validity() ?: 0) +
                (allowedCacheControls.asKnown().getOrNull()?.size ?: 0) +
                (allowedPassthroughRoutes.asKnown().getOrNull()?.size ?: 0) +
                (allowedRoutes.asKnown().getOrNull()?.size ?: 0) +
                (allowedVectorStoreIndexes.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (autoRotate.asKnown().isPresent) 1 else 0) +
                (if (blocked.asKnown().isPresent) 1 else 0) +
                (if (budgetDuration.asKnown().isPresent) 1 else 0) +
                (if (budgetId.asKnown().isPresent) 1 else 0) +
                (config.asKnown().getOrNull()?.validity() ?: 0) +
                (if (duration.asKnown().isPresent) 1 else 0) +
                (enforcedParams.asKnown().getOrNull()?.size ?: 0) +
                (guardrails.asKnown().getOrNull()?.size ?: 0) +
                (if (keyAlias.asKnown().isPresent) 1 else 0) +
                (if (maxBudget.asKnown().isPresent) 1 else 0) +
                (if (maxParallelRequests.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (modelMaxBudget.asKnown().getOrNull()?.validity() ?: 0) +
                (modelRpmLimit.asKnown().getOrNull()?.validity() ?: 0) +
                (modelTpmLimit.asKnown().getOrNull()?.validity() ?: 0) +
                (models.asKnown().getOrNull()?.size ?: 0) +
                (objectPermission.asKnown().getOrNull()?.validity() ?: 0) +
                (permissions.asKnown().getOrNull()?.validity() ?: 0) +
                (prompts.asKnown().getOrNull()?.size ?: 0) +
                (if (rotationInterval.asKnown().isPresent) 1 else 0) +
                (routerSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rpmLimit.asKnown().isPresent) 1 else 0) +
                (rpmLimitType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (spend.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (teamId.asKnown().isPresent) 1 else 0) +
                (if (tempBudgetExpiry.asKnown().isPresent) 1 else 0) +
                (if (tempBudgetIncrease.asKnown().isPresent) 1 else 0) +
                (if (tpmLimit.asKnown().isPresent) 1 else 0) +
                (tpmLimitType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (userId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                key == other.key &&
                aliases == other.aliases &&
                allowedCacheControls == other.allowedCacheControls &&
                allowedPassthroughRoutes == other.allowedPassthroughRoutes &&
                allowedRoutes == other.allowedRoutes &&
                allowedVectorStoreIndexes == other.allowedVectorStoreIndexes &&
                autoRotate == other.autoRotate &&
                blocked == other.blocked &&
                budgetDuration == other.budgetDuration &&
                budgetId == other.budgetId &&
                config == other.config &&
                duration == other.duration &&
                enforcedParams == other.enforcedParams &&
                guardrails == other.guardrails &&
                keyAlias == other.keyAlias &&
                maxBudget == other.maxBudget &&
                maxParallelRequests == other.maxParallelRequests &&
                metadata == other.metadata &&
                modelMaxBudget == other.modelMaxBudget &&
                modelRpmLimit == other.modelRpmLimit &&
                modelTpmLimit == other.modelTpmLimit &&
                models == other.models &&
                objectPermission == other.objectPermission &&
                permissions == other.permissions &&
                prompts == other.prompts &&
                rotationInterval == other.rotationInterval &&
                routerSettings == other.routerSettings &&
                rpmLimit == other.rpmLimit &&
                rpmLimitType == other.rpmLimitType &&
                spend == other.spend &&
                tags == other.tags &&
                teamId == other.teamId &&
                tempBudgetExpiry == other.tempBudgetExpiry &&
                tempBudgetIncrease == other.tempBudgetIncrease &&
                tpmLimit == other.tpmLimit &&
                tpmLimitType == other.tpmLimitType &&
                userId == other.userId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                key,
                aliases,
                allowedCacheControls,
                allowedPassthroughRoutes,
                allowedRoutes,
                allowedVectorStoreIndexes,
                autoRotate,
                blocked,
                budgetDuration,
                budgetId,
                config,
                duration,
                enforcedParams,
                guardrails,
                keyAlias,
                maxBudget,
                maxParallelRequests,
                metadata,
                modelMaxBudget,
                modelRpmLimit,
                modelTpmLimit,
                models,
                objectPermission,
                permissions,
                prompts,
                rotationInterval,
                routerSettings,
                rpmLimit,
                rpmLimitType,
                spend,
                tags,
                teamId,
                tempBudgetExpiry,
                tempBudgetIncrease,
                tpmLimit,
                tpmLimitType,
                userId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{key=$key, aliases=$aliases, allowedCacheControls=$allowedCacheControls, allowedPassthroughRoutes=$allowedPassthroughRoutes, allowedRoutes=$allowedRoutes, allowedVectorStoreIndexes=$allowedVectorStoreIndexes, autoRotate=$autoRotate, blocked=$blocked, budgetDuration=$budgetDuration, budgetId=$budgetId, config=$config, duration=$duration, enforcedParams=$enforcedParams, guardrails=$guardrails, keyAlias=$keyAlias, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelRpmLimit=$modelRpmLimit, modelTpmLimit=$modelTpmLimit, models=$models, objectPermission=$objectPermission, permissions=$permissions, prompts=$prompts, rotationInterval=$rotationInterval, routerSettings=$routerSettings, rpmLimit=$rpmLimit, rpmLimitType=$rpmLimitType, spend=$spend, tags=$tags, teamId=$teamId, tempBudgetExpiry=$tempBudgetExpiry, tempBudgetIncrease=$tempBudgetIncrease, tpmLimit=$tpmLimit, tpmLimitType=$tpmLimitType, userId=$userId, additionalProperties=$additionalProperties}"
    }

    class Aliases
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Aliases]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Aliases]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(aliases: Aliases) = apply {
                additionalProperties = aliases.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Aliases].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Aliases = Aliases(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Aliases = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Aliases && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Aliases{additionalProperties=$additionalProperties}"
    }

    class AllowedVectorStoreIndex
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val indexName: JsonField<String>,
        private val indexPermissions: JsonField<List<IndexPermission>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("index_name")
            @ExcludeMissing
            indexName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("index_permissions")
            @ExcludeMissing
            indexPermissions: JsonField<List<IndexPermission>> = JsonMissing.of(),
        ) : this(indexName, indexPermissions, mutableMapOf())

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun indexName(): String = indexName.getRequired("index_name")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun indexPermissions(): List<IndexPermission> =
            indexPermissions.getRequired("index_permissions")

        /**
         * Returns the raw JSON value of [indexName].
         *
         * Unlike [indexName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("index_name") @ExcludeMissing fun _indexName(): JsonField<String> = indexName

        /**
         * Returns the raw JSON value of [indexPermissions].
         *
         * Unlike [indexPermissions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("index_permissions")
        @ExcludeMissing
        fun _indexPermissions(): JsonField<List<IndexPermission>> = indexPermissions

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [AllowedVectorStoreIndex].
             *
             * The following fields are required:
             * ```java
             * .indexName()
             * .indexPermissions()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AllowedVectorStoreIndex]. */
        class Builder internal constructor() {

            private var indexName: JsonField<String>? = null
            private var indexPermissions: JsonField<MutableList<IndexPermission>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(allowedVectorStoreIndex: AllowedVectorStoreIndex) = apply {
                indexName = allowedVectorStoreIndex.indexName
                indexPermissions =
                    allowedVectorStoreIndex.indexPermissions.map { it.toMutableList() }
                additionalProperties = allowedVectorStoreIndex.additionalProperties.toMutableMap()
            }

            fun indexName(indexName: String) = indexName(JsonField.of(indexName))

            /**
             * Sets [Builder.indexName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.indexName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun indexName(indexName: JsonField<String>) = apply { this.indexName = indexName }

            fun indexPermissions(indexPermissions: List<IndexPermission>) =
                indexPermissions(JsonField.of(indexPermissions))

            /**
             * Sets [Builder.indexPermissions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.indexPermissions] with a well-typed
             * `List<IndexPermission>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun indexPermissions(indexPermissions: JsonField<List<IndexPermission>>) = apply {
                this.indexPermissions = indexPermissions.map { it.toMutableList() }
            }

            /**
             * Adds a single [IndexPermission] to [indexPermissions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIndexPermission(indexPermission: IndexPermission) = apply {
                indexPermissions =
                    (indexPermissions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("indexPermissions", it).add(indexPermission)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [AllowedVectorStoreIndex].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .indexName()
             * .indexPermissions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AllowedVectorStoreIndex =
                AllowedVectorStoreIndex(
                    checkRequired("indexName", indexName),
                    checkRequired("indexPermissions", indexPermissions).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AllowedVectorStoreIndex = apply {
            if (validated) {
                return@apply
            }

            indexName()
            indexPermissions().forEach { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (indexName.asKnown().isPresent) 1 else 0) +
                (indexPermissions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class IndexPermission
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val READ = of("read")

                @JvmField val WRITE = of("write")

                @JvmStatic fun of(value: String) = IndexPermission(JsonField.of(value))
            }

            /** An enum containing [IndexPermission]'s known values. */
            enum class Known {
                READ,
                WRITE,
            }

            /**
             * An enum containing [IndexPermission]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [IndexPermission] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                READ,
                WRITE,
                /**
                 * An enum member indicating that [IndexPermission] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    READ -> Value.READ
                    WRITE -> Value.WRITE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HanzoInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    READ -> Known.READ
                    WRITE -> Known.WRITE
                    else -> throw HanzoInvalidDataException("Unknown IndexPermission: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws HanzoInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    HanzoInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): IndexPermission = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is IndexPermission && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AllowedVectorStoreIndex &&
                indexName == other.indexName &&
                indexPermissions == other.indexPermissions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(indexName, indexPermissions, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AllowedVectorStoreIndex{indexName=$indexName, indexPermissions=$indexPermissions, additionalProperties=$additionalProperties}"
    }

    class Config
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Config]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Config]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(config: Config) = apply {
                additionalProperties = config.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Config].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Config = Config(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Config = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Config && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Config{additionalProperties=$additionalProperties}"
    }

    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class ModelMaxBudget
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ModelMaxBudget]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ModelMaxBudget]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(modelMaxBudget: ModelMaxBudget) = apply {
                additionalProperties = modelMaxBudget.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ModelMaxBudget].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelMaxBudget = ModelMaxBudget(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ModelMaxBudget = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ModelMaxBudget && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelMaxBudget{additionalProperties=$additionalProperties}"
    }

    class ModelRpmLimit
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ModelRpmLimit]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ModelRpmLimit]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(modelRpmLimit: ModelRpmLimit) = apply {
                additionalProperties = modelRpmLimit.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ModelRpmLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelRpmLimit = ModelRpmLimit(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ModelRpmLimit = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ModelRpmLimit && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelRpmLimit{additionalProperties=$additionalProperties}"
    }

    class ModelTpmLimit
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ModelTpmLimit]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ModelTpmLimit]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(modelTpmLimit: ModelTpmLimit) = apply {
                additionalProperties = modelTpmLimit.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ModelTpmLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelTpmLimit = ModelTpmLimit(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ModelTpmLimit = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ModelTpmLimit && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelTpmLimit{additionalProperties=$additionalProperties}"
    }

    class ObjectPermission
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agentAccessGroups: JsonField<List<String>>,
        private val agents: JsonField<List<String>>,
        private val mcpAccessGroups: JsonField<List<String>>,
        private val mcpServers: JsonField<List<String>>,
        private val mcpToolPermissions: JsonField<McpToolPermissions>,
        private val vectorStores: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agent_access_groups")
            @ExcludeMissing
            agentAccessGroups: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("agents")
            @ExcludeMissing
            agents: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("mcp_access_groups")
            @ExcludeMissing
            mcpAccessGroups: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("mcp_servers")
            @ExcludeMissing
            mcpServers: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("mcp_tool_permissions")
            @ExcludeMissing
            mcpToolPermissions: JsonField<McpToolPermissions> = JsonMissing.of(),
            @JsonProperty("vector_stores")
            @ExcludeMissing
            vectorStores: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            agentAccessGroups,
            agents,
            mcpAccessGroups,
            mcpServers,
            mcpToolPermissions,
            vectorStores,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentAccessGroups(): Optional<List<String>> =
            agentAccessGroups.getOptional("agent_access_groups")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agents(): Optional<List<String>> = agents.getOptional("agents")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcpAccessGroups(): Optional<List<String>> =
            mcpAccessGroups.getOptional("mcp_access_groups")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcpServers(): Optional<List<String>> = mcpServers.getOptional("mcp_servers")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcpToolPermissions(): Optional<McpToolPermissions> =
            mcpToolPermissions.getOptional("mcp_tool_permissions")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vectorStores(): Optional<List<String>> = vectorStores.getOptional("vector_stores")

        /**
         * Returns the raw JSON value of [agentAccessGroups].
         *
         * Unlike [agentAccessGroups], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("agent_access_groups")
        @ExcludeMissing
        fun _agentAccessGroups(): JsonField<List<String>> = agentAccessGroups

        /**
         * Returns the raw JSON value of [agents].
         *
         * Unlike [agents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agents") @ExcludeMissing fun _agents(): JsonField<List<String>> = agents

        /**
         * Returns the raw JSON value of [mcpAccessGroups].
         *
         * Unlike [mcpAccessGroups], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mcp_access_groups")
        @ExcludeMissing
        fun _mcpAccessGroups(): JsonField<List<String>> = mcpAccessGroups

        /**
         * Returns the raw JSON value of [mcpServers].
         *
         * Unlike [mcpServers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mcp_servers")
        @ExcludeMissing
        fun _mcpServers(): JsonField<List<String>> = mcpServers

        /**
         * Returns the raw JSON value of [mcpToolPermissions].
         *
         * Unlike [mcpToolPermissions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("mcp_tool_permissions")
        @ExcludeMissing
        fun _mcpToolPermissions(): JsonField<McpToolPermissions> = mcpToolPermissions

        /**
         * Returns the raw JSON value of [vectorStores].
         *
         * Unlike [vectorStores], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vector_stores")
        @ExcludeMissing
        fun _vectorStores(): JsonField<List<String>> = vectorStores

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ObjectPermission]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ObjectPermission]. */
        class Builder internal constructor() {

            private var agentAccessGroups: JsonField<MutableList<String>>? = null
            private var agents: JsonField<MutableList<String>>? = null
            private var mcpAccessGroups: JsonField<MutableList<String>>? = null
            private var mcpServers: JsonField<MutableList<String>>? = null
            private var mcpToolPermissions: JsonField<McpToolPermissions> = JsonMissing.of()
            private var vectorStores: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(objectPermission: ObjectPermission) = apply {
                agentAccessGroups = objectPermission.agentAccessGroups.map { it.toMutableList() }
                agents = objectPermission.agents.map { it.toMutableList() }
                mcpAccessGroups = objectPermission.mcpAccessGroups.map { it.toMutableList() }
                mcpServers = objectPermission.mcpServers.map { it.toMutableList() }
                mcpToolPermissions = objectPermission.mcpToolPermissions
                vectorStores = objectPermission.vectorStores.map { it.toMutableList() }
                additionalProperties = objectPermission.additionalProperties.toMutableMap()
            }

            fun agentAccessGroups(agentAccessGroups: List<String>?) =
                agentAccessGroups(JsonField.ofNullable(agentAccessGroups))

            /**
             * Alias for calling [Builder.agentAccessGroups] with `agentAccessGroups.orElse(null)`.
             */
            fun agentAccessGroups(agentAccessGroups: Optional<List<String>>) =
                agentAccessGroups(agentAccessGroups.getOrNull())

            /**
             * Sets [Builder.agentAccessGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentAccessGroups] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun agentAccessGroups(agentAccessGroups: JsonField<List<String>>) = apply {
                this.agentAccessGroups = agentAccessGroups.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [agentAccessGroups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAgentAccessGroup(agentAccessGroup: String) = apply {
                agentAccessGroups =
                    (agentAccessGroups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("agentAccessGroups", it).add(agentAccessGroup)
                    }
            }

            fun agents(agents: List<String>?) = agents(JsonField.ofNullable(agents))

            /** Alias for calling [Builder.agents] with `agents.orElse(null)`. */
            fun agents(agents: Optional<List<String>>) = agents(agents.getOrNull())

            /**
             * Sets [Builder.agents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agents] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agents(agents: JsonField<List<String>>) = apply {
                this.agents = agents.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [agents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAgent(agent: String) = apply {
                agents =
                    (agents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("agents", it).add(agent)
                    }
            }

            fun mcpAccessGroups(mcpAccessGroups: List<String>?) =
                mcpAccessGroups(JsonField.ofNullable(mcpAccessGroups))

            /** Alias for calling [Builder.mcpAccessGroups] with `mcpAccessGroups.orElse(null)`. */
            fun mcpAccessGroups(mcpAccessGroups: Optional<List<String>>) =
                mcpAccessGroups(mcpAccessGroups.getOrNull())

            /**
             * Sets [Builder.mcpAccessGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcpAccessGroups] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mcpAccessGroups(mcpAccessGroups: JsonField<List<String>>) = apply {
                this.mcpAccessGroups = mcpAccessGroups.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [mcpAccessGroups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMcpAccessGroup(mcpAccessGroup: String) = apply {
                mcpAccessGroups =
                    (mcpAccessGroups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mcpAccessGroups", it).add(mcpAccessGroup)
                    }
            }

            fun mcpServers(mcpServers: List<String>?) = mcpServers(JsonField.ofNullable(mcpServers))

            /** Alias for calling [Builder.mcpServers] with `mcpServers.orElse(null)`. */
            fun mcpServers(mcpServers: Optional<List<String>>) = mcpServers(mcpServers.getOrNull())

            /**
             * Sets [Builder.mcpServers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcpServers] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mcpServers(mcpServers: JsonField<List<String>>) = apply {
                this.mcpServers = mcpServers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [mcpServers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMcpServer(mcpServer: String) = apply {
                mcpServers =
                    (mcpServers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mcpServers", it).add(mcpServer)
                    }
            }

            fun mcpToolPermissions(mcpToolPermissions: McpToolPermissions?) =
                mcpToolPermissions(JsonField.ofNullable(mcpToolPermissions))

            /**
             * Alias for calling [Builder.mcpToolPermissions] with
             * `mcpToolPermissions.orElse(null)`.
             */
            fun mcpToolPermissions(mcpToolPermissions: Optional<McpToolPermissions>) =
                mcpToolPermissions(mcpToolPermissions.getOrNull())

            /**
             * Sets [Builder.mcpToolPermissions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcpToolPermissions] with a well-typed
             * [McpToolPermissions] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun mcpToolPermissions(mcpToolPermissions: JsonField<McpToolPermissions>) = apply {
                this.mcpToolPermissions = mcpToolPermissions
            }

            fun vectorStores(vectorStores: List<String>?) =
                vectorStores(JsonField.ofNullable(vectorStores))

            /** Alias for calling [Builder.vectorStores] with `vectorStores.orElse(null)`. */
            fun vectorStores(vectorStores: Optional<List<String>>) =
                vectorStores(vectorStores.getOrNull())

            /**
             * Sets [Builder.vectorStores] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorStores] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorStores(vectorStores: JsonField<List<String>>) = apply {
                this.vectorStores = vectorStores.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [vectorStores].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVectorStore(vectorStore: String) = apply {
                vectorStores =
                    (vectorStores ?: JsonField.of(mutableListOf())).also {
                        checkKnown("vectorStores", it).add(vectorStore)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ObjectPermission].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ObjectPermission =
                ObjectPermission(
                    (agentAccessGroups ?: JsonMissing.of()).map { it.toImmutable() },
                    (agents ?: JsonMissing.of()).map { it.toImmutable() },
                    (mcpAccessGroups ?: JsonMissing.of()).map { it.toImmutable() },
                    (mcpServers ?: JsonMissing.of()).map { it.toImmutable() },
                    mcpToolPermissions,
                    (vectorStores ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ObjectPermission = apply {
            if (validated) {
                return@apply
            }

            agentAccessGroups()
            agents()
            mcpAccessGroups()
            mcpServers()
            mcpToolPermissions().ifPresent { it.validate() }
            vectorStores()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (agentAccessGroups.asKnown().getOrNull()?.size ?: 0) +
                (agents.asKnown().getOrNull()?.size ?: 0) +
                (mcpAccessGroups.asKnown().getOrNull()?.size ?: 0) +
                (mcpServers.asKnown().getOrNull()?.size ?: 0) +
                (mcpToolPermissions.asKnown().getOrNull()?.validity() ?: 0) +
                (vectorStores.asKnown().getOrNull()?.size ?: 0)

        class McpToolPermissions
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [McpToolPermissions].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [McpToolPermissions]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mcpToolPermissions: McpToolPermissions) = apply {
                    additionalProperties = mcpToolPermissions.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [McpToolPermissions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): McpToolPermissions =
                    McpToolPermissions(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): McpToolPermissions = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is McpToolPermissions &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "McpToolPermissions{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ObjectPermission &&
                agentAccessGroups == other.agentAccessGroups &&
                agents == other.agents &&
                mcpAccessGroups == other.mcpAccessGroups &&
                mcpServers == other.mcpServers &&
                mcpToolPermissions == other.mcpToolPermissions &&
                vectorStores == other.vectorStores &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                agentAccessGroups,
                agents,
                mcpAccessGroups,
                mcpServers,
                mcpToolPermissions,
                vectorStores,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ObjectPermission{agentAccessGroups=$agentAccessGroups, agents=$agents, mcpAccessGroups=$mcpAccessGroups, mcpServers=$mcpServers, mcpToolPermissions=$mcpToolPermissions, vectorStores=$vectorStores, additionalProperties=$additionalProperties}"
    }

    class Permissions
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Permissions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Permissions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(permissions: Permissions) = apply {
                additionalProperties = permissions.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Permissions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Permissions = Permissions(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Permissions = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Permissions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Permissions{additionalProperties=$additionalProperties}"
    }

    /** Set of params that you can modify via `router.update_settings()`. */
    class RouterSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowedFails: JsonField<Long>,
        private val contextWindowFallbacks: JsonField<List<ContextWindowFallback>>,
        private val cooldownTime: JsonField<Double>,
        private val fallbacks: JsonField<List<Fallback>>,
        private val maxRetries: JsonField<Long>,
        private val modelGroupAlias: JsonField<ModelGroupAlias>,
        private val modelGroupRetryPolicy: JsonField<ModelGroupRetryPolicy>,
        private val numRetries: JsonField<Long>,
        private val retryAfter: JsonField<Double>,
        private val routingStrategy: JsonField<String>,
        private val routingStrategyArgs: JsonField<RoutingStrategyArgs>,
        private val timeout: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allowed_fails")
            @ExcludeMissing
            allowedFails: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("context_window_fallbacks")
            @ExcludeMissing
            contextWindowFallbacks: JsonField<List<ContextWindowFallback>> = JsonMissing.of(),
            @JsonProperty("cooldown_time")
            @ExcludeMissing
            cooldownTime: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fallbacks")
            @ExcludeMissing
            fallbacks: JsonField<List<Fallback>> = JsonMissing.of(),
            @JsonProperty("max_retries")
            @ExcludeMissing
            maxRetries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model_group_alias")
            @ExcludeMissing
            modelGroupAlias: JsonField<ModelGroupAlias> = JsonMissing.of(),
            @JsonProperty("model_group_retry_policy")
            @ExcludeMissing
            modelGroupRetryPolicy: JsonField<ModelGroupRetryPolicy> = JsonMissing.of(),
            @JsonProperty("num_retries")
            @ExcludeMissing
            numRetries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("retry_after")
            @ExcludeMissing
            retryAfter: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("routing_strategy")
            @ExcludeMissing
            routingStrategy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_strategy_args")
            @ExcludeMissing
            routingStrategyArgs: JsonField<RoutingStrategyArgs> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Double> = JsonMissing.of(),
        ) : this(
            allowedFails,
            contextWindowFallbacks,
            cooldownTime,
            fallbacks,
            maxRetries,
            modelGroupAlias,
            modelGroupRetryPolicy,
            numRetries,
            retryAfter,
            routingStrategy,
            routingStrategyArgs,
            timeout,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedFails(): Optional<Long> = allowedFails.getOptional("allowed_fails")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contextWindowFallbacks(): Optional<List<ContextWindowFallback>> =
            contextWindowFallbacks.getOptional("context_window_fallbacks")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cooldownTime(): Optional<Double> = cooldownTime.getOptional("cooldown_time")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fallbacks(): Optional<List<Fallback>> = fallbacks.getOptional("fallbacks")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxRetries(): Optional<Long> = maxRetries.getOptional("max_retries")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelGroupAlias(): Optional<ModelGroupAlias> =
            modelGroupAlias.getOptional("model_group_alias")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun modelGroupRetryPolicy(): Optional<ModelGroupRetryPolicy> =
            modelGroupRetryPolicy.getOptional("model_group_retry_policy")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numRetries(): Optional<Long> = numRetries.getOptional("num_retries")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun retryAfter(): Optional<Double> = retryAfter.getOptional("retry_after")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun routingStrategy(): Optional<String> = routingStrategy.getOptional("routing_strategy")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun routingStrategyArgs(): Optional<RoutingStrategyArgs> =
            routingStrategyArgs.getOptional("routing_strategy_args")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<Double> = timeout.getOptional("timeout")

        /**
         * Returns the raw JSON value of [allowedFails].
         *
         * Unlike [allowedFails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allowed_fails")
        @ExcludeMissing
        fun _allowedFails(): JsonField<Long> = allowedFails

        /**
         * Returns the raw JSON value of [contextWindowFallbacks].
         *
         * Unlike [contextWindowFallbacks], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("context_window_fallbacks")
        @ExcludeMissing
        fun _contextWindowFallbacks(): JsonField<List<ContextWindowFallback>> =
            contextWindowFallbacks

        /**
         * Returns the raw JSON value of [cooldownTime].
         *
         * Unlike [cooldownTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cooldown_time")
        @ExcludeMissing
        fun _cooldownTime(): JsonField<Double> = cooldownTime

        /**
         * Returns the raw JSON value of [fallbacks].
         *
         * Unlike [fallbacks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fallbacks")
        @ExcludeMissing
        fun _fallbacks(): JsonField<List<Fallback>> = fallbacks

        /**
         * Returns the raw JSON value of [maxRetries].
         *
         * Unlike [maxRetries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_retries") @ExcludeMissing fun _maxRetries(): JsonField<Long> = maxRetries

        /**
         * Returns the raw JSON value of [modelGroupAlias].
         *
         * Unlike [modelGroupAlias], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("model_group_alias")
        @ExcludeMissing
        fun _modelGroupAlias(): JsonField<ModelGroupAlias> = modelGroupAlias

        /**
         * Returns the raw JSON value of [modelGroupRetryPolicy].
         *
         * Unlike [modelGroupRetryPolicy], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("model_group_retry_policy")
        @ExcludeMissing
        fun _modelGroupRetryPolicy(): JsonField<ModelGroupRetryPolicy> = modelGroupRetryPolicy

        /**
         * Returns the raw JSON value of [numRetries].
         *
         * Unlike [numRetries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_retries") @ExcludeMissing fun _numRetries(): JsonField<Long> = numRetries

        /**
         * Returns the raw JSON value of [retryAfter].
         *
         * Unlike [retryAfter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retry_after")
        @ExcludeMissing
        fun _retryAfter(): JsonField<Double> = retryAfter

        /**
         * Returns the raw JSON value of [routingStrategy].
         *
         * Unlike [routingStrategy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_strategy")
        @ExcludeMissing
        fun _routingStrategy(): JsonField<String> = routingStrategy

        /**
         * Returns the raw JSON value of [routingStrategyArgs].
         *
         * Unlike [routingStrategyArgs], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("routing_strategy_args")
        @ExcludeMissing
        fun _routingStrategyArgs(): JsonField<RoutingStrategyArgs> = routingStrategyArgs

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Double> = timeout

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [RouterSettings]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RouterSettings]. */
        class Builder internal constructor() {

            private var allowedFails: JsonField<Long> = JsonMissing.of()
            private var contextWindowFallbacks: JsonField<MutableList<ContextWindowFallback>>? =
                null
            private var cooldownTime: JsonField<Double> = JsonMissing.of()
            private var fallbacks: JsonField<MutableList<Fallback>>? = null
            private var maxRetries: JsonField<Long> = JsonMissing.of()
            private var modelGroupAlias: JsonField<ModelGroupAlias> = JsonMissing.of()
            private var modelGroupRetryPolicy: JsonField<ModelGroupRetryPolicy> = JsonMissing.of()
            private var numRetries: JsonField<Long> = JsonMissing.of()
            private var retryAfter: JsonField<Double> = JsonMissing.of()
            private var routingStrategy: JsonField<String> = JsonMissing.of()
            private var routingStrategyArgs: JsonField<RoutingStrategyArgs> = JsonMissing.of()
            private var timeout: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(routerSettings: RouterSettings) = apply {
                allowedFails = routerSettings.allowedFails
                contextWindowFallbacks =
                    routerSettings.contextWindowFallbacks.map { it.toMutableList() }
                cooldownTime = routerSettings.cooldownTime
                fallbacks = routerSettings.fallbacks.map { it.toMutableList() }
                maxRetries = routerSettings.maxRetries
                modelGroupAlias = routerSettings.modelGroupAlias
                modelGroupRetryPolicy = routerSettings.modelGroupRetryPolicy
                numRetries = routerSettings.numRetries
                retryAfter = routerSettings.retryAfter
                routingStrategy = routerSettings.routingStrategy
                routingStrategyArgs = routerSettings.routingStrategyArgs
                timeout = routerSettings.timeout
                additionalProperties = routerSettings.additionalProperties.toMutableMap()
            }

            fun allowedFails(allowedFails: Long?) = allowedFails(JsonField.ofNullable(allowedFails))

            /**
             * Alias for [Builder.allowedFails].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun allowedFails(allowedFails: Long) = allowedFails(allowedFails as Long?)

            /** Alias for calling [Builder.allowedFails] with `allowedFails.orElse(null)`. */
            fun allowedFails(allowedFails: Optional<Long>) = allowedFails(allowedFails.getOrNull())

            /**
             * Sets [Builder.allowedFails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedFails] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowedFails(allowedFails: JsonField<Long>) = apply {
                this.allowedFails = allowedFails
            }

            fun contextWindowFallbacks(contextWindowFallbacks: List<ContextWindowFallback>?) =
                contextWindowFallbacks(JsonField.ofNullable(contextWindowFallbacks))

            /**
             * Alias for calling [Builder.contextWindowFallbacks] with
             * `contextWindowFallbacks.orElse(null)`.
             */
            fun contextWindowFallbacks(
                contextWindowFallbacks: Optional<List<ContextWindowFallback>>
            ) = contextWindowFallbacks(contextWindowFallbacks.getOrNull())

            /**
             * Sets [Builder.contextWindowFallbacks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contextWindowFallbacks] with a well-typed
             * `List<ContextWindowFallback>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun contextWindowFallbacks(
                contextWindowFallbacks: JsonField<List<ContextWindowFallback>>
            ) = apply {
                this.contextWindowFallbacks = contextWindowFallbacks.map { it.toMutableList() }
            }

            /**
             * Adds a single [ContextWindowFallback] to [contextWindowFallbacks].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContextWindowFallback(contextWindowFallback: ContextWindowFallback) = apply {
                contextWindowFallbacks =
                    (contextWindowFallbacks ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contextWindowFallbacks", it).add(contextWindowFallback)
                    }
            }

            fun cooldownTime(cooldownTime: Double?) =
                cooldownTime(JsonField.ofNullable(cooldownTime))

            /**
             * Alias for [Builder.cooldownTime].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cooldownTime(cooldownTime: Double) = cooldownTime(cooldownTime as Double?)

            /** Alias for calling [Builder.cooldownTime] with `cooldownTime.orElse(null)`. */
            fun cooldownTime(cooldownTime: Optional<Double>) =
                cooldownTime(cooldownTime.getOrNull())

            /**
             * Sets [Builder.cooldownTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cooldownTime] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cooldownTime(cooldownTime: JsonField<Double>) = apply {
                this.cooldownTime = cooldownTime
            }

            fun fallbacks(fallbacks: List<Fallback>?) = fallbacks(JsonField.ofNullable(fallbacks))

            /** Alias for calling [Builder.fallbacks] with `fallbacks.orElse(null)`. */
            fun fallbacks(fallbacks: Optional<List<Fallback>>) = fallbacks(fallbacks.getOrNull())

            /**
             * Sets [Builder.fallbacks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fallbacks] with a well-typed `List<Fallback>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fallbacks(fallbacks: JsonField<List<Fallback>>) = apply {
                this.fallbacks = fallbacks.map { it.toMutableList() }
            }

            /**
             * Adds a single [Fallback] to [fallbacks].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFallback(fallback: Fallback) = apply {
                fallbacks =
                    (fallbacks ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fallbacks", it).add(fallback)
                    }
            }

            fun maxRetries(maxRetries: Long?) = maxRetries(JsonField.ofNullable(maxRetries))

            /**
             * Alias for [Builder.maxRetries].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxRetries(maxRetries: Long) = maxRetries(maxRetries as Long?)

            /** Alias for calling [Builder.maxRetries] with `maxRetries.orElse(null)`. */
            fun maxRetries(maxRetries: Optional<Long>) = maxRetries(maxRetries.getOrNull())

            /**
             * Sets [Builder.maxRetries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxRetries] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRetries(maxRetries: JsonField<Long>) = apply { this.maxRetries = maxRetries }

            fun modelGroupAlias(modelGroupAlias: ModelGroupAlias?) =
                modelGroupAlias(JsonField.ofNullable(modelGroupAlias))

            /** Alias for calling [Builder.modelGroupAlias] with `modelGroupAlias.orElse(null)`. */
            fun modelGroupAlias(modelGroupAlias: Optional<ModelGroupAlias>) =
                modelGroupAlias(modelGroupAlias.getOrNull())

            /**
             * Sets [Builder.modelGroupAlias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelGroupAlias] with a well-typed [ModelGroupAlias]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun modelGroupAlias(modelGroupAlias: JsonField<ModelGroupAlias>) = apply {
                this.modelGroupAlias = modelGroupAlias
            }

            fun modelGroupRetryPolicy(modelGroupRetryPolicy: ModelGroupRetryPolicy?) =
                modelGroupRetryPolicy(JsonField.ofNullable(modelGroupRetryPolicy))

            /**
             * Alias for calling [Builder.modelGroupRetryPolicy] with
             * `modelGroupRetryPolicy.orElse(null)`.
             */
            fun modelGroupRetryPolicy(modelGroupRetryPolicy: Optional<ModelGroupRetryPolicy>) =
                modelGroupRetryPolicy(modelGroupRetryPolicy.getOrNull())

            /**
             * Sets [Builder.modelGroupRetryPolicy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelGroupRetryPolicy] with a well-typed
             * [ModelGroupRetryPolicy] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun modelGroupRetryPolicy(modelGroupRetryPolicy: JsonField<ModelGroupRetryPolicy>) =
                apply {
                    this.modelGroupRetryPolicy = modelGroupRetryPolicy
                }

            fun numRetries(numRetries: Long?) = numRetries(JsonField.ofNullable(numRetries))

            /**
             * Alias for [Builder.numRetries].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numRetries(numRetries: Long) = numRetries(numRetries as Long?)

            /** Alias for calling [Builder.numRetries] with `numRetries.orElse(null)`. */
            fun numRetries(numRetries: Optional<Long>) = numRetries(numRetries.getOrNull())

            /**
             * Sets [Builder.numRetries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numRetries] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numRetries(numRetries: JsonField<Long>) = apply { this.numRetries = numRetries }

            fun retryAfter(retryAfter: Double?) = retryAfter(JsonField.ofNullable(retryAfter))

            /**
             * Alias for [Builder.retryAfter].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun retryAfter(retryAfter: Double) = retryAfter(retryAfter as Double?)

            /** Alias for calling [Builder.retryAfter] with `retryAfter.orElse(null)`. */
            fun retryAfter(retryAfter: Optional<Double>) = retryAfter(retryAfter.getOrNull())

            /**
             * Sets [Builder.retryAfter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retryAfter] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retryAfter(retryAfter: JsonField<Double>) = apply { this.retryAfter = retryAfter }

            fun routingStrategy(routingStrategy: String?) =
                routingStrategy(JsonField.ofNullable(routingStrategy))

            /** Alias for calling [Builder.routingStrategy] with `routingStrategy.orElse(null)`. */
            fun routingStrategy(routingStrategy: Optional<String>) =
                routingStrategy(routingStrategy.getOrNull())

            /**
             * Sets [Builder.routingStrategy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingStrategy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingStrategy(routingStrategy: JsonField<String>) = apply {
                this.routingStrategy = routingStrategy
            }

            fun routingStrategyArgs(routingStrategyArgs: RoutingStrategyArgs?) =
                routingStrategyArgs(JsonField.ofNullable(routingStrategyArgs))

            /**
             * Alias for calling [Builder.routingStrategyArgs] with
             * `routingStrategyArgs.orElse(null)`.
             */
            fun routingStrategyArgs(routingStrategyArgs: Optional<RoutingStrategyArgs>) =
                routingStrategyArgs(routingStrategyArgs.getOrNull())

            /**
             * Sets [Builder.routingStrategyArgs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingStrategyArgs] with a well-typed
             * [RoutingStrategyArgs] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun routingStrategyArgs(routingStrategyArgs: JsonField<RoutingStrategyArgs>) = apply {
                this.routingStrategyArgs = routingStrategyArgs
            }

            fun timeout(timeout: Double?) = timeout(JsonField.ofNullable(timeout))

            /**
             * Alias for [Builder.timeout].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun timeout(timeout: Double) = timeout(timeout as Double?)

            /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
            fun timeout(timeout: Optional<Double>) = timeout(timeout.getOrNull())

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Double>) = apply { this.timeout = timeout }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [RouterSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RouterSettings =
                RouterSettings(
                    allowedFails,
                    (contextWindowFallbacks ?: JsonMissing.of()).map { it.toImmutable() },
                    cooldownTime,
                    (fallbacks ?: JsonMissing.of()).map { it.toImmutable() },
                    maxRetries,
                    modelGroupAlias,
                    modelGroupRetryPolicy,
                    numRetries,
                    retryAfter,
                    routingStrategy,
                    routingStrategyArgs,
                    timeout,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RouterSettings = apply {
            if (validated) {
                return@apply
            }

            allowedFails()
            contextWindowFallbacks().ifPresent { it.forEach { it.validate() } }
            cooldownTime()
            fallbacks().ifPresent { it.forEach { it.validate() } }
            maxRetries()
            modelGroupAlias().ifPresent { it.validate() }
            modelGroupRetryPolicy().ifPresent { it.validate() }
            numRetries()
            retryAfter()
            routingStrategy()
            routingStrategyArgs().ifPresent { it.validate() }
            timeout()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (allowedFails.asKnown().isPresent) 1 else 0) +
                (contextWindowFallbacks.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (cooldownTime.asKnown().isPresent) 1 else 0) +
                (fallbacks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (maxRetries.asKnown().isPresent) 1 else 0) +
                (modelGroupAlias.asKnown().getOrNull()?.validity() ?: 0) +
                (modelGroupRetryPolicy.asKnown().getOrNull()?.validity() ?: 0) +
                (if (numRetries.asKnown().isPresent) 1 else 0) +
                (if (retryAfter.asKnown().isPresent) 1 else 0) +
                (if (routingStrategy.asKnown().isPresent) 1 else 0) +
                (routingStrategyArgs.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timeout.asKnown().isPresent) 1 else 0)

        class ContextWindowFallback
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [ContextWindowFallback].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ContextWindowFallback]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contextWindowFallback: ContextWindowFallback) = apply {
                    additionalProperties = contextWindowFallback.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ContextWindowFallback].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ContextWindowFallback =
                    ContextWindowFallback(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): ContextWindowFallback = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ContextWindowFallback &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ContextWindowFallback{additionalProperties=$additionalProperties}"
        }

        class Fallback
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Fallback]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Fallback]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(fallback: Fallback) = apply {
                    additionalProperties = fallback.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Fallback].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Fallback = Fallback(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Fallback = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Fallback && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Fallback{additionalProperties=$additionalProperties}"
        }

        class ModelGroupAlias
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [ModelGroupAlias]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ModelGroupAlias]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(modelGroupAlias: ModelGroupAlias) = apply {
                    additionalProperties = modelGroupAlias.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ModelGroupAlias].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ModelGroupAlias = ModelGroupAlias(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): ModelGroupAlias = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelGroupAlias &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "ModelGroupAlias{additionalProperties=$additionalProperties}"
        }

        class ModelGroupRetryPolicy
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [ModelGroupRetryPolicy].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ModelGroupRetryPolicy]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(modelGroupRetryPolicy: ModelGroupRetryPolicy) = apply {
                    additionalProperties = modelGroupRetryPolicy.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ModelGroupRetryPolicy].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ModelGroupRetryPolicy =
                    ModelGroupRetryPolicy(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): ModelGroupRetryPolicy = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelGroupRetryPolicy &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ModelGroupRetryPolicy{additionalProperties=$additionalProperties}"
        }

        class RoutingStrategyArgs
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [RoutingStrategyArgs].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RoutingStrategyArgs]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(routingStrategyArgs: RoutingStrategyArgs) = apply {
                    additionalProperties = routingStrategyArgs.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [RoutingStrategyArgs].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RoutingStrategyArgs =
                    RoutingStrategyArgs(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): RoutingStrategyArgs = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: HanzoInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RoutingStrategyArgs &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RoutingStrategyArgs{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RouterSettings &&
                allowedFails == other.allowedFails &&
                contextWindowFallbacks == other.contextWindowFallbacks &&
                cooldownTime == other.cooldownTime &&
                fallbacks == other.fallbacks &&
                maxRetries == other.maxRetries &&
                modelGroupAlias == other.modelGroupAlias &&
                modelGroupRetryPolicy == other.modelGroupRetryPolicy &&
                numRetries == other.numRetries &&
                retryAfter == other.retryAfter &&
                routingStrategy == other.routingStrategy &&
                routingStrategyArgs == other.routingStrategyArgs &&
                timeout == other.timeout &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowedFails,
                contextWindowFallbacks,
                cooldownTime,
                fallbacks,
                maxRetries,
                modelGroupAlias,
                modelGroupRetryPolicy,
                numRetries,
                retryAfter,
                routingStrategy,
                routingStrategyArgs,
                timeout,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RouterSettings{allowedFails=$allowedFails, contextWindowFallbacks=$contextWindowFallbacks, cooldownTime=$cooldownTime, fallbacks=$fallbacks, maxRetries=$maxRetries, modelGroupAlias=$modelGroupAlias, modelGroupRetryPolicy=$modelGroupRetryPolicy, numRetries=$numRetries, retryAfter=$retryAfter, routingStrategy=$routingStrategy, routingStrategyArgs=$routingStrategyArgs, timeout=$timeout, additionalProperties=$additionalProperties}"
    }

    class RpmLimitType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val GUARANTEED_THROUGHPUT = of("guaranteed_throughput")

            @JvmField val BEST_EFFORT_THROUGHPUT = of("best_effort_throughput")

            @JvmField val DYNAMIC = of("dynamic")

            @JvmStatic fun of(value: String) = RpmLimitType(JsonField.of(value))
        }

        /** An enum containing [RpmLimitType]'s known values. */
        enum class Known {
            GUARANTEED_THROUGHPUT,
            BEST_EFFORT_THROUGHPUT,
            DYNAMIC,
        }

        /**
         * An enum containing [RpmLimitType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RpmLimitType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GUARANTEED_THROUGHPUT,
            BEST_EFFORT_THROUGHPUT,
            DYNAMIC,
            /**
             * An enum member indicating that [RpmLimitType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GUARANTEED_THROUGHPUT -> Value.GUARANTEED_THROUGHPUT
                BEST_EFFORT_THROUGHPUT -> Value.BEST_EFFORT_THROUGHPUT
                DYNAMIC -> Value.DYNAMIC
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HanzoInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                GUARANTEED_THROUGHPUT -> Known.GUARANTEED_THROUGHPUT
                BEST_EFFORT_THROUGHPUT -> Known.BEST_EFFORT_THROUGHPUT
                DYNAMIC -> Known.DYNAMIC
                else -> throw HanzoInvalidDataException("Unknown RpmLimitType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HanzoInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HanzoInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): RpmLimitType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RpmLimitType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TpmLimitType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val GUARANTEED_THROUGHPUT = of("guaranteed_throughput")

            @JvmField val BEST_EFFORT_THROUGHPUT = of("best_effort_throughput")

            @JvmField val DYNAMIC = of("dynamic")

            @JvmStatic fun of(value: String) = TpmLimitType(JsonField.of(value))
        }

        /** An enum containing [TpmLimitType]'s known values. */
        enum class Known {
            GUARANTEED_THROUGHPUT,
            BEST_EFFORT_THROUGHPUT,
            DYNAMIC,
        }

        /**
         * An enum containing [TpmLimitType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TpmLimitType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GUARANTEED_THROUGHPUT,
            BEST_EFFORT_THROUGHPUT,
            DYNAMIC,
            /**
             * An enum member indicating that [TpmLimitType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GUARANTEED_THROUGHPUT -> Value.GUARANTEED_THROUGHPUT
                BEST_EFFORT_THROUGHPUT -> Value.BEST_EFFORT_THROUGHPUT
                DYNAMIC -> Value.DYNAMIC
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HanzoInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                GUARANTEED_THROUGHPUT -> Known.GUARANTEED_THROUGHPUT
                BEST_EFFORT_THROUGHPUT -> Known.BEST_EFFORT_THROUGHPUT
                DYNAMIC -> Known.DYNAMIC
                else -> throw HanzoInvalidDataException("Unknown TpmLimitType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HanzoInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HanzoInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): TpmLimitType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HanzoInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TpmLimitType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KeyUpdateParams &&
            litellmChangedBy == other.litellmChangedBy &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(litellmChangedBy, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "KeyUpdateParams{litellmChangedBy=$litellmChangedBy, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
