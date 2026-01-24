// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.guardrails

import ai.hanzo.api.core.Enum
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

class GuardrailListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val guardrails: JsonField<List<Guardrail>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("guardrails")
        @ExcludeMissing
        guardrails: JsonField<List<Guardrail>> = JsonMissing.of()
    ) : this(guardrails, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun guardrails(): List<Guardrail> = guardrails.getRequired("guardrails")

    /**
     * Returns the raw JSON value of [guardrails].
     *
     * Unlike [guardrails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("guardrails")
    @ExcludeMissing
    fun _guardrails(): JsonField<List<Guardrail>> = guardrails

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
         * Returns a mutable builder for constructing an instance of [GuardrailListResponse].
         *
         * The following fields are required:
         * ```java
         * .guardrails()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GuardrailListResponse]. */
    class Builder internal constructor() {

        private var guardrails: JsonField<MutableList<Guardrail>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(guardrailListResponse: GuardrailListResponse) = apply {
            guardrails = guardrailListResponse.guardrails.map { it.toMutableList() }
            additionalProperties = guardrailListResponse.additionalProperties.toMutableMap()
        }

        fun guardrails(guardrails: List<Guardrail>) = guardrails(JsonField.of(guardrails))

        /**
         * Sets [Builder.guardrails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guardrails] with a well-typed `List<Guardrail>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun guardrails(guardrails: JsonField<List<Guardrail>>) = apply {
            this.guardrails = guardrails.map { it.toMutableList() }
        }

        /**
         * Adds a single [Guardrail] to [guardrails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGuardrail(guardrail: Guardrail) = apply {
            guardrails =
                (guardrails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("guardrails", it).add(guardrail)
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
         * Returns an immutable instance of [GuardrailListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .guardrails()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GuardrailListResponse =
            GuardrailListResponse(
                checkRequired("guardrails", guardrails).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GuardrailListResponse = apply {
        if (validated) {
            return@apply
        }

        guardrails().forEach { it.validate() }
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
        (guardrails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Guardrail
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val guardrailName: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val guardrailDefinitionLocation: JsonField<GuardrailDefinitionLocation>,
        private val guardrailId: JsonField<String>,
        private val guardrailInfo: JsonField<GuardrailInfo>,
        private val litellmParams: JsonField<LitellmParams>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("guardrail_name")
            @ExcludeMissing
            guardrailName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("guardrail_definition_location")
            @ExcludeMissing
            guardrailDefinitionLocation: JsonField<GuardrailDefinitionLocation> = JsonMissing.of(),
            @JsonProperty("guardrail_id")
            @ExcludeMissing
            guardrailId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("guardrail_info")
            @ExcludeMissing
            guardrailInfo: JsonField<GuardrailInfo> = JsonMissing.of(),
            @JsonProperty("litellm_params")
            @ExcludeMissing
            litellmParams: JsonField<LitellmParams> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            guardrailName,
            createdAt,
            guardrailDefinitionLocation,
            guardrailId,
            guardrailInfo,
            litellmParams,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun guardrailName(): String = guardrailName.getRequired("guardrail_name")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun guardrailDefinitionLocation(): Optional<GuardrailDefinitionLocation> =
            guardrailDefinitionLocation.getOptional("guardrail_definition_location")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun guardrailId(): Optional<String> = guardrailId.getOptional("guardrail_id")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun guardrailInfo(): Optional<GuardrailInfo> = guardrailInfo.getOptional("guardrail_info")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun litellmParams(): Optional<LitellmParams> = litellmParams.getOptional("litellm_params")

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * Returns the raw JSON value of [guardrailName].
         *
         * Unlike [guardrailName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("guardrail_name")
        @ExcludeMissing
        fun _guardrailName(): JsonField<String> = guardrailName

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [guardrailDefinitionLocation].
         *
         * Unlike [guardrailDefinitionLocation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("guardrail_definition_location")
        @ExcludeMissing
        fun _guardrailDefinitionLocation(): JsonField<GuardrailDefinitionLocation> =
            guardrailDefinitionLocation

        /**
         * Returns the raw JSON value of [guardrailId].
         *
         * Unlike [guardrailId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("guardrail_id")
        @ExcludeMissing
        fun _guardrailId(): JsonField<String> = guardrailId

        /**
         * Returns the raw JSON value of [guardrailInfo].
         *
         * Unlike [guardrailInfo], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("guardrail_info")
        @ExcludeMissing
        fun _guardrailInfo(): JsonField<GuardrailInfo> = guardrailInfo

        /**
         * Returns the raw JSON value of [litellmParams].
         *
         * Unlike [litellmParams], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("litellm_params")
        @ExcludeMissing
        fun _litellmParams(): JsonField<LitellmParams> = litellmParams

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
             * Returns a mutable builder for constructing an instance of [Guardrail].
             *
             * The following fields are required:
             * ```java
             * .guardrailName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Guardrail]. */
        class Builder internal constructor() {

            private var guardrailName: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var guardrailDefinitionLocation: JsonField<GuardrailDefinitionLocation> =
                JsonMissing.of()
            private var guardrailId: JsonField<String> = JsonMissing.of()
            private var guardrailInfo: JsonField<GuardrailInfo> = JsonMissing.of()
            private var litellmParams: JsonField<LitellmParams> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(guardrail: Guardrail) = apply {
                guardrailName = guardrail.guardrailName
                createdAt = guardrail.createdAt
                guardrailDefinitionLocation = guardrail.guardrailDefinitionLocation
                guardrailId = guardrail.guardrailId
                guardrailInfo = guardrail.guardrailInfo
                litellmParams = guardrail.litellmParams
                updatedAt = guardrail.updatedAt
                additionalProperties = guardrail.additionalProperties.toMutableMap()
            }

            fun guardrailName(guardrailName: String) = guardrailName(JsonField.of(guardrailName))

            /**
             * Sets [Builder.guardrailName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrailName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guardrailName(guardrailName: JsonField<String>) = apply {
                this.guardrailName = guardrailName
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

            fun guardrailDefinitionLocation(
                guardrailDefinitionLocation: GuardrailDefinitionLocation
            ) = guardrailDefinitionLocation(JsonField.of(guardrailDefinitionLocation))

            /**
             * Sets [Builder.guardrailDefinitionLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrailDefinitionLocation] with a well-typed
             * [GuardrailDefinitionLocation] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun guardrailDefinitionLocation(
                guardrailDefinitionLocation: JsonField<GuardrailDefinitionLocation>
            ) = apply { this.guardrailDefinitionLocation = guardrailDefinitionLocation }

            fun guardrailId(guardrailId: String?) = guardrailId(JsonField.ofNullable(guardrailId))

            /** Alias for calling [Builder.guardrailId] with `guardrailId.orElse(null)`. */
            fun guardrailId(guardrailId: Optional<String>) = guardrailId(guardrailId.getOrNull())

            /**
             * Sets [Builder.guardrailId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrailId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guardrailId(guardrailId: JsonField<String>) = apply {
                this.guardrailId = guardrailId
            }

            fun guardrailInfo(guardrailInfo: GuardrailInfo?) =
                guardrailInfo(JsonField.ofNullable(guardrailInfo))

            /** Alias for calling [Builder.guardrailInfo] with `guardrailInfo.orElse(null)`. */
            fun guardrailInfo(guardrailInfo: Optional<GuardrailInfo>) =
                guardrailInfo(guardrailInfo.getOrNull())

            /**
             * Sets [Builder.guardrailInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrailInfo] with a well-typed [GuardrailInfo]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun guardrailInfo(guardrailInfo: JsonField<GuardrailInfo>) = apply {
                this.guardrailInfo = guardrailInfo
            }

            fun litellmParams(litellmParams: LitellmParams?) =
                litellmParams(JsonField.ofNullable(litellmParams))

            /** Alias for calling [Builder.litellmParams] with `litellmParams.orElse(null)`. */
            fun litellmParams(litellmParams: Optional<LitellmParams>) =
                litellmParams(litellmParams.getOrNull())

            /**
             * Sets [Builder.litellmParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.litellmParams] with a well-typed [LitellmParams]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun litellmParams(litellmParams: JsonField<LitellmParams>) = apply {
                this.litellmParams = litellmParams
            }

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
             * Returns an immutable instance of [Guardrail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .guardrailName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Guardrail =
                Guardrail(
                    checkRequired("guardrailName", guardrailName),
                    createdAt,
                    guardrailDefinitionLocation,
                    guardrailId,
                    guardrailInfo,
                    litellmParams,
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Guardrail = apply {
            if (validated) {
                return@apply
            }

            guardrailName()
            createdAt()
            guardrailDefinitionLocation().ifPresent { it.validate() }
            guardrailId()
            guardrailInfo().ifPresent { it.validate() }
            litellmParams().ifPresent { it.validate() }
            updatedAt()
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
            (if (guardrailName.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (guardrailDefinitionLocation.asKnown().getOrNull()?.validity() ?: 0) +
                (if (guardrailId.asKnown().isPresent) 1 else 0) +
                (guardrailInfo.asKnown().getOrNull()?.validity() ?: 0) +
                (litellmParams.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        class GuardrailDefinitionLocation
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

                @JvmField val DB = of("db")

                @JvmField val CONFIG = of("config")

                @JvmStatic fun of(value: String) = GuardrailDefinitionLocation(JsonField.of(value))
            }

            /** An enum containing [GuardrailDefinitionLocation]'s known values. */
            enum class Known {
                DB,
                CONFIG,
            }

            /**
             * An enum containing [GuardrailDefinitionLocation]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [GuardrailDefinitionLocation] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DB,
                CONFIG,
                /**
                 * An enum member indicating that [GuardrailDefinitionLocation] was instantiated
                 * with an unknown value.
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
                    DB -> Value.DB
                    CONFIG -> Value.CONFIG
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
                    DB -> Known.DB
                    CONFIG -> Known.CONFIG
                    else ->
                        throw HanzoInvalidDataException(
                            "Unknown GuardrailDefinitionLocation: $value"
                        )
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

            fun validate(): GuardrailDefinitionLocation = apply {
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

                return other is GuardrailDefinitionLocation && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class GuardrailInfo
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

                /** Returns a mutable builder for constructing an instance of [GuardrailInfo]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GuardrailInfo]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(guardrailInfo: GuardrailInfo) = apply {
                    additionalProperties = guardrailInfo.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [GuardrailInfo].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): GuardrailInfo = GuardrailInfo(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): GuardrailInfo = apply {
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

                return other is GuardrailInfo && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "GuardrailInfo{additionalProperties=$additionalProperties}"
        }

        class LitellmParams
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val additionalProviderSpecificParams:
                JsonField<AdditionalProviderSpecificParams>,
            private val apiBase: JsonField<String>,
            private val apiEndpoint: JsonField<String>,
            private val apiKey: JsonField<String>,
            private val categoryThresholds: JsonField<CategoryThresholds>,
            private val credentials: JsonField<String>,
            private val defaultOn: JsonField<Boolean>,
            private val detectSecretsConfig: JsonField<DetectSecretsConfig>,
            private val experimentalUseLatestRoleMessageOnly: JsonField<Boolean>,
            private val failOnError: JsonField<Boolean>,
            private val guardName: JsonField<String>,
            private val location: JsonField<String>,
            private val maskRequestContent: JsonField<Boolean>,
            private val maskResponseContent: JsonField<Boolean>,
            private val model: JsonField<String>,
            private val pangeaInputRecipe: JsonField<String>,
            private val pangeaOutputRecipe: JsonField<String>,
            private val templateId: JsonField<String>,
            private val violationMessageTemplate: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("additional_provider_specific_params")
                @ExcludeMissing
                additionalProviderSpecificParams: JsonField<AdditionalProviderSpecificParams> =
                    JsonMissing.of(),
                @JsonProperty("api_base")
                @ExcludeMissing
                apiBase: JsonField<String> = JsonMissing.of(),
                @JsonProperty("api_endpoint")
                @ExcludeMissing
                apiEndpoint: JsonField<String> = JsonMissing.of(),
                @JsonProperty("api_key")
                @ExcludeMissing
                apiKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("category_thresholds")
                @ExcludeMissing
                categoryThresholds: JsonField<CategoryThresholds> = JsonMissing.of(),
                @JsonProperty("credentials")
                @ExcludeMissing
                credentials: JsonField<String> = JsonMissing.of(),
                @JsonProperty("default_on")
                @ExcludeMissing
                defaultOn: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("detect_secrets_config")
                @ExcludeMissing
                detectSecretsConfig: JsonField<DetectSecretsConfig> = JsonMissing.of(),
                @JsonProperty("experimental_use_latest_role_message_only")
                @ExcludeMissing
                experimentalUseLatestRoleMessageOnly: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("fail_on_error")
                @ExcludeMissing
                failOnError: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("guard_name")
                @ExcludeMissing
                guardName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("location")
                @ExcludeMissing
                location: JsonField<String> = JsonMissing.of(),
                @JsonProperty("mask_request_content")
                @ExcludeMissing
                maskRequestContent: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mask_response_content")
                @ExcludeMissing
                maskResponseContent: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pangea_input_recipe")
                @ExcludeMissing
                pangeaInputRecipe: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pangea_output_recipe")
                @ExcludeMissing
                pangeaOutputRecipe: JsonField<String> = JsonMissing.of(),
                @JsonProperty("template_id")
                @ExcludeMissing
                templateId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("violation_message_template")
                @ExcludeMissing
                violationMessageTemplate: JsonField<String> = JsonMissing.of(),
            ) : this(
                additionalProviderSpecificParams,
                apiBase,
                apiEndpoint,
                apiKey,
                categoryThresholds,
                credentials,
                defaultOn,
                detectSecretsConfig,
                experimentalUseLatestRoleMessageOnly,
                failOnError,
                guardName,
                location,
                maskRequestContent,
                maskResponseContent,
                model,
                pangeaInputRecipe,
                pangeaOutputRecipe,
                templateId,
                violationMessageTemplate,
                mutableMapOf(),
            )

            /**
             * Additional provider-specific parameters for generic guardrail APIs
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun additionalProviderSpecificParams(): Optional<AdditionalProviderSpecificParams> =
                additionalProviderSpecificParams.getOptional("additional_provider_specific_params")

            /**
             * Base URL for the guardrail service API
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun apiBase(): Optional<String> = apiBase.getOptional("api_base")

            /**
             * Optional custom API endpoint for Model Armor
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun apiEndpoint(): Optional<String> = apiEndpoint.getOptional("api_endpoint")

            /**
             * API key for the guardrail service
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun apiKey(): Optional<String> = apiKey.getOptional("api_key")

            /**
             * Threshold configuration for Lakera guardrail categories
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun categoryThresholds(): Optional<CategoryThresholds> =
                categoryThresholds.getOptional("category_thresholds")

            /**
             * Path to Google Cloud credentials JSON file or JSON string
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun credentials(): Optional<String> = credentials.getOptional("credentials")

            /**
             * Whether the guardrail is enabled by default
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun defaultOn(): Optional<Boolean> = defaultOn.getOptional("default_on")

            /**
             * Configuration for detect-secrets guardrail
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun detectSecretsConfig(): Optional<DetectSecretsConfig> =
                detectSecretsConfig.getOptional("detect_secrets_config")

            /**
             * When True, guardrails only receive the latest message for the relevant role (e.g.,
             * newest user input pre-call, newest assistant output post-call)
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun experimentalUseLatestRoleMessageOnly(): Optional<Boolean> =
                experimentalUseLatestRoleMessageOnly.getOptional(
                    "experimental_use_latest_role_message_only"
                )

            /**
             * Whether to fail the request if Model Armor encounters an error
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun failOnError(): Optional<Boolean> = failOnError.getOptional("fail_on_error")

            /**
             * Name of the guardrail in guardrails.ai
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun guardName(): Optional<String> = guardName.getOptional("guard_name")

            /**
             * Google Cloud location/region (e.g., us-central1)
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun location(): Optional<String> = location.getOptional("location")

            /**
             * Will mask request content if guardrail makes any changes
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maskRequestContent(): Optional<Boolean> =
                maskRequestContent.getOptional("mask_request_content")

            /**
             * Will mask response content if guardrail makes any changes
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maskResponseContent(): Optional<Boolean> =
                maskResponseContent.getOptional("mask_response_content")

            /**
             * Optional field if guardrail requires a 'model' parameter
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun model(): Optional<String> = model.getOptional("model")

            /**
             * Recipe for input (LLM request)
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pangeaInputRecipe(): Optional<String> =
                pangeaInputRecipe.getOptional("pangea_input_recipe")

            /**
             * Recipe for output (LLM response)
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pangeaOutputRecipe(): Optional<String> =
                pangeaOutputRecipe.getOptional("pangea_output_recipe")

            /**
             * The ID of your Model Armor template
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun templateId(): Optional<String> = templateId.getOptional("template_id")

            /**
             * Custom message when a guardrail blocks an action. Supports placeholders like
             * {tool_name}, {rule_id}, and {default_message}.
             *
             * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun violationMessageTemplate(): Optional<String> =
                violationMessageTemplate.getOptional("violation_message_template")

            /**
             * Returns the raw JSON value of [additionalProviderSpecificParams].
             *
             * Unlike [additionalProviderSpecificParams], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("additional_provider_specific_params")
            @ExcludeMissing
            fun _additionalProviderSpecificParams(): JsonField<AdditionalProviderSpecificParams> =
                additionalProviderSpecificParams

            /**
             * Returns the raw JSON value of [apiBase].
             *
             * Unlike [apiBase], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("api_base") @ExcludeMissing fun _apiBase(): JsonField<String> = apiBase

            /**
             * Returns the raw JSON value of [apiEndpoint].
             *
             * Unlike [apiEndpoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("api_endpoint")
            @ExcludeMissing
            fun _apiEndpoint(): JsonField<String> = apiEndpoint

            /**
             * Returns the raw JSON value of [apiKey].
             *
             * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

            /**
             * Returns the raw JSON value of [categoryThresholds].
             *
             * Unlike [categoryThresholds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("category_thresholds")
            @ExcludeMissing
            fun _categoryThresholds(): JsonField<CategoryThresholds> = categoryThresholds

            /**
             * Returns the raw JSON value of [credentials].
             *
             * Unlike [credentials], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credentials")
            @ExcludeMissing
            fun _credentials(): JsonField<String> = credentials

            /**
             * Returns the raw JSON value of [defaultOn].
             *
             * Unlike [defaultOn], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("default_on")
            @ExcludeMissing
            fun _defaultOn(): JsonField<Boolean> = defaultOn

            /**
             * Returns the raw JSON value of [detectSecretsConfig].
             *
             * Unlike [detectSecretsConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("detect_secrets_config")
            @ExcludeMissing
            fun _detectSecretsConfig(): JsonField<DetectSecretsConfig> = detectSecretsConfig

            /**
             * Returns the raw JSON value of [experimentalUseLatestRoleMessageOnly].
             *
             * Unlike [experimentalUseLatestRoleMessageOnly], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("experimental_use_latest_role_message_only")
            @ExcludeMissing
            fun _experimentalUseLatestRoleMessageOnly(): JsonField<Boolean> =
                experimentalUseLatestRoleMessageOnly

            /**
             * Returns the raw JSON value of [failOnError].
             *
             * Unlike [failOnError], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fail_on_error")
            @ExcludeMissing
            fun _failOnError(): JsonField<Boolean> = failOnError

            /**
             * Returns the raw JSON value of [guardName].
             *
             * Unlike [guardName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("guard_name")
            @ExcludeMissing
            fun _guardName(): JsonField<String> = guardName

            /**
             * Returns the raw JSON value of [location].
             *
             * Unlike [location], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

            /**
             * Returns the raw JSON value of [maskRequestContent].
             *
             * Unlike [maskRequestContent], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mask_request_content")
            @ExcludeMissing
            fun _maskRequestContent(): JsonField<Boolean> = maskRequestContent

            /**
             * Returns the raw JSON value of [maskResponseContent].
             *
             * Unlike [maskResponseContent], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mask_response_content")
            @ExcludeMissing
            fun _maskResponseContent(): JsonField<Boolean> = maskResponseContent

            /**
             * Returns the raw JSON value of [model].
             *
             * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

            /**
             * Returns the raw JSON value of [pangeaInputRecipe].
             *
             * Unlike [pangeaInputRecipe], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pangea_input_recipe")
            @ExcludeMissing
            fun _pangeaInputRecipe(): JsonField<String> = pangeaInputRecipe

            /**
             * Returns the raw JSON value of [pangeaOutputRecipe].
             *
             * Unlike [pangeaOutputRecipe], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pangea_output_recipe")
            @ExcludeMissing
            fun _pangeaOutputRecipe(): JsonField<String> = pangeaOutputRecipe

            /**
             * Returns the raw JSON value of [templateId].
             *
             * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("template_id")
            @ExcludeMissing
            fun _templateId(): JsonField<String> = templateId

            /**
             * Returns the raw JSON value of [violationMessageTemplate].
             *
             * Unlike [violationMessageTemplate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("violation_message_template")
            @ExcludeMissing
            fun _violationMessageTemplate(): JsonField<String> = violationMessageTemplate

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

                /** Returns a mutable builder for constructing an instance of [LitellmParams]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LitellmParams]. */
            class Builder internal constructor() {

                private var additionalProviderSpecificParams:
                    JsonField<AdditionalProviderSpecificParams> =
                    JsonMissing.of()
                private var apiBase: JsonField<String> = JsonMissing.of()
                private var apiEndpoint: JsonField<String> = JsonMissing.of()
                private var apiKey: JsonField<String> = JsonMissing.of()
                private var categoryThresholds: JsonField<CategoryThresholds> = JsonMissing.of()
                private var credentials: JsonField<String> = JsonMissing.of()
                private var defaultOn: JsonField<Boolean> = JsonMissing.of()
                private var detectSecretsConfig: JsonField<DetectSecretsConfig> = JsonMissing.of()
                private var experimentalUseLatestRoleMessageOnly: JsonField<Boolean> =
                    JsonMissing.of()
                private var failOnError: JsonField<Boolean> = JsonMissing.of()
                private var guardName: JsonField<String> = JsonMissing.of()
                private var location: JsonField<String> = JsonMissing.of()
                private var maskRequestContent: JsonField<Boolean> = JsonMissing.of()
                private var maskResponseContent: JsonField<Boolean> = JsonMissing.of()
                private var model: JsonField<String> = JsonMissing.of()
                private var pangeaInputRecipe: JsonField<String> = JsonMissing.of()
                private var pangeaOutputRecipe: JsonField<String> = JsonMissing.of()
                private var templateId: JsonField<String> = JsonMissing.of()
                private var violationMessageTemplate: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(litellmParams: LitellmParams) = apply {
                    additionalProviderSpecificParams =
                        litellmParams.additionalProviderSpecificParams
                    apiBase = litellmParams.apiBase
                    apiEndpoint = litellmParams.apiEndpoint
                    apiKey = litellmParams.apiKey
                    categoryThresholds = litellmParams.categoryThresholds
                    credentials = litellmParams.credentials
                    defaultOn = litellmParams.defaultOn
                    detectSecretsConfig = litellmParams.detectSecretsConfig
                    experimentalUseLatestRoleMessageOnly =
                        litellmParams.experimentalUseLatestRoleMessageOnly
                    failOnError = litellmParams.failOnError
                    guardName = litellmParams.guardName
                    location = litellmParams.location
                    maskRequestContent = litellmParams.maskRequestContent
                    maskResponseContent = litellmParams.maskResponseContent
                    model = litellmParams.model
                    pangeaInputRecipe = litellmParams.pangeaInputRecipe
                    pangeaOutputRecipe = litellmParams.pangeaOutputRecipe
                    templateId = litellmParams.templateId
                    violationMessageTemplate = litellmParams.violationMessageTemplate
                    additionalProperties = litellmParams.additionalProperties.toMutableMap()
                }

                /** Additional provider-specific parameters for generic guardrail APIs */
                fun additionalProviderSpecificParams(
                    additionalProviderSpecificParams: AdditionalProviderSpecificParams?
                ) =
                    additionalProviderSpecificParams(
                        JsonField.ofNullable(additionalProviderSpecificParams)
                    )

                /**
                 * Alias for calling [Builder.additionalProviderSpecificParams] with
                 * `additionalProviderSpecificParams.orElse(null)`.
                 */
                fun additionalProviderSpecificParams(
                    additionalProviderSpecificParams: Optional<AdditionalProviderSpecificParams>
                ) = additionalProviderSpecificParams(additionalProviderSpecificParams.getOrNull())

                /**
                 * Sets [Builder.additionalProviderSpecificParams] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.additionalProviderSpecificParams] with a
                 * well-typed [AdditionalProviderSpecificParams] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun additionalProviderSpecificParams(
                    additionalProviderSpecificParams: JsonField<AdditionalProviderSpecificParams>
                ) = apply {
                    this.additionalProviderSpecificParams = additionalProviderSpecificParams
                }

                /** Base URL for the guardrail service API */
                fun apiBase(apiBase: String?) = apiBase(JsonField.ofNullable(apiBase))

                /** Alias for calling [Builder.apiBase] with `apiBase.orElse(null)`. */
                fun apiBase(apiBase: Optional<String>) = apiBase(apiBase.getOrNull())

                /**
                 * Sets [Builder.apiBase] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.apiBase] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun apiBase(apiBase: JsonField<String>) = apply { this.apiBase = apiBase }

                /** Optional custom API endpoint for Model Armor */
                fun apiEndpoint(apiEndpoint: String?) =
                    apiEndpoint(JsonField.ofNullable(apiEndpoint))

                /** Alias for calling [Builder.apiEndpoint] with `apiEndpoint.orElse(null)`. */
                fun apiEndpoint(apiEndpoint: Optional<String>) =
                    apiEndpoint(apiEndpoint.getOrNull())

                /**
                 * Sets [Builder.apiEndpoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.apiEndpoint] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun apiEndpoint(apiEndpoint: JsonField<String>) = apply {
                    this.apiEndpoint = apiEndpoint
                }

                /** API key for the guardrail service */
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

                /** Threshold configuration for Lakera guardrail categories */
                fun categoryThresholds(categoryThresholds: CategoryThresholds?) =
                    categoryThresholds(JsonField.ofNullable(categoryThresholds))

                /**
                 * Alias for calling [Builder.categoryThresholds] with
                 * `categoryThresholds.orElse(null)`.
                 */
                fun categoryThresholds(categoryThresholds: Optional<CategoryThresholds>) =
                    categoryThresholds(categoryThresholds.getOrNull())

                /**
                 * Sets [Builder.categoryThresholds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.categoryThresholds] with a well-typed
                 * [CategoryThresholds] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun categoryThresholds(categoryThresholds: JsonField<CategoryThresholds>) = apply {
                    this.categoryThresholds = categoryThresholds
                }

                /** Path to Google Cloud credentials JSON file or JSON string */
                fun credentials(credentials: String?) =
                    credentials(JsonField.ofNullable(credentials))

                /** Alias for calling [Builder.credentials] with `credentials.orElse(null)`. */
                fun credentials(credentials: Optional<String>) =
                    credentials(credentials.getOrNull())

                /**
                 * Sets [Builder.credentials] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.credentials] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun credentials(credentials: JsonField<String>) = apply {
                    this.credentials = credentials
                }

                /** Whether the guardrail is enabled by default */
                fun defaultOn(defaultOn: Boolean?) = defaultOn(JsonField.ofNullable(defaultOn))

                /**
                 * Alias for [Builder.defaultOn].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun defaultOn(defaultOn: Boolean) = defaultOn(defaultOn as Boolean?)

                /** Alias for calling [Builder.defaultOn] with `defaultOn.orElse(null)`. */
                fun defaultOn(defaultOn: Optional<Boolean>) = defaultOn(defaultOn.getOrNull())

                /**
                 * Sets [Builder.defaultOn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.defaultOn] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun defaultOn(defaultOn: JsonField<Boolean>) = apply { this.defaultOn = defaultOn }

                /** Configuration for detect-secrets guardrail */
                fun detectSecretsConfig(detectSecretsConfig: DetectSecretsConfig?) =
                    detectSecretsConfig(JsonField.ofNullable(detectSecretsConfig))

                /**
                 * Alias for calling [Builder.detectSecretsConfig] with
                 * `detectSecretsConfig.orElse(null)`.
                 */
                fun detectSecretsConfig(detectSecretsConfig: Optional<DetectSecretsConfig>) =
                    detectSecretsConfig(detectSecretsConfig.getOrNull())

                /**
                 * Sets [Builder.detectSecretsConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.detectSecretsConfig] with a well-typed
                 * [DetectSecretsConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun detectSecretsConfig(detectSecretsConfig: JsonField<DetectSecretsConfig>) =
                    apply {
                        this.detectSecretsConfig = detectSecretsConfig
                    }

                /**
                 * When True, guardrails only receive the latest message for the relevant role
                 * (e.g., newest user input pre-call, newest assistant output post-call)
                 */
                fun experimentalUseLatestRoleMessageOnly(
                    experimentalUseLatestRoleMessageOnly: Boolean?
                ) =
                    experimentalUseLatestRoleMessageOnly(
                        JsonField.ofNullable(experimentalUseLatestRoleMessageOnly)
                    )

                /**
                 * Alias for [Builder.experimentalUseLatestRoleMessageOnly].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun experimentalUseLatestRoleMessageOnly(
                    experimentalUseLatestRoleMessageOnly: Boolean
                ) =
                    experimentalUseLatestRoleMessageOnly(
                        experimentalUseLatestRoleMessageOnly as Boolean?
                    )

                /**
                 * Alias for calling [Builder.experimentalUseLatestRoleMessageOnly] with
                 * `experimentalUseLatestRoleMessageOnly.orElse(null)`.
                 */
                fun experimentalUseLatestRoleMessageOnly(
                    experimentalUseLatestRoleMessageOnly: Optional<Boolean>
                ) =
                    experimentalUseLatestRoleMessageOnly(
                        experimentalUseLatestRoleMessageOnly.getOrNull()
                    )

                /**
                 * Sets [Builder.experimentalUseLatestRoleMessageOnly] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.experimentalUseLatestRoleMessageOnly] with a
                 * well-typed [Boolean] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun experimentalUseLatestRoleMessageOnly(
                    experimentalUseLatestRoleMessageOnly: JsonField<Boolean>
                ) = apply {
                    this.experimentalUseLatestRoleMessageOnly = experimentalUseLatestRoleMessageOnly
                }

                /** Whether to fail the request if Model Armor encounters an error */
                fun failOnError(failOnError: Boolean?) =
                    failOnError(JsonField.ofNullable(failOnError))

                /**
                 * Alias for [Builder.failOnError].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun failOnError(failOnError: Boolean) = failOnError(failOnError as Boolean?)

                /** Alias for calling [Builder.failOnError] with `failOnError.orElse(null)`. */
                fun failOnError(failOnError: Optional<Boolean>) =
                    failOnError(failOnError.getOrNull())

                /**
                 * Sets [Builder.failOnError] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.failOnError] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun failOnError(failOnError: JsonField<Boolean>) = apply {
                    this.failOnError = failOnError
                }

                /** Name of the guardrail in guardrails.ai */
                fun guardName(guardName: String?) = guardName(JsonField.ofNullable(guardName))

                /** Alias for calling [Builder.guardName] with `guardName.orElse(null)`. */
                fun guardName(guardName: Optional<String>) = guardName(guardName.getOrNull())

                /**
                 * Sets [Builder.guardName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.guardName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun guardName(guardName: JsonField<String>) = apply { this.guardName = guardName }

                /** Google Cloud location/region (e.g., us-central1) */
                fun location(location: String?) = location(JsonField.ofNullable(location))

                /** Alias for calling [Builder.location] with `location.orElse(null)`. */
                fun location(location: Optional<String>) = location(location.getOrNull())

                /**
                 * Sets [Builder.location] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.location] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun location(location: JsonField<String>) = apply { this.location = location }

                /** Will mask request content if guardrail makes any changes */
                fun maskRequestContent(maskRequestContent: Boolean?) =
                    maskRequestContent(JsonField.ofNullable(maskRequestContent))

                /**
                 * Alias for [Builder.maskRequestContent].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maskRequestContent(maskRequestContent: Boolean) =
                    maskRequestContent(maskRequestContent as Boolean?)

                /**
                 * Alias for calling [Builder.maskRequestContent] with
                 * `maskRequestContent.orElse(null)`.
                 */
                fun maskRequestContent(maskRequestContent: Optional<Boolean>) =
                    maskRequestContent(maskRequestContent.getOrNull())

                /**
                 * Sets [Builder.maskRequestContent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maskRequestContent] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maskRequestContent(maskRequestContent: JsonField<Boolean>) = apply {
                    this.maskRequestContent = maskRequestContent
                }

                /** Will mask response content if guardrail makes any changes */
                fun maskResponseContent(maskResponseContent: Boolean?) =
                    maskResponseContent(JsonField.ofNullable(maskResponseContent))

                /**
                 * Alias for [Builder.maskResponseContent].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun maskResponseContent(maskResponseContent: Boolean) =
                    maskResponseContent(maskResponseContent as Boolean?)

                /**
                 * Alias for calling [Builder.maskResponseContent] with
                 * `maskResponseContent.orElse(null)`.
                 */
                fun maskResponseContent(maskResponseContent: Optional<Boolean>) =
                    maskResponseContent(maskResponseContent.getOrNull())

                /**
                 * Sets [Builder.maskResponseContent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maskResponseContent] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maskResponseContent(maskResponseContent: JsonField<Boolean>) = apply {
                    this.maskResponseContent = maskResponseContent
                }

                /** Optional field if guardrail requires a 'model' parameter */
                fun model(model: String?) = model(JsonField.ofNullable(model))

                /** Alias for calling [Builder.model] with `model.orElse(null)`. */
                fun model(model: Optional<String>) = model(model.getOrNull())

                /**
                 * Sets [Builder.model] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.model] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun model(model: JsonField<String>) = apply { this.model = model }

                /** Recipe for input (LLM request) */
                fun pangeaInputRecipe(pangeaInputRecipe: String?) =
                    pangeaInputRecipe(JsonField.ofNullable(pangeaInputRecipe))

                /**
                 * Alias for calling [Builder.pangeaInputRecipe] with
                 * `pangeaInputRecipe.orElse(null)`.
                 */
                fun pangeaInputRecipe(pangeaInputRecipe: Optional<String>) =
                    pangeaInputRecipe(pangeaInputRecipe.getOrNull())

                /**
                 * Sets [Builder.pangeaInputRecipe] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pangeaInputRecipe] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pangeaInputRecipe(pangeaInputRecipe: JsonField<String>) = apply {
                    this.pangeaInputRecipe = pangeaInputRecipe
                }

                /** Recipe for output (LLM response) */
                fun pangeaOutputRecipe(pangeaOutputRecipe: String?) =
                    pangeaOutputRecipe(JsonField.ofNullable(pangeaOutputRecipe))

                /**
                 * Alias for calling [Builder.pangeaOutputRecipe] with
                 * `pangeaOutputRecipe.orElse(null)`.
                 */
                fun pangeaOutputRecipe(pangeaOutputRecipe: Optional<String>) =
                    pangeaOutputRecipe(pangeaOutputRecipe.getOrNull())

                /**
                 * Sets [Builder.pangeaOutputRecipe] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pangeaOutputRecipe] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pangeaOutputRecipe(pangeaOutputRecipe: JsonField<String>) = apply {
                    this.pangeaOutputRecipe = pangeaOutputRecipe
                }

                /** The ID of your Model Armor template */
                fun templateId(templateId: String?) = templateId(JsonField.ofNullable(templateId))

                /** Alias for calling [Builder.templateId] with `templateId.orElse(null)`. */
                fun templateId(templateId: Optional<String>) = templateId(templateId.getOrNull())

                /**
                 * Sets [Builder.templateId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.templateId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun templateId(templateId: JsonField<String>) = apply {
                    this.templateId = templateId
                }

                /**
                 * Custom message when a guardrail blocks an action. Supports placeholders like
                 * {tool_name}, {rule_id}, and {default_message}.
                 */
                fun violationMessageTemplate(violationMessageTemplate: String?) =
                    violationMessageTemplate(JsonField.ofNullable(violationMessageTemplate))

                /**
                 * Alias for calling [Builder.violationMessageTemplate] with
                 * `violationMessageTemplate.orElse(null)`.
                 */
                fun violationMessageTemplate(violationMessageTemplate: Optional<String>) =
                    violationMessageTemplate(violationMessageTemplate.getOrNull())

                /**
                 * Sets [Builder.violationMessageTemplate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.violationMessageTemplate] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun violationMessageTemplate(violationMessageTemplate: JsonField<String>) = apply {
                    this.violationMessageTemplate = violationMessageTemplate
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
                 * Returns an immutable instance of [LitellmParams].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LitellmParams =
                    LitellmParams(
                        additionalProviderSpecificParams,
                        apiBase,
                        apiEndpoint,
                        apiKey,
                        categoryThresholds,
                        credentials,
                        defaultOn,
                        detectSecretsConfig,
                        experimentalUseLatestRoleMessageOnly,
                        failOnError,
                        guardName,
                        location,
                        maskRequestContent,
                        maskResponseContent,
                        model,
                        pangeaInputRecipe,
                        pangeaOutputRecipe,
                        templateId,
                        violationMessageTemplate,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LitellmParams = apply {
                if (validated) {
                    return@apply
                }

                additionalProviderSpecificParams().ifPresent { it.validate() }
                apiBase()
                apiEndpoint()
                apiKey()
                categoryThresholds().ifPresent { it.validate() }
                credentials()
                defaultOn()
                detectSecretsConfig().ifPresent { it.validate() }
                experimentalUseLatestRoleMessageOnly()
                failOnError()
                guardName()
                location()
                maskRequestContent()
                maskResponseContent()
                model()
                pangeaInputRecipe()
                pangeaOutputRecipe()
                templateId()
                violationMessageTemplate()
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
                (additionalProviderSpecificParams.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (apiBase.asKnown().isPresent) 1 else 0) +
                    (if (apiEndpoint.asKnown().isPresent) 1 else 0) +
                    (if (apiKey.asKnown().isPresent) 1 else 0) +
                    (categoryThresholds.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (credentials.asKnown().isPresent) 1 else 0) +
                    (if (defaultOn.asKnown().isPresent) 1 else 0) +
                    (detectSecretsConfig.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (experimentalUseLatestRoleMessageOnly.asKnown().isPresent) 1 else 0) +
                    (if (failOnError.asKnown().isPresent) 1 else 0) +
                    (if (guardName.asKnown().isPresent) 1 else 0) +
                    (if (location.asKnown().isPresent) 1 else 0) +
                    (if (maskRequestContent.asKnown().isPresent) 1 else 0) +
                    (if (maskResponseContent.asKnown().isPresent) 1 else 0) +
                    (if (model.asKnown().isPresent) 1 else 0) +
                    (if (pangeaInputRecipe.asKnown().isPresent) 1 else 0) +
                    (if (pangeaOutputRecipe.asKnown().isPresent) 1 else 0) +
                    (if (templateId.asKnown().isPresent) 1 else 0) +
                    (if (violationMessageTemplate.asKnown().isPresent) 1 else 0)

            /** Additional provider-specific parameters for generic guardrail APIs */
            class AdditionalProviderSpecificParams
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
                     * [AdditionalProviderSpecificParams].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AdditionalProviderSpecificParams]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        additionalProviderSpecificParams: AdditionalProviderSpecificParams
                    ) = apply {
                        additionalProperties =
                            additionalProviderSpecificParams.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [AdditionalProviderSpecificParams].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): AdditionalProviderSpecificParams =
                        AdditionalProviderSpecificParams(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): AdditionalProviderSpecificParams = apply {
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

                    return other is AdditionalProviderSpecificParams &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AdditionalProviderSpecificParams{additionalProperties=$additionalProperties}"
            }

            /** Threshold configuration for Lakera guardrail categories */
            class CategoryThresholds
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val jailbreak: JsonField<Double>,
                private val promptInjection: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("jailbreak")
                    @ExcludeMissing
                    jailbreak: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("prompt_injection")
                    @ExcludeMissing
                    promptInjection: JsonField<Double> = JsonMissing.of(),
                ) : this(jailbreak, promptInjection, mutableMapOf())

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun jailbreak(): Optional<Double> = jailbreak.getOptional("jailbreak")

                /**
                 * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun promptInjection(): Optional<Double> =
                    promptInjection.getOptional("prompt_injection")

                /**
                 * Returns the raw JSON value of [jailbreak].
                 *
                 * Unlike [jailbreak], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("jailbreak")
                @ExcludeMissing
                fun _jailbreak(): JsonField<Double> = jailbreak

                /**
                 * Returns the raw JSON value of [promptInjection].
                 *
                 * Unlike [promptInjection], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("prompt_injection")
                @ExcludeMissing
                fun _promptInjection(): JsonField<Double> = promptInjection

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
                     * [CategoryThresholds].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CategoryThresholds]. */
                class Builder internal constructor() {

                    private var jailbreak: JsonField<Double> = JsonMissing.of()
                    private var promptInjection: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(categoryThresholds: CategoryThresholds) = apply {
                        jailbreak = categoryThresholds.jailbreak
                        promptInjection = categoryThresholds.promptInjection
                        additionalProperties =
                            categoryThresholds.additionalProperties.toMutableMap()
                    }

                    fun jailbreak(jailbreak: Double) = jailbreak(JsonField.of(jailbreak))

                    /**
                     * Sets [Builder.jailbreak] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.jailbreak] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun jailbreak(jailbreak: JsonField<Double>) = apply {
                        this.jailbreak = jailbreak
                    }

                    fun promptInjection(promptInjection: Double) =
                        promptInjection(JsonField.of(promptInjection))

                    /**
                     * Sets [Builder.promptInjection] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.promptInjection] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun promptInjection(promptInjection: JsonField<Double>) = apply {
                        this.promptInjection = promptInjection
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
                     * Returns an immutable instance of [CategoryThresholds].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CategoryThresholds =
                        CategoryThresholds(
                            jailbreak,
                            promptInjection,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CategoryThresholds = apply {
                    if (validated) {
                        return@apply
                    }

                    jailbreak()
                    promptInjection()
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
                    (if (jailbreak.asKnown().isPresent) 1 else 0) +
                        (if (promptInjection.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CategoryThresholds &&
                        jailbreak == other.jailbreak &&
                        promptInjection == other.promptInjection &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(jailbreak, promptInjection, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CategoryThresholds{jailbreak=$jailbreak, promptInjection=$promptInjection, additionalProperties=$additionalProperties}"
            }

            /** Configuration for detect-secrets guardrail */
            class DetectSecretsConfig
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
                     * [DetectSecretsConfig].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [DetectSecretsConfig]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(detectSecretsConfig: DetectSecretsConfig) = apply {
                        additionalProperties =
                            detectSecretsConfig.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [DetectSecretsConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): DetectSecretsConfig =
                        DetectSecretsConfig(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): DetectSecretsConfig = apply {
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

                    return other is DetectSecretsConfig &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DetectSecretsConfig{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LitellmParams &&
                    additionalProviderSpecificParams == other.additionalProviderSpecificParams &&
                    apiBase == other.apiBase &&
                    apiEndpoint == other.apiEndpoint &&
                    apiKey == other.apiKey &&
                    categoryThresholds == other.categoryThresholds &&
                    credentials == other.credentials &&
                    defaultOn == other.defaultOn &&
                    detectSecretsConfig == other.detectSecretsConfig &&
                    experimentalUseLatestRoleMessageOnly ==
                        other.experimentalUseLatestRoleMessageOnly &&
                    failOnError == other.failOnError &&
                    guardName == other.guardName &&
                    location == other.location &&
                    maskRequestContent == other.maskRequestContent &&
                    maskResponseContent == other.maskResponseContent &&
                    model == other.model &&
                    pangeaInputRecipe == other.pangeaInputRecipe &&
                    pangeaOutputRecipe == other.pangeaOutputRecipe &&
                    templateId == other.templateId &&
                    violationMessageTemplate == other.violationMessageTemplate &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    additionalProviderSpecificParams,
                    apiBase,
                    apiEndpoint,
                    apiKey,
                    categoryThresholds,
                    credentials,
                    defaultOn,
                    detectSecretsConfig,
                    experimentalUseLatestRoleMessageOnly,
                    failOnError,
                    guardName,
                    location,
                    maskRequestContent,
                    maskResponseContent,
                    model,
                    pangeaInputRecipe,
                    pangeaOutputRecipe,
                    templateId,
                    violationMessageTemplate,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LitellmParams{additionalProviderSpecificParams=$additionalProviderSpecificParams, apiBase=$apiBase, apiEndpoint=$apiEndpoint, apiKey=$apiKey, categoryThresholds=$categoryThresholds, credentials=$credentials, defaultOn=$defaultOn, detectSecretsConfig=$detectSecretsConfig, experimentalUseLatestRoleMessageOnly=$experimentalUseLatestRoleMessageOnly, failOnError=$failOnError, guardName=$guardName, location=$location, maskRequestContent=$maskRequestContent, maskResponseContent=$maskResponseContent, model=$model, pangeaInputRecipe=$pangeaInputRecipe, pangeaOutputRecipe=$pangeaOutputRecipe, templateId=$templateId, violationMessageTemplate=$violationMessageTemplate, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Guardrail &&
                guardrailName == other.guardrailName &&
                createdAt == other.createdAt &&
                guardrailDefinitionLocation == other.guardrailDefinitionLocation &&
                guardrailId == other.guardrailId &&
                guardrailInfo == other.guardrailInfo &&
                litellmParams == other.litellmParams &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                guardrailName,
                createdAt,
                guardrailDefinitionLocation,
                guardrailId,
                guardrailInfo,
                litellmParams,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Guardrail{guardrailName=$guardrailName, createdAt=$createdAt, guardrailDefinitionLocation=$guardrailDefinitionLocation, guardrailId=$guardrailId, guardrailInfo=$guardrailInfo, litellmParams=$litellmParams, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GuardrailListResponse &&
            guardrails == other.guardrails &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(guardrails, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GuardrailListResponse{guardrails=$guardrails, additionalProperties=$additionalProperties}"
}
