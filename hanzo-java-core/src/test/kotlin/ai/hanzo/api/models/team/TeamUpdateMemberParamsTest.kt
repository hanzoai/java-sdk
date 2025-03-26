// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.team

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamUpdateMemberParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        TeamUpdateMemberParams.builder()
            .teamId("team_id")
            .maxBudgetInTeam(0.0)
            .role(TeamUpdateMemberParams.Role.ADMIN)
            .userEmail("user_email")
            .userId("user_id")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            TeamUpdateMemberParams.builder()
                .teamId("team_id")
                .maxBudgetInTeam(0.0)
                .role(TeamUpdateMemberParams.Role.ADMIN)
                .userEmail("user_email")
                .userId("user_id")
                .build()

        val body = params._body()

        assertThat(body.teamId()).isEqualTo("team_id")
        assertThat(body.maxBudgetInTeam()).contains(0.0)
        assertThat(body.role()).contains(TeamUpdateMemberParams.Role.ADMIN)
        assertThat(body.userEmail()).contains("user_email")
        assertThat(body.userId()).contains("user_id")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = TeamUpdateMemberParams.builder().teamId("team_id").build()

        val body = params._body()

        assertThat(body.teamId()).isEqualTo("team_id")
    }
}
