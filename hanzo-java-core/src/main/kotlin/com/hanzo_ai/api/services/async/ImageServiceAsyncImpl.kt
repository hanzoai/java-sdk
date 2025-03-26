// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.async

import com.hanzo_ai.api.core.ClientOptions
import com.hanzo_ai.api.services.async.images.GenerationServiceAsync
import com.hanzo_ai.api.services.async.images.GenerationServiceAsyncImpl

class ImageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ImageServiceAsync {

    private val withRawResponse: ImageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val generations: GenerationServiceAsync by lazy {
        GenerationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ImageServiceAsync.WithRawResponse = withRawResponse

    override fun generations(): GenerationServiceAsync = generations

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ImageServiceAsync.WithRawResponse {

        private val generations: GenerationServiceAsync.WithRawResponse by lazy {
            GenerationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun generations(): GenerationServiceAsync.WithRawResponse = generations
    }
}
