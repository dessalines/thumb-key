@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.utils

import android.util.Log
import androidx.compose.runtime.MutableState
import arrow.optics.*
import com.charleskorn.kaml.Yaml
import com.dessalines.thumbkey.utils.KeyAction.CommitText
import com.dessalines.thumbkey.utils.KeyAction.Noop
import com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer

/**
 * @param keyboardLayout The layout of the keyboard to be modified.
 * @param settings The application settings containing key modifications.
 * @return A modified `KeyboardDefinition` if modifications exist for the layout, else null.
 */
fun getModifiedKeyboardDefinition(
    keyboardLayout: KeyboardLayout,
    keyModifications: String?,
): KeyboardDefinition? =
    keyModifications?.let { keyMods ->
        try {
            val keyModifications = serializeKeyModifications(keyMods)
            keyModifications[keyboardLayout.name]?.let {
                val modifiedKeyboardDefinition = modifyKeyboardDefinition(keyboardLayout, it)
                Log.d(TAG, "key modifications applied to layout ${keyboardLayout.name}")
                modifiedKeyboardDefinition
            }
        } catch (e: Exception) {
            val errorMessage = e.message ?: e.stackTraceToString()
            Log.d(TAG, "Error applying key modifications: $errorMessage")
            null
        }
    } ?: run {
        null
    }

fun checkAllKeyboardModifications(
    keyModifications: String?,
    keyModificationsErrorState: MutableState<String?>,
) {
    keyModificationsErrorState.value = null
    keyModifications?.let { keyMods ->
        try {
            val keyModifications = serializeKeyModifications(keyMods)
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
}

/**
 * This can throw an Exception, so it should be wrapped
 */
fun serializeKeyModifications(keyModifications: String): KeyModifications {
    var serializer =
        MapSerializer(String.serializer(), KeyboardDefinitionModesSerializable.serializer())
    return Yaml.default.decodeFromString(serializer, keyModifications)
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
            KeyboardDefinitionModes.ctrled transform { modifyKeyboardC(it, modifications.ctrled) }
            KeyboardDefinitionModes.alted transform { modifyKeyboardC(it, modifications.alted) }
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
    if (keyCSerializable.remove) {
        return null
    }

    // TODO: add support for other types of KeyAction besides CommitText
    return (keyC ?: KeyC(action = Noop)).copy {
        keyCSerializable.text?.let {
            KeyC.action.set(CommitText(it))
            KeyC.display.set(TextDisplay(it))
        }
        keyCSerializable.displayText?.let {
            KeyC.display.set(TextDisplay(it))
        }
    }
}

typealias KeyModifications = Map<String, KeyboardDefinitionModesSerializable>

@Serializable
data class KeyboardDefinitionModesSerializable(
    val main: KeyboardCSerializable? = null,
    val shifted: KeyboardCSerializable? = null,
    val numeric: KeyboardCSerializable? = null,
    val ctrled: KeyboardCSerializable? = null,
    val alted: KeyboardCSerializable? = null,
)

@Serializable
@Suppress("PropertyName")
data class KeyboardCSerializable(
    val key0_0: KeyItemCSerializable? = null,
    val key0_1: KeyItemCSerializable? = null,
    val key0_2: KeyItemCSerializable? = null,
    val key0_3: KeyItemCSerializable? = null,
    val key1_0: KeyItemCSerializable? = null,
    val key1_1: KeyItemCSerializable? = null,
    val key1_2: KeyItemCSerializable? = null,
    val key1_3: KeyItemCSerializable? = null,
    val key2_0: KeyItemCSerializable? = null,
    val key2_1: KeyItemCSerializable? = null,
    val key2_2: KeyItemCSerializable? = null,
    val key2_3: KeyItemCSerializable? = null,
    val key3_0: KeyItemCSerializable? = null,
    val key3_1: KeyItemCSerializable? = null,
    val key3_2: KeyItemCSerializable? = null,
    val key3_3: KeyItemCSerializable? = null,
)

@Serializable
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
    var widthMultiplier: Int? = null,
    var backgroundColor: ColorVariant? = null,
    var swipeType: SwipeNWay? = null,
    var slideType: SlideType? = null,
)

@Serializable
data class KeyCSerializable(
    val text: String? = null,
    val displayText: String? = null,
    val size: FontSizeVariant? = null,
    val color: ColorVariant? = null,
    val remove: Boolean = false,
)
