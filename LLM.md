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
**1,814 paths, 2,479 operations, 191 tags, 2,436 schemas**, and its operation
ids are identical to what `api.hanzo.ai/v1/openapi.json` serves.

2,479 operations become 2,502 methods over 192 classes because **23 operations
carry two tags** and are emitted into both, and **50 carry none** and land in
`DefaultApi` (the `/`, `/.well-known/*`, `/_/*` and git-transport routes).
A method name is its operation id camel-cased: `get_kv_by_name` → `getKvByName`.

## The document declares no securitySchemes

So the generator registered no credential: `ApiClient.setAccessToken` throws
`"No OAuth2 authentication configured!"`, every generated call passes an empty
`authNames`, and nothing under `ai.hanzo.cloud` reads the environment. That is
why `ai.hanzo.Hanzo` exists — it sets `Authorization` and `X-Org-Id` as default
headers, and it is the only place in the module that reads the environment. The
Kotlin SDK makes the same correction with an interceptor. It becomes a delete
the day cloud declares its scheme.

## Dependencies are what the sources import, nothing more

`jakarta.annotation-api` is on the **1.x** line and must stay there: every
generated type carries `@javax.annotation.Generated`, and the javax namespace
only exists in 1.x — 2.0 renames it to `jakarta.annotation` and 2,470 files stop
compiling. `jsr305` supplies `@Nullable`/`@Nonnull` and does not supply
`Generated`. Dropping either is a 2,600-error build.

## Nothing is published

`repo1.maven.org/maven2/ai/hanzo/` is a 404 and Central's index has no
`ai.hanzo` group, despite `v0.1.0-alpha.{3,4,5}` tags in this repo. Until an
upload succeeds, the README's install path is `publishToMavenLocal` — do not
print coordinates that resolve nowhere.

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
