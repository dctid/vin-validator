package com.d.r.c.vin

import assertk.assertThat
import assertk.assertions.isFalse
import assertk.assertions.isTrue
import org.junit.jupiter.api.Test

internal class VinValidatorTest {

    @Test
    internal fun `should accept valid 17 char vin`() {
        assertThat(VinValidator().validate("1FTDX1868WKA10140")).isTrue()
    }

    @Test
    internal fun `should reject invalid checksum 17 char vin`() {
        assertThat(VinValidator().validate("1FTDX1869WKA10140")).isFalse()
    }

    @Test
    internal fun `should reject invalid chars 17 char vin`() {
        assertThat(VinValidator().validate("1qTDX1869WKA10140")).isFalse()
    }
}

