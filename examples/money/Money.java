package ai.hanzo.cloud.examples;

import ai.hanzo.cloud.ApiClient;
import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.BillingApi;

import java.util.concurrent.atomic.AtomicReference;

/**
 * money — the balance, then the usage that moved it.
 *
 * <p>Operations: {@code cloud_get_v1_billing_balance} — GET /v1/billing/balance,
 * and {@code cloud_get_v1_billing_usage} — GET /v1/billing/usage.
 *
 * <p>Neither takes an org: both derive the tenant server-side from the token's
 * {@code owner} claim, so a key can only ever read its own money.
 *
 * <p>Both are declared in hanzo.yaml with {@code default:} and no {@code
 * content} — "the route answers; its response shape is not declared at the
 * source" — so the generator types them {@code void} and there is no model to
 * read. The raw body is the only place the answer exists, so this flow uses the
 * body-capturing client. For the same reason it cannot ask for a usage window:
 * the document declares no query parameters on the usage route, and a generated
 * client can only send what the document describes.
 *
 * <pre>
 *   HANZO_API_KEY=sk-... ./gradlew :examples:money
 * </pre>
 */
public final class Money {

    public static void main(String[] args) {
        AtomicReference<String> body = new AtomicReference<>();
        ApiClient client = Hanzo.client(body::set);
        BillingApi billing = new BillingApi(client);

        try {
            billing.cloudGetV1BillingBalance();
            System.out.printf("balance  %s%n", body.get());

            billing.cloudGetV1BillingUsage();
            System.out.printf("usage    %s%n", body.get());
        } catch (ApiException e) {
            System.err.printf("billing failed: HTTP %d %s%n", e.getCode(), e.getResponseBody());
            System.exit(1);
        }
    }
}
