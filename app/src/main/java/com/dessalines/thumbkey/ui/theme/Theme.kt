package com.dessalines.thumbkey.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun MainTheme(
    content: @Composable () -> Unit
) {
    val ctx = LocalContext.current
    val android12OrLater = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

    // Dynamic schemes crash on lower than android 12
    val dynamicPair = if (android12OrLater) {
        Pair(dynamicLightColorScheme(ctx), dynamicDarkColorScheme(ctx))
    } else {
        pink()
    }

    val systemTheme = if (!isSystemInDarkTheme()) {
        dynamicPair.first
    } else {
        dynamicPair.second
    }

    MaterialTheme(
        colorScheme = systemTheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
