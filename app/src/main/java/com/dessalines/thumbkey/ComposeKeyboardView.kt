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

@SuppressLint("ViewConstructor")
class ComposeKeyboardView(context: Context, private val liveSettings: LiveData<AppSettings>) :
    AbstractComposeView
    (context) {

    @Composable
    override fun Content() {
        val settings = liveSettings.observeAsState().value

        ThumbkeyTheme(
            settings = settings
        ) {
            KeyboardScreen(settings)
        }
    }
}
