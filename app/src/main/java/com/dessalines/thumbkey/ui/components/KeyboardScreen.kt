package com.dessalines.thumbkey.ui.components

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.core.text.trimmedLength
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_KEYBOARD_MODES
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardMode
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.colorVariantToColor
import com.dessalines.thumbkey.utils.fontSizeVariantToFontSize
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

const val TAG = "com.thumbkey"

// git
// Shift / caps lock
// Number view
// Muted keys
// TODO add star for markdown to main

fun performKeyAction(
    action: KeyAction,
    ime: IMEService,
    onToggleShiftMode: (enable: Boolean) -> Unit,
    onToggleNumericMode: (enable: Boolean) -> Unit,
    mode: KeyboardMode
) {
    when (action) {
        is KeyAction.CommitText -> {
            val text = action.text
            Log.d(TAG, "committing key text: $text")
            ime.currentInputConnection.commitText(
                text,
                text.length
            )

            if (mode !== KeyboardMode.NUMERIC) {
                autoCapitalize(ime, onToggleShiftMode)
            }
        }
        is KeyAction.SendEvent -> {
            val ev = action.event
            Log.d(TAG, "sending key event: $ev")
            ime.currentInputConnection.sendKeyEvent(ev)
        }
        is KeyAction.DeleteLastWord -> {
            Log.d(TAG, "deleting last word")
            deleteLastWord(ime)
        }
        is KeyAction.ReplaceLastText -> {
            // TODO auto-shift doesn't work with this unfortunately
            Log.d(TAG, "replacing last word")
            val text = action.text

            ime.currentInputConnection.deleteSurroundingText(action.trimCount, 0)
            ime.currentInputConnection.commitText(
                text,
                text.length
            )
        }
        is KeyAction.ToggleShiftMode -> {
            val enable = action.enable
            Log.d(TAG, "Toggling Shifted: $enable")
            onToggleShiftMode(enable)
        }
        is KeyAction.ToggleNumericMode -> {
            val enable = action.enable
            Log.d(TAG, "Toggling Numeric: $enable")
            onToggleNumericMode(enable)
        }
    }
}

private fun autoCapitalize(
    ime: IMEService,
    onToggleShiftMode: (enable: Boolean) -> Unit
) {
    val textBefore = ime.currentInputConnection.getTextBeforeCursor(1, 0)

    if (arrayOf(".", "?", "!").contains(textBefore)) {
        onToggleShiftMode(true)
    } else {
        onToggleShiftMode(false)
    }
}

fun deleteLastWord(ime: IMEService) {
    // TODO bugs here. It should work like fleksy. Find the index of the last full word not spaces
//    val lastWordLength =
//        ime.currentInputConnection.getTextBeforeCursor(100, 0)?.split(" ")?.lastOrNull()?.length
//            ?: 1
    val lastWords = ime.currentInputConnection.getTextBeforeCursor(100, 0)

//    val lastWordIndex = lastWords?.trim()?.lastIndexOf(" ") ?: 0

    val trimmedLength = lastWords?.length?.minus(lastWords.trimmedLength()) ?: 0
    val trimmed = lastWords?.trim()
    val lastWordLength = trimmed?.split(" ")?.lastOrNull()?.length ?: 1
    val minDelete = if (lastWordLength > 0) {
        lastWordLength + trimmedLength
    } else {
        1
    }

    ime.currentInputConnection.deleteSurroundingText(minDelete, 0)
}

fun buildTapActions(
    keyItem: KeyItemC
): Array<KeyAction> {
    val tapActions: MutableList<KeyAction> = mutableListOf(keyItem.center.action)
    keyItem.nextTapActions?.let { tapActions.addAll(it) }
    return tapActions.toTypedArray()
}

