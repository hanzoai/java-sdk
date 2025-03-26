// File generated from our OpenAPI spec by Stainless.

package com.hanzo_ai.api.models.assemblyai

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssemblyaiPatchParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        AssemblyaiPatchParams.builder().endpoint("endpoint").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = AssemblyaiPatchParams.builder().endpoint("endpoint").build()

        assertThat(params._pathParam(0)).isEqualTo("endpoint")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
