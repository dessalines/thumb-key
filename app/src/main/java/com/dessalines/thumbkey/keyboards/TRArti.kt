@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val RETURN_KEY_ARTI =
    RETURN_KEY_ITEM.copy(
        swipeType = FOUR_WAY_CROSS,
        left =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardBackspace),
                action =
                    SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DEL,
                        ),
                    ),
            ),
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                action = CommitText("\t"),
            ),
    )

val SPACEBAR_ALL_SYMBOLS_ARTI =
    SPACEBAR_ALL_SYMBOLS.copy(
        swipeType = EIGHT_WAY,
        topLeft =
            KeyC("“", color = MUTED),
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                action = ToggleShiftMode(true),
                size = LARGE,
                color = PRIMARY,
            ),
        topRight = KeyC("”", color = MUTED),
        right = KeyC("—", color = MUTED),
        bottomRight = KeyC("’", color = MUTED),
        bottom =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                action = ToggleShiftMode(false),
                size = LARGE,
                color = PRIMARY,
            ),
        bottomLeft = KeyC("‘", color = MUTED),
        left = KeyC("–", color = MUTED),
    )

val SPACEBAR_ALL_DIRECTIONS_ARTI =
    SPACEBAR_ALL_DIRECTIONS.copy(
        swipeType = EIGHT_WAY,
        topRight = KeyC(" ", color = MUTED, display = KeyDisplay.TextDisplay("␣")),
    )

