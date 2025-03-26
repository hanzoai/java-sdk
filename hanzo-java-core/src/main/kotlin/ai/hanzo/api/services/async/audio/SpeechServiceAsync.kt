// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.audio

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.audio.speech.SpeechCreateParams
import ai.hanzo.api.models.audio.speech.SpeechCreateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface SpeechServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Same params as:
     *
     * https://platform.openai.com/docs/api-reference/audio/createSpeech
     */
    fun create(): CompletableFuture<SpeechCreateResponse> = create(SpeechCreateParams.none())

    /** @see [create] */
    fun create(
        params: SpeechCreateParams = SpeechCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpeechCreateResponse>

    /** @see [create] */
    fun create(
        params: SpeechCreateParams = SpeechCreateParams.none()
    ): CompletableFuture<SpeechCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<SpeechCreateResponse> =
        create(SpeechCreateParams.none(), requestOptions)

    /**
     * A view of [SpeechServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/audio/speech`, but is otherwise the same as
         * [SpeechServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<SpeechCreateResponse>> =
            create(SpeechCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SpeechCreateParams = SpeechCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpeechCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SpeechCreateParams = SpeechCreateParams.none()
        ): CompletableFuture<HttpResponseFor<SpeechCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SpeechCreateResponse>> =
            create(SpeechCreateParams.none(), requestOptions)
    }
}