@Composable
fun KeyboardKey(
    key: KeyItemC,
    mode: KeyboardMode,
    lastAction: MutableState<KeyAction?>,
    onToggleShiftMode: (enable: Boolean) -> Unit,
    onToggleNumericMode: (enable: Boolean) -> Unit
) {
    val ctx = LocalContext.current
    val ime = ctx as IMEService
    val scope = rememberCoroutineScope()
//    val scale = remember { AnimateFl}

    val pressed = remember { mutableStateOf(false) }
    val releasedKey = remember { mutableStateOf<String?>(null) }

//    val scale = animateFloatAsState(targetValue = if (pressed) 2f else 1f)

    var tapCount by remember { mutableStateOf(0) }

    // TODO does it need to build this every time?
    val tapActions = buildTapActions(key)

    // TODO maybe flash the key you just typed after release?

    var offsetX by remember { mutableStateOf(0f) }
    var offsetY by remember { mutableStateOf(0f) }

    val backgroundColor = if (!pressed.value) {
        colorVariantToColor(colorVariant = key.backgroundColor)
    } else {
        MaterialTheme.colorScheme.inversePrimary
    }

    val keySize = 80.dp

    val animationSpeed = 100

    val keyboardKeyModifier =
        Modifier
            .height(keySize)
            .width(keySize * key.widthMultiplier)
            .padding(.5.dp)
            .background(color = backgroundColor)
            .pointerInput(key1 = key) {
                detectTapGestures(
                    onPress = {
                        pressed.value = true
                    },
                    onTap = {
                        // Set the last key info, and the tap count
                        lastAction.value?.let { lastAction ->
                            if (lastAction == key.center.action) {
                                tapCount += 1
                            } else {
                                tapCount = 0
                            }
                        }
                        lastAction.value = key.center.action

                        // Set the correct action
                        val action = tapActions[tapCount % tapActions.size]

                        performKeyAction(
                            action = action,
                            ime = ime,
                            mode = mode,
                            onToggleShiftMode = onToggleShiftMode,
                            onToggleNumericMode = onToggleNumericMode
                        )
                        doneKeyAction(scope, action, pressed, releasedKey)
                    }
                )
            }
            // The key1 is necessary, otherwise new swipes wont work
            .pointerInput(key1 = key) {
                detectDragGestures(
                    onDragStart = {
                        pressed.value = true
                    },
                    onDrag = { change, dragAmount ->
                        change.consume()
                        val (x, y) = dragAmount
                        offsetX += x
                        offsetY += y
                    },
                    onDragEnd = {
                        // TODO this needs tuning
//                        val leeway = keySize.value / 2
                        val leeway = keySize.value
                        val swipeDirection = swipeDirection(offsetX, offsetY, leeway)

                        Log.d(
                            TAG,
                            "x: ${offsetX.roundToInt()}\ny: ${
                            offsetY.roundToInt()
                            }\n${swipeDirection?.name}"
                        )

                        val swipeKey = key.swipes?.get(swipeDirection)
                        val action = swipeKey?.action ?: run { key.center.action }
                        performKeyAction(
                            action = action,
                            ime = ime,
                            onToggleShiftMode = onToggleShiftMode,
                            onToggleNumericMode = onToggleNumericMode,
                            mode = mode
                        )

                        // Reset the drags
                        offsetX = 0f
                        offsetY = 0f

                        doneKeyAction(scope, action, pressed, releasedKey)
                    }
                )
            }

    // a 3x3 grid
    // Use box so they can overlap

    val keyPadding = 2.dp

    Box(
        modifier = keyboardKeyModifier
    ) {
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier.fillMaxSize().padding(horizontal = keyPadding)
        ) {
            key.swipes?.get(SwipeDirection.TOP_LEFT)?.let {
                KeyText(it, keySize)
            }
        }
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier.fillMaxSize().padding(horizontal = keyPadding)
        ) {
            key.swipes?.get(SwipeDirection.TOP)?.let {
                KeyText(it, keySize)
            }
        }
        Box(
            contentAlignment = Alignment.TopEnd,
            modifier = Modifier.fillMaxSize().padding(horizontal = keyPadding)
        ) {
            key.swipes?.get(SwipeDirection.TOP_RIGHT)?.let {
                KeyText(it, keySize)
            }
        }
        Box(
            contentAlignment = Alignment.CenterStart,
            modifier = Modifier.fillMaxSize().padding(horizontal = keyPadding)
        ) {
            key.swipes?.get(SwipeDirection.LEFT)?.let {
                KeyText(it, keySize)
            }
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize().padding(horizontal = keyPadding)
        ) {
            KeyText(key.center, keySize)
        }

        Box(
            contentAlignment = Alignment.CenterEnd,
            modifier = Modifier.fillMaxSize().padding(horizontal = keyPadding)
        ) {
            key.swipes?.get(SwipeDirection.RIGHT)?.let {
                KeyText(it, keySize)
            }
        }
        Box(
            contentAlignment = Alignment.BottomStart,
            modifier = Modifier.fillMaxSize().padding(horizontal = keyPadding)
        ) {
            key.swipes?.get(SwipeDirection.BOTTOM_LEFT)?.let {
                KeyText(it, keySize)
            }
        }
        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier.fillMaxSize().padding(horizontal = keyPadding)
        ) {
            key.swipes?.get(SwipeDirection.BOTTOM)?.let {
                KeyText(it, keySize)
            }
        }
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier.fillMaxSize().padding(horizontal = keyPadding)
        ) {
            key.swipes?.get(SwipeDirection.BOTTOM_RIGHT)?.let {
                KeyText(it, keySize)
            }
        }
        // The popup overlay
        AnimatedVisibility(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.tertiaryContainer),
            visible = releasedKey.value != null,
