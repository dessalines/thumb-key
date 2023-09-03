package com.dessalines.thumbkey.utils

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.dessalines.thumbkey.R
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// Almost a 4x4 grid, but the bottom is mostly spacebar
@Serializable
data class KeyboardC(
    val arr: List<List<KeyItemC>>,
) {
    init {
        require(arr.map { it.sumOf { it.widthMultiplier } }.reduce { acc, sum -> if (acc == sum) acc else -1 } != -1) { "Keyboard must be rectangular" }
    }
}

@Serializable
data class KeyItemC(
    val center: KeyC,
    val swipes: Map<SwipeDirection, KeyC>? = null,
    val nextTapActions: List<KeyAction>? = null,
    val widthMultiplier: Int = 1,
    val backgroundColor: ColorVariant = ColorVariant.SURFACE,
)

@Serializable
data class KeyC(
    val display: KeyDisplay?,
    val capsModeDisplay: KeyDisplay? = null,
    val action: KeyAction,
    val color: ColorVariant = ColorVariant.SECONDARY,
    val size: FontSizeVariant = FontSizeVariant.SMALL,
)

@Serializable
sealed class KeyDisplay {
    @Serializable
    class TextDisplay(val text: String) : KeyDisplay()
    @Serializable
    class IconDisplay(val iconType: String, val iconName: String) : KeyDisplay() {
        val icon: ImageVector by lazy(LazyThreadSafetyMode.PUBLICATION) {
            require(iconType in setOf("Filled", "Outlined", "Rounded", "Sharp", "TwoTone"))
            val className = buildString {
                append("androidx.compose.material.icons.")
                append(iconType.lowercase())
                append(".")
                append(iconName)
                append("Kt")
            }
            val style = Icons::class.java.declaredClasses.single { it.simpleName == iconType }.getField("INSTANCE").get(null)
            Class.forName(className).declaredMethods.single().invoke(null, style) as ImageVector
        }
    }
}

@Serializable
sealed class KeyAction {
    @Serializable
    class CommitText(val text: String) : KeyAction()
    @Serializable
    class SendEvent(@Serializable(with = KeyEventSerializer::class) val event: KeyEvent) : KeyAction()
    @Serializable
    object DeleteLastWord : KeyAction()
    @Serializable
    class ReplaceLastText(val text: String, val trimCount: Int = 2) : KeyAction() {
        init {
            require(trimCount >= 0) { "Invalid trimCount $trimCount" }
        }
    }
    @Serializable
    class ToggleShiftMode(val enable: Boolean) : KeyAction()
    @Serializable
    class ToggleNumericMode(val enable: Boolean) : KeyAction()
    @Serializable
    object GotoSettings : KeyAction()
    @Serializable
    object IMECompleteAction : KeyAction()
    @Serializable
    object ToggleCapsLock : KeyAction()
    @Serializable
    object SelectAndCopyAll : KeyAction()
    @Serializable
    object Paste : KeyAction()
    @Serializable
    object SwitchLanguage : KeyAction()
    @Serializable
    object SwitchPosition : KeyAction()
}

@Serializable
enum class KeyboardMode {
    MAIN, SHIFTED, NUMERIC
}

@Serializable
enum class SwipeDirection(val angle: Double) {
    LEFT(1 * Math.PI),
    TOP_LEFT(-0.75 * Math.PI),
    TOP(-0.5 * Math.PI),
    TOP_RIGHT(-0.25 * Math.PI),
    RIGHT(0 * Math.PI),
    BOTTOM_RIGHT(0.25 * Math.PI),
    BOTTOM(0.5 * Math.PI),
    BOTTOM_LEFT(0.75 * Math.PI),
}

@Serializable
enum class ColorVariant {
    PRIMARY, SECONDARY, SURFACE, SURFACE_VARIANT, MUTED,
}

@Serializable
enum class FontSizeVariant {
    LARGE, SMALL, SMALLEST
}

enum class ThemeMode(private val stringId: Int) {
    System(R.string.system),
    Light(R.string.light),
    Dark(R.string.dark),
    ;

    @Composable
    fun title(): String {
        return stringResource(this.stringId)
    }
}

enum class ThemeColor(private val stringId: Int) {
    Dynamic(R.string.dynamic),
    Green(R.string.green),
    Pink(R.string.pink),
    Srcery(R.string.srcery),
    Blue(R.string.blue),
    ;

    @Composable
    fun title(): String {
        return stringResource(this.stringId)
    }
}

// Make sure new keyboards have a new index, even if they are in the middle
data class KeyboardLayout(val title: String, val json: String)

enum class KeyboardPosition(private val stringId: Int) {
    Center(R.string.center),
    Right(R.string.right),
    Left(R.string.left),
    ;

    @Composable
    fun title(): String {
        return stringResource(this.stringId)
    }
}


class KeyEventSerializer : KSerializer<KeyEvent> {
    @Serializable
    @SerialName("KeyEvent")
    private class KeyEventSurrogate(val action: Int, val code: Int)

    override val descriptor: SerialDescriptor
        get() = KeyEventSurrogate.serializer().descriptor

    override fun deserialize(decoder: Decoder): KeyEvent {
        val surrogate = decoder.decodeSerializableValue(KeyEventSurrogate.serializer())
        return KeyEvent(surrogate.action, surrogate.code)
    }

    override fun serialize(encoder: Encoder, value: KeyEvent) {
        val surrogate = KeyEventSurrogate(value.action, value.keyCode)
        encoder.encodeSerializableValue(KeyEventSurrogate.serializer(), surrogate)
    }
}