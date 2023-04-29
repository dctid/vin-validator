package com.d.r.c.vin

fun validateLength(vin: String): Boolean =
    vin.length == 17

val valLength = { s: String -> s.length == 17 }

fun validate11Length(vin: String) =
    vin.length == 11

fun validChars(vin: String) =
    Regex("^[0-9a-hj-npr-z]{8}[0-9x][0-9a-hj-npr-z]{8}\$", RegexOption.IGNORE_CASE)
        .matches(vin)