//            enter = scaleIn(tween(100)),
            enter = slideInVertically(tween(animationSpeed)),
            exit = ExitTransition.None
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                val fontSize = fontSizeVariantToFontSize(
                    fontSizeVariant = FontSizeVariant.LARGE,
                    keySize = keySize
                )
                releasedKey.value?.let { text ->
                    Text(
                        text = text,
                        fontWeight = FontWeight.Bold,
                        fontSize = fontSize,
                        color = MaterialTheme.colorScheme.tertiary
                    )
                }
            }
        }
    }
}

private fun doneKeyAction(
    scope: CoroutineScope,
    action: KeyAction,
    pressed: MutableState<Boolean>,
    releasedKey: MutableState<String?>
) {
    pressed.value = false
    scope.launch {
        delay(350)
        releasedKey.value = null
    }
    releasedKey.value = when (action) {
        is KeyAction.CommitText -> {
            action.text
        }
        else -> {
            null
        }
    }
}

@Composable
fun KeyText(key: KeyC, keySize: Dp) {
    val color = colorVariantToColor(colorVariant = key.color)
    val fontSize = fontSizeVariantToFontSize(fontSizeVariant = key.size, keySize = keySize)

    when (val display = key.display) {
        is KeyDisplay.IconDisplay -> {
            Icon(
                imageVector = display.icon,
                contentDescription = "TODO",
                tint = color
            )
        }
        is KeyDisplay.TextDisplay -> {
            Text(
                text = display.text,
                fontWeight = FontWeight.Bold,
                fontSize = fontSize,
                color = color
            )
        }
        null -> {}
    }
}

fun swipeDirection(x: Float, y: Float, leeway: Float): SwipeDirection? {
    return if (x > leeway) {
        if (y > leeway) {
            SwipeDirection.BOTTOM_RIGHT
        } else if (y < -leeway) {
            SwipeDirection.TOP_RIGHT
        } else {
            SwipeDirection.RIGHT
        }
    } else if (x < -leeway) {
        if (y > leeway) {
            SwipeDirection.BOTTOM_LEFT
        } else if (y < -leeway) {
            SwipeDirection.TOP_LEFT
        } else {
            SwipeDirection.LEFT
        }
    } else {
        if (y > leeway) {
            SwipeDirection.BOTTOM
        } else if (y < -leeway) {
            SwipeDirection.TOP
        } else {
            null
        }
    }
}

