package com.dessalines.thumbkey

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.lifecycle.lifecycleScope
import com.dessalines.thumbkey.db.AppSettingsRepository
import com.dessalines.thumbkey.db.ClipboardRepository
import com.dessalines.thumbkey.ui.components.keyboard.KeyboardScreen
import com.dessalines.thumbkey.ui.theme.ThumbkeyTheme
import com.dessalines.thumbkey.utils.KeyboardPosition
import com.dessalines.thumbkey.utils.keyboardLayoutsSetFromDbIndexString
import com.dessalines.thumbkey.utils.toBool
import com.dessalines.thumbkey.utils.toInt
import kotlinx.coroutines.launch

@SuppressLint("ViewConstructor")
class ComposeKeyboardView(
    context: Context,
    private val settingsRepo: AppSettingsRepository,
    private val clipboardRepo: ClipboardRepository,
) : AbstractComposeView(context) {
    @Composable
    override fun Content() {
        val settingsState = settingsRepo.appSettings.observeAsState()
        val settings by settingsState
        val ctx = context as IMEService

        var currentLocaleIndex by remember { mutableStateOf(0) }

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
                                    ctx.currentKeyboardDefinition = (layouts[nextIndex].keyboardDefinition)
                                    ctx.currentKeyboardDefinition
                                        ?.settings
                                        ?.textProcessor
                                        ?.updateCursorPosition(ctx)

                                    // Notify the system of the new locale for spellchecking
                                    ctx.updateInputLocale()

                                    // Display the new layout's name on the screen
                                    if (s.showToastOnLayoutSwitch.toBool()) {
                                        val layoutName = layout.keyboardDefinition.title
                                        val localeCode = layout.keyboardDefinition.locales?.firstOrNull() ?: ""
                                        val message = if (localeCode.isNotEmpty()) "$layoutName: $localeCode" else layoutName
                                        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                                    }
                                }
                            }
                        }
                    },
                    onCycleLocale = {
                        val locales = ctx.currentKeyboardDefinition?.locales ?: return@KeyboardScreen
                        if (locales.size > 0) {
                            currentLocaleIndex = (currentLocaleIndex + 1) % locales.size
                            val localeCode = locales[currentLocaleIndex]
                            ctx.setLocale(localeCode)

                            val layoutName = ctx.currentKeyboardDefinition?.title ?: ""
                            val message = if (localeCode.isNotEmpty()) "$layoutName: $localeCode" else localeCode
                            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                        }
                    },
                    onChangePosition = { f ->
                        ctx.lifecycleScope.launch {
                            val state = settingsState.value
                            state?.let { s ->
                                val nextPosition = f(KeyboardPosition.entries[s.position]).ordinal
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
