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
                            KeyAction.CommitText("د"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ص"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ض"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ر"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ژ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ف"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ز"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ق"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("و"),
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
                            KeyAction.CommitText("ء"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("ع"),
                        ),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ن"),
                            size = FontSizeVariant.LARGE,
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("ج"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ح"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("چ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ا"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ذ"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ب"),
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("پ"),
                        ),
                    right =
                        KeyC(
                            KeyAction.CommitText("س"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ش"),
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("ل"),
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("آ"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("خ"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("م"),
                            size = FontSizeVariant.LARGE,
                        ),
                    bottomLeft =
                        KeyC(
                            KeyAction.CommitText("گ"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ک"),
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("غ"),
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ت"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topRight =
                        KeyC(
                            KeyAction.CommitText("ث"),
                        ),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            KeyAction.CommitText("ی"),
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
                            KeyAction.CommitText("ئ"),
                        ),
                    bottomRight =
                        KeyC(
                            KeyAction.CommitText("ـ"),
                            color = ColorVariant.MUTED,
                        ),
                    bottom =
                        KeyC(
                            KeyAction.CommitText("."),
                            color = ColorVariant.MUTED,
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("؟"),
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
                            KeyAction.CommitText("ه"),
                            size = FontSizeVariant.LARGE,
                        ),
                    topLeft =
                        KeyC(
                            KeyAction.CommitText("ط"),
                        ),
                    top =
                        KeyC(
                            KeyAction.CommitText("ظ"),
                        ),
                    left =
                        KeyC(
                            KeyAction.CommitText("ۀ"),
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