@Composable
fun KeyboardScreen() {
    var mode by remember {
        mutableStateOf(KeyboardMode.SHIFTED)
    }
    val lastAction = remember { mutableStateOf<KeyAction?>(null) }
    val keyboard = MESSAGEEASE_KEYBOARD_MODES[mode]!!

    Box(
        contentAlignment = Alignment.BottomEnd
    ) {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.onBackground)
        ) {
            keyboard.arr.forEach { row ->
                Row {
                    row.forEach { key ->
                        Column {
                            KeyboardKey(
                                key = key,
                                lastAction = lastAction,
                                mode = mode,
                                onToggleShiftMode = { enable ->
                                    mode = if (enable) {
                                        KeyboardMode.SHIFTED
                                    } else {
                                        KeyboardMode.MAIN
                                    }
                                },
                                onToggleNumericMode = { numeric ->
                                    mode = if (numeric) {
                                        KeyboardMode.NUMERIC
                                    } else {
                                        KeyboardMode.MAIN
                                    }
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewKeyboardScreen() {
    KeyboardScreen()
}

// @Composable
// fun KeyboardScreen() {
//    val keysMatrix = arrayOf(
//        arrayOf("Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"),
//        arrayOf("A", "S", "D", "F", "G", "H", "J", "K", "L"),
//        arrayOf("Z", "X", "C", "V", "B", "N", "M")
//    )
//    Column(
//        modifier = Modifier
//            .background(Color(0xFF9575CD))
//            .fillMaxWidth()
//    ) {
//        keysMatrix.forEach { row ->
//            FixedHeightBox(modifier = Modifier.fillMaxWidth(), height = 56.dp) {
//                Row(Modifier) {
//                    row.forEach { key ->
//                        KeyboardKey(keyboardKey = key, modifier = Modifier.weight(1f))
//                    }
//                }
//            }
//        }
//    }
// }
//
// @Composable
// fun FixedHeightBox(modifier: Modifier, height: Dp, content: @Composable () -> Unit) {
//    Layout(modifier = modifier, content = content) { measurables, constraints ->
//        val placeables = measurables.map { measurable ->
//            measurable.measure(constraints)
//        }
//        val h = height.roundToPx()
//        layout(constraints.maxWidth, h) {
//            placeables.forEach { placeable ->
//                placeable.place(x = 0, y = kotlin.math.min(0, h - placeable.height))
//            }
//        }
//    }
// }

// @Composable
// fun KeyboardKey(
//    keyboardKey: String,
//    modifier: Modifier
// ) {
//    val interactionSource = remember { MutableInteractionSource() }
//    val pressed = interactionSource.collectIsPressedAsState()
//    val ctx = LocalContext.current
//    val ime = ctx as IMEService
//    Box(modifier = modifier.fillMaxHeight(), contentAlignment = Alignment.BottomCenter) {
//        Text(
//            keyboardKey,
//            Modifier
//                .fillMaxWidth()
//                .padding(2.dp)
//                .border(1.dp, Color.Black)
//                .clickable(interactionSource = interactionSource, indication = null) {
// //                    (ctx as IMEService).currentInputConnection.commitText(
// //                        keyboardKey,
// //                        keyboardKey
// //                            .length
// //                    )
//                    ime.currentInputConnection.sendKeyEvent(KeyEvent(KeyEvent.ACTION_DOWN,
//                        KeyEvent.KEYCODE_E))
//                }
//                .background(Color.White)
//                .padding(
//                    start = 12.dp,
//                    end = 12.dp,
//                    top = 16.dp,
//                    bottom = 16.dp
//                )
//
//        )
//        if (pressed.value) {
//            Text(
//                keyboardKey,
//                Modifier
//                    .fillMaxWidth()
//                    .border(1.dp, Color.Black)
//                    .background(Color.White)
//                    .padding(
//                        start = 16.dp,
//                        end = 16.dp,
//                        top = 16.dp,
//                        bottom = 48.dp
//                    )
//            )
//        }
//    }
// }
