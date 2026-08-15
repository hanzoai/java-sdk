# java-sdk — notes for the next person in here

One Gradle module, `hanzo-java-cloud`, published as `ai.hanzo:hanzo-java-cloud`.
`examples/` is a second module that exists only to be compiled against it.

## What is generated and what is not

`hanzo-java-cloud/src/main/java/ai/hanzo/cloud/**` is generated and is **deleted
and rewritten wholesale** on every regeneration — `sdks.yaml`'s `take:` hands
the generator that directory outright. Never edit a file in it; a hand edit is
caught by `generate.py --check` and fails CI.

Everything else is the repo's, including `ai/hanzo/Hanzo.java`, which sits
*beside* the generated package for exactly that reason.

## The shape, and how to measure it

```
find hanzo-java-cloud/src/main/java/ai/hanzo/cloud -name '*.java' | wc -l   # 2670
ls hanzo-java-cloud/src/main/java/ai/hanzo/cloud/api/*.java | wc -l         # 192
ls hanzo-java-cloud/src/main/java/ai/hanzo/cloud/model/*.java | wc -l       # 2461
grep -rhoE 'public okhttp3\.Call [a-zA-Z0-9_]+Call\(' \
  hanzo-java-cloud/src/main/java/ai/hanzo/cloud/api/*.java | wc -l          # 2502
```

The document (`hanzoai/cloud` `openapi.yaml`, pinned in `.spec-lock`) declares
**1,814 paths, 2,479 operations, 190 tags, 2,436 schemas**, and its operation
ids are identical to what `api.hanzo.ai/v1/openapi.json` serves.

2,479 operations become 2,502 methods over 192 classes because **23 operations
carry two tags** and are emitted into both, and **50 carry none** and land in
`DefaultApi` (the `/`, `/.well-known/*`, `/_/*` and git-transport routes).
A method name is its operation id camel-cased: `get_kv_by_name` → `getKvByName`.

## The credential is generated now

The document declares a `bearer` scheme (HTTP bearer) and applies it to every
operation except four. So `ApiClient` registers an `HttpBearerAuth`, and:

```
grep -rc 'localVarAuthNames = new String\[\] { "bearer" }' \
  hanzo-java-cloud/src/main/java/ai/hanzo/cloud/api/*.java | paste -sd+ | bc  # 2498
grep -rc 'localVarAuthNames = new String\[\] {  }' \
  hanzo-java-cloud/src/main/java/ai/hanzo/cloud/api/*.java | paste -sd+ | bc  # 4
```

The four are `/v1/commands`, `/v1/models`, `/v1/models/providers` and
`/v1/openapi.json` — exactly the operations carrying `security: []`, so the
client refuses to send a credential where the document says none is wanted.

`ai.hanzo.Hanzo` did that job by hand until the scheme existed, setting
`Authorization` as a default header. It no longer does: it calls
`setBearerToken`, so there is one code path for the credential and it is the
generated one. What remains hand-written is the part no scheme covers — reading
the environment, the default base URL, and `X-Org-Id`, which selects a tenant
rather than authenticating one.

## Dependencies are what the sources import, nothing more

`jakarta.annotation-api` is on the **1.x** line and must stay there: every
generated type carries `@javax.annotation.Generated`, and the javax namespace
only exists in 1.x — 2.0 renames it to `jakarta.annotation` and 2,470 files stop
compiling. `jsr305` supplies `@Nullable`/`@Nonnull` and does not supply
`Generated`. Dropping either is a 2,600-error build.

## Nothing is published

`repo1.maven.org/maven2/ai/hanzo/` is a 404 and Central's index has no
`ai.hanzo` group. Until an upload succeeds, the README's install path is
`publishToMavenLocal` — do not print coordinates that resolve nowhere.

Nor is any number claimed: `git ls-remote --tags origin` returns **0**. The
`v0.1.0-alpha.{3,4,5}` tags exist only in a local checkout and were never
pushed, so they claim nothing. A version is claimed by a tag on the remote —
read that, not the manifest, before choosing the next one.

## Building

```
./gradlew --no-daemon :hanzo-java-cloud:compileJava   # ~25s cold
./gradlew --no-daemon :examples:compileJava
```

Set `GRADLE_USER_HOME` and `TMPDIR` to somewhere with room. The compile is
forked with `-Xmx6g` (root `build.gradle`) because the Gradle daemon's heap is
not the compiler's, and 2,671 sources will not fit in the default.

## The six examples are not this repo's choice

They are data in `hanzoai/openapi` `flows.yaml` — a closed set every Hanzo SDK
owes — and `test_flows.py` there asserts both that the set is exactly those six
and that every operation id they name exists in the document. Adding a seventh
here breaks that.

`chat` and `money` print a status rather than a body: those routes are published
with no request or response schema, so the generated methods take no argument
and return `void`. Do not hand-roll a request to make them look better — that is
the drift these SDKs exist to prevent. When cloud declares the shapes, a
regeneration fixes them.

## Running one, and which credential answers

Compiling proves the client matches the document; only running proves it can
authenticate. `HANZO_API_KEY=… ./gradlew --console=plain -q :examples:hello`,
and unset it for the control — the pair is the proof.

Two kinds of token reach api.hanzo.ai and they do NOT behave alike:

- **An IAM access token** — `POST /v1/iam/oauth/token`, `grant_type=client_credentials`,
  with a client id and secret (services keep theirs in the k8s Secret
  `<app>-iam-creds`). Measured: `/v1/keys` 200 ten times out of ten.
- **A Cloud API key** (`sk-`). Measured on the same route in the same minute:
  **200 once in ten, 403 the other nine**, while `/v1/tools` and
  `/v1/billing/balance` answered 200 every time. The key is fine; the key→account
  lookup resolves on one replica and not the rest, and `/v1/billing/balance`
  makes that visible by answering 200 with `"account":"anonymous"`. A single
  403 from `hello` is therefore not evidence about the client. Repeat it, or
  use an IAM token, before concluding anything about this repo.
