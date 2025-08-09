package com.dessalines.thumbkey.textprocessors

import android.view.KeyEvent
import com.dessalines.thumbkey.IMEService

interface TextProcessor {
    fun processInput(
        ime: IMEService,
        input: CharSequence,
    )

    fun handleKeyEvent(
        ime: IMEService,
        ev: KeyEvent,
    )

    fun handleFinishInput(ime: IMEService)

    fun resetState()
}
