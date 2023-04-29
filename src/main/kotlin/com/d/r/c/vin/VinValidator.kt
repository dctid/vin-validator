package com.d.r.c.vin

class VinValidator {

    fun validate(vin: String): Boolean {
        val validators = listOf<(String)->Boolean>(valLength, { s -> validateLength(s)})
        return checksum(vin)
    }
}


