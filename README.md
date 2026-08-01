# Hanzo Cloud — Java SDK

Java client for the [Hanzo Cloud](https://hanzo.ai) unified API: **2452
operations over 1737 paths, across 263 tags**, generated from `hanzo.yaml` in
`hanzoai/openapi`, which is the single
source of truth for every Hanzo SDK.

Nothing under `hanzo-java-cloud/src/main/java/ai/hanzo/cloud` is written by
hand. To change the client, change the spec.

## Install

Maven:

```xml
<dependency>
  <groupId>ai.hanzo</groupId>
  <artifactId>hanzo-java-cloud</artifactId>
  <version>8.0.0</version>
</dependency>
```

Gradle:

```groovy
implementation 'ai.hanzo:hanzo-java-cloud:8.0.0'
```

Java 11 or newer.

## Authenticate

A bearer token — an IAM-issued JWT or an `hk-` Cloud API key. Some routes (KV,
agents) are org-scoped and also need `X-Org-Id`; the rest take the tenant from
the token's `owner` claim.

```java
ApiClient client = new ApiClient();
client.setBasePath("https://api.hanzo.ai");
client.setBearerToken(System.getenv("HANZO_API_KEY"));
client.addDefaultHeader("X-Org-Id", System.getenv("HANZO_ORG_ID")); // org-scoped routes
```

## Use it

```java
import ai.hanzo.cloud.ApiClient;
import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.AuthApi;
import ai.hanzo.cloud.model.BotUser;

public class Whoami {
    public static void main(String[] args) throws ApiException {
        ApiClient client = new ApiClient();
        client.setBasePath("https://api.hanzo.ai");
        client.setBearerToken(System.getenv("HANZO_API_KEY"));

        BotUser me = new AuthApi(client).botAuthMe();
        System.out.println(me.getHandle() + " <" + me.getEmail() + ">");
    }
}
```

## Examples

The six canonical flows every Hanzo SDK ships, under `examples/<flow>/`. They
are compiled by the build, so they cannot rot.

| flow | what it does |
|---|---|
| [`hello`](examples/hello) | `GET /v1/bot/auth/me` — prove the key works, and print who it belongs to |
| [`chat`](examples/chat) | `POST /v1/chat/completions` — one completion, OpenAI-compatible |
| [`money`](examples/money) | `GET /v1/billing/balance`, `GET /v1/billing/usage` |
| [`store`](examples/store) | `POST /v1/kv`, `GET`/`DELETE /v1/kv/{name}` — provision, read, drop |
| [`agent`](examples/agent) | `POST /v1/agents`, `.../run`, poll `.../runs` until terminal |
| [`tools`](examples/tools) | `GET /v1/tools` — the tools this key can reach |

```
export HANZO_API_KEY=hk-...
export HANZO_ORG_ID=my-org      # store and agent only
./gradlew :examples:hello
```

`HANZO_BASE_URL` (default `https://api.hanzo.ai`) and `HANZO_MODEL` override the
rest. All of it is resolved in one place,
[`examples/Hanzo.java`](examples/Hanzo.java).

Set `HANZO_MODEL`: the fallback compiled into `Hanzo.java` is `zen-1`, which is
not a model the gateway serves, so the examples fail on the model id without it.
`zen5`, `zen5-coder` and `enso` are real; `curl https://catalog.hanzo.ai/v1/models`
lists the rest.

## Build

```
./gradlew build                          # client + examples
./gradlew :hanzo-java-cloud:assemble     # the jar
```

## Regenerate

```
./scripts/generate.sh            # regenerate from hanzoai/openapi
./scripts/generate.sh --check    # non-zero if the committed client drifted
```

`scripts/generate.sh` is a call site, not a generator invocation: the invocation
lives once in `hanzoai/openapi/generate.py` and every knob — generator, HTTP
library, coordinates, packages — is data in `sdks.yaml` beside it. `--check` is
what makes "this client is the spec" a fact rather than a convention, and it
runs in CI.

hanzoai/openapi is private, so regenerating needs `SPEC_TOKEN` (or `GH_TOKEN` /
`GITHUB_TOKEN`), or `OPENAPI=` pointing at a checkout you already have.

## License

Apache-2.0. See [LICENSE](LICENSE).
