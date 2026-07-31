package ai.hanzo.cloud.examples;

import ai.hanzo.cloud.ApiClient;

import java.util.function.Consumer;

/**
 * The one place the six examples resolve their environment.
 *
 * <p>{@code HANZO_API_KEY} is required, {@code HANZO_BASE_URL} defaults to
 * https://api.hanzo.ai, and {@code HANZO_ORG_ID} carries the org that the KV and
 * agent routes refuse to answer without. Every flow calls {@link #client()};
 * none of them reads {@code System.getenv} itself.
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
        client.setBearerToken(key);

        // Sent on every request: harmless where the tenant comes from the token,
        // required where it does not.
        String org = System.getenv("HANZO_ORG_ID");
        if (org != null && !org.isBlank()) {
            client.addDefaultHeader("X-Org-Id", org);
        }
        return client;
    }

    /**
     * The same client, plus {@code sink} for each raw response body.
     *
     * <p>Some routes are declared in hanzo.yaml with {@code default:} and no
     * {@code content}, so the generator types them {@code void} and the body is
     * the only place their answer exists. {@code peekBody} copies rather than
     * consumes, so typed calls on this client still deserialize normally.
     */
    static ApiClient client(Consumer<String> sink) {
        ApiClient client = client();
        client.setHttpClient(client.getHttpClient().newBuilder()
                .addInterceptor(chain -> {
                    okhttp3.Response response = chain.proceed(chain.request());
                    sink.accept(response.peekBody(Long.MAX_VALUE).string());
                    return response;
                })
                .build());
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
