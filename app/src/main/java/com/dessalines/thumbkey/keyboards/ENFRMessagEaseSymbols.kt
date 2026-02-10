@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

// Layout for English and French
// ┌───────┬───────┬───────┐
// │   Â   │       │   Î   │
// │   A   │   N  !│?  I   │
// │   À  V│   L   │X  Ï   │
// ├───────┼───────┼───────┤
// │   Û  Ç│Q  H  P│   ▢   │
// │(  U  K│C  O  B│M  R  )│
// │   '  Ù│G  D  J│   ▢   │
// ├───────┼───────┼───────┤
// │   Ô  Y│È  W  É│F      │
// │   T  -│Ê  E  Z│Ë  S   │
// │       │,  .  :│;      │
// └───────┴───────┴───────┘
// ┌───────┬───────┬───────┐
// │       │`  ^  ´│²  ≈  ³│
// │≤  1   │+  2  !│?  3  ≥│
// │   $  €│/  *  \│   =   │
// ├───────┼───────┼───────┤
// │{     ✓│↔  ↑  ↕│   ½  }│
// │(  4   │←  5  →│¼  6  )│
// │[  '  ✗│   ↓  _│@  ¾  ]│
// ├───────┼───────┼───────┤
// │~  "  °│·  •  –│—  &  |│
// │<  7  -│   8  %│#  9  >│
// │«     ↹│,  .  :│;     »│
// └───────┴───────┴───────┘
// For support about this particular layout, open an issue and tag @Zwyx

val KB_EN_FR_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    top = KeyC("â"),
                    bottomRight = KeyC("v"),
                    bottom = KeyC("à"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("!", color = MUTED),
                    bottom = KeyC("l"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("î"),
                    bottom = KeyC("ï"),
                    bottomLeft = KeyC("x"),
                    left = KeyC("?", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("u", size = LARGE),
                    top = KeyC("û"),
                    topRight = KeyC("ç"),
                    right = KeyC("k"),
                    bottomRight = KeyC("ù"),
                    bottom = KeyC("'", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("h"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("d"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("c"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC(")", color = MUTED),
                    left = KeyC("m"),
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
                    center = KeyC("t", size = LARGE),
                    top = KeyC("ô"),
                    topRight = KeyC("y"),
                    right = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("è"),
                    top = KeyC("w"),
                    topRight = KeyC("é"),
                    right = KeyC("z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("ê"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("f"),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("ë"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    top = KeyC("Â"),
                    bottomRight = KeyC("V"),
                    bottom = KeyC("À"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("!", color = MUTED),
                    bottom = KeyC("L"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("Î"),
                    bottom = KeyC("Ï"),
                    bottomLeft = KeyC("X"),
                    left = KeyC("?", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("U", size = LARGE),
                    top = KeyC("Û"),
                    topRight = KeyC("Ç"),
                    right = KeyC("K"),
                    bottomRight = KeyC("Ù"),
                    bottom = KeyC("'", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("H"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("D"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right = KeyC(")", color = MUTED),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    left = KeyC("M"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    top = KeyC("Ô"),
                    topRight = KeyC("Y"),
                    right = KeyC("-", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("È"),
                    top = KeyC("W"),
                    topRight = KeyC("É"),
                    right = KeyC("Z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    left = KeyC("Ê"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("F"),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("Ë"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    bottomRight = KeyC("€"),
                    bottom = KeyC("$"),
                    left = KeyC("≤"),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    topLeft = KeyC("`"),
                    top = KeyC("^"),
                    topRight = KeyC("´"),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\"),
                    bottom = KeyC("*"),
                    bottomLeft = KeyC("/"),
                    left = KeyC("+"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    topLeft = KeyC("²"),
                    top = KeyC("≈"),
                    topRight = KeyC("³"),
                    right = KeyC("≥"),
                    bottom = KeyC("="),
                    left = KeyC("?", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    topLeft = KeyC("{"),
                    topRight = KeyC("✓"),
                    bottomRight = KeyC("✗"),
                    bottom = KeyC("'", color = MUTED),
                    bottomLeft = KeyC("["),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    topLeft = KeyC("↔"),
                    top = KeyC("↑"),
                    topRight = KeyC("↕"),
                    right = KeyC("→"),
                    bottomRight = KeyC("_"),
                    bottom = KeyC("↓"),
                    left = KeyC("←"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    top = KeyC("½"),
                    topRight = KeyC("}"),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]"),
                    bottom = KeyC("¾"),
                    bottomLeft = KeyC("@"),
                    left = KeyC("¼"),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    topLeft = KeyC("~"),
                    top = KeyC("\""),
                    topRight = KeyC("°"),
                    right = KeyC("-", color = MUTED),
                    bottomRight = KeyC("\t"),
                    bottomLeft = KeyC("«"),
                    left = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    topLeft = KeyC("·"),
                    top = KeyC("•"),
                    topRight = KeyC("–"),
                    right = KeyC("%"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    topLeft = KeyC("—"),
                    top = KeyC("&"),
                    topRight = KeyC("|"),
                    right = KeyC(">"),
                    bottomRight = KeyC("»"),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("#"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    widthMultiplier = 2,
                ),
                SPACEBAR_SKINNY_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_FR_MESSAGEASE_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "english français messagease symbols",
        locales = listOf("en", "fr"),
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_FR_MAIN,
                shifted = KB_EN_FR_SHIFTED,
                numeric = KB_EN_FR_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
