package com.dessalines.thumbkey

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.WindowInsets
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.dessalines.thumbkey.db.AppSettingsRepository
import com.dessalines.thumbkey.db.ClipboardRepository
import com.dessalines.thumbkey.db.FloatingPositionUpdate
import com.dessalines.thumbkey.ui.components.keyboard.KeyboardScreen
import com.dessalines.thumbkey.ui.theme.ThumbkeyTheme
import com.dessalines.thumbkey.utils.KeyboardPosition
import com.dessalines.thumbkey.utils.keyboardLayoutsSetFromDbIndexString
import com.dessalines.thumbkey.utils.resolveKeyboardDefinition
import com.dessalines.thumbkey.utils.toBool
import com.dessalines.thumbkey.utils.toInt
import kotlinx.coroutines.launch

@SuppressLint("ViewConstructor")
class ComposeKeyboardView(
    context: Context,
    private val settingsRepo: AppSettingsRepository,
    private val clipboardRepo: ClipboardRepository,
) : AbstractComposeView(context) {
    override fun dispatchApplyWindowInsets(insets: WindowInsets): WindowInsets {
        val compat = WindowInsetsCompat.toWindowInsetsCompat(insets, this)
        val navBottom = compat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom
        (context as IMEService).onNavBarBottomInsetChanged(navBottom)
        return super.dispatchApplyWindowInsets(insets)
    }

    @Composable
    override fun Content() {
        val settingsState = settingsRepo.appSettings.observeAsState(initial = settingsRepo.appSettings.value)
        val settings by settingsState
        val ctx = context as IMEService

        ThumbkeyTheme(
            settings = settings,
        ) {
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
                KeyboardScreen(
                    settings = settings,
                    clipboardRepository = clipboardRepo,
                    onSwitchLanguage = {
                        ctx.lifecycleScope.launch {
                            // Cycle to the next keyboard
                            val state = settingsState.value
                            state?.let { s ->

                                val layouts =
                                    keyboardLayoutsSetFromDbIndexString(s.keyboardLayouts).toList()
                                val currentLayout = s.keyboardLayout
                                val index = layouts.map { it.ordinal }.indexOf(currentLayout)
                                val nextIndex = (index + 1).mod(layouts.size)
                                val nextLayout = layouts.getOrNull(nextIndex)
                                nextLayout?.let { layout ->
                                    val s2 = s.copy(keyboardLayout = layout.ordinal)
                                    settingsRepo.update(s2)

                                    ctx.currentKeyboardDefinition
                                        ?.settings
                                        ?.textProcessor
                                        ?.handleFinishInput(ctx)
                                    ctx.currentKeyboardDefinition = resolveKeyboardDefinition(layout, s.keyModifications)
                                    ctx.currentKeyboardDefinition
                                        ?.settings
                                        ?.textProcessor
                                        ?.updateCursorPosition(ctx)

                                    // Display the new layout's name on the screen
                                    if (s.showToastOnLayoutSwitch.toBool()) {
                                        val layoutName = layout.keyboardDefinition.title
                                        Toast
                                            .makeText(context, layoutName, Toast.LENGTH_SHORT)
                                            .show()
                                    }
                                }
                            }
                        }
                    },
                    onChangePosition = { f ->
                        ctx.lifecycleScope.launch {
                            val state = settingsState.value
                            state?.let { s ->
                                val current = KeyboardPosition.entries.getOrElse(s.position) { KeyboardPosition.Center }
                                val nextPosition = f(current).ordinal
                                val s2 = s.copy(position = nextPosition)
                                settingsRepo.update(s2)
                            }
                        }
                    },
                    onToggleHideLetters = {
                        ctx.lifecycleScope.launch {
                            val state = settingsState.value
                            state?.let { s ->
                                val newHideLetters = (!s.hideLetters.toBool()).toInt()
                                val s2 = s.copy(hideLetters = newHideLetters)
                                settingsRepo.update(s2)
                            }
                        }
                    },
                    onFloatingMoved = { xFrac, yFrac ->
                        ctx.lifecycleScope.launch {
                            val id = settingsState.value?.id ?: 1
                            settingsRepo.updateFloatingPosition(
                                FloatingPositionUpdate(
                                    id = id,
                                    floatingXFraction = xFrac.coerceIn(0f, 1f),
                                    floatingYFraction = yFrac.coerceIn(0f, 1f),
                                ),
                            )
                        }
                    },
                    onFloatingBounds = { bounds ->
                        ctx.onFloatingBounds(bounds)
                    },
                    onGoToClipboardSettings = {
                        val intent =
                            Intent(context, MainActivity::class.java).apply {
                                putExtra("startRoute", "clipboardSettings")
                                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                            }
                        context.startActivity(intent)
                    },
                )
            }
        }
    }
}
