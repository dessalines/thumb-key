@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.utils

import android.util.Log
import androidx.annotation.Keep
import androidx.compose.runtime.MutableState
import arrow.optics.*
import com.charleskorn.kaml.AnchorsAndAliases
import com.charleskorn.kaml.Yaml
import com.charleskorn.kaml.YamlConfiguration
import com.dessalines.thumbkey.keyboards.BACKSPACE_KEYC
import com.dessalines.thumbkey.keyboards.COPY_KEYC
import com.dessalines.thumbkey.keyboards.CUT_KEYC
import com.dessalines.thumbkey.keyboards.DELETE_WORD_AFTER_CURSOR_KEYC
import com.dessalines.thumbkey.keyboards.DELETE_WORD_BEFORE_CURSOR_KEYC
import com.dessalines.thumbkey.keyboards.GOTO_SETTINGS_KEYC
import com.dessalines.thumbkey.keyboards.HIDE_KEYBOARD_KEYC
import com.dessalines.thumbkey.keyboards.NEXT_WORD_AFTER_CURSOR_KEYC
import com.dessalines.thumbkey.keyboards.NOOP_KEYC
import com.dessalines.thumbkey.keyboards.PASTE_KEYC
import com.dessalines.thumbkey.keyboards.PREVIOUS_WORD_BEFORE_CURSOR_KEYC
import com.dessalines.thumbkey.keyboards.REDO_KEYC
import com.dessalines.thumbkey.keyboards.RETURN_KEYC
import com.dessalines.thumbkey.keyboards.SELECT_ALL_KEYC
import com.dessalines.thumbkey.keyboards.SPACEBAR_BOTTOM_KEYC
import com.dessalines.thumbkey.keyboards.SPACEBAR_LEFT_KEYC
import com.dessalines.thumbkey.keyboards.SPACEBAR_RIGHT_KEYC
import com.dessalines.thumbkey.keyboards.SPACEBAR_TOP_KEYC
import com.dessalines.thumbkey.keyboards.SWITCH_IME_KEYC
import com.dessalines.thumbkey.keyboards.SWITCH_IME_VOICE_KEYC
import com.dessalines.thumbkey.keyboards.SWITCH_LANGUAGE_KEYC
import com.dessalines.thumbkey.keyboards.TOGGLE_ALT_FALSE_KEYC
import com.dessalines.thumbkey.keyboards.TOGGLE_ALT_TRUE_KEYC
import com.dessalines.thumbkey.keyboards.TOGGLE_CAPS_KEYC
import com.dessalines.thumbkey.keyboards.TOGGLE_CLIPBOARD_MODE_TRUE_KEYC
import com.dessalines.thumbkey.keyboards.TOGGLE_CTRL_FALSE_KEYC
import com.dessalines.thumbkey.keyboards.TOGGLE_CTRL_TRUE_KEYC
import com.dessalines.thumbkey.keyboards.TOGGLE_EMOJI_MODE_TRUE_KEYC
import com.dessalines.thumbkey.keyboards.TOGGLE_NUMERIC_MODE_FALSE_KEYC
import com.dessalines.thumbkey.keyboards.TOGGLE_NUMERIC_MODE_TRUE_KEYC
import com.dessalines.thumbkey.keyboards.TOGGLE_SHIFT_FALSE_KEYC
import com.dessalines.thumbkey.keyboards.TOGGLE_SHIFT_TRUE_KEYC
import com.dessalines.thumbkey.keyboards.UNDO_KEYC
import com.dessalines.thumbkey.utils.KeyAction.CommitText
import com.dessalines.thumbkey.utils.KeyAction.Noop
import com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer

/**
 * @param keyboardLayout The layout of the keyboard to be modified.
 * @param keyModifications The key modifications YAML string.
 * @return A modified `KeyboardDefinition` if modifications exist for the layout, else null.
 */
