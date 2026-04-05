package com.dessalines.thumbkey.ui.components.settings.other

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Keyboard
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.DEFAULT_SHOW_ON_SCREEN_KEYBOARD
import com.dessalines.thumbkey.db.OtherSettingsUpdate
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.toBool
import com.dessalines.thumbkey.utils.toInt
import me.zhanghai.compose.preference.ProvidePreferenceTheme
import me.zhanghai.compose.preference.SwitchPreference

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtherSettingsScreen(
    navController: NavController,
    appSettingsViewModel: AppSettingsViewModel,
) {
    Log.d(TAG, "Got to 'other' settings activity")

    val settings by appSettingsViewModel.appSettings.observeAsState()

    var showOnScreenKeyboardState =
        (settings?.showOnScreenKeyboard ?: DEFAULT_SHOW_ON_SCREEN_KEYBOARD).toBool()

    val snackbarHostState = remember { SnackbarHostState() }
    val scrollState = rememberScrollState()

    fun updateOtherSettings() {
        appSettingsViewModel.updateOtherSettings(
            OtherSettingsUpdate(
                id = 1,
                showOnScreenKeyboard = showOnScreenKeyboardState.toInt(),
            ),
        )
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(
                text = stringResource(R.string.other),
                navController = navController,
            )
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
                    SwitchPreference(
                        value = showOnScreenKeyboardState,
                        onValueChange = {
                            showOnScreenKeyboardState = it
                            updateOtherSettings()
                        },
                        title = {
                            Text(stringResource(R.string.show_on_screen_keyboard))
                        },
                        summary = {
                            Text(stringResource(R.string.show_on_screen_keyboard_description))
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Keyboard,
                                contentDescription = null,
                            )
                        },
                    )
                }
            }
        },
    )
}
