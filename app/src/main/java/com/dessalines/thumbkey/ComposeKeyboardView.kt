package com.dessalines.thumbkey

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.AbstractComposeView
import androidx.lifecycle.lifecycleScope
import com.dessalines.thumbkey.db.AppSettingsRepository
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.db.EnabledInternalKeyboardLayout
import com.dessalines.thumbkey.db.ExternalKeyboardLayout
import com.dessalines.thumbkey.ui.components.keyboard.KeyboardScreen
import com.dessalines.thumbkey.ui.theme.ThumbkeyTheme
import com.dessalines.thumbkey.utils.getEnabledKeyboardLayouts
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
        val settings by settingsRepo.appSettings.observeAsState()
        val ctx = context as IMEService

        ThumbkeyTheme(
            settings = (settings ?: return).appSettings,
        ) {
            KeyboardScreen(
                settings = settings,
                onSwitchLanguage = {
                    ctx.lifecycleScope.launch {
                        // Cycle to the next keyboard
                        // TODO ugly code but it works
                        val layouts = getEnabledKeyboardLayouts(settings, settingsRepo.enabledExternalKeyboardLayouts.value, settingsRepo.enabledInternalKeyboardLayouts.value).sortedBy { it.second.title }
                        val index = layouts.indexOfFirst { layout ->
                            layout.first == (settings!!.externalKeyboardLayout ?: EnabledInternalKeyboardLayout(settings!!.appSettings.keyboardLayoutInternal ?: DEFAULT_KEYBOARD_LAYOUT))
                        }
                        val newLayout = layouts[(index + 1).mod(layouts.size)]
                        val newSettings = (newLayout.first as? EnabledInternalKeyboardLayout)?.let {
                            settings!!.appSettings.copy(keyboardLayoutInternal = it.internalId)
                        } ?: run {
                            settings!!.appSettings.copy(keyboardLayoutExternal = (newLayout.first as ExternalKeyboardLayout).id)
                        }
                        settingsRepo.update(newSettings)
                        // Display the new layout's name on the screen
                        Toast.makeText(context, newLayout.second.title, Toast.LENGTH_SHORT).show()
                    }
                },
                onSwitchPosition = {
                    ctx.lifecycleScope.launch {
                        // Cycle to the next position
                        val nextPosition = (settings!!.appSettings.position + 1).mod(3)
                        val newSettings = settings!!.appSettings.copy(position = nextPosition)
                        settingsRepo.update(newSettings)
                    }
                },
            )
        }
    }
}
