package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardTab
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Copyright
import androidx.compose.material.icons.outlined.KeyboardCapslock
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.SwipeNWay

val KB_TR_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ö", size = FontSizeVariant.LARGE),
                    left = KeyC("o"),
                    bottom = KeyC("q"),
                    bottomRight = KeyC("p"),
                    bottomLeft = KeyC("(", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    top = KeyC("\\", color = ColorVariant.MUTED),
                    topRight = KeyC("/", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("g", size = FontSizeVariant.LARGE),
                    bottom = KeyC("ğ"),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("l", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("n"),
                    bottomRight = KeyC(")", color = ColorVariant.MUTED),
                    topLeft = KeyC("=", color = ColorVariant.MUTED),
                    topRight = KeyC("+", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("y", size = FontSizeVariant.LARGE),
                    topRight = KeyC("w"),
                    right = KeyC("v"),
                    bottomRight = KeyC("z"),
                    left = KeyC("@", color = ColorVariant.MUTED),
                    top = KeyC("$", color = ColorVariant.MUTED),
                    bottom = KeyC("&", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("|", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("m", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("f"),
                    left = KeyC("d"),
                    bottomLeft = KeyC("c"),
                    topRight = KeyC("h"),
                    right = KeyC("e"),
                    bottomRight = KeyC("ç"),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("s"),
                    left = KeyC("ş"),
                    bottomLeft = KeyC("t"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = KeyAction.ToggleShiftMode(true),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = KeyAction.CommitText("\t"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    topRight = KeyC("b"),
                    bottom = KeyC(",", color = ColorVariant.MUTED),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottomRight = KeyC("!", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("k", size = FontSizeVariant.LARGE),
                    top = KeyC("j"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("x"),
                    bottomRight = KeyC("-", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC("?", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("ü"),
                    top = KeyC("u"),
                    left = KeyC("ı"),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    bottom = KeyC(":", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TR_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("Ö", size = FontSizeVariant.LARGE),
                    left = KeyC("O"),
                    bottom = KeyC("Q"),
                    bottomRight = KeyC("P"),
                    bottomLeft = KeyC("(", color = ColorVariant.MUTED),
                    topLeft = KeyC("~", color = ColorVariant.MUTED),
                    top = KeyC("\\", color = ColorVariant.MUTED),
                    topRight = KeyC("%", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("G", size = FontSizeVariant.LARGE),
                    bottom = KeyC("Ğ"),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("L", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("N"),
                    bottomRight = KeyC(")", color = ColorVariant.MUTED),
                    topLeft = KeyC("=", color = ColorVariant.MUTED),
                    topRight = KeyC("+", color = ColorVariant.MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Y", size = FontSizeVariant.LARGE),
                    topRight = KeyC("W"),
                    right = KeyC("V"),
                    bottomRight = KeyC("Z"),
                    left = KeyC("#", color = ColorVariant.MUTED),
                    top = KeyC("€", color = ColorVariant.MUTED),
                    bottom = KeyC("&", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("|", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("M", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("F"),
                    left = KeyC("D"),
                    bottomLeft = KeyC("C"),
                    topRight = KeyC("H"),
                    right = KeyC("E"),
                    bottomRight = KeyC("Ç"),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("S"),
                    left = KeyC("Ş"),
                    bottomLeft = KeyC("T"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = KeyAction.ToggleShiftMode(false),
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = KeyAction.ToggleCapsLock,
                            swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = KeyAction.CommitText("\t"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    topRight = KeyC("B"),
                    bottom = KeyC(",", color = ColorVariant.MUTED),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("https://", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottomRight = KeyC("!", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("K", size = FontSizeVariant.LARGE),
                    top = KeyC("J"),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                    right = KeyC("X"),
                    bottomRight = KeyC("_"),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("*", color = ColorVariant.MUTED),
                    left = KeyC("?", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("İ", size = FontSizeVariant.LARGE),
                    topLeft = KeyC("Ü"),
                    top = KeyC("U"),
                    left = KeyC("I"),
                    bottomLeft = KeyC(";", color = ColorVariant.MUTED),
                    bottom = KeyC(":", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                    right = KeyC(".com", color = ColorVariant.MUTED, size = FontSizeVariant.SMALLEST),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_TR_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "türkçe thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_TR_THUMBKEY_MAIN,
                shifted = KB_TR_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
