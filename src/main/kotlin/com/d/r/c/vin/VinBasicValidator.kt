package com.d.r.c.vin


val valLength = { s: String -> s.length == 17 }

val validate11Length = { vin: String ->
    vin.length == 11
}

val validChars = { vin: String ->
    Regex("^[0-9a-hj-npr-z]{8}[0-9x][0-9a-hj-npr-z]{8}\$", RegexOption.IGNORE_CASE)
        .matches(vin)
}