package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.ArrowForward
import androidx.compose.material.icons.automirrored.outlined.KeyboardReturn
import androidx.compose.material.icons.automirrored.outlined.KeyboardTab
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ArrowDownward
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.ArrowUpward
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
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.SlideType
import com.dessalines.thumbkey.utils.SwipeNWay
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe
import com.dessalines.thumbkey.utils.getLocalCurrency

val EN_TYPESPLIT_SHORT_SPACEBAR_SHIFT_KEY_ITEM =
    KeyItemC(
        center = KeyC(KeyAction.CommitText(" ")),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
            KeyC(
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_LEFT,
                        ),
                    ),
                display = null,
            ),
        right =
            KeyC(
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_RIGHT,
                        ),
                    ),
                display = null,
            ),
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                action = KeyAction.ToggleShiftMode(true),
                swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(true),
                color = ColorVariant.MUTED,
            ),
        bottom =
            KeyC(
                KeyAction.ToggleShiftMode(false),
                swipeReturnAction = KeyAction.ToggleCurrentWordCapitalization(false),
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val EN_TYPESPLIT_SHORT_RETURN_KEY_ITEM =
    KeyItemC(
        center =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                action = KeyAction.IMECompleteAction,
                size = FontSizeVariant.LARGE,
                color = ColorVariant.SECONDARY,
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        longPress = KeyAction.CommitText("\n"),
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                action = KeyAction.CommitText("\t"),
                color = ColorVariant.MUTED,
            ),
    )

val EN_TYPESPLIT_SHORT_SPACEBAR_SHIFT_KEY_SHIFTED_ITEM =
    KeyItemC(
        center = KeyC(KeyAction.CommitText(" ")),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
            KeyC(
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_LEFT,
                        ),
                    ),
                display = null,
            ),
        right =
            KeyC(
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_RIGHT,
                        ),
                    ),
                display = null,
            ),
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
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val EN_TYPESPLIT_SHORT_SPACEBAR_ARROWS_KEY_ITEM =
    KeyItemC(
        center = KeyC(KeyAction.CommitText(" ")),
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        slideType = SlideType.MOVE_CURSOR,
        left =
            KeyC(
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_LEFT,
                        ),
                    ),
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.ArrowBack),
                color = ColorVariant.MUTED,
            ),
        right =
            KeyC(
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_RIGHT,
                        ),
                    ),
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.ArrowForward),
                color = ColorVariant.MUTED,
            ),
        top =
            KeyC(
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_UP,
                        ),
                    ),
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowUpward),
                color = ColorVariant.MUTED,
            ),
        bottom =
            KeyC(
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DPAD_DOWN,
                        ),
                    ),
                display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDownward),
                color = ColorVariant.MUTED,
            ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        widthMultiplier = 3,
    )

