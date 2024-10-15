package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes

val KB_FA_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("د"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ص"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ض"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ر"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ژ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ف"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ز"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ق"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("و"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("‹"),
                            action = KeyAction.CommitText("\u200F"), // Right-to-Left Mark (RLM)
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ء"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("ع"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ن"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ج"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ح"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("چ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ا"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ذ"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ب"),
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("پ"),
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("س"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ش"),
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("ل"),
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("آ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("خ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("م"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("گ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ک"),
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("غ"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ت"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            action = KeyAction.CommitText("ث"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ی"),
                            size = FontSizeVariant.LARGE,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("‹›"),
                            action = KeyAction.CommitText("\u200C"), // Zero Width Non-Joiner (ZWNJ)
                            color = ColorVariant.MUTED,
                        ),
                    right =
                        KeyC(
                            action = KeyAction.CommitText("ئ"),
                        ),
                    bottomRight =
                        KeyC(
                            action = KeyAction.CommitText("ـ"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            action = KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("؟"),
                            color = ColorVariant.MUTED,
                        ),
                    bottomLeft =
                        KeyC(
                            action = KeyAction.CommitText("*"),
                            color = ColorVariant.MUTED,
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            action = KeyAction.CommitText("ه"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            action = KeyAction.CommitText("ط"),
                        ),
                    top =
                        KeyC(
                            action = KeyAction.CommitText("ظ"),
                        ),
                    left =
                        KeyC(
                            action = KeyAction.CommitText("ۀ"),
                        ),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_FARSI_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_FA_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "thumb-key فارسی",
        modes =
            KeyboardDefinitionModes(
                main = KB_FA_THUMBKEY_MAIN,
                shifted = KB_FA_THUMBKEY_MAIN,
                numeric = FARSI_NUMERIC_KEYBOARD,
            ),
    )
