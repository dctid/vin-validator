package com.d.r.c.vin

import assertk.assertThat
import assertk.assertions.isFalse
import assertk.assertions.isTrue
import org.junit.jupiter.api.Test

class VinOemTest {
    @Test
    internal fun `should reject invalid chars 17 char vin`() {
        assertThat(VinValidator().validate("1FTDX1868WKA10140", Validators.FORD)).isTrue()}
}

