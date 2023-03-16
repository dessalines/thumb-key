package com.dessalines.thumbkey.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase.CONFLICT_IGNORE
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.launch
import java.util.concurrent.Executors

const val DEFAULT_KEY_SIZE = 64
const val DEFAULT_ANIMATION_SPEED = 250
const val DEFAULT_ANIMATION_HELPER_SPEED = 250
const val DEFAULT_POSITION = 0
const val DEFAULT_AUTO_CAPITALIZE = 1
const val DEFAULT_KEYBOARD_LAYOUT = 0
const val DEFAULT_THEME = 0
const val DEFAULT_THEME_COLOR = 0

const val UPDATE_APP_CHANGELOG_UNVIEWED = "UPDATE AppSettings SET viewed_changelog = 0"

@Entity
data class AppSettings(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(
        name = "key_size",
        defaultValue = DEFAULT_KEY_SIZE.toString()
    )
    val keySize: Int,
    @ColumnInfo(
        name = "animation_speed",
        defaultValue = DEFAULT_ANIMATION_SPEED.toString()
    )
    val animationSpeed: Int,
    @ColumnInfo(
        name = "animation_helper_speed",
        defaultValue = DEFAULT_ANIMATION_HELPER_SPEED.toString()
    )
    val animationHelperSpeed: Int,
    @ColumnInfo(
        name = "position",
        defaultValue = DEFAULT_POSITION.toString()
    )
    val position: Int,
    @ColumnInfo(
        name = "auto_capitalize",
        defaultValue = DEFAULT_AUTO_CAPITALIZE.toString()
    )
    val autoCapitalize: Int,
    @ColumnInfo(
        name = "keyboard_layout",
        defaultValue = DEFAULT_KEYBOARD_LAYOUT.toString()
    )
    val keyboardLayout: Int,
    @ColumnInfo(
        name = "theme",
        defaultValue = DEFAULT_THEME.toString()
    )
    val theme: Int,
    @ColumnInfo(
        name = "theme_color",
        defaultValue = DEFAULT_THEME_COLOR.toString()
    )
    val themeColor: Int,
    @ColumnInfo(
        name = "viewed_changelog",
        defaultValue = "0"
    )
    val viewedChangelog: Int
)

@Dao
interface AppSettingsDao {
    @Query("SELECT * FROM AppSettings limit 1")
    fun getSettings(): LiveData<AppSettings>

    @Update
    suspend fun updateAppSettings(appSettings: AppSettings)

    @Query("UPDATE AppSettings set viewed_changelog = 1")
    suspend fun markChangelogViewed()
}

// Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO
class AppSettingsRepository(private val appSettingsDao: AppSettingsDao) {

    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val appSettings = appSettingsDao.getSettings()

    @WorkerThread
    suspend fun update(appSettings: AppSettings) {
        appSettingsDao.updateAppSettings(appSettings)
    }

    @WorkerThread
    suspend fun markChangelogViewed() {
        appSettingsDao.markChangelogViewed()
    }
}

@Database(
    version = 1,
    entities = [AppSettings::class],
    exportSchema = true
)
abstract class AppDB : RoomDatabase() {
    abstract fun appSettingsDao(): AppSettingsDao

    companion object {
        @Volatile
        private var INSTANCE: AppDB? = null

        fun getDatabase(
            context: Context
        ): AppDB {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDB::class.java,
                    "thumbkey"
                )
                    .allowMainThreadQueries()
//          .addMigrations(
//            MIGRATION_1_2,
//          )
                    // Necessary because it can't insert data on creation
                    .addCallback(object : Callback() {
                        override fun onOpen(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                            Executors.newSingleThreadExecutor().execute {
                                db.insert(
                                    "AppSettings",
                                    CONFLICT_IGNORE, // Ensures it won't overwrite the existing data
                                    ContentValues(2).apply {
                                        put("id", 1)
                                    }
                                )
                            }
                        }
                    }).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}

class AppSettingsViewModel(private val repository: AppSettingsRepository) : ViewModel() {

    val appSettings = repository.appSettings

    fun update(appSettings: AppSettings) = viewModelScope.launch {
        repository.update(appSettings)
    }

    fun markChangelogViewed() = viewModelScope.launch {
        repository.markChangelogViewed()
    }
}

class AppSettingsViewModelFactory(private val repository: AppSettingsRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AppSettingsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AppSettingsViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
