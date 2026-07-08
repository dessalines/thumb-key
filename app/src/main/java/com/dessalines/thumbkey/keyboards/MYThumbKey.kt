@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_MY_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("အ", size = LARGE),
                    right = KeyC("ဆ"),
                    bottomRight = KeyC("န"),
                ),
                KeyItemC(
                    center = KeyC("ပ", size = LARGE),
                    bottomLeft = KeyC("ဂ"),
                    bottomRight = KeyC("ဒ"),
                ),
                KeyItemC(
                    center = KeyC("င", size = LARGE),
                    left = KeyC("ဇ"),
                    bottomLeft = KeyC("ခ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ေ", size = LARGE),
                    top = KeyC("ံ"),
                    topRight = KeyC("ှ"),
                    bottom = KeyC("့"),
                    right = KeyC("ရ"),
                    bottomRight = KeyC("ွ"),
                ),
                KeyItemC(
                    center = KeyC("း", size = LARGE),
                    topLeft = KeyC("ျ"),
                    top = KeyC("ိ"),
                    topRight = KeyC("ီ"),
                    right = KeyC("ဟ"),
                    bottomRight = KeyC("ူ"),
                    bottom = KeyC("ု"),
                    bottomLeft = KeyC("္"),
                    left = KeyC("ြ"),
                ),
                KeyItemC(
                    center = KeyC("်", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("ာ"),
                    left = KeyC("ါ"),
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
                    center = KeyC("က", size = LARGE),
                    topRight = KeyC("လ"),
                    right = KeyC("သ"),
                    bottomRight = KeyC("ဘ"),
                ),
                KeyItemC(
                    center = KeyC("တ", size = LARGE),
                    left = KeyC("ထ"),
                    top = KeyC("ဲ"),
                    right = KeyC("စ"),
                    bottom = KeyC("ဝ"),
                ),
                KeyItemC(
                    center = KeyC("မ", size = LARGE),
                    top = KeyC("ဥ"),
                    right = KeyC("ည"),
                    bottomRight = KeyC("။"),
                    bottom = KeyC("ယ"),
                    bottomLeft = KeyC("၊"),
                    left = KeyC("ဖ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_MY_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ဎ", size = LARGE),
                    right = KeyC("န္ဓ"),
                    bottomRight = KeyC("န္တ"),
                ),
                KeyItemC(
                    center = KeyC("ဃ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("က္ဂ"),
                    right = KeyC("က္ခ"),
                    bottom = KeyC("က္က"),
                ),
                KeyItemC(
                    center = KeyC("ဤ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ဣ"),
                    right = KeyC("ဿ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ဈ", size = LARGE),
                    topRight = KeyC("ဪ"),
                    right = KeyC("ဩ"),
                ),
                KeyItemC(
                    center = KeyC("ဓ", size = LARGE),
                    top = KeyC("ဍ"),
                    right = KeyC("ဋ"),
                    bottom = KeyC("ဌ"),
                    left = KeyC("ဒ္ဒ"),
                ),
                KeyItemC(
                    center = KeyC("၏", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ဧ"),
                    right = KeyC("၌"),
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
                    center = KeyC("ဏ", size = LARGE),
                    top = KeyC("ဠ"),
                    topRight = KeyC("ဏ္ဍ"),
                    right = KeyC("ဏ္ထ"),
                    bottom = KeyC("ဉ"),
                ),
                KeyItemC(
                    center = KeyC("ဗ", size = LARGE),
                    top = KeyC("င်္"),
                    right = KeyC("ပ္ပ"),
                ),
                KeyItemC(
                    center = KeyC("၍", size = LARGE),
                    top = KeyC("ဦ"),
                    right = KeyC("၎င်း"),
                    bottom = KeyC("ဦး"),
                    left = KeyC("တ္ထ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_MY_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "myanmar thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_MY_THUMBKEY_MAIN,
                shifted = KB_MY_THUMBKEY_SHIFTED,
                numeric = MYANMAR_NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
