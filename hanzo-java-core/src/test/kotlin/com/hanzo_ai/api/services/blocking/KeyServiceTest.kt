// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.services.blocking

import com.hanzo_ai.api.TestServerExtension
import com.hanzo_ai.api.client.okhttp.HanzoOkHttpClient
import com.hanzo_ai.api.core.JsonValue
import com.hanzo_ai.api.models.key.BlockKeyRequest
import com.hanzo_ai.api.models.key.KeyBlockParams
import com.hanzo_ai.api.models.key.KeyDeleteParams
import com.hanzo_ai.api.models.key.KeyGenerateParams
import com.hanzo_ai.api.models.key.KeyListParams
import com.hanzo_ai.api.models.key.KeyRegenerateByKeyParams
import com.hanzo_ai.api.models.key.KeyRetrieveInfoParams
import com.hanzo_ai.api.models.key.KeyUnblockParams
import com.hanzo_ai.api.models.key.KeyUpdateParams
import com.hanzo_ai.api.models.key.regenerate.RegenerateKeyRequest
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class KeyServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyService = client.key()

        val key =
            keyService.update(
                KeyUpdateParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .key("key")
                    .aliases(JsonValue.from(mapOf<String, Any>()))
                    .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                    .blocked(true)
                    .budgetDuration("budget_duration")
                    .budgetId("budget_id")
                    .config(JsonValue.from(mapOf<String, Any>()))
                    .duration("duration")
                    .addEnforcedParam("string")
                    .addGuardrail("string")
                    .keyAlias("key_alias")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                    .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .permissions(JsonValue.from(mapOf<String, Any>()))
                    .rpmLimit(0L)
                    .spend(0.0)
                    .addTag("string")
                    .teamId("team_id")
                    .tempBudgetExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .tempBudgetIncrease(0.0)
                    .tpmLimit(0L)
                    .userId("user_id")
                    .build()
            )

        key.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyService = client.key()

        val key =
            keyService.list(
                KeyListParams.builder()
                    .includeTeamKeys(true)
                    .keyAlias("key_alias")
                    .organizationId("organization_id")
                    .page(1L)
                    .returnFullObject(true)
                    .size(1L)
                    .teamId("team_id")
                    .userId("user_id")
                    .build()
            )

        key.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyService = client.key()

        val key =
            keyService.delete(
                KeyDeleteParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .addKeyAlias("string")
                    .addKey("string")
                    .build()
            )

        key.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun block() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyService = client.key()

        val response =
            keyService.block(
                KeyBlockParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                    .build()
            )

        val unwrappedResponse = response.getOrNull()
        unwrappedResponse?.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun checkHealth() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyService = client.key()

        val response = keyService.checkHealth()

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun generate() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyService = client.key()

        val generateKeyResponse =
            keyService.generate(
                KeyGenerateParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .aliases(JsonValue.from(mapOf<String, Any>()))
                    .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                    .blocked(true)
                    .budgetDuration("budget_duration")
                    .budgetId("budget_id")
                    .config(JsonValue.from(mapOf<String, Any>()))
                    .duration("duration")
                    .addEnforcedParam("string")
                    .addGuardrail("string")
                    .key("key")
                    .keyAlias("key_alias")
                    .maxBudget(0.0)
                    .maxParallelRequests(0L)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                    .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .permissions(JsonValue.from(mapOf<String, Any>()))
                    .rpmLimit(0L)
                    .sendInviteEmail(true)
                    .softBudget(0.0)
                    .spend(0.0)
                    .addTag("string")
                    .teamId("team_id")
                    .tpmLimit(0L)
                    .userId("user_id")
                    .build()
            )

        generateKeyResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun regenerateByKey() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyService = client.key()

        val generateKeyResponse =
            keyService.regenerateByKey(
                KeyRegenerateByKeyParams.builder()
                    .pathKey("key")
                    .llmChangedBy("llm-changed-by")
                    .regenerateKeyRequest(
                        RegenerateKeyRequest.builder()
                            .aliases(JsonValue.from(mapOf<String, Any>()))
                            .addAllowedCacheControl(JsonValue.from(mapOf<String, Any>()))
                            .blocked(true)
                            .budgetDuration("budget_duration")
                            .budgetId("budget_id")
                            .config(JsonValue.from(mapOf<String, Any>()))
                            .duration("duration")
                            .addEnforcedParam("string")
                            .addGuardrail("string")
                            .key("key")
                            .keyAlias("key_alias")
                            .maxBudget(0.0)
                            .maxParallelRequests(0L)
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                            .modelRpmLimit(JsonValue.from(mapOf<String, Any>()))
                            .modelTpmLimit(JsonValue.from(mapOf<String, Any>()))
                            .addModel(JsonValue.from(mapOf<String, Any>()))
                            .newMasterKey("new_master_key")
                            .permissions(JsonValue.from(mapOf<String, Any>()))
                            .rpmLimit(0L)
                            .sendInviteEmail(true)
                            .softBudget(0.0)
                            .spend(0.0)
                            .addTag("string")
                            .teamId("team_id")
                            .tpmLimit(0L)
                            .userId("user_id")
                            .build()
                    )
                    .build()
            )

        val unwrappedGenerateKeyResponse = generateKeyResponse.getOrNull()
        unwrappedGenerateKeyResponse?.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveInfo() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyService = client.key()

        val response = keyService.retrieveInfo(KeyRetrieveInfoParams.builder().key("key").build())

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun unblock() {
        val client =
            HanzoOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val keyService = client.key()

        val response =
            keyService.unblock(
                KeyUnblockParams.builder()
                    .llmChangedBy("llm-changed-by")
                    .blockKeyRequest(BlockKeyRequest.builder().key("key").build())
                    .build()
            )

        response.validate()
    }
}
