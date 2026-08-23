# Hanzo Cloud — Java SDK

Java client for the [Hanzo Cloud](https://hanzo.ai) API, covering every `/v1`
route the gateway serves. It is generated from the API's own OpenAPI document —
the one published at
[`/v1/openapi.json`](https://api.hanzo.ai/v1/openapi.json) — so method names are
that document's operation ids camel-cased: `get_keys` → `getKeys`,
`get_kv_by_name` → `getKvByName`.

[`.spec-lock`](.spec-lock) names the ref and the digest of the bytes this client
was cut from.

## Install

**Not on Maven Central yet.** `ai.hanzo:hanzo-java-cloud` resolves nowhere, so
build it and install it into your own local Maven repository:

```bash
git clone https://github.com/hanzoai/java-sdk
cd java-sdk
./gradlew :hanzo-java-cloud:publishToMavenLocal
```

That writes `ai.hanzo:hanzo-java-cloud:8.5.89` — jar, sources and javadoc — to
`~/.m2/repository/ai/hanzo/hanzo-java-cloud/8.5.89/`. Depend on it from your own
build:

```groovy
repositories { mavenLocal(); mavenCentral() }

dependencies { implementation 'ai.hanzo:hanzo-java-cloud:8.5.89' }
```

Maven reads `~/.m2` first, so there it is the coordinates and nothing else:

```xml
<dependency>
  <groupId>ai.hanzo</groupId>
  <artifactId>hanzo-java-cloud</artifactId>
  <version>8.5.89</version>
</dependency>
```

Java 11 or newer.

## Authenticate

The document declares one security scheme — `bearer` — and applies it to every
operation except four. `setBearerToken` is the one place a token goes in:

```java
ApiClient hanzo = new ApiClient();
hanzo.setBearerToken(token);          // Authorization: Bearer …
new ModelsApi(hanzo).getModels();     // one of the four that need no token
```

[`ai.hanzo.Hanzo`](hanzo-java-cloud/src/main/java/ai/hanzo/Hanzo.java) is the
same three lines fed from the environment, and is the only place in the module
that reads it.

| variable | meaning |
| --- | --- |
| `HANZO_API_KEY` | bearer credential, handed to `setBearerToken` |
| `HANZO_BASE_URL` | gateway to talk to; default `https://api.hanzo.ai` |
| `HANZO_ORG_ID` | org scope, sent as `X-Org-Id`; the KV and agents routes refuse without it. Everything else takes the tenant from the token's `owner` claim |

For a program that serves more than one tenant, pass them instead of reading a
single set of variables: `Hanzo.client(token, null, "acme")`.

The token is a Cloud API key, or an access token from Hanzo IAM — which is what
a service holding client credentials mints for itself:

```bash
export HANZO_API_KEY=$(curl -s https://api.hanzo.ai/v1/iam/oauth/token \
  -d grant_type=client_credentials -d client_id="$CLIENT_ID" -d client_secret="$CLIENT_SECRET" \
  | jq -r .access_token)
```

`X-Org-Id` stays a default header rather than a second credential: it selects a
tenant, and no scheme declares it.

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
HANZO_API_KEY=… ./gradlew :examples:hello   # the same call, in this repo
```

`GET /v1/keys` refuses without a credential — `403
{"status":403,"code":"forbidden","error":"sign in to manage API keys"}` — so
reaching the loop at all proves the key works.

Getters carry the document's own answer about a field:
`@javax.annotation.Nullable` unless it is required, which most are not — hence
the `requireNonNullElse`. A refusal arrives as a checked `ApiException` carrying
`getCode()` and `getResponseBody()`.

## Examples

Six flows, one per directory, each a complete program. `flows.yaml` in
hanzoai/openapi prescribes them for every Hanzo SDK, so a reader who knows one
language's set can find their way around another's. The build compiles them
against the client.

| flow | what it does |
|---|---|
| [`hello`](examples/hello) | `GET /v1/keys` — prove the key works |
| [`chat`](examples/chat) | `POST /v1/chat/completions` — one completion |
| [`money`](examples/money) | `GET /v1/billing/balance`, `GET /v1/billing/usage` |
| [`store`](examples/store) | `POST /v1/kv`, then `GET` and `DELETE /v1/kv/{name}` |
| [`agent`](examples/agent) | `POST /v1/agents`, `.../run`, poll `.../runs` until terminal |
| [`tools`](examples/tools) | `GET /v1/tools` — the tools this key can reach |

One command each, against the live gateway:

```bash
export HANZO_API_KEY=…
export HANZO_ORG_ID=my-org      # store and agent only
./gradlew :examples:hello       # or tools, money, chat, store, agent
```

```
$ ./gradlew --console=plain -q :examples:hello
the key is good, and it owns no keys of its own
$ ./gradlew --console=plain -q :examples:tools
no tools reachable with this key
$ ./gradlew --console=plain -q :examples:money
balance  HTTP 200
usage    HTTP 200
```

`agent` asks for `zen5`; `HANZO_MODEL` overrides it, and
`curl https://catalog.hanzo.ai/v1/models` lists the rest.

`chat` and `money` print a status rather than a body: those routes are published
with no request or response schema, so the generated methods take no argument
and return `void`. When the document declares the shapes, a regeneration prints
them.

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

`scripts/generate.sh` is a call site: the invocation lives once in
`hanzoai/openapi/generate.py`, and every knob — generator, HTTP library,
coordinates, packages — is data in `sdks.yaml` beside it.

## Docs

[docs.hanzo.ai](https://docs.hanzo.ai) for the API itself.
[`/v1/openapi.json`](https://api.hanzo.ai/v1/openapi.json) is the document this
client is cut from.

## License

Apache-2.0. See [LICENSE](LICENSE).
