package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.KeyAction
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ENMessagEaseComposeTest {
    @Test
    fun quotationMarksAreTypedLiterallyInBothLetterModes() {
        assertCommitText(KB_EN_MESSAGEASE_COMPOSED_MAIN.arr[2][1].topLeft, "\"")
        assertCommitText(KB_EN_MESSAGEASE_COMPOSED_SHIFTED.arr[2][1].topLeft, "\"")
    }

    @Test
    fun apostropheIsTypedLiterallyInBothLetterModes() {
        assertCommitText(KB_EN_MESSAGEASE_COMPOSED_MAIN.arr[2][1].topRight, "'")
        assertCommitText(KB_EN_MESSAGEASE_COMPOSED_SHIFTED.arr[2][1].topRight, "'")
    }

    private fun assertCommitText(
        key: com.dessalines.thumbkey.utils.KeyC?,
        expected: String,
    ) {
        val action = key?.action
        assertTrue("Expected a literal $expected key", action is KeyAction.CommitText)
        assertEquals(expected, (action as KeyAction.CommitText).text)
    }
}
