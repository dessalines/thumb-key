package com.dessalines.thumbkey.utils

import android.util.Log
import androidx.compose.runtime.MutableState
import com.charleskorn.kaml.Yaml
import com.dessalines.thumbkey.db.AppSettings
import com.dessalines.thumbkey.utils.KeyAction.CommitText
import com.dessalines.thumbkey.utils.KeyAction.Noop
import com.dessalines.thumbkey.utils.KeyDisplay.TextDisplay
import com.dessalines.thumbkey.utils.KeyboardLayout.Companion.restoreUnmodifiedKeyboardDefinitions
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer

private var changesPreviouslyApplied = false
private var previousKeyModificationsHash: Int? = null

fun applyKeyModifications(
    settings: AppSettings?,
    keyModificationsError: MutableState<String?>? = null,
) {
    try {
        if (settings == null || settings.keyModifications.hashCode() == previousKeyModificationsHash) {
            return
        }

        if (changesPreviouslyApplied) {
            restoreUnmodifiedKeyboardDefinitions()
            changesPreviouslyApplied = false
        }

        previousKeyModificationsHash = settings.keyModifications.hashCode()

        if (settings.keyModifications.isEmpty()) {
            keyModificationsError?.value = null
            return
        }

        val keyModifications = serializeKeyModifications(settings.keyModifications)
        val layouts = keyboardLayoutsSetFromDbIndexString(settings.keyboardLayouts).toList()
        for (layout in layouts) {
            if (keyModifications[layout.name] == null) {
                continue
            }

            val modifications = keyModifications[layout.name]!!

            applyToKeyboardLayout(layout, modifications)

            changesPreviouslyApplied = true
            Log.d(TAG, "key modifications applied to layout ${layout.name}")
        }
        keyModificationsError?.value = null
    } catch (e: Exception) {
        keyModificationsError?.value = e.message ?: e.stackTraceToString()
        Log.d(TAG, "Error applying key modifications: ${keyModificationsError?.value}")
    }
}

fun serializeKeyModifications(keyModifications: String): Map<String, KeyboardDefinitionModesSerializable> {
    var serializer =
        MapSerializer(String.serializer(), KeyboardDefinitionModesSerializable.serializer())
    return Yaml.default.decodeFromString(serializer, keyModifications)
}

fun applyToKeyboardLayout(
    layout: KeyboardLayout,
    modifications: KeyboardDefinitionModesSerializable,
) {
    applyToKeyboardC(layout.keyboardDefinition.modes.main, modifications.main)
    applyToKeyboardC(layout.keyboardDefinition.modes.shifted, modifications.shifted)
    applyToKeyboardC(layout.keyboardDefinition.modes.numeric, modifications.numeric)
    applyToKeyboardC(layout.keyboardDefinition.modes.ctrled, modifications.ctrled)
    applyToKeyboardC(layout.keyboardDefinition.modes.alted, modifications.alted)
}

fun applyToKeyboardC(
    keyboardC: KeyboardC?,
    keyboardCSerializable: KeyboardCSerializable?,
) {
    if (keyboardC == null || keyboardCSerializable == null) return

    keyboardC.arr.forEachIndexed { i, row ->
        row.forEachIndexed { j, keyItemC ->
            val propertyName = "key${i}_$j"
            val property = KeyboardCSerializable::class.members.find { it.name == propertyName }
            val keyItemCSerializable = property?.call(keyboardCSerializable) as? KeyItemCSerializable

            keyItemCSerializable?.let {
                applyToKeyItemC(keyItemC, it)
            }
        }
    }
}

private fun applyToKeyItemC(
    keyItemC: KeyItemC,
    serializable: KeyItemCSerializable,
) {
    keyItemC.topLeft = applyToKeyC(keyItemC.topLeft, serializable.topLeft)
    keyItemC.top = applyToKeyC(keyItemC.top, serializable.top)
    keyItemC.topRight = applyToKeyC(keyItemC.topRight, serializable.topRight)
    keyItemC.left = applyToKeyC(keyItemC.left, serializable.left)
    keyItemC.center = applyToKeyC(keyItemC.center, serializable.center) ?: KeyC(action = Noop)
    keyItemC.right = applyToKeyC(keyItemC.right, serializable.right)
    keyItemC.bottomLeft = applyToKeyC(keyItemC.bottomLeft, serializable.bottomLeft)
    keyItemC.bottom = applyToKeyC(keyItemC.bottom, serializable.bottom)
    keyItemC.bottomRight = applyToKeyC(keyItemC.bottomRight, serializable.bottomRight)

    keyItemC.widthMultiplier = serializable.widthMultiplier ?: keyItemC.widthMultiplier
    keyItemC.backgroundColor = serializable.backgroundColor ?: keyItemC.backgroundColor
    keyItemC.swipeType = serializable.swipeType ?: keyItemC.swipeType
    keyItemC.slideType = serializable.slideType ?: keyItemC.slideType
}

fun applyToKeyC(
    keyC: KeyC?,
    keyCSerializable: KeyCSerializable?,
): KeyC? {
    var returnValue = keyC
    if (keyCSerializable == null) {
        return returnValue
    }
    if (keyCSerializable.remove) {
        return null
    }

    val committedText = keyCSerializable.text ?: ""
    val displayText = keyCSerializable.displayText ?: committedText

    if (keyC == null) {
        returnValue =
            KeyC(
                action = CommitText(committedText),
                display = TextDisplay(displayText),
            )
    } else {
        returnValue.action = CommitText(committedText)
        returnValue.display = TextDisplay(displayText)
    }

    // TODO: add support for other types of KeyAction besides CommitText

    returnValue.size = keyCSerializable.size ?: returnValue.size
    returnValue.color = keyCSerializable.color ?: returnValue.color

    return returnValue
}

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
