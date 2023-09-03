package com.dessalines.thumbkey.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase.CONFLICT_IGNORE
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Relation
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.Transaction
import androidx.room.Update
import androidx.room.Upsert
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.launch
import java.util.concurrent.Executors

const val DEFAULT_KEY_SIZE = 64
const val DEFAULT_ANIMATION_SPEED = 250
const val DEFAULT_ANIMATION_HELPER_SPEED = 250
const val DEFAULT_POSITION = 0
const val DEFAULT_AUTO_CAPITALIZE = 1
const val DEFAULT_KEYBOARD_LAYOUT = "ThumbKeyENv4"
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
data class ExternalKeyboardLayout(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String,
    val enabled: Boolean,
    val json: String
)

@Entity
data class EnabledInternalKeyboardLayout(
    @PrimaryKey
    @ColumnInfo(
        name = "internal_id"
    )
    val internalId: String,
)

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
        name = "keyboard_layout_internal",
        defaultValue = DEFAULT_KEYBOARD_LAYOUT,
    )
    val keyboardLayoutInternal: String?,
    @ColumnInfo(
        name = "keyboard_layout_external",
        defaultValue = "NULL",
    )
    val keyboardLayoutExternal: Int?,
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
)

data class AppSettingsWithKeyboardLayout(
    @Embedded val appSettings: AppSettings,
    @Relation(
        parentColumn = "keyboard_layout_external",
        entityColumn = "id"
    )
    val externalKeyboardLayout: ExternalKeyboardLayout?
)

@Dao
interface AppSettingsDao {
    @Transaction
    @Query("SELECT * FROM AppSettings limit 1")
    fun getSettings(): LiveData<AppSettingsWithKeyboardLayout>

    @Update
    suspend fun updateAppSettings(appSettings: AppSettings)

    @Query("SELECT * FROM EnabledInternalKeyboardLayout")
    fun getEnabledInternalKeyboardLayouts(): LiveData<List<EnabledInternalKeyboardLayout>>

    @Query("SELECT * FROM ExternalKeyboardLayout")
    fun getExternalKeyboardLayouts(): LiveData<List<ExternalKeyboardLayout>>

    @Query("SELECT * FROM ExternalKeyboardLayout WHERE enabled = 1")
    fun getEnabledExternalKeyboardLayouts(): LiveData<List<ExternalKeyboardLayout>>

    @Query("INSERT INTO EnabledInternalKeyboardLayout values (:layout)")
    suspend fun enableInternalKeyboardLayout(layout: String)

    @Query("DELETE FROM EnabledInternalKeyboardLayout where internal_id = :layout")
    suspend fun disableInternalKeyboardLayout(layout: String)

    @Upsert
    suspend fun createExternalKeyboardLayout(layout: ExternalKeyboardLayout)

    @Query("UPDATE ExternalKeyboardLayout set enabled = :enabled where id = :id")
    suspend fun setExternalKeyboardLayoutEnabled(enabled: Boolean, id: Int)

    @Query("DELETE FROM ExternalKeyboardLayout where id = :id")
    suspend fun removeExternalKeyboardLayout(id: Int)

    @Query("UPDATE AppSettings set viewed_changelog = 1")
    suspend fun markChangelogViewed()


    @Query("DELETE FROM EnabledInternalKeyboardLayout")
    suspend fun deleteAllEnabledInternalKeyboardLayouts()

    @Transaction
    suspend fun setEnabledInternalKeyboardLayouts(layouts: List<String>) {
        deleteAllEnabledInternalKeyboardLayouts()
        layouts.forEach {
            enableInternalKeyboardLayout(it)
        }
    }
}

// Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO
class AppSettingsRepository(private val appSettingsDao: AppSettingsDao) {

    // Room executes all queries on a separate thread.
    // Observed Flow will notify the observer when the data has changed.
    val appSettings = appSettingsDao.getSettings()
    val externalKeyboardLayouts = appSettingsDao.getExternalKeyboardLayouts()
    val enabledExternalKeyboardLayouts = appSettingsDao.getEnabledExternalKeyboardLayouts()
    val enabledInternalKeyboardLayouts = appSettingsDao.getEnabledInternalKeyboardLayouts()

