// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import ai.hanzo.api.core.BaseDeserializer
import ai.hanzo.api.core.BaseSerializer
import ai.hanzo.api.core.Enum
import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.allMaxBy
import ai.hanzo.api.core.checkKnown
import ai.hanzo.api.core.checkRequired
import ai.hanzo.api.core.getOrThrow
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
import ai.hanzo.api.models.organization.UserRoles
import ai.hanzo.api.models.team.Member
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class KeyListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currentPage: JsonField<Long>,
    private val keys: JsonField<List<Key>>,
    private val totalCount: JsonField<Long>,
    private val totalPages: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("current_page")
        @ExcludeMissing
        currentPage: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("keys") @ExcludeMissing keys: JsonField<List<Key>> = JsonMissing.of(),
        @JsonProperty("total_count") @ExcludeMissing totalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_pages") @ExcludeMissing totalPages: JsonField<Long> = JsonMissing.of(),
    ) : this(currentPage, keys, totalCount, totalPages, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentPage(): Optional<Long> = currentPage.getOptional("current_page")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keys(): Optional<List<Key>> = keys.getOptional("keys")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCount(): Optional<Long> = totalCount.getOptional("total_count")

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalPages(): Optional<Long> = totalPages.getOptional("total_pages")

    /**
     * Returns the raw JSON value of [currentPage].
     *
     * Unlike [currentPage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_page") @ExcludeMissing fun _currentPage(): JsonField<Long> = currentPage

    /**
     * Returns the raw JSON value of [keys].
     *
     * Unlike [keys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keys") @ExcludeMissing fun _keys(): JsonField<List<Key>> = keys

    /**
     * Returns the raw JSON value of [totalCount].
     *
     * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

    /**
     * Returns the raw JSON value of [totalPages].
     *
     * Unlike [totalPages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_pages") @ExcludeMissing fun _totalPages(): JsonField<Long> = totalPages

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

        /** Returns a mutable builder for constructing an instance of [KeyListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [KeyListResponse]. */
    class Builder internal constructor() {

        private var currentPage: JsonField<Long> = JsonMissing.of()
        private var keys: JsonField<MutableList<Key>>? = null
        private var totalCount: JsonField<Long> = JsonMissing.of()
        private var totalPages: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(keyListResponse: KeyListResponse) = apply {
            currentPage = keyListResponse.currentPage
            keys = keyListResponse.keys.map { it.toMutableList() }
            totalCount = keyListResponse.totalCount
            totalPages = keyListResponse.totalPages
            additionalProperties = keyListResponse.additionalProperties.toMutableMap()
        }

        fun currentPage(currentPage: Long?) = currentPage(JsonField.ofNullable(currentPage))

        /**
         * Alias for [Builder.currentPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun currentPage(currentPage: Long) = currentPage(currentPage as Long?)

        /** Alias for calling [Builder.currentPage] with `currentPage.orElse(null)`. */
        fun currentPage(currentPage: Optional<Long>) = currentPage(currentPage.getOrNull())

        /**
         * Sets [Builder.currentPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentPage] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentPage(currentPage: JsonField<Long>) = apply { this.currentPage = currentPage }

        fun keys(keys: List<Key>) = keys(JsonField.of(keys))

        /**
         * Sets [Builder.keys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keys] with a well-typed `List<Key>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keys(keys: JsonField<List<Key>>) = apply { this.keys = keys.map { it.toMutableList() } }

        /**
         * Adds a single [Key] to [keys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKey(key: Key) = apply {
            keys = (keys ?: JsonField.of(mutableListOf())).also { checkKnown("keys", it).add(key) }
        }

        /** Alias for calling [addKey] with `Key.ofString(string)`. */
        fun addKey(string: String) = addKey(Key.ofString(string))

        /** Alias for calling [addKey] with `Key.ofUserApiKeyAuth(userApiKeyAuth)`. */
        fun addKey(userApiKeyAuth: Key.UserApiKeyAuth) =
            addKey(Key.ofUserApiKeyAuth(userApiKeyAuth))

        /**
         * Alias for calling [addKey] with
         * `Key.ofLiteLlmDeletedVerificationToken(liteLlmDeletedVerificationToken)`.
         */
        fun addKey(liteLlmDeletedVerificationToken: Key.LiteLlmDeletedVerificationToken) =
            addKey(Key.ofLiteLlmDeletedVerificationToken(liteLlmDeletedVerificationToken))

        fun totalCount(totalCount: Long?) = totalCount(JsonField.ofNullable(totalCount))

        /**
         * Alias for [Builder.totalCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalCount(totalCount: Long) = totalCount(totalCount as Long?)

        /** Alias for calling [Builder.totalCount] with `totalCount.orElse(null)`. */
        fun totalCount(totalCount: Optional<Long>) = totalCount(totalCount.getOrNull())

        /**
         * Sets [Builder.totalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

        fun totalPages(totalPages: Long?) = totalPages(JsonField.ofNullable(totalPages))

        /**
         * Alias for [Builder.totalPages].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalPages(totalPages: Long) = totalPages(totalPages as Long?)

        /** Alias for calling [Builder.totalPages] with `totalPages.orElse(null)`. */
        fun totalPages(totalPages: Optional<Long>) = totalPages(totalPages.getOrNull())

        /**
         * Sets [Builder.totalPages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPages] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

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
         * Returns an immutable instance of [KeyListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): KeyListResponse =
            KeyListResponse(
                currentPage,
                (keys ?: JsonMissing.of()).map { it.toImmutable() },
                totalCount,
                totalPages,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): KeyListResponse = apply {
        if (validated) {
            return@apply
        }

        currentPage()
        keys().ifPresent { it.forEach { it.validate() } }
        totalCount()
        totalPages()
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
        (if (currentPage.asKnown().isPresent) 1 else 0) +
            (keys.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalCount.asKnown().isPresent) 1 else 0) +
            (if (totalPages.asKnown().isPresent) 1 else 0)

    /** Return the row in the db */
    @JsonDeserialize(using = Key.Deserializer::class)
    @JsonSerialize(using = Key.Serializer::class)
    class Key
    private constructor(
        private val string: String? = null,
        private val userApiKeyAuth: UserApiKeyAuth? = null,
        private val liteLlmDeletedVerificationToken: LiteLlmDeletedVerificationToken? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        /** Return the row in the db */
        fun userApiKeyAuth(): Optional<UserApiKeyAuth> = Optional.ofNullable(userApiKeyAuth)

        /**
         * Recording of deleted keys for audit purposes. Mirrors LiteLLM_VerificationToken plus
         * metadata captured at deletion time.
         */
        fun liteLlmDeletedVerificationToken(): Optional<LiteLlmDeletedVerificationToken> =
            Optional.ofNullable(liteLlmDeletedVerificationToken)

        fun isString(): Boolean = string != null

        fun isUserApiKeyAuth(): Boolean = userApiKeyAuth != null

        fun isLiteLlmDeletedVerificationToken(): Boolean = liteLlmDeletedVerificationToken != null

        fun asString(): String = string.getOrThrow("string")

        /** Return the row in the db */
        fun asUserApiKeyAuth(): UserApiKeyAuth = userApiKeyAuth.getOrThrow("userApiKeyAuth")

        /**
         * Recording of deleted keys for audit purposes. Mirrors LiteLLM_VerificationToken plus
         * metadata captured at deletion time.
         */
        fun asLiteLlmDeletedVerificationToken(): LiteLlmDeletedVerificationToken =
            liteLlmDeletedVerificationToken.getOrThrow("liteLlmDeletedVerificationToken")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                userApiKeyAuth != null -> visitor.visitUserApiKeyAuth(userApiKeyAuth)
                liteLlmDeletedVerificationToken != null ->
                    visitor.visitLiteLlmDeletedVerificationToken(liteLlmDeletedVerificationToken)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Key = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitUserApiKeyAuth(userApiKeyAuth: UserApiKeyAuth) {
                        userApiKeyAuth.validate()
                    }

                    override fun visitLiteLlmDeletedVerificationToken(
                        liteLlmDeletedVerificationToken: LiteLlmDeletedVerificationToken
                    ) {
                        liteLlmDeletedVerificationToken.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitUserApiKeyAuth(userApiKeyAuth: UserApiKeyAuth) =
                        userApiKeyAuth.validity()

                    override fun visitLiteLlmDeletedVerificationToken(
                        liteLlmDeletedVerificationToken: LiteLlmDeletedVerificationToken
                    ) = liteLlmDeletedVerificationToken.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Key &&
                string == other.string &&
                userApiKeyAuth == other.userApiKeyAuth &&
                liteLlmDeletedVerificationToken == other.liteLlmDeletedVerificationToken
        }

        override fun hashCode(): Int =
            Objects.hash(string, userApiKeyAuth, liteLlmDeletedVerificationToken)

        override fun toString(): String =
            when {
                string != null -> "Key{string=$string}"
                userApiKeyAuth != null -> "Key{userApiKeyAuth=$userApiKeyAuth}"
                liteLlmDeletedVerificationToken != null ->
                    "Key{liteLlmDeletedVerificationToken=$liteLlmDeletedVerificationToken}"
                _json != null -> "Key{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Key")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Key(string = string)

            /** Return the row in the db */
            @JvmStatic
            fun ofUserApiKeyAuth(userApiKeyAuth: UserApiKeyAuth) =
                Key(userApiKeyAuth = userApiKeyAuth)

            /**
             * Recording of deleted keys for audit purposes. Mirrors LiteLLM_VerificationToken plus
             * metadata captured at deletion time.
             */
            @JvmStatic
            fun ofLiteLlmDeletedVerificationToken(
                liteLlmDeletedVerificationToken: LiteLlmDeletedVerificationToken
            ) = Key(liteLlmDeletedVerificationToken = liteLlmDeletedVerificationToken)
        }

        /** An interface that defines how to map each variant of [Key] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            /** Return the row in the db */
            fun visitUserApiKeyAuth(userApiKeyAuth: UserApiKeyAuth): T

            /**
             * Recording of deleted keys for audit purposes. Mirrors LiteLLM_VerificationToken plus
             * metadata captured at deletion time.
             */
            fun visitLiteLlmDeletedVerificationToken(
                liteLlmDeletedVerificationToken: LiteLlmDeletedVerificationToken
            ): T

            /**
             * Maps an unknown variant of [Key] to a value of type [T].
             *
             * An instance of [Key] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws HanzoInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HanzoInvalidDataException("Unknown Key: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Key>(Key::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Key {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UserApiKeyAuth>())?.let {
                                Key(userApiKeyAuth = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LiteLlmDeletedVerificationToken>())
                                ?.let { Key(liteLlmDeletedVerificationToken = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Key(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Key(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Key>(Key::class) {

            override fun serialize(
                value: Key,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.userApiKeyAuth != null -> generator.writeObject(value.userApiKeyAuth)
                    value.liteLlmDeletedVerificationToken != null ->
                        generator.writeObject(value.liteLlmDeletedVerificationToken)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Key")
                }
            }
        }

        /** Return the row in the db */
        class UserApiKeyAuth
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val token: JsonField<String>,
            private val aliases: JsonField<Aliases>,
            private val allowedCacheControls: JsonField<List<JsonValue>>,
            private val allowedModelRegion: JsonField<AllowedModelRegion>,
            private val allowedRoutes: JsonField<List<JsonValue>>,
            private val apiKey: JsonField<String>,
            private val autoRotate: JsonField<Boolean>,
            private val blocked: JsonField<Boolean>,
            private val budgetDuration: JsonField<String>,
            private val budgetResetAt: JsonField<OffsetDateTime>,
            private val config: JsonField<Config>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val createdBy: JsonField<String>,
            private val endUserId: JsonField<String>,
            private val endUserMaxBudget: JsonField<Double>,
            private val endUserRpmLimit: JsonField<Long>,
            private val endUserTpmLimit: JsonField<Long>,
            private val expires: JsonField<Expires>,
            private val keyAlias: JsonField<String>,
            private val keyName: JsonField<String>,
            private val keyRotationAt: JsonField<OffsetDateTime>,
            private val lastRefreshedAt: JsonField<Double>,
            private val lastRotationAt: JsonField<OffsetDateTime>,
            private val litellmBudgetTable: JsonField<LitellmBudgetTable>,
            private val maxBudget: JsonField<Double>,
            private val maxParallelRequests: JsonField<Long>,
            private val metadata: JsonField<Metadata>,
            private val modelMaxBudget: JsonField<ModelMaxBudget>,
            private val modelSpend: JsonField<ModelSpend>,
            private val models: JsonField<List<JsonValue>>,
            private val objectPermission: JsonField<ObjectPermission>,
            private val objectPermissionId: JsonField<String>,
            private val orgId: JsonField<String>,
            private val organizationMaxBudget: JsonField<Double>,
            private val organizationMetadata: JsonField<OrganizationMetadata>,
            private val organizationRpmLimit: JsonField<Long>,
            private val organizationTpmLimit: JsonField<Long>,
            private val parentOtelSpan: JsonValue,
            private val permissions: JsonField<Permissions>,
            private val requestRoute: JsonField<String>,
            private val rotationCount: JsonField<Long>,
            private val rotationInterval: JsonField<String>,
            private val routerSettings: JsonField<RouterSettings>,
            private val rpmLimit: JsonField<Long>,
            private val rpmLimitPerModel: JsonField<RpmLimitPerModel>,
            private val softBudget: JsonField<Double>,
            private val softBudgetCooldown: JsonField<Boolean>,
            private val spend: JsonField<Double>,
            private val teamAlias: JsonField<String>,
            private val teamBlocked: JsonField<Boolean>,
            private val teamId: JsonField<String>,
            private val teamMaxBudget: JsonField<Double>,
            private val teamMember: JsonField<Member>,
            private val teamMemberRpmLimit: JsonField<Long>,
            private val teamMemberSpend: JsonField<Double>,
            private val teamMemberTpmLimit: JsonField<Long>,
            private val teamMetadata: JsonField<TeamMetadata>,
            private val teamModelAliases: JsonField<TeamModelAliases>,
            private val teamModels: JsonField<List<JsonValue>>,
            private val teamObjectPermissionId: JsonField<String>,
            private val teamRpmLimit: JsonField<Long>,
            private val teamSpend: JsonField<Double>,
            private val teamTpmLimit: JsonField<Long>,
            private val tpmLimit: JsonField<Long>,
            private val tpmLimitPerModel: JsonField<TpmLimitPerModel>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val updatedBy: JsonField<String>,
            private val user: JsonValue,
            private val userEmail: JsonField<String>,
            private val userId: JsonField<String>,
            private val userMaxBudget: JsonField<Double>,
            private val userRole: JsonField<UserRoles>,
            private val userRpmLimit: JsonField<Long>,
            private val userSpend: JsonField<Double>,
            private val userTpmLimit: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aliases")
                @ExcludeMissing
                aliases: JsonField<Aliases> = JsonMissing.of(),
                @JsonProperty("allowed_cache_controls")
                @ExcludeMissing
                allowedCacheControls: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("allowed_model_region")
                @ExcludeMissing
                allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of(),
                @JsonProperty("allowed_routes")
                @ExcludeMissing
                allowedRoutes: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("api_key")
                @ExcludeMissing
                apiKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("auto_rotate")
                @ExcludeMissing
                autoRotate: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("blocked")
                @ExcludeMissing
                blocked: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("budget_duration")
                @ExcludeMissing
                budgetDuration: JsonField<String> = JsonMissing.of(),
                @JsonProperty("budget_reset_at")
                @ExcludeMissing
                budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("config")
                @ExcludeMissing
                config: JsonField<Config> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("created_by")
                @ExcludeMissing
                createdBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("end_user_id")
                @ExcludeMissing
                endUserId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("end_user_max_budget")
                @ExcludeMissing
                endUserMaxBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("end_user_rpm_limit")
                @ExcludeMissing
                endUserRpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("end_user_tpm_limit")
                @ExcludeMissing
                endUserTpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("expires")
                @ExcludeMissing
                expires: JsonField<Expires> = JsonMissing.of(),
                @JsonProperty("key_alias")
                @ExcludeMissing
                keyAlias: JsonField<String> = JsonMissing.of(),
                @JsonProperty("key_name")
                @ExcludeMissing
                keyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("key_rotation_at")
                @ExcludeMissing
                keyRotationAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("last_refreshed_at")
                @ExcludeMissing
                lastRefreshedAt: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("last_rotation_at")
                @ExcludeMissing
                lastRotationAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("litellm_budget_table")
                @ExcludeMissing
                litellmBudgetTable: JsonField<LitellmBudgetTable> = JsonMissing.of(),
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
                @JsonProperty("model_spend")
                @ExcludeMissing
                modelSpend: JsonField<ModelSpend> = JsonMissing.of(),
                @JsonProperty("models")
                @ExcludeMissing
                models: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("object_permission")
                @ExcludeMissing
                objectPermission: JsonField<ObjectPermission> = JsonMissing.of(),
                @JsonProperty("object_permission_id")
                @ExcludeMissing
                objectPermissionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("org_id") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("organization_max_budget")
                @ExcludeMissing
                organizationMaxBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("organization_metadata")
                @ExcludeMissing
                organizationMetadata: JsonField<OrganizationMetadata> = JsonMissing.of(),
                @JsonProperty("organization_rpm_limit")
                @ExcludeMissing
                organizationRpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("organization_tpm_limit")
                @ExcludeMissing
                organizationTpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("parent_otel_span")
                @ExcludeMissing
                parentOtelSpan: JsonValue = JsonMissing.of(),
                @JsonProperty("permissions")
                @ExcludeMissing
                permissions: JsonField<Permissions> = JsonMissing.of(),
                @JsonProperty("request_route")
                @ExcludeMissing
                requestRoute: JsonField<String> = JsonMissing.of(),
                @JsonProperty("rotation_count")
                @ExcludeMissing
                rotationCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("rotation_interval")
                @ExcludeMissing
                rotationInterval: JsonField<String> = JsonMissing.of(),
                @JsonProperty("router_settings")
                @ExcludeMissing
                routerSettings: JsonField<RouterSettings> = JsonMissing.of(),
                @JsonProperty("rpm_limit")
                @ExcludeMissing
                rpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("rpm_limit_per_model")
                @ExcludeMissing
                rpmLimitPerModel: JsonField<RpmLimitPerModel> = JsonMissing.of(),
                @JsonProperty("soft_budget")
                @ExcludeMissing
                softBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("soft_budget_cooldown")
                @ExcludeMissing
                softBudgetCooldown: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("team_alias")
                @ExcludeMissing
                teamAlias: JsonField<String> = JsonMissing.of(),
                @JsonProperty("team_blocked")
                @ExcludeMissing
                teamBlocked: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("team_id")
                @ExcludeMissing
                teamId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("team_max_budget")
                @ExcludeMissing
                teamMaxBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("team_member")
                @ExcludeMissing
                teamMember: JsonField<Member> = JsonMissing.of(),
                @JsonProperty("team_member_rpm_limit")
                @ExcludeMissing
                teamMemberRpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("team_member_spend")
                @ExcludeMissing
                teamMemberSpend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("team_member_tpm_limit")
                @ExcludeMissing
                teamMemberTpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("team_metadata")
                @ExcludeMissing
                teamMetadata: JsonField<TeamMetadata> = JsonMissing.of(),
                @JsonProperty("team_model_aliases")
                @ExcludeMissing
                teamModelAliases: JsonField<TeamModelAliases> = JsonMissing.of(),
                @JsonProperty("team_models")
                @ExcludeMissing
                teamModels: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("team_object_permission_id")
                @ExcludeMissing
                teamObjectPermissionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("team_rpm_limit")
                @ExcludeMissing
                teamRpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("team_spend")
                @ExcludeMissing
                teamSpend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("team_tpm_limit")
                @ExcludeMissing
                teamTpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("tpm_limit")
                @ExcludeMissing
                tpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("tpm_limit_per_model")
                @ExcludeMissing
                tpmLimitPerModel: JsonField<TpmLimitPerModel> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("updated_by")
                @ExcludeMissing
                updatedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user") @ExcludeMissing user: JsonValue = JsonMissing.of(),
                @JsonProperty("user_email")
                @ExcludeMissing
                userEmail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_max_budget")
                @ExcludeMissing
                userMaxBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("user_role")
                @ExcludeMissing
                userRole: JsonField<UserRoles> = JsonMissing.of(),
                @JsonProperty("user_rpm_limit")
                @ExcludeMissing
                userRpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("user_spend")
                @ExcludeMissing
                userSpend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("user_tpm_limit")
                @ExcludeMissing
                userTpmLimit: JsonField<Long> = JsonMissing.of(),
            ) : this(
                token,
                aliases,
                allowedCacheControls,
                allowedModelRegion,
                allowedRoutes,
                apiKey,
                autoRotate,
                blocked,
                budgetDuration,
                budgetResetAt,
                config,
                createdAt,
                createdBy,
                endUserId,
                endUserMaxBudget,
                endUserRpmLimit,
                endUserTpmLimit,
                expires,
                keyAlias,
                keyName,
                keyRotationAt,
                lastRefreshedAt,
                lastRotationAt,
                litellmBudgetTable,
                maxBudget,
                maxParallelRequests,
                metadata,
                modelMaxBudget,
                modelSpend,
                models,
                objectPermission,
                objectPermissionId,
                orgId,
                organizationMaxBudget,
                organizationMetadata,
                organizationRpmLimit,
                organizationTpmLimit,
                parentOtelSpan,
                permissions,
                requestRoute,
                rotationCount,
                rotationInterval,
                routerSettings,
                rpmLimit,
                rpmLimitPerModel,
                softBudget,
                softBudgetCooldown,
                spend,
                teamAlias,
                teamBlocked,
                teamId,
                teamMaxBudget,
                teamMember,
                teamMemberRpmLimit,
                teamMemberSpend,
                teamMemberTpmLimit,
                teamMetadata,
                teamModelAliases,
                teamModels,
                teamObjectPermissionId,
                teamRpmLimit,
                teamSpend,
                teamTpmLimit,
                tpmLimit,
                tpmLimitPerModel,
                updatedAt,
                updatedBy,
                user,
                userEmail,
                userId,
                userMaxBudget,
                userRole,
                userRpmLimit,
                userSpend,
                userTpmLimit,
                mutableMapOf(),
            )

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun token(): Optional<String> = token.getOptional("token")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun aliases(): Optional<Aliases> = aliases.getOptional("aliases")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun allowedCacheControls(): Optional<List<JsonValue>> =
                allowedCacheControls.getOptional("allowed_cache_controls")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun allowedModelRegion(): Optional<AllowedModelRegion> =
                allowedModelRegion.getOptional("allowed_model_region")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun allowedRoutes(): Optional<List<JsonValue>> =
                allowedRoutes.getOptional("allowed_routes")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun apiKey(): Optional<String> = apiKey.getOptional("api_key")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun autoRotate(): Optional<Boolean> = autoRotate.getOptional("auto_rotate")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun blocked(): Optional<Boolean> = blocked.getOptional("blocked")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budgetDuration(): Optional<String> = budgetDuration.getOptional("budget_duration")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budgetResetAt(): Optional<OffsetDateTime> =
                budgetResetAt.getOptional("budget_reset_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun config(): Optional<Config> = config.getOptional("config")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdBy(): Optional<String> = createdBy.getOptional("created_by")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endUserId(): Optional<String> = endUserId.getOptional("end_user_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endUserMaxBudget(): Optional<Double> =
                endUserMaxBudget.getOptional("end_user_max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endUserRpmLimit(): Optional<Long> =
                endUserRpmLimit.getOptional("end_user_rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endUserTpmLimit(): Optional<Long> =
                endUserTpmLimit.getOptional("end_user_tpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expires(): Optional<Expires> = expires.getOptional("expires")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keyAlias(): Optional<String> = keyAlias.getOptional("key_alias")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keyName(): Optional<String> = keyName.getOptional("key_name")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keyRotationAt(): Optional<OffsetDateTime> =
                keyRotationAt.getOptional("key_rotation_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lastRefreshedAt(): Optional<Double> =
                lastRefreshedAt.getOptional("last_refreshed_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lastRotationAt(): Optional<OffsetDateTime> =
                lastRotationAt.getOptional("last_rotation_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun litellmBudgetTable(): Optional<LitellmBudgetTable> =
                litellmBudgetTable.getOptional("litellm_budget_table")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maxBudget(): Optional<Double> = maxBudget.getOptional("max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maxParallelRequests(): Optional<Long> =
                maxParallelRequests.getOptional("max_parallel_requests")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun modelMaxBudget(): Optional<ModelMaxBudget> =
                modelMaxBudget.getOptional("model_max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun modelSpend(): Optional<ModelSpend> = modelSpend.getOptional("model_spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun models(): Optional<List<JsonValue>> = models.getOptional("models")

            /**
             * Represents a LiteLLM_ObjectPermissionTable record
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun objectPermission(): Optional<ObjectPermission> =
                objectPermission.getOptional("object_permission")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun objectPermissionId(): Optional<String> =
                objectPermissionId.getOptional("object_permission_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun orgId(): Optional<String> = orgId.getOptional("org_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun organizationMaxBudget(): Optional<Double> =
                organizationMaxBudget.getOptional("organization_max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun organizationMetadata(): Optional<OrganizationMetadata> =
                organizationMetadata.getOptional("organization_metadata")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun organizationRpmLimit(): Optional<Long> =
                organizationRpmLimit.getOptional("organization_rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun organizationTpmLimit(): Optional<Long> =
                organizationTpmLimit.getOptional("organization_tpm_limit")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```java
             * MyClass myObject = userApiKeyAuth.parentOtelSpan().convert(MyClass.class);
             * ```
             */
            @JsonProperty("parent_otel_span")
            @ExcludeMissing
            fun _parentOtelSpan(): JsonValue = parentOtelSpan

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun permissions(): Optional<Permissions> = permissions.getOptional("permissions")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requestRoute(): Optional<String> = requestRoute.getOptional("request_route")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rotationCount(): Optional<Long> = rotationCount.getOptional("rotation_count")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rotationInterval(): Optional<String> =
                rotationInterval.getOptional("rotation_interval")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun routerSettings(): Optional<RouterSettings> =
                routerSettings.getOptional("router_settings")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rpmLimit(): Optional<Long> = rpmLimit.getOptional("rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rpmLimitPerModel(): Optional<RpmLimitPerModel> =
                rpmLimitPerModel.getOptional("rpm_limit_per_model")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun softBudget(): Optional<Double> = softBudget.getOptional("soft_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun softBudgetCooldown(): Optional<Boolean> =
                softBudgetCooldown.getOptional("soft_budget_cooldown")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun spend(): Optional<Double> = spend.getOptional("spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamAlias(): Optional<String> = teamAlias.getOptional("team_alias")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamBlocked(): Optional<Boolean> = teamBlocked.getOptional("team_blocked")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamId(): Optional<String> = teamId.getOptional("team_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamMaxBudget(): Optional<Double> = teamMaxBudget.getOptional("team_max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamMember(): Optional<Member> = teamMember.getOptional("team_member")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamMemberRpmLimit(): Optional<Long> =
                teamMemberRpmLimit.getOptional("team_member_rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamMemberSpend(): Optional<Double> =
                teamMemberSpend.getOptional("team_member_spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamMemberTpmLimit(): Optional<Long> =
                teamMemberTpmLimit.getOptional("team_member_tpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamMetadata(): Optional<TeamMetadata> = teamMetadata.getOptional("team_metadata")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamModelAliases(): Optional<TeamModelAliases> =
                teamModelAliases.getOptional("team_model_aliases")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamModels(): Optional<List<JsonValue>> = teamModels.getOptional("team_models")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamObjectPermissionId(): Optional<String> =
                teamObjectPermissionId.getOptional("team_object_permission_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamRpmLimit(): Optional<Long> = teamRpmLimit.getOptional("team_rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamSpend(): Optional<Double> = teamSpend.getOptional("team_spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamTpmLimit(): Optional<Long> = teamTpmLimit.getOptional("team_tpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tpmLimit(): Optional<Long> = tpmLimit.getOptional("tpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tpmLimitPerModel(): Optional<TpmLimitPerModel> =
                tpmLimitPerModel.getOptional("tpm_limit_per_model")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun updatedBy(): Optional<String> = updatedBy.getOptional("updated_by")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```java
             * MyClass myObject = userApiKeyAuth.user().convert(MyClass.class);
             * ```
             */
            @JsonProperty("user") @ExcludeMissing fun _user(): JsonValue = user

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userEmail(): Optional<String> = userEmail.getOptional("user_email")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userId(): Optional<String> = userId.getOptional("user_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userMaxBudget(): Optional<Double> = userMaxBudget.getOptional("user_max_budget")

            /**
             * Admin Roles: PROXY_ADMIN: admin over the platform PROXY_ADMIN_VIEW_ONLY: can login,
             * view all own keys, view all spend ORG_ADMIN: admin over a specific organization, can
             * create teams, users only within their organization
             *
             * Internal User Roles: INTERNAL_USER: can login, view/create/delete their own keys,
             * view their spend INTERNAL_USER_VIEW_ONLY: can login, view their own keys, view their
             * own spend
             *
             * Team Roles: TEAM: used for JWT auth
             *
             * Customer Roles: CUSTOMER: External users -> these are customers
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userRole(): Optional<UserRoles> = userRole.getOptional("user_role")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userRpmLimit(): Optional<Long> = userRpmLimit.getOptional("user_rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userSpend(): Optional<Double> = userSpend.getOptional("user_spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userTpmLimit(): Optional<Long> = userTpmLimit.getOptional("user_tpm_limit")

            /**
             * Returns the raw JSON value of [token].
             *
             * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

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
             * Returns the raw JSON value of [allowedModelRegion].
             *
             * Unlike [allowedModelRegion], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("allowed_model_region")
            @ExcludeMissing
            fun _allowedModelRegion(): JsonField<AllowedModelRegion> = allowedModelRegion

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
             * Returns the raw JSON value of [apiKey].
             *
             * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

            /**
             * Returns the raw JSON value of [autoRotate].
             *
             * Unlike [autoRotate], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [budgetDuration], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Returns the raw JSON value of [config].
             *
             * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [createdBy].
             *
             * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_by")
            @ExcludeMissing
            fun _createdBy(): JsonField<String> = createdBy

            /**
             * Returns the raw JSON value of [endUserId].
             *
             * Unlike [endUserId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("end_user_id")
            @ExcludeMissing
            fun _endUserId(): JsonField<String> = endUserId

            /**
             * Returns the raw JSON value of [endUserMaxBudget].
             *
             * Unlike [endUserMaxBudget], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("end_user_max_budget")
            @ExcludeMissing
            fun _endUserMaxBudget(): JsonField<Double> = endUserMaxBudget

            /**
             * Returns the raw JSON value of [endUserRpmLimit].
             *
             * Unlike [endUserRpmLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("end_user_rpm_limit")
            @ExcludeMissing
            fun _endUserRpmLimit(): JsonField<Long> = endUserRpmLimit

            /**
             * Returns the raw JSON value of [endUserTpmLimit].
             *
             * Unlike [endUserTpmLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("end_user_tpm_limit")
            @ExcludeMissing
            fun _endUserTpmLimit(): JsonField<Long> = endUserTpmLimit

            /**
             * Returns the raw JSON value of [expires].
             *
             * Unlike [expires], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("expires") @ExcludeMissing fun _expires(): JsonField<Expires> = expires

            /**
             * Returns the raw JSON value of [keyAlias].
             *
             * Unlike [keyAlias], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("key_alias") @ExcludeMissing fun _keyAlias(): JsonField<String> = keyAlias

            /**
             * Returns the raw JSON value of [keyName].
             *
             * Unlike [keyName], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("key_name") @ExcludeMissing fun _keyName(): JsonField<String> = keyName

            /**
             * Returns the raw JSON value of [keyRotationAt].
             *
             * Unlike [keyRotationAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("key_rotation_at")
            @ExcludeMissing
            fun _keyRotationAt(): JsonField<OffsetDateTime> = keyRotationAt

            /**
             * Returns the raw JSON value of [lastRefreshedAt].
             *
             * Unlike [lastRefreshedAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("last_refreshed_at")
            @ExcludeMissing
            fun _lastRefreshedAt(): JsonField<Double> = lastRefreshedAt

            /**
             * Returns the raw JSON value of [lastRotationAt].
             *
             * Unlike [lastRotationAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("last_rotation_at")
            @ExcludeMissing
            fun _lastRotationAt(): JsonField<OffsetDateTime> = lastRotationAt

            /**
             * Returns the raw JSON value of [litellmBudgetTable].
             *
             * Unlike [litellmBudgetTable], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("litellm_budget_table")
            @ExcludeMissing
            fun _litellmBudgetTable(): JsonField<LitellmBudgetTable> = litellmBudgetTable

            /**
             * Returns the raw JSON value of [maxBudget].
             *
             * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_budget")
            @ExcludeMissing
            fun _maxBudget(): JsonField<Double> = maxBudget

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
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [modelMaxBudget].
             *
             * Unlike [modelMaxBudget], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("model_max_budget")
            @ExcludeMissing
            fun _modelMaxBudget(): JsonField<ModelMaxBudget> = modelMaxBudget

            /**
             * Returns the raw JSON value of [modelSpend].
             *
             * Unlike [modelSpend], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("model_spend")
            @ExcludeMissing
            fun _modelSpend(): JsonField<ModelSpend> = modelSpend

            /**
             * Returns the raw JSON value of [models].
             *
             * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("models")
            @ExcludeMissing
            fun _models(): JsonField<List<JsonValue>> = models

            /**
             * Returns the raw JSON value of [objectPermission].
             *
             * Unlike [objectPermission], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("object_permission")
            @ExcludeMissing
            fun _objectPermission(): JsonField<ObjectPermission> = objectPermission

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
             * Returns the raw JSON value of [orgId].
             *
             * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

            /**
             * Returns the raw JSON value of [organizationMaxBudget].
             *
             * Unlike [organizationMaxBudget], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("organization_max_budget")
            @ExcludeMissing
            fun _organizationMaxBudget(): JsonField<Double> = organizationMaxBudget

            /**
             * Returns the raw JSON value of [organizationMetadata].
             *
             * Unlike [organizationMetadata], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("organization_metadata")
            @ExcludeMissing
            fun _organizationMetadata(): JsonField<OrganizationMetadata> = organizationMetadata

            /**
             * Returns the raw JSON value of [organizationRpmLimit].
             *
             * Unlike [organizationRpmLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("organization_rpm_limit")
            @ExcludeMissing
            fun _organizationRpmLimit(): JsonField<Long> = organizationRpmLimit

            /**
             * Returns the raw JSON value of [organizationTpmLimit].
             *
             * Unlike [organizationTpmLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("organization_tpm_limit")
            @ExcludeMissing
            fun _organizationTpmLimit(): JsonField<Long> = organizationTpmLimit

            /**
             * Returns the raw JSON value of [permissions].
             *
             * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("permissions")
            @ExcludeMissing
            fun _permissions(): JsonField<Permissions> = permissions

            /**
             * Returns the raw JSON value of [requestRoute].
             *
             * Unlike [requestRoute], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("request_route")
            @ExcludeMissing
            fun _requestRoute(): JsonField<String> = requestRoute

            /**
             * Returns the raw JSON value of [rotationCount].
             *
             * Unlike [rotationCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rotation_count")
            @ExcludeMissing
            fun _rotationCount(): JsonField<Long> = rotationCount

            /**
             * Returns the raw JSON value of [rotationInterval].
             *
             * Unlike [rotationInterval], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("rotation_interval")
            @ExcludeMissing
            fun _rotationInterval(): JsonField<String> = rotationInterval

            /**
             * Returns the raw JSON value of [routerSettings].
             *
             * Unlike [routerSettings], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("router_settings")
            @ExcludeMissing
            fun _routerSettings(): JsonField<RouterSettings> = routerSettings

            /**
             * Returns the raw JSON value of [rpmLimit].
             *
             * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

            /**
             * Returns the raw JSON value of [rpmLimitPerModel].
             *
             * Unlike [rpmLimitPerModel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("rpm_limit_per_model")
            @ExcludeMissing
            fun _rpmLimitPerModel(): JsonField<RpmLimitPerModel> = rpmLimitPerModel

            /**
             * Returns the raw JSON value of [softBudget].
             *
             * Unlike [softBudget], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("soft_budget")
            @ExcludeMissing
            fun _softBudget(): JsonField<Double> = softBudget

            /**
             * Returns the raw JSON value of [softBudgetCooldown].
             *
             * Unlike [softBudgetCooldown], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("soft_budget_cooldown")
            @ExcludeMissing
            fun _softBudgetCooldown(): JsonField<Boolean> = softBudgetCooldown

            /**
             * Returns the raw JSON value of [spend].
             *
             * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

            /**
             * Returns the raw JSON value of [teamAlias].
             *
             * Unlike [teamAlias], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_alias")
            @ExcludeMissing
            fun _teamAlias(): JsonField<String> = teamAlias

            /**
             * Returns the raw JSON value of [teamBlocked].
             *
             * Unlike [teamBlocked], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_blocked")
            @ExcludeMissing
            fun _teamBlocked(): JsonField<Boolean> = teamBlocked

            /**
             * Returns the raw JSON value of [teamId].
             *
             * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

            /**
             * Returns the raw JSON value of [teamMaxBudget].
             *
             * Unlike [teamMaxBudget], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_max_budget")
            @ExcludeMissing
            fun _teamMaxBudget(): JsonField<Double> = teamMaxBudget

            /**
             * Returns the raw JSON value of [teamMember].
             *
             * Unlike [teamMember], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_member")
            @ExcludeMissing
            fun _teamMember(): JsonField<Member> = teamMember

            /**
             * Returns the raw JSON value of [teamMemberRpmLimit].
             *
             * Unlike [teamMemberRpmLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("team_member_rpm_limit")
            @ExcludeMissing
            fun _teamMemberRpmLimit(): JsonField<Long> = teamMemberRpmLimit

            /**
             * Returns the raw JSON value of [teamMemberSpend].
             *
             * Unlike [teamMemberSpend], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("team_member_spend")
            @ExcludeMissing
            fun _teamMemberSpend(): JsonField<Double> = teamMemberSpend

            /**
             * Returns the raw JSON value of [teamMemberTpmLimit].
             *
             * Unlike [teamMemberTpmLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("team_member_tpm_limit")
            @ExcludeMissing
            fun _teamMemberTpmLimit(): JsonField<Long> = teamMemberTpmLimit

            /**
             * Returns the raw JSON value of [teamMetadata].
             *
             * Unlike [teamMetadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_metadata")
            @ExcludeMissing
            fun _teamMetadata(): JsonField<TeamMetadata> = teamMetadata

            /**
             * Returns the raw JSON value of [teamModelAliases].
             *
             * Unlike [teamModelAliases], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("team_model_aliases")
            @ExcludeMissing
            fun _teamModelAliases(): JsonField<TeamModelAliases> = teamModelAliases

            /**
             * Returns the raw JSON value of [teamModels].
             *
             * Unlike [teamModels], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_models")
            @ExcludeMissing
            fun _teamModels(): JsonField<List<JsonValue>> = teamModels

            /**
             * Returns the raw JSON value of [teamObjectPermissionId].
             *
             * Unlike [teamObjectPermissionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("team_object_permission_id")
            @ExcludeMissing
            fun _teamObjectPermissionId(): JsonField<String> = teamObjectPermissionId

            /**
             * Returns the raw JSON value of [teamRpmLimit].
             *
             * Unlike [teamRpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_rpm_limit")
            @ExcludeMissing
            fun _teamRpmLimit(): JsonField<Long> = teamRpmLimit

            /**
             * Returns the raw JSON value of [teamSpend].
             *
             * Unlike [teamSpend], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_spend")
            @ExcludeMissing
            fun _teamSpend(): JsonField<Double> = teamSpend

            /**
             * Returns the raw JSON value of [teamTpmLimit].
             *
             * Unlike [teamTpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("team_tpm_limit")
            @ExcludeMissing
            fun _teamTpmLimit(): JsonField<Long> = teamTpmLimit

            /**
             * Returns the raw JSON value of [tpmLimit].
             *
             * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

            /**
             * Returns the raw JSON value of [tpmLimitPerModel].
             *
             * Unlike [tpmLimitPerModel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("tpm_limit_per_model")
            @ExcludeMissing
            fun _tpmLimitPerModel(): JsonField<TpmLimitPerModel> = tpmLimitPerModel

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

            /**
             * Returns the raw JSON value of [updatedBy].
             *
             * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_by")
            @ExcludeMissing
            fun _updatedBy(): JsonField<String> = updatedBy

            /**
             * Returns the raw JSON value of [userEmail].
             *
             * Unlike [userEmail], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_email")
            @ExcludeMissing
            fun _userEmail(): JsonField<String> = userEmail

            /**
             * Returns the raw JSON value of [userId].
             *
             * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

            /**
             * Returns the raw JSON value of [userMaxBudget].
             *
             * Unlike [userMaxBudget], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_max_budget")
            @ExcludeMissing
            fun _userMaxBudget(): JsonField<Double> = userMaxBudget

            /**
             * Returns the raw JSON value of [userRole].
             *
             * Unlike [userRole], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_role")
            @ExcludeMissing
            fun _userRole(): JsonField<UserRoles> = userRole

            /**
             * Returns the raw JSON value of [userRpmLimit].
             *
             * Unlike [userRpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_rpm_limit")
            @ExcludeMissing
            fun _userRpmLimit(): JsonField<Long> = userRpmLimit

            /**
             * Returns the raw JSON value of [userSpend].
             *
             * Unlike [userSpend], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_spend")
            @ExcludeMissing
            fun _userSpend(): JsonField<Double> = userSpend

            /**
             * Returns the raw JSON value of [userTpmLimit].
             *
             * Unlike [userTpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_tpm_limit")
            @ExcludeMissing
            fun _userTpmLimit(): JsonField<Long> = userTpmLimit

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

                /** Returns a mutable builder for constructing an instance of [UserApiKeyAuth]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UserApiKeyAuth]. */
            class Builder internal constructor() {

                private var token: JsonField<String> = JsonMissing.of()
                private var aliases: JsonField<Aliases> = JsonMissing.of()
                private var allowedCacheControls: JsonField<MutableList<JsonValue>>? = null
                private var allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of()
                private var allowedRoutes: JsonField<MutableList<JsonValue>>? = null
                private var apiKey: JsonField<String> = JsonMissing.of()
                private var autoRotate: JsonField<Boolean> = JsonMissing.of()
                private var blocked: JsonField<Boolean> = JsonMissing.of()
                private var budgetDuration: JsonField<String> = JsonMissing.of()
                private var budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var config: JsonField<Config> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var createdBy: JsonField<String> = JsonMissing.of()
                private var endUserId: JsonField<String> = JsonMissing.of()
                private var endUserMaxBudget: JsonField<Double> = JsonMissing.of()
                private var endUserRpmLimit: JsonField<Long> = JsonMissing.of()
                private var endUserTpmLimit: JsonField<Long> = JsonMissing.of()
                private var expires: JsonField<Expires> = JsonMissing.of()
                private var keyAlias: JsonField<String> = JsonMissing.of()
                private var keyName: JsonField<String> = JsonMissing.of()
                private var keyRotationAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var lastRefreshedAt: JsonField<Double> = JsonMissing.of()
                private var lastRotationAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var litellmBudgetTable: JsonField<LitellmBudgetTable> = JsonMissing.of()
                private var maxBudget: JsonField<Double> = JsonMissing.of()
                private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of()
                private var modelSpend: JsonField<ModelSpend> = JsonMissing.of()
                private var models: JsonField<MutableList<JsonValue>>? = null
                private var objectPermission: JsonField<ObjectPermission> = JsonMissing.of()
                private var objectPermissionId: JsonField<String> = JsonMissing.of()
                private var orgId: JsonField<String> = JsonMissing.of()
                private var organizationMaxBudget: JsonField<Double> = JsonMissing.of()
                private var organizationMetadata: JsonField<OrganizationMetadata> = JsonMissing.of()
                private var organizationRpmLimit: JsonField<Long> = JsonMissing.of()
                private var organizationTpmLimit: JsonField<Long> = JsonMissing.of()
                private var parentOtelSpan: JsonValue = JsonMissing.of()
                private var permissions: JsonField<Permissions> = JsonMissing.of()
                private var requestRoute: JsonField<String> = JsonMissing.of()
                private var rotationCount: JsonField<Long> = JsonMissing.of()
                private var rotationInterval: JsonField<String> = JsonMissing.of()
                private var routerSettings: JsonField<RouterSettings> = JsonMissing.of()
                private var rpmLimit: JsonField<Long> = JsonMissing.of()
                private var rpmLimitPerModel: JsonField<RpmLimitPerModel> = JsonMissing.of()
                private var softBudget: JsonField<Double> = JsonMissing.of()
                private var softBudgetCooldown: JsonField<Boolean> = JsonMissing.of()
                private var spend: JsonField<Double> = JsonMissing.of()
                private var teamAlias: JsonField<String> = JsonMissing.of()
                private var teamBlocked: JsonField<Boolean> = JsonMissing.of()
                private var teamId: JsonField<String> = JsonMissing.of()
                private var teamMaxBudget: JsonField<Double> = JsonMissing.of()
                private var teamMember: JsonField<Member> = JsonMissing.of()
                private var teamMemberRpmLimit: JsonField<Long> = JsonMissing.of()
                private var teamMemberSpend: JsonField<Double> = JsonMissing.of()
                private var teamMemberTpmLimit: JsonField<Long> = JsonMissing.of()
                private var teamMetadata: JsonField<TeamMetadata> = JsonMissing.of()
                private var teamModelAliases: JsonField<TeamModelAliases> = JsonMissing.of()
                private var teamModels: JsonField<MutableList<JsonValue>>? = null
                private var teamObjectPermissionId: JsonField<String> = JsonMissing.of()
                private var teamRpmLimit: JsonField<Long> = JsonMissing.of()
                private var teamSpend: JsonField<Double> = JsonMissing.of()
                private var teamTpmLimit: JsonField<Long> = JsonMissing.of()
                private var tpmLimit: JsonField<Long> = JsonMissing.of()
                private var tpmLimitPerModel: JsonField<TpmLimitPerModel> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var updatedBy: JsonField<String> = JsonMissing.of()
                private var user: JsonValue = JsonMissing.of()
                private var userEmail: JsonField<String> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var userMaxBudget: JsonField<Double> = JsonMissing.of()
                private var userRole: JsonField<UserRoles> = JsonMissing.of()
                private var userRpmLimit: JsonField<Long> = JsonMissing.of()
                private var userSpend: JsonField<Double> = JsonMissing.of()
                private var userTpmLimit: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(userApiKeyAuth: UserApiKeyAuth) = apply {
                    token = userApiKeyAuth.token
                    aliases = userApiKeyAuth.aliases
                    allowedCacheControls =
                        userApiKeyAuth.allowedCacheControls.map { it.toMutableList() }
                    allowedModelRegion = userApiKeyAuth.allowedModelRegion
                    allowedRoutes = userApiKeyAuth.allowedRoutes.map { it.toMutableList() }
                    apiKey = userApiKeyAuth.apiKey
                    autoRotate = userApiKeyAuth.autoRotate
                    blocked = userApiKeyAuth.blocked
                    budgetDuration = userApiKeyAuth.budgetDuration
                    budgetResetAt = userApiKeyAuth.budgetResetAt
                    config = userApiKeyAuth.config
                    createdAt = userApiKeyAuth.createdAt
                    createdBy = userApiKeyAuth.createdBy
                    endUserId = userApiKeyAuth.endUserId
                    endUserMaxBudget = userApiKeyAuth.endUserMaxBudget
                    endUserRpmLimit = userApiKeyAuth.endUserRpmLimit
                    endUserTpmLimit = userApiKeyAuth.endUserTpmLimit
                    expires = userApiKeyAuth.expires
                    keyAlias = userApiKeyAuth.keyAlias
                    keyName = userApiKeyAuth.keyName
                    keyRotationAt = userApiKeyAuth.keyRotationAt
                    lastRefreshedAt = userApiKeyAuth.lastRefreshedAt
                    lastRotationAt = userApiKeyAuth.lastRotationAt
                    litellmBudgetTable = userApiKeyAuth.litellmBudgetTable
                    maxBudget = userApiKeyAuth.maxBudget
                    maxParallelRequests = userApiKeyAuth.maxParallelRequests
                    metadata = userApiKeyAuth.metadata
                    modelMaxBudget = userApiKeyAuth.modelMaxBudget
                    modelSpend = userApiKeyAuth.modelSpend
                    models = userApiKeyAuth.models.map { it.toMutableList() }
                    objectPermission = userApiKeyAuth.objectPermission
                    objectPermissionId = userApiKeyAuth.objectPermissionId
                    orgId = userApiKeyAuth.orgId
                    organizationMaxBudget = userApiKeyAuth.organizationMaxBudget
                    organizationMetadata = userApiKeyAuth.organizationMetadata
                    organizationRpmLimit = userApiKeyAuth.organizationRpmLimit
                    organizationTpmLimit = userApiKeyAuth.organizationTpmLimit
                    parentOtelSpan = userApiKeyAuth.parentOtelSpan
                    permissions = userApiKeyAuth.permissions
                    requestRoute = userApiKeyAuth.requestRoute
                    rotationCount = userApiKeyAuth.rotationCount
                    rotationInterval = userApiKeyAuth.rotationInterval
                    routerSettings = userApiKeyAuth.routerSettings
                    rpmLimit = userApiKeyAuth.rpmLimit
                    rpmLimitPerModel = userApiKeyAuth.rpmLimitPerModel
                    softBudget = userApiKeyAuth.softBudget
                    softBudgetCooldown = userApiKeyAuth.softBudgetCooldown
                    spend = userApiKeyAuth.spend
                    teamAlias = userApiKeyAuth.teamAlias
                    teamBlocked = userApiKeyAuth.teamBlocked
                    teamId = userApiKeyAuth.teamId
                    teamMaxBudget = userApiKeyAuth.teamMaxBudget
                    teamMember = userApiKeyAuth.teamMember
                    teamMemberRpmLimit = userApiKeyAuth.teamMemberRpmLimit
                    teamMemberSpend = userApiKeyAuth.teamMemberSpend
                    teamMemberTpmLimit = userApiKeyAuth.teamMemberTpmLimit
                    teamMetadata = userApiKeyAuth.teamMetadata
                    teamModelAliases = userApiKeyAuth.teamModelAliases
                    teamModels = userApiKeyAuth.teamModels.map { it.toMutableList() }
                    teamObjectPermissionId = userApiKeyAuth.teamObjectPermissionId
                    teamRpmLimit = userApiKeyAuth.teamRpmLimit
                    teamSpend = userApiKeyAuth.teamSpend
                    teamTpmLimit = userApiKeyAuth.teamTpmLimit
                    tpmLimit = userApiKeyAuth.tpmLimit
                    tpmLimitPerModel = userApiKeyAuth.tpmLimitPerModel
                    updatedAt = userApiKeyAuth.updatedAt
                    updatedBy = userApiKeyAuth.updatedBy
                    user = userApiKeyAuth.user
                    userEmail = userApiKeyAuth.userEmail
                    userId = userApiKeyAuth.userId
                    userMaxBudget = userApiKeyAuth.userMaxBudget
                    userRole = userApiKeyAuth.userRole
                    userRpmLimit = userApiKeyAuth.userRpmLimit
                    userSpend = userApiKeyAuth.userSpend
                    userTpmLimit = userApiKeyAuth.userTpmLimit
                    additionalProperties = userApiKeyAuth.additionalProperties.toMutableMap()
                }

                fun token(token: String?) = token(JsonField.ofNullable(token))

                /** Alias for calling [Builder.token] with `token.orElse(null)`. */
                fun token(token: Optional<String>) = token(token.getOrNull())

                /**
                 * Sets [Builder.token] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.token] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun token(token: JsonField<String>) = apply { this.token = token }

                fun aliases(aliases: Aliases) = aliases(JsonField.of(aliases))

                /**
                 * Sets [Builder.aliases] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aliases] with a well-typed [Aliases] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * `List<JsonValue>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
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

                fun allowedModelRegion(allowedModelRegion: AllowedModelRegion?) =
                    allowedModelRegion(JsonField.ofNullable(allowedModelRegion))

                /**
                 * Alias for calling [Builder.allowedModelRegion] with
                 * `allowedModelRegion.orElse(null)`.
                 */
                fun allowedModelRegion(allowedModelRegion: Optional<AllowedModelRegion>) =
                    allowedModelRegion(allowedModelRegion.getOrNull())

                /**
                 * Sets [Builder.allowedModelRegion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowedModelRegion] with a well-typed
                 * [AllowedModelRegion] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun allowedModelRegion(allowedModelRegion: JsonField<AllowedModelRegion>) = apply {
                    this.allowedModelRegion = allowedModelRegion
                }

                fun allowedRoutes(allowedRoutes: List<JsonValue>?) =
                    allowedRoutes(JsonField.ofNullable(allowedRoutes))

                /** Alias for calling [Builder.allowedRoutes] with `allowedRoutes.orElse(null)`. */
                fun allowedRoutes(allowedRoutes: Optional<List<JsonValue>>) =
                    allowedRoutes(allowedRoutes.getOrNull())

                /**
                 * Sets [Builder.allowedRoutes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowedRoutes] with a well-typed
                 * `List<JsonValue>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
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

                fun apiKey(apiKey: String?) = apiKey(JsonField.ofNullable(apiKey))

                /** Alias for calling [Builder.apiKey] with `apiKey.orElse(null)`. */
                fun apiKey(apiKey: Optional<String>) = apiKey(apiKey.getOrNull())

                /**
                 * Sets [Builder.apiKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.apiKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun autoRotate(autoRotate: JsonField<Boolean>) = apply {
                    this.autoRotate = autoRotate
                }

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
                 * You should usually call [Builder.blocked] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

                fun budgetDuration(budgetDuration: String?) =
                    budgetDuration(JsonField.ofNullable(budgetDuration))

                /**
                 * Alias for calling [Builder.budgetDuration] with `budgetDuration.orElse(null)`.
                 */
                fun budgetDuration(budgetDuration: Optional<String>) =
                    budgetDuration(budgetDuration.getOrNull())

                /**
                 * Sets [Builder.budgetDuration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.budgetDuration] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.budgetResetAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun budgetResetAt(budgetResetAt: JsonField<OffsetDateTime>) = apply {
                    this.budgetResetAt = budgetResetAt
                }

                fun config(config: Config) = config(JsonField.of(config))

                /**
                 * Sets [Builder.config] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.config] with a well-typed [Config] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun config(config: JsonField<Config>) = apply { this.config = config }

                fun createdAt(createdAt: OffsetDateTime?) =
                    createdAt(JsonField.ofNullable(createdAt))

                /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
                fun createdAt(createdAt: Optional<OffsetDateTime>) =
                    createdAt(createdAt.getOrNull())

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun createdBy(createdBy: String?) = createdBy(JsonField.ofNullable(createdBy))

                /** Alias for calling [Builder.createdBy] with `createdBy.orElse(null)`. */
                fun createdBy(createdBy: Optional<String>) = createdBy(createdBy.getOrNull())

                /**
                 * Sets [Builder.createdBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

                fun endUserId(endUserId: String?) = endUserId(JsonField.ofNullable(endUserId))

                /** Alias for calling [Builder.endUserId] with `endUserId.orElse(null)`. */
                fun endUserId(endUserId: Optional<String>) = endUserId(endUserId.getOrNull())

                /**
                 * Sets [Builder.endUserId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endUserId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endUserId(endUserId: JsonField<String>) = apply { this.endUserId = endUserId }

                fun endUserMaxBudget(endUserMaxBudget: Double?) =
                    endUserMaxBudget(JsonField.ofNullable(endUserMaxBudget))

                /**
                 * Alias for [Builder.endUserMaxBudget].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun endUserMaxBudget(endUserMaxBudget: Double) =
                    endUserMaxBudget(endUserMaxBudget as Double?)

                /**
                 * Alias for calling [Builder.endUserMaxBudget] with
                 * `endUserMaxBudget.orElse(null)`.
                 */
                fun endUserMaxBudget(endUserMaxBudget: Optional<Double>) =
                    endUserMaxBudget(endUserMaxBudget.getOrNull())

                /**
                 * Sets [Builder.endUserMaxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endUserMaxBudget] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endUserMaxBudget(endUserMaxBudget: JsonField<Double>) = apply {
                    this.endUserMaxBudget = endUserMaxBudget
                }

                fun endUserRpmLimit(endUserRpmLimit: Long?) =
                    endUserRpmLimit(JsonField.ofNullable(endUserRpmLimit))

                /**
                 * Alias for [Builder.endUserRpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun endUserRpmLimit(endUserRpmLimit: Long) =
                    endUserRpmLimit(endUserRpmLimit as Long?)

                /**
                 * Alias for calling [Builder.endUserRpmLimit] with `endUserRpmLimit.orElse(null)`.
                 */
                fun endUserRpmLimit(endUserRpmLimit: Optional<Long>) =
                    endUserRpmLimit(endUserRpmLimit.getOrNull())

                /**
                 * Sets [Builder.endUserRpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endUserRpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endUserRpmLimit(endUserRpmLimit: JsonField<Long>) = apply {
                    this.endUserRpmLimit = endUserRpmLimit
                }

                fun endUserTpmLimit(endUserTpmLimit: Long?) =
                    endUserTpmLimit(JsonField.ofNullable(endUserTpmLimit))

                /**
                 * Alias for [Builder.endUserTpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun endUserTpmLimit(endUserTpmLimit: Long) =
                    endUserTpmLimit(endUserTpmLimit as Long?)

                /**
                 * Alias for calling [Builder.endUserTpmLimit] with `endUserTpmLimit.orElse(null)`.
                 */
                fun endUserTpmLimit(endUserTpmLimit: Optional<Long>) =
                    endUserTpmLimit(endUserTpmLimit.getOrNull())

                /**
                 * Sets [Builder.endUserTpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endUserTpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endUserTpmLimit(endUserTpmLimit: JsonField<Long>) = apply {
                    this.endUserTpmLimit = endUserTpmLimit
                }

                fun expires(expires: Expires?) = expires(JsonField.ofNullable(expires))

                /** Alias for calling [Builder.expires] with `expires.orElse(null)`. */
                fun expires(expires: Optional<Expires>) = expires(expires.getOrNull())

                /**
                 * Sets [Builder.expires] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expires] with a well-typed [Expires] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expires(expires: JsonField<Expires>) = apply { this.expires = expires }

                /** Alias for calling [expires] with `Expires.ofString(string)`. */
                fun expires(string: String) = expires(Expires.ofString(string))

                /** Alias for calling [expires] with `Expires.ofOffsetDateTime(offsetDateTime)`. */
                fun expires(offsetDateTime: OffsetDateTime) =
                    expires(Expires.ofOffsetDateTime(offsetDateTime))

                fun keyAlias(keyAlias: String?) = keyAlias(JsonField.ofNullable(keyAlias))

                /** Alias for calling [Builder.keyAlias] with `keyAlias.orElse(null)`. */
                fun keyAlias(keyAlias: Optional<String>) = keyAlias(keyAlias.getOrNull())

                /**
                 * Sets [Builder.keyAlias] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyAlias] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun keyAlias(keyAlias: JsonField<String>) = apply { this.keyAlias = keyAlias }

                fun keyName(keyName: String?) = keyName(JsonField.ofNullable(keyName))

                /** Alias for calling [Builder.keyName] with `keyName.orElse(null)`. */
                fun keyName(keyName: Optional<String>) = keyName(keyName.getOrNull())

                /**
                 * Sets [Builder.keyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun keyName(keyName: JsonField<String>) = apply { this.keyName = keyName }

                fun keyRotationAt(keyRotationAt: OffsetDateTime?) =
                    keyRotationAt(JsonField.ofNullable(keyRotationAt))

                /** Alias for calling [Builder.keyRotationAt] with `keyRotationAt.orElse(null)`. */
                fun keyRotationAt(keyRotationAt: Optional<OffsetDateTime>) =
                    keyRotationAt(keyRotationAt.getOrNull())

                /**
                 * Sets [Builder.keyRotationAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyRotationAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun keyRotationAt(keyRotationAt: JsonField<OffsetDateTime>) = apply {
                    this.keyRotationAt = keyRotationAt
                }

                fun lastRefreshedAt(lastRefreshedAt: Double?) =
                    lastRefreshedAt(JsonField.ofNullable(lastRefreshedAt))

                /**
                 * Alias for [Builder.lastRefreshedAt].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun lastRefreshedAt(lastRefreshedAt: Double) =
                    lastRefreshedAt(lastRefreshedAt as Double?)

                /**
                 * Alias for calling [Builder.lastRefreshedAt] with `lastRefreshedAt.orElse(null)`.
                 */
                fun lastRefreshedAt(lastRefreshedAt: Optional<Double>) =
                    lastRefreshedAt(lastRefreshedAt.getOrNull())

                /**
                 * Sets [Builder.lastRefreshedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastRefreshedAt] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun lastRefreshedAt(lastRefreshedAt: JsonField<Double>) = apply {
                    this.lastRefreshedAt = lastRefreshedAt
                }

                fun lastRotationAt(lastRotationAt: OffsetDateTime?) =
                    lastRotationAt(JsonField.ofNullable(lastRotationAt))

                /**
                 * Alias for calling [Builder.lastRotationAt] with `lastRotationAt.orElse(null)`.
                 */
                fun lastRotationAt(lastRotationAt: Optional<OffsetDateTime>) =
                    lastRotationAt(lastRotationAt.getOrNull())

                /**
                 * Sets [Builder.lastRotationAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastRotationAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun lastRotationAt(lastRotationAt: JsonField<OffsetDateTime>) = apply {
                    this.lastRotationAt = lastRotationAt
                }

                fun litellmBudgetTable(litellmBudgetTable: LitellmBudgetTable?) =
                    litellmBudgetTable(JsonField.ofNullable(litellmBudgetTable))

                /**
                 * Alias for calling [Builder.litellmBudgetTable] with
                 * `litellmBudgetTable.orElse(null)`.
                 */
                fun litellmBudgetTable(litellmBudgetTable: Optional<LitellmBudgetTable>) =
                    litellmBudgetTable(litellmBudgetTable.getOrNull())

                /**
                 * Sets [Builder.litellmBudgetTable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.litellmBudgetTable] with a well-typed
                 * [LitellmBudgetTable] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun litellmBudgetTable(litellmBudgetTable: JsonField<LitellmBudgetTable>) = apply {
                    this.litellmBudgetTable = litellmBudgetTable
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
                 * You should usually call [Builder.maxBudget] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.maxParallelRequests] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
                    this.maxParallelRequests = maxParallelRequests
                }

                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun modelMaxBudget(modelMaxBudget: ModelMaxBudget) =
                    modelMaxBudget(JsonField.of(modelMaxBudget))

                /**
                 * Sets [Builder.modelMaxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelMaxBudget] with a well-typed
                 * [ModelMaxBudget] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun modelMaxBudget(modelMaxBudget: JsonField<ModelMaxBudget>) = apply {
                    this.modelMaxBudget = modelMaxBudget
                }

                fun modelSpend(modelSpend: ModelSpend) = modelSpend(JsonField.of(modelSpend))

                /**
                 * Sets [Builder.modelSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelSpend] with a well-typed [ModelSpend] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelSpend(modelSpend: JsonField<ModelSpend>) = apply {
                    this.modelSpend = modelSpend
                }

                fun models(models: List<JsonValue>) = models(JsonField.of(models))

                /**
                 * Sets [Builder.models] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.models] with a well-typed `List<JsonValue>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Alias for calling [Builder.objectPermission] with
                 * `objectPermission.orElse(null)`.
                 */
                fun objectPermission(objectPermission: Optional<ObjectPermission>) =
                    objectPermission(objectPermission.getOrNull())

                /**
                 * Sets [Builder.objectPermission] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.objectPermission] with a well-typed
                 * [ObjectPermission] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun objectPermission(objectPermission: JsonField<ObjectPermission>) = apply {
                    this.objectPermission = objectPermission
                }

                fun objectPermissionId(objectPermissionId: String?) =
                    objectPermissionId(JsonField.ofNullable(objectPermissionId))

                /**
                 * Alias for calling [Builder.objectPermissionId] with
                 * `objectPermissionId.orElse(null)`.
                 */
                fun objectPermissionId(objectPermissionId: Optional<String>) =
                    objectPermissionId(objectPermissionId.getOrNull())

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

                fun orgId(orgId: String?) = orgId(JsonField.ofNullable(orgId))

                /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
                fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

                /**
                 * Sets [Builder.orgId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orgId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

                fun organizationMaxBudget(organizationMaxBudget: Double?) =
                    organizationMaxBudget(JsonField.ofNullable(organizationMaxBudget))

                /**
                 * Alias for [Builder.organizationMaxBudget].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun organizationMaxBudget(organizationMaxBudget: Double) =
                    organizationMaxBudget(organizationMaxBudget as Double?)

                /**
                 * Alias for calling [Builder.organizationMaxBudget] with
                 * `organizationMaxBudget.orElse(null)`.
                 */
                fun organizationMaxBudget(organizationMaxBudget: Optional<Double>) =
                    organizationMaxBudget(organizationMaxBudget.getOrNull())

                /**
                 * Sets [Builder.organizationMaxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organizationMaxBudget] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun organizationMaxBudget(organizationMaxBudget: JsonField<Double>) = apply {
                    this.organizationMaxBudget = organizationMaxBudget
                }

                fun organizationMetadata(organizationMetadata: OrganizationMetadata?) =
                    organizationMetadata(JsonField.ofNullable(organizationMetadata))

                /**
                 * Alias for calling [Builder.organizationMetadata] with
                 * `organizationMetadata.orElse(null)`.
                 */
                fun organizationMetadata(organizationMetadata: Optional<OrganizationMetadata>) =
                    organizationMetadata(organizationMetadata.getOrNull())

                /**
                 * Sets [Builder.organizationMetadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organizationMetadata] with a well-typed
                 * [OrganizationMetadata] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun organizationMetadata(organizationMetadata: JsonField<OrganizationMetadata>) =
                    apply {
                        this.organizationMetadata = organizationMetadata
                    }

                fun organizationRpmLimit(organizationRpmLimit: Long?) =
                    organizationRpmLimit(JsonField.ofNullable(organizationRpmLimit))

                /**
                 * Alias for [Builder.organizationRpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun organizationRpmLimit(organizationRpmLimit: Long) =
                    organizationRpmLimit(organizationRpmLimit as Long?)

                /**
                 * Alias for calling [Builder.organizationRpmLimit] with
                 * `organizationRpmLimit.orElse(null)`.
                 */
                fun organizationRpmLimit(organizationRpmLimit: Optional<Long>) =
                    organizationRpmLimit(organizationRpmLimit.getOrNull())

                /**
                 * Sets [Builder.organizationRpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organizationRpmLimit] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun organizationRpmLimit(organizationRpmLimit: JsonField<Long>) = apply {
                    this.organizationRpmLimit = organizationRpmLimit
                }

                fun organizationTpmLimit(organizationTpmLimit: Long?) =
                    organizationTpmLimit(JsonField.ofNullable(organizationTpmLimit))

                /**
                 * Alias for [Builder.organizationTpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun organizationTpmLimit(organizationTpmLimit: Long) =
                    organizationTpmLimit(organizationTpmLimit as Long?)

                /**
                 * Alias for calling [Builder.organizationTpmLimit] with
                 * `organizationTpmLimit.orElse(null)`.
                 */
                fun organizationTpmLimit(organizationTpmLimit: Optional<Long>) =
                    organizationTpmLimit(organizationTpmLimit.getOrNull())

                /**
                 * Sets [Builder.organizationTpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.organizationTpmLimit] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun organizationTpmLimit(organizationTpmLimit: JsonField<Long>) = apply {
                    this.organizationTpmLimit = organizationTpmLimit
                }

                fun parentOtelSpan(parentOtelSpan: JsonValue) = apply {
                    this.parentOtelSpan = parentOtelSpan
                }

                fun permissions(permissions: Permissions) = permissions(JsonField.of(permissions))

                /**
                 * Sets [Builder.permissions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissions] with a well-typed [Permissions]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun permissions(permissions: JsonField<Permissions>) = apply {
                    this.permissions = permissions
                }

                fun requestRoute(requestRoute: String?) =
                    requestRoute(JsonField.ofNullable(requestRoute))

                /** Alias for calling [Builder.requestRoute] with `requestRoute.orElse(null)`. */
                fun requestRoute(requestRoute: Optional<String>) =
                    requestRoute(requestRoute.getOrNull())

                /**
                 * Sets [Builder.requestRoute] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestRoute] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requestRoute(requestRoute: JsonField<String>) = apply {
                    this.requestRoute = requestRoute
                }

                fun rotationCount(rotationCount: Long?) =
                    rotationCount(JsonField.ofNullable(rotationCount))

                /**
                 * Alias for [Builder.rotationCount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun rotationCount(rotationCount: Long) = rotationCount(rotationCount as Long?)

                /** Alias for calling [Builder.rotationCount] with `rotationCount.orElse(null)`. */
                fun rotationCount(rotationCount: Optional<Long>) =
                    rotationCount(rotationCount.getOrNull())

                /**
                 * Sets [Builder.rotationCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rotationCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rotationCount(rotationCount: JsonField<Long>) = apply {
                    this.rotationCount = rotationCount
                }

                fun rotationInterval(rotationInterval: String?) =
                    rotationInterval(JsonField.ofNullable(rotationInterval))

                /**
                 * Alias for calling [Builder.rotationInterval] with
                 * `rotationInterval.orElse(null)`.
                 */
                fun rotationInterval(rotationInterval: Optional<String>) =
                    rotationInterval(rotationInterval.getOrNull())

                /**
                 * Sets [Builder.rotationInterval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rotationInterval] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rotationInterval(rotationInterval: JsonField<String>) = apply {
                    this.rotationInterval = rotationInterval
                }

                fun routerSettings(routerSettings: RouterSettings?) =
                    routerSettings(JsonField.ofNullable(routerSettings))

                /**
                 * Alias for calling [Builder.routerSettings] with `routerSettings.orElse(null)`.
                 */
                fun routerSettings(routerSettings: Optional<RouterSettings>) =
                    routerSettings(routerSettings.getOrNull())

                /**
                 * Sets [Builder.routerSettings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routerSettings] with a well-typed
                 * [RouterSettings] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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
                 * You should usually call [Builder.rpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

                fun rpmLimitPerModel(rpmLimitPerModel: RpmLimitPerModel?) =
                    rpmLimitPerModel(JsonField.ofNullable(rpmLimitPerModel))

                /**
                 * Alias for calling [Builder.rpmLimitPerModel] with
                 * `rpmLimitPerModel.orElse(null)`.
                 */
                fun rpmLimitPerModel(rpmLimitPerModel: Optional<RpmLimitPerModel>) =
                    rpmLimitPerModel(rpmLimitPerModel.getOrNull())

                /**
                 * Sets [Builder.rpmLimitPerModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rpmLimitPerModel] with a well-typed
                 * [RpmLimitPerModel] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun rpmLimitPerModel(rpmLimitPerModel: JsonField<RpmLimitPerModel>) = apply {
                    this.rpmLimitPerModel = rpmLimitPerModel
                }

                fun softBudget(softBudget: Double?) = softBudget(JsonField.ofNullable(softBudget))

                /**
                 * Alias for [Builder.softBudget].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun softBudget(softBudget: Double) = softBudget(softBudget as Double?)

                /** Alias for calling [Builder.softBudget] with `softBudget.orElse(null)`. */
                fun softBudget(softBudget: Optional<Double>) = softBudget(softBudget.getOrNull())

                /**
                 * Sets [Builder.softBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.softBudget] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun softBudget(softBudget: JsonField<Double>) = apply {
                    this.softBudget = softBudget
                }

                fun softBudgetCooldown(softBudgetCooldown: Boolean) =
                    softBudgetCooldown(JsonField.of(softBudgetCooldown))

                /**
                 * Sets [Builder.softBudgetCooldown] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.softBudgetCooldown] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun softBudgetCooldown(softBudgetCooldown: JsonField<Boolean>) = apply {
                    this.softBudgetCooldown = softBudgetCooldown
                }

                fun spend(spend: Double) = spend(JsonField.of(spend))

                /**
                 * Sets [Builder.spend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spend] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

                fun teamAlias(teamAlias: String?) = teamAlias(JsonField.ofNullable(teamAlias))

                /** Alias for calling [Builder.teamAlias] with `teamAlias.orElse(null)`. */
                fun teamAlias(teamAlias: Optional<String>) = teamAlias(teamAlias.getOrNull())

                /**
                 * Sets [Builder.teamAlias] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamAlias] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamAlias(teamAlias: JsonField<String>) = apply { this.teamAlias = teamAlias }

                fun teamBlocked(teamBlocked: Boolean) = teamBlocked(JsonField.of(teamBlocked))

                /**
                 * Sets [Builder.teamBlocked] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamBlocked] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamBlocked(teamBlocked: JsonField<Boolean>) = apply {
                    this.teamBlocked = teamBlocked
                }

                fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

                /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
                fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

                /**
                 * Sets [Builder.teamId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

                fun teamMaxBudget(teamMaxBudget: Double?) =
                    teamMaxBudget(JsonField.ofNullable(teamMaxBudget))

                /**
                 * Alias for [Builder.teamMaxBudget].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamMaxBudget(teamMaxBudget: Double) = teamMaxBudget(teamMaxBudget as Double?)

                /** Alias for calling [Builder.teamMaxBudget] with `teamMaxBudget.orElse(null)`. */
                fun teamMaxBudget(teamMaxBudget: Optional<Double>) =
                    teamMaxBudget(teamMaxBudget.getOrNull())

                /**
                 * Sets [Builder.teamMaxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamMaxBudget] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamMaxBudget(teamMaxBudget: JsonField<Double>) = apply {
                    this.teamMaxBudget = teamMaxBudget
                }

                fun teamMember(teamMember: Member?) = teamMember(JsonField.ofNullable(teamMember))

                /** Alias for calling [Builder.teamMember] with `teamMember.orElse(null)`. */
                fun teamMember(teamMember: Optional<Member>) = teamMember(teamMember.getOrNull())

                /**
                 * Sets [Builder.teamMember] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamMember] with a well-typed [Member] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamMember(teamMember: JsonField<Member>) = apply {
                    this.teamMember = teamMember
                }

                fun teamMemberRpmLimit(teamMemberRpmLimit: Long?) =
                    teamMemberRpmLimit(JsonField.ofNullable(teamMemberRpmLimit))

                /**
                 * Alias for [Builder.teamMemberRpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamMemberRpmLimit(teamMemberRpmLimit: Long) =
                    teamMemberRpmLimit(teamMemberRpmLimit as Long?)

                /**
                 * Alias for calling [Builder.teamMemberRpmLimit] with
                 * `teamMemberRpmLimit.orElse(null)`.
                 */
                fun teamMemberRpmLimit(teamMemberRpmLimit: Optional<Long>) =
                    teamMemberRpmLimit(teamMemberRpmLimit.getOrNull())

                /**
                 * Sets [Builder.teamMemberRpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamMemberRpmLimit] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun teamMemberRpmLimit(teamMemberRpmLimit: JsonField<Long>) = apply {
                    this.teamMemberRpmLimit = teamMemberRpmLimit
                }

                fun teamMemberSpend(teamMemberSpend: Double?) =
                    teamMemberSpend(JsonField.ofNullable(teamMemberSpend))

                /**
                 * Alias for [Builder.teamMemberSpend].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamMemberSpend(teamMemberSpend: Double) =
                    teamMemberSpend(teamMemberSpend as Double?)

                /**
                 * Alias for calling [Builder.teamMemberSpend] with `teamMemberSpend.orElse(null)`.
                 */
                fun teamMemberSpend(teamMemberSpend: Optional<Double>) =
                    teamMemberSpend(teamMemberSpend.getOrNull())

                /**
                 * Sets [Builder.teamMemberSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamMemberSpend] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun teamMemberSpend(teamMemberSpend: JsonField<Double>) = apply {
                    this.teamMemberSpend = teamMemberSpend
                }

                fun teamMemberTpmLimit(teamMemberTpmLimit: Long?) =
                    teamMemberTpmLimit(JsonField.ofNullable(teamMemberTpmLimit))

                /**
                 * Alias for [Builder.teamMemberTpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamMemberTpmLimit(teamMemberTpmLimit: Long) =
                    teamMemberTpmLimit(teamMemberTpmLimit as Long?)

                /**
                 * Alias for calling [Builder.teamMemberTpmLimit] with
                 * `teamMemberTpmLimit.orElse(null)`.
                 */
                fun teamMemberTpmLimit(teamMemberTpmLimit: Optional<Long>) =
                    teamMemberTpmLimit(teamMemberTpmLimit.getOrNull())

                /**
                 * Sets [Builder.teamMemberTpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamMemberTpmLimit] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun teamMemberTpmLimit(teamMemberTpmLimit: JsonField<Long>) = apply {
                    this.teamMemberTpmLimit = teamMemberTpmLimit
                }

                fun teamMetadata(teamMetadata: TeamMetadata?) =
                    teamMetadata(JsonField.ofNullable(teamMetadata))

                /** Alias for calling [Builder.teamMetadata] with `teamMetadata.orElse(null)`. */
                fun teamMetadata(teamMetadata: Optional<TeamMetadata>) =
                    teamMetadata(teamMetadata.getOrNull())

                /**
                 * Sets [Builder.teamMetadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamMetadata] with a well-typed [TeamMetadata]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun teamMetadata(teamMetadata: JsonField<TeamMetadata>) = apply {
                    this.teamMetadata = teamMetadata
                }

                fun teamModelAliases(teamModelAliases: TeamModelAliases?) =
                    teamModelAliases(JsonField.ofNullable(teamModelAliases))

                /**
                 * Alias for calling [Builder.teamModelAliases] with
                 * `teamModelAliases.orElse(null)`.
                 */
                fun teamModelAliases(teamModelAliases: Optional<TeamModelAliases>) =
                    teamModelAliases(teamModelAliases.getOrNull())

                /**
                 * Sets [Builder.teamModelAliases] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamModelAliases] with a well-typed
                 * [TeamModelAliases] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun teamModelAliases(teamModelAliases: JsonField<TeamModelAliases>) = apply {
                    this.teamModelAliases = teamModelAliases
                }

                fun teamModels(teamModels: List<JsonValue>) = teamModels(JsonField.of(teamModels))

                /**
                 * Sets [Builder.teamModels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamModels] with a well-typed `List<JsonValue>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun teamModels(teamModels: JsonField<List<JsonValue>>) = apply {
                    this.teamModels = teamModels.map { it.toMutableList() }
                }

                /**
                 * Adds a single [JsonValue] to [teamModels].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTeamModel(teamModel: JsonValue) = apply {
                    teamModels =
                        (teamModels ?: JsonField.of(mutableListOf())).also {
                            checkKnown("teamModels", it).add(teamModel)
                        }
                }

                fun teamObjectPermissionId(teamObjectPermissionId: String?) =
                    teamObjectPermissionId(JsonField.ofNullable(teamObjectPermissionId))

                /**
                 * Alias for calling [Builder.teamObjectPermissionId] with
                 * `teamObjectPermissionId.orElse(null)`.
                 */
                fun teamObjectPermissionId(teamObjectPermissionId: Optional<String>) =
                    teamObjectPermissionId(teamObjectPermissionId.getOrNull())

                /**
                 * Sets [Builder.teamObjectPermissionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamObjectPermissionId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun teamObjectPermissionId(teamObjectPermissionId: JsonField<String>) = apply {
                    this.teamObjectPermissionId = teamObjectPermissionId
                }

                fun teamRpmLimit(teamRpmLimit: Long?) =
                    teamRpmLimit(JsonField.ofNullable(teamRpmLimit))

                /**
                 * Alias for [Builder.teamRpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamRpmLimit(teamRpmLimit: Long) = teamRpmLimit(teamRpmLimit as Long?)

                /** Alias for calling [Builder.teamRpmLimit] with `teamRpmLimit.orElse(null)`. */
                fun teamRpmLimit(teamRpmLimit: Optional<Long>) =
                    teamRpmLimit(teamRpmLimit.getOrNull())

                /**
                 * Sets [Builder.teamRpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamRpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamRpmLimit(teamRpmLimit: JsonField<Long>) = apply {
                    this.teamRpmLimit = teamRpmLimit
                }

                fun teamSpend(teamSpend: Double?) = teamSpend(JsonField.ofNullable(teamSpend))

                /**
                 * Alias for [Builder.teamSpend].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamSpend(teamSpend: Double) = teamSpend(teamSpend as Double?)

                /** Alias for calling [Builder.teamSpend] with `teamSpend.orElse(null)`. */
                fun teamSpend(teamSpend: Optional<Double>) = teamSpend(teamSpend.getOrNull())

                /**
                 * Sets [Builder.teamSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamSpend] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamSpend(teamSpend: JsonField<Double>) = apply { this.teamSpend = teamSpend }

                fun teamTpmLimit(teamTpmLimit: Long?) =
                    teamTpmLimit(JsonField.ofNullable(teamTpmLimit))

                /**
                 * Alias for [Builder.teamTpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun teamTpmLimit(teamTpmLimit: Long) = teamTpmLimit(teamTpmLimit as Long?)

                /** Alias for calling [Builder.teamTpmLimit] with `teamTpmLimit.orElse(null)`. */
                fun teamTpmLimit(teamTpmLimit: Optional<Long>) =
                    teamTpmLimit(teamTpmLimit.getOrNull())

                /**
                 * Sets [Builder.teamTpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamTpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamTpmLimit(teamTpmLimit: JsonField<Long>) = apply {
                    this.teamTpmLimit = teamTpmLimit
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
                 * You should usually call [Builder.tpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

                fun tpmLimitPerModel(tpmLimitPerModel: TpmLimitPerModel?) =
                    tpmLimitPerModel(JsonField.ofNullable(tpmLimitPerModel))

                /**
                 * Alias for calling [Builder.tpmLimitPerModel] with
                 * `tpmLimitPerModel.orElse(null)`.
                 */
                fun tpmLimitPerModel(tpmLimitPerModel: Optional<TpmLimitPerModel>) =
                    tpmLimitPerModel(tpmLimitPerModel.getOrNull())

                /**
                 * Sets [Builder.tpmLimitPerModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tpmLimitPerModel] with a well-typed
                 * [TpmLimitPerModel] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun tpmLimitPerModel(tpmLimitPerModel: JsonField<TpmLimitPerModel>) = apply {
                    this.tpmLimitPerModel = tpmLimitPerModel
                }

                fun updatedAt(updatedAt: OffsetDateTime?) =
                    updatedAt(JsonField.ofNullable(updatedAt))

                /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
                fun updatedAt(updatedAt: Optional<OffsetDateTime>) =
                    updatedAt(updatedAt.getOrNull())

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                fun updatedBy(updatedBy: String?) = updatedBy(JsonField.ofNullable(updatedBy))

                /** Alias for calling [Builder.updatedBy] with `updatedBy.orElse(null)`. */
                fun updatedBy(updatedBy: Optional<String>) = updatedBy(updatedBy.getOrNull())

                /**
                 * Sets [Builder.updatedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

                fun user(user: JsonValue) = apply { this.user = user }

                fun userEmail(userEmail: String?) = userEmail(JsonField.ofNullable(userEmail))

                /** Alias for calling [Builder.userEmail] with `userEmail.orElse(null)`. */
                fun userEmail(userEmail: Optional<String>) = userEmail(userEmail.getOrNull())

                /**
                 * Sets [Builder.userEmail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userEmail] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userEmail(userEmail: JsonField<String>) = apply { this.userEmail = userEmail }

                fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

                /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
                fun userId(userId: Optional<String>) = userId(userId.getOrNull())

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

                fun userMaxBudget(userMaxBudget: Double?) =
                    userMaxBudget(JsonField.ofNullable(userMaxBudget))

                /**
                 * Alias for [Builder.userMaxBudget].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun userMaxBudget(userMaxBudget: Double) = userMaxBudget(userMaxBudget as Double?)

                /** Alias for calling [Builder.userMaxBudget] with `userMaxBudget.orElse(null)`. */
                fun userMaxBudget(userMaxBudget: Optional<Double>) =
                    userMaxBudget(userMaxBudget.getOrNull())

                /**
                 * Sets [Builder.userMaxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userMaxBudget] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userMaxBudget(userMaxBudget: JsonField<Double>) = apply {
                    this.userMaxBudget = userMaxBudget
                }

                /**
                 * Admin Roles: PROXY_ADMIN: admin over the platform PROXY_ADMIN_VIEW_ONLY: can
                 * login, view all own keys, view all spend ORG_ADMIN: admin over a specific
                 * organization, can create teams, users only within their organization
                 *
                 * Internal User Roles: INTERNAL_USER: can login, view/create/delete their own keys,
                 * view their spend INTERNAL_USER_VIEW_ONLY: can login, view their own keys, view
                 * their own spend
                 *
                 * Team Roles: TEAM: used for JWT auth
                 *
                 * Customer Roles: CUSTOMER: External users -> these are customers
                 */
                fun userRole(userRole: UserRoles?) = userRole(JsonField.ofNullable(userRole))

                /** Alias for calling [Builder.userRole] with `userRole.orElse(null)`. */
                fun userRole(userRole: Optional<UserRoles>) = userRole(userRole.getOrNull())

                /**
                 * Sets [Builder.userRole] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userRole] with a well-typed [UserRoles] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userRole(userRole: JsonField<UserRoles>) = apply { this.userRole = userRole }

                fun userRpmLimit(userRpmLimit: Long?) =
                    userRpmLimit(JsonField.ofNullable(userRpmLimit))

                /**
                 * Alias for [Builder.userRpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun userRpmLimit(userRpmLimit: Long) = userRpmLimit(userRpmLimit as Long?)

                /** Alias for calling [Builder.userRpmLimit] with `userRpmLimit.orElse(null)`. */
                fun userRpmLimit(userRpmLimit: Optional<Long>) =
                    userRpmLimit(userRpmLimit.getOrNull())

                /**
                 * Sets [Builder.userRpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userRpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userRpmLimit(userRpmLimit: JsonField<Long>) = apply {
                    this.userRpmLimit = userRpmLimit
                }

                fun userSpend(userSpend: Double?) = userSpend(JsonField.ofNullable(userSpend))

                /**
                 * Alias for [Builder.userSpend].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun userSpend(userSpend: Double) = userSpend(userSpend as Double?)

                /** Alias for calling [Builder.userSpend] with `userSpend.orElse(null)`. */
                fun userSpend(userSpend: Optional<Double>) = userSpend(userSpend.getOrNull())

                /**
                 * Sets [Builder.userSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userSpend] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userSpend(userSpend: JsonField<Double>) = apply { this.userSpend = userSpend }

                fun userTpmLimit(userTpmLimit: Long?) =
                    userTpmLimit(JsonField.ofNullable(userTpmLimit))

                /**
                 * Alias for [Builder.userTpmLimit].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun userTpmLimit(userTpmLimit: Long) = userTpmLimit(userTpmLimit as Long?)

                /** Alias for calling [Builder.userTpmLimit] with `userTpmLimit.orElse(null)`. */
                fun userTpmLimit(userTpmLimit: Optional<Long>) =
                    userTpmLimit(userTpmLimit.getOrNull())

                /**
                 * Sets [Builder.userTpmLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userTpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userTpmLimit(userTpmLimit: JsonField<Long>) = apply {
                    this.userTpmLimit = userTpmLimit
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
                 * Returns an immutable instance of [UserApiKeyAuth].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UserApiKeyAuth =
                    UserApiKeyAuth(
                        token,
                        aliases,
                        (allowedCacheControls ?: JsonMissing.of()).map { it.toImmutable() },
                        allowedModelRegion,
                        (allowedRoutes ?: JsonMissing.of()).map { it.toImmutable() },
                        apiKey,
                        autoRotate,
                        blocked,
                        budgetDuration,
                        budgetResetAt,
                        config,
                        createdAt,
                        createdBy,
                        endUserId,
                        endUserMaxBudget,
                        endUserRpmLimit,
                        endUserTpmLimit,
                        expires,
                        keyAlias,
                        keyName,
                        keyRotationAt,
                        lastRefreshedAt,
                        lastRotationAt,
                        litellmBudgetTable,
                        maxBudget,
                        maxParallelRequests,
                        metadata,
                        modelMaxBudget,
                        modelSpend,
                        (models ?: JsonMissing.of()).map { it.toImmutable() },
                        objectPermission,
                        objectPermissionId,
                        orgId,
                        organizationMaxBudget,
                        organizationMetadata,
                        organizationRpmLimit,
                        organizationTpmLimit,
                        parentOtelSpan,
                        permissions,
                        requestRoute,
                        rotationCount,
                        rotationInterval,
                        routerSettings,
                        rpmLimit,
                        rpmLimitPerModel,
                        softBudget,
                        softBudgetCooldown,
                        spend,
                        teamAlias,
                        teamBlocked,
                        teamId,
                        teamMaxBudget,
                        teamMember,
                        teamMemberRpmLimit,
                        teamMemberSpend,
                        teamMemberTpmLimit,
                        teamMetadata,
                        teamModelAliases,
                        (teamModels ?: JsonMissing.of()).map { it.toImmutable() },
                        teamObjectPermissionId,
                        teamRpmLimit,
                        teamSpend,
                        teamTpmLimit,
                        tpmLimit,
                        tpmLimitPerModel,
                        updatedAt,
                        updatedBy,
                        user,
                        userEmail,
                        userId,
                        userMaxBudget,
                        userRole,
                        userRpmLimit,
                        userSpend,
                        userTpmLimit,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UserApiKeyAuth = apply {
                if (validated) {
                    return@apply
                }

                token()
                aliases().ifPresent { it.validate() }
                allowedCacheControls()
                allowedModelRegion().ifPresent { it.validate() }
                allowedRoutes()
                apiKey()
                autoRotate()
                blocked()
                budgetDuration()
                budgetResetAt()
                config().ifPresent { it.validate() }
                createdAt()
                createdBy()
                endUserId()
                endUserMaxBudget()
                endUserRpmLimit()
                endUserTpmLimit()
                expires().ifPresent { it.validate() }
                keyAlias()
                keyName()
                keyRotationAt()
                lastRefreshedAt()
                lastRotationAt()
                litellmBudgetTable().ifPresent { it.validate() }
                maxBudget()
                maxParallelRequests()
                metadata().ifPresent { it.validate() }
                modelMaxBudget().ifPresent { it.validate() }
                modelSpend().ifPresent { it.validate() }
                models()
                objectPermission().ifPresent { it.validate() }
                objectPermissionId()
                orgId()
                organizationMaxBudget()
                organizationMetadata().ifPresent { it.validate() }
                organizationRpmLimit()
                organizationTpmLimit()
                permissions().ifPresent { it.validate() }
                requestRoute()
                rotationCount()
                rotationInterval()
                routerSettings().ifPresent { it.validate() }
                rpmLimit()
                rpmLimitPerModel().ifPresent { it.validate() }
                softBudget()
                softBudgetCooldown()
                spend()
                teamAlias()
                teamBlocked()
                teamId()
                teamMaxBudget()
                teamMember().ifPresent { it.validate() }
                teamMemberRpmLimit()
                teamMemberSpend()
                teamMemberTpmLimit()
                teamMetadata().ifPresent { it.validate() }
                teamModelAliases().ifPresent { it.validate() }
                teamModels()
                teamObjectPermissionId()
                teamRpmLimit()
                teamSpend()
                teamTpmLimit()
                tpmLimit()
                tpmLimitPerModel().ifPresent { it.validate() }
                updatedAt()
                updatedBy()
                userEmail()
                userId()
                userMaxBudget()
                userRole().ifPresent { it.validate() }
                userRpmLimit()
                userSpend()
                userTpmLimit()
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
                (if (token.asKnown().isPresent) 1 else 0) +
                    (aliases.asKnown().getOrNull()?.validity() ?: 0) +
                    (allowedCacheControls.asKnown().getOrNull()?.size ?: 0) +
                    (allowedModelRegion.asKnown().getOrNull()?.validity() ?: 0) +
                    (allowedRoutes.asKnown().getOrNull()?.size ?: 0) +
                    (if (apiKey.asKnown().isPresent) 1 else 0) +
                    (if (autoRotate.asKnown().isPresent) 1 else 0) +
                    (if (blocked.asKnown().isPresent) 1 else 0) +
                    (if (budgetDuration.asKnown().isPresent) 1 else 0) +
                    (if (budgetResetAt.asKnown().isPresent) 1 else 0) +
                    (config.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (createdBy.asKnown().isPresent) 1 else 0) +
                    (if (endUserId.asKnown().isPresent) 1 else 0) +
                    (if (endUserMaxBudget.asKnown().isPresent) 1 else 0) +
                    (if (endUserRpmLimit.asKnown().isPresent) 1 else 0) +
                    (if (endUserTpmLimit.asKnown().isPresent) 1 else 0) +
                    (expires.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (keyAlias.asKnown().isPresent) 1 else 0) +
                    (if (keyName.asKnown().isPresent) 1 else 0) +
                    (if (keyRotationAt.asKnown().isPresent) 1 else 0) +
                    (if (lastRefreshedAt.asKnown().isPresent) 1 else 0) +
                    (if (lastRotationAt.asKnown().isPresent) 1 else 0) +
                    (litellmBudgetTable.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (maxBudget.asKnown().isPresent) 1 else 0) +
                    (if (maxParallelRequests.asKnown().isPresent) 1 else 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (modelMaxBudget.asKnown().getOrNull()?.validity() ?: 0) +
                    (modelSpend.asKnown().getOrNull()?.validity() ?: 0) +
                    (models.asKnown().getOrNull()?.size ?: 0) +
                    (objectPermission.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (objectPermissionId.asKnown().isPresent) 1 else 0) +
                    (if (orgId.asKnown().isPresent) 1 else 0) +
                    (if (organizationMaxBudget.asKnown().isPresent) 1 else 0) +
                    (organizationMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (organizationRpmLimit.asKnown().isPresent) 1 else 0) +
                    (if (organizationTpmLimit.asKnown().isPresent) 1 else 0) +
                    (permissions.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (requestRoute.asKnown().isPresent) 1 else 0) +
                    (if (rotationCount.asKnown().isPresent) 1 else 0) +
                    (if (rotationInterval.asKnown().isPresent) 1 else 0) +
                    (routerSettings.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (rpmLimit.asKnown().isPresent) 1 else 0) +
                    (rpmLimitPerModel.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (softBudget.asKnown().isPresent) 1 else 0) +
                    (if (softBudgetCooldown.asKnown().isPresent) 1 else 0) +
                    (if (spend.asKnown().isPresent) 1 else 0) +
                    (if (teamAlias.asKnown().isPresent) 1 else 0) +
                    (if (teamBlocked.asKnown().isPresent) 1 else 0) +
                    (if (teamId.asKnown().isPresent) 1 else 0) +
                    (if (teamMaxBudget.asKnown().isPresent) 1 else 0) +
                    (teamMember.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (teamMemberRpmLimit.asKnown().isPresent) 1 else 0) +
                    (if (teamMemberSpend.asKnown().isPresent) 1 else 0) +
                    (if (teamMemberTpmLimit.asKnown().isPresent) 1 else 0) +
                    (teamMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (teamModelAliases.asKnown().getOrNull()?.validity() ?: 0) +
                    (teamModels.asKnown().getOrNull()?.size ?: 0) +
                    (if (teamObjectPermissionId.asKnown().isPresent) 1 else 0) +
                    (if (teamRpmLimit.asKnown().isPresent) 1 else 0) +
                    (if (teamSpend.asKnown().isPresent) 1 else 0) +
                    (if (teamTpmLimit.asKnown().isPresent) 1 else 0) +
                    (if (tpmLimit.asKnown().isPresent) 1 else 0) +
                    (tpmLimitPerModel.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0) +
                    (if (updatedBy.asKnown().isPresent) 1 else 0) +
                    (if (userEmail.asKnown().isPresent) 1 else 0) +
                    (if (userId.asKnown().isPresent) 1 else 0) +
                    (if (userMaxBudget.asKnown().isPresent) 1 else 0) +
                    (userRole.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (userRpmLimit.asKnown().isPresent) 1 else 0) +
                    (if (userSpend.asKnown().isPresent) 1 else 0) +
                    (if (userTpmLimit.asKnown().isPresent) 1 else 0)

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

            class AllowedModelRegion
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EU = of("eu")

                    @JvmField val US = of("us")

                    @JvmStatic fun of(value: String) = AllowedModelRegion(JsonField.of(value))
                }

                /** An enum containing [AllowedModelRegion]'s known values. */
                enum class Known {
                    EU,
                    US,
                }

                /**
                 * An enum containing [AllowedModelRegion]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AllowedModelRegion] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EU,
                    US,
                    /**
                     * An enum member indicating that [AllowedModelRegion] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EU -> Value.EU
                        US -> Value.US
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
                        EU -> Known.EU
                        US -> Known.US
                        else ->
                            throw HanzoInvalidDataException("Unknown AllowedModelRegion: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HanzoInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        HanzoInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): AllowedModelRegion = apply {
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

                    return other is AllowedModelRegion && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

            @JsonDeserialize(using = Expires.Deserializer::class)
            @JsonSerialize(using = Expires.Serializer::class)
            class Expires
            private constructor(
                private val string: String? = null,
                private val offsetDateTime: OffsetDateTime? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun offsetDateTime(): Optional<OffsetDateTime> = Optional.ofNullable(offsetDateTime)

                fun isString(): Boolean = string != null

                fun isOffsetDateTime(): Boolean = offsetDateTime != null

                fun asString(): String = string.getOrThrow("string")

                fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Expires = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {}
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Expires &&
                        string == other.string &&
                        offsetDateTime == other.offsetDateTime
                }

                override fun hashCode(): Int = Objects.hash(string, offsetDateTime)

                override fun toString(): String =
                    when {
                        string != null -> "Expires{string=$string}"
                        offsetDateTime != null -> "Expires{offsetDateTime=$offsetDateTime}"
                        _json != null -> "Expires{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Expires")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Expires(string = string)

                    @JvmStatic
                    fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                        Expires(offsetDateTime = offsetDateTime)
                }

                /**
                 * An interface that defines how to map each variant of [Expires] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

                    /**
                     * Maps an unknown variant of [Expires] to a value of type [T].
                     *
                     * An instance of [Expires] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws HanzoInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw HanzoInvalidDataException("Unknown Expires: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Expires>(Expires::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Expires {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                        Expires(offsetDateTime = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Expires(string = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Expires(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Expires>(Expires::class) {

                    override fun serialize(
                        value: Expires,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.offsetDateTime != null ->
                                generator.writeObject(value.offsetDateTime)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Expires")
                        }
                    }
                }
            }

            class LitellmBudgetTable
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
                     * [LitellmBudgetTable].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [LitellmBudgetTable]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(litellmBudgetTable: LitellmBudgetTable) = apply {
                        additionalProperties =
                            litellmBudgetTable.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [LitellmBudgetTable].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): LitellmBudgetTable =
                        LitellmBudgetTable(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): LitellmBudgetTable = apply {
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

                    return other is LitellmBudgetTable &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LitellmBudgetTable{additionalProperties=$additionalProperties}"
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

                    /**
                     * Returns a mutable builder for constructing an instance of [ModelMaxBudget].
                     */
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelMaxBudget &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ModelMaxBudget{additionalProperties=$additionalProperties}"
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun agentAccessGroups(): Optional<List<String>> =
                    agentAccessGroups.getOptional("agent_access_groups")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun agents(): Optional<List<String>> = agents.getOptional("agents")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mcpAccessGroups(): Optional<List<String>> =
                    mcpAccessGroups.getOptional("mcp_access_groups")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mcpServers(): Optional<List<String>> = mcpServers.getOptional("mcp_servers")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mcpToolPermissions(): Optional<McpToolPermissions> =
                    mcpToolPermissions.getOptional("mcp_tool_permissions")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun vectorStores(): Optional<List<String>> =
                    vectorStores.getOptional("vector_stores")

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
                 * Unlike [agents], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("agents")
                @ExcludeMissing
                fun _agents(): JsonField<List<String>> = agents

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
                 * Unlike [mcpServers], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                 * Unlike [vectorStores], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                        mcpAccessGroups =
                            objectPermission.mcpAccessGroups.map { it.toMutableList() }
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
                     * You should usually call [Builder.objectPermissionId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
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
                     * You should usually call [Builder.agents] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * Alias for calling [Builder.mcpAccessGroups] with
                     * `mcpAccessGroups.orElse(null)`.
                     */
                    fun mcpAccessGroups(mcpAccessGroups: Optional<List<String>>) =
                        mcpAccessGroups(mcpAccessGroups.getOrNull())

                    /**
                     * Sets [Builder.mcpAccessGroups] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mcpAccessGroups] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
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
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                    fun mcpToolPermissions(mcpToolPermissions: JsonField<McpToolPermissions>) =
                        apply {
                            this.mcpToolPermissions = mcpToolPermissions
                        }

                    fun vectorStores(vectorStores: List<String>?) =
                        vectorStores(JsonField.ofNullable(vectorStores))

                    /**
                     * Alias for calling [Builder.vectorStores] with `vectorStores.orElse(null)`.
                     */
                    fun vectorStores(vectorStores: Optional<List<String>>) =
                        vectorStores(vectorStores.getOrNull())

                    /**
                     * Sets [Builder.vectorStores] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.vectorStores] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(mcpToolPermissions: McpToolPermissions) = apply {
                            additionalProperties =
                                mcpToolPermissions.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

            class OrganizationMetadata
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
                     * [OrganizationMetadata].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [OrganizationMetadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(organizationMetadata: OrganizationMetadata) = apply {
                        additionalProperties =
                            organizationMetadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [OrganizationMetadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): OrganizationMetadata =
                        OrganizationMetadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): OrganizationMetadata = apply {
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

                    return other is OrganizationMetadata &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OrganizationMetadata{additionalProperties=$additionalProperties}"
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Permissions &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Permissions{additionalProperties=$additionalProperties}"
            }

            class RouterSettings
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
                     * Returns a mutable builder for constructing an instance of [RouterSettings].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RouterSettings]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(routerSettings: RouterSettings) = apply {
                        additionalProperties = routerSettings.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [RouterSettings].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RouterSettings = RouterSettings(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): RouterSettings = apply {
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

                    return other is RouterSettings &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RouterSettings{additionalProperties=$additionalProperties}"
            }

            class RpmLimitPerModel
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
                     * Returns a mutable builder for constructing an instance of [RpmLimitPerModel].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RpmLimitPerModel]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(rpmLimitPerModel: RpmLimitPerModel) = apply {
                        additionalProperties = rpmLimitPerModel.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [RpmLimitPerModel].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RpmLimitPerModel =
                        RpmLimitPerModel(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): RpmLimitPerModel = apply {
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

                    return other is RpmLimitPerModel &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RpmLimitPerModel{additionalProperties=$additionalProperties}"
            }

            class TeamMetadata
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

                    /** Returns a mutable builder for constructing an instance of [TeamMetadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TeamMetadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(teamMetadata: TeamMetadata) = apply {
                        additionalProperties = teamMetadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [TeamMetadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): TeamMetadata = TeamMetadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): TeamMetadata = apply {
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

                    return other is TeamMetadata &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "TeamMetadata{additionalProperties=$additionalProperties}"
            }

            class TeamModelAliases
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
                     * Returns a mutable builder for constructing an instance of [TeamModelAliases].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TeamModelAliases]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(teamModelAliases: TeamModelAliases) = apply {
                        additionalProperties = teamModelAliases.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [TeamModelAliases].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): TeamModelAliases =
                        TeamModelAliases(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): TeamModelAliases = apply {
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

                    return other is TeamModelAliases &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TeamModelAliases{additionalProperties=$additionalProperties}"
            }

            class TpmLimitPerModel
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
                     * Returns a mutable builder for constructing an instance of [TpmLimitPerModel].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TpmLimitPerModel]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tpmLimitPerModel: TpmLimitPerModel) = apply {
                        additionalProperties = tpmLimitPerModel.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [TpmLimitPerModel].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): TpmLimitPerModel =
                        TpmLimitPerModel(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): TpmLimitPerModel = apply {
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

                    return other is TpmLimitPerModel &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TpmLimitPerModel{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UserApiKeyAuth &&
                    token == other.token &&
                    aliases == other.aliases &&
                    allowedCacheControls == other.allowedCacheControls &&
                    allowedModelRegion == other.allowedModelRegion &&
                    allowedRoutes == other.allowedRoutes &&
                    apiKey == other.apiKey &&
                    autoRotate == other.autoRotate &&
                    blocked == other.blocked &&
                    budgetDuration == other.budgetDuration &&
                    budgetResetAt == other.budgetResetAt &&
                    config == other.config &&
                    createdAt == other.createdAt &&
                    createdBy == other.createdBy &&
                    endUserId == other.endUserId &&
                    endUserMaxBudget == other.endUserMaxBudget &&
                    endUserRpmLimit == other.endUserRpmLimit &&
                    endUserTpmLimit == other.endUserTpmLimit &&
                    expires == other.expires &&
                    keyAlias == other.keyAlias &&
                    keyName == other.keyName &&
                    keyRotationAt == other.keyRotationAt &&
                    lastRefreshedAt == other.lastRefreshedAt &&
                    lastRotationAt == other.lastRotationAt &&
                    litellmBudgetTable == other.litellmBudgetTable &&
                    maxBudget == other.maxBudget &&
                    maxParallelRequests == other.maxParallelRequests &&
                    metadata == other.metadata &&
                    modelMaxBudget == other.modelMaxBudget &&
                    modelSpend == other.modelSpend &&
                    models == other.models &&
                    objectPermission == other.objectPermission &&
                    objectPermissionId == other.objectPermissionId &&
                    orgId == other.orgId &&
                    organizationMaxBudget == other.organizationMaxBudget &&
                    organizationMetadata == other.organizationMetadata &&
                    organizationRpmLimit == other.organizationRpmLimit &&
                    organizationTpmLimit == other.organizationTpmLimit &&
                    parentOtelSpan == other.parentOtelSpan &&
                    permissions == other.permissions &&
                    requestRoute == other.requestRoute &&
                    rotationCount == other.rotationCount &&
                    rotationInterval == other.rotationInterval &&
                    routerSettings == other.routerSettings &&
                    rpmLimit == other.rpmLimit &&
                    rpmLimitPerModel == other.rpmLimitPerModel &&
                    softBudget == other.softBudget &&
                    softBudgetCooldown == other.softBudgetCooldown &&
                    spend == other.spend &&
                    teamAlias == other.teamAlias &&
                    teamBlocked == other.teamBlocked &&
                    teamId == other.teamId &&
                    teamMaxBudget == other.teamMaxBudget &&
                    teamMember == other.teamMember &&
                    teamMemberRpmLimit == other.teamMemberRpmLimit &&
                    teamMemberSpend == other.teamMemberSpend &&
                    teamMemberTpmLimit == other.teamMemberTpmLimit &&
                    teamMetadata == other.teamMetadata &&
                    teamModelAliases == other.teamModelAliases &&
                    teamModels == other.teamModels &&
                    teamObjectPermissionId == other.teamObjectPermissionId &&
                    teamRpmLimit == other.teamRpmLimit &&
                    teamSpend == other.teamSpend &&
                    teamTpmLimit == other.teamTpmLimit &&
                    tpmLimit == other.tpmLimit &&
                    tpmLimitPerModel == other.tpmLimitPerModel &&
                    updatedAt == other.updatedAt &&
                    updatedBy == other.updatedBy &&
                    user == other.user &&
                    userEmail == other.userEmail &&
                    userId == other.userId &&
                    userMaxBudget == other.userMaxBudget &&
                    userRole == other.userRole &&
                    userRpmLimit == other.userRpmLimit &&
                    userSpend == other.userSpend &&
                    userTpmLimit == other.userTpmLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    token,
                    aliases,
                    allowedCacheControls,
                    allowedModelRegion,
                    allowedRoutes,
                    apiKey,
                    autoRotate,
                    blocked,
                    budgetDuration,
                    budgetResetAt,
                    config,
                    createdAt,
                    createdBy,
                    endUserId,
                    endUserMaxBudget,
                    endUserRpmLimit,
                    endUserTpmLimit,
                    expires,
                    keyAlias,
                    keyName,
                    keyRotationAt,
                    lastRefreshedAt,
                    lastRotationAt,
                    litellmBudgetTable,
                    maxBudget,
                    maxParallelRequests,
                    metadata,
                    modelMaxBudget,
                    modelSpend,
                    models,
                    objectPermission,
                    objectPermissionId,
                    orgId,
                    organizationMaxBudget,
                    organizationMetadata,
                    organizationRpmLimit,
                    organizationTpmLimit,
                    parentOtelSpan,
                    permissions,
                    requestRoute,
                    rotationCount,
                    rotationInterval,
                    routerSettings,
                    rpmLimit,
                    rpmLimitPerModel,
                    softBudget,
                    softBudgetCooldown,
                    spend,
                    teamAlias,
                    teamBlocked,
                    teamId,
                    teamMaxBudget,
                    teamMember,
                    teamMemberRpmLimit,
                    teamMemberSpend,
                    teamMemberTpmLimit,
                    teamMetadata,
                    teamModelAliases,
                    teamModels,
                    teamObjectPermissionId,
                    teamRpmLimit,
                    teamSpend,
                    teamTpmLimit,
                    tpmLimit,
                    tpmLimitPerModel,
                    updatedAt,
                    updatedBy,
                    user,
                    userEmail,
                    userId,
                    userMaxBudget,
                    userRole,
                    userRpmLimit,
                    userSpend,
                    userTpmLimit,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UserApiKeyAuth{token=$token, aliases=$aliases, allowedCacheControls=$allowedCacheControls, allowedModelRegion=$allowedModelRegion, allowedRoutes=$allowedRoutes, apiKey=$apiKey, autoRotate=$autoRotate, blocked=$blocked, budgetDuration=$budgetDuration, budgetResetAt=$budgetResetAt, config=$config, createdAt=$createdAt, createdBy=$createdBy, endUserId=$endUserId, endUserMaxBudget=$endUserMaxBudget, endUserRpmLimit=$endUserRpmLimit, endUserTpmLimit=$endUserTpmLimit, expires=$expires, keyAlias=$keyAlias, keyName=$keyName, keyRotationAt=$keyRotationAt, lastRefreshedAt=$lastRefreshedAt, lastRotationAt=$lastRotationAt, litellmBudgetTable=$litellmBudgetTable, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelSpend=$modelSpend, models=$models, objectPermission=$objectPermission, objectPermissionId=$objectPermissionId, orgId=$orgId, organizationMaxBudget=$organizationMaxBudget, organizationMetadata=$organizationMetadata, organizationRpmLimit=$organizationRpmLimit, organizationTpmLimit=$organizationTpmLimit, parentOtelSpan=$parentOtelSpan, permissions=$permissions, requestRoute=$requestRoute, rotationCount=$rotationCount, rotationInterval=$rotationInterval, routerSettings=$routerSettings, rpmLimit=$rpmLimit, rpmLimitPerModel=$rpmLimitPerModel, softBudget=$softBudget, softBudgetCooldown=$softBudgetCooldown, spend=$spend, teamAlias=$teamAlias, teamBlocked=$teamBlocked, teamId=$teamId, teamMaxBudget=$teamMaxBudget, teamMember=$teamMember, teamMemberRpmLimit=$teamMemberRpmLimit, teamMemberSpend=$teamMemberSpend, teamMemberTpmLimit=$teamMemberTpmLimit, teamMetadata=$teamMetadata, teamModelAliases=$teamModelAliases, teamModels=$teamModels, teamObjectPermissionId=$teamObjectPermissionId, teamRpmLimit=$teamRpmLimit, teamSpend=$teamSpend, teamTpmLimit=$teamTpmLimit, tpmLimit=$tpmLimit, tpmLimitPerModel=$tpmLimitPerModel, updatedAt=$updatedAt, updatedBy=$updatedBy, user=$user, userEmail=$userEmail, userId=$userId, userMaxBudget=$userMaxBudget, userRole=$userRole, userRpmLimit=$userRpmLimit, userSpend=$userSpend, userTpmLimit=$userTpmLimit, additionalProperties=$additionalProperties}"
        }

        /**
         * Recording of deleted keys for audit purposes. Mirrors LiteLLM_VerificationToken plus
         * metadata captured at deletion time.
         */
        class LiteLlmDeletedVerificationToken
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val token: JsonField<String>,
            private val aliases: JsonField<Aliases>,
            private val allowedCacheControls: JsonField<List<JsonValue>>,
            private val allowedRoutes: JsonField<List<JsonValue>>,
            private val autoRotate: JsonField<Boolean>,
            private val blocked: JsonField<Boolean>,
            private val budgetDuration: JsonField<String>,
            private val budgetResetAt: JsonField<OffsetDateTime>,
            private val config: JsonField<Config>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val createdBy: JsonField<String>,
            private val deletedAt: JsonField<OffsetDateTime>,
            private val deletedBy: JsonField<String>,
            private val deletedByApiKey: JsonField<String>,
            private val expires: JsonField<Expires>,
            private val keyAlias: JsonField<String>,
            private val keyName: JsonField<String>,
            private val keyRotationAt: JsonField<OffsetDateTime>,
            private val lastRotationAt: JsonField<OffsetDateTime>,
            private val litellmBudgetTable: JsonField<LitellmBudgetTable>,
            private val litellmChangedBy: JsonField<String>,
            private val maxBudget: JsonField<Double>,
            private val maxParallelRequests: JsonField<Long>,
            private val metadata: JsonField<Metadata>,
            private val modelMaxBudget: JsonField<ModelMaxBudget>,
            private val modelSpend: JsonField<ModelSpend>,
            private val models: JsonField<List<JsonValue>>,
            private val objectPermission: JsonField<ObjectPermission>,
            private val objectPermissionId: JsonField<String>,
            private val orgId: JsonField<String>,
            private val permissions: JsonField<Permissions>,
            private val rotationCount: JsonField<Long>,
            private val rotationInterval: JsonField<String>,
            private val routerSettings: JsonField<RouterSettings>,
            private val rpmLimit: JsonField<Long>,
            private val softBudgetCooldown: JsonField<Boolean>,
            private val spend: JsonField<Double>,
            private val teamId: JsonField<String>,
            private val tpmLimit: JsonField<Long>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val updatedBy: JsonField<String>,
            private val userId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aliases")
                @ExcludeMissing
                aliases: JsonField<Aliases> = JsonMissing.of(),
                @JsonProperty("allowed_cache_controls")
                @ExcludeMissing
                allowedCacheControls: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("allowed_routes")
                @ExcludeMissing
                allowedRoutes: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("auto_rotate")
                @ExcludeMissing
                autoRotate: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("blocked")
                @ExcludeMissing
                blocked: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("budget_duration")
                @ExcludeMissing
                budgetDuration: JsonField<String> = JsonMissing.of(),
                @JsonProperty("budget_reset_at")
                @ExcludeMissing
                budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("config")
                @ExcludeMissing
                config: JsonField<Config> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("created_by")
                @ExcludeMissing
                createdBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("deleted_at")
                @ExcludeMissing
                deletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("deleted_by")
                @ExcludeMissing
                deletedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("deleted_by_api_key")
                @ExcludeMissing
                deletedByApiKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expires")
                @ExcludeMissing
                expires: JsonField<Expires> = JsonMissing.of(),
                @JsonProperty("key_alias")
                @ExcludeMissing
                keyAlias: JsonField<String> = JsonMissing.of(),
                @JsonProperty("key_name")
                @ExcludeMissing
                keyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("key_rotation_at")
                @ExcludeMissing
                keyRotationAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("last_rotation_at")
                @ExcludeMissing
                lastRotationAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("litellm_budget_table")
                @ExcludeMissing
                litellmBudgetTable: JsonField<LitellmBudgetTable> = JsonMissing.of(),
                @JsonProperty("litellm_changed_by")
                @ExcludeMissing
                litellmChangedBy: JsonField<String> = JsonMissing.of(),
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
                @JsonProperty("model_spend")
                @ExcludeMissing
                modelSpend: JsonField<ModelSpend> = JsonMissing.of(),
                @JsonProperty("models")
                @ExcludeMissing
                models: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("object_permission")
                @ExcludeMissing
                objectPermission: JsonField<ObjectPermission> = JsonMissing.of(),
                @JsonProperty("object_permission_id")
                @ExcludeMissing
                objectPermissionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("org_id") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("permissions")
                @ExcludeMissing
                permissions: JsonField<Permissions> = JsonMissing.of(),
                @JsonProperty("rotation_count")
                @ExcludeMissing
                rotationCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("rotation_interval")
                @ExcludeMissing
                rotationInterval: JsonField<String> = JsonMissing.of(),
                @JsonProperty("router_settings")
                @ExcludeMissing
                routerSettings: JsonField<RouterSettings> = JsonMissing.of(),
                @JsonProperty("rpm_limit")
                @ExcludeMissing
                rpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("soft_budget_cooldown")
                @ExcludeMissing
                softBudgetCooldown: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("spend") @ExcludeMissing spend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("team_id")
                @ExcludeMissing
                teamId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tpm_limit")
                @ExcludeMissing
                tpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("updated_by")
                @ExcludeMissing
                updatedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                token,
                aliases,
                allowedCacheControls,
                allowedRoutes,
                autoRotate,
                blocked,
                budgetDuration,
                budgetResetAt,
                config,
                createdAt,
                createdBy,
                deletedAt,
                deletedBy,
                deletedByApiKey,
                expires,
                keyAlias,
                keyName,
                keyRotationAt,
                lastRotationAt,
                litellmBudgetTable,
                litellmChangedBy,
                maxBudget,
                maxParallelRequests,
                metadata,
                modelMaxBudget,
                modelSpend,
                models,
                objectPermission,
                objectPermissionId,
                orgId,
                permissions,
                rotationCount,
                rotationInterval,
                routerSettings,
                rpmLimit,
                softBudgetCooldown,
                spend,
                teamId,
                tpmLimit,
                updatedAt,
                updatedBy,
                userId,
                mutableMapOf(),
            )

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun token(): Optional<String> = token.getOptional("token")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun aliases(): Optional<Aliases> = aliases.getOptional("aliases")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun allowedCacheControls(): Optional<List<JsonValue>> =
                allowedCacheControls.getOptional("allowed_cache_controls")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun allowedRoutes(): Optional<List<JsonValue>> =
                allowedRoutes.getOptional("allowed_routes")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun autoRotate(): Optional<Boolean> = autoRotate.getOptional("auto_rotate")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun blocked(): Optional<Boolean> = blocked.getOptional("blocked")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budgetDuration(): Optional<String> = budgetDuration.getOptional("budget_duration")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun budgetResetAt(): Optional<OffsetDateTime> =
                budgetResetAt.getOptional("budget_reset_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun config(): Optional<Config> = config.getOptional("config")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdBy(): Optional<String> = createdBy.getOptional("created_by")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun deletedAt(): Optional<OffsetDateTime> = deletedAt.getOptional("deleted_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun deletedBy(): Optional<String> = deletedBy.getOptional("deleted_by")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun deletedByApiKey(): Optional<String> =
                deletedByApiKey.getOptional("deleted_by_api_key")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expires(): Optional<Expires> = expires.getOptional("expires")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keyAlias(): Optional<String> = keyAlias.getOptional("key_alias")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keyName(): Optional<String> = keyName.getOptional("key_name")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keyRotationAt(): Optional<OffsetDateTime> =
                keyRotationAt.getOptional("key_rotation_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lastRotationAt(): Optional<OffsetDateTime> =
                lastRotationAt.getOptional("last_rotation_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun litellmBudgetTable(): Optional<LitellmBudgetTable> =
                litellmBudgetTable.getOptional("litellm_budget_table")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun litellmChangedBy(): Optional<String> =
                litellmChangedBy.getOptional("litellm_changed_by")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maxBudget(): Optional<Double> = maxBudget.getOptional("max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maxParallelRequests(): Optional<Long> =
                maxParallelRequests.getOptional("max_parallel_requests")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun modelMaxBudget(): Optional<ModelMaxBudget> =
                modelMaxBudget.getOptional("model_max_budget")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun modelSpend(): Optional<ModelSpend> = modelSpend.getOptional("model_spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun models(): Optional<List<JsonValue>> = models.getOptional("models")

            /**
             * Represents a LiteLLM_ObjectPermissionTable record
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun objectPermission(): Optional<ObjectPermission> =
                objectPermission.getOptional("object_permission")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun objectPermissionId(): Optional<String> =
                objectPermissionId.getOptional("object_permission_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun orgId(): Optional<String> = orgId.getOptional("org_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun permissions(): Optional<Permissions> = permissions.getOptional("permissions")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rotationCount(): Optional<Long> = rotationCount.getOptional("rotation_count")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rotationInterval(): Optional<String> =
                rotationInterval.getOptional("rotation_interval")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun routerSettings(): Optional<RouterSettings> =
                routerSettings.getOptional("router_settings")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun rpmLimit(): Optional<Long> = rpmLimit.getOptional("rpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun softBudgetCooldown(): Optional<Boolean> =
                softBudgetCooldown.getOptional("soft_budget_cooldown")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun spend(): Optional<Double> = spend.getOptional("spend")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamId(): Optional<String> = teamId.getOptional("team_id")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tpmLimit(): Optional<Long> = tpmLimit.getOptional("tpm_limit")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun updatedBy(): Optional<String> = updatedBy.getOptional("updated_by")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userId(): Optional<String> = userId.getOptional("user_id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [token].
             *
             * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

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
             * Returns the raw JSON value of [allowedRoutes].
             *
             * Unlike [allowedRoutes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("allowed_routes")
            @ExcludeMissing
            fun _allowedRoutes(): JsonField<List<JsonValue>> = allowedRoutes

            /**
             * Returns the raw JSON value of [autoRotate].
             *
             * Unlike [autoRotate], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [budgetDuration], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Returns the raw JSON value of [config].
             *
             * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [createdBy].
             *
             * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_by")
            @ExcludeMissing
            fun _createdBy(): JsonField<String> = createdBy

            /**
             * Returns the raw JSON value of [deletedAt].
             *
             * Unlike [deletedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("deleted_at")
            @ExcludeMissing
            fun _deletedAt(): JsonField<OffsetDateTime> = deletedAt

            /**
             * Returns the raw JSON value of [deletedBy].
             *
             * Unlike [deletedBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("deleted_by")
            @ExcludeMissing
            fun _deletedBy(): JsonField<String> = deletedBy

            /**
             * Returns the raw JSON value of [deletedByApiKey].
             *
             * Unlike [deletedByApiKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("deleted_by_api_key")
            @ExcludeMissing
            fun _deletedByApiKey(): JsonField<String> = deletedByApiKey

            /**
             * Returns the raw JSON value of [expires].
             *
             * Unlike [expires], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("expires") @ExcludeMissing fun _expires(): JsonField<Expires> = expires

            /**
             * Returns the raw JSON value of [keyAlias].
             *
             * Unlike [keyAlias], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("key_alias") @ExcludeMissing fun _keyAlias(): JsonField<String> = keyAlias

            /**
             * Returns the raw JSON value of [keyName].
             *
             * Unlike [keyName], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("key_name") @ExcludeMissing fun _keyName(): JsonField<String> = keyName

            /**
             * Returns the raw JSON value of [keyRotationAt].
             *
             * Unlike [keyRotationAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("key_rotation_at")
            @ExcludeMissing
            fun _keyRotationAt(): JsonField<OffsetDateTime> = keyRotationAt

            /**
             * Returns the raw JSON value of [lastRotationAt].
             *
             * Unlike [lastRotationAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("last_rotation_at")
            @ExcludeMissing
            fun _lastRotationAt(): JsonField<OffsetDateTime> = lastRotationAt

            /**
             * Returns the raw JSON value of [litellmBudgetTable].
             *
             * Unlike [litellmBudgetTable], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("litellm_budget_table")
            @ExcludeMissing
            fun _litellmBudgetTable(): JsonField<LitellmBudgetTable> = litellmBudgetTable

            /**
             * Returns the raw JSON value of [litellmChangedBy].
             *
             * Unlike [litellmChangedBy], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("litellm_changed_by")
            @ExcludeMissing
            fun _litellmChangedBy(): JsonField<String> = litellmChangedBy

            /**
             * Returns the raw JSON value of [maxBudget].
             *
             * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_budget")
            @ExcludeMissing
            fun _maxBudget(): JsonField<Double> = maxBudget

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
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [modelMaxBudget].
             *
             * Unlike [modelMaxBudget], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("model_max_budget")
            @ExcludeMissing
            fun _modelMaxBudget(): JsonField<ModelMaxBudget> = modelMaxBudget

            /**
             * Returns the raw JSON value of [modelSpend].
             *
             * Unlike [modelSpend], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("model_spend")
            @ExcludeMissing
            fun _modelSpend(): JsonField<ModelSpend> = modelSpend

            /**
             * Returns the raw JSON value of [models].
             *
             * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("models")
            @ExcludeMissing
            fun _models(): JsonField<List<JsonValue>> = models

            /**
             * Returns the raw JSON value of [objectPermission].
             *
             * Unlike [objectPermission], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("object_permission")
            @ExcludeMissing
            fun _objectPermission(): JsonField<ObjectPermission> = objectPermission

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
             * Returns the raw JSON value of [orgId].
             *
             * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

            /**
             * Returns the raw JSON value of [permissions].
             *
             * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("permissions")
            @ExcludeMissing
            fun _permissions(): JsonField<Permissions> = permissions

            /**
             * Returns the raw JSON value of [rotationCount].
             *
             * Unlike [rotationCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rotation_count")
            @ExcludeMissing
            fun _rotationCount(): JsonField<Long> = rotationCount

            /**
             * Returns the raw JSON value of [rotationInterval].
             *
             * Unlike [rotationInterval], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("rotation_interval")
            @ExcludeMissing
            fun _rotationInterval(): JsonField<String> = rotationInterval

            /**
             * Returns the raw JSON value of [routerSettings].
             *
             * Unlike [routerSettings], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("router_settings")
            @ExcludeMissing
            fun _routerSettings(): JsonField<RouterSettings> = routerSettings

            /**
             * Returns the raw JSON value of [rpmLimit].
             *
             * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

            /**
             * Returns the raw JSON value of [softBudgetCooldown].
             *
             * Unlike [softBudgetCooldown], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("soft_budget_cooldown")
            @ExcludeMissing
            fun _softBudgetCooldown(): JsonField<Boolean> = softBudgetCooldown

            /**
             * Returns the raw JSON value of [spend].
             *
             * Unlike [spend], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("spend") @ExcludeMissing fun _spend(): JsonField<Double> = spend

            /**
             * Returns the raw JSON value of [teamId].
             *
             * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

            /**
             * Returns the raw JSON value of [tpmLimit].
             *
             * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

            /**
             * Returns the raw JSON value of [updatedBy].
             *
             * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_by")
            @ExcludeMissing
            fun _updatedBy(): JsonField<String> = updatedBy

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
                 * Returns a mutable builder for constructing an instance of
                 * [LiteLlmDeletedVerificationToken].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LiteLlmDeletedVerificationToken]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var token: JsonField<String> = JsonMissing.of()
                private var aliases: JsonField<Aliases> = JsonMissing.of()
                private var allowedCacheControls: JsonField<MutableList<JsonValue>>? = null
                private var allowedRoutes: JsonField<MutableList<JsonValue>>? = null
                private var autoRotate: JsonField<Boolean> = JsonMissing.of()
                private var blocked: JsonField<Boolean> = JsonMissing.of()
                private var budgetDuration: JsonField<String> = JsonMissing.of()
                private var budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var config: JsonField<Config> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var createdBy: JsonField<String> = JsonMissing.of()
                private var deletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var deletedBy: JsonField<String> = JsonMissing.of()
                private var deletedByApiKey: JsonField<String> = JsonMissing.of()
                private var expires: JsonField<Expires> = JsonMissing.of()
                private var keyAlias: JsonField<String> = JsonMissing.of()
                private var keyName: JsonField<String> = JsonMissing.of()
                private var keyRotationAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var lastRotationAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var litellmBudgetTable: JsonField<LitellmBudgetTable> = JsonMissing.of()
                private var litellmChangedBy: JsonField<String> = JsonMissing.of()
                private var maxBudget: JsonField<Double> = JsonMissing.of()
                private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of()
                private var modelSpend: JsonField<ModelSpend> = JsonMissing.of()
                private var models: JsonField<MutableList<JsonValue>>? = null
                private var objectPermission: JsonField<ObjectPermission> = JsonMissing.of()
                private var objectPermissionId: JsonField<String> = JsonMissing.of()
                private var orgId: JsonField<String> = JsonMissing.of()
                private var permissions: JsonField<Permissions> = JsonMissing.of()
                private var rotationCount: JsonField<Long> = JsonMissing.of()
                private var rotationInterval: JsonField<String> = JsonMissing.of()
                private var routerSettings: JsonField<RouterSettings> = JsonMissing.of()
                private var rpmLimit: JsonField<Long> = JsonMissing.of()
                private var softBudgetCooldown: JsonField<Boolean> = JsonMissing.of()
                private var spend: JsonField<Double> = JsonMissing.of()
                private var teamId: JsonField<String> = JsonMissing.of()
                private var tpmLimit: JsonField<Long> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var updatedBy: JsonField<String> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    liteLlmDeletedVerificationToken: LiteLlmDeletedVerificationToken
                ) = apply {
                    id = liteLlmDeletedVerificationToken.id
                    token = liteLlmDeletedVerificationToken.token
                    aliases = liteLlmDeletedVerificationToken.aliases
                    allowedCacheControls =
                        liteLlmDeletedVerificationToken.allowedCacheControls.map {
                            it.toMutableList()
                        }
                    allowedRoutes =
                        liteLlmDeletedVerificationToken.allowedRoutes.map { it.toMutableList() }
                    autoRotate = liteLlmDeletedVerificationToken.autoRotate
                    blocked = liteLlmDeletedVerificationToken.blocked
                    budgetDuration = liteLlmDeletedVerificationToken.budgetDuration
                    budgetResetAt = liteLlmDeletedVerificationToken.budgetResetAt
                    config = liteLlmDeletedVerificationToken.config
                    createdAt = liteLlmDeletedVerificationToken.createdAt
                    createdBy = liteLlmDeletedVerificationToken.createdBy
                    deletedAt = liteLlmDeletedVerificationToken.deletedAt
                    deletedBy = liteLlmDeletedVerificationToken.deletedBy
                    deletedByApiKey = liteLlmDeletedVerificationToken.deletedByApiKey
                    expires = liteLlmDeletedVerificationToken.expires
                    keyAlias = liteLlmDeletedVerificationToken.keyAlias
                    keyName = liteLlmDeletedVerificationToken.keyName
                    keyRotationAt = liteLlmDeletedVerificationToken.keyRotationAt
                    lastRotationAt = liteLlmDeletedVerificationToken.lastRotationAt
                    litellmBudgetTable = liteLlmDeletedVerificationToken.litellmBudgetTable
                    litellmChangedBy = liteLlmDeletedVerificationToken.litellmChangedBy
                    maxBudget = liteLlmDeletedVerificationToken.maxBudget
                    maxParallelRequests = liteLlmDeletedVerificationToken.maxParallelRequests
                    metadata = liteLlmDeletedVerificationToken.metadata
                    modelMaxBudget = liteLlmDeletedVerificationToken.modelMaxBudget
                    modelSpend = liteLlmDeletedVerificationToken.modelSpend
                    models = liteLlmDeletedVerificationToken.models.map { it.toMutableList() }
                    objectPermission = liteLlmDeletedVerificationToken.objectPermission
                    objectPermissionId = liteLlmDeletedVerificationToken.objectPermissionId
                    orgId = liteLlmDeletedVerificationToken.orgId
                    permissions = liteLlmDeletedVerificationToken.permissions
                    rotationCount = liteLlmDeletedVerificationToken.rotationCount
                    rotationInterval = liteLlmDeletedVerificationToken.rotationInterval
                    routerSettings = liteLlmDeletedVerificationToken.routerSettings
                    rpmLimit = liteLlmDeletedVerificationToken.rpmLimit
                    softBudgetCooldown = liteLlmDeletedVerificationToken.softBudgetCooldown
                    spend = liteLlmDeletedVerificationToken.spend
                    teamId = liteLlmDeletedVerificationToken.teamId
                    tpmLimit = liteLlmDeletedVerificationToken.tpmLimit
                    updatedAt = liteLlmDeletedVerificationToken.updatedAt
                    updatedBy = liteLlmDeletedVerificationToken.updatedBy
                    userId = liteLlmDeletedVerificationToken.userId
                    additionalProperties =
                        liteLlmDeletedVerificationToken.additionalProperties.toMutableMap()
                }

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun token(token: String?) = token(JsonField.ofNullable(token))

                /** Alias for calling [Builder.token] with `token.orElse(null)`. */
                fun token(token: Optional<String>) = token(token.getOrNull())

                /**
                 * Sets [Builder.token] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.token] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun token(token: JsonField<String>) = apply { this.token = token }

                fun aliases(aliases: Aliases) = aliases(JsonField.of(aliases))

                /**
                 * Sets [Builder.aliases] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aliases] with a well-typed [Aliases] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * `List<JsonValue>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
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

                fun allowedRoutes(allowedRoutes: List<JsonValue>?) =
                    allowedRoutes(JsonField.ofNullable(allowedRoutes))

                /** Alias for calling [Builder.allowedRoutes] with `allowedRoutes.orElse(null)`. */
                fun allowedRoutes(allowedRoutes: Optional<List<JsonValue>>) =
                    allowedRoutes(allowedRoutes.getOrNull())

                /**
                 * Sets [Builder.allowedRoutes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowedRoutes] with a well-typed
                 * `List<JsonValue>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun autoRotate(autoRotate: JsonField<Boolean>) = apply {
                    this.autoRotate = autoRotate
                }

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
                 * You should usually call [Builder.blocked] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blocked(blocked: JsonField<Boolean>) = apply { this.blocked = blocked }

                fun budgetDuration(budgetDuration: String?) =
                    budgetDuration(JsonField.ofNullable(budgetDuration))

                /**
                 * Alias for calling [Builder.budgetDuration] with `budgetDuration.orElse(null)`.
                 */
                fun budgetDuration(budgetDuration: Optional<String>) =
                    budgetDuration(budgetDuration.getOrNull())

                /**
                 * Sets [Builder.budgetDuration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.budgetDuration] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.budgetResetAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun budgetResetAt(budgetResetAt: JsonField<OffsetDateTime>) = apply {
                    this.budgetResetAt = budgetResetAt
                }

                fun config(config: Config) = config(JsonField.of(config))

                /**
                 * Sets [Builder.config] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.config] with a well-typed [Config] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun config(config: JsonField<Config>) = apply { this.config = config }

                fun createdAt(createdAt: OffsetDateTime?) =
                    createdAt(JsonField.ofNullable(createdAt))

                /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
                fun createdAt(createdAt: Optional<OffsetDateTime>) =
                    createdAt(createdAt.getOrNull())

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun createdBy(createdBy: String?) = createdBy(JsonField.ofNullable(createdBy))

                /** Alias for calling [Builder.createdBy] with `createdBy.orElse(null)`. */
                fun createdBy(createdBy: Optional<String>) = createdBy(createdBy.getOrNull())

                /**
                 * Sets [Builder.createdBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

                fun deletedAt(deletedAt: OffsetDateTime?) =
                    deletedAt(JsonField.ofNullable(deletedAt))

                /** Alias for calling [Builder.deletedAt] with `deletedAt.orElse(null)`. */
                fun deletedAt(deletedAt: Optional<OffsetDateTime>) =
                    deletedAt(deletedAt.getOrNull())

                /**
                 * Sets [Builder.deletedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deletedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun deletedAt(deletedAt: JsonField<OffsetDateTime>) = apply {
                    this.deletedAt = deletedAt
                }

                fun deletedBy(deletedBy: String?) = deletedBy(JsonField.ofNullable(deletedBy))

                /** Alias for calling [Builder.deletedBy] with `deletedBy.orElse(null)`. */
                fun deletedBy(deletedBy: Optional<String>) = deletedBy(deletedBy.getOrNull())

                /**
                 * Sets [Builder.deletedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deletedBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun deletedBy(deletedBy: JsonField<String>) = apply { this.deletedBy = deletedBy }

                fun deletedByApiKey(deletedByApiKey: String?) =
                    deletedByApiKey(JsonField.ofNullable(deletedByApiKey))

                /**
                 * Alias for calling [Builder.deletedByApiKey] with `deletedByApiKey.orElse(null)`.
                 */
                fun deletedByApiKey(deletedByApiKey: Optional<String>) =
                    deletedByApiKey(deletedByApiKey.getOrNull())

                /**
                 * Sets [Builder.deletedByApiKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deletedByApiKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun deletedByApiKey(deletedByApiKey: JsonField<String>) = apply {
                    this.deletedByApiKey = deletedByApiKey
                }

                fun expires(expires: Expires?) = expires(JsonField.ofNullable(expires))

                /** Alias for calling [Builder.expires] with `expires.orElse(null)`. */
                fun expires(expires: Optional<Expires>) = expires(expires.getOrNull())

                /**
                 * Sets [Builder.expires] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expires] with a well-typed [Expires] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expires(expires: JsonField<Expires>) = apply { this.expires = expires }

                /** Alias for calling [expires] with `Expires.ofString(string)`. */
                fun expires(string: String) = expires(Expires.ofString(string))

                /** Alias for calling [expires] with `Expires.ofOffsetDateTime(offsetDateTime)`. */
                fun expires(offsetDateTime: OffsetDateTime) =
                    expires(Expires.ofOffsetDateTime(offsetDateTime))

                fun keyAlias(keyAlias: String?) = keyAlias(JsonField.ofNullable(keyAlias))

                /** Alias for calling [Builder.keyAlias] with `keyAlias.orElse(null)`. */
                fun keyAlias(keyAlias: Optional<String>) = keyAlias(keyAlias.getOrNull())

                /**
                 * Sets [Builder.keyAlias] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyAlias] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun keyAlias(keyAlias: JsonField<String>) = apply { this.keyAlias = keyAlias }

                fun keyName(keyName: String?) = keyName(JsonField.ofNullable(keyName))

                /** Alias for calling [Builder.keyName] with `keyName.orElse(null)`. */
                fun keyName(keyName: Optional<String>) = keyName(keyName.getOrNull())

                /**
                 * Sets [Builder.keyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun keyName(keyName: JsonField<String>) = apply { this.keyName = keyName }

                fun keyRotationAt(keyRotationAt: OffsetDateTime?) =
                    keyRotationAt(JsonField.ofNullable(keyRotationAt))

                /** Alias for calling [Builder.keyRotationAt] with `keyRotationAt.orElse(null)`. */
                fun keyRotationAt(keyRotationAt: Optional<OffsetDateTime>) =
                    keyRotationAt(keyRotationAt.getOrNull())

                /**
                 * Sets [Builder.keyRotationAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyRotationAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun keyRotationAt(keyRotationAt: JsonField<OffsetDateTime>) = apply {
                    this.keyRotationAt = keyRotationAt
                }

                fun lastRotationAt(lastRotationAt: OffsetDateTime?) =
                    lastRotationAt(JsonField.ofNullable(lastRotationAt))

                /**
                 * Alias for calling [Builder.lastRotationAt] with `lastRotationAt.orElse(null)`.
                 */
                fun lastRotationAt(lastRotationAt: Optional<OffsetDateTime>) =
                    lastRotationAt(lastRotationAt.getOrNull())

                /**
                 * Sets [Builder.lastRotationAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastRotationAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun lastRotationAt(lastRotationAt: JsonField<OffsetDateTime>) = apply {
                    this.lastRotationAt = lastRotationAt
                }

                fun litellmBudgetTable(litellmBudgetTable: LitellmBudgetTable?) =
                    litellmBudgetTable(JsonField.ofNullable(litellmBudgetTable))

                /**
                 * Alias for calling [Builder.litellmBudgetTable] with
                 * `litellmBudgetTable.orElse(null)`.
                 */
                fun litellmBudgetTable(litellmBudgetTable: Optional<LitellmBudgetTable>) =
                    litellmBudgetTable(litellmBudgetTable.getOrNull())

                /**
                 * Sets [Builder.litellmBudgetTable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.litellmBudgetTable] with a well-typed
                 * [LitellmBudgetTable] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun litellmBudgetTable(litellmBudgetTable: JsonField<LitellmBudgetTable>) = apply {
                    this.litellmBudgetTable = litellmBudgetTable
                }

                fun litellmChangedBy(litellmChangedBy: String?) =
                    litellmChangedBy(JsonField.ofNullable(litellmChangedBy))

                /**
                 * Alias for calling [Builder.litellmChangedBy] with
                 * `litellmChangedBy.orElse(null)`.
                 */
                fun litellmChangedBy(litellmChangedBy: Optional<String>) =
                    litellmChangedBy(litellmChangedBy.getOrNull())

                /**
                 * Sets [Builder.litellmChangedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.litellmChangedBy] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun litellmChangedBy(litellmChangedBy: JsonField<String>) = apply {
                    this.litellmChangedBy = litellmChangedBy
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
                 * You should usually call [Builder.maxBudget] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.maxParallelRequests] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxParallelRequests(maxParallelRequests: JsonField<Long>) = apply {
                    this.maxParallelRequests = maxParallelRequests
                }

                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun modelMaxBudget(modelMaxBudget: ModelMaxBudget) =
                    modelMaxBudget(JsonField.of(modelMaxBudget))

                /**
                 * Sets [Builder.modelMaxBudget] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelMaxBudget] with a well-typed
                 * [ModelMaxBudget] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun modelMaxBudget(modelMaxBudget: JsonField<ModelMaxBudget>) = apply {
                    this.modelMaxBudget = modelMaxBudget
                }

                fun modelSpend(modelSpend: ModelSpend) = modelSpend(JsonField.of(modelSpend))

                /**
                 * Sets [Builder.modelSpend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelSpend] with a well-typed [ModelSpend] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelSpend(modelSpend: JsonField<ModelSpend>) = apply {
                    this.modelSpend = modelSpend
                }

                fun models(models: List<JsonValue>) = models(JsonField.of(models))

                /**
                 * Sets [Builder.models] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.models] with a well-typed `List<JsonValue>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Alias for calling [Builder.objectPermission] with
                 * `objectPermission.orElse(null)`.
                 */
                fun objectPermission(objectPermission: Optional<ObjectPermission>) =
                    objectPermission(objectPermission.getOrNull())

                /**
                 * Sets [Builder.objectPermission] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.objectPermission] with a well-typed
                 * [ObjectPermission] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun objectPermission(objectPermission: JsonField<ObjectPermission>) = apply {
                    this.objectPermission = objectPermission
                }

                fun objectPermissionId(objectPermissionId: String?) =
                    objectPermissionId(JsonField.ofNullable(objectPermissionId))

                /**
                 * Alias for calling [Builder.objectPermissionId] with
                 * `objectPermissionId.orElse(null)`.
                 */
                fun objectPermissionId(objectPermissionId: Optional<String>) =
                    objectPermissionId(objectPermissionId.getOrNull())

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

                fun orgId(orgId: String?) = orgId(JsonField.ofNullable(orgId))

                /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
                fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

                /**
                 * Sets [Builder.orgId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orgId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

                fun permissions(permissions: Permissions) = permissions(JsonField.of(permissions))

                /**
                 * Sets [Builder.permissions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissions] with a well-typed [Permissions]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun permissions(permissions: JsonField<Permissions>) = apply {
                    this.permissions = permissions
                }

                fun rotationCount(rotationCount: Long?) =
                    rotationCount(JsonField.ofNullable(rotationCount))

                /**
                 * Alias for [Builder.rotationCount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun rotationCount(rotationCount: Long) = rotationCount(rotationCount as Long?)

                /** Alias for calling [Builder.rotationCount] with `rotationCount.orElse(null)`. */
                fun rotationCount(rotationCount: Optional<Long>) =
                    rotationCount(rotationCount.getOrNull())

                /**
                 * Sets [Builder.rotationCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rotationCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rotationCount(rotationCount: JsonField<Long>) = apply {
                    this.rotationCount = rotationCount
                }

                fun rotationInterval(rotationInterval: String?) =
                    rotationInterval(JsonField.ofNullable(rotationInterval))

                /**
                 * Alias for calling [Builder.rotationInterval] with
                 * `rotationInterval.orElse(null)`.
                 */
                fun rotationInterval(rotationInterval: Optional<String>) =
                    rotationInterval(rotationInterval.getOrNull())

                /**
                 * Sets [Builder.rotationInterval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rotationInterval] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rotationInterval(rotationInterval: JsonField<String>) = apply {
                    this.rotationInterval = rotationInterval
                }

                fun routerSettings(routerSettings: RouterSettings?) =
                    routerSettings(JsonField.ofNullable(routerSettings))

                /**
                 * Alias for calling [Builder.routerSettings] with `routerSettings.orElse(null)`.
                 */
                fun routerSettings(routerSettings: Optional<RouterSettings>) =
                    routerSettings(routerSettings.getOrNull())

                /**
                 * Sets [Builder.routerSettings] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routerSettings] with a well-typed
                 * [RouterSettings] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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
                 * You should usually call [Builder.rpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

                fun softBudgetCooldown(softBudgetCooldown: Boolean) =
                    softBudgetCooldown(JsonField.of(softBudgetCooldown))

                /**
                 * Sets [Builder.softBudgetCooldown] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.softBudgetCooldown] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun softBudgetCooldown(softBudgetCooldown: JsonField<Boolean>) = apply {
                    this.softBudgetCooldown = softBudgetCooldown
                }

                fun spend(spend: Double) = spend(JsonField.of(spend))

                /**
                 * Sets [Builder.spend] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spend] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun spend(spend: JsonField<Double>) = apply { this.spend = spend }

                fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

                /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
                fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

                /**
                 * Sets [Builder.teamId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

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
                 * You should usually call [Builder.tpmLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

                fun updatedAt(updatedAt: OffsetDateTime?) =
                    updatedAt(JsonField.ofNullable(updatedAt))

                /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
                fun updatedAt(updatedAt: Optional<OffsetDateTime>) =
                    updatedAt(updatedAt.getOrNull())

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                fun updatedBy(updatedBy: String?) = updatedBy(JsonField.ofNullable(updatedBy))

                /** Alias for calling [Builder.updatedBy] with `updatedBy.orElse(null)`. */
                fun updatedBy(updatedBy: Optional<String>) = updatedBy(updatedBy.getOrNull())

                /**
                 * Sets [Builder.updatedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

                fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

                /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
                fun userId(userId: Optional<String>) = userId(userId.getOrNull())

                /**
                 * Sets [Builder.userId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
                 * Returns an immutable instance of [LiteLlmDeletedVerificationToken].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LiteLlmDeletedVerificationToken =
                    LiteLlmDeletedVerificationToken(
                        id,
                        token,
                        aliases,
                        (allowedCacheControls ?: JsonMissing.of()).map { it.toImmutable() },
                        (allowedRoutes ?: JsonMissing.of()).map { it.toImmutable() },
                        autoRotate,
                        blocked,
                        budgetDuration,
                        budgetResetAt,
                        config,
                        createdAt,
                        createdBy,
                        deletedAt,
                        deletedBy,
                        deletedByApiKey,
                        expires,
                        keyAlias,
                        keyName,
                        keyRotationAt,
                        lastRotationAt,
                        litellmBudgetTable,
                        litellmChangedBy,
                        maxBudget,
                        maxParallelRequests,
                        metadata,
                        modelMaxBudget,
                        modelSpend,
                        (models ?: JsonMissing.of()).map { it.toImmutable() },
                        objectPermission,
                        objectPermissionId,
                        orgId,
                        permissions,
                        rotationCount,
                        rotationInterval,
                        routerSettings,
                        rpmLimit,
                        softBudgetCooldown,
                        spend,
                        teamId,
                        tpmLimit,
                        updatedAt,
                        updatedBy,
                        userId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LiteLlmDeletedVerificationToken = apply {
                if (validated) {
                    return@apply
                }

                id()
                token()
                aliases().ifPresent { it.validate() }
                allowedCacheControls()
                allowedRoutes()
                autoRotate()
                blocked()
                budgetDuration()
                budgetResetAt()
                config().ifPresent { it.validate() }
                createdAt()
                createdBy()
                deletedAt()
                deletedBy()
                deletedByApiKey()
                expires().ifPresent { it.validate() }
                keyAlias()
                keyName()
                keyRotationAt()
                lastRotationAt()
                litellmBudgetTable().ifPresent { it.validate() }
                litellmChangedBy()
                maxBudget()
                maxParallelRequests()
                metadata().ifPresent { it.validate() }
                modelMaxBudget().ifPresent { it.validate() }
                modelSpend().ifPresent { it.validate() }
                models()
                objectPermission().ifPresent { it.validate() }
                objectPermissionId()
                orgId()
                permissions().ifPresent { it.validate() }
                rotationCount()
                rotationInterval()
                routerSettings().ifPresent { it.validate() }
                rpmLimit()
                softBudgetCooldown()
                spend()
                teamId()
                tpmLimit()
                updatedAt()
                updatedBy()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (token.asKnown().isPresent) 1 else 0) +
                    (aliases.asKnown().getOrNull()?.validity() ?: 0) +
                    (allowedCacheControls.asKnown().getOrNull()?.size ?: 0) +
                    (allowedRoutes.asKnown().getOrNull()?.size ?: 0) +
                    (if (autoRotate.asKnown().isPresent) 1 else 0) +
                    (if (blocked.asKnown().isPresent) 1 else 0) +
                    (if (budgetDuration.asKnown().isPresent) 1 else 0) +
                    (if (budgetResetAt.asKnown().isPresent) 1 else 0) +
                    (config.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (createdBy.asKnown().isPresent) 1 else 0) +
                    (if (deletedAt.asKnown().isPresent) 1 else 0) +
                    (if (deletedBy.asKnown().isPresent) 1 else 0) +
                    (if (deletedByApiKey.asKnown().isPresent) 1 else 0) +
                    (expires.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (keyAlias.asKnown().isPresent) 1 else 0) +
                    (if (keyName.asKnown().isPresent) 1 else 0) +
                    (if (keyRotationAt.asKnown().isPresent) 1 else 0) +
                    (if (lastRotationAt.asKnown().isPresent) 1 else 0) +
                    (litellmBudgetTable.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (litellmChangedBy.asKnown().isPresent) 1 else 0) +
                    (if (maxBudget.asKnown().isPresent) 1 else 0) +
                    (if (maxParallelRequests.asKnown().isPresent) 1 else 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (modelMaxBudget.asKnown().getOrNull()?.validity() ?: 0) +
                    (modelSpend.asKnown().getOrNull()?.validity() ?: 0) +
                    (models.asKnown().getOrNull()?.size ?: 0) +
                    (objectPermission.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (objectPermissionId.asKnown().isPresent) 1 else 0) +
                    (if (orgId.asKnown().isPresent) 1 else 0) +
                    (permissions.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (rotationCount.asKnown().isPresent) 1 else 0) +
                    (if (rotationInterval.asKnown().isPresent) 1 else 0) +
                    (routerSettings.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (rpmLimit.asKnown().isPresent) 1 else 0) +
                    (if (softBudgetCooldown.asKnown().isPresent) 1 else 0) +
                    (if (spend.asKnown().isPresent) 1 else 0) +
                    (if (teamId.asKnown().isPresent) 1 else 0) +
                    (if (tpmLimit.asKnown().isPresent) 1 else 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0) +
                    (if (updatedBy.asKnown().isPresent) 1 else 0) +
                    (if (userId.asKnown().isPresent) 1 else 0)

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

            @JsonDeserialize(using = Expires.Deserializer::class)
            @JsonSerialize(using = Expires.Serializer::class)
            class Expires
            private constructor(
                private val string: String? = null,
                private val offsetDateTime: OffsetDateTime? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun offsetDateTime(): Optional<OffsetDateTime> = Optional.ofNullable(offsetDateTime)

                fun isString(): Boolean = string != null

                fun isOffsetDateTime(): Boolean = offsetDateTime != null

                fun asString(): String = string.getOrThrow("string")

                fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Expires = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {}
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Expires &&
                        string == other.string &&
                        offsetDateTime == other.offsetDateTime
                }

                override fun hashCode(): Int = Objects.hash(string, offsetDateTime)

                override fun toString(): String =
                    when {
                        string != null -> "Expires{string=$string}"
                        offsetDateTime != null -> "Expires{offsetDateTime=$offsetDateTime}"
                        _json != null -> "Expires{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Expires")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Expires(string = string)

                    @JvmStatic
                    fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                        Expires(offsetDateTime = offsetDateTime)
                }

                /**
                 * An interface that defines how to map each variant of [Expires] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

                    /**
                     * Maps an unknown variant of [Expires] to a value of type [T].
                     *
                     * An instance of [Expires] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws HanzoInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw HanzoInvalidDataException("Unknown Expires: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Expires>(Expires::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Expires {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                        Expires(offsetDateTime = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Expires(string = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Expires(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Expires>(Expires::class) {

                    override fun serialize(
                        value: Expires,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.offsetDateTime != null ->
                                generator.writeObject(value.offsetDateTime)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Expires")
                        }
                    }
                }
            }

            class LitellmBudgetTable
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
                     * [LitellmBudgetTable].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [LitellmBudgetTable]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(litellmBudgetTable: LitellmBudgetTable) = apply {
                        additionalProperties =
                            litellmBudgetTable.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [LitellmBudgetTable].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): LitellmBudgetTable =
                        LitellmBudgetTable(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): LitellmBudgetTable = apply {
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

                    return other is LitellmBudgetTable &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LitellmBudgetTable{additionalProperties=$additionalProperties}"
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

                    /**
                     * Returns a mutable builder for constructing an instance of [ModelMaxBudget].
                     */
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ModelMaxBudget &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ModelMaxBudget{additionalProperties=$additionalProperties}"
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun agentAccessGroups(): Optional<List<String>> =
                    agentAccessGroups.getOptional("agent_access_groups")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun agents(): Optional<List<String>> = agents.getOptional("agents")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mcpAccessGroups(): Optional<List<String>> =
                    mcpAccessGroups.getOptional("mcp_access_groups")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mcpServers(): Optional<List<String>> = mcpServers.getOptional("mcp_servers")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun mcpToolPermissions(): Optional<McpToolPermissions> =
                    mcpToolPermissions.getOptional("mcp_tool_permissions")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun vectorStores(): Optional<List<String>> =
                    vectorStores.getOptional("vector_stores")

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
                 * Unlike [agents], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("agents")
                @ExcludeMissing
                fun _agents(): JsonField<List<String>> = agents

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
                 * Unlike [mcpServers], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                 * Unlike [vectorStores], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                        mcpAccessGroups =
                            objectPermission.mcpAccessGroups.map { it.toMutableList() }
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
                     * You should usually call [Builder.objectPermissionId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
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
                     * You should usually call [Builder.agents] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * Alias for calling [Builder.mcpAccessGroups] with
                     * `mcpAccessGroups.orElse(null)`.
                     */
                    fun mcpAccessGroups(mcpAccessGroups: Optional<List<String>>) =
                        mcpAccessGroups(mcpAccessGroups.getOrNull())

                    /**
                     * Sets [Builder.mcpAccessGroups] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mcpAccessGroups] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
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
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                    fun mcpToolPermissions(mcpToolPermissions: JsonField<McpToolPermissions>) =
                        apply {
                            this.mcpToolPermissions = mcpToolPermissions
                        }

                    fun vectorStores(vectorStores: List<String>?) =
                        vectorStores(JsonField.ofNullable(vectorStores))

                    /**
                     * Alias for calling [Builder.vectorStores] with `vectorStores.orElse(null)`.
                     */
                    fun vectorStores(vectorStores: Optional<List<String>>) =
                        vectorStores(vectorStores.getOrNull())

                    /**
                     * Sets [Builder.vectorStores] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.vectorStores] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(mcpToolPermissions: McpToolPermissions) = apply {
                            additionalProperties =
                                mcpToolPermissions.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Permissions &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Permissions{additionalProperties=$additionalProperties}"
            }

            class RouterSettings
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
                     * Returns a mutable builder for constructing an instance of [RouterSettings].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RouterSettings]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(routerSettings: RouterSettings) = apply {
                        additionalProperties = routerSettings.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [RouterSettings].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RouterSettings = RouterSettings(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): RouterSettings = apply {
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

                    return other is RouterSettings &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RouterSettings{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LiteLlmDeletedVerificationToken &&
                    id == other.id &&
                    token == other.token &&
                    aliases == other.aliases &&
                    allowedCacheControls == other.allowedCacheControls &&
                    allowedRoutes == other.allowedRoutes &&
                    autoRotate == other.autoRotate &&
                    blocked == other.blocked &&
                    budgetDuration == other.budgetDuration &&
                    budgetResetAt == other.budgetResetAt &&
                    config == other.config &&
                    createdAt == other.createdAt &&
                    createdBy == other.createdBy &&
                    deletedAt == other.deletedAt &&
                    deletedBy == other.deletedBy &&
                    deletedByApiKey == other.deletedByApiKey &&
                    expires == other.expires &&
                    keyAlias == other.keyAlias &&
                    keyName == other.keyName &&
                    keyRotationAt == other.keyRotationAt &&
                    lastRotationAt == other.lastRotationAt &&
                    litellmBudgetTable == other.litellmBudgetTable &&
                    litellmChangedBy == other.litellmChangedBy &&
                    maxBudget == other.maxBudget &&
                    maxParallelRequests == other.maxParallelRequests &&
                    metadata == other.metadata &&
                    modelMaxBudget == other.modelMaxBudget &&
                    modelSpend == other.modelSpend &&
                    models == other.models &&
                    objectPermission == other.objectPermission &&
                    objectPermissionId == other.objectPermissionId &&
                    orgId == other.orgId &&
                    permissions == other.permissions &&
                    rotationCount == other.rotationCount &&
                    rotationInterval == other.rotationInterval &&
                    routerSettings == other.routerSettings &&
                    rpmLimit == other.rpmLimit &&
                    softBudgetCooldown == other.softBudgetCooldown &&
                    spend == other.spend &&
                    teamId == other.teamId &&
                    tpmLimit == other.tpmLimit &&
                    updatedAt == other.updatedAt &&
                    updatedBy == other.updatedBy &&
                    userId == other.userId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    token,
                    aliases,
                    allowedCacheControls,
                    allowedRoutes,
                    autoRotate,
                    blocked,
                    budgetDuration,
                    budgetResetAt,
                    config,
                    createdAt,
                    createdBy,
                    deletedAt,
                    deletedBy,
                    deletedByApiKey,
                    expires,
                    keyAlias,
                    keyName,
                    keyRotationAt,
                    lastRotationAt,
                    litellmBudgetTable,
                    litellmChangedBy,
                    maxBudget,
                    maxParallelRequests,
                    metadata,
                    modelMaxBudget,
                    modelSpend,
                    models,
                    objectPermission,
                    objectPermissionId,
                    orgId,
                    permissions,
                    rotationCount,
                    rotationInterval,
                    routerSettings,
                    rpmLimit,
                    softBudgetCooldown,
                    spend,
                    teamId,
                    tpmLimit,
                    updatedAt,
                    updatedBy,
                    userId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LiteLlmDeletedVerificationToken{id=$id, token=$token, aliases=$aliases, allowedCacheControls=$allowedCacheControls, allowedRoutes=$allowedRoutes, autoRotate=$autoRotate, blocked=$blocked, budgetDuration=$budgetDuration, budgetResetAt=$budgetResetAt, config=$config, createdAt=$createdAt, createdBy=$createdBy, deletedAt=$deletedAt, deletedBy=$deletedBy, deletedByApiKey=$deletedByApiKey, expires=$expires, keyAlias=$keyAlias, keyName=$keyName, keyRotationAt=$keyRotationAt, lastRotationAt=$lastRotationAt, litellmBudgetTable=$litellmBudgetTable, litellmChangedBy=$litellmChangedBy, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelSpend=$modelSpend, models=$models, objectPermission=$objectPermission, objectPermissionId=$objectPermissionId, orgId=$orgId, permissions=$permissions, rotationCount=$rotationCount, rotationInterval=$rotationInterval, routerSettings=$routerSettings, rpmLimit=$rpmLimit, softBudgetCooldown=$softBudgetCooldown, spend=$spend, teamId=$teamId, tpmLimit=$tpmLimit, updatedAt=$updatedAt, updatedBy=$updatedBy, userId=$userId, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KeyListResponse &&
            currentPage == other.currentPage &&
            keys == other.keys &&
            totalCount == other.totalCount &&
            totalPages == other.totalPages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(currentPage, keys, totalCount, totalPages, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "KeyListResponse{currentPage=$currentPage, keys=$keys, totalCount=$totalCount, totalPages=$totalPages, additionalProperties=$additionalProperties}"
}
