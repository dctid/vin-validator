package com.d.r.c.vin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class VinBasicValidatorTest {
    @Test
    internal fun `vin is 17 chars is true`() {
        assertTrue(validateLength("12345678901234567"))
    }

    @Test
    internal fun `vin is not 17 chars is false`() {
        assertFalse(validateLength("1234567890123456"))
    }
}