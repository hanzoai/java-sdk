package ai.hanzo.cloud.examples;

import ai.hanzo.cloud.ApiClient;

/**
 * The one place the six examples resolve their environment.
 *
 * <p>{@code HANZO_API_KEY} is required, {@code HANZO_BASE_URL} defaults to
 * https://api.hanzo.ai, and {@code HANZO_ORG_ID} carries the org that the KV and
 * agent routes refuse to answer without. Every flow calls {@link #client()};
 * none of them reads {@code System.getenv} itself.
 *
 * <p>The bearer goes on as a DEFAULT HEADER rather than through
 * {@code ApiClient.setAccessToken}. The document hanzoai/cloud emits declares no
 * {@code securitySchemes}, so the generator registers no authentication and that
 * setter is a stub that throws "No OAuth2 authentication configured!"; the
 * generated calls likewise pass an empty {@code authNames}, which is why a
 * client that does not set the header itself sends no credential and 401s on
 * every route. Same correction the Kotlin seam makes with an interceptor, for
 * the same reason. It becomes a one-line delete the day cloud declares its
 * scheme.
 */
final class Hanzo {

    static final String DEFAULT_BASE_URL = "https://api.hanzo.ai";

    private Hanzo() {
    }

    /** A client authenticated as {@code HANZO_API_KEY} against {@code HANZO_BASE_URL}. */
    static ApiClient client() {
        String key = System.getenv("HANZO_API_KEY");
        if (key == null || key.isBlank()) {
            throw new IllegalStateException("HANZO_API_KEY is not set");
        }

        ApiClient client = new ApiClient();
        client.setBasePath(baseUrl());
        client.addDefaultHeader("Authorization", "Bearer " + key);

        // Sent on every request: harmless where the tenant comes from the token,
        // required where it does not.
        String org = System.getenv("HANZO_ORG_ID");
        if (org != null && !org.isBlank()) {
            client.addDefaultHeader("X-Org-Id", org);
        }
        return client;
    }

    static String baseUrl() {
        String url = System.getenv("HANZO_BASE_URL");
        return url == null || url.isBlank() ? DEFAULT_BASE_URL : url;
    }

    /** The model the chat and agent flows ask for. */
    static String model() {
        String model = System.getenv("HANZO_MODEL");
        return model == null || model.isBlank() ? "zen-1" : model;
    }
}
