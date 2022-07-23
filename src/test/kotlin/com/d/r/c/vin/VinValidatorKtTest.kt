package com.d.r.c.vin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class VinValidatorKtTest {
    @Test
    internal fun `valid checksum returns true`() {
        assertTrue(checksum("1FTDX1868WKA10140"))
    }

    @Test
    internal fun `valid checksum with X check digit returns true`() {
        assertTrue(checksum("1FTDX086XVKA87410"))
    }

    @Test
    internal fun `invalid checksum returns false`() {
        assertFalse(checksum("1FTDX186XWKA10140"))
    }
}