fun getModifiedKeyboardDefinition(
    keyboardLayout: KeyboardLayout,
    keyModifications: String,
): KeyboardDefinition? =
    try {
        val keyMods = deserializeKeyModifications(keyModifications)
        keyMods[keyboardLayout.name]?.let {
            val modifiedKeyboardDefinition = modifyKeyboardDefinition(keyboardLayout, it)
            Log.d(TAG, "key modifications applied to layout ${keyboardLayout.name}")
            modifiedKeyboardDefinition
        }
    } catch (e: Exception) {
        val errorMessage = e.message ?: e.stackTraceToString()
        Log.d(TAG, "Error applying key modifications: $errorMessage")
        null
    }

fun checkAllKeyboardModifications(
    keyModifications: String,
    keyModificationsErrorState: MutableState<String?>,
) {
    keyModificationsErrorState.value = null
    try {
        val keyModifications = deserializeKeyModifications(keyModifications)
        keyModifications.forEach {
            val keyboardLayout = KeyboardLayout.entries.find { layout -> it.key == layout.name }
            if (keyboardLayout == null) {
                // This should never happen
                keyModificationsErrorState.value = "Keyboard layout '${it.key}' not found."
                return
            }

            modifyKeyboardDefinition(keyboardLayout, it.value)
        }
    } catch (e: Exception) {
        val errorMessage = e.message ?: e.stackTraceToString()
        keyModificationsErrorState.value = errorMessage
        Log.d(TAG, "Error applying key modifications: $errorMessage")
    }
}

/**
 * @param keyModifications The YAML string representation of key modifications.
 * @return A map of keyboard definitions.
 * @throws kotlinx.serialization.SerializationException - in case of any decoding-specific error.
 * @throws IllegalArgumentException - if the decoded input is not a valid instance of [KeyModifications].
 */
fun deserializeKeyModifications(keyModifications: String): KeyModifications {
    val serializer =
        MapSerializer(String.serializer(), KeyboardDefinitionModesSerializable.serializer())
    return getYaml().decodeFromString(serializer, keyModifications)
}

fun modifyKeyboardDefinition(
    layout: KeyboardLayout,
    modifications: KeyboardDefinitionModesSerializable,
): KeyboardDefinition {
    val originalKeyboardDefinition = layout.keyboardDefinition

    val mainShiftedSame = originalKeyboardDefinition.modes.main == originalKeyboardDefinition.modes.shifted
    val mainModifications = if (!mainShiftedSame) modifications.main else modifications.main ?: modifications.shifted
    val shiftedModifications = if (!mainShiftedSame) modifications.shifted else modifications.shifted ?: modifications.main

    return originalKeyboardDefinition.copy {
        inside(KeyboardDefinition.modes) {
            KeyboardDefinitionModes.main transform { modifyKeyboardC(it, mainModifications) ?: it }
            KeyboardDefinitionModes.shifted transform { modifyKeyboardC(it, shiftedModifications) ?: it }
            KeyboardDefinitionModes.numeric transform { modifyKeyboardC(it, modifications.numeric) ?: it }
            KeyboardDefinitionModes.ctrled transform { modifyKeyboardC(it, modifications.ctrled) ?: it }
            KeyboardDefinitionModes.alted transform { modifyKeyboardC(it, modifications.alted) ?: it }
        }
    }
}

fun modifyKeyboardC(
    keyboardC: KeyboardC?,
    keyboardCSerializable: KeyboardCSerializable?,
): KeyboardC? {
    if (keyboardC == null || keyboardCSerializable == null) return null

    return keyboardC.copy {
        KeyboardC.arr transform {
            it.mapIndexed { i, row ->
                row.mapIndexed { j, keyItemC ->
                    val propertyName = "key${i}_$j"
                    val property =
                        KeyboardCSerializable::class.members.find { it.name == propertyName }
                    val keyItemCSerializable =
                        property?.call(keyboardCSerializable) as? KeyItemCSerializable

                    keyItemC.copy {
                        keyItemCSerializable?.let { serializable ->
                            modifyKeyItemC(serializable)
                        }
                    }
                }
            }
        }
    }
}

