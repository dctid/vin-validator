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
    internal fun `valid checksum lowercase returns true`() {
        assertThat(checksum("1ftdx1868wka10140")).isTrue()
    }

    @Test
    internal fun `valid checksum with X check digit returns true`() {
        assertThat(checksum("1FTDX086XVKA87410")).isTrue()
    }

    @Test
    internal fun `invalid checksum returns false`() {
        assertThat(checksum("1FTDX186XWKA10140")).isFalse()
    }

    @Test
    internal fun `invalid checksum char returns false`() {
        assertThat(checksum("1FTDX186zWKA10140")).isFalse()
    }

    @Test
    internal fun `valid chars is true`() {
        assertThat(validChars("1FTDX186XWKA10140")).isTrue()
    }

    @Test
    internal fun `valid chars lowercase is true`() {
        assertThat(validChars("1ftdx186xwka10140")).isTrue()
    }

    @Test
    internal fun `contains i is false`() {
        assertThat(validChars("1FTDX186XWKA101i0")).isFalse()
    }

    @Test
    internal fun `contains o is false`() {
        assertThat(validChars("1FToX186XWKA10140")).isFalse()
    }

    @Test
    internal fun `contains q is false`() {
        assertThat(validChars("1FTDX186XqKA10140")).isFalse()
    }

    @Test
    internal fun `check digit a is false`() {
        assertThat(validChars("1FTDX186aWKA10140")).isFalse()
    }
    @Test
    internal fun `contains 18 chars is false`() {
        assertThat(checksum("1FTDX1868WKA10140p")).isFalse()
    }

    @Test
    internal fun `contains 16 chars is false`() {
        assertThat(checksum("1FTDX1868WKA1014")).isFalse()
    }
}