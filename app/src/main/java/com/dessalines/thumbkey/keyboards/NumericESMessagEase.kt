package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.getLocalCurrency

// this val is so we can can use mapOf in the key with currency symbol
val KB_ES_MESSAGEASE_CURRENCY_SYMBOL: String =
    getLocalCurrency()?.let {
        if (it !in setOf("$", "£", "€")) {
            it
        } else {
            "$"
        }
    }!!

val KB_ES_MESSAGEASE_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    right = KeyC(action = KeyAction.CommitText("-")),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText(KB_ES_MESSAGEASE_CURRENCY_SYMBOL),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft = KeyC(action = KeyAction.CommitText("`")),
                    top = KeyC(action = KeyAction.CommitText("^")),
                    topRight = KeyC(action = KeyAction.CommitText("´")),
                    right = KeyC(action = KeyAction.CommitText("!")),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("\\"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("/"),
                        ),
                    left = KeyC(action = KeyAction.CommitText("+")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topRight = KeyC(action = KeyAction.CommitText("¡")),
                    left = KeyC(action = KeyAction.CommitText("?")),
                    right = KeyC(action = KeyAction.CommitText("¿")),
                    bottomRight = KeyC(action = KeyAction.CommitText("€")),
                    bottomLeft = KeyC(action = KeyAction.CommitText("£")),
                    bottom = KeyC(action = KeyAction.CommitText("=")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft = KeyC(action = KeyAction.CommitText("{")),
                    topRight = KeyC(action = KeyAction.CommitText("%")),
                    bottomRight = KeyC(action = KeyAction.CommitText("_")),
                    bottomLeft = KeyC(action = KeyAction.CommitText("[")),
                    left = KeyC(action = KeyAction.CommitText("(")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top = KeyC(action = KeyAction.CommitText("¬")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft = KeyC(action = KeyAction.CommitText("|")),
                    topRight = KeyC(action = KeyAction.CommitText("}")),
                    right = KeyC(action = KeyAction.CommitText(")")),
                    bottomRight = KeyC(action = KeyAction.CommitText("]")),
                    bottomLeft = KeyC(action = KeyAction.CommitText("@")),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft = KeyC(action = KeyAction.CommitText("~")),
                    top = KeyC(action = KeyAction.CommitText("¨")),
                    left = KeyC(action = KeyAction.CommitText("<")),
                    right = KeyC(action = KeyAction.CommitText("*")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    topLeft = KeyC(action = KeyAction.CommitText("\"")),
                    topRight = KeyC(action = KeyAction.CommitText("'")),
                    bottomRight = KeyC(action = KeyAction.CommitText(":")),
                    bottom = KeyC(action = KeyAction.CommitText(".")),
                    bottomLeft = KeyC(action = KeyAction.CommitText(",")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("9"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    top = KeyC(action = KeyAction.CommitText("&")),
                    topRight = KeyC(action = KeyAction.CommitText("°")),
                    right = KeyC(action = KeyAction.CommitText(">")),
                    bottomLeft = KeyC(action = KeyAction.CommitText(";")),
                    left = KeyC(action = KeyAction.CommitText("#")),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("0"),
                            size = FontSizeVariant.LARGE,
                            color = ColorVariant.PRIMARY,
                        ),
                    widthMultiplier = 2,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
