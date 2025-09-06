// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.spend

import ai.hanzo.api.core.Params
import ai.hanzo.api.core.http.Headers
import ai.hanzo.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * View all spend logs, if request_id is provided, only logs for that request_id will be returned
 *
 * Example Request for all logs
 *
 * ```
 * curl -X GET "http://0.0.0.0:8000/spend/logs" -H "Authorization: Bearer sk-1234"
 * ```
 *
 * Example Request for specific request_id
 *
 * ```
 * curl -X GET "http://0.0.0.0:8000/spend/logs?request_id=chatcmpl-6dcb2540-d3d7-4e49-bb27-291f863f112e" -H "Authorization: Bearer sk-1234"
 * ```
 *
 * Example Request for specific api_key
 *
 * ```
 * curl -X GET "http://0.0.0.0:8000/spend/logs?api_key=sk-Fn8Ej39NkBQmUagFEoUWPQ" -H "Authorization: Bearer sk-1234"
 * ```
 *
 * Example Request for specific user_id
 *
 * ```
 * curl -X GET "http://0.0.0.0:8000/spend/logs?user_id=z@hanzo.ai" -H "Authorization: Bearer sk-1234"
 * ```
 */
class SpendListLogsParams
private constructor(
    private val apiKey: String?,
    private val endDate: String?,
    private val requestId: String?,
    private val startDate: String?,
    private val userId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Get spend logs based on api key */
    fun apiKey(): Optional<String> = Optional.ofNullable(apiKey)

    /** Time till which to view key spend */
    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    /**
     * request_id to get spend logs for specific request_id. If none passed then pass spend logs for
     * all requests
     */
    fun requestId(): Optional<String> = Optional.ofNullable(requestId)

    /** Time from which to start viewing key spend */
    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    /** Get spend logs based on user_id */
    fun userId(): Optional<String> = Optional.ofNullable(userId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SpendListLogsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SpendListLogsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpendListLogsParams]. */
    class Builder internal constructor() {

        private var apiKey: String? = null
        private var endDate: String? = null
        private var requestId: String? = null
        private var startDate: String? = null
        private var userId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(spendListLogsParams: SpendListLogsParams) = apply {
            apiKey = spendListLogsParams.apiKey
            endDate = spendListLogsParams.endDate
            requestId = spendListLogsParams.requestId
            startDate = spendListLogsParams.startDate
            userId = spendListLogsParams.userId
            additionalHeaders = spendListLogsParams.additionalHeaders.toBuilder()
            additionalQueryParams = spendListLogsParams.additionalQueryParams.toBuilder()
        }

        /** Get spend logs based on api key */
        fun apiKey(apiKey: String?) = apply { this.apiKey = apiKey }

        /** Alias for calling [Builder.apiKey] with `apiKey.orElse(null)`. */
        fun apiKey(apiKey: Optional<String>) = apiKey(apiKey.getOrNull())

        /** Time till which to view key spend */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /**
         * request_id to get spend logs for specific request_id. If none passed then pass spend logs
         * for all requests
         */
        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        /** Alias for calling [Builder.requestId] with `requestId.orElse(null)`. */
        fun requestId(requestId: Optional<String>) = requestId(requestId.getOrNull())

        /** Time from which to start viewing key spend */
        fun startDate(startDate: String?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

        /** Get spend logs based on user_id */
        fun userId(userId: String?) = apply { this.userId = userId }

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

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
         * Returns an immutable instance of [SpendListLogsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SpendListLogsParams =
            SpendListLogsParams(
                apiKey,
                endDate,
                requestId,
                startDate,
                userId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                apiKey?.let { put("api_key", it) }
                endDate?.let { put("end_date", it) }
                requestId?.let { put("request_id", it) }
                startDate?.let { put("start_date", it) }
                userId?.let { put("user_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendListLogsParams &&
            apiKey == other.apiKey &&
            endDate == other.endDate &&
            requestId == other.requestId &&
            startDate == other.startDate &&
            userId == other.userId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            apiKey,
            endDate,
            requestId,
            startDate,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SpendListLogsParams{apiKey=$apiKey, endDate=$endDate, requestId=$requestId, startDate=$startDate, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
