# Hanzo Cloud — Java SDK

Java client for the [Hanzo Cloud](https://hanzo.ai) unified API: **2468
operations over 1797 paths, across 189 tags**, generated from the `openapi.yaml`
hanzoai/cloud emits from its own routers — so every method here is a route the
subsystem that publishes it registered.

Which release this client is a projection of is a fact about the repo, in
[`.spec-lock`](.spec-lock): the ref, and the digest of the bytes it was cut
from.

Nothing under `hanzo-java-cloud/src/main/java/ai/hanzo/cloud` is written by
hand. To change the client, change the code that emits the document.

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

Set it as a default header. The document declares no `securitySchemes`, so the
generator registers no authentication: `setAccessToken` is a stub that throws,
and a client that does not set the header itself sends no credential at all.

```java
ApiClient client = new ApiClient();
client.setBasePath("https://api.hanzo.ai");
client.addDefaultHeader("Authorization", "Bearer " + System.getenv("HANZO_API_KEY"));
client.addDefaultHeader("X-Org-Id", System.getenv("HANZO_ORG_ID")); // org-scoped routes
```

## Use it

```java
import ai.hanzo.cloud.ApiClient;
import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.KeysApi;
import ai.hanzo.cloud.model.ApiKey;

public class Whoami {
    public static void main(String[] args) throws ApiException {
        ApiClient client = new ApiClient();
        client.setBasePath("https://api.hanzo.ai");
        client.addDefaultHeader("Authorization", "Bearer " + System.getenv("HANZO_API_KEY"));

        for (ApiKey key : new KeysApi(client).getV1Keys().getKeys()) {
            System.out.println(key.getType() + " " + key.getPrefix());
        }
    }
}
```

## Examples

The six canonical flows every Hanzo SDK ships, under `examples/<flow>/`. They
are compiled by the build, so they cannot rot.

| flow | what it does |
|---|---|
| [`hello`](examples/hello) | `GET /v1/keys` — the call that says no, so a 200 proves the key works |
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
SPEC=/path/to/openapi.yaml OPENAPI=/path/to/hanzoai/openapi ./scripts/generate.sh
```

`scripts/generate.sh` is a call site, not a generator invocation: the invocation
lives once in `hanzoai/openapi/generate.py` and every knob — generator, HTTP
library, coordinates, packages — is data in `sdks.yaml` beside it. Both inputs
arrive as values: `SPEC` is the document, `OPENAPI` is the checkout holding the
driver. CI's client lane sets both, because it holds the one credential that
reads the forge they live on; by hand, point them at checkouts you already have.

The examples are the gate. `./gradlew build` compiles the client and all six
flows against it, so a document change that renames or drops an operation goes
red here instead of in someone's app.

## License

Apache-2.0. See [LICENSE](LICENSE).
