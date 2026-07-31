package ai.hanzo.cloud.examples;

import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.AuthApi;
import ai.hanzo.cloud.model.BotUser;

/**
 * hello — prove the key works, and print who it belongs to.
 *
 * <p>Operation: {@code bot_authMe} — GET /v1/bot/auth/me.
 *
 * <p>This is the call that says no: with no key, or a bogus one, the route
 * answers 403 {@code {"error":"no validated principal"}} rather than a cheerful
 * anonymous identity. That refusal is the whole point of a hello, so the
 * failure is printed as deliberately as the success.
 *
 * <pre>
 *   HANZO_API_KEY=sk-... ./gradlew :examples:hello
 * </pre>
 */
public final class Hello {

    public static void main(String[] args) {
        AuthApi auth = new AuthApi(Hanzo.client());
        try {
            BotUser me = auth.botAuthMe();
            System.out.printf("id       %s%n", me.getId());
            System.out.printf("handle   %s%n", me.getHandle());
            System.out.printf("name     %s%n", me.getDisplayName());
            System.out.printf("email    %s%n", me.getEmail());
        } catch (ApiException e) {
            System.err.printf("whoami failed: HTTP %d %s%n", e.getCode(), e.getResponseBody());
            System.exit(1);
        }
    }
}
