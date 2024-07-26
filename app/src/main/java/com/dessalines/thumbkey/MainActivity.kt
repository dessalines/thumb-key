package com.dessalines.thumbkey

import android.app.Application
import android.os.Bundle
import android.provider.Settings
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dessalines.thumbkey.db.AppDB
import com.dessalines.thumbkey.db.AppSettingsRepository
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.AppSettingsViewModelFactory
import com.dessalines.thumbkey.ui.components.common.ShowChangelog
import com.dessalines.thumbkey.ui.components.settings.SettingsActivity
import com.dessalines.thumbkey.ui.components.settings.about.AboutActivity
import com.dessalines.thumbkey.ui.components.settings.behavior.BehaviorActivity
import com.dessalines.thumbkey.ui.components.settings.lookandfeel.LookAndFeelActivity
import com.dessalines.thumbkey.ui.components.setup.SetupActivity
import com.dessalines.thumbkey.ui.theme.ThumbkeyTheme
import com.dessalines.thumbkey.utils.ANIMATION_SPEED
import com.dessalines.thumbkey.utils.getImeNames
import splitties.systemservices.inputMethodManager

class ThumbkeyApplication : Application() {
    private val database by lazy { AppDB.getDatabase(this) }
    val appSettingsRepository by lazy { AppSettingsRepository(database.appSettingsDao()) }
}

class MainActivity : AppCompatActivity() {
    private val appSettingsViewModel: AppSettingsViewModel by viewModels {
        AppSettingsViewModelFactory((application as ThumbkeyApplication).appSettingsRepository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            val settings by appSettingsViewModel.appSettings.observeAsState()
            val ctx = LocalContext.current
            val imeNames = ctx.getImeNames()

            val thumbkeyEnabled =
                inputMethodManager.enabledInputMethodList.any {
                    imeNames.contains(it.id)
                }
            val selectedName =
                Settings.Secure.getString(
                    ctx.contentResolver,
                    Settings.Secure.DEFAULT_INPUT_METHOD,
                )
            val thumbkeySelected = imeNames.contains(selectedName)

            val startDestination by remember {
                mutableStateOf(
                    if (!thumbkeyEnabled) {
                        "setup"
                    } else {
                        intent.extras?.getString("startRoute") ?: "settings"
                    },
                )
            }

            ThumbkeyTheme(
                settings = settings,
            ) {
                val navController = rememberNavController()

                if (startDestination == "settings") {
                    ShowChangelog(appSettingsViewModel = appSettingsViewModel)
                }

                NavHost(
                    navController = navController,
                    startDestination = startDestination,
                    enterTransition = {
                        slideIntoContainer(
                            towards = AnimatedContentTransitionScope.SlideDirection.Left,
                            animationSpec = tween(ANIMATION_SPEED),
                        )
                    },
                    exitTransition = {
                        slideOutOfContainer(
                            towards = AnimatedContentTransitionScope.SlideDirection.Left,
                            animationSpec = tween(ANIMATION_SPEED),
                        )
                    },
                    popEnterTransition = {
                        slideIntoContainer(
                            towards = AnimatedContentTransitionScope.SlideDirection.Right,
                            animationSpec = tween(ANIMATION_SPEED),
                        )
                    },
                    popExitTransition = {
                        slideOutOfContainer(
                            towards = AnimatedContentTransitionScope.SlideDirection.Right,
                            animationSpec = tween(ANIMATION_SPEED),
                        )
                    },
                ) {
                    composable(
                        route = "setup",
                    ) {
                        SetupActivity(
                            navController = navController,
                            thumbkeyEnabled = thumbkeyEnabled,
                            thumbkeySelected = thumbkeySelected,
                        )
                    }
                    composable(route = "settings") {
                        SettingsActivity(
                            navController = navController,
                            appSettingsViewModel = appSettingsViewModel,
                            thumbkeyEnabled = thumbkeyEnabled,
                            thumbkeySelected = thumbkeySelected,
                        )
                    }
                    composable(route = "lookAndFeel") {
                        LookAndFeelActivity(
                            navController = navController,
                            appSettingsViewModel = appSettingsViewModel,
                        )
                    }
                    composable(route = "behavior") {
                        BehaviorActivity(
                            navController = navController,
                            appSettingsViewModel = appSettingsViewModel,
                        )
                    }
                    composable(
                        route = "about",
                    ) {
                        AboutActivity(
                            navController = navController,
                        )
                    }
                }
            }
        }
    }
}
