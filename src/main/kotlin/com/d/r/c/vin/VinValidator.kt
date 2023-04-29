package com.d.r.c.vin

class VinValidator {

    fun validate(vin: String): Boolean =
        listOf(
            valLength,
            validChars,
            checksum
        ).map { it(vin) }.all { it }

}


