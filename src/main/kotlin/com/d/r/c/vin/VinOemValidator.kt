package com.d.r.c.vin


val validateFordOem = { vin: String -> true }

fun getValidateOem(oem: String): (String) -> Boolean =
    validateFordOem