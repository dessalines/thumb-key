package com.dessalines.thumbkey.utils

import android.content.ClipDescription
import android.content.ClipboardManager
import android.content.Context
import android.os.Build
import com.dessalines.thumbkey.db.ClipboardRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

private const val LEGACY_EXTRA_IS_SENSITIVE = "android.content.extra.IS_SENSITIVE"

class ThumbKeyClipboardManager(
    private val context: Context,
    private val clipboardRepository: ClipboardRepository,
) {
    private val systemClipboardManager =
        context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private var isListening = false
    private var lastClipText: String? = null

// Used to manage data with a non-text MEME type, when private clipboard is enabled
// When copying data with a MIME type different than a text, e.g. a picture, it is not added to the history, as it’s not a text. With standard paste it’s not an issue as the paste will still paste it.
// However if we paste from the internal clipboard, it will paste the latest string in the history, and not the picture that was only in the system clipboard.
    private var wasLastCopyOperationDoneViaSystem: Boolean = true

    private fun addToClipboardRepo(text: String) {
        if (text.isBlank() || text == lastClipText) return@addToClipboardRepo
        lastClipText = text
        scope.launch {
            clipboardRepository.addItem(text)
        }
    }

    private fun isSensitiveClip(description: ClipDescription?): Boolean {
        val extras = description?.extras ?: return false
        val key =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                ClipDescription.EXTRA_IS_SENSITIVE
            } else {
                LEGACY_EXTRA_IS_SENSITIVE
            }
        return extras.getBoolean(key, false)
    }

    private val clipboardListener =
        ClipboardManager.OnPrimaryClipChangedListener {
            val clip = systemClipboardManager.primaryClip
            if (clip == null || clip.itemCount == 0) return@OnPrimaryClipChangedListener
            if (isSensitiveClip(clip.description)) return@OnPrimaryClipChangedListener
            val text = clip.getItemAt(0).coerceToText(context).toString()
            addToClipboardRepo(text)
            wasLastCopyOperationDoneViaSystem = true
        }

    fun startListening() {
        if (!isListening) {
            systemClipboardManager.addPrimaryClipChangedListener(clipboardListener)
            isListening = true
        }
    }

    fun stopListening() {
        if (isListening) {
            systemClipboardManager.removePrimaryClipChangedListener(clipboardListener)
            isListening = false
        }
    }

    fun clearExpired() {
        scope.launch {
            clipboardRepository.clearExpired()
        }
    }

    fun addPrivateClip(text: String) {
        addToClipboardRepo(text)
        wasLastCopyOperationDoneViaSystem = false
    }

    fun wasLastCopyOperationDoneViaSystem(): Boolean = wasLastCopyOperationDoneViaSystem

    fun getLastClip(): String? = lastClipText
}
