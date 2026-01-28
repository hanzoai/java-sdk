// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.budget

import ai.hanzo.api.core.ExcludeMissing
import ai.hanzo.api.core.JsonField
import ai.hanzo.api.core.JsonMissing
import ai.hanzo.api.core.JsonValue
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

class BudgetNew
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val budgetDuration: JsonField<String>,
    private val budgetId: JsonField<String>,
    private val budgetResetAt: JsonField<OffsetDateTime>,
    private val maxBudget: JsonField<Double>,
    private val maxParallelRequests: JsonField<Long>,
    private val modelMaxBudget: JsonField<ModelMaxBudget>,
    private val rpmLimit: JsonField<Long>,
    private val softBudget: JsonField<Double>,
    private val tpmLimit: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("budget_duration")
        @ExcludeMissing
        budgetDuration: JsonField<String> = JsonMissing.of(),
        @JsonProperty("budget_id") @ExcludeMissing budgetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("budget_reset_at")
        @ExcludeMissing
        budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("max_budget") @ExcludeMissing maxBudget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("max_parallel_requests")
        @ExcludeMissing
        maxParallelRequests: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("model_max_budget")
        @ExcludeMissing
        modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of(),
        @JsonProperty("rpm_limit") @ExcludeMissing rpmLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("soft_budget")
        @ExcludeMissing
        softBudget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tpm_limit") @ExcludeMissing tpmLimit: JsonField<Long> = JsonMissing.of(),
    ) : this(
        budgetDuration,
        budgetId,
        budgetResetAt,
        maxBudget,
        maxParallelRequests,
        modelMaxBudget,
        rpmLimit,
        softBudget,
        tpmLimit,
        mutableMapOf(),
    )

    /**
     * Max duration budget should be set for (e.g. '1hr', '1d', '28d')
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetDuration(): Optional<String> = budgetDuration.getOptional("budget_duration")

    /**
     * The unique budget id.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetId(): Optional<String> = budgetId.getOptional("budget_id")

    /**
     * Datetime when the budget is reset
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetResetAt(): Optional<OffsetDateTime> = budgetResetAt.getOptional("budget_reset_at")

    /**
     * Requests will fail if this budget (in USD) is exceeded.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxBudget(): Optional<Double> = maxBudget.getOptional("max_budget")

    /**
     * Max concurrent requests allowed for this budget id.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxParallelRequests(): Optional<Long> =
        maxParallelRequests.getOptional("max_parallel_requests")

    /**
     * Max budget for each model (e.g. {'gpt-4o': {'max_budget': '0.0000001', 'budget_duration':
     * '1d', 'tpm_limit': 1000, 'rpm_limit': 1000}})
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelMaxBudget(): Optional<ModelMaxBudget> = modelMaxBudget.getOptional("model_max_budget")

    /**
     * Max requests per minute, allowed for this budget id.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rpmLimit(): Optional<Long> = rpmLimit.getOptional("rpm_limit")

    /**
     * Requests will NOT fail if this is exceeded. Will fire alerting though.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun softBudget(): Optional<Double> = softBudget.getOptional("soft_budget")

    /**
     * Max tokens per minute, allowed for this budget id.
     *
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tpmLimit(): Optional<Long> = tpmLimit.getOptional("tpm_limit")

    /**
     * Returns the raw JSON value of [budgetDuration].
     *
     * Unlike [budgetDuration], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [budgetResetAt].
     *
     * Unlike [budgetResetAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("budget_reset_at")
    @ExcludeMissing
    fun _budgetResetAt(): JsonField<OffsetDateTime> = budgetResetAt

    /**
     * Returns the raw JSON value of [maxBudget].
     *
     * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

    /**
     * Returns the raw JSON value of [maxParallelRequests].
     *
     * Unlike [maxParallelRequests], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_parallel_requests")
    @ExcludeMissing
    fun _maxParallelRequests(): JsonField<Long> = maxParallelRequests

    /**
     * Returns the raw JSON value of [modelMaxBudget].
     *
     * Unlike [modelMaxBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_max_budget")
    @ExcludeMissing
    fun _modelMaxBudget(): JsonField<ModelMaxBudget> = modelMaxBudget

    /**
     * Returns the raw JSON value of [rpmLimit].
     *
     * Unlike [rpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rpm_limit") @ExcludeMissing fun _rpmLimit(): JsonField<Long> = rpmLimit

    /**
     * Returns the raw JSON value of [softBudget].
     *
     * Unlike [softBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("soft_budget") @ExcludeMissing fun _softBudget(): JsonField<Double> = softBudget

    /**
     * Returns the raw JSON value of [tpmLimit].
     *
     * Unlike [tpmLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tpm_limit") @ExcludeMissing fun _tpmLimit(): JsonField<Long> = tpmLimit

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

        /** Returns a mutable builder for constructing an instance of [BudgetNew]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BudgetNew]. */
    class Builder internal constructor() {

        private var budgetDuration: JsonField<String> = JsonMissing.of()
        private var budgetId: JsonField<String> = JsonMissing.of()
        private var budgetResetAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var maxBudget: JsonField<Double> = JsonMissing.of()
        private var maxParallelRequests: JsonField<Long> = JsonMissing.of()
        private var modelMaxBudget: JsonField<ModelMaxBudget> = JsonMissing.of()
        private var rpmLimit: JsonField<Long> = JsonMissing.of()
        private var softBudget: JsonField<Double> = JsonMissing.of()
        private var tpmLimit: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(budgetNew: BudgetNew) = apply {
            budgetDuration = budgetNew.budgetDuration
            budgetId = budgetNew.budgetId
            budgetResetAt = budgetNew.budgetResetAt
            maxBudget = budgetNew.maxBudget
            maxParallelRequests = budgetNew.maxParallelRequests
            modelMaxBudget = budgetNew.modelMaxBudget
            rpmLimit = budgetNew.rpmLimit
            softBudget = budgetNew.softBudget
            tpmLimit = budgetNew.tpmLimit
            additionalProperties = budgetNew.additionalProperties.toMutableMap()
        }

        /** Max duration budget should be set for (e.g. '1hr', '1d', '28d') */
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

        /** The unique budget id. */
        fun budgetId(budgetId: String?) = budgetId(JsonField.ofNullable(budgetId))

        /** Alias for calling [Builder.budgetId] with `budgetId.orElse(null)`. */
        fun budgetId(budgetId: Optional<String>) = budgetId(budgetId.getOrNull())

        /**
         * Sets [Builder.budgetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun budgetId(budgetId: JsonField<String>) = apply { this.budgetId = budgetId }

        /** Datetime when the budget is reset */
        fun budgetResetAt(budgetResetAt: OffsetDateTime?) =
            budgetResetAt(JsonField.ofNullable(budgetResetAt))

        /** Alias for calling [Builder.budgetResetAt] with `budgetResetAt.orElse(null)`. */
        fun budgetResetAt(budgetResetAt: Optional<OffsetDateTime>) =
            budgetResetAt(budgetResetAt.getOrNull())

        /**
         * Sets [Builder.budgetResetAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetResetAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun budgetResetAt(budgetResetAt: JsonField<OffsetDateTime>) = apply {
            this.budgetResetAt = budgetResetAt
        }

        /** Requests will fail if this budget (in USD) is exceeded. */
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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxBudget(maxBudget: JsonField<Double>) = apply { this.maxBudget = maxBudget }

        /** Max concurrent requests allowed for this budget id. */
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
            this.maxParallelRequests = maxParallelRequests
        }

        /**
         * Max budget for each model (e.g. {'gpt-4o': {'max_budget': '0.0000001', 'budget_duration':
         * '1d', 'tpm_limit': 1000, 'rpm_limit': 1000}})
         */
        fun modelMaxBudget(modelMaxBudget: ModelMaxBudget?) =
            modelMaxBudget(JsonField.ofNullable(modelMaxBudget))

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
            this.modelMaxBudget = modelMaxBudget
        }

        /** Max requests per minute, allowed for this budget id. */
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
         * You should usually call [Builder.rpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rpmLimit(rpmLimit: JsonField<Long>) = apply { this.rpmLimit = rpmLimit }

        /** Requests will NOT fail if this is exceeded. Will fire alerting though. */
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
         * You should usually call [Builder.softBudget] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun softBudget(softBudget: JsonField<Double>) = apply { this.softBudget = softBudget }

        /** Max tokens per minute, allowed for this budget id. */
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
         * You should usually call [Builder.tpmLimit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tpmLimit(tpmLimit: JsonField<Long>) = apply { this.tpmLimit = tpmLimit }

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
         * Returns an immutable instance of [BudgetNew].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BudgetNew =
            BudgetNew(
                budgetDuration,
                budgetId,
                budgetResetAt,
                maxBudget,
                maxParallelRequests,
                modelMaxBudget,
                rpmLimit,
                softBudget,
                tpmLimit,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BudgetNew = apply {
        if (validated) {
            return@apply
        }

        budgetDuration()
        budgetId()
        budgetResetAt()
        maxBudget()
        maxParallelRequests()
        modelMaxBudget().ifPresent { it.validate() }
        rpmLimit()
        softBudget()
        tpmLimit()
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
        (if (budgetDuration.asKnown().isPresent) 1 else 0) +
            (if (budgetId.asKnown().isPresent) 1 else 0) +
            (if (budgetResetAt.asKnown().isPresent) 1 else 0) +
            (if (maxBudget.asKnown().isPresent) 1 else 0) +
            (if (maxParallelRequests.asKnown().isPresent) 1 else 0) +
            (modelMaxBudget.asKnown().getOrNull()?.validity() ?: 0) +
            (if (rpmLimit.asKnown().isPresent) 1 else 0) +
            (if (softBudget.asKnown().isPresent) 1 else 0) +
            (if (tpmLimit.asKnown().isPresent) 1 else 0)

    /**
     * Max budget for each model (e.g. {'gpt-4o': {'max_budget': '0.0000001', 'budget_duration':
     * '1d', 'tpm_limit': 1000, 'rpm_limit': 1000}})
     */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BudgetNew &&
            budgetDuration == other.budgetDuration &&
            budgetId == other.budgetId &&
            budgetResetAt == other.budgetResetAt &&
            maxBudget == other.maxBudget &&
            maxParallelRequests == other.maxParallelRequests &&
            modelMaxBudget == other.modelMaxBudget &&
            rpmLimit == other.rpmLimit &&
            softBudget == other.softBudget &&
            tpmLimit == other.tpmLimit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            budgetDuration,
            budgetId,
            budgetResetAt,
            maxBudget,
            maxParallelRequests,
            modelMaxBudget,
            rpmLimit,
            softBudget,
            tpmLimit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BudgetNew{budgetDuration=$budgetDuration, budgetId=$budgetId, budgetResetAt=$budgetResetAt, maxBudget=$maxBudget, maxParallelRequests=$maxParallelRequests, modelMaxBudget=$modelMaxBudget, rpmLimit=$rpmLimit, softBudget=$softBudget, tpmLimit=$tpmLimit, additionalProperties=$additionalProperties}"
}
