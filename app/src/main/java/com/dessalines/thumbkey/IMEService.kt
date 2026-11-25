package com.dessalines.thumbkey

import android.content.res.Configuration
import android.graphics.Color
import android.graphics.Rect
import android.graphics.Region
import android.graphics.drawable.ColorDrawable
import android.inputmethodservice.InputMethodService
import android.text.InputType
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.inputmethod.CursorAnchorInfo
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.ExtractedTextRequest
import android.view.inputmethod.InputConnection
import android.widget.LinearLayout
import androidx.compose.ui.unit.IntRect
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
import com.dessalines.thumbkey.db.DEFAULT_CLIPBOARD_HISTORY_ENABLED
import com.dessalines.thumbkey.db.DEFAULT_DISABLE_FULLSCREEN_EDITOR
import com.dessalines.thumbkey.db.DEFAULT_POSITION
import com.dessalines.thumbkey.db.DEFAULT_SHOW_ON_SCREEN_KEYBOARD
import com.dessalines.thumbkey.db.DEFAULT_SWITCH_IME_MODE
import com.dessalines.thumbkey.db.DEFAULT_USE_PRIVATE_CLIPBOARD
import com.dessalines.thumbkey.ui.components.keyboard.SketchState
import com.dessalines.thumbkey.ui.theme.thumbkeyColorScheme
import com.dessalines.thumbkey.utils.ImeSwitchMode
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardLayout
import com.dessalines.thumbkey.utils.KeyboardPosition
import com.dessalines.thumbkey.utils.TAG
import com.dessalines.thumbkey.utils.ThumbKeyClipboardManager
import com.dessalines.thumbkey.utils.isWatch
import com.dessalines.thumbkey.utils.resolveKeyboardDefinition
import com.dessalines.thumbkey.utils.toBool

