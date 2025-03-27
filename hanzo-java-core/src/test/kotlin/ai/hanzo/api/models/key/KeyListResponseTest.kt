// File generated from our OpenAPI spec by Stainless.

package ai.hanzo.api.models.key

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val keyListResponse =
            KeyListResponse.builder()
                .currentPage(0L)
                .addKey("string")
                .totalCount(0L)
                .totalPages(0L)
                .build()

        assertThat(keyListResponse.currentPage()).contains(0L)
        assertThat(keyListResponse.keys().getOrNull())
            .containsExactly(KeyListResponse.Key.ofString("string"))
        assertThat(keyListResponse.totalCount()).contains(0L)
        assertThat(keyListResponse.totalPages()).contains(0L)
    }
}
