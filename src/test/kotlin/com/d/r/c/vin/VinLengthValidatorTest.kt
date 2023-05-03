package com.d.r.c.vin

import assertk.assertThat
import assertk.assertions.isFalse
import assertk.assertions.isTrue
import org.junit.jupiter.api.Test

internal class VinLengthValidatorTest {
    @Test
    internal fun `vin is 17 chars is true`() {
        assertThat(VinValidator().validate("12345678901234567", Validators.LENGTH)).isTrue()
    }

    @Test
    internal fun `vin is not 17 chars is false`() {
        assertThat(VinValidator().validate("1234567890123456", Validators.LENGTH)).isFalse()
    }

    @Test
    internal fun `vin is 11 chars is true`() {
        assertThat(VinValidator().validate("12345678901", Validators.LENGTH_11)).isTrue()
    }

    @Test
    internal fun `vin is not 11 chars is false`() {
        assertThat(VinValidator().validate("123456789012", Validators.LENGTH_11)).isFalse()
    }
}