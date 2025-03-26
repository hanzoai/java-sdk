// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hanzo_ai.api.core.RequestOptions
import com.hanzo_ai.api.core.http.HttpResponseFor
import com.hanzo_ai.api.models.key.GenerateKeyResponse
import com.hanzo_ai.api.models.key.KeyBlockParams
import com.hanzo_ai.api.models.key.KeyBlockResponse
import com.hanzo_ai.api.models.key.KeyCheckHealthParams
import com.hanzo_ai.api.models.key.KeyCheckHealthResponse
import com.hanzo_ai.api.models.key.KeyDeleteParams
import com.hanzo_ai.api.models.key.KeyDeleteResponse
import com.hanzo_ai.api.models.key.KeyGenerateParams
import com.hanzo_ai.api.models.key.KeyListParams
import com.hanzo_ai.api.models.key.KeyListResponse
import com.hanzo_ai.api.models.key.KeyRegenerateByKeyParams
import com.hanzo_ai.api.models.key.KeyRetrieveInfoParams
import com.hanzo_ai.api.models.key.KeyRetrieveInfoResponse
import com.hanzo_ai.api.models.key.KeyUnblockParams
import com.hanzo_ai.api.models.key.KeyUnblockResponse
import com.hanzo_ai.api.models.key.KeyUpdateParams
import com.hanzo_ai.api.models.key.KeyUpdateResponse
import com.hanzo_ai.api.services.blocking.key.RegenerateService
import java.util.Optional

