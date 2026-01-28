// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.organization

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.checkKnown
import ai.hanzo.api.core.checkRequired
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

class OrganizationAddMemberResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val organizationId: JsonField<String>,
    private val updatedOrganizationMemberships: JsonField<List<OrganizationMembershipTable>>,
    private val updatedUsers: JsonField<List<UpdatedUser>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_organization_memberships")
        @ExcludeMissing
        updatedOrganizationMemberships: JsonField<List<OrganizationMembershipTable>> =
            JsonMissing.of(),
        @JsonProperty("updated_users")
        @ExcludeMissing
        updatedUsers: JsonField<List<UpdatedUser>> = JsonMissing.of(),
    ) : this(organizationId, updatedOrganizationMemberships, updatedUsers, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationId(): String = organizationId.getRequired("organization_id")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedOrganizationMemberships(): List<OrganizationMembershipTable> =
        updatedOrganizationMemberships.getRequired("updated_organization_memberships")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedUsers(): List<UpdatedUser> = updatedUsers.getRequired("updated_users")

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [updatedOrganizationMemberships].
     *
     * Unlike [updatedOrganizationMemberships], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("updated_organization_memberships")
    @ExcludeMissing
    fun _updatedOrganizationMemberships(): JsonField<List<OrganizationMembershipTable>> =
        updatedOrganizationMemberships

    /**
     * Returns the raw JSON value of [updatedUsers].
     *
     * Unlike [updatedUsers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_users")
    @ExcludeMissing
    fun _updatedUsers(): JsonField<List<UpdatedUser>> = updatedUsers

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
         * Returns a mutable builder for constructing an instance of
         * [OrganizationAddMemberResponse].
         *
         * The following fields are required:
         * ```java
         * .organizationId()
         * .updatedOrganizationMemberships()
         * .updatedUsers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrganizationAddMemberResponse]. */
    class Builder internal constructor() {

        private var organizationId: JsonField<String>? = null
        private var updatedOrganizationMemberships:
            JsonField<MutableList<OrganizationMembershipTable>>? =
            null
        private var updatedUsers: JsonField<MutableList<UpdatedUser>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationAddMemberResponse: OrganizationAddMemberResponse) = apply {
            organizationId = organizationAddMemberResponse.organizationId
            updatedOrganizationMemberships =
                organizationAddMemberResponse.updatedOrganizationMemberships.map {
                    it.toMutableList()
                }
            updatedUsers = organizationAddMemberResponse.updatedUsers.map { it.toMutableList() }
            additionalProperties = organizationAddMemberResponse.additionalProperties.toMutableMap()
        }

        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        fun updatedOrganizationMemberships(
            updatedOrganizationMemberships: List<OrganizationMembershipTable>
        ) = updatedOrganizationMemberships(JsonField.of(updatedOrganizationMemberships))

        /**
         * Sets [Builder.updatedOrganizationMemberships] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedOrganizationMemberships] with a well-typed
         * `List<OrganizationMembershipTable>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun updatedOrganizationMemberships(
            updatedOrganizationMemberships: JsonField<List<OrganizationMembershipTable>>
        ) = apply {
            this.updatedOrganizationMemberships =
                updatedOrganizationMemberships.map { it.toMutableList() }
        }

        /**
         * Adds a single [OrganizationMembershipTable] to [updatedOrganizationMemberships].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUpdatedOrganizationMembership(
            updatedOrganizationMembership: OrganizationMembershipTable
        ) = apply {
            updatedOrganizationMemberships =
                (updatedOrganizationMemberships ?: JsonField.of(mutableListOf())).also {
                    checkKnown("updatedOrganizationMemberships", it)
                        .add(updatedOrganizationMembership)
                }
        }

        fun updatedUsers(updatedUsers: List<UpdatedUser>) = updatedUsers(JsonField.of(updatedUsers))

        /**
         * Sets [Builder.updatedUsers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedUsers] with a well-typed `List<UpdatedUser>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun updatedUsers(updatedUsers: JsonField<List<UpdatedUser>>) = apply {
            this.updatedUsers = updatedUsers.map { it.toMutableList() }
        }

        /**
         * Adds a single [UpdatedUser] to [updatedUsers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUpdatedUser(updatedUser: UpdatedUser) = apply {
            updatedUsers =
                (updatedUsers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("updatedUsers", it).add(updatedUser)
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
         * Returns an immutable instance of [OrganizationAddMemberResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .organizationId()
         * .updatedOrganizationMemberships()
         * .updatedUsers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationAddMemberResponse =
            OrganizationAddMemberResponse(
                checkRequired("organizationId", organizationId),
                checkRequired("updatedOrganizationMemberships", updatedOrganizationMemberships)
                    .map { it.toImmutable() },
                checkRequired("updatedUsers", updatedUsers).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrganizationAddMemberResponse = apply {
        if (validated) {
            return@apply
        }

        organizationId()
        updatedOrganizationMemberships().forEach { it.validate() }
        updatedUsers().forEach { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (organizationId.asKnown().isPresent) 1 else 0) +
            (updatedOrganizationMemberships.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (updatedUsers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class UpdatedUser
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val userId: JsonField<String>,
        private val budgetDuration: JsonField<String>,
        private val budgetResetAt: JsonField<OffsetDateTime>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val maxBudget: JsonField<Double>,
        private val metadata: JsonField<Metadata>,
        private val modelMaxBudget: JsonField<ModelMaxBudget>,
        private val modelSpend: JsonField<ModelSpend>,
        private val models: JsonField<List<JsonValue>>,
        private val objectPermission: JsonField<ObjectPermission>,
        private val organizationMemberships: JsonField<List<OrganizationMembershipTable>>,
        private val rpmLimit: JsonField<Long>,
        private val spend: JsonField<Double>,
        private val ssoUserId: JsonField<String>,
        private val teams: JsonField<List<String>>,
        private val tpmLimit: JsonField<Long>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val userAlias: JsonField<String>,
        private val userEmail: JsonField<String>,
        private val userRole: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("budget_reset_at")
            @ExcludeMissing
            budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("model_max_budget")
            @ExcludeMissing
            modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of(),
            @JsonProperty("model_spend")
            @ExcludeMissing
            modelSpend: JsonField<ModelSpend> = JsonMissing.of(),
            @JsonProperty("models")
            @ExcludeMissing
            models: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("object_permission")
            @ExcludeMissing
            objectPermission: JsonField<ObjectPermission> = JsonMissing.of(),
            @JsonProperty("organization_memberships")
            @ExcludeMissing
            organizationMemberships: JsonField<List<OrganizationMembershipTable>> =
                JsonMissing.of(),
            @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("sso_user_id")
            @ExcludeMissing
            ssoUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("teams")
            @ExcludeMissing
            teams: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("user_alias")
            @ExcludeMissing
            userAlias: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_email")
            @ExcludeMissing
            userEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_role")
            @ExcludeMissing
            userRole: JsonField<String> = JsonMissing.of(),
        ) : this(
            userId,
            budgetDuration,
            budgetResetAt,
            createdAt,
            maxBudget,
            metadata,
            modelMaxBudget,
            modelSpend,
            models,
            objectPermission,
            organizationMemberships,
            rpmLimit,
            spend,
            ssoUserId,
            teams,
            tpmLimit,
            updatedAt,
            userAlias,
            userEmail,
            userRole,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userId(): String = userId.getRequired("user_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetDuration(): Optional<String> = budgetDuration.getOptional("budget_duration")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetResetAt(): Optional<OffsetDateTime> = budgetResetAt.getOptional("budget_reset_at")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudget(): Optional<Double> = maxBudget.getOptional("max_budget")

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
        fun modelSpend(): Optional<ModelSpend> = modelSpend.getOptional("model_spend")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun models(): Optional<List<JsonValue>> = models.getOptional("models")

        /**
         * Represents a LiteLLM_ObjectPermissionTable record
         *
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectPermission(): Optional<ObjectPermission> =
            objectPermission.getOptional("object_permission")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationMemberships(): Optional<List<OrganizationMembershipTable>> =
            organizationMemberships.getOptional("organization_memberships")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rpmLimit(): Optional<Long> = rpmLimit.getOptional("rpm_limit")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun spend(): Optional<Double> = spend.getOptional("spend")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ssoUserId(): Optional<String> = ssoUserId.getOptional("sso_user_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun teams(): Optional<List<String>> = teams.getOptional("teams")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tpmLimit(): Optional<Long> = tpmLimit.getOptional("tpm_limit")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userAlias(): Optional<String> = userAlias.getOptional("user_alias")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userEmail(): Optional<String> = userEmail.getOptional("user_email")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userRole(): Optional<String> = userRole.getOptional("user_role")

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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
         * Returns the raw JSON value of [budgetResetAt].
         *
         * Unlike [budgetResetAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("budget_reset_at")
        @ExcludeMissing
        fun _budgetResetAt(): JsonField<OffsetDateTime> = budgetResetAt

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [maxBudget].
         *
         * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

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
         * Returns the raw JSON value of [modelSpend].
         *
         * Unlike [modelSpend], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_spend")
        @ExcludeMissing
        fun _modelSpend(): JsonField<ModelSpend> = modelSpend

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
         * Returns the raw JSON value of [organizationMemberships].
         *
         * Unlike [organizationMemberships], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("organization_memberships")
        @ExcludeMissing
        fun _organizationMemberships(): JsonField<List<OrganizationMembershipTable>> =
            organizationMemberships

        /**
         * Returns the raw JSON value of [rpmLimit].
         *
         * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

        /**
         * Returns the raw JSON value of [spend].
         *
         * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

        /**
         * Returns the raw JSON value of [ssoUserId].
         *
         * Unlike [ssoUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sso_user_id") @ExcludeMissing fun _ssoUserId(): JsonField<String> = ssoUserId

        /**
         * Returns the raw JSON value of [teams].
         *
         * Unlike [teams], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("teams") @ExcludeMissing fun _teams(): JsonField<List<String>> = teams

        /**
         * Returns the raw JSON value of [tpmLimit].
         *
         * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [userAlias].
         *
         * Unlike [userAlias], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_alias") @ExcludeMissing fun _userAlias(): JsonField<String> = userAlias

        /**
         * Returns the raw JSON value of [userEmail].
         *
         * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_email") @ExcludeMissing fun _userEmail(): JsonField<String> = userEmail

        /**
         * Returns the raw JSON value of [userRole].
         *
         * Unlike [userRole], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_role") @ExcludeMissing fun _userRole(): JsonField<String> = userRole

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
             * Returns a mutable builder for constructing an instance of [UpdatedUser].
             *
             * The following fields are required:
             * ```java
             * .userId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UpdatedUser]. */
        class Builder internal constructor() {

            private var userId: JsonField<String>? = null
            private var budgetDuration: JsonField<String> = JsonMissing.of()
            private var budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of()
            private var modelSpend: JsonField<ModelSpend> = JsonMissing.of()
            private var models: JsonField<MutableList<JsonValue>>? = null
            private var objectPermission: JsonField<ObjectPermission> = JsonMissing.of()
            private var organizationMemberships:
                JsonField<MutableList<OrganizationMembershipTable>>? =
                null
            private var rpmLimit: JsonField<Long> = JsonMissing.of()
            private var spend: JsonField<Double> = JsonMissing.of()
            private var ssoUserId: JsonField<String> = JsonMissing.of()
            private var teams: JsonField<MutableList<String>>? = null
            private var tpmLimit: JsonField<Long> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var userAlias: JsonField<String> = JsonMissing.of()
            private var userEmail: JsonField<String> = JsonMissing.of()
            private var userRole: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(updatedUser: UpdatedUser) = apply {
                userId = updatedUser.userId
                budgetDuration = updatedUser.budgetDuration
                budgetResetAt = updatedUser.budgetResetAt
                createdAt = updatedUser.createdAt
                maxBudget = updatedUser.maxBudget
                metadata = updatedUser.metadata
                modelMaxBudget = updatedUser.modelMaxBudget
                modelSpend = updatedUser.modelSpend
                models = updatedUser.models.map { it.toMutableList() }
                objectPermission = updatedUser.objectPermission
                organizationMemberships =
                    updatedUser.organizationMemberships.map { it.toMutableList() }
                rpmLimit = updatedUser.rpmLimit
                spend = updatedUser.spend
                ssoUserId = updatedUser.ssoUserId
                teams = updatedUser.teams.map { it.toMutableList() }
                tpmLimit = updatedUser.tpmLimit
                updatedAt = updatedUser.updatedAt
                userAlias = updatedUser.userAlias
                userEmail = updatedUser.userEmail
                userRole = updatedUser.userRole
                additionalProperties = updatedUser.additionalProperties.toMutableMap()
            }

            fun userId(userId: String) = userId(JsonField.of(userId))

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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

            fun budgetResetAt(budgetResetAt: OffsetDateTime?) =
                budgetResetAt(JsonField.ofNullable(budgetResetAt))

            /** Alias for calling [Builder.budgetResetAt] with `budgetResetAt.orElse(null)`. */
            fun budgetResetAt(budgetResetAt: Optional<OffsetDateTime>) =
                budgetResetAt(budgetResetAt.getOrNull())

            /**
             * Sets [Builder.budgetResetAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.budgetResetAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun budgetResetAt(budgetResetAt: JsonField<OffsetDateTime>) = apply {
                this.budgetResetAt = budgetResetAt
            }

            fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

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

            fun modelSpend(modelSpend: ModelSpend?) = modelSpend(JsonField.ofNullable(modelSpend))

            /** Alias for calling [Builder.modelSpend] with `modelSpend.orElse(null)`. */
            fun modelSpend(modelSpend: Optional<ModelSpend>) = modelSpend(modelSpend.getOrNull())

            /**
             * Sets [Builder.modelSpend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelSpend] with a well-typed [ModelSpend] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelSpend(modelSpend: JsonField<ModelSpend>) = apply {
                this.modelSpend = modelSpend
            }

            fun models(models: List<JsonValue>) = models(JsonField.of(models))

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

            /** Represents a LiteLLM_ObjectPermissionTable record */
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

            fun organizationMemberships(
                organizationMemberships: List<OrganizationMembershipTable>?
            ) = organizationMemberships(JsonField.ofNullable(organizationMemberships))

            /**
             * Alias for calling [Builder.organizationMemberships] with
             * `organizationMemberships.orElse(null)`.
             */
            fun organizationMemberships(
                organizationMemberships: Optional<List<OrganizationMembershipTable>>
            ) = organizationMemberships(organizationMemberships.getOrNull())

            /**
             * Sets [Builder.organizationMemberships] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationMemberships] with a well-typed
             * `List<OrganizationMembershipTable>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun organizationMemberships(
                organizationMemberships: JsonField<List<OrganizationMembershipTable>>
            ) = apply {
                this.organizationMemberships = organizationMemberships.map { it.toMutableList() }
            }

            /**
             * Adds a single [OrganizationMembershipTable] to [organizationMemberships].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOrganizationMembership(organizationMembership: OrganizationMembershipTable) =
                apply {
                    organizationMemberships =
                        (organizationMemberships ?: JsonField.of(mutableListOf())).also {
                            checkKnown("organizationMemberships", it).add(organizationMembership)
                        }
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

            fun spend(spend: Double) = spend(JsonField.of(spend))

            /**
             * Sets [Builder.spend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spend] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

            fun ssoUserId(ssoUserId: String?) = ssoUserId(JsonField.ofNullable(ssoUserId))

            /** Alias for calling [Builder.ssoUserId] with `ssoUserId.orElse(null)`. */
            fun ssoUserId(ssoUserId: Optional<String>) = ssoUserId(ssoUserId.getOrNull())

            /**
             * Sets [Builder.ssoUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ssoUserId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ssoUserId(ssoUserId: JsonField<String>) = apply { this.ssoUserId = ssoUserId }

            fun teams(teams: List<String>) = teams(JsonField.of(teams))

            /**
             * Sets [Builder.teams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teams] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teams(teams: JsonField<List<String>>) = apply {
                this.teams = teams.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [teams].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTeam(team: String) = apply {
                teams =
                    (teams ?: JsonField.of(mutableListOf())).also {
                        checkKnown("teams", it).add(team)
                    }
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

            fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

            /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
            fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun userAlias(userAlias: String?) = userAlias(JsonField.ofNullable(userAlias))

            /** Alias for calling [Builder.userAlias] with `userAlias.orElse(null)`. */
            fun userAlias(userAlias: Optional<String>) = userAlias(userAlias.getOrNull())

            /**
             * Sets [Builder.userAlias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userAlias] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userAlias(userAlias: JsonField<String>) = apply { this.userAlias = userAlias }

            fun userEmail(userEmail: String?) = userEmail(JsonField.ofNullable(userEmail))

            /** Alias for calling [Builder.userEmail] with `userEmail.orElse(null)`. */
            fun userEmail(userEmail: Optional<String>) = userEmail(userEmail.getOrNull())

            /**
             * Sets [Builder.userEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userEmail] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

            fun userRole(userRole: String?) = userRole(JsonField.ofNullable(userRole))

            /** Alias for calling [Builder.userRole] with `userRole.orElse(null)`. */
            fun userRole(userRole: Optional<String>) = userRole(userRole.getOrNull())

            /**
             * Sets [Builder.userRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userRole] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userRole(userRole: JsonField<String>) = apply { this.userRole = userRole }

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
             * Returns an immutable instance of [UpdatedUser].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .userId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UpdatedUser =
                UpdatedUser(
                    checkRequired("userId", userId),
                    budgetDuration,
                    budgetResetAt,
                    createdAt,
                    maxBudget,
                    metadata,
                    modelMaxBudget,
                    modelSpend,
                    (models ?: JsonMissing.of()).map { it.toImmutable() },
                    objectPermission,
                    (organizationMemberships ?: JsonMissing.of()).map { it.toImmutable() },
                    rpmLimit,
                    spend,
                    ssoUserId,
                    (teams ?: JsonMissing.of()).map { it.toImmutable() },
                    tpmLimit,
                    updatedAt,
                    userAlias,
                    userEmail,
                    userRole,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UpdatedUser = apply {
            if (validated) {
                return@apply
            }

            userId()
            budgetDuration()
            budgetResetAt()
            createdAt()
            maxBudget()
            metadata().ifPresent { it.validate() }
            modelMaxBudget().ifPresent { it.validate() }
            modelSpend().ifPresent { it.validate() }
            models()
            objectPermission().ifPresent { it.validate() }
            organizationMemberships().ifPresent { it.forEach { it.validate() } }
            rpmLimit()
            spend()
            ssoUserId()
            teams()
            tpmLimit()
            updatedAt()
            userAlias()
            userEmail()
            userRole()
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
            (if (userId.asKnown().isPresent) 1 else 0) +
                (if (budgetDuration.asKnown().isPresent) 1 else 0) +
                (if (budgetResetAt.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (maxBudget.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (modelMaxBudget.asKnown().getOrNull()?.validity() ?: 0) +
                (modelSpend.asKnown().getOrNull()?.validity() ?: 0) +
                (models.asKnown().getOrNull()?.size ?: 0) +
                (objectPermission.asKnown().getOrNull()?.validity() ?: 0) +
                (organizationMemberships.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (rpmLimit.asKnown().isPresent) 1 else 0) +
                (if (spend.asKnown().isPresent) 1 else 0) +
                (if (ssoUserId.asKnown().isPresent) 1 else 0) +
                (teams.asKnown().getOrNull()?.size ?: 0) +
                (if (tpmLimit.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (userAlias.asKnown().isPresent) 1 else 0) +
                (if (userEmail.asKnown().isPresent) 1 else 0) +
                (if (userRole.asKnown().isPresent) 1 else 0)

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

        class ModelSpend
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

                /** Returns a mutable builder for constructing an instance of [ModelSpend]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ModelSpend]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(modelSpend: ModelSpend) = apply {
                    additionalProperties = modelSpend.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [ModelSpend].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ModelSpend = ModelSpend(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): ModelSpend = apply {
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

                return other is ModelSpend && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "ModelSpend{additionalProperties=$additionalProperties}"
        }

        /** Represents a LiteLLM_ObjectPermissionTable record */
        class ObjectPermission
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val objectPermissionId: JsonField<String>,
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
                @JsonProperty("object_permission_id")
                @ExcludeMissing
                objectPermissionId: JsonField<String> = JsonMissing.of(),
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
                objectPermissionId,
                agentAccessGroups,
                agents,
                mcpAccessGroups,
                mcpServers,
                mcpToolPermissions,
                vectorStores,
                mutableMapOf(),
            )

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun objectPermissionId(): String =
                objectPermissionId.getRequired("object_permission_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun agentAccessGroups(): Optional<List<String>> =
                agentAccessGroups.getOptional("agent_access_groups")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun agents(): Optional<List<String>> = agents.getOptional("agents")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mcpAccessGroups(): Optional<List<String>> =
                mcpAccessGroups.getOptional("mcp_access_groups")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mcpServers(): Optional<List<String>> = mcpServers.getOptional("mcp_servers")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mcpToolPermissions(): Optional<McpToolPermissions> =
                mcpToolPermissions.getOptional("mcp_tool_permissions")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun vectorStores(): Optional<List<String>> = vectorStores.getOptional("vector_stores")

            /**
             * Returns the raw JSON value of [objectPermissionId].
             *
             * Unlike [objectPermissionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("object_permission_id")
            @ExcludeMissing
            fun _objectPermissionId(): JsonField<String> = objectPermissionId

            /**
             * Returns the raw JSON value of [agentAccessGroups].
             *
             * Unlike [agentAccessGroups], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Unlike [mcpAccessGroups], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mcp_access_groups")
            @ExcludeMissing
            fun _mcpAccessGroups(): JsonField<List<String>> = mcpAccessGroups

            /**
             * Returns the raw JSON value of [mcpServers].
             *
             * Unlike [mcpServers], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /**
                 * Returns a mutable builder for constructing an instance of [ObjectPermission].
                 *
                 * The following fields are required:
                 * ```java
                 * .objectPermissionId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ObjectPermission]. */
            class Builder internal constructor() {

                private var objectPermissionId: JsonField<String>? = null
                private var agentAccessGroups: JsonField<MutableList<String>>? = null
                private var agents: JsonField<MutableList<String>>? = null
                private var mcpAccessGroups: JsonField<MutableList<String>>? = null
                private var mcpServers: JsonField<MutableList<String>>? = null
                private var mcpToolPermissions: JsonField<McpToolPermissions> = JsonMissing.of()
                private var vectorStores: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(objectPermission: ObjectPermission) = apply {
                    objectPermissionId = objectPermission.objectPermissionId
                    agentAccessGroups =
                        objectPermission.agentAccessGroups.map { it.toMutableList() }
                    agents = objectPermission.agents.map { it.toMutableList() }
                    mcpAccessGroups = objectPermission.mcpAccessGroups.map { it.toMutableList() }
                    mcpServers = objectPermission.mcpServers.map { it.toMutableList() }
                    mcpToolPermissions = objectPermission.mcpToolPermissions
                    vectorStores = objectPermission.vectorStores.map { it.toMutableList() }
                    additionalProperties = objectPermission.additionalProperties.toMutableMap()
                }

                fun objectPermissionId(objectPermissionId: String) =
                    objectPermissionId(JsonField.of(objectPermissionId))

                /**
                 * Sets [Builder.objectPermissionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.objectPermissionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun objectPermissionId(objectPermissionId: JsonField<String>) = apply {
                    this.objectPermissionId = objectPermissionId
                }

                fun agentAccessGroups(agentAccessGroups: List<String>?) =
                    agentAccessGroups(JsonField.ofNullable(agentAccessGroups))

                /**
                 * Alias for calling [Builder.agentAccessGroups] with
                 * `agentAccessGroups.orElse(null)`.
                 */
                fun agentAccessGroups(agentAccessGroups: Optional<List<String>>) =
                    agentAccessGroups(agentAccessGroups.getOrNull())

                /**
                 * Sets [Builder.agentAccessGroups] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.agentAccessGroups] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Alias for calling [Builder.mcpAccessGroups] with `mcpAccessGroups.orElse(null)`.
                 */
                fun mcpAccessGroups(mcpAccessGroups: Optional<List<String>>) =
                    mcpAccessGroups(mcpAccessGroups.getOrNull())

                /**
                 * Sets [Builder.mcpAccessGroups] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mcpAccessGroups] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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

                fun mcpServers(mcpServers: List<String>?) =
                    mcpServers(JsonField.ofNullable(mcpServers))

                /** Alias for calling [Builder.mcpServers] with `mcpServers.orElse(null)`. */
                fun mcpServers(mcpServers: Optional<List<String>>) =
                    mcpServers(mcpServers.getOrNull())

                /**
                 * Sets [Builder.mcpServers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mcpServers] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * [McpToolPermissions] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
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
                 * You should usually call [Builder.vectorStores] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [ObjectPermission].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .objectPermissionId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ObjectPermission =
                    ObjectPermission(
                        checkRequired("objectPermissionId", objectPermissionId),
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

                objectPermissionId()
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
                (if (objectPermissionId.asKnown().isPresent) 1 else 0) +
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
                     * Returns a mutable builder for constructing an instance of
                     * [McpToolPermissions].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [McpToolPermissions]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(mcpToolPermissions: McpToolPermissions) = apply {
                        additionalProperties =
                            mcpToolPermissions.additionalProperties.toMutableMap()
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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
                    objectPermissionId == other.objectPermissionId &&
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
                    objectPermissionId,
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
                "ObjectPermission{objectPermissionId=$objectPermissionId, agentAccessGroups=$agentAccessGroups, agents=$agents, mcpAccessGroups=$mcpAccessGroups, mcpServers=$mcpServers, mcpToolPermissions=$mcpToolPermissions, vectorStores=$vectorStores, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UpdatedUser &&
                userId == other.userId &&
                budgetDuration == other.budgetDuration &&
                budgetResetAt == other.budgetResetAt &&
                createdAt == other.createdAt &&
                maxBudget == other.maxBudget &&
                metadata == other.metadata &&
                modelMaxBudget == other.modelMaxBudget &&
                modelSpend == other.modelSpend &&
                models == other.models &&
                objectPermission == other.objectPermission &&
                organizationMemberships == other.organizationMemberships &&
                rpmLimit == other.rpmLimit &&
                spend == other.spend &&
                ssoUserId == other.ssoUserId &&
                teams == other.teams &&
                tpmLimit == other.tpmLimit &&
                updatedAt == other.updatedAt &&
                userAlias == other.userAlias &&
                userEmail == other.userEmail &&
                userRole == other.userRole &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                userId,
                budgetDuration,
                budgetResetAt,
                createdAt,
                maxBudget,
                metadata,
                modelMaxBudget,
                modelSpend,
                models,
                objectPermission,
                organizationMemberships,
                rpmLimit,
                spend,
                ssoUserId,
                teams,
                tpmLimit,
                updatedAt,
                userAlias,
                userEmail,
                userRole,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UpdatedUser{userId=$userId, budgetDuration=$budgetDuration, budgetResetAt=$budgetResetAt, createdAt=$createdAt, maxBudget=$maxBudget, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelSpend=$modelSpend, models=$models, objectPermission=$objectPermission, organizationMemberships=$organizationMemberships, rpmLimit=$rpmLimit, spend=$spend, ssoUserId=$ssoUserId, teams=$teams, tpmLimit=$tpmLimit, updatedAt=$updatedAt, userAlias=$userAlias, userEmail=$userEmail, userRole=$userRole, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrganizationAddMemberResponse &&
            organizationId == other.organizationId &&
            updatedOrganizationMemberships == other.updatedOrganizationMemberships &&
            updatedUsers == other.updatedUsers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            organizationId,
            updatedOrganizationMemberships,
            updatedUsers,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrganizationAddMemberResponse{organizationId=$organizationId, updatedOrganizationMemberships=$updatedOrganizationMemberships, updatedUsers=$updatedUsers, additionalProperties=$additionalProperties}"
}
