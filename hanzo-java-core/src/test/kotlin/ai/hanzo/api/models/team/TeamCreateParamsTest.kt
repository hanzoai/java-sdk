// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import ai.hanzo.api.core.JsonValue
import ai.hanzo.api.core.http.Headers
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamCreateParamsTest {

    @Test
    fun create() {
        TeamCreateParams.builder()
            .llmChangedBy("llm-changed-by")
            .addAdmin(JsonValue.from(mapOf<String, Any>()))
            .blocked(true)
            .budgetDuration("budget_duration")
            .addGuardrail("string")
            .maxBudget(0.0)
            .addMember(JsonValue.from(mapOf<String, Any>()))
            .addMembersWithRole(
                Member.builder()
                    .role(Member.Role.ADMIN)
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .modelAliases(JsonValue.from(mapOf<String, Any>()))
            .addModel(JsonValue.from(mapOf<String, Any>()))
            .organizationId("organization_id")
            .rpmLimit(0L)
            .addTag(JsonValue.from(mapOf<String, Any>()))
            .teamAlias("team_alias")
            .teamId("team_id")
            .tpmLimit(0L)
            .build()
    }

    @Test
    fun headers() {
        val params =
            TeamCreateParams.builder()
                .llmChangedBy("llm-changed-by")
                .addAdmin(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .addGuardrail("string")
                .maxBudget(0.0)
                .addMember(JsonValue.from(mapOf<String, Any>()))
                .addMembersWithRole(
                    Member.builder()
                        .role(Member.Role.ADMIN)
                        .userEmail("user_email")
                        .userId("user_id")
                        .build()
                )
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelAliases(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .organizationId("organization_id")
                .rpmLimit(0L)
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .teamAlias("team_alias")
                .teamId("team_id")
                .tpmLimit(0L)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("llm-changed-by", "llm-changed-by").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = TeamCreateParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            TeamCreateParams.builder()
                .llmChangedBy("llm-changed-by")
                .addAdmin(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .addGuardrail("string")
                .maxBudget(0.0)
                .addMember(JsonValue.from(mapOf<String, Any>()))
                .addMembersWithRole(
                    Member.builder()
                        .role(Member.Role.ADMIN)
                        .userEmail("user_email")
                        .userId("user_id")
                        .build()
                )
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelAliases(JsonValue.from(mapOf<String, Any>()))
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .organizationId("organization_id")
                .rpmLimit(0L)
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .teamAlias("team_alias")
                .teamId("team_id")
                .tpmLimit(0L)
                .build()

        val body = params._body()

        assertThat(body.admins().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetDuration()).contains("budget_duration")
        assertThat(body.guardrails().getOrNull()).containsExactly("string")
        assertThat(body.maxBudget()).contains(0.0)
        assertThat(body.members().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.membersWithRoles().getOrNull())
            .containsExactly(
                Member.builder()
                    .role(Member.Role.ADMIN)
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._modelAliases()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.models().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.organizationId()).contains("organization_id")
        assertThat(body.rpmLimit()).contains(0L)
        assertThat(body.tags().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.teamAlias()).contains("team_alias")
        assertThat(body.teamId()).contains("team_id")
        assertThat(body.tpmLimit()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TeamCreateParams.builder().build()

        val body = params._body()
    }
}