val KB_TR_ARTI_MAIN =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("*", color = MUTED),
                    topRight = KeyC("~", color = MUTED),
                    right = KeyC("≤", color = MUTED),
                    bottomRight = KeyC("w"),
                    bottom = KeyC("ş"),
                    bottomLeft = KeyC("&", color = MUTED),
                    left = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("r", size = LARGE),
                    topLeft = KeyC("\\", color = MUTED),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("/", color = MUTED),
                    right = KeyC("-", color = MUTED),
                    bottomRight = KeyC("ğ"),
                    bottom = KeyC("g"),
                    bottomLeft = KeyC("_", color = MUTED),
                    left = KeyC("≥", color = MUTED),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("=", color = MUTED),
                    top = KeyC("×", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                    right = KeyC("÷", color = MUTED),
                    bottomRight = KeyC("≈", color = MUTED),
                    bottom = KeyC("ö"),
                    bottomLeft = KeyC("u"),
                    left = KeyC("ü"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ALL_DIRECTIONS_ARTI,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("n", size = LARGE),
                    topLeft = KeyC("{", color = MUTED),
                    top = KeyC("$", color = MUTED),
                    topRight = KeyC("₺", color = MUTED),
                    right = KeyC("m"),
                    bottomRight = KeyC("#", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("h", size = LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("q"),
                    topRight = KeyC("b"),
                    right = KeyC("p"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("k"),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("a", size = LARGE),
                    topLeft = KeyC("â"),
                    top = KeyC(",", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
                    left = KeyC("l"),
                ),
                SPACEBAR_ALL_SYMBOLS_ARTI,
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("t", size = LARGE),
                    topLeft = KeyC("\"", color = MUTED),
                    top = KeyC("ç"),
                    topRight = KeyC("c"),
                    bottomRight = KeyC("‹", color = MUTED),
                    bottom = KeyC("«", color = MUTED),
                    bottomLeft = KeyC("←", color = MUTED),
                    left = KeyC("<", color = MUTED),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("i", size = LARGE),
                    topLeft = KeyC("ı"),
                    top = KeyC("f"),
                    topRight = KeyC("°", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC("!", color = MUTED),
                    bottom = KeyC("‽", color = MUTED),
                    bottomLeft = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    swipeType = EIGHT_WAY,
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("d"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    bottomRight = KeyC("→", color = MUTED),
                    bottom = KeyC("»", color = MUTED),
                    bottomLeft = KeyC("›", color = MUTED),
                    left = KeyC("@", color = MUTED),
                ),
                RETURN_KEY_ARTI,
            ),
        ),
    )

val KB_TR_ARTI_SHIFTED =
    KB_TR_ARTI_MAIN.copy().alterKeys(
        Triple(0, 1) { key ->
            key.copy(
                center = KeyC("S", size = LARGE),
                bottomRight = KeyC("W"),
                bottom = KeyC("Ş"),
            )
        },
        Triple(0, 2) { key ->
            key.copy(
                center = KeyC("R", size = LARGE),
                bottomRight = KeyC("Ğ"),
                bottom = KeyC("G"),
            )
        },
        Triple(0, 3) { key ->
            key.copy(
                center = KeyC("O", size = LARGE),
                bottom = KeyC("Ö"),
                bottomLeft = KeyC("U"),
                left = KeyC("Ü"),
            )
        },
        Triple(1, 1) { key ->
            key.copy(
                center = KeyC("N", size = LARGE),
                top = KeyC("€", color = MUTED),
                topRight = KeyC("₸", color = MUTED),
                right = KeyC("M"),
            )
        },
        Triple(1, 2) { key ->
            key.copy(
                center = KeyC("H", size = LARGE),
                topLeft = KeyC("J"),
                top = KeyC("Q"),
                topRight = KeyC("B"),
                right = KeyC("P"),
                bottomRight = KeyC("Y"),
                bottom = KeyC("X"),
                bottomLeft = KeyC("V"),
                left = KeyC("K"),
            )
        },
        Triple(1, 3) { key ->
            key.copy(
                center = KeyC("A", size = LARGE),
                topLeft = KeyC("Â"),
                top = KeyC(";", color = MUTED),
                bottom = KeyC(":", color = MUTED),
                left = KeyC("L"),
            )
        },
        Triple(2, 1) { key ->
            key.copy(
                center = KeyC("T", size = LARGE),
                top = KeyC("Ç"),
                topRight = KeyC("C"),
            )
        },
        Triple(2, 2) { key ->
            key.copy(
                center = KeyC("I", size = LARGE),
                topLeft = KeyC("İ"),
                top = KeyC("F"),
                right = KeyC("Z"),
            )
        },
        Triple(2, 3) { key ->
            key.copy(
                center = KeyC("E", size = LARGE),
                topLeft = KeyC("D"),
            )
        },
    )

val KB_TR_ARTI_NUMERIC =
    KB_TR_ARTI_MAIN.copy().alterKeys(
        Triple(0, 0) { key ->
            KeyItemC(
                center = KeyC("0", size = LARGE),
            )
        },
        Triple(0, 1) { key ->
            key.copy(
                center = KeyC("1", size = LARGE),
                bottomRight = KeyC("₸", color = MUTED),
                bottom = KeyC("€", color = MUTED),
            )
        },
        Triple(0, 2) { key ->
            key.copy(
                center = KeyC("2", size = LARGE),
                bottomRight = null,
                bottom = null,
            )
        },
        Triple(0, 3) { key ->
            key.copy(
                center = KeyC("3", size = LARGE),
                bottom = null,
                bottomLeft = null,
                left = null,
            )
        },
        Triple(0, 4) { key ->
            ABC_KEY_ITEM
        },
        Triple(1, 1) { key ->
            key.copy(
                center = KeyC("4", size = LARGE),
                right = null,
            )
        },
        Triple(1, 2) { key ->
            key.copy(
                center = KeyC("5", size = LARGE),
                topLeft = null,
                top = KeyC(";", color = MUTED),
                topRight = null,
                right = null,
                bottomRight = null,
                bottom = KeyC(":", color = MUTED),
                bottomLeft = null,
                left = null,
            )
        },
        Triple(1, 3) { key ->
            key.copy(
                center = KeyC("6", size = LARGE),
                topLeft = null,
                left = null,
            )
        },
        Triple(2, 1) { key ->
            key.copy(
                center = KeyC("7", size = LARGE),
                top = null,
                topRight = null,
            )
        },
        Triple(2, 2) { key ->
            key.copy(
                center = KeyC("8", size = LARGE),
                topLeft = null,
                top = null,
                right = null,
            )
        },
        Triple(2, 3) { key ->
            key.copy(
                center = KeyC("9", size = LARGE),
                topLeft = null,
            )
        },
    )

val KB_TR_ARTI: KeyboardDefinition =
    KeyboardDefinition(
        title = "türkçe artı çok",
        locales = listOf("tr"),
        modes =
            KeyboardDefinitionModes(
                main = KB_TR_ARTI_MAIN,
                shifted = KB_TR_ARTI_SHIFTED,
                numeric = KB_TR_ARTI_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
