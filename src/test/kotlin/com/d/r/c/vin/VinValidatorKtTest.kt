package com.d.r.c.vin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class VinValidatorKtTest {
    @Test
    internal fun `valid checksum returns true`() {
        assertTrue(checksum("1FTDX1868WKA10140"))
    }
}