package ai.hanzo.cloud.examples;

import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.BillingApi;
import ai.hanzo.cloud.model.BillingBalance;
import ai.hanzo.cloud.model.BillingUsageLedger;
import ai.hanzo.cloud.model.BillingUsageRecord;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * money — the balance, then the usage that moved it.
 *
 * <p>Operations: {@code cloud_get_v1_billing_balance} — GET /v1/billing/balance,
 * and {@code cloud_get_v1_billing_usage} — GET /v1/billing/usage.
 *
 * <p>Neither takes an org: both derive the tenant server-side from the JWT
 * {@code owner} claim, so a key can only ever read its own money.
 *
 * <p>This flow used to print the RAW response body through a client
 * interceptor, because a merge defect was replacing the authored operations
 * with undescribed ones and there was no typed body to read. The window
 * parameters ({@code start}, {@code end}) and the response schemas are both
 * restored, so it now reads {@link BillingBalance} and {@link BillingUsageLedger}
 * as objects. Decoding by hand inside a generated client is exactly the drift
 * these SDKs exist to prevent.
 *
 * <pre>
 *   HANZO_API_KEY=hk-... ./gradlew :examples:money
 * </pre>
 */
public final class Money {

    /** A week, so the ledger has something in it. */
    private static final int WINDOW_DAYS = 7;

    public static void main(String[] args) {
        BillingApi billing = new BillingApi(Hanzo.client());

        try {
            // null currency: the org's own, whatever it is denominated in.
            BillingBalance balance = billing.cloudGetV1BillingBalance(null);
            System.out.printf("balance   %d%n", balance.getBalance());
            System.out.printf("holds     %d%n", balance.getHolds());
            System.out.printf("available %d%n", balance.getAvailable());

            Instant now = Instant.now();
            BillingUsageLedger ledger = billing.cloudGetV1BillingUsage(
                    now.minus(WINDOW_DAYS, ChronoUnit.DAYS).toString(), now.toString());

            List<BillingUsageRecord> usage = ledger.getUsage();
            if (usage == null || usage.isEmpty()) {
                System.out.printf("usage     none in the last %d days%n", WINDOW_DAYS);
                return;
            }
            System.out.printf("usage     %d records%n", usage.size());
            usage.stream().limit(5).forEach(record ->
                    System.out.printf("  %-26s %d%n", record.getCreatedAt(), record.getAmount()));
        } catch (ApiException e) {
            System.err.printf("billing failed: HTTP %d %s%n", e.getCode(), e.getResponseBody());
            System.exit(1);
        }
    }
}
