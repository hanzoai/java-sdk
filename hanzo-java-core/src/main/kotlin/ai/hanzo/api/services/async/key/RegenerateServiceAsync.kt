// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.key

import ai.hanzo.api.core.ClientOptions
import java.util.function.Consumer

interface RegenerateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegenerateServiceAsync

    /**
     * A view of [RegenerateServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegenerateServiceAsync.WithRawResponse
    }
}