interface KeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun regenerate(): RegenerateService

    /**
     * Update an existing API key's parameters.
     *
     * Parameters:
     * - key: str - The key to update
     * - key_alias: Optional[str] - User-friendly key alias
     * - user_id: Optional[str] - User ID associated with key
     * - team_id: Optional[str] - Team ID associated with key
     * - budget_id: Optional[str] - The budget id associated with the key. Created by calling
     *   `/budget/new`.
     * - models: Optional[list] - Model_name's a user is allowed to call
     * - tags: Optional[List[str]] - Tags for organizing keys (Enterprise only)
     * - enforced_params: Optional[List[str]] - List of enforced params for the key (Enterprise
     *   only).
     *   [Docs](https://docs.llm.ai/docs/proxy/enterprise#enforce-required-params-for-llm-requests)
     * - spend: Optional[float] - Amount spent by key
     * - max_budget: Optional[float] - Max budget for key
     * - model_max_budget: Optional[Dict[str, BudgetConfig]] - Model-specific budgets {"gpt-4":
     *   {"budget_limit": 0.0005, "time_period": "30d"}}
     * - budget_duration: Optional[str] - Budget reset period ("30d", "1h", etc.)
     * - soft_budget: Optional[float] - [TODO] Soft budget limit (warning vs. hard stop). Will
     *   trigger a slack alert when this soft budget is reached.
     * - max_parallel_requests: Optional[int] - Rate limit for parallel requests
     * - metadata: Optional[dict] - Metadata for key. Example {"team": "core-infra", "app": "app2"}
     * - tpm_limit: Optional[int] - Tokens per minute limit
     * - rpm_limit: Optional[int] - Requests per minute limit
     * - model_rpm_limit: Optional[dict] - Model-specific RPM limits {"gpt-4": 100, "claude-v1":
     *   200}
     * - model_tpm_limit: Optional[dict] - Model-specific TPM limits {"gpt-4": 100000, "claude-v1":
     *   200000}
     * - allowed_cache_controls: Optional[list] - List of allowed cache control values
     * - duration: Optional[str] - Key validity duration ("30d", "1h", etc.)
     * - permissions: Optional[dict] - Key-specific permissions
     * - send_invite_email: Optional[bool] - Send invite email to user_id
     * - guardrails: Optional[List[str]] - List of active guardrails for the key
     * - blocked: Optional[bool] - Whether the key is blocked
     * - aliases: Optional[dict] - Model aliases for the
     *   key - [Docs](https://llm.vercel.app/docs/proxy/virtual_keys#model-aliases)
     * - config: Optional[dict] - [DEPRECATED PARAM] Key-specific config.
     * - temp_budget_increase: Optional[float] - Temporary budget increase for the key (Enterprise
     *   only).
     * - temp_budget_expiry: Optional[str] - Expiry time for the temporary budget increase
     *   (Enterprise only).
     *
     * Example:
     * ```bash
     * curl --location 'http://0.0.0.0:4000/key/update'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "key": "sk-1234",
     *     "key_alias": "my-key",
     *     "user_id": "user-1234",
     *     "team_id": "team-1234",
     *     "max_budget": 100,
     *     "metadata": {"any_key": "any-val"},
     * }'
     * ```
     */
    fun update(params: KeyUpdateParams): KeyUpdateResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: KeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyUpdateResponse

    /**
     * List all keys for a given user / team / organization.
     *
     * Returns: { "keys": List[str] or List[UserAPIKeyAuth], "total_count": int, "current_page":
     * int, "total_pages": int, }
     */
    fun list(): KeyListResponse = list(KeyListParams.none())

    /** @see [list] */
    fun list(
        params: KeyListParams = KeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyListResponse

    /** @see [list] */
    fun list(params: KeyListParams = KeyListParams.none()): KeyListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): KeyListResponse =
        list(KeyListParams.none(), requestOptions)

    /**
     * Delete a key from the key management system.
     *
     * Parameters::
     * - keys (List[str]): A list of keys or hashed keys to delete. Example {"keys":
     *   ["sk-QWrxEynunsNpV1zT48HIrw", "837e17519f44683334df5291321d97b8bf1098cd490e49e215f6fea935aa28be"]}
     * - key_aliases (List[str]): A list of key aliases to delete. Can be passed instead of
     *   `keys`.Example {"key_aliases": ["alias1", "alias2"]}
     *
     * Returns:
     * - deleted_keys (List[str]): A list of deleted keys. Example {"deleted_keys":
     *   ["sk-QWrxEynunsNpV1zT48HIrw", "837e17519f44683334df5291321d97b8bf1098cd490e49e215f6fea935aa28be"]}
     *
     * Example:
     * ```bash
     * curl --location 'http://0.0.0.0:4000/key/delete'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "keys": ["sk-QWrxEynunsNpV1zT48HIrw"]
     * }'
     * ```
     *
     * Raises: HTTPException: If an error occurs during key deletion.
     */
    fun delete(): KeyDeleteResponse = delete(KeyDeleteParams.none())

    /** @see [delete] */
    fun delete(
        params: KeyDeleteParams = KeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyDeleteResponse

    /** @see [delete] */
    fun delete(params: KeyDeleteParams = KeyDeleteParams.none()): KeyDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(requestOptions: RequestOptions): KeyDeleteResponse =
        delete(KeyDeleteParams.none(), requestOptions)

    /**
     * Block an Virtual key from making any requests.
     *
     * Parameters:
     * - key: str - The key to block. Can be either the unhashed key (sk-...) or the hashed key
     *   value
     *
     * Example:
     * ```bash
     * curl --location 'http://0.0.0.0:4000/key/block'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "key": "sk-Fn8Ej39NxjAXrvpUGKghGw"
     * }'
     * ```
     *
     * Note: This is an admin-only endpoint. Only proxy admins can block keys.
     */
    fun block(params: KeyBlockParams): Optional<KeyBlockResponse> =
        block(params, RequestOptions.none())

    /** @see [block] */
    fun block(
        params: KeyBlockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<KeyBlockResponse>

    /**
     * Check the health of the key
     *
     * Checks:
     * - If key based logging is configured correctly - sends a test log
     *
     * Usage
     *
     * Pass the key in the request header
     *
     * ```bash
     * curl -X POST "http://localhost:4000/key/health"      -H "Authorization: Bearer sk-1234"      -H "Content-Type: application/json"
     * ```
     *
     * Response when logging callbacks are setup correctly:
     * ```json
     * {
     *   "key": "healthy",
     *   "logging_callbacks": {
     *     "callbacks": ["gcs_bucket"],
     *     "status": "healthy",
     *     "details": "No logger exceptions triggered, system is healthy. Manually check if logs were sent to ['gcs_bucket']"
     *   }
     * }
     * ```
     *
     * Response when logging callbacks are not setup correctly:
     * ```json
     * {
     *   "key": "unhealthy",
     *   "logging_callbacks": {
     *     "callbacks": ["gcs_bucket"],
     *     "status": "unhealthy",
     *     "details": "Logger exceptions triggered, system is unhealthy: Failed to load vertex credentials. Check to see if credentials containing partial/invalid information."
     *   }
     * }
     * ```
     */
    fun checkHealth(): KeyCheckHealthResponse = checkHealth(KeyCheckHealthParams.none())

    /** @see [checkHealth] */
    fun checkHealth(
        params: KeyCheckHealthParams = KeyCheckHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyCheckHealthResponse

    /** @see [checkHealth] */
    fun checkHealth(
        params: KeyCheckHealthParams = KeyCheckHealthParams.none()
    ): KeyCheckHealthResponse = checkHealth(params, RequestOptions.none())

    /** @see [checkHealth] */
    fun checkHealth(requestOptions: RequestOptions): KeyCheckHealthResponse =
        checkHealth(KeyCheckHealthParams.none(), requestOptions)

    /**
     * Generate an API key based on the provided data.
     *
     * Docs: https://docs.llm.ai/docs/proxy/virtual_keys
     *
     * Parameters:
     * - duration: Optional[str] - Specify the length of time the token is valid for. You can set
     *   duration as seconds ("30s"), minutes ("30m"), hours ("30h"), days ("30d").
     * - key_alias: Optional[str] - User defined key alias
     * - key: Optional[str] - User defined key value. If not set, a 16-digit unique sk-key is
     *   created for you.
     * - team_id: Optional[str] - The team id of the key
     * - user_id: Optional[str] - The user id of the key
     * - budget_id: Optional[str] - The budget id associated with the key. Created by calling
     *   `/budget/new`.
     * - models: Optional[list] - Model_name's a user is allowed to call. (if empty, key is allowed
     *   to call all models)
     * - aliases: Optional[dict] - Any alias mappings, on top of anything in the config.yaml model
     *   list. - https://docs.llm.ai/docs/proxy/virtual_keys#managing-auth---upgradedowngrade-models
     * - config: Optional[dict] - any key-specific configs, overrides config in config.yaml
     * - spend: Optional[int] - Amount spent by key. Default is 0. Will be updated by proxy whenever
     *   key is used. https://docs.llm.ai/docs/proxy/virtual_keys#managing-auth---tracking-spend
     * - send_invite_email: Optional[bool] - Whether to send an invite email to the user_id, with
     *   the generate key
     * - max_budget: Optional[float] - Specify max budget for a given key.
     * - budget_duration: Optional[str] - Budget is reset at the end of specified duration. If not
     *   set, budget is never reset. You can set duration as seconds ("30s"), minutes ("30m"), hours
     *   ("30h"), days ("30d").
     * - max_parallel_requests: Optional[int] - Rate limit a user based on the number of parallel
     *   requests. Raises 429 error, if user's parallel requests > x.
     * - metadata: Optional[dict] - Metadata for key, store information for key. Example metadata =
     *   {"team": "core-infra", "app": "app2", "email": "z@hanzo.ai" }
     * - guardrails: Optional[List[str]] - List of active guardrails for the key
     * - permissions: Optional[dict] - key-specific permissions. Currently just used for turning off
     *   pii masking (if connected). Example - {"pii": false}
     * - model_max_budget: Optional[Dict[str, BudgetConfig]] - Model-specific budgets {"gpt-4":
     *   {"budget_limit": 0.0005, "time_period": "30d"}}}. IF null or {} then no model specific
     *   budget.
     * - model_rpm_limit: Optional[dict] - key-specific model rpm limit. Example -
     *   {"text-davinci-002": 1000, "gpt-3.5-turbo": 1000}. IF null or {} then no model specific rpm
     *   limit.
     * - model_tpm_limit: Optional[dict] - key-specific model tpm limit. Example -
     *   {"text-davinci-002": 1000, "gpt-3.5-turbo": 1000}. IF null or {} then no model specific tpm
     *   limit.
     * - allowed_cache_controls: Optional[list] - List of allowed cache control values.
     *   Example - ["no-cache", "no-store"]. See all values -
     *   https://docs.llm.ai/docs/proxy/caching#turn-on--off-caching-per-request
     * - blocked: Optional[bool] - Whether the key is blocked.
     * - rpm_limit: Optional[int] - Specify rpm limit for a given key (Requests per minute)
     * - tpm_limit: Optional[int] - Specify tpm limit for a given key (Tokens per minute)
     * - soft_budget: Optional[float] - Specify soft budget for a given key. Will trigger a slack
     *   alert when this soft budget is reached.
     * - tags: Optional[List[str]] - Tags for
     *   [tracking spend](https://llm.vercel.app/docs/proxy/enterprise#tracking-spend-for-custom-tags)
     *   and/or doing [tag-based routing](https://llm.vercel.app/docs/proxy/tag_routing).
     * - enforced_params: Optional[List[str]] - List of enforced params for the key (Enterprise
     *   only).
     *   [Docs](https://docs.llm.ai/docs/proxy/enterprise#enforce-required-params-for-llm-requests)
     *
     * Examples:
     * 1. Allow users to turn on/off pii masking
     *
     * ```bash
     * curl --location 'http://0.0.0.0:4000/key/generate'         --header 'Authorization: Bearer sk-1234'         --header 'Content-Type: application/json'         --data '{
     *         "permissions": {"allow_pii_controls": true}
     * }'
     * ```
     *
     * Returns:
     * - key: (str) The generated api key
     * - expires: (datetime) Datetime object for when key expires.
     * - user_id: (str) Unique user id - used for tracking spend across multiple keys for same user
     *   id.
     */
    fun generate(): GenerateKeyResponse = generate(KeyGenerateParams.none())

    /** @see [generate] */
    fun generate(
        params: KeyGenerateParams = KeyGenerateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GenerateKeyResponse

    /** @see [generate] */
    fun generate(params: KeyGenerateParams = KeyGenerateParams.none()): GenerateKeyResponse =
        generate(params, RequestOptions.none())

    /** @see [generate] */
    fun generate(requestOptions: RequestOptions): GenerateKeyResponse =
        generate(KeyGenerateParams.none(), requestOptions)

    /**
     * Regenerate an existing API key while optionally updating its parameters.
     *
     * Parameters:
     * - key: str (path parameter) - The key to regenerate
     * - data: Optional[RegenerateKeyRequest] - Request body containing optional parameters to
     *   update
     *     - key_alias: Optional[str] - User-friendly key alias
     *     - user_id: Optional[str] - User ID associated with key
     *     - team_id: Optional[str] - Team ID associated with key
     *     - models: Optional[list] - Model_name's a user is allowed to call
     *     - tags: Optional[List[str]] - Tags for organizing keys (Enterprise only)
     *     - spend: Optional[float] - Amount spent by key
     *     - max_budget: Optional[float] - Max budget for key
     *     - model_max_budget: Optional[Dict[str, BudgetConfig]] - Model-specific budgets {"gpt-4":
     *       {"budget_limit": 0.0005, "time_period": "30d"}}
     *     - budget_duration: Optional[str] - Budget reset period ("30d", "1h", etc.)
     *     - soft_budget: Optional[float] - Soft budget limit (warning vs. hard stop). Will trigger
     *       a slack alert when this soft budget is reached.
     *     - max_parallel_requests: Optional[int] - Rate limit for parallel requests
     *     - metadata: Optional[dict] - Metadata for key. Example {"team": "core-infra", "app":
     *       "app2"}
     *     - tpm_limit: Optional[int] - Tokens per minute limit
     *     - rpm_limit: Optional[int] - Requests per minute limit
     *     - model_rpm_limit: Optional[dict] - Model-specific RPM limits {"gpt-4": 100, "claude-v1":
     *       200}
     *     - model_tpm_limit: Optional[dict] - Model-specific TPM limits {"gpt-4": 100000,
     *       "claude-v1": 200000}
     *     - allowed_cache_controls: Optional[list] - List of allowed cache control values
     *     - duration: Optional[str] - Key validity duration ("30d", "1h", etc.)
     *     - permissions: Optional[dict] - Key-specific permissions
     *     - guardrails: Optional[List[str]] - List of active guardrails for the key
     *     - blocked: Optional[bool] - Whether the key is blocked
     *
     * Returns:
     * - GenerateKeyResponse containing the new key and its updated parameters
     *
     * Example:
     * ```bash
     * curl --location --request POST 'http://localhost:4000/key/sk-1234/regenerate'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data-raw '{
     *     "max_budget": 100,
     *     "metadata": {"team": "core-infra"},
     *     "models": ["gpt-4", "gpt-3.5-turbo"]
     * }'
     * ```
     *
     * Note: This is an Enterprise feature. It requires a premium license to use.
     */
    fun regenerateByKey(params: KeyRegenerateByKeyParams): Optional<GenerateKeyResponse> =
        regenerateByKey(params, RequestOptions.none())

    /** @see [regenerateByKey] */
    fun regenerateByKey(
        params: KeyRegenerateByKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<GenerateKeyResponse>

    /**
     * Retrieve information about a key. Parameters: key: Optional[str] = Query parameter
     * representing the key in the request user_api_key_dict: UserAPIKeyAuth = Dependency
     * representing the user's API key Returns: Dict containing the key and its associated
     * information
     *
     * Example Curl:
     * ```
     * curl -X GET "http://0.0.0.0:4000/key/info?key=sk-02Wr4IAlN3NvPXvL5JVvDA" -H "Authorization: Bearer sk-1234"
     * ```
     *
     * Example Curl - if no key is passed, it will use the Key Passed in Authorization Header
     *
     * ```
     * curl -X GET "http://0.0.0.0:4000/key/info" -H "Authorization: Bearer sk-02Wr4IAlN3NvPXvL5JVvDA"
     * ```
     */
    fun retrieveInfo(): KeyRetrieveInfoResponse = retrieveInfo(KeyRetrieveInfoParams.none())

    /** @see [retrieveInfo] */
    fun retrieveInfo(
        params: KeyRetrieveInfoParams = KeyRetrieveInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyRetrieveInfoResponse

    /** @see [retrieveInfo] */
    fun retrieveInfo(
        params: KeyRetrieveInfoParams = KeyRetrieveInfoParams.none()
    ): KeyRetrieveInfoResponse = retrieveInfo(params, RequestOptions.none())

    /** @see [retrieveInfo] */
    fun retrieveInfo(requestOptions: RequestOptions): KeyRetrieveInfoResponse =
        retrieveInfo(KeyRetrieveInfoParams.none(), requestOptions)

    /**
     * Unblock a Virtual key to allow it to make requests again.
     *
     * Parameters:
     * - key: str - The key to unblock. Can be either the unhashed key (sk-...) or the hashed key
     *   value
     *
     * Example:
     * ```bash
     * curl --location 'http://0.0.0.0:4000/key/unblock'     --header 'Authorization: Bearer sk-1234'     --header 'Content-Type: application/json'     --data '{
     *     "key": "sk-Fn8Ej39NxjAXrvpUGKghGw"
     * }'
     * ```
     *
     * Note: This is an admin-only endpoint. Only proxy admins can unblock keys.
     */
    fun unblock(params: KeyUnblockParams): KeyUnblockResponse =
        unblock(params, RequestOptions.none())

    /** @see [unblock] */
    fun unblock(
        params: KeyUnblockParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyUnblockResponse

    /** A view of [KeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun regenerate(): RegenerateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /key/update`, but is otherwise the same as
         * [KeyService.update].
         */
        @MustBeClosed
        fun update(params: KeyUpdateParams): HttpResponseFor<KeyUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: KeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /key/list`, but is otherwise the same as
         * [KeyService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<KeyListResponse> = list(KeyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: KeyListParams = KeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(params: KeyListParams = KeyListParams.none()): HttpResponseFor<KeyListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<KeyListResponse> =
            list(KeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /key/delete`, but is otherwise the same as
         * [KeyService.delete].
         */
        @MustBeClosed
        fun delete(): HttpResponseFor<KeyDeleteResponse> = delete(KeyDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: KeyDeleteParams = KeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: KeyDeleteParams = KeyDeleteParams.none()
        ): HttpResponseFor<KeyDeleteResponse> = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(requestOptions: RequestOptions): HttpResponseFor<KeyDeleteResponse> =
            delete(KeyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /key/block`, but is otherwise the same as
         * [KeyService.block].
         */
        @MustBeClosed
        fun block(params: KeyBlockParams): HttpResponseFor<Optional<KeyBlockResponse>> =
            block(params, RequestOptions.none())

        /** @see [block] */
        @MustBeClosed
        fun block(
            params: KeyBlockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<KeyBlockResponse>>

        /**
         * Returns a raw HTTP response for `post /key/health`, but is otherwise the same as
         * [KeyService.checkHealth].
         */
        @MustBeClosed
        fun checkHealth(): HttpResponseFor<KeyCheckHealthResponse> =
            checkHealth(KeyCheckHealthParams.none())

        /** @see [checkHealth] */
        @MustBeClosed
        fun checkHealth(
            params: KeyCheckHealthParams = KeyCheckHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyCheckHealthResponse>

        /** @see [checkHealth] */
        @MustBeClosed
        fun checkHealth(
            params: KeyCheckHealthParams = KeyCheckHealthParams.none()
        ): HttpResponseFor<KeyCheckHealthResponse> = checkHealth(params, RequestOptions.none())

        /** @see [checkHealth] */
        @MustBeClosed
        fun checkHealth(requestOptions: RequestOptions): HttpResponseFor<KeyCheckHealthResponse> =
            checkHealth(KeyCheckHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /key/generate`, but is otherwise the same as
         * [KeyService.generate].
         */
        @MustBeClosed
        fun generate(): HttpResponseFor<GenerateKeyResponse> = generate(KeyGenerateParams.none())

        /** @see [generate] */
        @MustBeClosed
        fun generate(
            params: KeyGenerateParams = KeyGenerateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GenerateKeyResponse>

        /** @see [generate] */
        @MustBeClosed
        fun generate(
            params: KeyGenerateParams = KeyGenerateParams.none()
        ): HttpResponseFor<GenerateKeyResponse> = generate(params, RequestOptions.none())

        /** @see [generate] */
        @MustBeClosed
        fun generate(requestOptions: RequestOptions): HttpResponseFor<GenerateKeyResponse> =
            generate(KeyGenerateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /key/{key}/regenerate`, but is otherwise the same
         * as [KeyService.regenerateByKey].
         */
        @MustBeClosed
        fun regenerateByKey(
            params: KeyRegenerateByKeyParams
        ): HttpResponseFor<Optional<GenerateKeyResponse>> =
            regenerateByKey(params, RequestOptions.none())

        /** @see [regenerateByKey] */
        @MustBeClosed
        fun regenerateByKey(
            params: KeyRegenerateByKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<GenerateKeyResponse>>

        /**
         * Returns a raw HTTP response for `get /key/info`, but is otherwise the same as
         * [KeyService.retrieveInfo].
         */
        @MustBeClosed
        fun retrieveInfo(): HttpResponseFor<KeyRetrieveInfoResponse> =
            retrieveInfo(KeyRetrieveInfoParams.none())

        /** @see [retrieveInfo] */
        @MustBeClosed
        fun retrieveInfo(
            params: KeyRetrieveInfoParams = KeyRetrieveInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyRetrieveInfoResponse>

        /** @see [retrieveInfo] */
        @MustBeClosed
        fun retrieveInfo(
            params: KeyRetrieveInfoParams = KeyRetrieveInfoParams.none()
        ): HttpResponseFor<KeyRetrieveInfoResponse> = retrieveInfo(params, RequestOptions.none())

        /** @see [retrieveInfo] */
        @MustBeClosed
        fun retrieveInfo(requestOptions: RequestOptions): HttpResponseFor<KeyRetrieveInfoResponse> =
            retrieveInfo(KeyRetrieveInfoParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /key/unblock`, but is otherwise the same as
         * [KeyService.unblock].
         */
        @MustBeClosed
        fun unblock(params: KeyUnblockParams): HttpResponseFor<KeyUnblockResponse> =
            unblock(params, RequestOptions.none())

        /** @see [unblock] */
        @MustBeClosed
        fun unblock(
            params: KeyUnblockParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyUnblockResponse>
    }
}
