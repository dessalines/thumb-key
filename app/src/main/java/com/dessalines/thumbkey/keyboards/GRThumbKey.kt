package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
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

val KB_GR_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ν"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC(KeyAction.CommitText("χ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("υ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC(KeyAction.CommitText("ΰ")),
                    right = KeyC(KeyAction.CommitText("ύ")),
                    bottom = KeyC(KeyAction.CommitText("φ")),
                    left = KeyC(KeyAction.CommitText("ϋ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ι"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("ΐ")),
                    topRight = KeyC(KeyAction.CommitText("ψ")),
                    bottom = KeyC(KeyAction.CommitText("ϊ")),
                    bottomLeft = KeyC(KeyAction.CommitText("ζ")),
                    left = KeyC(KeyAction.CommitText("ί")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("σ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    right = KeyC(KeyAction.CommitText("γ")),
                    top = KeyC(KeyAction.CommitText("ς")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("η"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("κ")),
                    top = KeyC(KeyAction.CommitText("λ")),
                    topRight = KeyC(KeyAction.CommitText("ώ")),
                    right = KeyC(KeyAction.CommitText("ή")),
                    bottomRight = KeyC(KeyAction.CommitText("ω")),
                    bottom = KeyC(KeyAction.CommitText("μ")),
                    bottomLeft = KeyC(KeyAction.CommitText("ρ")),
                    left = KeyC(KeyAction.CommitText("π")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ο"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC(KeyAction.CommitText("ξ")),
                    right = KeyC(KeyAction.CommitText("ό")),
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
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("τ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight = KeyC(KeyAction.CommitText("δ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ε"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("θ")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC(KeyAction.CommitText("έ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("α"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC(KeyAction.CommitText("β")),
                    bottomLeft = KeyC(KeyAction.CommitText("ά")),
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
                    center =
                        KeyC(
                            KeyAction.CommitText("Ν"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    bottomRight = KeyC(KeyAction.CommitText("Χ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Υ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    top = KeyC(KeyAction.CommitText("Ϋ́")),
                    right = KeyC(KeyAction.CommitText("Ύ")),
                    bottom = KeyC(KeyAction.CommitText("Φ")),
                    left = KeyC(KeyAction.CommitText("Ϋ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Ι"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("Ϊ́")),
                    topRight = KeyC(KeyAction.CommitText("Ψ")),
                    bottom = KeyC(KeyAction.CommitText("Ϊ")),
                    bottomLeft = KeyC(KeyAction.CommitText("Ζ")),
                    left = KeyC(KeyAction.CommitText("Ί")),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Σ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.TWO_WAY_HORIZONTAL,
                    right = KeyC(KeyAction.CommitText("Γ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Η"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft = KeyC(KeyAction.CommitText("Κ")),
                    top = KeyC(KeyAction.CommitText("Λ")),
                    topRight = KeyC(KeyAction.CommitText("Ώ")),
                    right = KeyC(KeyAction.CommitText("Ή")),
                    bottomRight = KeyC(KeyAction.CommitText("Ω")),
                    bottom = KeyC(KeyAction.CommitText("Μ")),
                    bottomLeft = KeyC(KeyAction.CommitText("Ρ")),
                    left = KeyC(KeyAction.CommitText("Π")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Ο"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_CROSS,
                    left = KeyC(KeyAction.CommitText("Ξ")),
                    right = KeyC(KeyAction.CommitText("Ό")),
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
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Τ"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topRight = KeyC(KeyAction.CommitText("Δ")),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Ε"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top = KeyC(KeyAction.CommitText("Θ")),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("'"),
                            color = ColorVariant.MUTED,
                        ),
                    right = KeyC(KeyAction.CommitText("Έ")),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("-"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("Α"),
                            size = FontSizeVariant.LARGE,
                        ),
                    swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                    topLeft = KeyC(KeyAction.CommitText("Β")),
                    bottomLeft = KeyC(KeyAction.CommitText("Ά")),
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
