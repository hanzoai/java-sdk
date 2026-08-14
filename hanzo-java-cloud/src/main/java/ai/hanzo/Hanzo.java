package ai.hanzo;

import ai.hanzo.cloud.ApiClient;

/**
 * Endpoint and credentials, resolved once.
 *
 * <p>Everything under {@code ai.hanzo.cloud} is generated from the API document
 * hanzoai/cloud emits, by {@code scripts/generate.sh}. This file is not: it is
 * the hand-written entry point that turns the generated transport into an
 * authenticated one, and it is the only place in the module that reads the
 * environment. It sits beside the generated package rather than inside it
 * because {@code sdks.yaml} hands the generator {@code ai/hanzo/cloud} outright
 * — a file in there is deleted by the next regeneration.
 *
 * <p>It is what makes a call authenticated AT ALL. The document declares no
 * {@code securitySchemes}, so the generator registers no credential:
 * {@link ApiClient#setAccessToken} throws {@code "No OAuth2 authentication
 * configured!"}, every generated call passes an empty {@code authNames}, and a
 * client built any other way goes out bare and is refused. Setting the header
 * is also the only way to send {@code X-Org-Id}, which the KV and agents routes
 * require and which no generated signature accepts.
 *
 * <pre>
 *   ApiClient hanzo = Hanzo.client();
 *   new KeysApi(hanzo).getKeys();
 * </pre>
 */
public final class Hanzo {

    /** The Hanzo gateway. Every route is {@code <base>/v1/<service>/...}. */
    public static final String DEFAULT_BASE_URL = "https://api.hanzo.ai";

    private Hanzo() {
    }

    /**
     * A client configured from the environment: {@code HANZO_API_KEY},
     * {@code HANZO_BASE_URL} (default {@link #DEFAULT_BASE_URL}) and
     * {@code HANZO_ORG_ID}.
     *
     * @return the client every generated API class takes
     */
    public static ApiClient client() {
        return client(env("HANZO_API_KEY"), env("HANZO_BASE_URL"), env("HANZO_ORG_ID"));
    }

    /**
     * A client for one tenant, for a program that serves more than one and so
     * cannot read a single set of variables.
     *
     * <p>A missing key sends no {@code Authorization} header rather than
     * raising: the API refusing is the truth, and inventing a client-side error
     * hides which routes need a credential and which do not.
     *
     * @param apiKey  bearer credential — an IAM JWT or an {@code hk-} Cloud API
     *                key; null or empty sends none
     * @param baseUrl gateway to talk to; null or empty means
     *                {@link #DEFAULT_BASE_URL}
     * @param orgId   org scope, sent as {@code X-Org-Id}; null or empty sends
     *                none, and the tenant comes from the token's {@code owner}
     *                claim
     * @return the client every generated API class takes
     */
    public static ApiClient client(String apiKey, String baseUrl, String orgId) {
        ApiClient client = new ApiClient();
        client.setBasePath(baseUrl == null || baseUrl.isEmpty() ? DEFAULT_BASE_URL : baseUrl);
        if (apiKey != null && !apiKey.isEmpty()) {
            client.addDefaultHeader("Authorization", "Bearer " + apiKey);
        }
        if (orgId != null && !orgId.isEmpty()) {
            client.addDefaultHeader("X-Org-Id", orgId);
        }
        return client;
    }

    private static String env(String name) {
        String value = System.getenv(name);
        return value == null || value.trim().isEmpty() ? null : value;
    }
}
