package com.dessalines.thumbkey.db

import android.content.Context
import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Entity(tableName = "ClipboardItem")
data class ClipboardItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "text")
    val text: String,
    @ColumnInfo(name = "timestamp")
    val timestamp: Long = System.currentTimeMillis(),
    @ColumnInfo(name = "is_pinned", defaultValue = "0")
    val isPinned: Boolean = false,
)

@Dao
interface ClipboardItemDao {
    @Query("SELECT * FROM ClipboardItem ORDER BY is_pinned DESC, timestamp DESC")
    fun getAllClipboardItems(): Flow<List<ClipboardItem>>

    @Query("SELECT * FROM ClipboardItem WHERE id = :id")
    suspend fun getById(id: Int): ClipboardItem?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: ClipboardItem): Long

    @Update
    suspend fun update(item: ClipboardItem)

    @Delete
    suspend fun delete(item: ClipboardItem)

    @Query("DELETE FROM ClipboardItem WHERE is_pinned = 0")
    suspend fun clearUnpinnedItems()

    @Query("DELETE FROM ClipboardItem")
    suspend fun clearAll()

    @Query("SELECT COUNT(*) FROM ClipboardItem WHERE is_pinned = 0")
    suspend fun getUnpinnedCount(): Int

    @Query(
        "DELETE FROM ClipboardItem WHERE id IN " +
            "(SELECT id FROM ClipboardItem WHERE is_pinned = 0 ORDER BY timestamp ASC LIMIT :count)",
    )
    suspend fun deleteOldestUnpinned(count: Int)

    @Query("DELETE FROM ClipboardItem WHERE is_pinned = 0 AND timestamp < :cutoffTime")
    suspend fun deleteOlderThan(cutoffTime: Long)

    @Query("SELECT * FROM ClipboardItem WHERE text = :text LIMIT 1")
    suspend fun findByText(text: String): ClipboardItem?
}

@Database(
    version = 1,
    entities = [ClipboardItem::class],
    exportSchema = true,
)
abstract class ClipboardDB : RoomDatabase() {
    abstract fun clipboardItemDao(): ClipboardItemDao

    companion object {
        @Volatile
        private var instance: ClipboardDB? = null

        fun getDatabase(context: Context): ClipboardDB =
            instance ?: synchronized(this) {
                val instance =
                    Room
                        .databaseBuilder(
                            context.applicationContext,
                            ClipboardDB::class.java,
                            "clipboard_db",
                        ).fallbackToDestructiveMigration(dropAllTables = true)
                        .build()
                Companion.instance = instance
                instance
            }
    }
}
