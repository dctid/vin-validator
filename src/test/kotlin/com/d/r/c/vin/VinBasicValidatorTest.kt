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

    @Test
    internal fun `vin is 11 chars is true`() {
        assertTrue(validate11Length("12345678901"))
    }

    @Test
    internal fun `vin is not 11 chars is false`() {
        assertFalse(validate11Length("123456789012"))
    }
}