fun Copy<KeyItemC>.modifyKeyItemC(serializable: KeyItemCSerializable) {
    KeyItemC.topLeft transform { modifyKeyC(it, serializable.topLeft) }
    KeyItemC.top transform { modifyKeyC(it, serializable.top) }
    KeyItemC.topRight transform { modifyKeyC(it, serializable.topRight) }
    KeyItemC.left transform { modifyKeyC(it, serializable.left) }
    KeyItemC.center transform { modifyKeyC(it, serializable.center) ?: KeyC(action = Noop) }
    KeyItemC.right transform { modifyKeyC(it, serializable.right) }
    KeyItemC.bottomLeft transform { modifyKeyC(it, serializable.bottomLeft) }
    KeyItemC.bottom transform { modifyKeyC(it, serializable.bottom) }
    KeyItemC.bottomRight transform { modifyKeyC(it, serializable.bottomRight) }

    KeyItemC.longPress transform { modifyLongPress(it, serializable.longPress) }

    KeyItemC.widthMultiplier transform { serializable.widthMultiplier ?: it }
    KeyItemC.backgroundColor transform { serializable.backgroundColor ?: it }
    KeyItemC.swipeType transform { serializable.swipeType ?: it }
    KeyItemC.slideType transform { serializable.slideType ?: it }
}

fun modifyKeyC(
    keyC: KeyC?,
    keyCSerializable: KeyCSerializable?,
): KeyC? {
    if (keyCSerializable == null) {
        return keyC
    }

    val keyActionKeyC = getCommonKeyCFromKeyAction(keyCSerializable.keyAction)
    val swipeReturnActionKeyC = getCommonKeyCFromKeyAction(keyCSerializable.swipeReturnAction)
    checkTextAndKeyActionValidity(keyActionKeyC, swipeReturnActionKeyC, keyCSerializable)
    if (keyCSerializable.remove) {
        return null
    }

    return (keyC ?: KeyC(action = Noop)).copy {
        keyCSerializable.text?.let {
            KeyC.action.set(CommitText(it))
            KeyC.display.set(TextDisplay(it))
        }

        keyActionKeyC?.let {
            KeyC.action.set(it.action)
            KeyC.swipeReturnAction.set(it.swipeReturnAction)
            KeyC.display.set(it.display)
            KeyC.capsModeDisplay.set(it.capsModeDisplay)
        }

        keyCSerializable.swipeReturnText?.let {
            KeyC.swipeReturnAction.set(CommitText(it))
        }

        swipeReturnActionKeyC?.let {
            KeyC.swipeReturnAction.set(it.action)
        }

        keyCSerializable.displayText?.let {
            KeyC.display.set(TextDisplay(it))
        }
        keyCSerializable.color?.let {
            KeyC.color.set(it)
        }
        keyCSerializable.size?.let {
            KeyC.size.set(it)
        }
    }
}

fun modifyLongPress(
    keyAction: KeyAction?,
    keyCSerializable: KeyCSerializable?,
): KeyAction? {
    if (keyCSerializable == null) {
        return keyAction
    }

    val keyActionKeyC = getCommonKeyCFromKeyAction(keyCSerializable.keyAction)
    val swipeReturnActionKeyC = getCommonKeyCFromKeyAction(keyCSerializable.swipeReturnAction)
    checkTextAndKeyActionValidity(keyActionKeyC, swipeReturnActionKeyC, keyCSerializable)

    if (keyCSerializable.remove) {
        return null
    }

    keyCSerializable.text?.let {
        return CommitText(it)
    }

    keyActionKeyC?.let {
        return it.action
    }

    return keyAction
}

fun checkTextAndKeyActionValidity(
    keyActionKeyC: KeyC?,
    swipeReturnActionKeyC: KeyC?,
    keyCSerializable: KeyCSerializable,
) {
    if (keyActionKeyC != null && keyCSerializable.text != null) {
        throw IllegalArgumentException(
            "Properties `text` and `keyAction` cannot both be used:\n${
                getYaml().encodeToString(
                    KeyCSerializable.serializer() ,
                    keyCSerializable,
                )
            }",
        )
    }
    if (swipeReturnActionKeyC != null && keyCSerializable.swipeReturnText != null) {
        throw IllegalArgumentException(
            "Properties `swipeReturnText` and `swipeReturnAction` cannot both be used:\n${
                getYaml().encodeToString(
                    KeyCSerializable.serializer() ,
                    keyCSerializable,
                )
            }",
        )
    }
}

