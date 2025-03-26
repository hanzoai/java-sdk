// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.model.update

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
import com.hanzo_ai.api.core.BaseDeserializer
import com.hanzo_ai.api.core.BaseSerializer
import com.hanzo_ai.api.core.ExcludeMissing
import com.hanzo_ai.api.core.JsonField
import com.hanzo_ai.api.core.JsonMissing
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.checkKnown
import com.hanzo_ai.api.core.getOrThrow
import com.hanzo_ai.api.core.toImmutable
import com.hanzo_ai.api.errors.HanzoInvalidDataException
import com.hanzo_ai.api.models.model.ConfigurableClientsideParamsCustomAuth
import com.hanzo_ai.api.models.model.ModelInfo
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UpdateDeployment
private constructor(
    private val llmParams: JsonField<LlmParams>,
    private val modelInfo: JsonField<ModelInfo>,
    private val modelName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("llm_params")
        @ExcludeMissing
        llmParams: JsonField<LlmParams> = JsonMissing.of(),
        @JsonProperty("model_info")
        @ExcludeMissing
        modelInfo: JsonField<ModelInfo> = JsonMissing.of(),
        @JsonProperty("model_name") @ExcludeMissing modelName: JsonField<String> = JsonMissing.of(),
    ) : this(llmParams, modelInfo, modelName, mutableMapOf())

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmParams(): Optional<LlmParams> = Optional.ofNullable(llmParams.getNullable("llm_params"))

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelInfo(): Optional<ModelInfo> = Optional.ofNullable(modelInfo.getNullable("model_info"))

    /**
     * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelName(): Optional<String> = Optional.ofNullable(modelName.getNullable("model_name"))

    /**
     * Returns the raw JSON value of [llmParams].
     *
     * Unlike [llmParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_params") @ExcludeMissing fun _llmParams(): JsonField<LlmParams> = llmParams

    /**
     * Returns the raw JSON value of [modelInfo].
     *
     * Unlike [modelInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_info") @ExcludeMissing fun _modelInfo(): JsonField<ModelInfo> = modelInfo

    /**
     * Returns the raw JSON value of [modelName].
     *
     * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_name") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

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

        /** Returns a mutable builder for constructing an instance of [UpdateDeployment]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateDeployment]. */
    class Builder internal constructor() {

        private var llmParams: JsonField<LlmParams> = JsonMissing.of()
        private var modelInfo: JsonField<ModelInfo> = JsonMissing.of()
        private var modelName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateDeployment: UpdateDeployment) = apply {
            llmParams = updateDeployment.llmParams
            modelInfo = updateDeployment.modelInfo
            modelName = updateDeployment.modelName
            additionalProperties = updateDeployment.additionalProperties.toMutableMap()
        }

        fun llmParams(llmParams: LlmParams?) = llmParams(JsonField.ofNullable(llmParams))

        /** Alias for calling [Builder.llmParams] with `llmParams.orElse(null)`. */
        fun llmParams(llmParams: Optional<LlmParams>) = llmParams(llmParams.getOrNull())

        /**
         * Sets [Builder.llmParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmParams] with a well-typed [LlmParams] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun llmParams(llmParams: JsonField<LlmParams>) = apply { this.llmParams = llmParams }

        fun modelInfo(modelInfo: ModelInfo?) = modelInfo(JsonField.ofNullable(modelInfo))

        /** Alias for calling [Builder.modelInfo] with `modelInfo.orElse(null)`. */
        fun modelInfo(modelInfo: Optional<ModelInfo>) = modelInfo(modelInfo.getOrNull())

        /**
         * Sets [Builder.modelInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelInfo] with a well-typed [ModelInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelInfo(modelInfo: JsonField<ModelInfo>) = apply { this.modelInfo = modelInfo }

        fun modelName(modelName: String?) = modelName(JsonField.ofNullable(modelName))

        /** Alias for calling [Builder.modelName] with `modelName.orElse(null)`. */
        fun modelName(modelName: Optional<String>) = modelName(modelName.getOrNull())

        /**
         * Sets [Builder.modelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

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
         * Returns an immutable instance of [UpdateDeployment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdateDeployment =
            UpdateDeployment(llmParams, modelInfo, modelName, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): UpdateDeployment = apply {
        if (validated) {
            return@apply
        }

        llmParams().ifPresent { it.validate() }
        modelInfo().ifPresent { it.validate() }
        modelName()
        validated = true
    }

    class LlmParams
    private constructor(
        private val apiBase: JsonField<String>,
        private val apiKey: JsonField<String>,
        private val apiVersion: JsonField<String>,
        private val awsAccessKeyId: JsonField<String>,
        private val awsRegionName: JsonField<String>,
        private val awsSecretAccessKey: JsonField<String>,
        private val budgetDuration: JsonField<String>,
        private val configurableClientsideAuthParams:
            JsonField<List<ConfigurableClientsideAuthParam>>,
        private val customLlmProvider: JsonField<String>,
        private val inputCostPerSecond: JsonField<Double>,
        private val inputCostPerToken: JsonField<Double>,
        private val llmTraceId: JsonField<String>,
        private val maxBudget: JsonField<Double>,
        private val maxFileSizeMb: JsonField<Double>,
        private val maxRetries: JsonField<Long>,
        private val mergeReasoningContentInChoices: JsonField<Boolean>,
        private val model: JsonField<String>,
        private val modelInfo: JsonValue,
        private val organization: JsonField<String>,
        private val outputCostPerSecond: JsonField<Double>,
        private val outputCostPerToken: JsonField<Double>,
        private val regionName: JsonField<String>,
        private val rpm: JsonField<Long>,
        private val streamTimeout: JsonField<StreamTimeout>,
        private val timeout: JsonField<Timeout>,
        private val tpm: JsonField<Long>,
        private val useInPassThrough: JsonField<Boolean>,
        private val vertexCredentials: JsonField<VertexCredentials>,
        private val vertexLocation: JsonField<String>,
        private val vertexProject: JsonField<String>,
        private val watsonxRegionName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_base") @ExcludeMissing apiBase: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("api_version")
            @ExcludeMissing
            apiVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_access_key_id")
            @ExcludeMissing
            awsAccessKeyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_region_name")
            @ExcludeMissing
            awsRegionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_secret_access_key")
            @ExcludeMissing
            awsSecretAccessKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("budget_duration")
            @ExcludeMissing
            budgetDuration: JsonField<String> = JsonMissing.of(),
            @JsonProperty("configurable_clientside_auth_params")
            @ExcludeMissing
            configurableClientsideAuthParams: JsonField<List<ConfigurableClientsideAuthParam>> =
                JsonMissing.of(),
            @JsonProperty("custom_llm_provider")
            @ExcludeMissing
            customLlmProvider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_cost_per_second")
            @ExcludeMissing
            inputCostPerSecond: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("input_cost_per_token")
            @ExcludeMissing
            inputCostPerToken: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("llm_trace_id")
            @ExcludeMissing
            llmTraceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_budget")
            @ExcludeMissing
            maxBudget: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_file_size_mb")
            @ExcludeMissing
            maxFileSizeMb: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_retries")
            @ExcludeMissing
            maxRetries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("merge_reasoning_content_in_choices")
            @ExcludeMissing
            mergeReasoningContentInChoices: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_info") @ExcludeMissing modelInfo: JsonValue = JsonMissing.of(),
            @JsonProperty("organization")
            @ExcludeMissing
            organization: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_cost_per_second")
            @ExcludeMissing
            outputCostPerSecond: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("output_cost_per_token")
            @ExcludeMissing
            outputCostPerToken: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("region_name")
            @ExcludeMissing
            regionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rpm") @ExcludeMissing rpm: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("stream_timeout")
            @ExcludeMissing
            streamTimeout: JsonField<StreamTimeout> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Timeout> = JsonMissing.of(),
            @JsonProperty("tpm") @ExcludeMissing tpm: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("use_in_pass_through")
            @ExcludeMissing
            useInPassThrough: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("vertex_credentials")
            @ExcludeMissing
            vertexCredentials: JsonField<VertexCredentials> = JsonMissing.of(),
            @JsonProperty("vertex_location")
            @ExcludeMissing
            vertexLocation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vertex_project")
            @ExcludeMissing
            vertexProject: JsonField<String> = JsonMissing.of(),
            @JsonProperty("watsonx_region_name")
            @ExcludeMissing
            watsonxRegionName: JsonField<String> = JsonMissing.of(),
        ) : this(
            apiBase,
            apiKey,
            apiVersion,
            awsAccessKeyId,
            awsRegionName,
            awsSecretAccessKey,
            budgetDuration,
            configurableClientsideAuthParams,
            customLlmProvider,
            inputCostPerSecond,
            inputCostPerToken,
            llmTraceId,
            maxBudget,
            maxFileSizeMb,
            maxRetries,
            mergeReasoningContentInChoices,
            model,
            modelInfo,
            organization,
            outputCostPerSecond,
            outputCostPerToken,
            regionName,
            rpm,
            streamTimeout,
            timeout,
            tpm,
            useInPassThrough,
            vertexCredentials,
            vertexLocation,
            vertexProject,
            watsonxRegionName,
            mutableMapOf(),
        )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiBase(): Optional<String> = Optional.ofNullable(apiBase.getNullable("api_base"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiKey(): Optional<String> = Optional.ofNullable(apiKey.getNullable("api_key"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiVersion(): Optional<String> =
            Optional.ofNullable(apiVersion.getNullable("api_version"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun awsAccessKeyId(): Optional<String> =
            Optional.ofNullable(awsAccessKeyId.getNullable("aws_access_key_id"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun awsRegionName(): Optional<String> =
            Optional.ofNullable(awsRegionName.getNullable("aws_region_name"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun awsSecretAccessKey(): Optional<String> =
            Optional.ofNullable(awsSecretAccessKey.getNullable("aws_secret_access_key"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun budgetDuration(): Optional<String> =
            Optional.ofNullable(budgetDuration.getNullable("budget_duration"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun configurableClientsideAuthParams(): Optional<List<ConfigurableClientsideAuthParam>> =
            Optional.ofNullable(
                configurableClientsideAuthParams.getNullable("configurable_clientside_auth_params")
            )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customLlmProvider(): Optional<String> =
            Optional.ofNullable(customLlmProvider.getNullable("custom_llm_provider"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerSecond(): Optional<Double> =
            Optional.ofNullable(inputCostPerSecond.getNullable("input_cost_per_second"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputCostPerToken(): Optional<Double> =
            Optional.ofNullable(inputCostPerToken.getNullable("input_cost_per_token"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmTraceId(): Optional<String> =
            Optional.ofNullable(llmTraceId.getNullable("llm_trace_id"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxBudget(): Optional<Double> = Optional.ofNullable(maxBudget.getNullable("max_budget"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxFileSizeMb(): Optional<Double> =
            Optional.ofNullable(maxFileSizeMb.getNullable("max_file_size_mb"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxRetries(): Optional<Long> =
            Optional.ofNullable(maxRetries.getNullable("max_retries"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mergeReasoningContentInChoices(): Optional<Boolean> =
            Optional.ofNullable(
                mergeReasoningContentInChoices.getNullable("merge_reasoning_content_in_choices")
            )

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = Optional.ofNullable(model.getNullable("model"))

        @JsonProperty("model_info") @ExcludeMissing fun _modelInfo(): JsonValue = modelInfo

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organization(): Optional<String> =
            Optional.ofNullable(organization.getNullable("organization"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerSecond(): Optional<Double> =
            Optional.ofNullable(outputCostPerSecond.getNullable("output_cost_per_second"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputCostPerToken(): Optional<Double> =
            Optional.ofNullable(outputCostPerToken.getNullable("output_cost_per_token"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regionName(): Optional<String> =
            Optional.ofNullable(regionName.getNullable("region_name"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rpm(): Optional<Long> = Optional.ofNullable(rpm.getNullable("rpm"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamTimeout(): Optional<StreamTimeout> =
            Optional.ofNullable(streamTimeout.getNullable("stream_timeout"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeout(): Optional<Timeout> = Optional.ofNullable(timeout.getNullable("timeout"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tpm(): Optional<Long> = Optional.ofNullable(tpm.getNullable("tpm"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun useInPassThrough(): Optional<Boolean> =
            Optional.ofNullable(useInPassThrough.getNullable("use_in_pass_through"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vertexCredentials(): Optional<VertexCredentials> =
            Optional.ofNullable(vertexCredentials.getNullable("vertex_credentials"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vertexLocation(): Optional<String> =
            Optional.ofNullable(vertexLocation.getNullable("vertex_location"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vertexProject(): Optional<String> =
            Optional.ofNullable(vertexProject.getNullable("vertex_project"))

        /**
         * @throws HanzoInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun watsonxRegionName(): Optional<String> =
            Optional.ofNullable(watsonxRegionName.getNullable("watsonx_region_name"))

        /**
         * Returns the raw JSON value of [apiBase].
         *
         * Unlike [apiBase], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_base") @ExcludeMissing fun _apiBase(): JsonField<String> = apiBase

        /**
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

        /**
         * Returns the raw JSON value of [apiVersion].
         *
         * Unlike [apiVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_version")
        @ExcludeMissing
        fun _apiVersion(): JsonField<String> = apiVersion

        /**
         * Returns the raw JSON value of [awsAccessKeyId].
         *
         * Unlike [awsAccessKeyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aws_access_key_id")
        @ExcludeMissing
        fun _awsAccessKeyId(): JsonField<String> = awsAccessKeyId

        /**
         * Returns the raw JSON value of [awsRegionName].
         *
         * Unlike [awsRegionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aws_region_name")
        @ExcludeMissing
        fun _awsRegionName(): JsonField<String> = awsRegionName

        /**
         * Returns the raw JSON value of [awsSecretAccessKey].
         *
         * Unlike [awsSecretAccessKey], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aws_secret_access_key")
        @ExcludeMissing
        fun _awsSecretAccessKey(): JsonField<String> = awsSecretAccessKey

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
         * Returns the raw JSON value of [configurableClientsideAuthParams].
         *
         * Unlike [configurableClientsideAuthParams], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("configurable_clientside_auth_params")
        @ExcludeMissing
        fun _configurableClientsideAuthParams(): JsonField<List<ConfigurableClientsideAuthParam>> =
            configurableClientsideAuthParams

        /**
         * Returns the raw JSON value of [customLlmProvider].
         *
         * Unlike [customLlmProvider], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_llm_provider")
        @ExcludeMissing
        fun _customLlmProvider(): JsonField<String> = customLlmProvider

        /**
         * Returns the raw JSON value of [inputCostPerSecond].
         *
         * Unlike [inputCostPerSecond], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_cost_per_second")
        @ExcludeMissing
        fun _inputCostPerSecond(): JsonField<Double> = inputCostPerSecond

        /**
         * Returns the raw JSON value of [inputCostPerToken].
         *
         * Unlike [inputCostPerToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_cost_per_token")
        @ExcludeMissing
        fun _inputCostPerToken(): JsonField<Double> = inputCostPerToken

        /**
         * Returns the raw JSON value of [llmTraceId].
         *
         * Unlike [llmTraceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("llm_trace_id")
        @ExcludeMissing
        fun _llmTraceId(): JsonField<String> = llmTraceId

        /**
         * Returns the raw JSON value of [maxBudget].
         *
         * Unlike [maxBudget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_budget") @ExcludeMissing fun _maxBudget(): JsonField<Double> = maxBudget

        /**
         * Returns the raw JSON value of [maxFileSizeMb].
         *
         * Unlike [maxFileSizeMb], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_file_size_mb")
        @ExcludeMissing
        fun _maxFileSizeMb(): JsonField<Double> = maxFileSizeMb

        /**
         * Returns the raw JSON value of [maxRetries].
         *
         * Unlike [maxRetries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_retries") @ExcludeMissing fun _maxRetries(): JsonField<Long> = maxRetries

        /**
         * Returns the raw JSON value of [mergeReasoningContentInChoices].
         *
         * Unlike [mergeReasoningContentInChoices], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("merge_reasoning_content_in_choices")
        @ExcludeMissing
        fun _mergeReasoningContentInChoices(): JsonField<Boolean> = mergeReasoningContentInChoices

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [organization].
         *
         * Unlike [organization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organization")
        @ExcludeMissing
        fun _organization(): JsonField<String> = organization

        /**
         * Returns the raw JSON value of [outputCostPerSecond].
         *
         * Unlike [outputCostPerSecond], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_second")
        @ExcludeMissing
        fun _outputCostPerSecond(): JsonField<Double> = outputCostPerSecond

        /**
         * Returns the raw JSON value of [outputCostPerToken].
         *
         * Unlike [outputCostPerToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("output_cost_per_token")
        @ExcludeMissing
        fun _outputCostPerToken(): JsonField<Double> = outputCostPerToken

        /**
         * Returns the raw JSON value of [regionName].
         *
         * Unlike [regionName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region_name")
        @ExcludeMissing
        fun _regionName(): JsonField<String> = regionName

        /**
         * Returns the raw JSON value of [rpm].
         *
         * Unlike [rpm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rpm") @ExcludeMissing fun _rpm(): JsonField<Long> = rpm

        /**
         * Returns the raw JSON value of [streamTimeout].
         *
         * Unlike [streamTimeout], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stream_timeout")
        @ExcludeMissing
        fun _streamTimeout(): JsonField<StreamTimeout> = streamTimeout

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Timeout> = timeout

        /**
         * Returns the raw JSON value of [tpm].
         *
         * Unlike [tpm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tpm") @ExcludeMissing fun _tpm(): JsonField<Long> = tpm

        /**
         * Returns the raw JSON value of [useInPassThrough].
         *
         * Unlike [useInPassThrough], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("use_in_pass_through")
        @ExcludeMissing
        fun _useInPassThrough(): JsonField<Boolean> = useInPassThrough

        /**
         * Returns the raw JSON value of [vertexCredentials].
         *
         * Unlike [vertexCredentials], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vertex_credentials")
        @ExcludeMissing
        fun _vertexCredentials(): JsonField<VertexCredentials> = vertexCredentials

        /**
         * Returns the raw JSON value of [vertexLocation].
         *
         * Unlike [vertexLocation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vertex_location")
        @ExcludeMissing
        fun _vertexLocation(): JsonField<String> = vertexLocation

        /**
         * Returns the raw JSON value of [vertexProject].
         *
         * Unlike [vertexProject], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vertex_project")
        @ExcludeMissing
        fun _vertexProject(): JsonField<String> = vertexProject

        /**
         * Returns the raw JSON value of [watsonxRegionName].
         *
         * Unlike [watsonxRegionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("watsonx_region_name")
        @ExcludeMissing
        fun _watsonxRegionName(): JsonField<String> = watsonxRegionName

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

            /** Returns a mutable builder for constructing an instance of [LlmParams]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LlmParams]. */
        class Builder internal constructor() {

            private var apiBase: JsonField<String> = JsonMissing.of()
            private var apiKey: JsonField<String> = JsonMissing.of()
            private var apiVersion: JsonField<String> = JsonMissing.of()
            private var awsAccessKeyId: JsonField<String> = JsonMissing.of()
            private var awsRegionName: JsonField<String> = JsonMissing.of()
            private var awsSecretAccessKey: JsonField<String> = JsonMissing.of()
            private var budgetDuration: JsonField<String> = JsonMissing.of()
            private var configurableClientsideAuthParams:
                JsonField<MutableList<ConfigurableClientsideAuthParam>>? =
                null
            private var customLlmProvider: JsonField<String> = JsonMissing.of()
            private var inputCostPerSecond: JsonField<Double> = JsonMissing.of()
            private var inputCostPerToken: JsonField<Double> = JsonMissing.of()
            private var llmTraceId: JsonField<String> = JsonMissing.of()
            private var maxBudget: JsonField<Double> = JsonMissing.of()
            private var maxFileSizeMb: JsonField<Double> = JsonMissing.of()
            private var maxRetries: JsonField<Long> = JsonMissing.of()
            private var mergeReasoningContentInChoices: JsonField<Boolean> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var modelInfo: JsonValue = JsonMissing.of()
            private var organization: JsonField<String> = JsonMissing.of()
            private var outputCostPerSecond: JsonField<Double> = JsonMissing.of()
            private var outputCostPerToken: JsonField<Double> = JsonMissing.of()
            private var regionName: JsonField<String> = JsonMissing.of()
            private var rpm: JsonField<Long> = JsonMissing.of()
            private var streamTimeout: JsonField<StreamTimeout> = JsonMissing.of()
            private var timeout: JsonField<Timeout> = JsonMissing.of()
            private var tpm: JsonField<Long> = JsonMissing.of()
            private var useInPassThrough: JsonField<Boolean> = JsonMissing.of()
            private var vertexCredentials: JsonField<VertexCredentials> = JsonMissing.of()
            private var vertexLocation: JsonField<String> = JsonMissing.of()
            private var vertexProject: JsonField<String> = JsonMissing.of()
            private var watsonxRegionName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(llmParams: LlmParams) = apply {
                apiBase = llmParams.apiBase
                apiKey = llmParams.apiKey
                apiVersion = llmParams.apiVersion
                awsAccessKeyId = llmParams.awsAccessKeyId
                awsRegionName = llmParams.awsRegionName
                awsSecretAccessKey = llmParams.awsSecretAccessKey
                budgetDuration = llmParams.budgetDuration
                configurableClientsideAuthParams =
                    llmParams.configurableClientsideAuthParams.map { it.toMutableList() }
                customLlmProvider = llmParams.customLlmProvider
                inputCostPerSecond = llmParams.inputCostPerSecond
                inputCostPerToken = llmParams.inputCostPerToken
                llmTraceId = llmParams.llmTraceId
                maxBudget = llmParams.maxBudget
                maxFileSizeMb = llmParams.maxFileSizeMb
                maxRetries = llmParams.maxRetries
                mergeReasoningContentInChoices = llmParams.mergeReasoningContentInChoices
                model = llmParams.model
                modelInfo = llmParams.modelInfo
                organization = llmParams.organization
                outputCostPerSecond = llmParams.outputCostPerSecond
                outputCostPerToken = llmParams.outputCostPerToken
                regionName = llmParams.regionName
                rpm = llmParams.rpm
                streamTimeout = llmParams.streamTimeout
                timeout = llmParams.timeout
                tpm = llmParams.tpm
                useInPassThrough = llmParams.useInPassThrough
                vertexCredentials = llmParams.vertexCredentials
                vertexLocation = llmParams.vertexLocation
                vertexProject = llmParams.vertexProject
                watsonxRegionName = llmParams.watsonxRegionName
                additionalProperties = llmParams.additionalProperties.toMutableMap()
            }

            fun apiBase(apiBase: String?) = apiBase(JsonField.ofNullable(apiBase))

            /** Alias for calling [Builder.apiBase] with `apiBase.orElse(null)`. */
            fun apiBase(apiBase: Optional<String>) = apiBase(apiBase.getOrNull())

            /**
             * Sets [Builder.apiBase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiBase] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiBase(apiBase: JsonField<String>) = apply { this.apiBase = apiBase }

            fun apiKey(apiKey: String?) = apiKey(JsonField.ofNullable(apiKey))

            /** Alias for calling [Builder.apiKey] with `apiKey.orElse(null)`. */
            fun apiKey(apiKey: Optional<String>) = apiKey(apiKey.getOrNull())

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

            fun apiVersion(apiVersion: String?) = apiVersion(JsonField.ofNullable(apiVersion))

            /** Alias for calling [Builder.apiVersion] with `apiVersion.orElse(null)`. */
            fun apiVersion(apiVersion: Optional<String>) = apiVersion(apiVersion.getOrNull())

            /**
             * Sets [Builder.apiVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiVersion(apiVersion: JsonField<String>) = apply { this.apiVersion = apiVersion }

            fun awsAccessKeyId(awsAccessKeyId: String?) =
                awsAccessKeyId(JsonField.ofNullable(awsAccessKeyId))

            /** Alias for calling [Builder.awsAccessKeyId] with `awsAccessKeyId.orElse(null)`. */
            fun awsAccessKeyId(awsAccessKeyId: Optional<String>) =
                awsAccessKeyId(awsAccessKeyId.getOrNull())

            /**
             * Sets [Builder.awsAccessKeyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsAccessKeyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsAccessKeyId(awsAccessKeyId: JsonField<String>) = apply {
                this.awsAccessKeyId = awsAccessKeyId
            }

            fun awsRegionName(awsRegionName: String?) =
                awsRegionName(JsonField.ofNullable(awsRegionName))

            /** Alias for calling [Builder.awsRegionName] with `awsRegionName.orElse(null)`. */
            fun awsRegionName(awsRegionName: Optional<String>) =
                awsRegionName(awsRegionName.getOrNull())

            /**
             * Sets [Builder.awsRegionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsRegionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsRegionName(awsRegionName: JsonField<String>) = apply {
                this.awsRegionName = awsRegionName
            }

            fun awsSecretAccessKey(awsSecretAccessKey: String?) =
                awsSecretAccessKey(JsonField.ofNullable(awsSecretAccessKey))

            /**
             * Alias for calling [Builder.awsSecretAccessKey] with
             * `awsSecretAccessKey.orElse(null)`.
             */
            fun awsSecretAccessKey(awsSecretAccessKey: Optional<String>) =
                awsSecretAccessKey(awsSecretAccessKey.getOrNull())

            /**
             * Sets [Builder.awsSecretAccessKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsSecretAccessKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsSecretAccessKey(awsSecretAccessKey: JsonField<String>) = apply {
                this.awsSecretAccessKey = awsSecretAccessKey
            }

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

            fun configurableClientsideAuthParams(
                configurableClientsideAuthParams: List<ConfigurableClientsideAuthParam>?
            ) =
                configurableClientsideAuthParams(
                    JsonField.ofNullable(configurableClientsideAuthParams)
                )

            /**
             * Alias for calling [Builder.configurableClientsideAuthParams] with
             * `configurableClientsideAuthParams.orElse(null)`.
             */
            fun configurableClientsideAuthParams(
                configurableClientsideAuthParams: Optional<List<ConfigurableClientsideAuthParam>>
            ) = configurableClientsideAuthParams(configurableClientsideAuthParams.getOrNull())

            /**
             * Sets [Builder.configurableClientsideAuthParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configurableClientsideAuthParams] with a well-typed
             * `List<ConfigurableClientsideAuthParam>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun configurableClientsideAuthParams(
                configurableClientsideAuthParams: JsonField<List<ConfigurableClientsideAuthParam>>
            ) = apply {
                this.configurableClientsideAuthParams =
                    configurableClientsideAuthParams.map { it.toMutableList() }
            }

            /**
             * Adds a single [ConfigurableClientsideAuthParam] to
             * [configurableClientsideAuthParams].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addConfigurableClientsideAuthParam(
                configurableClientsideAuthParam: ConfigurableClientsideAuthParam
            ) = apply {
                configurableClientsideAuthParams =
                    (configurableClientsideAuthParams ?: JsonField.of(mutableListOf())).also {
                        checkKnown("configurableClientsideAuthParams", it)
                            .add(configurableClientsideAuthParam)
                    }
            }

            /**
             * Alias for calling [addConfigurableClientsideAuthParam] with
             * `ConfigurableClientsideAuthParam.ofString(string)`.
             */
            fun addConfigurableClientsideAuthParam(string: String) =
                addConfigurableClientsideAuthParam(ConfigurableClientsideAuthParam.ofString(string))

            /**
             * Alias for calling [addConfigurableClientsideAuthParam] with
             * `ConfigurableClientsideAuthParam.ofParamsCustomAuth(paramsCustomAuth)`.
             */
            fun addConfigurableClientsideAuthParam(
                paramsCustomAuth: ConfigurableClientsideParamsCustomAuth
            ) =
                addConfigurableClientsideAuthParam(
                    ConfigurableClientsideAuthParam.ofParamsCustomAuth(paramsCustomAuth)
                )

            fun customLlmProvider(customLlmProvider: String?) =
                customLlmProvider(JsonField.ofNullable(customLlmProvider))

            /**
             * Alias for calling [Builder.customLlmProvider] with `customLlmProvider.orElse(null)`.
             */
            fun customLlmProvider(customLlmProvider: Optional<String>) =
                customLlmProvider(customLlmProvider.getOrNull())

            /**
             * Sets [Builder.customLlmProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customLlmProvider] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customLlmProvider(customLlmProvider: JsonField<String>) = apply {
                this.customLlmProvider = customLlmProvider
            }

            fun inputCostPerSecond(inputCostPerSecond: Double?) =
                inputCostPerSecond(JsonField.ofNullable(inputCostPerSecond))

            /**
             * Alias for [Builder.inputCostPerSecond].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerSecond(inputCostPerSecond: Double) =
                inputCostPerSecond(inputCostPerSecond as Double?)

            /**
             * Alias for calling [Builder.inputCostPerSecond] with
             * `inputCostPerSecond.orElse(null)`.
             */
            fun inputCostPerSecond(inputCostPerSecond: Optional<Double>) =
                inputCostPerSecond(inputCostPerSecond.getOrNull())

            /**
             * Sets [Builder.inputCostPerSecond] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerSecond] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputCostPerSecond(inputCostPerSecond: JsonField<Double>) = apply {
                this.inputCostPerSecond = inputCostPerSecond
            }

            fun inputCostPerToken(inputCostPerToken: Double?) =
                inputCostPerToken(JsonField.ofNullable(inputCostPerToken))

            /**
             * Alias for [Builder.inputCostPerToken].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inputCostPerToken(inputCostPerToken: Double) =
                inputCostPerToken(inputCostPerToken as Double?)

            /**
             * Alias for calling [Builder.inputCostPerToken] with `inputCostPerToken.orElse(null)`.
             */
            fun inputCostPerToken(inputCostPerToken: Optional<Double>) =
                inputCostPerToken(inputCostPerToken.getOrNull())

            /**
             * Sets [Builder.inputCostPerToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCostPerToken] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputCostPerToken(inputCostPerToken: JsonField<Double>) = apply {
                this.inputCostPerToken = inputCostPerToken
            }

            fun llmTraceId(llmTraceId: String?) = llmTraceId(JsonField.ofNullable(llmTraceId))

            /** Alias for calling [Builder.llmTraceId] with `llmTraceId.orElse(null)`. */
            fun llmTraceId(llmTraceId: Optional<String>) = llmTraceId(llmTraceId.getOrNull())

            /**
             * Sets [Builder.llmTraceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmTraceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmTraceId(llmTraceId: JsonField<String>) = apply { this.llmTraceId = llmTraceId }

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

            fun maxFileSizeMb(maxFileSizeMb: Double?) =
                maxFileSizeMb(JsonField.ofNullable(maxFileSizeMb))

            /**
             * Alias for [Builder.maxFileSizeMb].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxFileSizeMb(maxFileSizeMb: Double) = maxFileSizeMb(maxFileSizeMb as Double?)

            /** Alias for calling [Builder.maxFileSizeMb] with `maxFileSizeMb.orElse(null)`. */
            fun maxFileSizeMb(maxFileSizeMb: Optional<Double>) =
                maxFileSizeMb(maxFileSizeMb.getOrNull())

            /**
             * Sets [Builder.maxFileSizeMb] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxFileSizeMb] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxFileSizeMb(maxFileSizeMb: JsonField<Double>) = apply {
                this.maxFileSizeMb = maxFileSizeMb
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

            fun mergeReasoningContentInChoices(mergeReasoningContentInChoices: Boolean?) =
                mergeReasoningContentInChoices(JsonField.ofNullable(mergeReasoningContentInChoices))

            /**
             * Alias for [Builder.mergeReasoningContentInChoices].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun mergeReasoningContentInChoices(mergeReasoningContentInChoices: Boolean) =
                mergeReasoningContentInChoices(mergeReasoningContentInChoices as Boolean?)

            /**
             * Alias for calling [Builder.mergeReasoningContentInChoices] with
             * `mergeReasoningContentInChoices.orElse(null)`.
             */
            fun mergeReasoningContentInChoices(mergeReasoningContentInChoices: Optional<Boolean>) =
                mergeReasoningContentInChoices(mergeReasoningContentInChoices.getOrNull())

            /**
             * Sets [Builder.mergeReasoningContentInChoices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mergeReasoningContentInChoices] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun mergeReasoningContentInChoices(mergeReasoningContentInChoices: JsonField<Boolean>) =
                apply {
                    this.mergeReasoningContentInChoices = mergeReasoningContentInChoices
                }

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

            fun modelInfo(modelInfo: JsonValue) = apply { this.modelInfo = modelInfo }

            fun organization(organization: String?) =
                organization(JsonField.ofNullable(organization))

            /** Alias for calling [Builder.organization] with `organization.orElse(null)`. */
            fun organization(organization: Optional<String>) =
                organization(organization.getOrNull())

            /**
             * Sets [Builder.organization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organization] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organization(organization: JsonField<String>) = apply {
                this.organization = organization
            }

            fun outputCostPerSecond(outputCostPerSecond: Double?) =
                outputCostPerSecond(JsonField.ofNullable(outputCostPerSecond))

            /**
             * Alias for [Builder.outputCostPerSecond].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerSecond(outputCostPerSecond: Double) =
                outputCostPerSecond(outputCostPerSecond as Double?)

            /**
             * Alias for calling [Builder.outputCostPerSecond] with
             * `outputCostPerSecond.orElse(null)`.
             */
            fun outputCostPerSecond(outputCostPerSecond: Optional<Double>) =
                outputCostPerSecond(outputCostPerSecond.getOrNull())

            /**
             * Sets [Builder.outputCostPerSecond] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerSecond] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outputCostPerSecond(outputCostPerSecond: JsonField<Double>) = apply {
                this.outputCostPerSecond = outputCostPerSecond
            }

            fun outputCostPerToken(outputCostPerToken: Double?) =
                outputCostPerToken(JsonField.ofNullable(outputCostPerToken))

            /**
             * Alias for [Builder.outputCostPerToken].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun outputCostPerToken(outputCostPerToken: Double) =
                outputCostPerToken(outputCostPerToken as Double?)

            /**
             * Alias for calling [Builder.outputCostPerToken] with
             * `outputCostPerToken.orElse(null)`.
             */
            fun outputCostPerToken(outputCostPerToken: Optional<Double>) =
                outputCostPerToken(outputCostPerToken.getOrNull())

            /**
             * Sets [Builder.outputCostPerToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCostPerToken] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputCostPerToken(outputCostPerToken: JsonField<Double>) = apply {
                this.outputCostPerToken = outputCostPerToken
            }

            fun regionName(regionName: String?) = regionName(JsonField.ofNullable(regionName))

            /** Alias for calling [Builder.regionName] with `regionName.orElse(null)`. */
            fun regionName(regionName: Optional<String>) = regionName(regionName.getOrNull())

            /**
             * Sets [Builder.regionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun regionName(regionName: JsonField<String>) = apply { this.regionName = regionName }

            fun rpm(rpm: Long?) = rpm(JsonField.ofNullable(rpm))

            /**
             * Alias for [Builder.rpm].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rpm(rpm: Long) = rpm(rpm as Long?)

            /** Alias for calling [Builder.rpm] with `rpm.orElse(null)`. */
            fun rpm(rpm: Optional<Long>) = rpm(rpm.getOrNull())

            /**
             * Sets [Builder.rpm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rpm] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rpm(rpm: JsonField<Long>) = apply { this.rpm = rpm }

            fun streamTimeout(streamTimeout: StreamTimeout?) =
                streamTimeout(JsonField.ofNullable(streamTimeout))

            /** Alias for calling [Builder.streamTimeout] with `streamTimeout.orElse(null)`. */
            fun streamTimeout(streamTimeout: Optional<StreamTimeout>) =
                streamTimeout(streamTimeout.getOrNull())

            /**
             * Sets [Builder.streamTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamTimeout] with a well-typed [StreamTimeout]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun streamTimeout(streamTimeout: JsonField<StreamTimeout>) = apply {
                this.streamTimeout = streamTimeout
            }

            /** Alias for calling [streamTimeout] with `StreamTimeout.ofNumber(number)`. */
            fun streamTimeout(number: Double) = streamTimeout(StreamTimeout.ofNumber(number))

            /** Alias for calling [streamTimeout] with `StreamTimeout.ofString(string)`. */
            fun streamTimeout(string: String) = streamTimeout(StreamTimeout.ofString(string))

            fun timeout(timeout: Timeout?) = timeout(JsonField.ofNullable(timeout))

            /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
            fun timeout(timeout: Optional<Timeout>) = timeout(timeout.getOrNull())

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Timeout] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Timeout>) = apply { this.timeout = timeout }

            /** Alias for calling [timeout] with `Timeout.ofNumber(number)`. */
            fun timeout(number: Double) = timeout(Timeout.ofNumber(number))

            /** Alias for calling [timeout] with `Timeout.ofString(string)`. */
            fun timeout(string: String) = timeout(Timeout.ofString(string))

            fun tpm(tpm: Long?) = tpm(JsonField.ofNullable(tpm))

            /**
             * Alias for [Builder.tpm].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tpm(tpm: Long) = tpm(tpm as Long?)

            /** Alias for calling [Builder.tpm] with `tpm.orElse(null)`. */
            fun tpm(tpm: Optional<Long>) = tpm(tpm.getOrNull())

            /**
             * Sets [Builder.tpm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tpm] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tpm(tpm: JsonField<Long>) = apply { this.tpm = tpm }

            fun useInPassThrough(useInPassThrough: Boolean?) =
                useInPassThrough(JsonField.ofNullable(useInPassThrough))

            /**
             * Alias for [Builder.useInPassThrough].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun useInPassThrough(useInPassThrough: Boolean) =
                useInPassThrough(useInPassThrough as Boolean?)

            /**
             * Alias for calling [Builder.useInPassThrough] with `useInPassThrough.orElse(null)`.
             */
            fun useInPassThrough(useInPassThrough: Optional<Boolean>) =
                useInPassThrough(useInPassThrough.getOrNull())

            /**
             * Sets [Builder.useInPassThrough] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useInPassThrough] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useInPassThrough(useInPassThrough: JsonField<Boolean>) = apply {
                this.useInPassThrough = useInPassThrough
            }

            fun vertexCredentials(vertexCredentials: VertexCredentials?) =
                vertexCredentials(JsonField.ofNullable(vertexCredentials))

            /**
             * Alias for calling [Builder.vertexCredentials] with `vertexCredentials.orElse(null)`.
             */
            fun vertexCredentials(vertexCredentials: Optional<VertexCredentials>) =
                vertexCredentials(vertexCredentials.getOrNull())

            /**
             * Sets [Builder.vertexCredentials] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vertexCredentials] with a well-typed
             * [VertexCredentials] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun vertexCredentials(vertexCredentials: JsonField<VertexCredentials>) = apply {
                this.vertexCredentials = vertexCredentials
            }

            /**
             * Alias for calling [vertexCredentials] with
             * `VertexCredentials.ofJsonValue(jsonValue)`.
             */
            fun vertexCredentials(jsonValue: JsonValue) =
                vertexCredentials(VertexCredentials.ofJsonValue(jsonValue))

            /** Alias for calling [vertexCredentials] with `VertexCredentials.ofString(string)`. */
            fun vertexCredentials(string: String) =
                vertexCredentials(VertexCredentials.ofString(string))

            fun vertexLocation(vertexLocation: String?) =
                vertexLocation(JsonField.ofNullable(vertexLocation))

            /** Alias for calling [Builder.vertexLocation] with `vertexLocation.orElse(null)`. */
            fun vertexLocation(vertexLocation: Optional<String>) =
                vertexLocation(vertexLocation.getOrNull())

            /**
             * Sets [Builder.vertexLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vertexLocation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vertexLocation(vertexLocation: JsonField<String>) = apply {
                this.vertexLocation = vertexLocation
            }

            fun vertexProject(vertexProject: String?) =
                vertexProject(JsonField.ofNullable(vertexProject))

            /** Alias for calling [Builder.vertexProject] with `vertexProject.orElse(null)`. */
            fun vertexProject(vertexProject: Optional<String>) =
                vertexProject(vertexProject.getOrNull())

            /**
             * Sets [Builder.vertexProject] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vertexProject] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vertexProject(vertexProject: JsonField<String>) = apply {
                this.vertexProject = vertexProject
            }

            fun watsonxRegionName(watsonxRegionName: String?) =
                watsonxRegionName(JsonField.ofNullable(watsonxRegionName))

            /**
             * Alias for calling [Builder.watsonxRegionName] with `watsonxRegionName.orElse(null)`.
             */
            fun watsonxRegionName(watsonxRegionName: Optional<String>) =
                watsonxRegionName(watsonxRegionName.getOrNull())

            /**
             * Sets [Builder.watsonxRegionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.watsonxRegionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun watsonxRegionName(watsonxRegionName: JsonField<String>) = apply {
                this.watsonxRegionName = watsonxRegionName
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
             * Returns an immutable instance of [LlmParams].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LlmParams =
                LlmParams(
                    apiBase,
                    apiKey,
                    apiVersion,
                    awsAccessKeyId,
                    awsRegionName,
                    awsSecretAccessKey,
                    budgetDuration,
                    (configurableClientsideAuthParams ?: JsonMissing.of()).map { it.toImmutable() },
                    customLlmProvider,
                    inputCostPerSecond,
                    inputCostPerToken,
                    llmTraceId,
                    maxBudget,
                    maxFileSizeMb,
                    maxRetries,
                    mergeReasoningContentInChoices,
                    model,
                    modelInfo,
                    organization,
                    outputCostPerSecond,
                    outputCostPerToken,
                    regionName,
                    rpm,
                    streamTimeout,
                    timeout,
                    tpm,
                    useInPassThrough,
                    vertexCredentials,
                    vertexLocation,
                    vertexProject,
                    watsonxRegionName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LlmParams = apply {
            if (validated) {
                return@apply
            }

            apiBase()
            apiKey()
            apiVersion()
            awsAccessKeyId()
            awsRegionName()
            awsSecretAccessKey()
            budgetDuration()
            configurableClientsideAuthParams().ifPresent { it.forEach { it.validate() } }
            customLlmProvider()
            inputCostPerSecond()
            inputCostPerToken()
            llmTraceId()
            maxBudget()
            maxFileSizeMb()
            maxRetries()
            mergeReasoningContentInChoices()
            model()
            organization()
            outputCostPerSecond()
            outputCostPerToken()
            regionName()
            rpm()
            streamTimeout().ifPresent { it.validate() }
            timeout().ifPresent { it.validate() }
            tpm()
            useInPassThrough()
            vertexCredentials().ifPresent { it.validate() }
            vertexLocation()
            vertexProject()
            watsonxRegionName()
            validated = true
        }

        @JsonDeserialize(using = ConfigurableClientsideAuthParam.Deserializer::class)
        @JsonSerialize(using = ConfigurableClientsideAuthParam.Serializer::class)
        class ConfigurableClientsideAuthParam
        private constructor(
            private val string: String? = null,
            private val paramsCustomAuth: ConfigurableClientsideParamsCustomAuth? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun paramsCustomAuth(): Optional<ConfigurableClientsideParamsCustomAuth> =
                Optional.ofNullable(paramsCustomAuth)

            fun isString(): Boolean = string != null

            fun isParamsCustomAuth(): Boolean = paramsCustomAuth != null

            fun asString(): String = string.getOrThrow("string")

            fun asParamsCustomAuth(): ConfigurableClientsideParamsCustomAuth =
                paramsCustomAuth.getOrThrow("paramsCustomAuth")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    string != null -> visitor.visitString(string)
                    paramsCustomAuth != null -> visitor.visitParamsCustomAuth(paramsCustomAuth)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): ConfigurableClientsideAuthParam = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitParamsCustomAuth(
                            paramsCustomAuth: ConfigurableClientsideParamsCustomAuth
                        ) {
                            paramsCustomAuth.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ConfigurableClientsideAuthParam && string == other.string && paramsCustomAuth == other.paramsCustomAuth /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, paramsCustomAuth) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "ConfigurableClientsideAuthParam{string=$string}"
                    paramsCustomAuth != null ->
                        "ConfigurableClientsideAuthParam{paramsCustomAuth=$paramsCustomAuth}"
                    _json != null -> "ConfigurableClientsideAuthParam{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid ConfigurableClientsideAuthParam")
                }

            companion object {

                @JvmStatic
                fun ofString(string: String) = ConfigurableClientsideAuthParam(string = string)

                @JvmStatic
                fun ofParamsCustomAuth(paramsCustomAuth: ConfigurableClientsideParamsCustomAuth) =
                    ConfigurableClientsideAuthParam(paramsCustomAuth = paramsCustomAuth)
            }

            /**
             * An interface that defines how to map each variant of
             * [ConfigurableClientsideAuthParam] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitParamsCustomAuth(
                    paramsCustomAuth: ConfigurableClientsideParamsCustomAuth
                ): T

                /**
                 * Maps an unknown variant of [ConfigurableClientsideAuthParam] to a value of type
                 * [T].
                 *
                 * An instance of [ConfigurableClientsideAuthParam] can contain an unknown variant
                 * if it was deserialized from data that doesn't match any known variant. For
                 * example, if the SDK is on an older version than the API, then the API may respond
                 * with new variants that the SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException(
                        "Unknown ConfigurableClientsideAuthParam: $json"
                    )
                }
            }

            internal class Deserializer :
                BaseDeserializer<ConfigurableClientsideAuthParam>(
                    ConfigurableClientsideAuthParam::class
                ) {

                override fun ObjectCodec.deserialize(
                    node: JsonNode
                ): ConfigurableClientsideAuthParam {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return ConfigurableClientsideAuthParam(string = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<ConfigurableClientsideParamsCustomAuth>()) {
                            it.validate()
                        }
                        ?.let {
                            return ConfigurableClientsideAuthParam(
                                paramsCustomAuth = it,
                                _json = json,
                            )
                        }

                    return ConfigurableClientsideAuthParam(_json = json)
                }
            }

            internal class Serializer :
                BaseSerializer<ConfigurableClientsideAuthParam>(
                    ConfigurableClientsideAuthParam::class
                ) {

                override fun serialize(
                    value: ConfigurableClientsideAuthParam,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.paramsCustomAuth != null ->
                            generator.writeObject(value.paramsCustomAuth)
                        value._json != null -> generator.writeObject(value._json)
                        else ->
                            throw IllegalStateException("Invalid ConfigurableClientsideAuthParam")
                    }
                }
            }
        }

        @JsonDeserialize(using = StreamTimeout.Deserializer::class)
        @JsonSerialize(using = StreamTimeout.Serializer::class)
        class StreamTimeout
        private constructor(
            private val number: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isNumber(): Boolean = number != null

            fun isString(): Boolean = string != null

            fun asNumber(): Double = number.getOrThrow("number")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    number != null -> visitor.visitNumber(number)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): StreamTimeout = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitNumber(number: Double) {}

                        override fun visitString(string: String) {}
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StreamTimeout && number == other.number && string == other.string /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

            override fun toString(): String =
                when {
                    number != null -> "StreamTimeout{number=$number}"
                    string != null -> "StreamTimeout{string=$string}"
                    _json != null -> "StreamTimeout{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StreamTimeout")
                }

            companion object {

                @JvmStatic fun ofNumber(number: Double) = StreamTimeout(number = number)

                @JvmStatic fun ofString(string: String) = StreamTimeout(string = string)
            }

            /**
             * An interface that defines how to map each variant of [StreamTimeout] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitNumber(number: Double): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [StreamTimeout] to a value of type [T].
                 *
                 * An instance of [StreamTimeout] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException("Unknown StreamTimeout: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<StreamTimeout>(StreamTimeout::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): StreamTimeout {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                        return StreamTimeout(number = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return StreamTimeout(string = it, _json = json)
                    }

                    return StreamTimeout(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<StreamTimeout>(StreamTimeout::class) {

                override fun serialize(
                    value: StreamTimeout,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.number != null -> generator.writeObject(value.number)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid StreamTimeout")
                    }
                }
            }
        }

        @JsonDeserialize(using = Timeout.Deserializer::class)
        @JsonSerialize(using = Timeout.Serializer::class)
        class Timeout
        private constructor(
            private val number: Double? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isNumber(): Boolean = number != null

            fun isString(): Boolean = string != null

            fun asNumber(): Double = number.getOrThrow("number")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    number != null -> visitor.visitNumber(number)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): Timeout = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitNumber(number: Double) {}

                        override fun visitString(string: String) {}
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Timeout && number == other.number && string == other.string /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, string) /* spotless:on */

            override fun toString(): String =
                when {
                    number != null -> "Timeout{number=$number}"
                    string != null -> "Timeout{string=$string}"
                    _json != null -> "Timeout{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Timeout")
                }

            companion object {

                @JvmStatic fun ofNumber(number: Double) = Timeout(number = number)

                @JvmStatic fun ofString(string: String) = Timeout(string = string)
            }

            /**
             * An interface that defines how to map each variant of [Timeout] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitNumber(number: Double): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [Timeout] to a value of type [T].
                 *
                 * An instance of [Timeout] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException("Unknown Timeout: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Timeout>(Timeout::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Timeout {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                        return Timeout(number = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return Timeout(string = it, _json = json)
                    }

                    return Timeout(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Timeout>(Timeout::class) {

                override fun serialize(
                    value: Timeout,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.number != null -> generator.writeObject(value.number)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Timeout")
                    }
                }
            }
        }

        @JsonDeserialize(using = VertexCredentials.Deserializer::class)
        @JsonSerialize(using = VertexCredentials.Serializer::class)
        class VertexCredentials
        private constructor(
            private val jsonValue: JsonValue? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isJsonValue(): Boolean = jsonValue != null

            fun isString(): Boolean = string != null

            fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    jsonValue != null -> visitor.visitJsonValue(jsonValue)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): VertexCredentials = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitJsonValue(jsonValue: JsonValue) {}

                        override fun visitString(string: String) {}
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VertexCredentials && jsonValue == other.jsonValue && string == other.string /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(jsonValue, string) /* spotless:on */

            override fun toString(): String =
                when {
                    jsonValue != null -> "VertexCredentials{jsonValue=$jsonValue}"
                    string != null -> "VertexCredentials{string=$string}"
                    _json != null -> "VertexCredentials{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid VertexCredentials")
                }

            companion object {

                @JvmStatic
                fun ofJsonValue(jsonValue: JsonValue) = VertexCredentials(jsonValue = jsonValue)

                @JvmStatic fun ofString(string: String) = VertexCredentials(string = string)
            }

            /**
             * An interface that defines how to map each variant of [VertexCredentials] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                fun visitJsonValue(jsonValue: JsonValue): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [VertexCredentials] to a value of type [T].
                 *
                 * An instance of [VertexCredentials] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws HanzoInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HanzoInvalidDataException("Unknown VertexCredentials: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<VertexCredentials>(VertexCredentials::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): VertexCredentials {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                        return VertexCredentials(jsonValue = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return VertexCredentials(string = it, _json = json)
                    }

                    return VertexCredentials(_json = json)
                }
            }

            internal class Serializer :
                BaseSerializer<VertexCredentials>(VertexCredentials::class) {

                override fun serialize(
                    value: VertexCredentials,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.jsonValue != null -> generator.writeObject(value.jsonValue)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid VertexCredentials")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LlmParams && apiBase == other.apiBase && apiKey == other.apiKey && apiVersion == other.apiVersion && awsAccessKeyId == other.awsAccessKeyId && awsRegionName == other.awsRegionName && awsSecretAccessKey == other.awsSecretAccessKey && budgetDuration == other.budgetDuration && configurableClientsideAuthParams == other.configurableClientsideAuthParams && customLlmProvider == other.customLlmProvider && inputCostPerSecond == other.inputCostPerSecond && inputCostPerToken == other.inputCostPerToken && llmTraceId == other.llmTraceId && maxBudget == other.maxBudget && maxFileSizeMb == other.maxFileSizeMb && maxRetries == other.maxRetries && mergeReasoningContentInChoices == other.mergeReasoningContentInChoices && model == other.model && modelInfo == other.modelInfo && organization == other.organization && outputCostPerSecond == other.outputCostPerSecond && outputCostPerToken == other.outputCostPerToken && regionName == other.regionName && rpm == other.rpm && streamTimeout == other.streamTimeout && timeout == other.timeout && tpm == other.tpm && useInPassThrough == other.useInPassThrough && vertexCredentials == other.vertexCredentials && vertexLocation == other.vertexLocation && vertexProject == other.vertexProject && watsonxRegionName == other.watsonxRegionName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(apiBase, apiKey, apiVersion, awsAccessKeyId, awsRegionName, awsSecretAccessKey, budgetDuration, configurableClientsideAuthParams, customLlmProvider, inputCostPerSecond, inputCostPerToken, llmTraceId, maxBudget, maxFileSizeMb, maxRetries, mergeReasoningContentInChoices, model, modelInfo, organization, outputCostPerSecond, outputCostPerToken, regionName, rpm, streamTimeout, timeout, tpm, useInPassThrough, vertexCredentials, vertexLocation, vertexProject, watsonxRegionName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LlmParams{apiBase=$apiBase, apiKey=$apiKey, apiVersion=$apiVersion, awsAccessKeyId=$awsAccessKeyId, awsRegionName=$awsRegionName, awsSecretAccessKey=$awsSecretAccessKey, budgetDuration=$budgetDuration, configurableClientsideAuthParams=$configurableClientsideAuthParams, customLlmProvider=$customLlmProvider, inputCostPerSecond=$inputCostPerSecond, inputCostPerToken=$inputCostPerToken, llmTraceId=$llmTraceId, maxBudget=$maxBudget, maxFileSizeMb=$maxFileSizeMb, maxRetries=$maxRetries, mergeReasoningContentInChoices=$mergeReasoningContentInChoices, model=$model, modelInfo=$modelInfo, organization=$organization, outputCostPerSecond=$outputCostPerSecond, outputCostPerToken=$outputCostPerToken, regionName=$regionName, rpm=$rpm, streamTimeout=$streamTimeout, timeout=$timeout, tpm=$tpm, useInPassThrough=$useInPassThrough, vertexCredentials=$vertexCredentials, vertexLocation=$vertexLocation, vertexProject=$vertexProject, watsonxRegionName=$watsonxRegionName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UpdateDeployment && llmParams == other.llmParams && modelInfo == other.modelInfo && modelName == other.modelName && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(llmParams, modelInfo, modelName, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateDeployment{llmParams=$llmParams, modelInfo=$modelInfo, modelName=$modelName, additionalProperties=$additionalProperties}"
}
