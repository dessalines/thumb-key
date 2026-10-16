package com.dessalines.thumbkey.utils

import com.dessalines.thumbkey.IMEService

typealias AutoCapitalizers = Array<(IMEService) -> Unit>

fun autoCapitalizeSpanishOpeningMarks(ime: IMEService) {
    val inputConnection = ime.currentInputConnection
    val textBeforeCursor = inputConnection.getTextBeforeCursor(2, 0)
    val replacement = spanishOpeningMarkReplacement(textBeforeCursor)
    if (replacement != null) {
        inputConnection.deleteSurroundingText(1, 0)
        inputConnection.commitText(replacement, 1)
    }
}

internal fun spanishOpeningMarkReplacement(textBeforeCursor: CharSequence?): String? {
    if (textBeforeCursor == null || textBeforeCursor.length < 2) return null

    val previousCharacter = textBeforeCursor[textBeforeCursor.length - 2]
    val lastCharacter = textBeforeCursor.last()
    return if (previousCharacter in "¡¿" && lastCharacter.isLowerCase()) lastCharacter.uppercase() else null
}

fun autoCapitalizeI(ime: IMEService) {
    // Capitalizes 'i'
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(3, 0)
    if (!textBefore.isNullOrEmpty()) {
        if (textBefore == " i ") {
            ime.currentInputConnection.deleteSurroundingText(2, 0)
            ime.currentInputConnection.commitText(
                "I ",
                1,
            )
        }
    }
}

fun autoCapitalizeIApostrophe(ime: IMEService) {
    // Capitalizes "i'"
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(3, 0)
    if (!textBefore.isNullOrEmpty()) {
        if (textBefore == " i\'") {
            ime.currentInputConnection.deleteSurroundingText(2, 0)
            ime.currentInputConnection.commitText(
                "I\'",
                1,
            )
        }
    }
}

fun autoCapitalizeIApostropheLL(ime: IMEService) {
    // Capitalizes "i'll"
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(5, 0)
    if (!textBefore.isNullOrEmpty()) {
        if (textBefore == " i\'ll") {
            ime.currentInputConnection.deleteSurroundingText(4, 0)
            ime.currentInputConnection.commitText(
                "I\'ll",
                1,
            )
        }
    }
}
