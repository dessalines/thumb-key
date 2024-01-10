package com.dessalines.thumbkey

import android.inputmethodservice.InputMethodService
import android.view.View
import android.view.inputmethod.CursorAnchorInfo
import android.view.inputmethod.EditorInfo
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.setViewTreeLifecycleOwner
import androidx.lifecycle.setViewTreeViewModelStoreOwner
import androidx.savedstate.SavedStateRegistry
import androidx.savedstate.SavedStateRegistryController
import androidx.savedstate.SavedStateRegistryOwner
import androidx.savedstate.setViewTreeSavedStateRegistryOwner
import kotlin.math.abs

class IMEService :
    InputMethodService(),
    LifecycleOwner,
    ViewModelStoreOwner,
    SavedStateRegistryOwner {
    private fun setupView(): View {
        val settingsRepo = (application as ThumbkeyApplication).appSettingsRepository

        val view = ComposeKeyboardView(this, settingsRepo)
        window?.window?.decorView?.let { decorView ->
            decorView.setViewTreeLifecycleOwner(this)
            decorView.setViewTreeViewModelStoreOwner(this)
            decorView.setViewTreeSavedStateRegistryOwner(this)
        }
        view.let {
            view.setViewTreeLifecycleOwner(this)
            view.setViewTreeViewModelStoreOwner(this)
            view.setViewTreeSavedStateRegistryOwner(this)
        }
        return view
    }

    /**
     * This is called every time the keyboard is brought up.
     * You can't use onCreate, because that can't pick up new numeric inputs
     */
    override fun onStartInput(
        attribute: EditorInfo?,
        restarting: Boolean,
    ) {
        super.onStartInput(attribute, restarting)
        val view = this.setupView()
        this.setInputView(view)
    }

    // Lifecycle Methods
    private var lifecycleRegistry: LifecycleRegistry = LifecycleRegistry(this)

    private fun handleLifecycleEvent(event: Lifecycle.Event) = lifecycleRegistry.handleLifecycleEvent(event)

    override val lifecycle = lifecycleRegistry

    override fun onCreate() {
        super.onCreate()
        savedStateRegistryController.performRestore(null)
        handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
    }

    override fun onDestroy() {
        super.onDestroy()
        handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    }

    // Cursor update Methods
    override fun onUpdateCursorAnchorInfo(cursorAnchorInfo: CursorAnchorInfo) {
        super.onUpdateCursorAnchorInfo(cursorAnchorInfo)

        // If the cursor has moved at all vertically, or more than a small amount horizontally, the cursor has changed and multitap should be blocked.
        // The horizontal buffer is because the cursor moves slightly based on the size of some of the characters (i.e '?') moving the cursor a little bit.
        // It would be better to not use a magic number of 15, but I don't know what the ideal buffer is and it seems to work well, even when moving the cursor right before the multitap character
        if (insertionMarkerBaseline != cursorAnchorInfo.getInsertionMarkerBaseline() ||
            abs(cursorAnchorInfo.getInsertionMarkerHorizontal() - insertionMarkerHorizontal) > 15f
        ) {
            cursorMoved = true
            insertionMarkerBaseline = cursorAnchorInfo.getInsertionMarkerBaseline()
        } else {
            cursorMoved = false
        }
        // Always update the horizontal position. This prevents the movement of the cursor by the first space tap blocking consecutive tap actions.
        insertionMarkerHorizontal = cursorAnchorInfo.getInsertionMarkerHorizontal()
    }

    fun didCursorMove(): Boolean {
        return cursorMoved
    }

    private var cursorMoved: Boolean = false
    private var insertionMarkerBaseline: Float = 0f
    private var insertionMarkerHorizontal: Float = 0f

    // ViewModelStore Methods
    override val viewModelStore = ViewModelStore()

    // SaveStateRegistry Methods

    private val savedStateRegistryController = SavedStateRegistryController.create(this)
    override val savedStateRegistry: SavedStateRegistry = savedStateRegistryController.savedStateRegistry
}
