@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_HU_HUNGRAM_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("á", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("ő"),
                    right = KeyC("`"),
                    bottom = KeyC("ö"),
                ),
                KeyItemC(
                    center = KeyC("z", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("c"),
                    right = KeyC("ó"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("&"),
                    bottom = KeyC("y"),
                    right = KeyC("ú"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ü"),
                    right = KeyC("+"),
                    top = KeyC("%"),
                    left = KeyC("="),
                ),
                KeyItemC(
                    center = KeyC("m", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("!"),
                    top = KeyC("?"),
                    right = KeyC("x"),
                    bottom = KeyC("h"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("b"),
                    top = KeyC("ű"),
                    bottom = KeyC("w"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("í"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("@"),
                    right = KeyC("\\"),
                    bottom = KeyC("#"),
                    left = KeyC("&"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC(";"),
                    top = KeyC(":"),
                    right = KeyC("-"),
                    bottom = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("'"),
                    top = KeyC("\""),
                    right = KeyC("*"),
                    bottom = KeyC("|"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("/"),
                    right = KeyC("^"),
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
                KeyItemC(
                    center = KeyC("l", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("j"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("p", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                ),
                KeyItemC(
                    center = KeyC("é", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("u"),
                ),
                KeyItemC(
                    center = KeyC("d", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("{"),
                    right = KeyC("["),
                    bottom = KeyC("("),
                    left = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("g", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("]"),
                    top = KeyC("}"),
                    right = KeyC(">"),
                    bottom = KeyC(")"),
                ),
                KeyItemC(
                    center = KeyC("f", size = LARGE),
                    left = KeyC("v"),
                    swipeType = FOUR_WAY_CROSS,
                ),
                KeyItemC(
                    center = KeyC("k", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("q"),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_KEY_ITEM,
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(widthMultiplier = 2,
                 top = KeyC(".", color = MUTED),),
                RETURN_KEY_ITEM,
                EMOJI_KEY_ITEM_ALT,
            ),
        ),
    )

val KB_HU_HUNGRAM_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("Á", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Ő"),
                    right = KeyC("`"),
                    bottom = KeyC("Ö"),
                ),
                KeyItemC(
                    center = KeyC("Z", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("C"),
                    right = KeyC("Ó"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("&"),
                    bottom = KeyC("Y"),
                    right = KeyC("Ú"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ü"),
                    right = KeyC("+"),
                    top = KeyC("%"),
                    left = KeyC("="),
                ),
                KeyItemC(
                    center = KeyC("M", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("!"),
                    top = KeyC("?"),
                    right = KeyC("X"),
                    bottom = KeyC("H"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("B"),
                    top = KeyC("Ű"),
                    bottom = KeyC("W"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Í"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("@"),
                    right = KeyC("\\"),
                    bottom = KeyC("#"),
                    left = KeyC("&"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC(";"),
                    top = KeyC(":"),
                    right = KeyC("-"),
                    bottom = KeyC("_"),
                ),
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("'"),
                    top = KeyC("\""),
                    right = KeyC("*"),
                    bottom = KeyC("|"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("/"),
                    right = KeyC("^"),
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
                KeyItemC(
                    center = KeyC("L", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("J"),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("P", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                ),
                KeyItemC(
                    center = KeyC("É", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("U"),
                ),
                KeyItemC(
                    center = KeyC("D", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("{"),
                    right = KeyC("["),
                    bottom = KeyC("("),
                    left = KeyC("<"),
                ),
                KeyItemC(
                    center = KeyC("G", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("]"),
                    top = KeyC("}"),
                    right = KeyC(">"),
                    bottom = KeyC(")"),
                ),
                KeyItemC(
                    center = KeyC("F", size = LARGE),
                    left = KeyC("V"),
                    swipeType = FOUR_WAY_CROSS,
                ),
                KeyItemC(
                    center = KeyC("K", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Q"),
                ),
            ),
            listOf(
                NUMERIC_KEY_ITEM_ALT,
                BACKSPACE_KEY_ITEM,
                SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM.copy(widthMultiplier = 2,
                 top = KeyC(".", color = MUTED),),
                RETURN_KEY_ITEM,
                EMOJI_KEY_ITEM_ALT,
            ),
        ),
    )

val KB_HU_HUNGRAM: KeyboardDefinition =
    KeyboardDefinition(
        title = "hungram",
        modes =
            KeyboardDefinitionModes(
                main = KB_HU_HUNGRAM_MAIN,
                shifted = KB_HU_HUNGRAM_SHIFTED,
                numeric = TYPESPLIT_NUMERIC_KEYBOARD,
            ),
    )
