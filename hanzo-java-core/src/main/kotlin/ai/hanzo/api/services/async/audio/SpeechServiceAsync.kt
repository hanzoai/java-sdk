// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async.audio

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.audio.speech.SpeechCreateParams
import ai.hanzo.api.models.audio.speech.SpeechCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SpeechServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeechServiceAsync

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpeechServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/audio/speech`, but is otherwise the same as
         * [SpeechServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<SpeechCreateResponse>> =
            create(SpeechCreateParams.none())

        /** @see [create] */
        fun create(
            params: SpeechCreateParams = SpeechCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpeechCreateResponse>>

        /** @see [create] */
        fun create(
            params: SpeechCreateParams = SpeechCreateParams.none()
        ): CompletableFuture<HttpResponseFor<SpeechCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SpeechCreateResponse>> =
            create(SpeechCreateParams.none(), requestOptions)
    }
}
