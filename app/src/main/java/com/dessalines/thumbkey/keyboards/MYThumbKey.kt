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
                    center = KeyC("ယ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("ဥ"),
                    left = KeyC("၍"),
                    right = KeyC("ဦ"),
                    bottom = KeyC("ဒ"),
                ),
                KeyItemC(
                    center = KeyC("င", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("၏"),
                    right = KeyC("ဇ"),
                    bottom = KeyC("န"),
                    left = KeyC("ဉ"),
                ),
                KeyItemC(
                    center = KeyC("က", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ြ"),
                    top = KeyC("ဧ"),
                    right = KeyC("ှ"),
                    bottom = KeyC("ွ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("အ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ဓ"),
                    top = KeyC("ဂ"),
                    right = KeyC("ရ"),
                ),
                KeyItemC(
                    center = KeyC("ပ", size = LARGE),
                    topLeft = KeyC("ီ"),
                    top = KeyC("ါ"),
                    topRight = KeyC("်"),
                    right = KeyC("္"),
                    bottomRight = KeyC("ျ"),
                    bottom = KeyC("ြ"),
                    bottomLeft = KeyC("ာ"),
                    left = KeyC("ိ"),
                ),
                KeyItemC(
                    center = KeyC("စ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = ("ဈ"),
                    left = KeyC("လ"),
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
                    center = KeyC("ေ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ဏ"),
                    top = KeyC("ဘ"),
                    right = KeyC("ခ"),
                    bottom = KeyC("ဆ"),
                ),
                KeyItemC(
                    center = KeyC("မ", size = LARGE),
                    left = KeyC("ဗ"),
                    top = KeyC("း"),
                    right = KeyC("ံ"),
                    bottom = KeyC("့"),
                ),
                KeyItemC(
                    center = KeyC("တ", size = LARGE),
                    topLeft = KeyC("ည"),
                    top = KeyC("ဲ"),
                    topRight = KeyC("ဖ"),
                    right = KeyC("သ"),
                    bottomRight = KeyC("ထ"),
                    bottom = KeyC("ဝ"),
                    bottomLeft = KeyC("ူ"),
                    left = KeyC("ု"),
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
                    center = KeyC("ဋ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("င်္"),
                    right = KeyC("ဂ္ဂ"),
                    bottom = KeyC("ဂ္ဃ"),
                ),
                KeyItemC(
                    center = KeyC("ဃ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ဇ္ဇ"),
                    top = KeyC("န္ဒြ"),
                    right = KeyC("ဤ"),
                    bottom = KeyC("၍"),
                ),
                KeyItemC(
                    center = KeyC("ဣ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ြို"),
                    top = KeyC("ြူ"),
                    right = KeyC("ျူ"),
                    bottom = KeyC("ျို"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ဍ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("က္က"),
                    right = KeyC("က္ခ"),
                    bottom = KeyC("၊"),
                ),
                KeyItemC(
                    center = KeyC("ဿ", size = LARGE),
                    topLeft = KeyC("ဥ္စ"),
                    top = KeyC("စ္ဆ"),
                    topRight = KeyC("စ္စ"),
                    right = KeyC("တ္တ"),
                    bottomRight = KeyC("န္တ"),
                    bottom = KeyC("တ္ထ"),
                    bottomLeft = KeyC("မ္ဘ"),
                    left = KeyC("လ္လ"),
                ),
                KeyItemC(
                    center = KeyC("၌", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ို"),
                    right = KeyC("ုံ"),
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
                    center = KeyC("ဠ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("။"),
                    right = KeyC("ဏ္ဌ"),
                    bottom = KeyC("ဏ္ဍ"),
                ),
                KeyItemC(
                    center = KeyC("၄င်း", size = LARGE),
                    topLeft = KeyC("န္ဓ"),
                    top = KeyC("မ္မ"),
                    topRight = KeyC("ပ္ပ"),
                    right = KeyC("န္န"),
                    bottomRight = KeyC("န္ဒ"),
                    bottom = KeyC("မ္ပ"),
                    bottomLeft = KeyC("ဒ္ဒ"),
                ),
                KeyItemC(
                    center = KeyC("ဌ", size = LARGE),
                    topLeft = KeyC("ြာ"),
                    top = KeyC("ျာ"),
                    topRight = KeyC("င်း"),
                    right = KeyC("န်း"),
                    bottomRight = KeyC("မ်း"),
                    bottom = KeyC("ျာ်"),
                    bottomLeft = KeyC("ြာ်"),
                    left = KeyC("ွှာ"),
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
