// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.finetuning.jobs

import ai.hanzo.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LiteLlmFineTuningJobCreateTest {

    @Test
    fun create() {
        val liteLlmFineTuningJobCreate =
            LiteLlmFineTuningJobCreate.builder()
                .model("model")
                .trainingFile("training_file")
                .customLlmProvider(LiteLlmFineTuningJobCreate.CustomLlmProvider.OPENAI)
                .hyperparameters(
                    LiteLlmFineTuningJobCreate.Hyperparameters.builder()
                        .batchSize("string")
                        .learningRateMultiplier("string")
                        .nEpochs("string")
                        .build()
                )
                .addIntegration("string")
                .seed(0L)
                .suffix("suffix")
                .validationFile("validation_file")
                .build()

        assertThat(liteLlmFineTuningJobCreate.model()).isEqualTo("model")
        assertThat(liteLlmFineTuningJobCreate.trainingFile()).isEqualTo("training_file")
        assertThat(liteLlmFineTuningJobCreate.customLlmProvider())
            .contains(LiteLlmFineTuningJobCreate.CustomLlmProvider.OPENAI)
        assertThat(liteLlmFineTuningJobCreate.hyperparameters())
            .contains(
                LiteLlmFineTuningJobCreate.Hyperparameters.builder()
                    .batchSize("string")
                    .learningRateMultiplier("string")
                    .nEpochs("string")
                    .build()
            )
        assertThat(liteLlmFineTuningJobCreate.integrations().getOrNull()).containsExactly("string")
        assertThat(liteLlmFineTuningJobCreate.seed()).contains(0L)
        assertThat(liteLlmFineTuningJobCreate.suffix()).contains("suffix")
        assertThat(liteLlmFineTuningJobCreate.validationFile()).contains("validation_file")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val liteLlmFineTuningJobCreate =
            LiteLlmFineTuningJobCreate.builder()
                .model("model")
                .trainingFile("training_file")
                .customLlmProvider(LiteLlmFineTuningJobCreate.CustomLlmProvider.OPENAI)
                .hyperparameters(
                    LiteLlmFineTuningJobCreate.Hyperparameters.builder()
                        .batchSize("string")
                        .learningRateMultiplier("string")
                        .nEpochs("string")
                        .build()
                )
                .addIntegration("string")
                .seed(0L)
                .suffix("suffix")
                .validationFile("validation_file")
                .build()

        val roundtrippedLiteLlmFineTuningJobCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(liteLlmFineTuningJobCreate),
                jacksonTypeRef<LiteLlmFineTuningJobCreate>(),
            )

        assertThat(roundtrippedLiteLlmFineTuningJobCreate).isEqualTo(liteLlmFineTuningJobCreate)
    }
}