    suspend fun update(appSettings: AppSettings) = appSettingsDao.updateAppSettings(appSettings)

    suspend fun enableInternalKeyboardLayout(layout: String) = appSettingsDao.enableInternalKeyboardLayout(layout)

    suspend fun disableInternalKeyboardLayout(layout: String) = appSettingsDao.disableInternalKeyboardLayout(layout)

    suspend fun createExternalKeyboardLayout(layout: ExternalKeyboardLayout) = appSettingsDao.createExternalKeyboardLayout(layout)

    suspend fun setExternalKeyboardLayoutEnabled(enabled: Boolean, id: Int) = appSettingsDao.setExternalKeyboardLayoutEnabled(enabled, id)

    suspend fun removeExternalKeyboardLayout(id: Int) = appSettingsDao.removeExternalKeyboardLayout(id)

    suspend fun markChangelogViewed() = appSettingsDao.markChangelogViewed()

    suspend fun setEnabledInternalKeyboardLayouts(layouts: List<String>) = appSettingsDao.setEnabledInternalKeyboardLayouts(layouts)
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

val MIGRATION_7_8 = object : Migration(7, 8) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            "alter table AppSettings add column hide_symbols INTEGER NOT NULL default $DEFAULT_HIDE_SYMBOLS",
        )
    }
}

val MIGRATION_8_9 = object : Migration(7, 8) {
    override fun migrate(database: SupportSQLiteDatabase) {
        val ret = database.query("select keyboard_layout, keyboard_layouts from AppSettings limit 1")
        val (layout, layouts) = if (ret.moveToFirst()) {
            ret.getInt(0) to ret.getString(1)
        } else {
            null to null
        }

        database.execSQL("""
            create table AppSettingsNew(
                id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                key_size INTEGER NOT NULL DEFAULT 64,
                animation_speed INTEGER NOT NULL DEFAULT 250,
                animation_helper_speed INTEGER NOT NULL DEFAULT 250,
                position INTEGER NOT NULL DEFAULT 0,
                auto_capitalize INTEGER NOT NULL DEFAULT 1,
                keyboard_layout_internal TEXT DEFAULT 'ThumbKeyENv4',
                keyboard_layout_external INTEGER DEFAULT NULL,
                vibrate_on_tap INTEGER NOT NULL DEFAULT 1,
                sound_on_tap INTEGER NOT NULL DEFAULT 0,
                theme INTEGER NOT NULL DEFAULT 0,
                theme_color INTEGER NOT NULL DEFAULT 0,
                viewed_changelog INTEGER NOT NULL DEFAULT 0,
                min_swipe_length INTEGER NOT NULL DEFAULT 40,
                pushup_size INTEGER NOT NULL DEFAULT 0,
                hide_letters INTEGER NOT NULL DEFAULT 0,
                key_borders INTEGER NOT NULL DEFAULT 1,
                spacebar_multitaps INTEGER NOT NULL DEFAULT 1
            )
        """.trimIndent())
        database.execSQL("insert into AppSettingsNew select id, key_size, animation_speed, animation_helper_speed, position, auto_capitalize, null as keyboard_layout_internal, null as keyboard_layout_external, vibrate_on_tap, sound_on_tap, theme, theme_color, viewed_changelog, min_swipe_length, pushup_size, hide_letters, key_borders, spacebar_multitaps from AppSettings")
        database.execSQL("drop table AppSettings")
        database.execSQL("alter table AppSettingsNew rename to AppSettings")
        database.execSQL(
            """
                create table ExternalKeyboardLayout(
                    id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                    title TEXT NOT NULL,
                    enabled INTEGER NOT NULL,
                    json TEXT NOT NULL
                )
            """.trimIndent()
        )
        database.execSQL(
            """
                create table EnabledInternalKeyboardLayout(
                    internal_id TEXT NOT NULL PRIMARY KEY
                )
            """.trimIndent()
        )
        val parsedLayouts = layouts?.split(",")?.map { it.trim().toInt() }?.toSet()
            ?: setOf(
                0,
            )
        parsedLayouts.map { layoutMigration[it] }.forEach {
            database.execSQL("insert into EnabledInternalKeyboardLayout values (?)", arrayOf(it))
        }
        layout?.let { database.execSQL("update AppSettings set keyboard_layout_internal = ?", arrayOf(layoutMigration[it]))  }
    }

    private val layoutMigration = arrayOf("ThumbKeyENv4", "ThumbKeyENv4Programmer", "ThumbKeyDEv2", "ThumbKeyDAv1", "ThumbKeyESv1", "ThumbKeyEUv1", "ThumbKeyFAv1", "ThumbKeyFIv1", "ThumbKeyFRv1", "ThumbKeyITv1", "ThumbKeyNLv1", "ThumbKeyPLv2", "ThumbKeyPTv1", "ThumbKeyRUv2", "ThumbKeyUKv1", "MessageEaseEN", "MessageEaseENSymbols", "MessageEaseHE", "ThumbKeyRUv2Symbols", "ThumbKeyBYv1", "ThumbKeyBYv1Symbols", "ThumbKeyENv4Symbols", "ThumbKeyFIv1Wide", "MessageEaseDE", "ThumbKeyNOv1", "ThumbKeyDEv2MultiLingual", "ThumbKeyKAv1", "ThumbKeyIDv1", "MessageEaseFR", "MessageEaseRUSymbols", "T9v1", "ThumbKeyJAv1Hiragana", "ThumbKeyJAv1Katakana", "ThumbKeyFRv2", "ThumbKeySVv1", "ThumbKeyTRv1", "TypeSplitENv2", "TypeSplitESv1", "TypeSplitDEv1", "TypeSplitFRv1", "TypeSplitITv1", "TypeSplitPTv1", "TypeSplitPLv1", "TwoHandsENv1", "WideLayoutENProgrammer", "ThumbKeyHUv1", "ThumbKeyESEOv1", "MessageEaseIT", "ThumbKeyENv4Multi", "ThumbKeyHEv1", "ThumbKeyEOENDEv1", "ThumbKeyGRv1", "ThumbKeyCZv1", "MessageEaseES", "MessageEaseRU", "ThumbKeyBGv1Symbols")
}

