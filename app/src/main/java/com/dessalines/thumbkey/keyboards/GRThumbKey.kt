@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_GR_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("ν", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("χ"),
                ),
                KeyItemC(
                    center = KeyC("υ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("ΰ"),
                    right = KeyC("ύ"),
                    bottom = KeyC("φ"),
                    left = KeyC("ϋ"),
                ),
                KeyItemC(
                    center = KeyC("ι", size = LARGE),
                    top = KeyC("ΐ"),
                    topRight = KeyC("ψ"),
                    bottom = KeyC("ϊ"),
                    bottomLeft = KeyC("ζ"),
                    left = KeyC("ί"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("σ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    right = KeyC("γ"),
                    top = KeyC("ς"),
                ),
                KeyItemC(
                    center = KeyC("η", size = LARGE),
                    topLeft = KeyC("κ"),
                    top = KeyC("λ"),
                    topRight = KeyC("ώ"),
                    right = KeyC("ή"),
                    bottomRight = KeyC("ω"),
                    bottom = KeyC("μ"),
                    bottomLeft = KeyC("ρ"),
                    left = KeyC("π"),
                ),
                KeyItemC(
                    center = KeyC("ο", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("ξ"),
                    right = KeyC("ό"),
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
                    topRight = KeyC("δ"),
                ),
                KeyItemC(
                    center = KeyC("ε", size = LARGE),
                    top = KeyC("θ"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("έ"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("α", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("β"),
                    bottomLeft = KeyC("ά"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_GR_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("Ν", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC("Χ"),
                ),
                KeyItemC(
                    center = KeyC("Υ", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    top = KeyC("Ϋ́"),
                    right = KeyC("Ύ"),
                    bottom = KeyC("Φ"),
                    left = KeyC("Ϋ"),
                ),
                KeyItemC(
                    center = KeyC("Ι", size = LARGE),
                    top = KeyC("Ϊ́"),
                    topRight = KeyC("Ψ"),
                    bottom = KeyC("Ϊ"),
                    bottomLeft = KeyC("Ζ"),
                    left = KeyC("Ί"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Σ", size = LARGE),
                    swipeType = TWO_WAY_HORIZONTAL,
                    right = KeyC("Γ"),
                ),
                KeyItemC(
                    center = KeyC("Η", size = LARGE),
                    topLeft = KeyC("Κ"),
                    top = KeyC("Λ"),
                    topRight = KeyC("Ώ"),
                    right = KeyC("Ή"),
                    bottomRight = KeyC("Ω"),
                    bottom = KeyC("Μ"),
                    bottomLeft = KeyC("Ρ"),
                    left = KeyC("Π"),
                ),
                KeyItemC(
                    center = KeyC("Ο", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    left = KeyC("Ξ"),
                    right = KeyC("Ό"),
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
                    topRight = KeyC("Δ"),
                ),
                KeyItemC(
                    center = KeyC("Ε", size = LARGE),
                    top = KeyC("Θ"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Έ"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("Α", size = LARGE),
                    swipeType = FOUR_WAY_DIAGONAL,
                    topLeft = KeyC("Β"),
                    bottomLeft = KeyC("Ά"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_GR_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "ελληνικά thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_GR_THUMBKEY_MAIN,
                shifted = KB_GR_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
