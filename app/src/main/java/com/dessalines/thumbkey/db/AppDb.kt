package com.dessalines.thumbkey.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase.CONFLICT_IGNORE
import android.util.Log
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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.concurrent.Executors

const val DEFAULT_AUTO_SIZE_KEYS = 1
const val DEFAULT_NON_SQUARE_KEYS = 0
const val DEFAULT_KEY_WIDTH = 64
const val DEFAULT_KEY_HEIGHT = DEFAULT_KEY_WIDTH
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
const val DEFAULT_SLIDE_SENSITIVITY = 9
const val DEFAULT_SLIDE_ENABLED = 0
const val DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE = 0
const val DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED = 1
const val DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED = 1
const val DEFAULT_BACKDROP_ENABLED = 0
const val DEFAULT_KEY_PADDING = 0
const val DEFAULT_KEY_BORDER_WIDTH = 1
const val DEFAULT_KEY_RADIUS = 0
const val DEFAULT_DRAG_RETURN_ENABLED = 1
const val DEFAULT_CIRCULAR_DRAG_ENABLED = 1
const val DEFAULT_CLOCKWISE_DRAG_ACTION = 0
const val DEFAULT_COUNTERCLOCKWISE_DRAG_ACTION = 1
const val DEFAULT_GHOST_KEYS_ENABLED = 0
const val DEFAULT_KEY_MODIFICATIONS = ""

@Entity
data class AppSettings(
    @PrimaryKey(autoGenerate = true) val id: Int,
    // These columns exist in the database schema because we can't drop them without recreating tables.
    // They still have to be handled nearly identically to active columns, but they are actually defunct.
    @ColumnInfo(
        name = "key_size_defunct",
        defaultValue = DEFAULT_KEY_WIDTH.toString(),
    )
    val keySizeDefunct: Int = DEFAULT_KEY_WIDTH,
    @ColumnInfo(
        name = "key_width_defunct",
    )
    val keyWidthDefunct: Int? = null,
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
        name = "slide_enabled",
        defaultValue = DEFAULT_SLIDE_ENABLED.toString(),
    )
    val slideEnabled: Int,
    @ColumnInfo(
        name = "slide_cursor_movement_mode",
        defaultValue = DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE.toString(),
    )
    val slideCursorMovementMode: Int,
    @ColumnInfo(
        name = "slide_spacebar_deadzone_enabled",
        defaultValue = DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED.toString(),
    )
    val slideSpacebarDeadzoneEnabled: Int,
    @ColumnInfo(
        name = "slide_backspace_deadzone_enabled",
        defaultValue = DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED.toString(),
    )
    val slideBackspaceDeadzoneEnabled: Int,
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
    // TODO get rid of this column next time you regenerate the app
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
        name = "slide_sensitivity",
        defaultValue = DEFAULT_SLIDE_SENSITIVITY.toString(),
    )
    val slideSensitivity: Int,
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
        name = "keyboard_layouts",
        defaultValue = "$DEFAULT_KEYBOARD_LAYOUT",
    )
    val keyboardLayouts: String,
    // TODO this needs to be gotten rid of in the next DB update
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
    @ColumnInfo(
        name = "hide_symbols",
        defaultValue = DEFAULT_HIDE_SYMBOLS.toString(),
    )
    val hideSymbols: Int,
    @ColumnInfo(
        name = "last_version_code_viewed",
        defaultValue = "0",
    )
    val lastVersionCodeViewed: Int,
    @ColumnInfo(
        name = "backdrop_enabled",
        defaultValue = DEFAULT_BACKDROP_ENABLED.toString(),
    )
    val backdropEnabled: Int,
    @ColumnInfo(
        name = "key_padding",
        defaultValue = DEFAULT_KEY_PADDING.toString(),
    )
    val keyPadding: Int,
    @ColumnInfo(
        name = "key_border_width",
        defaultValue = DEFAULT_KEY_BORDER_WIDTH.toString(),
    )
    val keyBorderWidth: Int,
    @ColumnInfo(
        name = "key_radius",
        defaultValue = DEFAULT_KEY_RADIUS.toString(),
    )
    val keyRadius: Int,
    @ColumnInfo(
        name = "drag_return_enabled",
        defaultValue = DEFAULT_DRAG_RETURN_ENABLED.toString(),
    )
    val dragReturnEnabled: Int,
    @ColumnInfo(
        name = "circular_drag_enabled",
        defaultValue = DEFAULT_CIRCULAR_DRAG_ENABLED.toString(),
    )
    val circularDragEnabled: Int,
    @ColumnInfo(
        name = "clockwise_drag_action",
        defaultValue = DEFAULT_CLOCKWISE_DRAG_ACTION.toString(),
    )
    val clockwiseDragAction: Int,
    @ColumnInfo(
        name = "counterclockwise_drag_action",
        defaultValue = DEFAULT_COUNTERCLOCKWISE_DRAG_ACTION.toString(),
    )
    val counterclockwiseDragAction: Int,
    @ColumnInfo(
        name = "ghost_keys_enabled",
        defaultValue = DEFAULT_GHOST_KEYS_ENABLED.toString(),
    )
    val ghostKeysEnabled: Int,
    @ColumnInfo(
        name = "key_modifications",
        defaultValue = "",
    )
    val keyModifications: String,
    @ColumnInfo(
        name = "auto_size_keys",
        defaultValue = DEFAULT_AUTO_SIZE_KEYS.toString(),
    )
    val autoSizeKeys: Int,
    @ColumnInfo(
        name = "non_square_keys",
        defaultValue = DEFAULT_NON_SQUARE_KEYS.toString(),
    )
    val nonSquareKeys: Int,
    @ColumnInfo(
        name = "key_width_v18",
        defaultValue = DEFAULT_KEY_WIDTH.toString(),
    )
    val keyWidth: Int,
    @ColumnInfo(
        name = "key_height_v18",
        defaultValue = DEFAULT_KEY_HEIGHT.toString(),
    )
    val keyHeight: Int,
)