fun getCommonKeyCFromKeyAction(keyActionSerializable: KeyActionSerializable?): KeyC? =
    when (keyActionSerializable) {
        KeyActionSerializable.ToggleNumericMode -> TOGGLE_NUMERIC_MODE_TRUE_KEYC
        KeyActionSerializable.ToggleABCMode -> TOGGLE_NUMERIC_MODE_FALSE_KEYC
        KeyActionSerializable.ToggleEmojiMode -> TOGGLE_EMOJI_MODE_TRUE_KEYC
        KeyActionSerializable.ToggleClipboardMode -> TOGGLE_CLIPBOARD_MODE_TRUE_KEYC
        KeyActionSerializable.ToggleCapsLock -> TOGGLE_CAPS_KEYC
        KeyActionSerializable.ToggleShiftModeTrue -> TOGGLE_SHIFT_TRUE_KEYC
        KeyActionSerializable.ToggleShiftModeFalse -> TOGGLE_SHIFT_FALSE_KEYC
        KeyActionSerializable.ToggleCtrlModeTrue -> TOGGLE_CTRL_TRUE_KEYC
        KeyActionSerializable.ToggleCtrlModeFalse -> TOGGLE_CTRL_FALSE_KEYC
        KeyActionSerializable.ToggleAltModeTrue -> TOGGLE_ALT_TRUE_KEYC
        KeyActionSerializable.ToggleAltModeFalse -> TOGGLE_ALT_FALSE_KEYC
        KeyActionSerializable.Left -> SPACEBAR_LEFT_KEYC
        KeyActionSerializable.Right -> SPACEBAR_RIGHT_KEYC
        KeyActionSerializable.Top -> SPACEBAR_TOP_KEYC
        KeyActionSerializable.Bottom -> SPACEBAR_BOTTOM_KEYC
        KeyActionSerializable.IMEComplete -> RETURN_KEYC
        KeyActionSerializable.PreviousWordBeforeCursor -> PREVIOUS_WORD_BEFORE_CURSOR_KEYC
        KeyActionSerializable.NextWordAfterCursor -> NEXT_WORD_AFTER_CURSOR_KEYC
        KeyActionSerializable.GotoSettings -> GOTO_SETTINGS_KEYC
        KeyActionSerializable.SelectAll -> SELECT_ALL_KEYC
        KeyActionSerializable.Cut -> CUT_KEYC
        KeyActionSerializable.Copy -> COPY_KEYC
        KeyActionSerializable.Paste -> PASTE_KEYC
        KeyActionSerializable.Undo -> UNDO_KEYC
        KeyActionSerializable.Redo -> REDO_KEYC
        KeyActionSerializable.Delete -> BACKSPACE_KEYC
        KeyActionSerializable.DeleteWordBeforeCursor -> DELETE_WORD_BEFORE_CURSOR_KEYC
        KeyActionSerializable.DeleteWordAfterCursor -> DELETE_WORD_AFTER_CURSOR_KEYC
        KeyActionSerializable.SwitchLanguage -> SWITCH_LANGUAGE_KEYC
        KeyActionSerializable.CycleLocale -> SWITCH_LANGUAGE_KEYC
        KeyActionSerializable.SwitchIME -> SWITCH_IME_KEYC
        KeyActionSerializable.SwitchIMEVoice -> SWITCH_IME_VOICE_KEYC
        KeyActionSerializable.HideKeyboard -> HIDE_KEYBOARD_KEYC
        KeyActionSerializable.Noop -> NOOP_KEYC
        null -> null
    }

fun getYaml(): Yaml =
    Yaml(
        configuration =
            YamlConfiguration(
                encodeDefaults = false,
                anchorsAndAliases = AnchorsAndAliases.Permitted(),
                extensionDefinitionPrefix = "x-",
            ),
    )

