package com.d.r.c.vin

val checksum = { vin: String ->
    calculateChecksum(vin) == vin[8].toChecksumDigit()
}

private fun calculateChecksum(vin: String) =
    vin.mapIndexed { index, c -> c.checksumDigitValue(index) }.sum() % 11

private fun Char.checksumDigitValue(index: Int) =
    (charValues[this] ?: -1) * weights[index]

private fun Char.toChecksumDigit() =
    checksumDigits[this]

private val weights = listOf(8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2)
private val checksumDigits = mapOf(
    '1' to 1,
    '2' to 2,
    '3' to 3,
    '4' to 4,
    '5' to 5,
    '6' to 6,
    '7' to 7,
    '8' to 8,
    '9' to 9,
    '0' to 0,
    'X' to 10,
)
private val charValues = mapOf(
    '1' to 1,
    '2' to 2,
    '3' to 3,
    '4' to 4,
    '5' to 5,
    '6' to 6,
    '7' to 7,
    '8' to 8,
    '9' to 9,
    '0' to 0,
    'A' to 1,
    'B' to 2,
    'C' to 3,
    'D' to 4,
    'E' to 5,
    'F' to 6,
    'G' to 7,
    'H' to 8,
    'J' to 1,
    'K' to 2,
    'L' to 3,
    'M' to 4,
    'N' to 5,
    'P' to 7,
    'R' to 9,
    'S' to 2,
    'T' to 3,
    'U' to 4,
    'V' to 5,
    'W' to 6,
    'X' to 7,
    'Y' to 8,
    'Z' to 9,
)