package com.dessalines.thumbkey.utils

import com.dessalines.thumbkey.IMEService

typealias AutoCapitalizers = Array<(IMEService) -> Unit>

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