data class LayoutsUpdate(
    val id: Int,
    @ColumnInfo(
        name = "keyboard_layout",
    )
    val keyboardLayout: Int,
    @ColumnInfo(
        name = "keyboard_layouts",
    )
    val keyboardLayouts: String,
)

data class LookAndFeelUpdate(
    val id: Int,
    @ColumnInfo(
        name = "animation_speed",
    )
    val animationSpeed: Int,
    @ColumnInfo(
        name = "animation_helper_speed",
    )
    val animationHelperSpeed: Int,
    @ColumnInfo(
        name = "position",
    )
    val position: Int,
    @ColumnInfo(
        name = "vibrate_on_tap",
    )
    val vibrateOnTap: Int,
    @ColumnInfo(
        name = "sound_on_tap",
    )
    val soundOnTap: Int,
    @ColumnInfo(
        name = "theme",
    )
    val theme: Int,
    @ColumnInfo(
        name = "theme_color",
    )
    val themeColor: Int,
    @ColumnInfo(
        name = "pushup_size",
    )
    val pushupSize: Int,
    @ColumnInfo(
        name = "hide_letters",
    )
    val hideLetters: Int,
    @ColumnInfo(
        name = "hide_symbols",
    )
    val hideSymbols: Int,
    @ColumnInfo(
        name = "backdrop_enabled",
    )
    val backdropEnabled: Int,
    @ColumnInfo(
        name = "key_padding",
    )
    val keyPadding: Int,
    @ColumnInfo(
        name = "key_border_width",
    )
    val keyBorderWidth: Int,
    @ColumnInfo(
        name = "key_radius",
    )
    val keyRadius: Int,
    @ColumnInfo(
        name = "auto_size_keys",
    )
    val autoSizeKeys: Int,
    @ColumnInfo(
        name = "non_square_keys",
    )
    val nonSquareKeys: Int,
    @ColumnInfo(
        name = "key_width_v18",
    )
    val keyWidth: Int,
    @ColumnInfo(
        name = "key_height_v18",
    )
    val keyHeight: Int,
)

