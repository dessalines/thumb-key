package com.dessalines.thumbkey.ui.theme

import android.content.Context
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.dessalines.thumbkey.db.AppSettings
import com.dessalines.thumbkey.utils.ThemeColor
import com.dessalines.thumbkey.utils.ThemeMode

@Composable
fun ThumbkeyTheme(
    settings: AppSettings?,
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = thumbkeyColorScheme(LocalContext.current, settings, isSystemInDarkTheme()),
        typography = Typography,
        shapes = Shapes,
        content = content,
    )
}

/** The colors of the theme in the settings, also for views outside Compose. */
fun thumbkeyColorScheme(
    ctx: Context,
    settings: AppSettings?,
    systemInDarkTheme: Boolean,
): ColorScheme {
    val themeMode = ThemeMode.entries[settings?.theme ?: 0]
    val themeColor = ThemeColor.entries[settings?.themeColor ?: 0]

    val android12OrLater = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

    // Dynamic schemes crash on lower than android 12
    val dynamicPair =
        if (android12OrLater) {
            Pair(dynamicLightColorScheme(ctx), dynamicDarkColorScheme(ctx))
        } else {
            pink()
        }

    val colorPair =
        when (themeColor) {
            ThemeColor.Dynamic -> dynamicPair
            ThemeColor.Green -> green()
            ThemeColor.Pink -> pink()
            ThemeColor.Matrix -> matrix()
            ThemeColor.Srcery -> srcery()
            ThemeColor.Blue -> blue()
            ThemeColor.Dracula -> dracula()
            ThemeColor.Twilight -> twilight()
            ThemeColor.HighContrast -> highContrast()
            ThemeColor.HighContrastColorful -> highContrastColorful()
            ThemeColor.Ancom -> ancom()
            ThemeColor.Neon -> neon()
            ThemeColor.Magma -> magma()
        }

    val systemTheme =
        if (!systemInDarkTheme) {
            colorPair.first
        } else {
            colorPair.second
        }

    return when (themeMode) {
        ThemeMode.System -> systemTheme
        ThemeMode.Light -> colorPair.first
        ThemeMode.Dark -> colorPair.second
    }
}
