// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.model

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelInfoTest {

    @Test
    fun create() {
        val modelInfo =
            ModelInfo.builder()
                .id("id")
                .baseModel("base_model")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .dbModel(true)
                .teamId("team_id")
                .teamPublicModelName("team_public_model_name")
                .tier(ModelInfo.Tier.FREE)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBy("updated_by")
                .build()

        assertThat(modelInfo.id()).contains("id")
        assertThat(modelInfo.baseModel()).contains("base_model")
        assertThat(modelInfo.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(modelInfo.createdBy()).contains("created_by")
        assertThat(modelInfo.dbModel()).contains(true)
        assertThat(modelInfo.teamId()).contains("team_id")
        assertThat(modelInfo.teamPublicModelName()).contains("team_public_model_name")
        assertThat(modelInfo.tier()).contains(ModelInfo.Tier.FREE)
        assertThat(modelInfo.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(modelInfo.updatedBy()).contains("updated_by")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelInfo =
            ModelInfo.builder()
                .id("id")
                .baseModel("base_model")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("created_by")
                .dbModel(true)
                .teamId("team_id")
                .teamPublicModelName("team_public_model_name")
                .tier(ModelInfo.Tier.FREE)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBy("updated_by")
                .build()

        val roundtrippedModelInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelInfo),
                jacksonTypeRef<ModelInfo>(),
            )

        assertThat(roundtrippedModelInfo).isEqualTo(modelInfo)
    }
}
