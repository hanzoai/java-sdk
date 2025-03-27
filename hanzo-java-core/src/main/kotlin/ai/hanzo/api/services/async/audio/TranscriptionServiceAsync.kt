// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.audio

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.audio.transcriptions.TranscriptionCreateParams
import ai.hanzo.api.models.audio.transcriptions.TranscriptionCreateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface TranscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
         * Returns a raw HTTP response for `post /v1/audio/transcriptions`, but is otherwise the
         * same as [TranscriptionServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: TranscriptionCreateParams
        ): CompletableFuture<HttpResponseFor<TranscriptionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: TranscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TranscriptionCreateResponse>>
    }
}
