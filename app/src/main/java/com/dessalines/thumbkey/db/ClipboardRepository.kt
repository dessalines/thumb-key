package com.dessalines.thumbkey.db

import androidx.annotation.WorkerThread
import com.dessalines.thumbkey.utils.toBool
import kotlinx.coroutines.flow.Flow

class ClipboardRepository(
    private val clipboardItemDao: ClipboardItemDao,
    private val appSettingsDao: AppSettingsDao,
) {
    val allClipboardItems: Flow<List<ClipboardItem>> = clipboardItemDao.getAllClipboardItems()

    @WorkerThread
    suspend fun addItem(text: String) {
        val settings = appSettingsDao.getSettingsSync()
        if (settings?.clipboardHistoryEnabled?.toBool() != true) return

        clearExpired()

        val existingItem = clipboardItemDao.findByText(text)
        if (existingItem != null) {
            clipboardItemDao.update(existingItem.copy(timestamp = System.currentTimeMillis()))
            return
        }

        val item = ClipboardItem(text = text)
        clipboardItemDao.insert(item)

        if (settings.clipboardSizeLimitEnabled.toBool()) {
            enforceSizeLimit(settings.clipboardMaxSize)
        }
    }

    @WorkerThread
    suspend fun togglePin(item: ClipboardItem) {
        clipboardItemDao.update(item.copy(isPinned = !item.isPinned))
    }

    @WorkerThread
    suspend fun deleteItem(item: ClipboardItem) {
        clipboardItemDao.delete(item)
    }

    @WorkerThread
    suspend fun clearAll() {
        clipboardItemDao.clearAll()
    }

    @WorkerThread
    suspend fun clearUnpinned() {
        clipboardItemDao.clearUnpinnedItems()
    }

    @WorkerThread
    suspend fun clearExpired() {
        val settings = appSettingsDao.getSettingsSync() ?: return
        if (!settings.clipboardAutoCleanupEnabled.toBool()) return

        val cutoffTime = System.currentTimeMillis() - (settings.clipboardCleanupAfterMinutes * 60 * 1000L)
        clipboardItemDao.deleteOlderThan(cutoffTime)
    }

    private suspend fun enforceSizeLimit(maxSize: Int) {
        val unpinnedCount = clipboardItemDao.getUnpinnedCount()
        if (unpinnedCount > maxSize) {
            clipboardItemDao.deleteOldestUnpinned(unpinnedCount - maxSize)
        }
    }

    @WorkerThread
    suspend fun enforceSizeLimit() {
        val settings = appSettingsDao.getSettingsSync() ?: return
        if (!settings.clipboardSizeLimitEnabled.toBool()) return
        enforceSizeLimit(settings.clipboardMaxSize)
    }
}
