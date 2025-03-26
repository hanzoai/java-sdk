// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.model

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hanzo_ai.api.core.Enum
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.checkRequired
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ModelInfo
private constructor(
    private val id: JsonField<String>,
    private val baseModel: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val dbModel: JsonField<Boolean>,
    private val teamId: JsonField<String>,
    private val teamPublicModelName: JsonField<String>,
    private val tier: JsonField<Tier>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("base_model") @ExcludeMissing baseModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("db_model") @ExcludeMissing dbModel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("team_public_model_name")
        @ExcludeMissing
        teamPublicModelName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing tier: JsonField<Tier> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_by") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        baseModel,
        createdAt,
        createdBy,
        dbModel,
        teamId,
        teamPublicModelName,
        tier,
        updatedAt,
        updatedBy,
        mutableMapOf(),
    )

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseModel(): Optional<String> = Optional.ofNullable(baseModel.getNullable("base_model"))

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("created_by"))

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dbModel(): Optional<Boolean> = Optional.ofNullable(dbModel.getNullable("db_model"))

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamId(): Optional<String> = Optional.ofNullable(teamId.getNullable("team_id"))

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamPublicModelName(): Optional<String> =
        Optional.ofNullable(teamPublicModelName.getNullable("team_public_model_name"))

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tier(): Optional<Tier> = Optional.ofNullable(tier.getNullable("tier"))

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(updatedAt.getNullable("updated_at"))

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = Optional.ofNullable(updatedBy.getNullable("updated_by"))

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [baseModel].
     *
     * Unlike [baseModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base_model") @ExcludeMissing fun _baseModel(): JsonField<String> = baseModel

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [dbModel].
     *
     * Unlike [dbModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("db_model") @ExcludeMissing fun _dbModel(): JsonField<Boolean> = dbModel

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

    /**
     * Returns the raw JSON value of [teamPublicModelName].
     *
     * Unlike [teamPublicModelName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("team_public_model_name")
    @ExcludeMissing
    fun _teamPublicModelName(): JsonField<String> = teamPublicModelName

    /**
     * Returns the raw JSON value of [tier].
     *
     * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Tier> = tier

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [updatedBy].
     *
     * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_by") @ExcludeMissing fun _updatedBy(): JsonField<String> = updatedBy

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
         * Returns a mutable builder for constructing an instance of [ModelInfo].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModelInfo]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var baseModel: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dbModel: JsonField<Boolean> = JsonMissing.of()
        private var teamId: JsonField<String> = JsonMissing.of()
        private var teamPublicModelName: JsonField<String> = JsonMissing.of()
        private var tier: JsonField<Tier> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modelInfo: ModelInfo) = apply {
            id = modelInfo.id
            baseModel = modelInfo.baseModel
            createdAt = modelInfo.createdAt
            createdBy = modelInfo.createdBy
            dbModel = modelInfo.dbModel
            teamId = modelInfo.teamId
            teamPublicModelName = modelInfo.teamPublicModelName
            tier = modelInfo.tier
            updatedAt = modelInfo.updatedAt
            updatedBy = modelInfo.updatedBy
            additionalProperties = modelInfo.additionalProperties.toMutableMap()
        }

        fun id(id: String?) = id(JsonField.ofNullable(id))

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun baseModel(baseModel: String?) = baseModel(JsonField.ofNullable(baseModel))

        /** Alias for calling [Builder.baseModel] with `baseModel.orElse(null)`. */
        fun baseModel(baseModel: Optional<String>) = baseModel(baseModel.getOrNull())

        /**
         * Sets [Builder.baseModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseModel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun baseModel(baseModel: JsonField<String>) = apply { this.baseModel = baseModel }

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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: String?) = createdBy(JsonField.ofNullable(createdBy))

        /** Alias for calling [Builder.createdBy] with `createdBy.orElse(null)`. */
        fun createdBy(createdBy: Optional<String>) = createdBy(createdBy.getOrNull())

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun dbModel(dbModel: Boolean) = dbModel(JsonField.of(dbModel))

        /**
         * Sets [Builder.dbModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dbModel] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dbModel(dbModel: JsonField<Boolean>) = apply { this.dbModel = dbModel }

        fun teamId(teamId: String?) = teamId(JsonField.ofNullable(teamId))

        /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
        fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

        fun teamPublicModelName(teamPublicModelName: String?) =
            teamPublicModelName(JsonField.ofNullable(teamPublicModelName))

        /**
         * Alias for calling [Builder.teamPublicModelName] with `teamPublicModelName.orElse(null)`.
         */
        fun teamPublicModelName(teamPublicModelName: Optional<String>) =
            teamPublicModelName(teamPublicModelName.getOrNull())

        /**
         * Sets [Builder.teamPublicModelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamPublicModelName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun teamPublicModelName(teamPublicModelName: JsonField<String>) = apply {
            this.teamPublicModelName = teamPublicModelName
        }

        fun tier(tier: Tier?) = tier(JsonField.ofNullable(tier))

        /** Alias for calling [Builder.tier] with `tier.orElse(null)`. */
        fun tier(tier: Optional<Tier>) = tier(tier.getOrNull())

        /**
         * Sets [Builder.tier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier] with a well-typed [Tier] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tier(tier: JsonField<Tier>) = apply { this.tier = tier }

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
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun updatedBy(updatedBy: String?) = updatedBy(JsonField.ofNullable(updatedBy))

        /** Alias for calling [Builder.updatedBy] with `updatedBy.orElse(null)`. */
        fun updatedBy(updatedBy: Optional<String>) = updatedBy(updatedBy.getOrNull())

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

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
         * Returns an immutable instance of [ModelInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModelInfo =
            ModelInfo(
                checkRequired("id", id),
                baseModel,
                createdAt,
                createdBy,
                dbModel,
                teamId,
                teamPublicModelName,
                tier,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ModelInfo = apply {
        if (validated) {
            return@apply
        }

        id()
        baseModel()
        createdAt()
        createdBy()
        dbModel()
        teamId()
        teamPublicModelName()
        tier()
        updatedAt()
        updatedBy()
        validated = true
    }

    class Tier @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FREE = of("free")

            @JvmField val PAID = of("paid")

            @JvmStatic fun of(value: String) = Tier(JsonField.of(value))
        }

        /** An enum containing [Tier]'s known values. */
        enum class Known {
            FREE,
            PAID,
        }

        /**
         * An enum containing [Tier]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Tier] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FREE,
            PAID,
            /** An enum member indicating that [Tier] was instantiated with an unknown value. */
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
                FREE -> Value.FREE
                PAID -> Value.PAID
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
                FREE -> Known.FREE
                PAID -> Known.PAID
                else -> throw HanzoInvalidDataException("Unknown Tier: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tier && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ModelInfo && id == other.id && baseModel == other.baseModel && createdAt == other.createdAt && createdBy == other.createdBy && dbModel == other.dbModel && teamId == other.teamId && teamPublicModelName == other.teamPublicModelName && tier == other.tier && updatedAt == other.updatedAt && updatedBy == other.updatedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, baseModel, createdAt, createdBy, dbModel, teamId, teamPublicModelName, tier, updatedAt, updatedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModelInfo{id=$id, baseModel=$baseModel, createdAt=$createdAt, createdBy=$createdBy, dbModel=$dbModel, teamId=$teamId, teamPublicModelName=$teamPublicModelName, tier=$tier, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}