data class BehaviorUpdate(
    val id: Int,
    @ColumnInfo(name = "min_swipe_length")
    val minSwipeLength: Int,
    @ColumnInfo(name = "slide_sensitivity")
    val slideSensitivity: Int,
    @ColumnInfo(name = "slide_enabled")
    val slideEnabled: Int,
    @ColumnInfo(name = "slide_cursor_movement_mode")
    val slideCursorMovementMode: Int,
    @ColumnInfo(name = "slide_spacebar_deadzone_enabled")
    val slideSpacebarDeadzoneEnabled: Int,
    @ColumnInfo(name = "slide_backspace_deadzone_enabled")
    val slideBackspaceDeadzoneEnabled: Int,
    @ColumnInfo(name = "auto_capitalize")
    val autoCapitalize: Int,
    @ColumnInfo(name = "spacebar_multitaps")
    val spacebarMultiTaps: Int,
    @ColumnInfo(name = "drag_return_enabled")
    val dragReturnEnabled: Int,
    @ColumnInfo(name = "circular_drag_enabled")
    val circularDragEnabled: Int,
    @ColumnInfo(name = "clockwise_drag_action")
    val clockwiseDragAction: Int,
    @ColumnInfo(name = "counterclockwise_drag_action")
    val counterclockwiseDragAction: Int,
    @ColumnInfo(name = "ghost_keys_enabled")
    val ghostKeysEnabled: Int,
)

data class KeyModificationsUpdate(
    val id: Int,
    @ColumnInfo(
        name = "key_modifications",
    )
    val keyModifications: String,
)

@Dao
interface AppSettingsDao {
    @Query("SELECT * FROM AppSettings limit 1")
    fun getSettings(): LiveData<AppSettings>

    @Update
    suspend fun updateAppSettings(appSettings: AppSettings)

    @Update(entity = AppSettings::class)
    fun updateLayouts(layouts: LayoutsUpdate)

    @Update(entity = AppSettings::class)
    fun updateLookAndFeel(lookAndFeel: LookAndFeelUpdate)

    @Update(entity = AppSettings::class)
    fun updateBehavior(behavior: BehaviorUpdate)

    @Update(entity = AppSettings::class)
    fun updateKeyModifications(behavior: KeyModificationsUpdate)

    @Query("UPDATE AppSettings SET last_version_code_viewed = :versionCode")
    suspend fun updateLastVersionCode(versionCode: Int)
}

// Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO
class AppSettingsRepository(
    private val appSettingsDao: AppSettingsDao,
) {
    private val _changelog = MutableStateFlow("")
    val changelog = _changelog.asStateFlow()

    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val appSettings = appSettingsDao.getSettings()

    @WorkerThread
    suspend fun update(appSettings: AppSettings) {
        appSettingsDao.updateAppSettings(appSettings)
    }

    @WorkerThread
    fun updateLayouts(layouts: LayoutsUpdate) {
        appSettingsDao.updateLayouts(layouts)
    }

    @WorkerThread
    fun updateLookAndFeel(lookAndFeel: LookAndFeelUpdate) {
        appSettingsDao.updateLookAndFeel(lookAndFeel)
    }

    @WorkerThread
    fun updateBehavior(behavior: BehaviorUpdate) {
        appSettingsDao.updateBehavior(behavior)
    }

    @WorkerThread
    fun updateKeyModifications(behavior: KeyModificationsUpdate) {
        appSettingsDao.updateKeyModifications(behavior)
    }

    @WorkerThread
    suspend fun updateLastVersionCodeViewed(versionCode: Int) {
        appSettingsDao.updateLastVersionCode(versionCode)
    }

    @WorkerThread
    suspend fun updateChangelog(ctx: Context) {
        withContext(Dispatchers.IO) {
            try {
                val releasesStr =
                    ctx.assets
                        .open("RELEASES.md")
                        .bufferedReader()
                        .use { it.readText() }
                _changelog.value = releasesStr
            } catch (e: Exception) {
                Log.e("thumb-key", "Failed to load changelog: $e")
            }
        }
    }
}

val MIGRATION_1_2 =
    object : Migration(1, 2) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column min_swipe_length INTEGER NOT NULL default $DEFAULT_MIN_SWIPE_LENGTH",
            )
        }
    }

val MIGRATION_2_3 =
    object : Migration(2, 3) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column pushup_size INTEGER NOT NULL default $DEFAULT_PUSHUP_SIZE",
            )
        }
    }

val MIGRATION_3_4 =
    object : Migration(3, 4) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column hide_letters INTEGER NOT NULL default $DEFAULT_HIDE_LETTERS",
            )
        }
    }

val MIGRATION_4_5 =
    object : Migration(4, 5) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column keyboard_layouts TEXT NOT NULL default '$DEFAULT_KEYBOARD_LAYOUT'",
            )
        }
    }

