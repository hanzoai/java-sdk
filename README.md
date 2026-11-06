# Hanzo Java SDK → [hanzo-java/sdk](https://github.com/hanzo-java/sdk)

[![Maven Central](https://img.shields.io/maven-central/v/ai.hanzo/hanzo-java-cloud?label=ai.hanzo%3Ahanzo-java-cloud)](https://central.sonatype.com/artifact/ai.hanzo/hanzo-java-cloud)

The Hanzo Java SDK lives at **[github.com/hanzo-java/sdk](https://github.com/hanzo-java/sdk)**: every `/v1`
operation of `api.hanzo.ai` as a typed method, generated from the API document
each cloud release publishes. This repository is its old address and holds no
code. Issues and pull requests go to [hanzo-java/sdk](https://github.com/hanzo-java/sdk).

## Install

Java 11 or newer, from Maven Central:

```groovy
dependencies { implementation 'ai.hanzo:hanzo-java-cloud:latest.release' }
```

The exact version and the Maven form are in the SDK's [README](https://github.com/hanzo-java/sdk#install).

## Quickstart

```java
import ai.hanzo.Hanzo;
import ai.hanzo.ApiClient;
import ai.hanzo.api.AccountApi;
import ai.hanzo.api.AiApi;
import ai.hanzo.model.OpenaiChatCompletionMessage;
import ai.hanzo.model.OpenaiChatCompletionRequest;

ApiClient hanzo = Hanzo.client();   // HANZO_API_KEY, HANZO_BASE_URL, HANZO_ORG_ID

new AccountApi(hanzo).getAccountKeys().getKeys()
        .forEach(key -> System.out.println(key.getType() + " " + key.getPrefix()));

var reply = new AiApi(hanzo).postChatCompletions(new OpenaiChatCompletionRequest()
        .model("zen5")
        .messages(java.util.List.of(new OpenaiChatCompletionMessage().role("user").content("Say hello."))),
        null, null);
System.out.println(reply.getChoices().get(0).getMessage().getContent());
```

## Examples

Each a complete program in the SDK, compiled against it on every release:

| flow | what it does |
|---|---|
| [hello](https://github.com/hanzo-java/sdk/blob/main/examples/hello/Hello.java) | `GET /v1/account/keys`: prove the key works |
| [chat](https://github.com/hanzo-java/sdk/blob/main/examples/chat/Chat.java) | `POST /v1/chat/completions`: one completion |
| [money](https://github.com/hanzo-java/sdk/blob/main/examples/money/Money.java) | `GET /v1/billing/balance`, `GET /v1/billing/usage` |
| [store](https://github.com/hanzo-java/sdk/blob/main/examples/store/Store.java) | create a KV store, read it back, delete it |
| [agent](https://github.com/hanzo-java/sdk/blob/main/examples/agent/Agent.java) | create an agent, run it, poll the run to completion |
| [tools](https://github.com/hanzo-java/sdk/blob/main/examples/tools/Tools.java) | `GET /v1/tool`: the tool catalog the key reaches |
| [kai](https://github.com/hanzoai/kai/blob/main/examples/java/src/main/java/kai/Kai.java) | `POST /v1/decisions`: a Kai decision, in the Kai cookbook |

## Other languages

[C#](https://github.com/hanzo-csharp/sdk) · [Python](https://github.com/hanzoai/python-sdk) ·
[TypeScript](https://github.com/hanzoai/js-sdk) · [Go](https://github.com/hanzo-go/sdk) ·
[Rust](https://github.com/hanzo-rs/sdk) · [C++](https://github.com/hanzo-cpp/sdk) ·
[all SDKs](https://github.com/hanzoai/sdk)
