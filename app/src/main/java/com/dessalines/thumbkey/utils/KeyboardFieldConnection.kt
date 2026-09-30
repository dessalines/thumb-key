package com.dessalines.thumbkey.utils

import android.text.Editable
import android.text.Selection
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.BaseInputConnection
import kotlin.math.max
import kotlin.math.min

/**
 * A text field inside the keyboard, such as sketch mode's search field. Redirect the keyboard's
 * input to it (IMEService.setInputRedirect) and its keys type here; `onChange` gets the text
 * after every edit.
 */
class KeyboardFieldConnection(
    view: View,
    text: String,
    private val onChange: (String) -> Unit,
) : BaseInputConnection(view, true) {
    private val editable: Editable = Editable.Factory.getInstance().newEditable(text)

    init {
        Selection.setSelection(editable, editable.length)
    }

    override fun getEditable(): Editable = editable

    private fun changed(result: Boolean): Boolean {
        onChange(editable.toString())
        return result
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
}
