// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.delete

import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.core.Params
import com.hanzo_ai.api.core.checkRequired
import com.hanzo_ai.api.core.http.Headers
import com.hanzo_ai.api.core.http.QueryParams
import com.hanzo_ai.api.models.add.IpAddress
import java.util.Objects

/** Delete Allowed Ip */
class DeleteCreateAllowedIpParams
private constructor(
    private val ipAddress: IpAddress,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun ipAddress(): IpAddress = ipAddress

    fun _additionalBodyProperties(): Map<String, JsonValue> = ipAddress._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DeleteCreateAllowedIpParams].
         *
         * The following fields are required:
         * ```java
         * .ipAddress()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DeleteCreateAllowedIpParams]. */
    class Builder internal constructor() {

        private var ipAddress: IpAddress? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(deleteCreateAllowedIpParams: DeleteCreateAllowedIpParams) = apply {
            ipAddress = deleteCreateAllowedIpParams.ipAddress
            additionalHeaders = deleteCreateAllowedIpParams.additionalHeaders.toBuilder()
            additionalQueryParams = deleteCreateAllowedIpParams.additionalQueryParams.toBuilder()
        }

        fun ipAddress(ipAddress: IpAddress) = apply { this.ipAddress = ipAddress }

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
         * Returns an immutable instance of [DeleteCreateAllowedIpParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .ipAddress()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DeleteCreateAllowedIpParams =
            DeleteCreateAllowedIpParams(
                checkRequired("ipAddress", ipAddress),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): IpAddress = ipAddress

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DeleteCreateAllowedIpParams && ipAddress == other.ipAddress && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ipAddress, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DeleteCreateAllowedIpParams{ipAddress=$ipAddress, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
