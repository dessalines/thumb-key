package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.KeyboardCapslock
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardMode
import com.dessalines.thumbkey.utils.SwipeDirection

val MESSAGEASE_HE_MAIN = KeyboardC(
    arrayOf(
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ר"),
                    action = KeyAction.CommitText("ר"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ן"),
                        action = KeyAction.CommitText("ן")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ב"),
                    action = KeyAction.CommitText("ב"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("ג"),
                        action = KeyAction.CommitText("ג")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("א"),
                    action = KeyAction.CommitText("א"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("צ"),
                        action = KeyAction.CommitText("צ")
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ץ"),
                        action = KeyAction.CommitText("ץ")
                    )
                )
            ),
            SETTINGS_KEY_ITEM
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("מ"),
                    action = KeyAction.CommitText("מ"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ם"),
                        action = KeyAction.CommitText("ם")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ך"),
                        action = KeyAction.CommitText("ך")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("י"),
                    action = KeyAction.CommitText("י"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ק"),
                        action = KeyAction.CommitText("ק")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ח"),
                        action = KeyAction.CommitText("ח")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("פ"),
                        action = KeyAction.CommitText("פ")
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ד"),
                        action = KeyAction.CommitText("ד")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ש"),
                        action = KeyAction.CommitText("ש")
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("נ"),
                        action = KeyAction.CommitText("נ")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("כ"),
                        action = KeyAction.CommitText("כ")
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ע"),
                        action = KeyAction.CommitText("ע")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ו"),
                    action = KeyAction.CommitText("ו"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ף"),
                        action = KeyAction.CommitText("ף")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                        action = KeyAction.ToggleShiftMode(false),
                        color = ColorVariant.MUTED
                    )
                )
            ),
            NUMERIC_KEY_ITEM
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ת"),
                    action = KeyAction.CommitText("ת"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("ז"),
                        action = KeyAction.CommitText("ז")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ה"),
                    action = KeyAction.CommitText("ה"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("ס"),
                        action = KeyAction.CommitText("ס")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay(","),
                        action = KeyAction.CommitText(","),
                        color = ColorVariant.MUTED
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("ל"),
                    action = KeyAction.CommitText("ל"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ט"),
                        action = KeyAction.CommitText("ט")
                    )
                )
            ),
            BACKSPACE_KEY_ITEM
        ),
        arrayOf(
            SPACEBAR_KEY_ITEM,
            RETURN_KEY_ITEM
        )
    )
)

val MESSAGEEASE_EN_SHIFTED = KeyboardC(
    arrayOf(
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("A"),
                    action = KeyAction.CommitText("A"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("V"),
                        action = KeyAction.CommitText("V")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("N"),
                    action = KeyAction.CommitText("N"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("L"),
                        action = KeyAction.CommitText("L")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("I"),
                    action = KeyAction.CommitText("I"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("X"),
                        action = KeyAction.CommitText("X")
                    )
                )
            ),
            SETTINGS_KEY_ITEM
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("H"),
                    action = KeyAction.CommitText("H"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("K"),
                        action = KeyAction.CommitText("K")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("O"),
                    action = KeyAction.CommitText("O"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("Q"),
                        action = KeyAction.CommitText("Q")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("U"),
                        action = KeyAction.CommitText("U")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("P"),
                        action = KeyAction.CommitText("P")
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("B"),
                        action = KeyAction.CommitText("B")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("J"),
                        action = KeyAction.CommitText("J")
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("D"),
                        action = KeyAction.CommitText("D")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("G"),
                        action = KeyAction.CommitText("G")
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("C"),
                        action = KeyAction.CommitText("C")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("R"),
                    action = KeyAction.CommitText("R"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("M"),
                        action = KeyAction.CommitText("M")
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                        action = KeyAction.ToggleShiftMode(false),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                        action = KeyAction.ToggleCapsLock,
                        color = ColorVariant.MUTED
                    )
                )
            ),
            NUMERIC_KEY_ITEM
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("T"),
                    action = KeyAction.CommitText("T"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Y"),
                        action = KeyAction.CommitText("Y")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("E"),
                    action = KeyAction.CommitText("E"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("W"),
                        action = KeyAction.CommitText("W")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Z"),
                        action = KeyAction.CommitText("Z")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay(","),
                        action = KeyAction.CommitText(","),
                        color = ColorVariant.MUTED
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("S"),
                    action = KeyAction.CommitText("S"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("F"),
                        action = KeyAction.CommitText("F")
                    )
                )
            ),
            BACKSPACE_KEY_ITEM
        ),
        arrayOf(
            SPACEBAR_KEY_ITEM,
            RETURN_KEY_ITEM
        )
    )
)

val MESSAGEEASE_KEYBOARD_MODES: Map<KeyboardMode, KeyboardC> = mapOf(
    KeyboardMode.MAIN to MESSAGEASE_HE_MAIN,
    KeyboardMode.SHIFTED to MESSAGEASE_HE_MAIN,
    KeyboardMode.NUMERIC to NUMERIC_KEYBOARD
)
