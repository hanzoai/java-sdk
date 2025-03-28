// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.services.async.audio.SpeechServiceAsync
import ai.hanzo.api.services.async.audio.TranscriptionServiceAsync

interface AudioServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun speech(): SpeechServiceAsync

    fun transcriptions(): TranscriptionServiceAsync

    /** A view of [AudioServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun speech(): SpeechServiceAsync.WithRawResponse

        fun transcriptions(): TranscriptionServiceAsync.WithRawResponse
    }
}
