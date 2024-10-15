package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC

val TYPESPLIT_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                textEditKeyItem(
                    center = KeyC(KeyAction.CommitText(" ")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("1"), size = FontSizeVariant.LARGE),
                    bottomRight = KeyC(KeyAction.CommitText("!")),
                    top =
                        KeyC(
                            KeyAction.CommitText("¯\\_(ツ)_/¯"),
                            size = FontSizeVariant.SMALLEST,
                        ),
                    bottom = KeyC(KeyAction.CommitText("~")),
                    left = KeyC(KeyAction.CommitText("{")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("2"), size = FontSizeVariant.LARGE),
                    bottom = KeyC(KeyAction.CommitText("@")),
                    topLeft = KeyC(KeyAction.CommitText("`")),
                    topRight = KeyC(KeyAction.CommitText("´")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("3"), size = FontSizeVariant.LARGE),
                    right = KeyC(KeyAction.CommitText("}")),
                    topRight = KeyC(KeyAction.CommitText("°")),
                    bottomLeft = KeyC(KeyAction.CommitText("#")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("."), size = FontSizeVariant.LARGE),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC(KeyAction.CommitText(" ")),
                    top = KeyC(KeyAction.CommitText("+")),
                    bottom = KeyC(KeyAction.CommitText("=")),
                    left = KeyC(KeyAction.CommitText("-")),
                    right = KeyC(KeyAction.CommitText("_")),
                    backgroundColor = ColorVariant.SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("4"), size = FontSizeVariant.LARGE),
                    top = KeyC(KeyAction.CommitText("\"")),
                    bottom = KeyC(KeyAction.CommitText(":")),
                    left = KeyC(KeyAction.CommitText("(")),
                    right = KeyC(KeyAction.CommitText("$")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("5"), size = FontSizeVariant.LARGE),
                    left = KeyC(KeyAction.CommitText("€")),
                    right = KeyC(KeyAction.CommitText("£")),
                    bottom = KeyC(KeyAction.CommitText("%")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("6"), size = FontSizeVariant.LARGE),
                    top = KeyC(KeyAction.CommitText("'")),
                    bottom = KeyC(KeyAction.CommitText(";")),
                    left = KeyC(KeyAction.CommitText("^")),
                    right = KeyC(KeyAction.CommitText(")")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText(","), size = FontSizeVariant.LARGE),
                ),
            ),
            listOf(
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("7"), size = FontSizeVariant.LARGE),
                    topLeft = KeyC(KeyAction.CommitText("[")),
                    topRight = KeyC(KeyAction.CommitText("&")),
                    bottomLeft = KeyC(KeyAction.CommitText("<")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("8"), size = FontSizeVariant.LARGE),
                    top = KeyC(KeyAction.CommitText("*")),
                    bottom = KeyC(KeyAction.CommitText("?")),
                    left = KeyC(KeyAction.CommitText("/")),
                    right = KeyC(KeyAction.CommitText("\\")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("9"), size = FontSizeVariant.LARGE),
                    left = KeyC(KeyAction.CommitText("|")),
                    topRight = KeyC(KeyAction.CommitText("]")),
                    bottomRight = KeyC(KeyAction.CommitText(">")),
                ),
                KeyItemC(
                    center = KeyC(KeyAction.CommitText("0"), size = FontSizeVariant.LARGE),
                ),
            ),
            listOf(
                ABC_KEY_ITEM_ALT,
                BACKSPACE_WIDE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
