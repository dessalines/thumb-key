package com.dessalines.thumbkey

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.AbstractComposeView
import com.dessalines.thumbkey.ui.components.KeyboardScreen
import com.dessalines.thumbkey.ui.theme.MainTheme

class ComposeKeyboardView(context: Context) : AbstractComposeView(context) {

    @Composable
    override fun Content() {
        MainTheme {
            KeyboardScreen()
        }
    }
}
