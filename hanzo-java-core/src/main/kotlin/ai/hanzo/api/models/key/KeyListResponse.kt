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
import ai.hanzo.api.core.getOrThrow
import ai.hanzo.api.core.toImmutable
import ai.hanzo.api.errors.HanzoInvalidDataException
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
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        /** Return the row in the db */
        fun userApiKeyAuth(): Optional<UserApiKeyAuth> = Optional.ofNullable(userApiKeyAuth)

        fun isString(): Boolean = string != null

        fun isUserApiKeyAuth(): Boolean = userApiKeyAuth != null

        fun asString(): String = string.getOrThrow("string")

        /** Return the row in the db */
        fun asUserApiKeyAuth(): UserApiKeyAuth = userApiKeyAuth.getOrThrow("userApiKeyAuth")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                userApiKeyAuth != null -> visitor.visitUserApiKeyAuth(userApiKeyAuth)
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

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Key && string == other.string && userApiKeyAuth == other.userApiKeyAuth
        }

        override fun hashCode(): Int = Objects.hash(string, userApiKeyAuth)

        override fun toString(): String =
            when {
                string != null -> "Key{string=$string}"
                userApiKeyAuth != null -> "Key{userApiKeyAuth=$userApiKeyAuth}"
                _json != null -> "Key{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Key")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Key(string = string)

            /** Return the row in the db */
            @JvmStatic
            fun ofUserApiKeyAuth(userApiKeyAuth: UserApiKeyAuth) =
                Key(userApiKeyAuth = userApiKeyAuth)
        }

        /** An interface that defines how to map each variant of [Key] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            /** Return the row in the db */
            fun visitUserApiKeyAuth(userApiKeyAuth: UserApiKeyAuth): T

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
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Key(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
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
            private val aliases: JsonValue,
            private val allowedCacheControls: JsonField<List<JsonValue>>,
            private val allowedModelRegion: JsonField<AllowedModelRegion>,
            private val apiKey: JsonField<String>,
            private val blocked: JsonField<Boolean>,
            private val budgetDuration: JsonField<String>,
            private val budgetResetAt: JsonField<OffsetDateTime>,
            private val config: JsonValue,
            private val createdAt: JsonField<OffsetDateTime>,
            private val createdBy: JsonField<String>,
            private val endUserId: JsonField<String>,
            private val endUserMaxBudget: JsonField<Double>,
            private val endUserRpmLimit: JsonField<Long>,
            private val endUserTpmLimit: JsonField<Long>,
            private val expires: JsonField<Expires>,
            private val keyAlias: JsonField<String>,
            private val keyName: JsonField<String>,
            private val lastRefreshedAt: JsonField<Double>,
            private val llmBudgetTable: JsonValue,
            private val maxBudget: JsonField<Double>,
            private val maxParallelRequests: JsonField<Long>,
            private val metadata: JsonValue,
            private val modelMaxBudget: JsonValue,
            private val modelSpend: JsonValue,
            private val models: JsonField<List<JsonValue>>,
            private val orgId: JsonField<String>,
            private val parentOtelSpan: JsonValue,
            private val permissions: JsonValue,
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
            private val teamMemberSpend: JsonField<Double>,
            private val teamMetadata: JsonValue,
            private val teamModelAliases: JsonValue,
            private val teamModels: JsonField<List<JsonValue>>,
            private val teamRpmLimit: JsonField<Long>,
            private val teamSpend: JsonField<Double>,
            private val teamTpmLimit: JsonField<Long>,
            private val tpmLimit: JsonField<Long>,
            private val tpmLimitPerModel: JsonField<TpmLimitPerModel>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val updatedBy: JsonField<String>,
            private val userEmail: JsonField<String>,
            private val userId: JsonField<String>,
            private val userRole: JsonField<UserRole>,
            private val userRpmLimit: JsonField<Long>,
            private val userTpmLimit: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aliases") @ExcludeMissing aliases: JsonValue = JsonMissing.of(),
                @JsonProperty("allowed_cache_controls")
                @ExcludeMissing
                allowedCacheControls: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("allowed_model_region")
                @ExcludeMissing
                allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of(),
                @JsonProperty("api_key")
                @ExcludeMissing
                apiKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("blocked")
                @ExcludeMissing
                blocked: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("budget_duration")
                @ExcludeMissing
                budgetDuration: JsonField<String> = JsonMissing.of(),
                @JsonProperty("budget_reset_at")
                @ExcludeMissing
                budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("config") @ExcludeMissing config: JsonValue = JsonMissing.of(),
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
                @JsonProperty("last_refreshed_at")
                @ExcludeMissing
                lastRefreshedAt: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("llm_budget_table")
                @ExcludeMissing
                llmBudgetTable: JsonValue = JsonMissing.of(),
                @JsonProperty("max_budget")
                @ExcludeMissing
                maxBudget: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("max_parallel_requests")
                @ExcludeMissing
                maxParallelRequests: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
                @JsonProperty("model_max_budget")
                @ExcludeMissing
                modelMaxBudget: JsonValue = JsonMissing.of(),
                @JsonProperty("model_spend")
                @ExcludeMissing
                modelSpend: JsonValue = JsonMissing.of(),
                @JsonProperty("models")
                @ExcludeMissing
                models: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("org_id") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parent_otel_span")
                @ExcludeMissing
                parentOtelSpan: JsonValue = JsonMissing.of(),
                @JsonProperty("permissions")
                @ExcludeMissing
                permissions: JsonValue = JsonMissing.of(),
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
                @JsonProperty("team_member_spend")
                @ExcludeMissing
                teamMemberSpend: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("team_metadata")
                @ExcludeMissing
                teamMetadata: JsonValue = JsonMissing.of(),
                @JsonProperty("team_model_aliases")
                @ExcludeMissing
                teamModelAliases: JsonValue = JsonMissing.of(),
                @JsonProperty("team_models")
                @ExcludeMissing
                teamModels: JsonField<List<JsonValue>> = JsonMissing.of(),
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
                @JsonProperty("user_email")
                @ExcludeMissing
                userEmail: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_id")
                @ExcludeMissing
                userId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("user_role")
                @ExcludeMissing
                userRole: JsonField<UserRole> = JsonMissing.of(),
                @JsonProperty("user_rpm_limit")
                @ExcludeMissing
                userRpmLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("user_tpm_limit")
                @ExcludeMissing
                userTpmLimit: JsonField<Long> = JsonMissing.of(),
            ) : this(
                token,
                aliases,
                allowedCacheControls,
                allowedModelRegion,
                apiKey,
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
                lastRefreshedAt,
                llmBudgetTable,
                maxBudget,
                maxParallelRequests,
                metadata,
                modelMaxBudget,
                modelSpend,
                models,
                orgId,
                parentOtelSpan,
                permissions,
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
                teamMemberSpend,
                teamMetadata,
                teamModelAliases,
                teamModels,
                teamRpmLimit,
                teamSpend,
                teamTpmLimit,
                tpmLimit,
                tpmLimitPerModel,
                updatedAt,
                updatedBy,
                userEmail,
                userId,
                userRole,
                userRpmLimit,
                userTpmLimit,
                mutableMapOf(),
            )

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun token(): Optional<String> = token.getOptional("token")

            @JsonProperty("aliases") @ExcludeMissing fun _aliases(): JsonValue = aliases

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
            fun apiKey(): Optional<String> = apiKey.getOptional("api_key")

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

            @JsonProperty("config") @ExcludeMissing fun _config(): JsonValue = config

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
            fun lastRefreshedAt(): Optional<Double> =
                lastRefreshedAt.getOptional("last_refreshed_at")

            @JsonProperty("llm_budget_table")
            @ExcludeMissing
            fun _llmBudgetTable(): JsonValue = llmBudgetTable

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

            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            @JsonProperty("model_max_budget")
            @ExcludeMissing
            fun _modelMaxBudget(): JsonValue = modelMaxBudget

            @JsonProperty("model_spend") @ExcludeMissing fun _modelSpend(): JsonValue = modelSpend

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun models(): Optional<List<JsonValue>> = models.getOptional("models")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun orgId(): Optional<String> = orgId.getOptional("org_id")

            @JsonProperty("parent_otel_span")
            @ExcludeMissing
            fun _parentOtelSpan(): JsonValue = parentOtelSpan

            @JsonProperty("permissions") @ExcludeMissing fun _permissions(): JsonValue = permissions

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
            fun teamMemberSpend(): Optional<Double> =
                teamMemberSpend.getOptional("team_member_spend")

            @JsonProperty("team_metadata")
            @ExcludeMissing
            fun _teamMetadata(): JsonValue = teamMetadata

            @JsonProperty("team_model_aliases")
            @ExcludeMissing
            fun _teamModelAliases(): JsonValue = teamModelAliases

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun teamModels(): Optional<List<JsonValue>> = teamModels.getOptional("team_models")

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
            fun userRole(): Optional<UserRole> = userRole.getOptional("user_role")

            /**
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userRpmLimit(): Optional<Long> = userRpmLimit.getOptional("user_rpm_limit")

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
             * Returns the raw JSON value of [apiKey].
             *
             * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

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
             * Returns the raw JSON value of [lastRefreshedAt].
             *
             * Unlike [lastRefreshedAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("last_refreshed_at")
            @ExcludeMissing
            fun _lastRefreshedAt(): JsonField<Double> = lastRefreshedAt

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
             * Returns the raw JSON value of [models].
             *
             * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("models")
            @ExcludeMissing
            fun _models(): JsonField<List<JsonValue>> = models

            /**
             * Returns the raw JSON value of [orgId].
             *
             * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("org_id") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

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
             * Returns the raw JSON value of [teamMemberSpend].
             *
             * Unlike [teamMemberSpend], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("team_member_spend")
            @ExcludeMissing
            fun _teamMemberSpend(): JsonField<Double> = teamMemberSpend

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
             * Returns the raw JSON value of [userRole].
             *
             * Unlike [userRole], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("user_role")
            @ExcludeMissing
            fun _userRole(): JsonField<UserRole> = userRole

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
                private var aliases: JsonValue = JsonMissing.of()
                private var allowedCacheControls: JsonField<MutableList<JsonValue>>? = null
                private var allowedModelRegion: JsonField<AllowedModelRegion> = JsonMissing.of()
                private var apiKey: JsonField<String> = JsonMissing.of()
                private var blocked: JsonField<Boolean> = JsonMissing.of()
                private var budgetDuration: JsonField<String> = JsonMissing.of()
                private var budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var config: JsonValue = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var createdBy: JsonField<String> = JsonMissing.of()
                private var endUserId: JsonField<String> = JsonMissing.of()
                private var endUserMaxBudget: JsonField<Double> = JsonMissing.of()
                private var endUserRpmLimit: JsonField<Long> = JsonMissing.of()
                private var endUserTpmLimit: JsonField<Long> = JsonMissing.of()
                private var expires: JsonField<Expires> = JsonMissing.of()
                private var keyAlias: JsonField<String> = JsonMissing.of()
                private var keyName: JsonField<String> = JsonMissing.of()
                private var lastRefreshedAt: JsonField<Double> = JsonMissing.of()
                private var llmBudgetTable: JsonValue = JsonMissing.of()
                private var maxBudget: JsonField<Double> = JsonMissing.of()
                private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var modelMaxBudget: JsonValue = JsonMissing.of()
                private var modelSpend: JsonValue = JsonMissing.of()
                private var models: JsonField<MutableList<JsonValue>>? = null
                private var orgId: JsonField<String> = JsonMissing.of()
                private var parentOtelSpan: JsonValue = JsonMissing.of()
                private var permissions: JsonValue = JsonMissing.of()
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
                private var teamMemberSpend: JsonField<Double> = JsonMissing.of()
                private var teamMetadata: JsonValue = JsonMissing.of()
                private var teamModelAliases: JsonValue = JsonMissing.of()
                private var teamModels: JsonField<MutableList<JsonValue>>? = null
                private var teamRpmLimit: JsonField<Long> = JsonMissing.of()
                private var teamSpend: JsonField<Double> = JsonMissing.of()
                private var teamTpmLimit: JsonField<Long> = JsonMissing.of()
                private var tpmLimit: JsonField<Long> = JsonMissing.of()
                private var tpmLimitPerModel: JsonField<TpmLimitPerModel> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var updatedBy: JsonField<String> = JsonMissing.of()
                private var userEmail: JsonField<String> = JsonMissing.of()
                private var userId: JsonField<String> = JsonMissing.of()
                private var userRole: JsonField<UserRole> = JsonMissing.of()
                private var userRpmLimit: JsonField<Long> = JsonMissing.of()
                private var userTpmLimit: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(userApiKeyAuth: UserApiKeyAuth) = apply {
                    token = userApiKeyAuth.token
                    aliases = userApiKeyAuth.aliases
                    allowedCacheControls =
                        userApiKeyAuth.allowedCacheControls.map { it.toMutableList() }
                    allowedModelRegion = userApiKeyAuth.allowedModelRegion
                    apiKey = userApiKeyAuth.apiKey
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
                    lastRefreshedAt = userApiKeyAuth.lastRefreshedAt
                    llmBudgetTable = userApiKeyAuth.llmBudgetTable
                    maxBudget = userApiKeyAuth.maxBudget
                    maxParallelRequests = userApiKeyAuth.maxParallelRequests
                    metadata = userApiKeyAuth.metadata
                    modelMaxBudget = userApiKeyAuth.modelMaxBudget
                    modelSpend = userApiKeyAuth.modelSpend
                    models = userApiKeyAuth.models.map { it.toMutableList() }
                    orgId = userApiKeyAuth.orgId
                    parentOtelSpan = userApiKeyAuth.parentOtelSpan
                    permissions = userApiKeyAuth.permissions
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
                    teamMemberSpend = userApiKeyAuth.teamMemberSpend
                    teamMetadata = userApiKeyAuth.teamMetadata
                    teamModelAliases = userApiKeyAuth.teamModelAliases
                    teamModels = userApiKeyAuth.teamModels.map { it.toMutableList() }
                    teamRpmLimit = userApiKeyAuth.teamRpmLimit
                    teamSpend = userApiKeyAuth.teamSpend
                    teamTpmLimit = userApiKeyAuth.teamTpmLimit
                    tpmLimit = userApiKeyAuth.tpmLimit
                    tpmLimitPerModel = userApiKeyAuth.tpmLimitPerModel
                    updatedAt = userApiKeyAuth.updatedAt
                    updatedBy = userApiKeyAuth.updatedBy
                    userEmail = userApiKeyAuth.userEmail
                    userId = userApiKeyAuth.userId
                    userRole = userApiKeyAuth.userRole
                    userRpmLimit = userApiKeyAuth.userRpmLimit
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

                fun aliases(aliases: JsonValue) = apply { this.aliases = aliases }

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

                fun config(config: JsonValue) = apply { this.config = config }

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

                fun llmBudgetTable(llmBudgetTable: JsonValue) = apply {
                    this.llmBudgetTable = llmBudgetTable
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

                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                fun modelMaxBudget(modelMaxBudget: JsonValue) = apply {
                    this.modelMaxBudget = modelMaxBudget
                }

                fun modelSpend(modelSpend: JsonValue) = apply { this.modelSpend = modelSpend }

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

                fun parentOtelSpan(parentOtelSpan: JsonValue) = apply {
                    this.parentOtelSpan = parentOtelSpan
                }

                fun permissions(permissions: JsonValue) = apply { this.permissions = permissions }

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

                fun teamMetadata(teamMetadata: JsonValue) = apply {
                    this.teamMetadata = teamMetadata
                }

                fun teamModelAliases(teamModelAliases: JsonValue) = apply {
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
                fun userRole(userRole: UserRole?) = userRole(JsonField.ofNullable(userRole))

                /** Alias for calling [Builder.userRole] with `userRole.orElse(null)`. */
                fun userRole(userRole: Optional<UserRole>) = userRole(userRole.getOrNull())

                /**
                 * Sets [Builder.userRole] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userRole] with a well-typed [UserRole] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userRole(userRole: JsonField<UserRole>) = apply { this.userRole = userRole }

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
                        apiKey,
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
                        lastRefreshedAt,
                        llmBudgetTable,
                        maxBudget,
                        maxParallelRequests,
                        metadata,
                        modelMaxBudget,
                        modelSpend,
                        (models ?: JsonMissing.of()).map { it.toImmutable() },
                        orgId,
                        parentOtelSpan,
                        permissions,
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
                        teamMemberSpend,
                        teamMetadata,
                        teamModelAliases,
                        (teamModels ?: JsonMissing.of()).map { it.toImmutable() },
                        teamRpmLimit,
                        teamSpend,
                        teamTpmLimit,
                        tpmLimit,
                        tpmLimitPerModel,
                        updatedAt,
                        updatedBy,
                        userEmail,
                        userId,
                        userRole,
                        userRpmLimit,
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
                allowedCacheControls()
                allowedModelRegion().ifPresent { it.validate() }
                apiKey()
                blocked()
                budgetDuration()
                budgetResetAt()
                createdAt()
                createdBy()
                endUserId()
                endUserMaxBudget()
                endUserRpmLimit()
                endUserTpmLimit()
                expires().ifPresent { it.validate() }
                keyAlias()
                keyName()
                lastRefreshedAt()
                maxBudget()
                maxParallelRequests()
                models()
                orgId()
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
                teamMemberSpend()
                teamModels()
                teamRpmLimit()
                teamSpend()
                teamTpmLimit()
                tpmLimit()
                tpmLimitPerModel().ifPresent { it.validate() }
                updatedAt()
                updatedBy()
                userEmail()
                userId()
                userRole().ifPresent { it.validate() }
                userRpmLimit()
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
                    (allowedCacheControls.asKnown().getOrNull()?.size ?: 0) +
                    (allowedModelRegion.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (apiKey.asKnown().isPresent) 1 else 0) +
                    (if (blocked.asKnown().isPresent) 1 else 0) +
                    (if (budgetDuration.asKnown().isPresent) 1 else 0) +
                    (if (budgetResetAt.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (createdBy.asKnown().isPresent) 1 else 0) +
                    (if (endUserId.asKnown().isPresent) 1 else 0) +
                    (if (endUserMaxBudget.asKnown().isPresent) 1 else 0) +
                    (if (endUserRpmLimit.asKnown().isPresent) 1 else 0) +
                    (if (endUserTpmLimit.asKnown().isPresent) 1 else 0) +
                    (expires.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (keyAlias.asKnown().isPresent) 1 else 0) +
                    (if (keyName.asKnown().isPresent) 1 else 0) +
                    (if (lastRefreshedAt.asKnown().isPresent) 1 else 0) +
                    (if (maxBudget.asKnown().isPresent) 1 else 0) +
                    (if (maxParallelRequests.asKnown().isPresent) 1 else 0) +
                    (models.asKnown().getOrNull()?.size ?: 0) +
                    (if (orgId.asKnown().isPresent) 1 else 0) +
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
                    (if (teamMemberSpend.asKnown().isPresent) 1 else 0) +
                    (teamModels.asKnown().getOrNull()?.size ?: 0) +
                    (if (teamRpmLimit.asKnown().isPresent) 1 else 0) +
                    (if (teamSpend.asKnown().isPresent) 1 else 0) +
                    (if (teamTpmLimit.asKnown().isPresent) 1 else 0) +
                    (if (tpmLimit.asKnown().isPresent) 1 else 0) +
                    (tpmLimitPerModel.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0) +
                    (if (updatedBy.asKnown().isPresent) 1 else 0) +
                    (if (userEmail.asKnown().isPresent) 1 else 0) +
                    (if (userId.asKnown().isPresent) 1 else 0) +
                    (userRole.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (userRpmLimit.asKnown().isPresent) 1 else 0) +
                    (if (userTpmLimit.asKnown().isPresent) 1 else 0)

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
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Expires(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                        Expires(offsetDateTime = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
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
             */
            class UserRole @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val PROXY_ADMIN = of("proxy_admin")

                    @JvmField val PROXY_ADMIN_VIEWER = of("proxy_admin_viewer")

                    @JvmField val ORG_ADMIN = of("org_admin")

                    @JvmField val INTERNAL_USER = of("internal_user")

                    @JvmField val INTERNAL_USER_VIEWER = of("internal_user_viewer")

                    @JvmField val TEAM = of("team")

                    @JvmField val CUSTOMER = of("customer")

                    @JvmStatic fun of(value: String) = UserRole(JsonField.of(value))
                }

                /** An enum containing [UserRole]'s known values. */
                enum class Known {
                    PROXY_ADMIN,
                    PROXY_ADMIN_VIEWER,
                    ORG_ADMIN,
                    INTERNAL_USER,
                    INTERNAL_USER_VIEWER,
                    TEAM,
                    CUSTOMER,
                }

                /**
                 * An enum containing [UserRole]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [UserRole] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PROXY_ADMIN,
                    PROXY_ADMIN_VIEWER,
                    ORG_ADMIN,
                    INTERNAL_USER,
                    INTERNAL_USER_VIEWER,
                    TEAM,
                    CUSTOMER,
                    /**
                     * An enum member indicating that [UserRole] was instantiated with an unknown
                     * value.
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
                        PROXY_ADMIN -> Value.PROXY_ADMIN
                        PROXY_ADMIN_VIEWER -> Value.PROXY_ADMIN_VIEWER
                        ORG_ADMIN -> Value.ORG_ADMIN
                        INTERNAL_USER -> Value.INTERNAL_USER
                        INTERNAL_USER_VIEWER -> Value.INTERNAL_USER_VIEWER
                        TEAM -> Value.TEAM
                        CUSTOMER -> Value.CUSTOMER
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
                        PROXY_ADMIN -> Known.PROXY_ADMIN
                        PROXY_ADMIN_VIEWER -> Known.PROXY_ADMIN_VIEWER
                        ORG_ADMIN -> Known.ORG_ADMIN
                        INTERNAL_USER -> Known.INTERNAL_USER
                        INTERNAL_USER_VIEWER -> Known.INTERNAL_USER_VIEWER
                        TEAM -> Known.TEAM
                        CUSTOMER -> Known.CUSTOMER
                        else -> throw HanzoInvalidDataException("Unknown UserRole: $value")
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

                fun validate(): UserRole = apply {
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

                    return other is UserRole && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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
                    apiKey == other.apiKey &&
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
                    lastRefreshedAt == other.lastRefreshedAt &&
                    llmBudgetTable == other.llmBudgetTable &&
                    maxBudget == other.maxBudget &&
                    maxParallelRequests == other.maxParallelRequests &&
                    metadata == other.metadata &&
                    modelMaxBudget == other.modelMaxBudget &&
                    modelSpend == other.modelSpend &&
                    models == other.models &&
                    orgId == other.orgId &&
                    parentOtelSpan == other.parentOtelSpan &&
                    permissions == other.permissions &&
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
                    teamMemberSpend == other.teamMemberSpend &&
                    teamMetadata == other.teamMetadata &&
                    teamModelAliases == other.teamModelAliases &&
                    teamModels == other.teamModels &&
                    teamRpmLimit == other.teamRpmLimit &&
                    teamSpend == other.teamSpend &&
                    teamTpmLimit == other.teamTpmLimit &&
                    tpmLimit == other.tpmLimit &&
                    tpmLimitPerModel == other.tpmLimitPerModel &&
                    updatedAt == other.updatedAt &&
                    updatedBy == other.updatedBy &&
                    userEmail == other.userEmail &&
                    userId == other.userId &&
                    userRole == other.userRole &&
                    userRpmLimit == other.userRpmLimit &&
                    userTpmLimit == other.userTpmLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    token,
                    aliases,
                    allowedCacheControls,
                    allowedModelRegion,
                    apiKey,
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
                    lastRefreshedAt,
                    llmBudgetTable,
                    maxBudget,
                    maxParallelRequests,
                    metadata,
                    modelMaxBudget,
                    modelSpend,
                    models,
                    orgId,
                    parentOtelSpan,
                    permissions,
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
                    teamMemberSpend,
                    teamMetadata,
                    teamModelAliases,
                    teamModels,
                    teamRpmLimit,
                    teamSpend,
                    teamTpmLimit,
                    tpmLimit,
                    tpmLimitPerModel,
                    updatedAt,
                    updatedBy,
                    userEmail,
                    userId,
                    userRole,
                    userRpmLimit,
                    userTpmLimit,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UserApiKeyAuth{token=$token, aliases=$aliases, allowedCacheControls=$allowedCacheControls, allowedModelRegion=$allowedModelRegion, apiKey=$apiKey, blocked=$blocked, budgetDuration=$budgetDuration, budgetResetAt=$budgetResetAt, config=$config, createdAt=$createdAt, createdBy=$createdBy, endUserId=$endUserId, endUserMaxBudget=$endUserMaxBudget, endUserRpmLimit=$endUserRpmLimit, endUserTpmLimit=$endUserTpmLimit, expires=$expires, keyAlias=$keyAlias, keyName=$keyName, lastRefreshedAt=$lastRefreshedAt, llmBudgetTable=$llmBudgetTable, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, metadata=$metadata, modelMaxBudget=$modelMaxBudget, modelSpend=$modelSpend, models=$models, orgId=$orgId, parentOtelSpan=$parentOtelSpan, permissions=$permissions, rpmLimit=$rpmLimit, rpmLimitPerModel=$rpmLimitPerModel, softBudget=$softBudget, softBudgetCooldown=$softBudgetCooldown, spend=$spend, teamAlias=$teamAlias, teamBlocked=$teamBlocked, teamId=$teamId, teamMaxBudget=$teamMaxBudget, teamMember=$teamMember, teamMemberSpend=$teamMemberSpend, teamMetadata=$teamMetadata, teamModelAliases=$teamModelAliases, teamModels=$teamModels, teamRpmLimit=$teamRpmLimit, teamSpend=$teamSpend, teamTpmLimit=$teamTpmLimit, tpmLimit=$tpmLimit, tpmLimitPerModel=$tpmLimitPerModel, updatedAt=$updatedAt, updatedBy=$updatedBy, userEmail=$userEmail, userId=$userId, userRole=$userRole, userRpmLimit=$userRpmLimit, userTpmLimit=$userTpmLimit, additionalProperties=$additionalProperties}"
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
