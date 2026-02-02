@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_HI_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("स", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("प"),
                    bottom = KeyC("क्ष"),
                ),
                KeyItemC(
                    center = KeyC("न", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("ब"),
                ),
                KeyItemC(
                    center = KeyC("्", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("ा"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ह", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("म"),
                    bottom = KeyC("ज्ञ"),
                ),
                KeyItemC(
                    center = KeyC("र", size = LARGE),
                    topLeft = KeyC("ड"),
                    top = KeyC("च"),
                    topRight = KeyC("द"),
                    right = KeyC("क"),
                    bottomRight = KeyC("व"),
                    bottom = KeyC("ट"),
                    bottomLeft = KeyC("ल"),
                    left = KeyC("त"),
                ),
                KeyItemC(
                    center = KeyC("ि", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ी"),
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
                    center = KeyC("ग", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    top = KeyC("अं"),
                    topRight = KeyC("ज"),
                ),
                KeyItemC(
                    center = KeyC("े", size = LARGE),
                    top = KeyC("ै"),
                    topLeft = KeyC("ड़"),
                    topRight = KeyC("ौ", color = MUTED),
                    right = KeyC("ो"),
                    left = KeyC("ऋ"),
                    bottomRight = KeyC("ं", color = MUTED),
                    bottom = KeyC("।", color = MUTED),
                    bottomLeft = KeyC("़", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ु", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("ू"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_HI_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ष", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("फ"),
                    bottom = KeyC("श्र"),
                ),
                KeyItemC(
                    center = KeyC("ङ", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("भ"),
                ),
                KeyItemC(
                    center = KeyC("आ", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("अ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("श", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("ण"),
                    bottom = KeyC("त्र"),
                ),
                KeyItemC(
                    center = KeyC("ृ", size = LARGE),
                    topLeft = KeyC("ढ"),
                    top = KeyC("छ"),
                    topRight = KeyC("ध"),
                    right = KeyC("ख"),
                    bottomRight = KeyC("ञ"),
                    bottom = KeyC("ठ"),
                    bottomLeft = KeyC("य"),
                    left = KeyC("थ"),
                ),
                KeyItemC(
                    center = KeyC("इ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ई"),
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
                    center = KeyC("घ", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    top = KeyC("ॐ"),
                    topRight = KeyC("झ"),
                ),
                KeyItemC(
                    topLeft = KeyC("ऽ"),
                    center = KeyC("ए", size = LARGE),
                    top = KeyC("ऐ"),
                    topRight = KeyC("औ", color = MUTED),
                    right = KeyC("ओ"),
                    left = KeyC("ँ"),
                    bottomRight = KeyC("ः", color = MUTED),
                    bottom = KeyC("|", color = MUTED),
                    bottomLeft = KeyC("ॅ", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("उ", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("ऊ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_HI_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "हिन्दी thumb-key",
        locales = listOf("hi"),
        modes =
            KeyboardDefinitionModes(
                main = KB_HI_THUMBKEY_MAIN,
                shifted = KB_HI_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
