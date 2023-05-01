package com.d.r.c.vin

class VinValidator {

    fun validate(vin: String, vararg validators: Validators) =
        validators.map { it.validator(vin) }.all { it }

}

enum class Validators(val validator: (String) -> Boolean) {
    LENGTH(valLength), CHARS(validChars), CHECKSUM(checksum), LENGTH_11(validate11Length)
}

