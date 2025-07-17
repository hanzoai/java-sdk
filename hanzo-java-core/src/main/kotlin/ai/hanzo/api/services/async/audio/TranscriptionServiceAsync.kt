// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.audio

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.audio.transcriptions.TranscriptionCreateParams
import ai.hanzo.api.models.audio.transcriptions.TranscriptionCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TranscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranscriptionServiceAsync

    /**
     * Same params as:
     *
     * https://platform.openai.com/docs/api-reference/audio/createTranscription?lang=curl
     */
    fun create(params: TranscriptionCreateParams): CompletableFuture<TranscriptionCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: TranscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TranscriptionCreateResponse>

    /**
     * A view of [TranscriptionServiceAsync] that provides access to raw HTTP responses for each
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
        ): TranscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/audio/transcriptions`, but is otherwise the
         * same as [TranscriptionServiceAsync.create].
         */
        fun create(
            params: TranscriptionCreateParams
        ): CompletableFuture<HttpResponseFor<TranscriptionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: TranscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TranscriptionCreateResponse>>
    }
}
