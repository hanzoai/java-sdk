// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking.key

import ai.hanzo.api.core.ClientOptions
import java.util.function.Consumer

class RegenerateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RegenerateService {

    private val withRawResponse: RegenerateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RegenerateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegenerateService =
        RegenerateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegenerateService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegenerateService.WithRawResponse =
            RegenerateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
