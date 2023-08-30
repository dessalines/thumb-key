package com.dessalines.thumbkey.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase.CONFLICT_IGNORE
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.Update
import androidx.room.migration.Migration
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
const val DEFAULT_VIBRATE_ON_TAP = 1
const val DEFAULT_SOUND_ON_TAP = 0
const val DEFAULT_MIN_SWIPE_LENGTH = 40
const val DEFAULT_PUSHUP_SIZE = 0
const val DEFAULT_HIDE_LETTERS = 0
const val DEFAULT_HIDE_SYMBOLS = 0
const val DEFAULT_KEY_BORDERS = 1
const val DEFAULT_SPACEBAR_MULTITAPS = 1

const val UPDATE_APP_CHANGELOG_UNVIEWED = "UPDATE AppSettings SET viewed_changelog = 0"

@Entity
data class AppSettings(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(
        name = "key_size",
        defaultValue = DEFAULT_KEY_SIZE.toString(),
    )
    val keySize: Int,
    @ColumnInfo(
        name = "animation_speed",
        defaultValue = DEFAULT_ANIMATION_SPEED.toString(),
    )
    val animationSpeed: Int,
    @ColumnInfo(
        name = "animation_helper_speed",
        defaultValue = DEFAULT_ANIMATION_HELPER_SPEED.toString(),
    )
    val animationHelperSpeed: Int,
    @ColumnInfo(
        name = "position",
        defaultValue = DEFAULT_POSITION.toString(),
    )
    val position: Int,
    @ColumnInfo(
        name = "auto_capitalize",
        defaultValue = DEFAULT_AUTO_CAPITALIZE.toString(),
    )
    val autoCapitalize: Int,
    @ColumnInfo(
        name = "keyboard_layout",
        defaultValue = DEFAULT_KEYBOARD_LAYOUT.toString(),
    )
    val keyboardLayout: Int,
    @ColumnInfo(
        name = "vibrate_on_tap",
        defaultValue = DEFAULT_VIBRATE_ON_TAP.toString(),
    )
    val vibrateOnTap: Int,
    @ColumnInfo(
        name = "sound_on_tap",
        defaultValue = DEFAULT_SOUND_ON_TAP.toString(),
    )
    val soundOnTap: Int,
    @ColumnInfo(
        name = "theme",
        defaultValue = DEFAULT_THEME.toString(),
    )
    val theme: Int,
    @ColumnInfo(
        name = "theme_color",
        defaultValue = DEFAULT_THEME_COLOR.toString(),
    )
    val themeColor: Int,
    @ColumnInfo(
        name = "viewed_changelog",
        defaultValue = "0",
    )
    val viewedChangelog: Int,
    @ColumnInfo(
        name = "min_swipe_length",
        defaultValue = DEFAULT_MIN_SWIPE_LENGTH.toString(),
    )
    val minSwipeLength: Int,
    @ColumnInfo(
        name = "pushup_size",
        defaultValue = DEFAULT_PUSHUP_SIZE.toString(),
    )
    val pushupSize: Int,
    @ColumnInfo(
        name = "hide_letters",
        defaultValue = DEFAULT_HIDE_LETTERS.toString(),
    )
    val hideLetters: Int,
    @ColumnInfo(
        name = "hide_symbols",
        defaultValue = DEFAULT_HIDE_SYMBOLS.toString(),
    )
    val hideSymbols: Int,
    @ColumnInfo(
        name = "keyboard_layouts",
        defaultValue = "$DEFAULT_KEYBOARD_LAYOUT",
    )
    val keyboardLayouts: String,
    @ColumnInfo(
        name = "key_borders",
        defaultValue = DEFAULT_KEY_BORDERS.toString(),
    )
    val keyBorders: Int,
    @ColumnInfo(
        name = "spacebar_multitaps",
        defaultValue = DEFAULT_SPACEBAR_MULTITAPS.toString(),
    )
    val spacebarMultiTaps: Int,
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

val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            "alter table AppSettings add column min_swipe_length INTEGER NOT NULL default $DEFAULT_MIN_SWIPE_LENGTH",
        )
    }
}

val MIGRATION_2_3 = object : Migration(2, 3) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            "alter table AppSettings add column pushup_size INTEGER NOT NULL default $DEFAULT_PUSHUP_SIZE",
        )
    }
}

val MIGRATION_3_4 = object : Migration(3, 4) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            "alter table AppSettings add column hide_letters INTEGER NOT NULL default $DEFAULT_HIDE_LETTERS",
        )
    }
}

val MIGRATION_4_5 = object : Migration(4, 5) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            "alter table AppSettings add column keyboard_layouts TEXT NOT NULL default '$DEFAULT_KEYBOARD_LAYOUT'",
        )
    }
}

val MIGRATION_5_6 = object : Migration(5, 6) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            "alter table AppSettings add column key_borders INTEGER NOT NULL default $DEFAULT_KEY_BORDERS",
        )
    }
}

val MIGRATION_6_7 = object : Migration(6, 7) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            "alter table AppSettings add column spacebar_multitaps INTEGER NOT NULL default $DEFAULT_SPACEBAR_MULTITAPS",
        )
    }
}

@Database(
    version = 7,
    entities = [AppSettings::class],
    exportSchema = true,
)
abstract class AppDB : RoomDatabase() {
    abstract fun appSettingsDao(): AppSettingsDao

    companion object {
        @Volatile
        private var INSTANCE: AppDB? = null

        fun getDatabase(
            context: Context,
        ): AppDB {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDB::class.java,
                    "thumbkey",
                )
                    .allowMainThreadQueries()
                    .addMigrations(
                        MIGRATION_1_2,
                        MIGRATION_2_3,
                        MIGRATION_3_4,
                        MIGRATION_4_5,
                        MIGRATION_5_6,
                        MIGRATION_6_7,
                    )
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
                                    },
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
