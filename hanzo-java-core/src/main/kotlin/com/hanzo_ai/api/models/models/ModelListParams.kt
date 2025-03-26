// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.models

import com.hanzo_ai.api.core.Params
import com.hanzo_ai.api.core.http.Headers
import com.hanzo_ai.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Use `/model/info` - to get detailed model information, example - pricing, mode, etc.
 *
 * This is just for compatibility with openai projects like aider.
 */
class ModelListParams
private constructor(
    private val returnWildcardRoutes: Boolean?,
    private val teamId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun returnWildcardRoutes(): Optional<Boolean> = Optional.ofNullable(returnWildcardRoutes)

    fun teamId(): Optional<String> = Optional.ofNullable(teamId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ModelListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ModelListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModelListParams]. */
    class Builder internal constructor() {

        private var returnWildcardRoutes: Boolean? = null
        private var teamId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(modelListParams: ModelListParams) = apply {
            returnWildcardRoutes = modelListParams.returnWildcardRoutes
            teamId = modelListParams.teamId
            additionalHeaders = modelListParams.additionalHeaders.toBuilder()
            additionalQueryParams = modelListParams.additionalQueryParams.toBuilder()
        }

        fun returnWildcardRoutes(returnWildcardRoutes: Boolean?) = apply {
            this.returnWildcardRoutes = returnWildcardRoutes
        }

        /**
         * Alias for [Builder.returnWildcardRoutes].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun returnWildcardRoutes(returnWildcardRoutes: Boolean) =
            returnWildcardRoutes(returnWildcardRoutes as Boolean?)

        /**
         * Alias for calling [Builder.returnWildcardRoutes] with
         * `returnWildcardRoutes.orElse(null)`.
         */
        fun returnWildcardRoutes(returnWildcardRoutes: Optional<Boolean>) =
            returnWildcardRoutes(returnWildcardRoutes.getOrNull())

        fun teamId(teamId: String?) = apply { this.teamId = teamId }

        /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
        fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

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
         * Returns an immutable instance of [ModelListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ModelListParams =
            ModelListParams(
                returnWildcardRoutes,
                teamId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                returnWildcardRoutes?.let { put("return_wildcard_routes", it.toString()) }
                teamId?.let { put("team_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ModelListParams && returnWildcardRoutes == other.returnWildcardRoutes && teamId == other.teamId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(returnWildcardRoutes, teamId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ModelListParams{returnWildcardRoutes=$returnWildcardRoutes, teamId=$teamId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
