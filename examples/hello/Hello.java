package ai.hanzo.cloud.examples;

import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.KeysApi;
import ai.hanzo.cloud.model.ApiKey;
import ai.hanzo.cloud.model.ApiKeyList;

import java.util.List;

/**
 * hello — prove the key works, and print what it can reach.
 *
 * <p>Operation: {@code get_v1_keys} — GET /v1/keys.
 *
 * <p>This is the call that says no. With no key, or a bogus one, the route
 * answers 403 {@code {"code":"forbidden","error":"sign in to manage API keys"}}
 * while the nonsense sibling GET /v1/keys-zzq9 answers 404 — so the refusal is
 * this route refusing rather than a wildcard door, which is what makes it a
 * usable proof that a credential works. The three obvious identity routes were
 * disqualified for answering 200 to a caller with no credential at all;
 * {@code flows.yaml} records the probe.
 *
 * <pre>
 *   HANZO_API_KEY=hk-... ./gradlew :examples:hello
 * </pre>
 */
public final class Hello {

    public static void main(String[] args) {
        KeysApi keys = new KeysApi(Hanzo.client());
        try {
            ApiKeyList mine = keys.getKeys();
            List<ApiKey> owned = mine.getKeys();
            if (owned == null || owned.isEmpty()) {
                System.out.println("the key is good, and it owns no keys of its own");
                return;
            }
            for (ApiKey key : owned) {
                System.out.printf("%-8s %-24s %s%n", key.getType(), key.getPrefix(), key.getCreatedAt());
            }
        } catch (ApiException e) {
            System.err.printf("keys refused: HTTP %d %s%n", e.getCode(), e.getResponseBody());
            System.exit(1);
        }
    }
}
