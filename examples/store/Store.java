package ai.hanzo.cloud.examples;

import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.KvApi;
import ai.hanzo.cloud.model.CloudProvisionRequest;
import ai.hanzo.cloud.model.CloudProvisionResult;
import ai.hanzo.cloud.model.CloudProvisionedResource;

import java.util.UUID;

/**
 * store — provision a KV store, read it back, drop it.
 *
 * <p>Operations: {@code cloud_post_v1_kv} — POST /v1/kv,
 * {@code cloud_get_v1_kv_name} — GET /v1/kv/{name},
 * {@code cloud_delete_v1_kv_name} — DELETE /v1/kv/{name}.
 *
 * <p>This is the provisioning plane, and it is the one that answers: the value
 * plane (/v1/kv/keys/{key}) is authored in the document but does not route.
 *
 * <p>KV is org-scoped — without {@code X-Org-Id} every call here is
 * 403 {@code "X-Org-Id required"}. The delete is in a {@code finally} so a
 * failed read still cleans up instead of leaving a store behind for the next
 * run to collide with.
 *
 * <pre>
 *   HANZO_API_KEY=sk-... HANZO_ORG_ID=my-org ./gradlew :examples:store
 * </pre>
 */
public final class Store {

    public static void main(String[] args) {
        KvApi kv = new KvApi(Hanzo.client());

        // Names are org-unique, so the example makes a fresh one rather than
        // colliding with whatever the last run left.
        String name = "sdk-example-" + UUID.randomUUID().toString().substring(0, 8);

        try {
            CloudProvisionResult created = kv.cloudPostV1Kv(new CloudProvisionRequest().name(name));
            System.out.printf("created  %s (%s)%n", created.getName(), created.getStatus());

            CloudProvisionedResource read = kv.cloudGetV1KvName(name);
            System.out.printf("read     %s host=%s port=%s status=%s%n",
                    read.getName(), read.getHost(), read.getPort(), read.getStatus());
        } catch (ApiException e) {
            System.err.printf("kv failed: HTTP %d %s%n", e.getCode(), e.getResponseBody());
            System.exit(1);
        } finally {
            try {
                kv.cloudDeleteV1KvName(name);
                System.out.printf("deleted  %s%n", name);
            } catch (ApiException e) {
                System.err.printf("delete %s failed: HTTP %d %s%n", name, e.getCode(), e.getResponseBody());
            }
        }
    }
}
