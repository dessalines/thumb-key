package com.dessalines.thumbkey

import android.app.Application
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dessalines.thumbkey.db.AppDB
import com.dessalines.thumbkey.db.AppSettingsRepository
import com.dessalines.thumbkey.db.AppSettingsViewModel
import com.dessalines.thumbkey.db.AppSettingsViewModelFactory
import com.dessalines.thumbkey.ui.components.settings.SettingsActivity
import com.dessalines.thumbkey.ui.components.settings.lookandfeel.LookAndFeelActivity
import com.dessalines.thumbkey.ui.components.setup.SetupActivity
import com.dessalines.thumbkey.ui.theme.ThumbkeyTheme

class ThumbkeyApplication : Application() {
    private val database by lazy { AppDB.getDatabase(this) }
    val appSettingsRepository by lazy { AppSettingsRepository(database.appSettingsDao()) }
}

class MainActivity : AppCompatActivity() {

    private val appSettingsViewModel: AppSettingsViewModel by viewModels {
        AppSettingsViewModelFactory((application as ThumbkeyApplication).appSettingsRepository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val settings by appSettingsViewModel.appSettings.observeAsState()

            ThumbkeyTheme(
                settings = settings
            ) {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "settings" // TODO
                ) {
                    composable(
                        route = "setup"
                    ) {
                        SetupActivity(navController = navController)
                    }
                    composable(route = "settings") {
                        SettingsActivity(navController = navController)
                    }
                    composable(route = "lookAndFeel") {
                        LookAndFeelActivity(
                            navController = navController,
                            appSettingsViewModel = appSettingsViewModel
                        )
                    }
                    composable(
                        route = "about"
                    ) {
                        //                        AboutActivity( 
                        //                            navController = navController
                        //                        )
                    }
                }
            }
        }
    }
}