val MIGRATION_5_6 =
    object : Migration(5, 6) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column key_borders INTEGER NOT NULL default $DEFAULT_KEY_BORDERS",
            )
        }
    }

val MIGRATION_6_7 =
    object : Migration(6, 7) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column spacebar_multitaps INTEGER NOT NULL default $DEFAULT_SPACEBAR_MULTITAPS",
            )
        }
    }

val MIGRATION_7_8 =
    object : Migration(7, 8) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column hide_symbols INTEGER NOT NULL default $DEFAULT_HIDE_SYMBOLS",
            )
        }
    }

val MIGRATION_8_9 =
    object : Migration(8, 9) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column last_version_code_viewed INTEGER NOT NULL default 0",
            )
        }
    }

val MIGRATION_9_10 =
    object : Migration(9, 10) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column slide_enabled INTEGER NOT NULL default $DEFAULT_SLIDE_ENABLED",
            )
            db.execSQL(
                "alter table AppSettings add column slide_sensitivity INTEGER NOT NULL default $DEFAULT_SLIDE_SENSITIVITY",
            )
        }
    }

val MIGRATION_10_11 =
    object : Migration(10, 11) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column backdrop_enabled INTEGER NOT NULL default $DEFAULT_BACKDROP_ENABLED",
            )
        }
    }

val MIGRATION_11_12 =
    object : Migration(11, 12) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column key_padding INTEGER NOT NULL default $DEFAULT_KEY_PADDING",
            )
            db.execSQL(
                "alter table AppSettings add column key_border_width INTEGER NOT NULL default $DEFAULT_KEY_BORDER_WIDTH",
            )
            db.execSQL(
                "alter table AppSettings add column key_radius INTEGER NOT NULL default $DEFAULT_KEY_RADIUS",
            )
        }
    }

val MIGRATION_12_13 =
    object : Migration(12, 13) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column slide_spacebar_deadzone_enabled INTEGER NOT NULL " +
                    "default $DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED",
            )
            db.execSQL(
                "alter table AppSettings add column slide_backspace_deadzone_enabled INTEGER NOT NULL " +
                    "default $DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED",
            )
            db.execSQL(
                "alter table AppSettings add column slide_cursor_movement_mode INTEGER NOT NULL " +
                    "default $DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE",
            )
        }
    }

val MIGRATION_13_14 =
    object : Migration(13, 14) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column key_width INTEGER",
            )
        }
    }

val MIGRATION_14_15 =
    object : Migration(14, 15) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column drag_return_enabled INTEGER NOT NULL default $DEFAULT_DRAG_RETURN_ENABLED",
            )
            db.execSQL(
                "alter table AppSettings add column circular_drag_enabled INTEGER NOT NULL default $DEFAULT_CIRCULAR_DRAG_ENABLED",
            )
            db.execSQL(
                "alter table AppSettings add column clockwise_drag_action INTEGER NOT NULL default $DEFAULT_CLOCKWISE_DRAG_ACTION",
            )
            db.execSQL(
                "alter table AppSettings add column counterclockwise_drag_action INTEGER NOT NULL " +
                    "default $DEFAULT_COUNTERCLOCKWISE_DRAG_ACTION",
            )
        }
    }

val MIGRATION_15_16 =
    object : Migration(15, 16) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column ghost_keys_enabled INTEGER NOT NULL default $DEFAULT_GHOST_KEYS_ENABLED",
            )
        }
    }

val MIGRATION_16_17 =
    object : Migration(16, 17) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column key_modifications TEXT NOT NULL default ''",
            )
        }
    }

