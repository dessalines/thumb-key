@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_KR_TYPESPLIT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ㄱ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ㄲ"),
                    bottom = KeyC("ㅂ"),
                ),
                KeyItemC(
                    center = KeyC("ㅅ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ㅆ"),
                    bottom = KeyC("ㅈ"),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("ㅗ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ㅐ"),
                    bottom = KeyC("ㅛ"),
                ),
                KeyItemC(
                    center = KeyC("ㅓ", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    left = KeyC("ㅔ"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ㄴ", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("ㄷ"),
                    top = KeyC("ㅃ"),
                ),
                KeyItemC(
                    center = KeyC("ㅇ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ㅎ"),
                    bottom = KeyC("ㄸ"),
                    top = KeyC("ㅉ")
                ),
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("ㅏ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ㅑ"),
                    top = KeyC("ㅒ"),
                ),
                KeyItemC(
                    center = KeyC("ㅣ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ㅕ"),
                    top = KeyC("ㅖ"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ㅁ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ㅌ"),
                    top = KeyC("ㅋ"),
                ),
                KeyItemC(
                    center = KeyC("ㄹ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ㅊ", color = MUTED),
                    top = KeyC("ㅍ"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("ㅜ", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("ㅠ", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ㅡ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("?", color = MUTED),
                    left = KeyC("!", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    top = KeyC(";", color = MUTED),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM,
                BACKSPACE_TYPESPLIT_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_KR_TYPESPLIT: KeyboardDefinition =
    KeyboardDefinition(
        title = "한국어 type-split",
        modes =
            KeyboardDefinitionModes(
                main = KB_KR_TYPESPLIT_MAIN,
                shifted = KB_KR_TYPESPLIT_MAIN,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
        settings = KeyboardDefinitionSettings(
            textProcessor = KoreanTextProcessor()
        )
    )
