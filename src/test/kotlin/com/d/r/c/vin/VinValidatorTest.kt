package com.d.r.c.vin

import assertk.assertThat
import assertk.assertions.isTrue
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class VinValidatorTest {

    @Test
    internal fun `should accept valid 17 char vin`() {
        assertThat(VinValidator().validate("1FTDX1868WKA10140")).isTrue()
    }
}

