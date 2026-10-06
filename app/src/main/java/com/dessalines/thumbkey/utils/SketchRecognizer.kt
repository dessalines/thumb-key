package com.dessalines.thumbkey.utils

import android.content.Context
import android.util.Log
import io.github.toldry.glyphsketch.CharacterFilter
import io.github.toldry.glyphsketch.Recognizer
import io.github.toldry.glyphsketch.displayableOnThisDevice
import io.github.toldry.glyphsketch.fromAssets
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlin.time.measureTimedValue

/**
 * The handwriting recognizer for sketch mode, loaded once per process and kept. Loading reads
 * about 9 MB of model files, so it runs in the background the first time it's needed, and
 * leaving sketch mode doesn't cancel it.
 */
object SketchRecognizer {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private var loading: Deferred<Recognizer>? = null

    /** Only the characters this phone's fonts can draw. It caches its answers. */
    val displayable: CharacterFilter by lazy { displayableOnThisDevice() }

    suspend fun get(ctx: Context): Recognizer = start(ctx.applicationContext).await()

    @Synchronized
    private fun start(ctx: Context): Deferred<Recognizer> {
        val current = loading
        // Try again after a failed load, which cancels the deferred
        if (current != null && !current.isCancelled) {
            return current
        }
        return scope
            .async {
                val (recognizer, duration) = measureTimedValue { Recognizer.fromAssets(ctx) }
                Log.d(TAG, "glyphsketch: loaded the recognizer in ${duration.inWholeMilliseconds} ms")
                recognizer
            }.also { loading = it }
    }
}
