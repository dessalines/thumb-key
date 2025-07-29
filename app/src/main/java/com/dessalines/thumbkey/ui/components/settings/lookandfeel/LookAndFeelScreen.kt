package com.dessalines.thumbkey.ui.components.settings.lookandfeel

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Animation
import androidx.compose.material.icons.outlined.BorderBottom
import androidx.compose.material.icons.outlined.BorderOuter
import androidx.compose.material.icons.outlined.Colorize
import androidx.compose.material.icons.outlined.Crop75
import androidx.compose.material.icons.outlined.FormatSize
import androidx.compose.material.icons.outlined.Fullscreen
import androidx.compose.material.icons.outlined.HideImage
import androidx.compose.material.icons.outlined.LinearScale
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.MusicNote
import androidx.compose.material.icons.outlined.Padding
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.material.icons.outlined.RoundedCorner
import androidx.compose.material.icons.outlined.VerticalAlignTop
import androidx.compose.material.icons.outlined.Vibration
import androidx.compose.material.icons.outlined.ViewDay
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.WebAssetOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.navigation.NavController
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_HELPER_SPEED
import com.dessalines.thumbkey.db.DEFAULT_ANIMATION_SPEED
import com.dessalines.thumbkey.db.DEFAULT_AUTO_SIZE_KEYS
import com.dessalines.thumbkey.db.DEFAULT_BACKDROP_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_DISABLE_FULLSCREEN_EDITOR
import com.dessalines.thumbkey.db.DEFAULT_HIDE_LETTERS
import com.dessalines.thumbkey.db.DEFAULT_HIDE_SYMBOLS
import com.dessalines.thumbkey.db.DEFAULT_IGNORE_BOTTOM_PADDING
import com.dessalines.thumbkey.db.DEFAULT_KEY_BORDER_WIDTH
import com.dessalines.thumbkey.db.DEFAULT_KEY_HEIGHT
import com.dessalines.thumbkey.db.DEFAULT_KEY_PADDING
import com.dessalines.thumbkey.db.DEFAULT_KEY_RADIUS
import com.dessalines.thumbkey.db.DEFAULT_KEY_WIDTH
import com.dessalines.thumbkey.db.DEFAULT_NON_SQUARE_KEYS
import com.dessalines.thumbkey.db.DEFAULT_POSITION
import com.dessalines.thumbkey.db.DEFAULT_PUSHUP_SIZE
import com.dessalines.thumbkey.db.DEFAULT_SHOW_TOAST_ON_LAYOUT_SWITCH
import com.dessalines.thumbkey.db.DEFAULT_SOUND_ON_TAP
import com.dessalines.thumbkey.db.DEFAULT_THEME
import com.dessalines.thumbkey.db.DEFAULT_THEME_COLOR
import com.dessalines.thumbkey.db.DEFAULT_VIBRATE_ON_TAP
import com.dessalines.thumbkey.db.LookAndFeelUpdate
import com.dessalines.thumbkey.ui.components.common.TestOutTextField
import com.dessalines.thumbkey.ui.components.settings.about.SettingsDivider
import com.dessalines.thumbkey.utils.KeyboardPosition
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.ThemeColor
import com.dessalines.thumbkey.utils.ThemeMode
import com.dessalines.thumbkey.utils.toBool
import com.dessalines.thumbkey.utils.toInt
import me.zhanghai.compose.preference.ListPreference
import me.zhanghai.compose.preference.ListPreferenceType
import me.zhanghai.compose.preference.ProvidePreferenceTheme
import me.zhanghai.compose.preference.SliderPreference
import me.zhanghai.compose.preference.SwitchPreference

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LookAndFeelScreen(
    navController: NavController,
    appSettingsViewModel: AppSettingsViewModel,
) {
    Log.d(TAG, "Got to lookAndFeel activity")

    val settings by appSettingsViewModel.appSettings.observeAsState()
    var themeState = ThemeMode.entries[settings?.theme ?: DEFAULT_THEME]
    var themeColorState = ThemeColor.entries[settings?.themeColor ?: DEFAULT_THEME_COLOR]
    var autoSizeKeysState = (settings?.autoSizeKeys ?: DEFAULT_AUTO_SIZE_KEYS).toBool()
    var nonSquareKeysState = (settings?.nonSquareKeys ?: DEFAULT_NON_SQUARE_KEYS).toBool()
    var keyHeightState = (settings?.keyHeight ?: DEFAULT_KEY_HEIGHT).toFloat()
    var keyHeightSliderState by remember { mutableFloatStateOf(keyHeightState) }
    var keyWidthState = (settings?.keyWidth ?: DEFAULT_KEY_WIDTH).toFloat()
    var keyWidthSliderState by remember { mutableFloatStateOf(keyWidthState) }

    var pushupSizeState = (settings?.pushupSize ?: DEFAULT_PUSHUP_SIZE).toFloat()
    var pushupSizeSliderState by remember { mutableFloatStateOf(pushupSizeState) }

    var animationSpeedState = (settings?.animationSpeed ?: DEFAULT_ANIMATION_SPEED).toFloat()
    var animationSpeedSliderState by remember { mutableFloatStateOf(animationSpeedState) }

    var animationHelperSpeedState = (settings?.animationHelperSpeed ?: DEFAULT_ANIMATION_HELPER_SPEED).toFloat()
    var animationHelperSpeedSliderState by remember { mutableFloatStateOf(animationHelperSpeedState) }

    var keyPaddingState = (settings?.keyPadding ?: DEFAULT_KEY_PADDING).toFloat()
    var keyPaddingSliderState by remember { mutableFloatStateOf(keyPaddingState) }

    var keyBorderWidthState = (settings?.keyBorderWidth ?: DEFAULT_KEY_BORDER_WIDTH).toFloat()
    var keyBorderWidthSliderState by remember { mutableFloatStateOf(keyBorderWidthState) }

    var keyRadiusState = (settings?.keyRadius ?: DEFAULT_KEY_RADIUS).toFloat()
    var keyRadiusSliderState by remember { mutableFloatStateOf(keyRadiusState) }

    var positionState = KeyboardPosition.entries[settings?.position ?: DEFAULT_POSITION]

    var vibrateOnTapState = (settings?.vibrateOnTap ?: DEFAULT_VIBRATE_ON_TAP).toBool()
    var soundOnTapState = (settings?.soundOnTap ?: DEFAULT_SOUND_ON_TAP).toBool()
    var hideLettersState = (settings?.hideLetters ?: DEFAULT_HIDE_LETTERS).toBool()
    var hideSymbolsState = (settings?.hideSymbols ?: DEFAULT_HIDE_SYMBOLS).toBool()
    var ignoreBottomPaddingState = (settings?.ignoreBottomPadding ?: DEFAULT_IGNORE_BOTTOM_PADDING).toBool()
    var showToastOnLayoutSwitchState = (settings?.showToastOnLayoutSwitch ?: DEFAULT_SHOW_TOAST_ON_LAYOUT_SWITCH).toBool()

    var backdropEnabledState = (settings?.backdropEnabled ?: DEFAULT_BACKDROP_ENABLED).toBool()

    var disableFullscreenEditorState = (settings?.disableFullscreenEditor ?: DEFAULT_DISABLE_FULLSCREEN_EDITOR).toBool()

    fun updateLookAndFeel() {
        appSettingsViewModel.updateLookAndFeel(
            LookAndFeelUpdate(
                id = 1,
                pushupSize = pushupSizeState.toInt(),
                animationSpeed = animationSpeedState.toInt(),
                animationHelperSpeed = animationHelperSpeedState.toInt(),
                position = positionState.ordinal,
                vibrateOnTap = vibrateOnTapState.toInt(),
                soundOnTap = soundOnTapState.toInt(),
                hideLetters = hideLettersState.toInt(),
                hideSymbols = hideSymbolsState.toInt(),
                ignoreBottomPadding = ignoreBottomPaddingState.toInt(),
                theme = themeState.ordinal,
                themeColor = themeColorState.ordinal,
                backdropEnabled = backdropEnabledState.toInt(),
                keyPadding = keyPaddingState.toInt(),
                keyBorderWidth = keyBorderWidthState.toInt(),
                keyRadius = keyRadiusState.toInt(),
                autoSizeKeys = autoSizeKeysState.toInt(),
                nonSquareKeys = nonSquareKeysState.toInt(),
                keyWidth = keyWidthState.toInt(),
                keyHeight = keyHeightState.toInt(),
                showToastOnLayoutSwitch = showToastOnLayoutSwitchState.toInt(),
                disableFullscreenEditor = disableFullscreenEditorState.toInt(),
            ),
        )
    }

    val ctx = LocalContext.current

    val snackbarHostState = remember { SnackbarHostState() }

    val scrollState = rememberScrollState()

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(text = stringResource(R.string.look_and_feel), navController = navController)
        },
        content = { padding ->
            Column(
                modifier =
                    Modifier
                        .padding(padding)
                        .verticalScroll(scrollState)
                        .background(color = MaterialTheme.colorScheme.surface)
                        .imePadding(),
            ) {
                ProvidePreferenceTheme {
                    ListPreference(
                        type = ListPreferenceType.DROPDOWN_MENU,
                        value = themeState,
                        onValueChange = {
                            themeState = it
                            updateLookAndFeel()
                        },
                        values = ThemeMode.entries,
                        valueToText = {
                            AnnotatedString(ctx.getString(it.resId))
                        },
                        title = {
                            Text(stringResource(R.string.theme))
                        },
                        summary = {
                            Text(stringResource(themeState.resId))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Palette,
                                contentDescription = null,
                            )
                        },
                    )

                    ListPreference(
                        type = ListPreferenceType.DROPDOWN_MENU,
                        value = themeColorState,
                        onValueChange = {
                            themeColorState = it
                            updateLookAndFeel()
                        },
                        values = ThemeColor.entries,
                        valueToText = {
                            AnnotatedString(ctx.getString(it.resId))
                        },
                        title = {
                            Text(stringResource(R.string.theme_color))
                        },
                        summary = {
                            Text(stringResource(themeColorState.resId))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Colorize,
                                contentDescription = null,
                            )
                        },
                    )

                    ListPreference(
                        type = ListPreferenceType.DROPDOWN_MENU,
                        value = positionState,
                        onValueChange = {
                            positionState = it
                            updateLookAndFeel()
                        },
                        values = KeyboardPosition.entries,
                        valueToText = {
                            AnnotatedString(ctx.getString(it.resId))
                        },
                        summary = {
                            Text(stringResource(positionState.resId))
                        },
                        title = {
                            Text(stringResource(R.string.position))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.LinearScale,
                                contentDescription = null,
                            )
                        },
                    )

                    SwitchPreference(
                        value = hideLettersState,
                        onValueChange = {
                            hideLettersState = it
                            updateLookAndFeel()
                        },
                        title = {
                            Text(stringResource(R.string.hide_letters))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.HideImage,
                                contentDescription = null,
                            )
                        },
                    )

                    SwitchPreference(
                        value = hideSymbolsState,
                        onValueChange = {
                            hideSymbolsState = it
                            updateLookAndFeel()
                        },
                        title = {
                            Text(stringResource(R.string.hide_symbols))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.HideImage,
                                contentDescription = null,
                            )
                        },
                    )
                    SwitchPreference(
                        value = backdropEnabledState,
                        onValueChange = {
                            backdropEnabledState = it
                            updateLookAndFeel()
                        },
                        title = {
                            Text(stringResource(R.string.backdrop))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.ViewDay,
                                contentDescription = null,
                            )
                        },
                    )

                    SwitchPreference(
                        value = ignoreBottomPaddingState,
                        onValueChange = {
                            ignoreBottomPaddingState = it
                            updateLookAndFeel()
                        },
                        title = {
                            Text(stringResource(R.string.ignore_bottom_padding))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.BorderBottom,
                                contentDescription = null,
                            )
                        },
                    )

                    SwitchPreference(
                        value = showToastOnLayoutSwitchState,
                        onValueChange = {
                            showToastOnLayoutSwitchState = it
                            updateLookAndFeel()
                        },
                        title = {
                            Text(stringResource(R.string.show_toast_on_layout_switch))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Mail,
                                contentDescription = null,
                            )
                        },
                    )
                    SwitchPreference(
                        value = disableFullscreenEditorState,
                        onValueChange = {
                            disableFullscreenEditorState = it
                            updateLookAndFeel()
                        },
                        title = {
                            Text(stringResource(R.string.disable_fullscreen_editor))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.WebAssetOff,
                                contentDescription = null,
                            )
                        },
                    )

                    SwitchPreference(
                        value = autoSizeKeysState,
                        onValueChange = {
                            autoSizeKeysState = it
                            updateLookAndFeel()
                        },
                        title = {
                            Text(stringResource(R.string.auto_size_keys))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Fullscreen,
                                contentDescription = null,
                            )
                        },
                    )

                    if (!autoSizeKeysState) {
                        SliderPreference(
                            value = keyWidthState,
                            sliderValue = keyWidthSliderState,
                            onValueChange = {
                                keyWidthState = it
                                updateLookAndFeel()
                            },
                            onSliderValueChange = {
                                keyWidthSliderState = it
                            },
                            valueRange = 10f..200f,
                            title = {
                                val keyHeightStr =
                                    stringResource(
                                        if (nonSquareKeysState) R.string.key_width else R.string.key_size,
                                        keyWidthSliderState.toInt().toString(),
                                    )
                                Text(keyHeightStr)
                            },
                            icon = {
                                Icon(
                                    imageVector = Icons.Outlined.FormatSize,
                                    contentDescription = null,
                                )
                            },
                        )
                    }

                    SwitchPreference(
                        value = nonSquareKeysState,
                        onValueChange = {
                            nonSquareKeysState = it
                            updateLookAndFeel()
                        },
                        title = {
                            Text(stringResource(R.string.key_non_square))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Crop75,
                                contentDescription = null,
                            )
                        },
                    )

                    if (nonSquareKeysState) {
                        SliderPreference(
                            value = keyHeightState,
                            sliderValue = keyHeightSliderState,
                            onValueChange = {
                                keyHeightState = it
                                updateLookAndFeel()
                            },
                            onSliderValueChange = {
                                keyHeightSliderState = it
                            },
                            valueRange = 10f..200f,
                            title = {
                                val keyHeightStr =
                                    stringResource(
                                        R.string.key_height,
                                        keyHeightSliderState.toInt().toString(),
                                    )
                                Text(keyHeightStr)
                            },
                            icon = {
                                Icon(
                                    imageVector = Icons.Outlined.Crop75,
                                    contentDescription = null,
                                )
                            },
                        )
                    }

                    SliderPreference(
                        value = keyPaddingState,
                        sliderValue = keyPaddingSliderState,
                        onValueChange = {
                            keyPaddingState = it
                            updateLookAndFeel()
                        },
                        onSliderValueChange = { keyPaddingSliderState = it },
                        valueRange = 0f..10f,
                        title = {
                            val keyPaddingStr = stringResource(R.string.key_padding, keyPaddingSliderState.toInt().toString())
                            Text(keyPaddingStr)
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Padding,
                                contentDescription = null,
                            )
                        },
                    )
                    SliderPreference(
                        value = keyBorderWidthState,
                        sliderValue = keyBorderWidthSliderState,
                        onValueChange = {
                            keyBorderWidthState = it
                            updateLookAndFeel()
                        },
                        onSliderValueChange = { keyBorderWidthSliderState = it },
                        valueRange = 0f..50f,
                        title = {
                            val keyBorderWidthStr = stringResource(R.string.key_border_width, keyBorderWidthSliderState.toInt().toString())
                            Text(keyBorderWidthStr)
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.BorderOuter,
                                contentDescription = null,
                            )
                        },
                    )
                    SliderPreference(
                        value = keyRadiusState,
                        sliderValue = keyRadiusSliderState,
                        onValueChange = {
                            keyRadiusState = it
                            updateLookAndFeel()
                        },
                        onSliderValueChange = { keyRadiusSliderState = it },
                        valueRange = 0f..100f,
                        title = {
                            val keyRadiusStr = stringResource(R.string.key_radius, keyRadiusSliderState.toInt().toString())
                            Text(keyRadiusStr)
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.RoundedCorner,
                                contentDescription = null,
                            )
                        },
                    )
                    SliderPreference(
                        value = pushupSizeState,
                        sliderValue = pushupSizeSliderState,
                        onValueChange = {
                            pushupSizeState = it
                            updateLookAndFeel()
                        },
                        onSliderValueChange = { pushupSizeSliderState = it },
                        valueRange = 0f..200f,
                        title = {
                            val bottomOffsetStr = stringResource(R.string.bottom_offset, pushupSizeSliderState.toInt().toString())
                            Text(bottomOffsetStr)
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.VerticalAlignTop,
                                contentDescription = null,
                            )
                        },
                    )
                    SliderPreference(
                        value = animationSpeedState,
                        sliderValue = animationSpeedSliderState,
                        onValueChange = {
                            animationSpeedState = it
                            updateLookAndFeel()
                        },
                        onSliderValueChange = { animationSpeedSliderState = it },
                        valueRange = 0f..500f,
                        title = {
                            val animationSpeedStr = stringResource(R.string.animation_speed, animationSpeedSliderState.toInt().toString())
                            Text(animationSpeedStr)
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Animation,
                                contentDescription = null,
                            )
                        },
                    )
                    SliderPreference(
                        value = animationHelperSpeedState,
                        sliderValue = animationHelperSpeedSliderState,
                        onValueChange = {
                            animationHelperSpeedState = it
                            updateLookAndFeel()
                        },
                        onSliderValueChange = { animationHelperSpeedSliderState = it },
                        valueRange = 0f..500f,
                        title = {
                            val animationHelperSpeedStr =
                                stringResource(
                                    R.string.animation_helper_speed,
                                    animationHelperSpeedSliderState
                                        .toInt()
                                        .toString(),
                                )
                            Text(animationHelperSpeedStr)
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Visibility,
                                contentDescription = null,
                            )
                        },
                    )
                    SettingsDivider()
                    SwitchPreference(
                        value = vibrateOnTapState,
                        onValueChange = {
                            vibrateOnTapState = it
                            updateLookAndFeel()
                        },
                        title = {
                            Text(stringResource(R.string.vibrate_on_tap))
                        },
                        summary = {
                            Text(stringResource(R.string.vibrate_warning))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Vibration,
                                contentDescription = null,
                            )
                        },
                    )
                    SwitchPreference(
                        value = soundOnTapState,
                        onValueChange = {
                            soundOnTapState = it
                            updateLookAndFeel()
                        },
                        title = {
                            Text(stringResource(R.string.play_sound_on_tap))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.MusicNote,
                                contentDescription = null,
                            )
                        },
                    )
                    SettingsDivider()
                    TestOutTextField()
                }
            }
        },
    )
}
