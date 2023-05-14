package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardMode
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.SwipeNWay

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
                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
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
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
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
                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("ף"),
                        action = KeyAction.CommitText("ף")
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
                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
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
                swipeType = SwipeNWay.FOUR_WAY_DIAGONAL,
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

val MESSAGEEASE_HE_KEYBOARD_MODES: Map<KeyboardMode, KeyboardC> = mapOf(
    KeyboardMode.MAIN to MESSAGEASE_HE_MAIN,
    KeyboardMode.SHIFTED to MESSAGEASE_HE_MAIN,
    KeyboardMode.NUMERIC to NUMERIC_KEYBOARD
)
