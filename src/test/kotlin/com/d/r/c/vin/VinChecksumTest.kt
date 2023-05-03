package com.d.r.c.vin

import assertk.assertThat
import assertk.assertions.isFalse
import assertk.assertions.isTrue
import org.junit.jupiter.api.Test

internal class VinChecksumTest {
    @Test
    internal fun `valid checksum returns true`() {
        assertThat(VinValidator().validate("1FTDX1868WKA10140", Validators.CHECKSUM)).isTrue()
    }
    @Test
    internal fun `valid checksum lowercase returns true`() {
        assertThat(VinValidator().validate("1ftdx1868wka10140", Validators.CHECKSUM)).isTrue()
    }

    @Test
    internal fun `valid checksum with X check digit returns true`() {
        assertThat(VinValidator().validate("1FTDX086XVKA87410", Validators.CHECKSUM)).isTrue()
    }

    @Test
    internal fun `invalid checksum returns false`() {
        assertThat(VinValidator().validate("1FTDX186XWKA10140", Validators.CHECKSUM)).isFalse()
    }

    @Test
    internal fun `invalid checksum char returns false`() {
        assertThat(VinValidator().validate("1FTDX186zWKA10140", Validators.CHECKSUM)).isFalse()
    }

    @Test
    internal fun `short vin checksum returns false`() {
        assertThat(VinValidator().validate("1FTDX186zWKA1014", Validators.CHECKSUM)).isFalse()
    }

    @Test
    internal fun `long vin checksum returns false`() {
        assertThat(VinValidator().validate("1FTDX186zWKA101400", Validators.CHECKSUM)).isFalse()
    }

    @Test
    internal fun `contains 18 chars is false`() {
        assertThat(VinValidator().validate("1FTDX1868WKA10140p", Validators.CHECKSUM)).isFalse()
    }

    @Test
    internal fun `contains 16 chars is false`() {
        assertThat(VinValidator().validate("1FTDX1868WKA1014", Validators.CHECKSUM)).isFalse()
    }
}