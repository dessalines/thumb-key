package com.dessalines.thumbkey.utils

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType

@Composable
fun colorVariantToColor(colorVariant: ColorVariant): Color {
    return when (colorVariant) {
        ColorVariant.SURFACE -> MaterialTheme.colorScheme.surface
        ColorVariant.SURFACE_VARIANT -> MaterialTheme.colorScheme.surfaceVariant
        ColorVariant.PRIMARY -> MaterialTheme.colorScheme.primary
        ColorVariant.SECONDARY -> MaterialTheme.colorScheme.secondary // TODO this is never used?
        ColorVariant.MUTED -> MaterialTheme.colorScheme.secondary.copy(alpha = 0.5F)
    }
}

@OptIn(ExperimentalUnitApi::class)
fun fontSizeVariantToFontSize(fontSizeVariant: FontSizeVariant, keySize: Dp): TextUnit {
    val divFactor = when (fontSizeVariant) {
        FontSizeVariant.LARGE -> 2.5f
        FontSizeVariant.SMALL -> 5f
    }
    return TextUnit(keySize.value / divFactor, TextUnitType.Sp)
}
