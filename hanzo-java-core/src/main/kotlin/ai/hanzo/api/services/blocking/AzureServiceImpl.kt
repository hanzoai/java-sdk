// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.blocking

import ai.hanzo.api.core.ClientOptions
import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.handlers.errorHandler
import ai.hanzo.api.core.handlers.jsonHandler
import ai.hanzo.api.core.handlers.withErrorHandler
import ai.hanzo.api.core.http.HttpMethod
import ai.hanzo.api.core.http.HttpRequest
import ai.hanzo.api.core.http.HttpResponse.Handler
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.core.http.json
import ai.hanzo.api.core.http.parseable
import ai.hanzo.api.core.prepare
import ai.hanzo.api.models.azure.AzureCallParams
import ai.hanzo.api.models.azure.AzureCallResponse
import ai.hanzo.api.models.azure.AzureCreateParams
import ai.hanzo.api.models.azure.AzureCreateResponse
import ai.hanzo.api.models.azure.AzureDeleteParams
import ai.hanzo.api.models.azure.AzureDeleteResponse
import ai.hanzo.api.models.azure.AzurePatchParams
import ai.hanzo.api.models.azure.AzurePatchResponse
import ai.hanzo.api.models.azure.AzureUpdateParams
import ai.hanzo.api.models.azure.AzureUpdateResponse

class AzureServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AzureService {

    private val withRawResponse: AzureService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AzureService.WithRawResponse = withRawResponse

    override fun create(
        params: AzureCreateParams,
        requestOptions: RequestOptions,
    ): AzureCreateResponse =
        // post /azure/{endpoint}
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: AzureUpdateParams,
        requestOptions: RequestOptions,
    ): AzureUpdateResponse =
        // put /azure/{endpoint}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: AzureDeleteParams,
        requestOptions: RequestOptions,
    ): AzureDeleteResponse =
        // delete /azure/{endpoint}
        withRawResponse().delete(params, requestOptions).parse()

    override fun call(params: AzureCallParams, requestOptions: RequestOptions): AzureCallResponse =
        // get /azure/{endpoint}
        withRawResponse().call(params, requestOptions).parse()

    override fun patch(
        params: AzurePatchParams,
        requestOptions: RequestOptions,
    ): AzurePatchResponse =
        // patch /azure/{endpoint}
        withRawResponse().patch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AzureService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AzureCreateResponse> =
            jsonHandler<AzureCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AzureCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("azure", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<AzureUpdateResponse> =
            jsonHandler<AzureUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: AzureUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("azure", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<AzureDeleteResponse> =
            jsonHandler<AzureDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: AzureDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("azure", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val callHandler: Handler<AzureCallResponse> =
            jsonHandler<AzureCallResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun call(
            params: AzureCallParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzureCallResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("azure", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { callHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val patchHandler: Handler<AzurePatchResponse> =
            jsonHandler<AzurePatchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun patch(
            params: AzurePatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AzurePatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("azure", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { patchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
