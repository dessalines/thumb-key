package com.dessalines.thumbkey

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.AbstractComposeView
import androidx.lifecycle.lifecycleScope
import com.dessalines.thumbkey.db.AppSettingsRepository
import com.dessalines.thumbkey.ui.components.keyboard.KeyboardScreen
import com.dessalines.thumbkey.ui.theme.ThumbkeyTheme
import com.dessalines.thumbkey.utils.KeyboardLayout
import com.dessalines.thumbkey.utils.keyboardLayoutsSetFromString
import kotlinx.coroutines.launch

@SuppressLint("ViewConstructor")
class ComposeKeyboardView(
    context: Context,
    private val settingsRepo: AppSettingsRepository,
) :
    AbstractComposeView
        (context) {

    @Composable
    override fun Content() {
        val settingsState = settingsRepo.appSettings.observeAsState()
        val settings = settingsState.value
        val ctx = context as IMEService

        ThumbkeyTheme(
            settings = settings,
        ) {
            KeyboardScreen(
                settings = settings,
                onSwitchLanguage = {
                    ctx.lifecycleScope.launch {
                        // Cycle to the next keyboard
                        val s = settingsState.value!!
                        val layouts = keyboardLayoutsSetFromString(s.keyboardLayouts).toList()
                        val currentLayout = s.keyboardLayout
                        val index = layouts.indexOf(currentLayout)
                        val nextIndex = (index + 1).mod(layouts.size)
                        val nextLayout = layouts.getOrNull(nextIndex)
                        nextLayout?.let { layout ->
                            val s2 = s.copy(keyboardLayout = layout)
                            settingsRepo.update(s2)

                            // Display the new layout's name on the screen
                            val layoutName = KeyboardLayout.entries.find { it.index == nextLayout }?.keyboardDefinition!!.title
                            Toast.makeText(context, "$layoutName", Toast.LENGTH_SHORT).show()
                        }
                    }
                },
                onSwitchPosition = {
                    ctx.lifecycleScope.launch {
                        // Cycle to the next position
                        val s = settingsState.value!!
                        val nextPosition = (s.position + 1).mod(3)
                        val s2 = s.copy(position = nextPosition)
                        settingsRepo.update(s2)
                    }
                },
            )
        }
    }
}
