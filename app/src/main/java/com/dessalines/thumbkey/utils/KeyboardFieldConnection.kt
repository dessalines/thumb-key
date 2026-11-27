package com.dessalines.thumbkey.utils

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.text.Editable
import android.text.Selection
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.BaseInputConnection
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextRange
import kotlin.math.max
import kotlin.math.min

/**
 * A text field inside the keyboard, such as sketch mode's search field. Redirect the keyboard's
 * input to it (IMEService.setInputRedirect) and its keys type here; `onChange` gets the text
 * after every edit. Select all, cut, copy, paste, undo and redo work in it too.
 */
class KeyboardFieldConnection(
    private val view: View,
    text: String,
    private val onChange: (String) -> Unit,
) : BaseInputConnection(view, true) {
    private val editable: Editable = Editable.Factory.getInstance().newEditable(text)

    // The text and selection at some point, for undo and redo
    private data class Snapshot(
        val text: String,
        val selection: TextRange,
    )

    private val undoStack = ArrayDeque<Snapshot>()
    private val redoStack = ArrayDeque<Snapshot>()
    private var lastSnapshot: Snapshot

    /** The selection, or the cursor when it's collapsed, for drawing the field. */
    var selection by mutableStateOf(TextRange(editable.length))
        private set

    init {
        Selection.setSelection(editable, editable.length)
        lastSnapshot = snapshot()
    }

    override fun getEditable(): Editable = editable

    private fun snapshot(): Snapshot {
        val start = Selection.getSelectionStart(editable).coerceAtLeast(0)
        val end = Selection.getSelectionEnd(editable).coerceAtLeast(0)
        return Snapshot(editable.toString(), TextRange(min(start, end), max(start, end)))
    }

    private fun changed(result: Boolean): Boolean {
        val current = snapshot()
        // Only text changes can be undone, not cursor moves
        if (current.text != lastSnapshot.text) {
            undoStack.addLast(lastSnapshot)
            if (undoStack.size > MAX_UNDO) undoStack.removeFirst()
            redoStack.clear()
        }
        lastSnapshot = current
        selection = current.selection
        onChange(current.text)
        return result
    }

    private fun restore(target: Snapshot) {
        editable.replace(0, editable.length, target.text)
        Selection.setSelection(editable, target.selection.start, target.selection.end)
        lastSnapshot = target
        selection = target.selection
        onChange(target.text)
    }

    fun undo() {
        val previous = undoStack.removeLastOrNull() ?: return
        redoStack.addLast(lastSnapshot)
        restore(previous)
    }

    fun redo() {
        val next = redoStack.removeLastOrNull() ?: return
        undoStack.addLast(lastSnapshot)
        restore(next)
    }

    private val clipboard get() = view.context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

    // Copies the selection to the system clipboard, and says if there was one
    private fun copySelection(): Boolean {
        val selected = getSelectedText(0)
        if (selected.isNullOrEmpty()) return false
        clipboard.setPrimaryClip(ClipData.newPlainText(null, selected))
        return true
    }

    // The keys' select all, cut, copy and paste. Pasting from the keyboard's own clipboard
    // history commits the text instead, which works already.
    override fun performContextMenuAction(id: Int): Boolean {
        when (id) {
            android.R.id.selectAll -> {
                Selection.setSelection(editable, 0, editable.length)
            }

            android.R.id.copy -> {
                copySelection()
            }

            android.R.id.cut -> {
                if (copySelection()) return commitText("", 1)
            }

            android.R.id.paste, android.R.id.pasteAsPlainText -> {
                val text = clipboard.primaryClip?.getItemAt(0)?.coerceToText(view.context)
                if (!text.isNullOrEmpty()) return commitText(text.toString(), 1)
            }

            else -> {
                return false
            }
        }
        return changed(true)
    }

    // The offsets one code point before and after `offset`
    private fun before(offset: Int) = offset - Character.charCount(Character.codePointBefore(editable, offset))

    private fun after(offset: Int) = offset + Character.charCount(Character.codePointAt(editable, offset))

    fun clear() {
        editable.clear()
        Selection.setSelection(editable, 0)
        changed(true)
    }

    override fun commitText(
        text: CharSequence?,
        newCursorPosition: Int,
    ) = changed(super.commitText(text, newCursorPosition))

    override fun setComposingText(
        text: CharSequence?,
        newCursorPosition: Int,
    ) = changed(super.setComposingText(text, newCursorPosition))

    override fun finishComposingText() = changed(super.finishComposingText())

    override fun deleteSurroundingText(
        beforeLength: Int,
        afterLength: Int,
    ) = changed(super.deleteSurroundingText(beforeLength, afterLength))

    override fun setSelection(
        start: Int,
        end: Int,
    ) = changed(super.setSelection(start, end))

    // Key events would go to the keyboard's own view, so handle the ones the keys send here
    override fun sendKeyEvent(event: KeyEvent): Boolean {
        if (event.action != KeyEvent.ACTION_DOWN) return true
        if (event.isCtrlPressed) return ctrlShortcut(event)
        val start = min(Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable)).coerceAtLeast(0)
        val end = max(Selection.getSelectionStart(editable), Selection.getSelectionEnd(editable)).coerceAtLeast(0)
        when (event.keyCode) {
            KeyEvent.KEYCODE_DEL -> {
                when {
                    start != end -> editable.delete(start, end)
                    start > 0 -> editable.delete(before(start), start)
                }
            }

            KeyEvent.KEYCODE_FORWARD_DEL -> {
                when {
                    start != end -> editable.delete(start, end)
                    end < editable.length -> editable.delete(end, after(end))
                }
            }

            KeyEvent.KEYCODE_DPAD_LEFT -> {
                Selection.setSelection(editable, if (start > 0) before(start) else 0)
            }

            KeyEvent.KEYCODE_DPAD_RIGHT -> {
                Selection.setSelection(editable, if (end < editable.length) after(end) else end)
            }

            else -> {
                val char = event.unicodeChar
                if (char != 0 && event.keyCode != KeyEvent.KEYCODE_ENTER) {
                    return commitText(String(Character.toChars(char)), 1)
                }
            }
        }
        return changed(true)
    }

    // Ctrl+A, X, C, V, Z and Shift+Z (or Y), as sent by the keys' modifier layers and undo and
    // redo
    private fun ctrlShortcut(event: KeyEvent): Boolean {
        when (event.keyCode) {
            KeyEvent.KEYCODE_A -> return performContextMenuAction(android.R.id.selectAll)
            KeyEvent.KEYCODE_X -> return performContextMenuAction(android.R.id.cut)
            KeyEvent.KEYCODE_C -> return performContextMenuAction(android.R.id.copy)
            KeyEvent.KEYCODE_V -> return performContextMenuAction(android.R.id.paste)
            KeyEvent.KEYCODE_Z -> if (event.isShiftPressed) redo() else undo()
            KeyEvent.KEYCODE_Y -> redo()
        }
        return true
    }

    private companion object {
        const val MAX_UNDO = 100
    }
}
