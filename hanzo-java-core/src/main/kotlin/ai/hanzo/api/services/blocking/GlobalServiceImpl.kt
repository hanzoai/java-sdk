// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.services.blocking.global.SpendService
import ai.hanzo.api.services.blocking.global.SpendServiceImpl

class GlobalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GlobalService {

    private val withRawResponse: GlobalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val spend: SpendService by lazy { SpendServiceImpl(clientOptions) }

    override fun withRawResponse(): GlobalService.WithRawResponse = withRawResponse

    override fun spend(): SpendService = spend

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalService.WithRawResponse {

        private val spend: SpendService.WithRawResponse by lazy {
            SpendServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun spend(): SpendService.WithRawResponse = spend
    }
}