class IMEService :
    InputMethodService(),
    LifecycleOwner,
    ViewModelStoreOwner,
    SavedStateRegistryOwner {
    private fun setupView(): ComposeKeyboardView {
        val app = application as ThumbkeyApplication
        val settingsRepo = app.appSettingsRepository
        val clipboardRepo = app.clipboardRepository

        val appSettings = settingsRepo.appSettings.value
        val layoutIndex = appSettings?.keyboardLayout
        if (layoutIndex != null) {
            currentKeyboardDefinition =
                resolveKeyboardDefinition(KeyboardLayout.entries[layoutIndex], appSettings.keyModifications)
        }

        val view = ComposeKeyboardView(this, settingsRepo, clipboardRepo)
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

    var currentKeyboardDefinition: KeyboardDefinition? = null

    // While set, the keys type into this field of the keyboard's own, like sketch mode's
    // search, instead of the app's
    private var inputRedirect: InputConnection? = null

    fun setInputRedirect(connection: InputConnection?) {
        inputRedirect = connection
    }

    // The framework's connection is null while no text field is bound, and the framework itself
    // calls this. Kotlin would check a platform value returned as non-null and throw, so pass it
    // through unchecked, as the Java method does. Nullable would break every caller.
    override fun getCurrentInputConnection(): InputConnection = inputRedirect ?: unchecked(super.getCurrentInputConnection())

    /** The app's text field, even while the keys type into the keyboard's own field. */
    val appInputConnection: InputConnection get() = super.getCurrentInputConnection()

    // Sketch mode's drawing, kept while the keyboard is closed and opened again
    val sketchState = SketchState()
    private var clipboardManager: ThumbKeyClipboardManager? = null
    private var isFloatingMode: Boolean = false
    private var floatingPanelBounds: Rect? = null
    private var imeNavBarBottomPx: Int = 0

    private fun isFloatingPosition(position: Int?): Boolean = (position ?: DEFAULT_POSITION) == KeyboardPosition.Floating.ordinal

    fun onFloatingBounds(bounds: IntRect) {
        val rect = Rect(bounds.left, bounds.top, bounds.right, bounds.bottom)
        if (rect != floatingPanelBounds) {
            floatingPanelBounds = rect
            window?.window?.decorView?.requestLayout()
        }
    }

    fun onNavBarBottomInsetChanged(bottomPx: Int) {
        if (bottomPx != imeNavBarBottomPx) {
            imeNavBarBottomPx = bottomPx
            if (isFloatingMode) {
                window?.window?.decorView?.requestLayout()
            }
        }
    }

    private fun applyFloatingWindowLayout(
        win: Window,
        isFullscreen: Boolean = isFullscreenMode,
        isCandidatesOnly: Boolean = false,
    ) {
        win.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        try {
            val inputArea = win.decorView.findViewById<View>(android.R.id.inputArea)
            if (isFloatingMode && !isFullscreen && !isCandidatesOnly) {
                if (inputArea != null) {
                    val lp = inputArea.layoutParams
                    if (lp != null && lp.height != ViewGroup.LayoutParams.MATCH_PARENT) {
                        lp.height = ViewGroup.LayoutParams.MATCH_PARENT
                        inputArea.layoutParams = lp
                    }
                    val panel = inputArea.parent as? LinearLayout
                    if (panel != null &&
                        panel.orientation == LinearLayout.VERTICAL &&
                        (panel.gravity and Gravity.VERTICAL_GRAVITY_MASK) != Gravity.BOTTOM
                    ) {
                        panel.gravity = Gravity.BOTTOM
                    }
                }
                if (win.attributes.height != ViewGroup.LayoutParams.MATCH_PARENT) {
                    win.setLayout(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT,
                    )
                }
            } else {
                if (inputArea != null) {
                    val lp = inputArea.layoutParams
                    if (lp != null && lp.height != ViewGroup.LayoutParams.WRAP_CONTENT) {
                        lp.height = ViewGroup.LayoutParams.WRAP_CONTENT
                        inputArea.layoutParams = lp
                    }
                }
                val targetHeight =
                    if (isFullscreen) {
                        ViewGroup.LayoutParams.MATCH_PARENT
                    } else {
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    }
                if (win.attributes.height != targetHeight) {
                    win.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, targetHeight)
                }
            }
        } catch (detached: IllegalArgumentException) {
            Log.d(TAG, "IME window not attached while sizing it: ${detached.message}")
        }
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
        setInputRedirect(null)
        // A new keyboard opens on the letters: close sketch mode's search and lists, but keep
        // its drawing
        sketchState.searching = false
        sketchState.list = null
        val app = application as ThumbkeyApplication
        isFloatingMode =
            isFloatingPosition(
                app.appSettingsRepository.appSettings.value
                    ?.position,
            )
        if (!isFloatingMode) {
            floatingPanelBounds = null
        }
        val view = this.setupView()
        this.setInputView(view)
        window?.window?.let { applyFloatingWindowLayout(it) }
    }

    // Lifecycle Methods
    private var lifecycleRegistry: LifecycleRegistry = LifecycleRegistry(this)

    private fun handleLifecycleEvent(event: Lifecycle.Event) = lifecycleRegistry.handleLifecycleEvent(event)

    override val lifecycle = lifecycleRegistry

    override fun onCreate() {
        super.onCreate()
        savedStateRegistryController.performRestore(null)
        handleLifecycleEvent(Lifecycle.Event.ON_RESUME)

        val app = application as ThumbkeyApplication
        isFloatingMode =
            isFloatingPosition(
                app.appSettingsRepository.appSettings.value
                    ?.position,
            )
        app.appSettingsRepository.appSettings.observe(this) { settings ->
            val nextFloating = isFloatingPosition(settings?.position)
            if (nextFloating != isFloatingMode) {
                isFloatingMode = nextFloating
                if (!nextFloating) {
                    floatingPanelBounds = null
                }
                window?.window?.let { applyFloatingWindowLayout(it) }
                updateFullscreenMode()
                window?.window?.decorView?.let { decorView ->
                    decorView.requestApplyInsets()
                    decorView.requestLayout()
                }
            }
        }

        // Initialize clipboard manager
        clipboardManager = ThumbKeyClipboardManager(this, app.clipboardRepository)
        clipboardManager?.startListening()
        clipboardManager?.clearExpired()
    }

    override fun onConfigureWindow(
        win: Window,
        isFullscreen: Boolean,
        isCandidatesOnly: Boolean,
    ) {
        super.onConfigureWindow(win, isFullscreen, isCandidatesOnly)
        applyFloatingWindowLayout(win, isFullscreen, isCandidatesOnly)
    }

    override fun onComputeInsets(outInsets: Insets) {
        super.onComputeInsets(outInsets)
        if (!isFloatingMode) return
        val decorView = window?.window?.decorView ?: return
        val decorHeight = decorView.height
        if (decorHeight <= 0) return
        val band = imeNavBarBottomPx.coerceIn(0, decorHeight)
        val top = decorHeight - band
        outInsets.contentTopInsets = top
        outInsets.visibleTopInsets = top
        val bounds = floatingPanelBounds
        if (bounds != null) {
            outInsets.touchableInsets = Insets.TOUCHABLE_INSETS_REGION
            outInsets.touchableRegion.setEmpty()
            outInsets.touchableRegion.set(bounds)
            if (band > 0) {
                outInsets.touchableRegion.op(0, top, decorView.width, decorHeight, Region.Op.UNION)
            }
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        floatingPanelBounds = null
        window?.window?.let { applyFloatingWindowLayout(it) }
        window?.window?.decorView?.let { decorView ->
            decorView.requestApplyInsets()
            decorView.requestLayout()
        }
    }

    override fun onDestroy() {
        clipboardManager?.stopListening()
        clipboardManager = null
        super.onDestroy()
        handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    }

    // Cursor update Methods
    override fun onUpdateCursorAnchorInfo(cursorAnchorInfo: CursorAnchorInfo) {
        super.onUpdateCursorAnchorInfo(cursorAnchorInfo)

        cursorMoved =
            if (ignoreCursorMove) {
                ignoreCursorMove = false
                false
            } else {
                Log.d(TAG, "cursor moved")
                cursorAnchorInfo.selectionStart != selectionStart ||
                    cursorAnchorInfo.selectionEnd != selectionEnd
            }

        currentKeyboardDefinition?.settings?.textProcessor?.handleCursorUpdate(
            this,
            selectionStart,
            selectionEnd,
            cursorAnchorInfo.selectionStart,
            cursorAnchorInfo.selectionEnd,
        )

        selectionStart = cursorAnchorInfo.selectionStart
        selectionEnd = cursorAnchorInfo.selectionEnd
    }

    override fun onEvaluateInputViewShown(): Boolean {
        val settingsRepo = (application as ThumbkeyApplication).appSettingsRepository
        val settings = settingsRepo.appSettings.getValue()
        val showOnScreenKeyboard =
            (settings?.showOnScreenKeyboard ?: DEFAULT_SHOW_ON_SCREEN_KEYBOARD).toBool()

        // Always call super implementation because Android docs says:
        // "If you override this method you must call through to the superclass implementation."
        // https://developer.android.com/reference/android/inputmethodservice/InputMethodService#onEvaluateInputViewShown()
        return super.onEvaluateInputViewShown() ||
            showOnScreenKeyboard
    }

    // Wear's text input screen doesn't show what you type, it leaves that to the keyboard. Show a
    // copy of it above the keys, unless the user turned off the fullscreen editor.
    private val watch by lazy { isWatch(this) }

    // A text field of type null has no text to show. Password fields don't get it: even masked,
    // the copy shows the last typed character for a moment if the system is set to, and all of a
    // visible password.
    private fun showTypedText(ei: EditorInfo?): Boolean =
        watch &&
            ei != null &&
            ei.inputType != InputType.TYPE_NULL &&
            !isPassword(ei.inputType) &&
            !fullscreenEditorDisabled()

    private fun fullscreenEditorDisabled(): Boolean {
        // The keyboard may not have loaded the settings yet
        val settings = (application as ThumbkeyApplication).appSettingsRepository.settingsNow()
        return (settings?.disableFullscreenEditor ?: DEFAULT_DISABLE_FULLSCREEN_EDITOR).toBool()
    }

    // Set while the framework decides whether to open the keyboard, see onShowInputRequested
    private var evaluatingShowRequest = false

    /*
     * The typed text is the framework's own copy of the text field, the extract view, which it
     * only shows in fullscreen mode. The framework only uses that mode in landscape, so on a watch
     * this turns it on for every text field it applies to, see showTypedText, even when the app
     * asks for IME_FLAG_NO_FULLSCREEN or IME_FLAG_NO_EXTRACT_UI. Elsewhere the framework decides,
     * as before. A floating keyboard is never fullscreen.
     */
    override fun onEvaluateFullscreenMode(): Boolean =
        if (isFloatingMode) {
            false
        } else {
            super.onEvaluateFullscreenMode() ||
                (!evaluatingShowRequest && showTypedText(currentInputEditorInfo))
        }

    // The framework won't open a fullscreen keyboard by itself, only when the user asks for it,
    // as it would cover the app. A watch may open the keyboard by itself, and it's the only way
    // to type there, so on a watch only the framework's own choice of fullscreen mode counts for
    // that. Phones keep the rule.
    override fun onShowInputRequested(
        flags: Int,
        configChange: Boolean,
    ): Boolean {
        if (!watch) return super.onShowInputRequested(flags, configChange)
        evaluatingShowRequest = true
        try {
            return super.onShowInputRequested(flags, configChange)
        } finally {
            evaluatingShowRequest = false
        }
    }

    override fun onStartInputView(
        editorInfo: EditorInfo?,
        restarting: Boolean,
    ) {
        super.onStartInputView(editorInfo, restarting)
        if (!watch) return
        // The framework only checks for fullscreen mode when the keyboard opens, not when it moves
        // to another text field
        updateFullscreenMode()
        // The theme may have changed since the view was made
        if (isFullscreenMode) extractTextView?.let { styleExtractTextView(it) }
    }

    // The themed extract view, on a watch
    private var extractTextView: ExtractTextView? = null

    // Called when the framework first goes fullscreen. A watch only goes fullscreen to show the
    // typed text, so it always gets the themed view.
    override fun onCreateExtractTextView(): View {
        if (!watch) return super.onCreateExtractTextView()
        return ExtractTextView(this).also {
            styleExtractTextView(it)
            extractTextView = it
        }
    }

    // The framework only moves the cursor in the extract view when the cursor moves, and relies
    // on the app's text field to report its new text. Wear's reply screen didn't report it after
    // a backspace, so read the text again. An edit that doesn't move the cursor, like a forward
    // delete, may still not show until the next one. If the app's report of such an edit arrives
    // after a read that already has it, the edit shows twice until the cursor next moves.
    override fun onUpdateSelection(
        oldSelStart: Int,
        oldSelEnd: Int,
        newSelStart: Int,
        newSelEnd: Int,
        candidatesStart: Int,
        candidatesEnd: Int,
    ) {
        super.onUpdateSelection(oldSelStart, oldSelEnd, newSelStart, newSelEnd, candidatesStart, candidatesEnd)
        val view = extractTextView ?: return
        if (!isExtractViewShown) return
        // As the framework asks for it, so the text starts at the same offset
        val request =
            ExtractedTextRequest().apply {
                flags = InputConnection.GET_TEXT_WITH_STYLES
                hintMaxLines = 10
                hintMaxChars = 10000
            }
        super.getCurrentInputConnection()?.getExtractedText(request, 0)?.let { view.setExtractedText(it) }
    }

    private fun styleExtractTextView(view: ExtractTextView) {
        // The keyboard may not have loaded the settings yet
        val settings = (application as ThumbkeyApplication).appSettingsRepository.settingsNow()
        val night =
            (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
        val colors = thumbkeyColorScheme(this, settings, night)
        view.applyTheme(colors)
    }

    // Disable the fullscreen text editor if set by the user. On a watch the typed text is shown
    // even when the app asks for no extract UI.
    override fun onUpdateExtractingVisibility(ei: EditorInfo) {
        if (showTypedText(ei)) {
            setExtractViewShown(true)
            return
        }
        val settingsRepo = (application as ThumbkeyApplication).appSettingsRepository
        val settings = settingsRepo.appSettings.getValue()
        if ((settings?.disableFullscreenEditor ?: DEFAULT_DISABLE_FULLSCREEN_EDITOR).toBool()) {
            ei.imeOptions =
                ei.imeOptions or EditorInfo.IME_FLAG_NO_EXTRACT_UI or EditorInfo.IME_FLAG_NO_FULLSCREEN
        }
        super.onUpdateExtractingVisibility(ei)
    }

    fun didCursorMove(): Boolean = cursorMoved

    fun ignoreNextCursorMove() {
        // This gets reset on the next call to `onUpdateCursorAnchorInfo`
        ignoreCursorMove = true
    }

    override fun onFinishInputView(finishingInput: Boolean) {
        // Must run before super, which commits any composing text as it stands.
        // Running after it would let the processor write its pending text a second time.
        currentKeyboardDefinition?.settings?.textProcessor?.handleFinishInput(this)
        super.onFinishInputView(finishingInput)
    }

    private var ignoreCursorMove: Boolean = false
    private var cursorMoved: Boolean = false
    private var selectionStart: Int = 0
    private var selectionEnd: Int = 0

    // ViewModelStore Methods
    override val viewModelStore = ViewModelStore()

    // SaveStateRegistry Methods
    private val savedStateRegistryController = SavedStateRegistryController.create(this)
    override val savedStateRegistry: SavedStateRegistry =
        savedStateRegistryController.savedStateRegistry

    fun clipboardUsePrivate(): Boolean {
        val settingsRepo = (application as ThumbkeyApplication).appSettingsRepository
        val settings = settingsRepo.appSettings.getValue()
        val clipboardHistoryEnabled = (settings?.clipboardHistoryEnabled ?: DEFAULT_CLIPBOARD_HISTORY_ENABLED).toBool()
        val usePrivateClipboard = (settings?.usePrivateClipboard ?: DEFAULT_USE_PRIVATE_CLIPBOARD).toBool()
        return clipboardHistoryEnabled && usePrivateClipboard
    }

    fun switchImeMode(): ImeSwitchMode {
        val settingsRepo = (application as ThumbkeyApplication).appSettingsRepository
        val settings = settingsRepo.appSettings.getValue()
        return ImeSwitchMode.entries[settings?.switchImeMode ?: DEFAULT_SWITCH_IME_MODE]
    }

    fun clipboardAddPrivateClip(text: String): Unit? = clipboardManager?.addPrivateClip(text)

    fun clipboardWasLastCopyDoneViaSystem(): Boolean = clipboardManager?.wasLastCopyOperationDoneViaSystem() ?: true

    fun clipboardGetLastClip(): String? = clipboardManager?.getLastClip()
}

// Returns `value` without Kotlin's null check, for a platform value that may be null
@Suppress("UNCHECKED_CAST")
private fun <T> unchecked(value: T?): T = value as T

// Text, web, number and visible password fields
private fun isPassword(inputType: Int): Boolean =
    when (inputType and (InputType.TYPE_MASK_CLASS or InputType.TYPE_MASK_VARIATION)) {
        InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD,
        InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD,
        InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD,
        InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_VARIATION_PASSWORD,
        -> true

        else -> false
    }
