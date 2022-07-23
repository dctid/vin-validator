package com.d.r.c.vin

import assertk.assertThat
import assertk.assertions.isFalse
import assertk.assertions.isTrue
import org.junit.jupiter.api.Test

internal class VinChecksumTest {
    @Test
    internal fun `valid checksum returns true`() {
        assertThat(checksum("1FTDX1868WKA10140")).isTrue()
    }

    @Test
    internal fun `valid checksum with X check digit returns true`() {
        assertThat(checksum("1FTDX086XVKA87410")).isTrue()
    }

    @Test
    internal fun `invalid checksum returns false`() {
        assertThat(checksum("1FTDX186XWKA10140")).isFalse()
    }
}