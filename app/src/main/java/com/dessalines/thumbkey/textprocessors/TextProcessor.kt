package com.dessalines.thumbkey.textprocessors

import android.view.KeyEvent
import com.dessalines.thumbkey.IMEService

interface TextProcessor {
    fun handleCommitText(
        ime: IMEService,
        input: CharSequence,
    )

    fun handleKeyEvent(
        ime: IMEService,
        ev: KeyEvent,
    )

    fun handleFinishInput(ime: IMEService)

    fun handleCursorUpdate(
        ime: IMEService,
        oldSelStart: Int,
        oldSelEnd: Int,
        newSelStart: Int,
        newSelEnd: Int,
    )
}
