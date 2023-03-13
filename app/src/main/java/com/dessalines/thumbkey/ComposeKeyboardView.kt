package com.dessalines.thumbkey

import android.content.Context
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
