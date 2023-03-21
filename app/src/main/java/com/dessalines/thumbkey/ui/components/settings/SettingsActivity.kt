package com.dessalines.thumbkey.ui.components.settings

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.HelpCenter
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.InstallMobile
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.alorma.compose.settings.ui.SettingsMenuLink
import com.dessalines.thumbkey.R
import com.dessalines.thumbkey.ui.components.settings.about.userGuideLink
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.openLink

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsActivity(
    navController: NavController,
    thumbkeyEnabled: Boolean,
    thumbkeySelected: Boolean
) {
    Log.d(TAG, "Got to settings activity")

    val snackbarHostState = remember { SnackbarHostState() }
    val ctx = LocalContext.current

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(text = stringResource(R.string.app_name), navController = navController, showBack = false)
        },
        content = { padding ->
            Column(modifier = Modifier.padding(padding)) {
                if (!(thumbkeyEnabled || thumbkeySelected)) {
                    val setupStr = stringResource(R.string.setup)
                    SettingsMenuLink(
                        title = { Text(setupStr) },
                        icon = {
                            Icon(
                                imageVector = Icons.Outlined.InstallMobile,
                                contentDescription = setupStr
                            )
                        },
                        onClick = { navController.navigate("setup") }
                    )
                }
                val lookAndFeelStr = stringResource(R.string.look_and_feel)
                SettingsMenuLink(
                    title = { Text(lookAndFeelStr) },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Palette,
                            contentDescription = lookAndFeelStr
                        )
                    },
                    onClick = { navController.navigate("lookAndFeel") }
                )
                val userGuideStr = stringResource(R.string.user_guide)
                SettingsMenuLink(
                    title = { Text(userGuideStr) },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.HelpCenter,
                            contentDescription = userGuideStr
                        )
                    },
                    onClick = {
                        openLink(userGuideLink, ctx)
                    }
                )
                val aboutStr = stringResource(R.string.about)
                SettingsMenuLink(
                    title = { Text(aboutStr) },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Info,
                            contentDescription = aboutStr
                        )
                    },
                    onClick = { navController.navigate("about") }
                )
            }
        }
    )
}
