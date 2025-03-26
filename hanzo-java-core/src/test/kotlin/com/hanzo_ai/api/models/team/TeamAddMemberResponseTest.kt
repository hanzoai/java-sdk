// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.team

import com.hanzo_ai.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamAddMemberResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val teamAddMemberResponse =
            TeamAddMemberResponse.builder()
                .teamId("team_id")
                .addUpdatedTeamMembership(
                    TeamAddMemberResponse.UpdatedTeamMembership.builder()
                        .budgetId("budget_id")
                        .llmBudgetTable(
                            TeamAddMemberResponse.UpdatedTeamMembership.LlmBudgetTable.builder()
                                .budgetDuration("budget_duration")
                                .maxBudget(0.0)
                                .maxParallelRequests(0L)
                                .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                                .rpmLimit(0L)
                                .softBudget(0.0)
                                .tpmLimit(0L)
                                .build()
                        )
                        .teamId("team_id")
                        .userId("user_id")
                        .build()
                )
                .addUpdatedUser(
                    TeamAddMemberResponse.UpdatedUser.builder()
                        .userId("user_id")
                        .budgetDuration("budget_duration")
                        .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maxBudget(0.0)
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                        .modelSpend(JsonValue.from(mapOf<String, Any>()))
                        .addModel(JsonValue.from(mapOf<String, Any>()))
                        .addOrganizationMembership(
                            TeamAddMemberResponse.UpdatedUser.OrganizationMembership.builder()
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .organizationId("organization_id")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .userId("user_id")
                                .budgetId("budget_id")
                                .llmBudgetTable(
                                    TeamAddMemberResponse.UpdatedUser.OrganizationMembership
                                        .LlmBudgetTable
                                        .builder()
                                        .budgetDuration("budget_duration")
                                        .maxBudget(0.0)
                                        .maxParallelRequests(0L)
                                        .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                                        .rpmLimit(0L)
                                        .softBudget(0.0)
                                        .tpmLimit(0L)
                                        .build()
                                )
                                .spend(0.0)
                                .user(JsonValue.from(mapOf<String, Any>()))
                                .userRole("user_role")
                                .build()
                        )
                        .rpmLimit(0L)
                        .spend(0.0)
                        .ssoUserId("sso_user_id")
                        .addTeam("string")
                        .tpmLimit(0L)
                        .userEmail("user_email")
                        .userRole("user_role")
                        .build()
                )
                .addAdmin(JsonValue.from(mapOf<String, Any>()))
                .blocked(true)
                .budgetDuration("budget_duration")
                .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .llmModelTable(
                    TeamAddMemberResponse.LlmModelTable.builder()
                        .createdBy("created_by")
                        .updatedBy("updated_by")
                        .modelAliases(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .addMember(JsonValue.from(mapOf<String, Any>()))
                .addMembersWithRole(
                    Member.builder()
                        .role(Member.Role.ADMIN)
                        .userEmail("user_email")
                        .userId("user_id")
                        .build()
                )
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .modelId(0L)
                .addModel(JsonValue.from(mapOf<String, Any>()))
                .organizationId("organization_id")
                .rpmLimit(0L)
                .spend(0.0)
                .teamAlias("team_alias")
                .tpmLimit(0L)
                .build()

        assertThat(teamAddMemberResponse.teamId()).isEqualTo("team_id")
        assertThat(teamAddMemberResponse.updatedTeamMemberships())
            .containsExactly(
                TeamAddMemberResponse.UpdatedTeamMembership.builder()
                    .budgetId("budget_id")
                    .llmBudgetTable(
                        TeamAddMemberResponse.UpdatedTeamMembership.LlmBudgetTable.builder()
                            .budgetDuration("budget_duration")
                            .maxBudget(0.0)
                            .maxParallelRequests(0L)
                            .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                            .rpmLimit(0L)
                            .softBudget(0.0)
                            .tpmLimit(0L)
                            .build()
                    )
                    .teamId("team_id")
                    .userId("user_id")
                    .build()
            )
        assertThat(teamAddMemberResponse.updatedUsers())
            .containsExactly(
                TeamAddMemberResponse.UpdatedUser.builder()
                    .userId("user_id")
                    .budgetDuration("budget_duration")
                    .budgetResetAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .maxBudget(0.0)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                    .modelSpend(JsonValue.from(mapOf<String, Any>()))
                    .addModel(JsonValue.from(mapOf<String, Any>()))
                    .addOrganizationMembership(
                        TeamAddMemberResponse.UpdatedUser.OrganizationMembership.builder()
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .organizationId("organization_id")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .userId("user_id")
                            .budgetId("budget_id")
                            .llmBudgetTable(
                                TeamAddMemberResponse.UpdatedUser.OrganizationMembership
                                    .LlmBudgetTable
                                    .builder()
                                    .budgetDuration("budget_duration")
                                    .maxBudget(0.0)
                                    .maxParallelRequests(0L)
                                    .modelMaxBudget(JsonValue.from(mapOf<String, Any>()))
                                    .rpmLimit(0L)
                                    .softBudget(0.0)
                                    .tpmLimit(0L)
                                    .build()
                            )
                            .spend(0.0)
                            .user(JsonValue.from(mapOf<String, Any>()))
                            .userRole("user_role")
                            .build()
                    )
                    .rpmLimit(0L)
                    .spend(0.0)
                    .ssoUserId("sso_user_id")
                    .addTeam("string")
                    .tpmLimit(0L)
                    .userEmail("user_email")
                    .userRole("user_role")
                    .build()
            )
        assertThat(teamAddMemberResponse.admins().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(teamAddMemberResponse.blocked()).contains(true)
        assertThat(teamAddMemberResponse.budgetDuration()).contains("budget_duration")
        assertThat(teamAddMemberResponse.budgetResetAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(teamAddMemberResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(teamAddMemberResponse.llmModelTable())
            .contains(
                TeamAddMemberResponse.LlmModelTable.builder()
                    .createdBy("created_by")
                    .updatedBy("updated_by")
                    .modelAliases(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(teamAddMemberResponse.maxBudget()).contains(0.0)
        assertThat(teamAddMemberResponse.maxParallelRequests()).contains(0L)
        assertThat(teamAddMemberResponse.members().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(teamAddMemberResponse.membersWithRoles().getOrNull())
            .containsExactly(
                Member.builder()
                    .role(Member.Role.ADMIN)
                    .userEmail("user_email")
                    .userId("user_id")
                    .build()
            )
        assertThat(teamAddMemberResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(teamAddMemberResponse.modelId()).contains(0L)
        assertThat(teamAddMemberResponse.models().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(teamAddMemberResponse.organizationId()).contains("organization_id")
        assertThat(teamAddMemberResponse.rpmLimit()).contains(0L)
        assertThat(teamAddMemberResponse.spend()).contains(0.0)
        assertThat(teamAddMemberResponse.teamAlias()).contains("team_alias")
        assertThat(teamAddMemberResponse.tpmLimit()).contains(0L)
    }
}
