// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.services.async

import ai.hanzo.api.core.RequestOptions
import ai.hanzo.api.core.http.HttpResponseFor
import ai.hanzo.api.models.credentials.CredentialCreateParams
import ai.hanzo.api.models.credentials.CredentialCreateResponse
import ai.hanzo.api.models.credentials.CredentialDeleteParams
import ai.hanzo.api.models.credentials.CredentialDeleteResponse
import ai.hanzo.api.models.credentials.CredentialListParams
import ai.hanzo.api.models.credentials.CredentialListResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface CredentialServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * [BETA] endpoint. This might change unexpectedly. Stores credential in DB. Reloads credentials
     * in memory.
     */
    fun create(params: CredentialCreateParams): CompletableFuture<CredentialCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialCreateResponse>

    /** [BETA] endpoint. This might change unexpectedly. */
    fun list(): CompletableFuture<CredentialListResponse> = list(CredentialListParams.none())

    /** @see [list] */
    fun list(
        params: CredentialListParams = CredentialListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialListResponse>

    /** @see [list] */
    fun list(
        params: CredentialListParams = CredentialListParams.none()
    ): CompletableFuture<CredentialListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CredentialListResponse> =
        list(CredentialListParams.none(), requestOptions)

    /** [BETA] endpoint. This might change unexpectedly. */
    fun delete(credentialName: String): CompletableFuture<CredentialDeleteResponse> =
        delete(credentialName, CredentialDeleteParams.none())

    /** @see [delete] */
    fun delete(
        credentialName: String,
        params: CredentialDeleteParams = CredentialDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialDeleteResponse> =
        delete(params.toBuilder().credentialName(credentialName).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        credentialName: String,
        params: CredentialDeleteParams = CredentialDeleteParams.none(),
    ): CompletableFuture<CredentialDeleteResponse> =
        delete(credentialName, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CredentialDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialDeleteResponse>

    /** @see [delete] */
    fun delete(params: CredentialDeleteParams): CompletableFuture<CredentialDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        credentialName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CredentialDeleteResponse> =
        delete(credentialName, CredentialDeleteParams.none(), requestOptions)

    /**
     * A view of [CredentialServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /credentials`, but is otherwise the same as
         * [CredentialServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CredentialCreateParams
        ): CompletableFuture<HttpResponseFor<CredentialCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /credentials`, but is otherwise the same as
         * [CredentialServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CredentialListResponse>> =
            list(CredentialListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CredentialListParams = CredentialListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CredentialListParams = CredentialListParams.none()
        ): CompletableFuture<HttpResponseFor<CredentialListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CredentialListResponse>> =
            list(CredentialListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /credentials/{credential_name}`, but is otherwise
         * the same as [CredentialServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            credentialName: String
        ): CompletableFuture<HttpResponseFor<CredentialDeleteResponse>> =
            delete(credentialName, CredentialDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            credentialName: String,
            params: CredentialDeleteParams = CredentialDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialDeleteResponse>> =
            delete(params.toBuilder().credentialName(credentialName).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            credentialName: String,
            params: CredentialDeleteParams = CredentialDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CredentialDeleteResponse>> =
            delete(credentialName, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CredentialDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialDeleteResponse>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CredentialDeleteParams
        ): CompletableFuture<HttpResponseFor<CredentialDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            credentialName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CredentialDeleteResponse>> =
            delete(credentialName, CredentialDeleteParams.none(), requestOptions)
    }
}