@Database(
    version = 9,
    entities = [ExternalKeyboardLayout::class, EnabledInternalKeyboardLayout::class, AppSettings::class],
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
                if (INSTANCE != null) {
                    return INSTANCE!!
                }
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
                        MIGRATION_7_8,
                        MIGRATION_8_9,
                    )
                    // Necessary because it can't insert data on creation
                    .addCallback(object : Callback() {
                        override fun onOpen(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                            // TODO maybe this should block the main thread?
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
    val externalKeyboardLayouts = repository.externalKeyboardLayouts
    val enabledExternalKeyboardLayouts = repository.enabledExternalKeyboardLayouts
    val enabledInternalKeyboardLayouts = repository.enabledInternalKeyboardLayouts


    fun update(appSettings: AppSettings) = viewModelScope.launch { repository.update(appSettings) }

    fun enableInternalKeyboardLayout(layout: String) = viewModelScope.launch { repository.enableInternalKeyboardLayout(layout) }

    fun disableInternalKeyboardLayout(layout: String) = viewModelScope.launch { repository.disableInternalKeyboardLayout(layout) }

    fun createExternalKeyboardLayout(layout: ExternalKeyboardLayout) = viewModelScope.launch { repository.createExternalKeyboardLayout(layout) }

    fun setExternalKeyboardLayoutEnabled(enabled: Boolean, id: Int) = viewModelScope.launch { repository.setExternalKeyboardLayoutEnabled(enabled, id) }

    fun removeExternalKeyboardLayout(id: Int) = viewModelScope.launch { repository.removeExternalKeyboardLayout(id) }

    // TODO stop using these once settings is migrated
    fun setEnabledInternalKeyboardLayouts(layouts: List<String>) = viewModelScope.launch { repository.setEnabledInternalKeyboardLayouts(layouts) }

    fun markChangelogViewed() = viewModelScope.launch { repository.markChangelogViewed() }
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