typealias KeyModifications = Map<String, KeyboardDefinitionModesSerializable>

@Serializable
@Keep
data class KeyboardDefinitionModesSerializable(
    val main: KeyboardCSerializable? = null,
    val shifted: KeyboardCSerializable? = null,
    val numeric: KeyboardCSerializable? = null,
    val ctrled: KeyboardCSerializable? = null,
    val alted: KeyboardCSerializable? = null,
)

@Serializable
@Suppress("PropertyName")
@Keep
data class KeyboardCSerializable(
    val key0_0: KeyItemCSerializable? = null,
    val key0_1: KeyItemCSerializable? = null,
    val key0_2: KeyItemCSerializable? = null,
    val key0_3: KeyItemCSerializable? = null,
    val key0_4: KeyItemCSerializable? = null,
    val key0_5: KeyItemCSerializable? = null,
    val key0_6: KeyItemCSerializable? = null,
    val key0_7: KeyItemCSerializable? = null,
    val key0_8: KeyItemCSerializable? = null,
    val key0_9: KeyItemCSerializable? = null,
    val key1_0: KeyItemCSerializable? = null,
    val key1_1: KeyItemCSerializable? = null,
    val key1_2: KeyItemCSerializable? = null,
    val key1_3: KeyItemCSerializable? = null,
    val key1_4: KeyItemCSerializable? = null,
    val key1_5: KeyItemCSerializable? = null,
    val key1_6: KeyItemCSerializable? = null,
    val key1_7: KeyItemCSerializable? = null,
    val key1_8: KeyItemCSerializable? = null,
    val key1_9: KeyItemCSerializable? = null,
    val key2_0: KeyItemCSerializable? = null,
    val key2_1: KeyItemCSerializable? = null,
    val key2_2: KeyItemCSerializable? = null,
    val key2_3: KeyItemCSerializable? = null,
    val key2_4: KeyItemCSerializable? = null,
    val key2_5: KeyItemCSerializable? = null,
    val key2_6: KeyItemCSerializable? = null,
    val key2_7: KeyItemCSerializable? = null,
    val key2_8: KeyItemCSerializable? = null,
    val key2_9: KeyItemCSerializable? = null,
    val key3_0: KeyItemCSerializable? = null,
    val key3_1: KeyItemCSerializable? = null,
    val key3_2: KeyItemCSerializable? = null,
    val key3_3: KeyItemCSerializable? = null,
    val key3_4: KeyItemCSerializable? = null,
    val key3_5: KeyItemCSerializable? = null,
    val key3_6: KeyItemCSerializable? = null,
    val key3_7: KeyItemCSerializable? = null,
    val key3_8: KeyItemCSerializable? = null,
    val key3_9: KeyItemCSerializable? = null,
    val key4_0: KeyItemCSerializable? = null,
    val key4_1: KeyItemCSerializable? = null,
    val key4_2: KeyItemCSerializable? = null,
    val key4_3: KeyItemCSerializable? = null,
    val key4_4: KeyItemCSerializable? = null,
    val key4_5: KeyItemCSerializable? = null,
    val key4_6: KeyItemCSerializable? = null,
    val key4_7: KeyItemCSerializable? = null,
    val key4_8: KeyItemCSerializable? = null,
    val key4_9: KeyItemCSerializable? = null,
    val key5_0: KeyItemCSerializable? = null,
    val key5_1: KeyItemCSerializable? = null,
    val key5_2: KeyItemCSerializable? = null,
    val key5_3: KeyItemCSerializable? = null,
    val key5_4: KeyItemCSerializable? = null,
    val key5_5: KeyItemCSerializable? = null,
    val key5_6: KeyItemCSerializable? = null,
    val key5_7: KeyItemCSerializable? = null,
    val key5_8: KeyItemCSerializable? = null,
    val key5_9: KeyItemCSerializable? = null,
    val key6_0: KeyItemCSerializable? = null,
    val key6_1: KeyItemCSerializable? = null,
    val key6_2: KeyItemCSerializable? = null,
    val key6_3: KeyItemCSerializable? = null,
    val key6_4: KeyItemCSerializable? = null,
    val key6_5: KeyItemCSerializable? = null,
    val key6_6: KeyItemCSerializable? = null,
    val key6_7: KeyItemCSerializable? = null,
    val key6_8: KeyItemCSerializable? = null,
    val key6_9: KeyItemCSerializable? = null,
    val key7_0: KeyItemCSerializable? = null,
    val key7_1: KeyItemCSerializable? = null,
    val key7_2: KeyItemCSerializable? = null,
    val key7_3: KeyItemCSerializable? = null,
    val key7_4: KeyItemCSerializable? = null,
    val key7_5: KeyItemCSerializable? = null,
    val key7_6: KeyItemCSerializable? = null,
    val key7_7: KeyItemCSerializable? = null,
    val key7_8: KeyItemCSerializable? = null,
    val key7_9: KeyItemCSerializable? = null,
    val key8_0: KeyItemCSerializable? = null,
    val key8_1: KeyItemCSerializable? = null,
    val key8_2: KeyItemCSerializable? = null,
    val key8_3: KeyItemCSerializable? = null,
    val key8_4: KeyItemCSerializable? = null,
    val key8_5: KeyItemCSerializable? = null,
    val key8_6: KeyItemCSerializable? = null,
    val key8_7: KeyItemCSerializable? = null,
    val key8_8: KeyItemCSerializable? = null,
    val key8_9: KeyItemCSerializable? = null,
    val key9_0: KeyItemCSerializable? = null,
    val key9_1: KeyItemCSerializable? = null,
    val key9_2: KeyItemCSerializable? = null,
    val key9_3: KeyItemCSerializable? = null,
    val key9_4: KeyItemCSerializable? = null,
    val key9_5: KeyItemCSerializable? = null,
    val key9_6: KeyItemCSerializable? = null,
    val key9_7: KeyItemCSerializable? = null,
    val key9_8: KeyItemCSerializable? = null,
    val key9_9: KeyItemCSerializable? = null,
)

