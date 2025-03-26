// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.key

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyCheckHealthResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val keyCheckHealthResponse =
            KeyCheckHealthResponse.builder()
                .key(KeyCheckHealthResponse.Key.HEALTHY)
                .loggingCallbacks(
                    KeyCheckHealthResponse.LoggingCallbacks.builder()
                        .addCallback("string")
                        .details("details")
                        .status(KeyCheckHealthResponse.LoggingCallbacks.Status.HEALTHY)
                        .build()
                )
                .build()

        assertThat(keyCheckHealthResponse.key()).contains(KeyCheckHealthResponse.Key.HEALTHY)
        assertThat(keyCheckHealthResponse.loggingCallbacks())
            .contains(
                KeyCheckHealthResponse.LoggingCallbacks.builder()
                    .addCallback("string")
                    .details("details")
                    .status(KeyCheckHealthResponse.LoggingCallbacks.Status.HEALTHY)
                    .build()
            )
    }
}
