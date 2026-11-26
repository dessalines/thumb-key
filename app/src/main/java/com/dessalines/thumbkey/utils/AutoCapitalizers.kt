package com.dessalines.thumbkey.utils

import com.dessalines.thumbkey.IMEService

typealias AutoCapitalizers = Array<(IMEService) -> Unit>

private val OPENING_PUNCTUATION = setOf('(', '[', '{', '"', '\'', '“', '‘', '—', '-')

private fun isLoneI(
    textBefore: CharSequence?,
    suffix: String,
): Boolean {
    if (textBefore == null || !textBefore.endsWith("i$suffix")) return false
    val beforeI = textBefore.length - suffix.length - 2
    return beforeI < 0 || textBefore[beforeI].isWhitespace() || textBefore[beforeI] in OPENING_PUNCTUATION
}

fun autoCapitalizeI(ime: IMEService) {
    if (isUriOrEmailOrPasswordField(ime)) return
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(3, 0)
    if (isLoneI(textBefore, " ")) {
        ime.currentInputConnection.deleteSurroundingText(2, 0)
        ime.currentInputConnection.commitText("I ", 1)
    }
}

fun autoCapitalizeIApostrophe(ime: IMEService) {
    if (isUriOrEmailOrPasswordField(ime)) return
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(3, 0)
    if (isLoneI(textBefore, "'")) {
        ime.currentInputConnection.deleteSurroundingText(2, 0)
        ime.currentInputConnection.commitText("I'", 1)
    }
}

fun autoCapitalizeIApostropheLL(ime: IMEService) {
    if (isUriOrEmailOrPasswordField(ime)) return
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(5, 0)
    if (isLoneI(textBefore, "'ll")) {
        ime.currentInputConnection.deleteSurroundingText(4, 0)
        ime.currentInputConnection.commitText("I'll", 1)
    }
}
