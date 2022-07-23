package com.d.r.c.vin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class VinValidatorTest {

    @Test
    internal fun `should accept valid 17 char vin`() {
        assertTrue(VinValidator().validate("12345678901234567"))
    }
}