val KB_EN_TYPESPLIT_SHORT_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC( // A
                    center =
                        KeyC(
                            KeyAction.CommitText("a"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("x")),
                    left =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom = KeyC(KeyAction.CommitText("z")),
                    top =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                ), // done
                KeyItemC( // E
                    center =
                        KeyC(
                            KeyAction.CommitText("e"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC(KeyAction.CommitText("g")),
                    bottom = KeyC(KeyAction.CommitText("u")),
                    top = KeyC(KeyAction.CommitText("y")),
                ), // done
                EMOJI_KEY_ITEM,
                KeyItemC( // T
                    center =
                        KeyC(
                            KeyAction.CommitText("t"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("d")),
                    left =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    bottom = KeyC(KeyAction.CommitText("r")),
                    top = KeyC(KeyAction.CommitText("l")),
                ), // done
                KeyItemC( // S
                    center =
                        KeyC(
                            KeyAction.CommitText("s"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC(KeyAction.CommitText("b")),
                    bottom = KeyC(KeyAction.CommitText("c")),
                    top =
                        KeyC(
                            KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                ), // done
            ),
            listOf(
                KeyItemC( // i
                    center =
                        KeyC(
                            KeyAction.CommitText("i"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    top = KeyC(KeyAction.CommitText("q")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("9"),
                            color = ColorVariant.MUTED,
                        ),
                ), // done
                KeyItemC( // o
                    center =
                        KeyC(
                            KeyAction.CommitText("o"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC(KeyAction.CommitText("j")),
                    bottom = KeyC(KeyAction.CommitText("k")),
                    top = KeyC(KeyAction.CommitText("p")),
                ), // done
                NUMERIC_KEY_ITEM,
                KeyItemC( // n
                    center =
                        KeyC(
                            KeyAction.CommitText("n"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("f")),
                    left =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom = KeyC(KeyAction.CommitText("w")),
                    top = KeyC(KeyAction.CommitText("m")),
                ), // done
                KeyItemC( // h
                    center =
                        KeyC(
                            KeyAction.CommitText("h"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    top = KeyC(KeyAction.CommitText("v")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("0"),
                            color = ColorVariant.MUTED,
                        ),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                EN_TYPESPLIT_SHORT_SPACEBAR_SHIFT_KEY_ITEM,
                EN_TYPESPLIT_SHORT_RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_TYPESPLIT_SHORT_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC( // A
                    center =
                        KeyC(
                            KeyAction.CommitText("A"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("X")),
                    left =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom = KeyC(KeyAction.CommitText("Z")),
                    top =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                ), // done
                KeyItemC( // E
                    center =
                        KeyC(
                            KeyAction.CommitText("E"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC(KeyAction.CommitText("G")),
                    bottom = KeyC(KeyAction.CommitText("U")),
                    top = KeyC(KeyAction.CommitText("Y")),
                ), // done
                EMOJI_KEY_ITEM,
                KeyItemC( // T
                    center =
                        KeyC(
                            KeyAction.CommitText("T"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("D")),
                    left =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    bottom = KeyC(KeyAction.CommitText("R")),
                    top = KeyC(KeyAction.CommitText("L")),
                ), // done
                KeyItemC( // S
                    center =
                        KeyC(
                            KeyAction.CommitText("S"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC(KeyAction.CommitText("B")),
                    bottom = KeyC(KeyAction.CommitText("C")),
                    top =
                        KeyC(
                            KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                ), // done
            ),
            listOf(
                KeyItemC( // i
                    center =
                        KeyC(
                            KeyAction.CommitText("I"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    top = KeyC(KeyAction.CommitText("Q")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("9"),
                            color = ColorVariant.MUTED,
                        ),
                ), // done
                KeyItemC( // o
                    center =
                        KeyC(
                            KeyAction.CommitText("O"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                    left = KeyC(KeyAction.CommitText("J")),
                    bottom = KeyC(KeyAction.CommitText("K")),
                    top = KeyC(KeyAction.CommitText("P")),
                ), // done
                NUMERIC_KEY_ITEM,
                KeyItemC( // n
                    center =
                        KeyC(
                            KeyAction.CommitText("N"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("F")),
                    left =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom = KeyC(KeyAction.CommitText("W")),
                    top = KeyC(KeyAction.CommitText("M")),
                ), // done
                KeyItemC( // h
                    center =
                        KeyC(
                            KeyAction.CommitText("H"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left =
                        KeyC(
                            KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    top = KeyC(KeyAction.CommitText("V")),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("0"),
                            color = ColorVariant.MUTED,
                        ),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                EN_TYPESPLIT_SHORT_SPACEBAR_SHIFT_KEY_SHIFTED_ITEM,
                EN_TYPESPLIT_SHORT_RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_TYPESPLIT_SHORT_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("1"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("#"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("%"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("<"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("@"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("2"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("\\"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("´"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("="),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("+"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("3"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("`"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("/"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText(","),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("_"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("|"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("4"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("^"),
                            color = ColorVariant.MUTED,
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("\""),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("~"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("&"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText(">"),
                            color = ColorVariant.MUTED,
                        ),
                ),
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("5"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("{"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("("),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(":"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("["),
                            color = ColorVariant.MUTED,
                        ),
                    bottom = KeyC(KeyAction.CommitText("9")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("6"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("!"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                ABC_KEY_ITEM,
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("7"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("$"),
                            color = ColorVariant.MUTED,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("€"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("?"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("£"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        getLocalCurrency()?.let {
                            if (it !in setOf("$", "£", "€")) {
                                KeyC(
                                    KeyAction.CommitText(it),
                                    color = ColorVariant.MUTED,
                                )
                            } else {
                                null
                            }
                        },
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("8"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("}"),
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText(")"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("]"),
                            color = ColorVariant.MUTED,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("°"),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText(";"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom = KeyC(KeyAction.CommitText("0")),
                ),
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                EN_TYPESPLIT_SHORT_SPACEBAR_ARROWS_KEY_ITEM,
                EN_TYPESPLIT_SHORT_RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_TYPESPLIT_SHORT: KeyboardDefinition =
    KeyboardDefinition(
        title = "english type-split short",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_TYPESPLIT_SHORT_MAIN,
                shifted = KB_EN_TYPESPLIT_SHORT_SHIFTED,
                numeric = KB_EN_TYPESPLIT_SHORT_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
