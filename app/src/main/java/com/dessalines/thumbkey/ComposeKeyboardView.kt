package com.dessalines.thumbkey

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.AbstractComposeView
import androidx.lifecycle.LiveData
import com.dessalines.thumbkey.db.AppSettings
import com.dessalines.thumbkey.ui.components.keyboard.KeyboardScreen
import com.dessalines.thumbkey.ui.theme.ThumbkeyTheme
import com.dessalines.thumbkey.utils.KeyboardMode

@SuppressLint("ViewConstructor")
class ComposeKeyboardView(
    context: Context,
    private val liveSettings: LiveData<AppSettings>,
    private val startMode: (AppSettings) -> KeyboardMode
) :
    AbstractComposeView
    (context) {

    @Composable
    override fun Content() {
        val settings = liveSettings.observeAsState().value

        ThumbkeyTheme(
            settings = settings
        ) {
            KeyboardScreen(settings, startMode(settings as AppSettings))
        }
    }
}
