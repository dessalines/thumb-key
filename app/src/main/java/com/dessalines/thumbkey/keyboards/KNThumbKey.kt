@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_KN_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ಕ", size = LARGE),
                    right = KeyC("ಙ"),
                    bottomRight = KeyC("ಞ"),
                ),
                KeyItemC(
                    center = KeyC("ಲ", size = LARGE),
                    bottom = KeyC("ಣ"),
                ),
                KeyItemC(
                    center = KeyC("ಾ", size = LARGE),
                    bottom = KeyC("ೈ"),
                    bottomLeft = KeyC("ೃ"),
                    left = KeyC("ೌ"),
                    topLeft = KeyC("ಃ"),
                    top = KeyC("ೄ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ತ", size = LARGE),
                    topRight = KeyC("ಶ"),
                    right = KeyC("ಚ"),
                    bottomRight = KeyC("ಜ"),
                ),
                KeyItemC(
                    center = KeyC("ನ", size = LARGE),
                    topLeft = KeyC("ಟ"),
                    top = KeyC("ಹ"),
                    topRight = KeyC("ಬ"),
                    left = KeyC("ಡ"),
                    right = KeyC("ಳ"),
                    bottomLeft = KeyC("ಪ"),
                    bottom = KeyC("ಯ"),
                    bottomRight = KeyC("ಮ"),
                ),
                KeyItemC(
                    center = KeyC("ಿ", size = LARGE),
                    topLeft = KeyC("ೂ"),
                    left = KeyC("ೊ"),
                    bottomLeft = KeyC("ೋ"),
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
                    center = KeyC("ದ", size = LARGE),
                    topRight = KeyC("ವ"),
                    right = KeyC("ಸ"),
                ),
                KeyItemC(
                    center = KeyC("ರ", size = LARGE),
                    top = KeyC("ಗ"),
                ),
                KeyItemC(
                    center = KeyC("್", size = LARGE),
                    top = KeyC("ು"),
                    topLeft = KeyC("ೆ"),
                    left = KeyC("ಂ"),
                    bottomLeft = KeyC("ೇ"),
                    bottom = KeyC("ೀ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_KN_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ಖ", size = LARGE),
                    right = KeyC("ಙ"),
                    bottomRight = KeyC("ಞ"),
                ),
                KeyItemC(
                    center = KeyC("ಲ", size = LARGE),
                    bottom = KeyC("ಣ"),
                ),
                KeyItemC(
                    center = KeyC("ಆ", size = LARGE),
                    bottom = KeyC("ಐ"),
                    bottomLeft = KeyC("ಋ"),
                    left = KeyC("ಔ"),
                    topLeft = KeyC("ಅಃ"),
                    top = KeyC("ೠ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ಥ", size = LARGE),
                    topRight = KeyC("ಷ"),
                    right = KeyC("ಛ"),
                    bottomRight = KeyC("ಝ"),
                ),
                KeyItemC(
                    center = KeyC("ನ", size = LARGE),
                    topLeft = KeyC("ಠ"),
                    top = KeyC("ಹ"),
                    topRight = KeyC("ಭ"),
                    left = KeyC("ಢ"),
                    right = KeyC("ಳ"),
                    bottomLeft = KeyC("ಫ"),
                    bottom = KeyC("ಯ"),
                    bottomRight = KeyC("ಮ"),
                ),
                KeyItemC(
                    center = KeyC("ಇ", size = LARGE),
                    topLeft = KeyC("ಊ"),
                    left = KeyC("ಒ"),
                    bottomLeft = KeyC("ಓ"),
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
                    center = KeyC("ಧ", size = LARGE),
                    topRight = KeyC("ವ"),
                    right = KeyC("ಸ"),
                ),
                KeyItemC(
                    center = KeyC("ರ", size = LARGE),
                    top = KeyC("ಘ"),
                ),
                KeyItemC(
                    center = KeyC("ಅ", size = LARGE),
                    top = KeyC("ಉ"),
                    topLeft = KeyC("ಎ"),
                    left = KeyC("ಅಂ"),
                    bottomLeft = KeyC("ಏ"),
                    bottom = KeyC("ಈ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_KN_NUMERIC_KEYBOARD =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("೧", size = LARGE),
                    bottomLeft = KeyC("$"),
                    bottomRight =
                        getLocalCurrency()?.let {
                            if (it !in setOf("$", "£", "€")) {
                                KeyC(it)
                            } else {
                                null
                            }
                        },
                ),
                KeyItemC(
                    center = KeyC("೨", size = LARGE),
                    topLeft = KeyC("`"),
                    top = KeyC("^"),
                    topRight = KeyC("´"),
                    right = KeyC("!"),
                    bottomRight = KeyC("\\"),
                    bottomLeft = KeyC("/"),
                    left = KeyC("+"),
                ),
                KeyItemC(
                    center = KeyC("೩", size = LARGE),
                    left = KeyC("?"),
                    bottomRight = KeyC("€"),
                    bottomLeft = KeyC("£"),
                    bottom = KeyC("="),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("೪", size = LARGE),
                    topLeft = KeyC("{"),
                    topRight = KeyC("%"),
                    bottomRight = KeyC("_"),
                    bottomLeft = KeyC("["),
                    left = KeyC("("),
                ),
                KeyItemC(
                    center = KeyC("೫", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("೬", size = LARGE),
                    topLeft = KeyC("|"),
                    topRight = KeyC("}"),
                    right = KeyC(")"),
                    bottomRight = KeyC("]"),
                    bottomLeft = KeyC("@"),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("೭", size = LARGE),
                    topLeft = KeyC("~"),
                    bottomRight = KeyC(":"),
                    bottomLeft = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("೮", size = LARGE),
                    topLeft = KeyC("\""),
                    topRight = KeyC("'"),
                    bottomRight = KeyC("-"),
                    bottom = KeyC("."),
                    bottomLeft = KeyC("*"),
                    left = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("೯", size = LARGE),
                    top = KeyC("&"),
                    topRight = KeyC("°"),
                    bottomRight = KeyC(">"),
                    bottomLeft = KeyC(";"),
                    left = KeyC("#"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("೦", size = LARGE),
                    widthMultiplier = 2,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_KN_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "ಕನ್ನಡ thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_KN_THUMBKEY_MAIN,
                shifted = KB_KN_THUMBKEY_SHIFTED,
                numeric = KB_KN_NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
        locales = listOf("kn"),
    )
