// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.services.async.chat.CompletionServiceAsync
import ai.hanzo.api.services.async.chat.CompletionServiceAsyncImpl
import java.util.function.Consumer

class ChatServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChatServiceAsync {

    private val withRawResponse: ChatServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val completions: CompletionServiceAsync by lazy {
        CompletionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ChatServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync =
        ChatServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun completions(): CompletionServiceAsync = completions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatServiceAsync.WithRawResponse {

        private val completions: CompletionServiceAsync.WithRawResponse by lazy {
            CompletionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChatServiceAsync.WithRawResponse =
            ChatServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun completions(): CompletionServiceAsync.WithRawResponse = completions
    }
}
