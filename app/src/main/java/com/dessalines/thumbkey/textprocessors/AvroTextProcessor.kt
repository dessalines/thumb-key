package com.dessalines.thumbkey.textprocessors

import android.util.Log
import android.view.KeyEvent
import android.view.inputmethod.ExtractedTextRequest
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.utils.TAG

class AvroTextProcessor : TextProcessor {
    private var buffer = ""
    private var selectionStart = 0
    private var selectionEnd = 0
    private var lastConvertedLen = 0

    override fun handleCommitText(
        ime: IMEService,
        input: CharSequence,
    ) {
        val ic = ime.currentInputConnection
        val ch = input.firstOrNull() ?: return

        if (ch == ' ') {
            val bangla = AvroEngine.convert(buffer) + " "
            ic.commitText(bangla, 1)
            selectionStart += 1 // only the space is new movement; the word was already tracked
            selectionEnd = selectionStart
            lastConvertedLen = 0
            buffer = ""
        } else {
            buffer += input
            Log.d(TAG, "AvroProcessor: buffer='$buffer'")
            val converted = AvroEngine.convert(buffer)
            ic.setComposingText(converted, 1)
            selectionStart += converted.length - lastConvertedLen
            selectionEnd = selectionStart
            lastConvertedLen = converted.length
        }
    }

    override fun handleKeyEvent(
        ime: IMEService,
        ev: KeyEvent,
    ) {
        val ic = ime.currentInputConnection
        if (ev.keyCode == KeyEvent.KEYCODE_DEL && buffer.isNotEmpty()) {
            buffer = buffer.dropLast(1)
            val converted = AvroEngine.convert(buffer)
            ic.setComposingText(converted, 1)
            selectionStart += converted.length - lastConvertedLen
            selectionEnd = selectionStart
            lastConvertedLen = converted.length
        } else {
            ic.sendKeyEvent(ev)
        }
    }

    override fun handleFinishInput(ime: IMEService) {
        if (buffer.isNotEmpty()) {
            ime.currentInputConnection.finishComposingText()
            buffer = ""
        }
        lastConvertedLen = 0
    }

    override fun handleCursorUpdate(
        ime: IMEService,
        oldSelStart: Int,
        oldSelEnd: Int,
        newSelStart: Int,
        newSelEnd: Int,
    ) {
        if (oldSelStart == newSelStart || selectionStart == newSelStart) return
        selectionStart = newSelStart
        selectionEnd = newSelEnd
        lastConvertedLen = 0
        if (buffer.isNotEmpty()) {
            // user moved the cursor mid-word: seal what's on screen, start fresh
            ime.currentInputConnection.finishComposingText()
            buffer = ""
        }
    }

    override fun updateCursorPosition(ime: IMEService) {
        val extracted = ime.currentInputConnection.getExtractedText(ExtractedTextRequest(), 0)
        selectionStart = extracted.selectionStart
        selectionEnd = extracted.selectionEnd
        lastConvertedLen = 0
    }
}