val MIGRATION_17_18 =
    object : Migration(17, 18) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "ALTER TABLE AppSettings RENAME COLUMN key_size TO key_size_defunct",
            )
            db.execSQL(
                "ALTER TABLE AppSettings RENAME COLUMN key_width TO key_width_defunct",
            )
            db.execSQL(
                "ALTER TABLE AppSettings ADD COLUMN auto_size_keys INTEGER NOT NULL DEFAULT $DEFAULT_AUTO_SIZE_KEYS",
            )
            db.execSQL(
                "ALTER TABLE AppSettings ADD COLUMN non_square_keys INTEGER NOT NULL DEFAULT $DEFAULT_NON_SQUARE_KEYS",
            )
            db.execSQL(
                "ALTER TABLE AppSettings ADD COLUMN key_width_v18 INTEGER NOT NULL DEFAULT $DEFAULT_KEY_WIDTH",
            )
            db.execSQL(
                "ALTER TABLE AppSettings ADD COLUMN key_height_v18 INTEGER NOT NULL DEFAULT $DEFAULT_KEY_HEIGHT",
            )
            db.execSQL(
                "UPDATE AppSettings SET auto_size_keys = 0 WHERE key_size_defunct != $DEFAULT_KEY_HEIGHT",
            )
            db.execSQL(
                "UPDATE AppSettings SET non_square_keys = 1 WHERE key_width_defunct != $DEFAULT_KEY_WIDTH",
            )
            db.execSQL(
                "UPDATE AppSettings SET key_width_v18 = IFNULL(key_width_defunct, $DEFAULT_KEY_WIDTH)",
            )
            db.execSQL(
                "UPDATE AppSettings SET key_height_v18 = IFNULL(key_size_defunct, $DEFAULT_KEY_HEIGHT)",
            )
        }
    }

@Database(
    version = 18,
    entities = [AppSettings::class],
    exportSchema = true,
)
abstract class AppDB : RoomDatabase() {
    abstract fun appSettingsDao(): AppSettingsDao

    companion object {
        @Volatile
        private var instance: AppDB? = null

        fun getDatabase(context: Context): AppDB {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return instance ?: synchronized(this) {
                val i =
                    Room
                        .databaseBuilder(
                            context.applicationContext,
                            AppDB::class.java,
                            "thumbkey",
                        ).allowMainThreadQueries()
                        .addMigrations(
                            MIGRATION_1_2,
                            MIGRATION_2_3,
                            MIGRATION_3_4,
                            MIGRATION_4_5,
                            MIGRATION_5_6,
                            MIGRATION_6_7,
                            MIGRATION_7_8,
                            MIGRATION_8_9,
                            MIGRATION_9_10,
                            MIGRATION_10_11,
                            MIGRATION_11_12,
                            MIGRATION_12_13,
                            MIGRATION_13_14,
                            MIGRATION_14_15,
                            MIGRATION_15_16,
                            MIGRATION_16_17,
                            MIGRATION_17_18,
                        )
                        // Necessary because it can't insert data on creation
                        .addCallback(
                            object : Callback() {
                                override fun onOpen(db: SupportSQLiteDatabase) {
                                    super.onCreate(db)
                                    Executors.newSingleThreadExecutor().execute {
                                        db.insert(
                                            "AppSettings",
                                            // Ensures it won't overwrite the existing data
                                            CONFLICT_IGNORE,
                                            ContentValues(2).apply {
                                                put("id", 1)
                                            },
                                        )
                                    }
                                }
                            },
                        ).build()
                instance = i
                // return instance
                i
            }
        }
    }
}

class AppSettingsViewModel(
    private val repository: AppSettingsRepository,
) : ViewModel() {
    val appSettings = repository.appSettings
    val changelog = repository.changelog

    fun update(appSettings: AppSettings) =
        viewModelScope.launch {
            repository.update(appSettings)
        }

    fun updateLayouts(layouts: LayoutsUpdate) =
        viewModelScope.launch {
            repository.updateLayouts(layouts)
        }

    fun updateLookAndFeel(lookAndFeel: LookAndFeelUpdate) =
        viewModelScope.launch {
            repository.updateLookAndFeel(lookAndFeel)
        }

    fun updateBehavior(behavior: BehaviorUpdate) =
        viewModelScope.launch {
            repository.updateBehavior(behavior)
        }

    fun updateKeyModifications(behavior: KeyModificationsUpdate) =
        viewModelScope.launch {
            repository.updateKeyModifications(behavior)
        }

    fun updateLastVersionCodeViewed(versionCode: Int) =
        viewModelScope.launch {
            repository.updateLastVersionCodeViewed(versionCode)
        }

    fun updateChangelog(ctx: Context) =
        viewModelScope.launch {
            repository.updateChangelog(ctx)
        }
}

class AppSettingsViewModelFactory(
    private val repository: AppSettingsRepository,
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AppSettingsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AppSettingsViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
