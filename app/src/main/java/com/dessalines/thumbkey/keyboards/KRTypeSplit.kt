@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardBackspace
import com.dessalines.thumbkey.textprocessors.KoreanTextProcessor
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.SendEvent
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
                    top = KeyC("ㅉ"),
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
                    left = KeyC("ㅊ"),
                    top = KeyC("ㅍ"),
                ),
                SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
                KeyItemC(
                    center = KeyC("ㅜ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ㅠ"),
                    left = KeyC("₩", color = MUTED),
                    top = KeyC("~", color = MUTED),
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
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardBackspace),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DEL,
                                    ),
                                ),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    swipeType = FOUR_WAY_CROSS,
                    slideType = SlideType.DELETE,
                    left = DELETE_WORD_BEFORE_CURSOR_KEYC,
                    right = DELETE_WORD_AFTER_CURSOR_KEYC,
                    widthMultiplier = 3,
                    backgroundColor = SURFACE_VARIANT,
                ),
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
        settings =
            KeyboardDefinitionSettings(
                textProcessor = KoreanTextProcessor(),
            ),
    )
