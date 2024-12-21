package com.dessalines.thumbkey

import android.inputmethodservice.InputMethodService
import android.view.inputmethod.InputConnection
import com.dessalines.thumbkey.utils.AbbreviationManager
import com.dessalines.thumbkey.utils.KeyAction
import android.util.Log
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
import com.dessalines.thumbkey.utils.TAG

private const val IME_ACTION_CUSTOM_LABEL = EditorInfo.IME_MASK_ACTION + 1

class IMEService :
    InputMethodService(),
    LifecycleOwner,
    ViewModelStoreOwner,
    SavedStateRegistryOwner {

    private lateinit var abbreviationManager: AbbreviationManager
    private var currentInputConnection: InputConnection? = null

    private fun getCurrentText(): String {
        val ic = currentInputConnection ?: return ""
        val beforeCursor = ic.getTextBeforeCursor(1000, 0) ?: return ""
        return beforeCursor.toString()
    }

    fun handleKeyAction(action: KeyAction) {
        when (action) {
            is KeyAction.CommitText -> {
                if (action.text == " ") {
                    // Check for abbreviation when space is pressed
                    handleAbbreviationExpansion()
                } else {
                    currentInputConnection?.commitText(action.text, 1)
                }
            }
            is KeyAction.DeleteKeyAction -> {
                currentInputConnection?.deleteSurroundingText(1, 0)
            }
            is KeyAction.DeleteWordBeforeCursor -> {
                val text = getCurrentText()
                val lastWord = text.split(" ").last()
                currentInputConnection?.deleteSurroundingText(lastWord.length, 0)
            }
            is KeyAction.DeleteWordAfterCursor -> {
                val afterCursor = currentInputConnection?.getTextAfterCursor(1000, 0) ?: return
                val nextWord = afterCursor.split(" ").firstOrNull() ?: return
                currentInputConnection?.deleteSurroundingText(0, nextWord.length)
            }
            is KeyAction.ReplaceLastText -> {
                currentInputConnection?.deleteSurroundingText(action.trimCount, 0)
                currentInputConnection?.commitText(action.text, 1)
            }
            is KeyAction.SendEvent -> {
                currentInputConnection?.sendKeyEvent(action.event)
            }
            is KeyAction.ToggleShiftMode,
            is KeyAction.ToggleNumericMode,
            is KeyAction.ToggleEmojiMode,
            is KeyAction.ToggleCapsLock,
            is KeyAction.SwitchLanguage,
            is KeyAction.SwitchIME,
            is KeyAction.SwitchIMEVoice,
            is KeyAction.GotoSettings -> {
                // These actions are handled by the keyboard UI
            }
            is KeyAction.IMECompleteAction -> {
                // A lot of apps like discord and slack use weird IME actions,
                // so its best to only check the none case
                when (val imeAction = getImeActionCode()) {
                    EditorInfo.IME_ACTION_NONE -> {
                        currentInputConnection?.commitText("\n", 1)
                    }
                    IME_ACTION_CUSTOM_LABEL -> {
                        currentInputConnection?.performEditorAction(currentInputEditorInfo.actionId)
                    }
                    else -> {
                        currentInputConnection?.performEditorAction(imeAction)
                    }
                }
            }
            else -> {
                // Handle any other actions
            }
        }
    }

    private fun handleAbbreviationExpansion() {
        val currentText = getCurrentText()
        
        val (shouldExpand, expandedText) = abbreviationManager.checkAndExpand(currentText)
        
        if (shouldExpand) {
            val ic = currentInputConnection ?: run {
                return
            }
            // Delete the abbreviation
            val lastWord = currentText.split(Regex("[ \n]")).last()
            ic.deleteSurroundingText(lastWord.length, 0)
            
            // Insert the expansion and a space
            ic.commitText(expandedText + " ", 1)
        } else {
            currentInputConnection?.commitText(" ", 1)
        }
    }

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
        currentInputConnection = getCurrentInputConnection()
        val view = this.setupView()
        this.setInputView(view)
    }

    // Lifecycle Methods
    private var lifecycleRegistry: LifecycleRegistry = LifecycleRegistry(this)

    private fun handleLifecycleEvent(event: Lifecycle.Event) = lifecycleRegistry.handleLifecycleEvent(event)

    override val lifecycle = lifecycleRegistry

    override fun onCreate() {
        super.onCreate()
        try {
            abbreviationManager = AbbreviationManager(applicationContext)
        } catch (e: Exception) {
            Log.e(TAG, "Error creating AbbreviationManager: ${e.message}", e)
        }
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

        cursorMoved =
            if (ignoreCursorMove) {
                ignoreCursorMove = false
                false
            } else {
                cursorAnchorInfo.selectionStart != selectionStart ||
                    cursorAnchorInfo.selectionEnd != selectionEnd
            }

        selectionStart = cursorAnchorInfo.selectionStart
        selectionEnd = cursorAnchorInfo.selectionEnd
    }

    fun didCursorMove(): Boolean = cursorMoved

    fun ignoreNextCursorMove() {
        // This gets reset on the next call to `onUpdateCursorAnchorInfo`
        ignoreCursorMove = true
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

    // IME Action Methods
    private fun getImeActionCode(): Int {
        val ei = currentInputEditorInfo

        return if ((ei.imeOptions and EditorInfo.IME_FLAG_NO_ENTER_ACTION) != 0) {
            EditorInfo.IME_ACTION_NONE
        } else {
            // Note: this is different from editorInfo.actionId, hence "ImeOptionsActionId"
            ei.imeOptions and EditorInfo.IME_MASK_ACTION
        }
    }
}
