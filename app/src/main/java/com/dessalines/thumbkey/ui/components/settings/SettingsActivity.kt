package com.dessalines.thumbkey.ui.components.settings

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
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
import androidx.navigation.NavController
import com.alorma.compose.settings.ui.SettingsMenuLink
import com.dessalines.thumbkey.utils.SimpleTopAppBar
import com.dessalines.thumbkey.utils.TAG

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsActivity(
    navController: NavController
) {
    Log.d(TAG, "Got to settings activity")

    val snackbarHostState = remember { SnackbarHostState() }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        topBar = {
            SimpleTopAppBar(text = "Thumb-Key", navController = navController, showBack = false)
        },
        content = { padding ->
            Column(modifier = Modifier.padding(padding)) {
                SettingsMenuLink(
                    title = { Text("Setup") },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.InstallMobile,
                            contentDescription = "TODO"
                        )
                    },
                    onClick = { navController.navigate("setup") }
                )

                SettingsMenuLink(
                    title = { Text("Look and feel") },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Palette,
                            contentDescription = "TODO"
                        )
                    },
                    onClick = { navController.navigate("lookAndFeel") }
                )
                SettingsMenuLink(
                    title = { Text("About") },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Info,
                            contentDescription = "TODO"
                        )
                    },
                    onClick = { navController.navigate("about") }
                )
            }
        }
    )
}
