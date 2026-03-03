@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_GRNORM_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("σ", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("ς"),
                ),
                KeyItemC(
                    center = KeyC("ρ", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("γ"),
                ),
                KeyItemC(
                    center = KeyC("ο", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("θ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("ν", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("μ"),
                ),
                KeyItemC(
                    center = KeyC("η", size = LARGE),
                    topLeft = KeyC("ξ"),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("'"),
                            action = ComposeLastKey("'"),
                            color = MUTED,
                        ),
                    topRight = KeyC("β"),
                    right = KeyC("π"),
                    bottomRight = KeyC("υ"),
                    bottom = KeyC("χ"),
                    bottomLeft = KeyC("ω"),
                    left = KeyC("κ"),
                ),
                KeyItemC(
                    center = KeyC("α", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("λ"),
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
                    center = KeyC("τ", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("ψ"),
                ),
                KeyItemC(
                    center = KeyC("ι", size = LARGE),
                    top = KeyC("φ"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("ζ"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("ε", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("δ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_GRNORM_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("Σ", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("Ρ", size = LARGE),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC("Γ"),
                ),
                KeyItemC(
                    center = KeyC("Ο", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomLeft = KeyC("Θ"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Ν", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("Μ"),
                ),
                KeyItemC(
                    center = KeyC("Η", size = LARGE),
                    topLeft = KeyC("Ξ"),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("¨"),
                            action = ComposeLastKey("\""),
                            color = MUTED,
                        ),
                    topRight = KeyC("Β"),
                    right = KeyC("Π"),
                    bottomRight = KeyC("Υ"),
                    bottom = KeyC("Χ"),
                    bottomLeft = KeyC("Ω"),
                    left = KeyC("Κ"),
                ),
                KeyItemC(
                    center = KeyC("Α", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Λ"),
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
                    center = KeyC("Τ", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topRight = KeyC("Ψ"),
                ),
                KeyItemC(
                    center = KeyC("Ι", size = LARGE),
                    top = KeyC("Φ"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Ζ"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("Ε", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("Δ"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )
val KB_GRNORM_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "ελληνικά normal thumb-key",
        locales = listOf("el"),
        modes =
            KeyboardDefinitionModes(
                main = KB_GRNORM_THUMBKEY_MAIN,
                shifted = KB_GRNORM_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
