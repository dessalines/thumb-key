package com.dessalines.thumbkey.ui.components.settings

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.HelpCenter
import androidx.compose.material.icons.outlined.AppRegistration
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.InstallMobile
import androidx.compose.material.icons.outlined.KeyboardAlt
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.material.icons.outlined.Restore
import androidx.compose.material.icons.outlined.TouchApp
import androidx.compose.material3.CenterAlignedTopAppBar
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.navigation.NavController
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.DEFAULT_KEYBOARD_LAYOUT
import com.dessalines.thumbkey.ui.components.common.TestOutTextField
import com.dessalines.thumbkey.ui.components.settings.about.SettingsDivider
import com.dessalines.thumbkey.ui.components.settings.about.USER_GUIDE_URL
import com.dessalines.thumbkey.utils.KeyboardLayout
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.keyboardLayoutsSetFromDbIndexString
import com.dessalines.thumbkey.utils.openLink
import com.dessalines.thumbkey.utils.updateLayouts
import me.zhanghai.compose.preference.MultiSelectListPreference
import me.zhanghai.compose.preference.Preference
import me.zhanghai.compose.preference.ProvidePreferenceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    navController: NavController,
    appSettingsViewModel: AppSettingsViewModel,
    thumbkeyEnabled: Boolean,
    thumbkeySelected: Boolean,
) {
    Log.d(TAG, "Got to settings activity")

    val snackbarHostState = remember { SnackbarHostState() }
    val ctx = LocalContext.current

    val settings by appSettingsViewModel.appSettings.observeAsState()

    val scrollState = rememberScrollState()

    val layoutsState = keyboardLayoutsSetFromDbIndexString(settings?.keyboardLayouts)

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(stringResource(R.string.app_name)) },
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
                    if (!(thumbkeyEnabled || thumbkeySelected)) {
                        Preference(
                            title = {
                                val setupStr = stringResource(R.string.setup)
                                Text(setupStr)
                            },
                            icon = {
                                Icon(
                                    imageVector = Icons.Outlined.InstallMobile,
                                    contentDescription = null,
                                )
                            },
                            onClick = { navController.navigate("setup") },
                        )
                    }

                    MultiSelectListPreference(
                        value = layoutsState,
                        values = KeyboardLayout.entries.sortedBy { it.keyboardDefinition.title },
                        valueToText = {
                            AnnotatedString(it.keyboardDefinition.title)
                        },
                        onValueChange = {
                            val update =
                                it.ifEmpty {
                                    keyboardLayoutsSetFromDbIndexString(DEFAULT_KEYBOARD_LAYOUT.toString())
                                }

                            updateLayouts(
                                appSettingsViewModel,
                                update,
                            )
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.KeyboardAlt,
                                contentDescription = null,
                            )
                        },
                        title = {
                            Text(stringResource(R.string.layouts))
                        },
                        summary = {
                            val layoutsStr =
                                layoutsState.joinToString(", ") { it.keyboardDefinition.title }
                            Text(layoutsStr)
                        },
                    )
                    Preference(
                        title = { Text(stringResource(R.string.look_and_feel)) },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Palette,
                                contentDescription = null,
                            )
                        },
                        onClick = { navController.navigate("lookAndFeel") },
                    )
                    Preference(
                        title = { Text(stringResource(R.string.behavior)) },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.TouchApp,
                                contentDescription = null,
                            )
                        },
                        onClick = { navController.navigate("behavior") },
                    )
                    Preference(
                        title = {
                            Text(
                                text = stringResource(R.string.modify_keys),
                            )
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.AppRegistration,
                                contentDescription = null,
                            )
                        },
                        onClick = { navController.navigate("modifyKeys") },
                    )
                    Preference(
                        title = { Text(stringResource(R.string.backup_and_restore)) },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Restore,
                                contentDescription = null,
                            )
                        },
                        onClick = { navController.navigate("backupAndRestore") },
                    )
                    Preference(
                        title = { Text(stringResource(R.string.user_guide)) },
                        icon = {
                            Icon(
                                imageVector = Icons.AutoMirrored.Outlined.HelpCenter,
                                contentDescription = null,
                            )
                        },
                        onClick = {
                            openLink(USER_GUIDE_URL, ctx)
                        },
                    )
                    Preference(
                        title = { Text(stringResource(R.string.about)) },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.Info,
                                contentDescription = null,
                            )
                        },
                        onClick = { navController.navigate("about") },
                    )
                    SettingsDivider()
                    TestOutTextField()
                }
            }
        },
    )
}