@Serializable
@Keep
data class KeyItemCSerializable(
    val topLeft: KeyCSerializable? = null,
    val top: KeyCSerializable? = null,
    val topRight: KeyCSerializable? = null,
    val left: KeyCSerializable? = null,
    val center: KeyCSerializable? = null,
    val right: KeyCSerializable? = null,
    val bottomLeft: KeyCSerializable? = null,
    val bottom: KeyCSerializable? = null,
    val bottomRight: KeyCSerializable? = null,
    var longPress: KeyCSerializable? = null,
    var widthMultiplier: Int? = null,
    var backgroundColor: ColorVariant? = null,
    var swipeType: SwipeNWay? = null,
    var slideType: SlideType? = null,
)

@Serializable
@Keep
data class KeyCSerializable(
    val text: String? = null,
    val displayText: String? = null,
    val size: FontSizeVariant? = null,
    val color: ColorVariant? = null,
    val remove: Boolean = false,
    val keyAction: KeyActionSerializable? = null,
    val swipeReturnText: String? = null,
    val swipeReturnAction: KeyActionSerializable? = null,
)

@Keep
enum class KeyActionSerializable {
    ToggleNumericMode,
    ToggleABCMode,
    ToggleEmojiMode,
    ToggleClipboardMode,
    ToggleCapsLock,
    ToggleShiftModeFalse,
    ToggleShiftModeTrue,
    ToggleCtrlModeTrue,
    ToggleCtrlModeFalse,
    ToggleAltModeTrue,
    ToggleAltModeFalse,
    Left,
    Right,
    Top,
    Bottom,
    GotoSettings,
    SelectAll,
    Cut,
    Copy,
    Paste,
    Undo,
    Redo,
    SwitchLanguage,
    CycleLocale,
    SwitchIME,
    SwitchIMEVoice,
    HideKeyboard,
    IMEComplete,
    PreviousWordBeforeCursor,
    NextWordAfterCursor,
    Delete,
    DeleteWordBeforeCursor,
    DeleteWordAfterCursor,
    Noop,
}
