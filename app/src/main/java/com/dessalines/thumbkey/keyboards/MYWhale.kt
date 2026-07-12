@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*

val KB_MY_WHALE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("တ", size = LARGE),
                    bottom = KeyC("ထ"),
                ),
                KeyItemC(
                    center = KeyC("အ", size = LARGE),
                    bottom = KeyC("ဒ"),
                ),
                KeyItemC(
                    center = KeyC("န", size = LARGE),
                    bottom = KeyC("ဓ"),
                ),
                KeyItemC(
                    center = KeyC("စ", size = LARGE),
                    bottom = KeyC("ဆ"),
                ),
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("င", size = LARGE),
                    right =
                        TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ေ", size = LARGE),
                    bottom = KeyC("ှ"),
                ),
                KeyItemC(
                    center = KeyC("ိ", size = LARGE),
                    bottom = KeyC("ု"),
                ),
                KeyItemC(
                    center = KeyC("း", size = LARGE),
                    bottom = KeyC("ူ"),
                    top = KeyC("ီ"),
                    left = KeyC("ါ"),
                    right = KeyC("ာ"),
                ),
                KeyItemC(
                    center = KeyC("ပ", size = LARGE),
                    bottom = KeyC("ဟ"),
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("်", size = LARGE),
                    right =
                        TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ရ", size = LARGE),
                    bottom = KeyC("ဌ"),
                ),
                KeyItemC(
                    center = KeyC("ံ", size = LARGE),
                    bottom = KeyC("့"),
                ),
                KeyItemC(
                    center = KeyC(".", size = LARGE),
                    right = KeyC(",", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom =
                        RETURN_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    bottomLeft = KeyC("*", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC("မ", size = LARGE),
                    bottom = KeyC("ဗ"),
                ),
                KeyItemC(
                    center = KeyC("က", size = LARGE),
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
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ဖ", size = LARGE),
                    bottom = KeyC("ဈ"),
                ),
                KeyItemC(
                    center = KeyC("ဲ", size = LARGE),
                    bottom = KeyC("ွ"),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("ြ", size = LARGE),
                    bottom = KeyC("ျ"),
                ),
                KeyItemC(
                    center = KeyC("ခ", size = LARGE),
                    bottom = KeyC("ဂ"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("လ", size = LARGE),
                    bottom = KeyC("ဇ"),
                ),
                KeyItemC(
                    center = KeyC("သ", size = LARGE),
                    bottom = KeyC("ဝ"),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("ည", size = LARGE),
                    bottom = KeyC("ဘ"),
                ),
                KeyItemC(
                    center = KeyC("ယ", size = LARGE),
                    bottom = KeyC("ဥ"),
                ),
            ),
        ),
    )

val KB_MY_WHALE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ဩ", size = LARGE),
                    bottom = KeyC("ဪ"),
                ),
                KeyItemC(
                    center = KeyC("ဣ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("ဃ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("ဠ", size = LARGE),
                ),
                EMOJI_KEY_ITEM.copy(
                    center = KeyC("၎င်း", size = LARGE),
                    right =
                        TOGGLE_EMOJI_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ဎ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("က္က", size = LARGE),
                    bottom = KeyC("က္ခ"),
                ),
                KeyItemC(
                    center = KeyC("ဿ", size = LARGE),
                    bottom = KeyC("ပိဿာ"),
                    top = KeyC("ပြဿ"),
                ),
                KeyItemC(
                    center = KeyC("၌", size = LARGE),
                ),
                NUMERIC_KEY_ITEM.copy(
                    center = KeyC("ဤ", size = LARGE),
                    right =
                        TOGGLE_NUMERIC_MODE_TRUE_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("င်္", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("န္တ", size = LARGE),
                    bottom = KeyC("န္ဓ"),
                ),
                KeyItemC(
                    center = KeyC(".", size = LARGE),
                    right = KeyC(",", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom =
                        RETURN_KEYC.copy(
                            size = SMALL,
                            color = MUTED,
                        ),
                    bottomLeft = KeyC("*", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center = KeyC("၍", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("္", size = LARGE),
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
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ဍ", size = LARGE),
                    bottom = KeyC("ဏ္ဍ"),
                ),
                KeyItemC(
                    center = KeyC("ဋ", size = LARGE),
                ),
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("။", size = LARGE),
                    bottom = KeyC("၊"),
                ),
                KeyItemC(
                    center = KeyC("ဏ", size = LARGE),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ဉ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("ဦ", size = LARGE),
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                KeyItemC(
                    center = KeyC("ဧ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("၏", size = LARGE),
                ),
            ),
        ),
    )

val KB_MY_WHALE: KeyboardDefinition =
    KeyboardDefinition(
        title = "myanmar whale",
        modes =
            KeyboardDefinitionModes(
                main = KB_MY_WHALE_MAIN,
                shifted = KB_MY_WHALE_SHIFTED,
                numeric = MYANMAR_NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
