@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_HI_THUMBKEY_EXTENDED_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ट", size = LARGE),
                    topLeft = KeyC("ऽ"),
                    top = KeyC("ॉ"),
                    topRight = KeyC("ॅ"),
                    right = KeyC("ण"),
                    bottomRight = KeyC("ढ"),
                    bottom = KeyC("ठ"),
                    bottomLeft = KeyC("ड"),
                    left = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("च", size = LARGE),
                    topLeft = KeyC("₹"),
                    top = KeyC("?"),
                    topRight = KeyC("!"),
                    right = KeyC("ञ"),
                    bottomRight = KeyC("झ"),
                    bottom = KeyC("छ"),
                    bottomLeft = KeyC("ज"),
                    left = KeyC("ज्ञ"),
                ),
                KeyItemC(
                    center = KeyC("अ", size = LARGE),
                    topLeft = KeyC("ऐ"),
                    top = KeyC("ऋ"),
                    topRight = KeyC("ऊ"),
                    right = KeyC("उ"),
                    bottomRight = KeyC("ई"),
                    bottom = KeyC("इ"),
                    bottomLeft = KeyC("आ"),
                    left = KeyC("ए"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("त", size = LARGE),
                    topLeft = KeyC("़"),
                    top = KeyC("द"),
                    topRight = KeyC("द्य"),
                    right = KeyC("न"),
                    bottomRight = KeyC("ध"),
                    bottom = KeyC("थ"),
                    bottomLeft = KeyC("ॐ"),
                    left = KeyC("त्र"),
                ),
                KeyItemC(
                    center = KeyC("क", size = LARGE),
                    topLeft = KeyC("ॄ"),
                    top = KeyC("ः"),
                    topRight = KeyC("ं"),
                    right = KeyC("ङ"),
                    bottomRight = KeyC("घ"),
                    bottom = KeyC("ख"),
                    bottomLeft = KeyC("ग"),
                    left = KeyC("ड़"),
                ),
                KeyItemC(
                  center = KeyC("्", size = LARGE),
                    topLeft = KeyC("ृ"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topRight = KeyC("ि"),
                    right = KeyC("ू"),
                    bottomRight = KeyC("ी"),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomLeft = KeyC("ा"),
                    left = KeyC("ु"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("प", size = LARGE),
                    topLeft = KeyC("ळ"),
                    top = KeyC("ऒ"),
                    topRight = KeyC("ब"),
                    right = KeyC("म"),
                    bottomRight = KeyC("भ"),
                    bottom = KeyC("फ"),
                    bottomLeft = KeyC(":"),
                    left = KeyC("श्र"),
                ),
                KeyItemC(
                    center = KeyC("य", size = LARGE),
                    topLeft = KeyC("श"),
                    top = KeyC("स"),
                    topRight = KeyC("ष"),
                    right = KeyC("ह"),
                    bottomRight = KeyC("व"),
                    bottom = KeyC("र"),
                    bottomLeft = KeyC("ल"),
                    left = KeyC("क्ष"),
                ),
                KeyItemC(
                    center = KeyC("े", size = LARGE),
                    topLeft = KeyC("ौ"),
                    top = KeyC("ै"),
                    topRight = KeyC("औ"),
                    right = KeyC("ओ"),
                    bottomRight = KeyC("'ँ"),
                    bottom = KeyC("|"),
                    bottomLeft = KeyC("-"),
                    left = KeyC("ो"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_HI_THUMBKEY_EXTENDED_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("१", size = LARGE),
                    bottom = KeyC(";")
                ),
                KeyItemC(
                    center = KeyC("२", size = LARGE),
                    bottom = KeyC("_")
                ),
                KeyItemC(
                    center = KeyC("३", size = LARGE),
                    bottom = KeyC("@")
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("४", size = LARGE),
                    bottom = KeyC("<")
                ),
                KeyItemC(
                    center = KeyC("५", size = LARGE),
                    bottom = KeyC(">")
                ),
                KeyItemC(
                    center = KeyC("६", size = LARGE),
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
                    center = KeyC("७", size = LARGE),
                    bottom = KeyC("ॽ")
                ),
                KeyItemC(
                    center = KeyC("८", size = LARGE),
                    bottomRight = KeyC("(", color = MUTED),
                    bottom = KeyC("०", color = MUTED),
                    bottomLeft = KeyC(")", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("९", size = LARGE),
                   bottom = KeyC("'")
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_HI_THUMBKEY_EXTENDED: KeyboardDefinition =
    KeyboardDefinition(
        title = "हिन्दी thumb-key extended",
        modes =
            KeyboardDefinitionModes(
                main = KB_HI_THUMBKEY_EXTENDED_MAIN,
                shifted = KB_HI_THUMBKEY_EXTENDED_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )