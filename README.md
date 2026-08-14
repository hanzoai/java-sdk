# Hanzo Cloud — Java SDK

Java client for the [Hanzo Cloud](https://hanzo.ai) API: **2,479 operations
across 192 API classes and 2,461 models**, covering every `/v1` route the
gateway serves. It is generated from the document hanzoai/cloud emits from its
own routers — the one the API publishes at
[`/v1/openapi.json`](https://api.hanzo.ai/v1/openapi.json) — so every method
here is a route some subsystem registered, and method names are that document's
operation ids camel-cased: `get_keys` → `getKeys`, `get_kv_by_name` →
`getKvByName`.

Which release this client is a projection of is in [`.spec-lock`](.spec-lock):
the ref, and the digest of the bytes it was cut from.

## Install

**Not on Maven Central yet.** `ai.hanzo:hanzo-java-cloud` resolves nowhere, so
build it and install it into your own local Maven repository:

```bash
git clone https://github.com/hanzoai/java-sdk
cd java-sdk
./gradlew :hanzo-java-cloud:publishToMavenLocal
```

That writes `ai.hanzo:hanzo-java-cloud:8.0.0` — jar, sources and javadoc — to
`~/.m2/repository/ai/hanzo/hanzo-java-cloud/8.0.0/`. Depend on it from your own
build:

```groovy
repositories { mavenLocal(); mavenCentral() }

dependencies { implementation 'ai.hanzo:hanzo-java-cloud:8.0.0' }
```

Maven reads `~/.m2` first, so there it is the coordinates and nothing else:

```xml
<dependency>
  <groupId>ai.hanzo</groupId>
  <artifactId>hanzo-java-cloud</artifactId>
  <version>8.0.0</version>
</dependency>
```

Java 11 or newer — the classes are major version 55.

## Authenticate

A bearer token: an IAM-issued JWT, or an `hk-` Cloud API key.

[`ai.hanzo.Hanzo`](hanzo-java-cloud/src/main/java/ai/hanzo/Hanzo.java) reads the
environment once and hands back the `ApiClient` every generated class takes.

| variable | meaning |
| --- | --- |
| `HANZO_API_KEY` | bearer credential, sent as `Authorization: Bearer …` |
| `HANZO_BASE_URL` | gateway to talk to; default `https://api.hanzo.ai` |
| `HANZO_ORG_ID` | org scope, sent as `X-Org-Id`; the KV and agents routes refuse without it. Everything else takes the tenant from the token's `owner` claim |

For a program that serves more than one tenant, pass them instead of reading a
single set of variables: `Hanzo.client("hk-…", null, "acme")`.

`Hanzo` is the one hand-written file in the module, and it is what makes a call
authenticated at all. The document declares no `securitySchemes`, so the
generator registered no credential: nothing under `ai.hanzo.cloud` reads the
environment, `ApiClient.setAccessToken` throws `"No OAuth2 authentication
configured!"`, and a client built any other way goes out bare and is refused.

## Quickstart

```java
import ai.hanzo.Hanzo;
import ai.hanzo.cloud.ApiClient;
import ai.hanzo.cloud.ApiException;
import ai.hanzo.cloud.api.KeysApi;
import ai.hanzo.cloud.model.ApiKey;

import java.util.List;
import java.util.Objects;

public class Whoami {
    public static void main(String[] args) throws ApiException {
        ApiClient hanzo = Hanzo.client();

        List<ApiKey> keys = Objects.requireNonNullElse(new KeysApi(hanzo).getKeys().getKeys(), List.of());
        keys.forEach(key -> System.out.println(key.getType() + " " + key.getPrefix()));
    }
}
```

```bash
HANZO_API_KEY=hk-… ./gradlew run
```

`GET /v1/keys` is the call that says no — with no key, or a bad one, it answers
`403 {"status":403,"code":"forbidden","error":"sign in to manage API keys"}` —
so reaching the loop at all proves the credential works.

Getters carry the document's own answer about a field: `@javax.annotation.Nullable`
unless it is required, which most are not — hence the `requireNonNullElse`. A
refusal arrives as a checked `ApiException` carrying `getCode()` and
`getResponseBody()`.

## Examples

Six flows, one per directory, each a complete program. They are the same six in
every Hanzo SDK, so a reader who knows one language's set can find their way
around another's. The build compiles them against the client, so they cannot
rot.

| flow | what it does |
|---|---|
| [`hello`](examples/hello) | `GET /v1/keys` — prove the key works |
| [`chat`](examples/chat) | `POST /v1/chat/completions` — one completion |
| [`money`](examples/money) | `GET /v1/billing/balance`, `GET /v1/billing/usage` |
| [`store`](examples/store) | `POST /v1/kv`, then `GET` and `DELETE /v1/kv/{name}` |
| [`agent`](examples/agent) | `POST /v1/agents`, `.../run`, poll `.../runs` until terminal |
| [`tools`](examples/tools) | `GET /v1/tools` — the tools this key can reach |

```bash
export HANZO_API_KEY=hk-…
export HANZO_ORG_ID=my-org      # store and agent only
./gradlew :examples:hello
```

`agent` asks for `zen5`; `HANZO_MODEL` overrides it, and
`curl https://catalog.hanzo.ai/v1/models` lists the rest.

`chat` and `money` print a status rather than a body: those routes are published
with no request or response schema, so the generated methods take no argument
and return `void`. Decoding a body the client was never told the shape of would
be an opinion about the API living inside a generated client. When the source
declares the shapes, a regeneration prints them.

## Build

```bash
./gradlew build                          # client + examples
./gradlew :hanzo-java-cloud:assemble     # the jar
```

## Regenerate

Nothing under `hanzo-java-cloud/src/main/java/ai/hanzo/cloud` is written by
hand; to change it, change the code that emits the document.

```bash
SPEC=/path/to/openapi.yaml OPENAPI=/path/to/hanzoai/openapi ./scripts/generate.sh
```

`scripts/generate.sh` is a call site, not a generator invocation: the invocation
lives once in `hanzoai/openapi/generate.py`, and every knob — generator, HTTP
library, coordinates, packages — is data in `sdks.yaml` beside it. Both inputs
arrive as values: `SPEC` is the document, `OPENAPI` is the checkout holding the
driver.

The examples are the gate. `./gradlew build` compiles the client and all six
flows against it, so a document change that renames or drops an operation goes
red here instead of in someone's app.

## Docs

[docs.hanzo.ai](https://docs.hanzo.ai) for the API itself.
[`/v1/openapi.json`](https://api.hanzo.ai/v1/openapi.json) is the document this
client is cut from — the authority on what any route accepts and returns.

## License

Apache-2.0. See [LICENSE](LICENSE).
