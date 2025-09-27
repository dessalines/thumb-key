@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.textprocessors.KoreanTextProcessor
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_KR_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ㅣ", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("ㅎ"),
                ),
                KeyItemC(
                    center = KeyC("ㅅ", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("ㅈ"),
                ),
                KeyItemC(
                    center = KeyC("ㄱ", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("ㄷ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ㅓ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ㅔ"),
                    top = KeyC("₩", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ㅇ", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    topLeft = KeyC("ㅋ"),
                    topRight = KeyC("ㅌ"),
                    bottomRight = KeyC("ㅍ"),
                    bottomLeft = KeyC("ㅊ"),
                ),
                KeyItemC(
                    center = KeyC("ㅏ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ㅐ"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ㄴ", size = LARGE),
                    topRight = KeyC("ㄹ"),
                    bottom = KeyC(",", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ㅗ", size = LARGE),
                    top = KeyC("ㅁ"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("ㅂ"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ㅡ", size = LARGE),
                    right = KeyC("~", color = MUTED),
                    topLeft = KeyC("ㅜ"),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_KR_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ㅣ", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("ㅎ"),
                ),
                KeyItemC(
                    center = KeyC("ㅆ", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("ㅉ"),
                ),
                KeyItemC(
                    center = KeyC("ㄲ", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("ㄸ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ㅕ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ㅖ"),
                    top = KeyC("₩", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ㅇ", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    topLeft = KeyC("ㅋ"),
                    topRight = KeyC("ㅌ"),
                    bottomRight = KeyC("ㅍ"),
                    bottomLeft = KeyC("ㅊ"),
                ),
                KeyItemC(
                    center = KeyC("ㅑ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ㅒ"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ㄴ", size = LARGE),
                    topRight = KeyC("ㄹ"),
                    bottom = KeyC(",", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ㅛ", size = LARGE),
                    top = KeyC("ㅁ"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("ㅃ"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ㅡ", size = LARGE),
                    right = KeyC("~", color = MUTED),
                    topLeft = KeyC("ㅠ"),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_KR_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "한국어 thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_KR_THUMBKEY_MAIN,
                shifted = KB_KR_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                textProcessor = KoreanTextProcessor(),
            ),
    )
