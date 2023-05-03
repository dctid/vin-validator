package com.d.r.c.vin

import assertk.assertThat
import assertk.assertions.isFalse
import assertk.assertions.isTrue
import org.junit.jupiter.api.Test

class VinCharsTest {

    @Test
    internal fun `valid chars is true`() {
        assertThat(VinValidator().validate("1FTDX186XWKA10140", Validators.CHARS)).isTrue()
    }

    @Test
    internal fun `valid chars lowercase is true`() {
        assertThat(VinValidator().validate("1ftdx186xwka10140", Validators.CHARS)).isTrue()
    }

    @Test
    internal fun `contains i is false`() {
        assertThat(VinValidator().validate("1FTDX186XWKA101i0", Validators.CHARS)).isFalse()
    }

    @Test
    internal fun `contains o is false`() {
        assertThat(VinValidator().validate("1FToX186XWKA10140", Validators.CHARS)).isFalse()
    }

    @Test
    internal fun `contains q is false`() {
        assertThat(VinValidator().validate("1FTDX186XqKA10140", Validators.CHARS)).isFalse()
    }

    @Test
    internal fun `check digit a is false`() {
        assertThat(VinValidator().validate("1FTDX186aWKA10140", Validators.CHARS)).isFalse()
    }
}