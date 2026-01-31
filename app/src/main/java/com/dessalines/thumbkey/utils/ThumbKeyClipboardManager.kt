package com.dessalines.thumbkey.utils

import android.content.ClipboardManager
import android.content.Context
import android.util.Log
import com.dessalines.thumbkey.db.ClipboardRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class ThumbKeyClipboardManager(
    private val context: Context,
    private val clipboardRepository: ClipboardRepository,
) {
    private val systemClipboardManager =
        context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private var isListening = false
    private var lastClipText: String? = null
    private var isLastCopySystem: Boolean = true

    private fun addToClipboardRepo(text: String) {
        if (text.isBlank() || text == lastClipText) return@addToClipboardRepo
        lastClipText = text
        Log.d(TAG, "Adding clipboard item: $text")
        scope.launch {
            clipboardRepository.addItem(text)
        }
    }

    private val clipboardListener =
        ClipboardManager.OnPrimaryClipChangedListener {
            val clip = systemClipboardManager.primaryClip
            if (clip == null || clip.itemCount == 0) return@OnPrimaryClipChangedListener
            val text = clip.getItemAt(0).coerceToText(context).toString()
            addToClipboardRepo(text)
            isLastCopySystem = true
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
        isLastCopySystem = false
    }

    fun isLastCopySystem(): Boolean = isLastCopySystem

    fun getLastClip(): String? = lastClipText
}
