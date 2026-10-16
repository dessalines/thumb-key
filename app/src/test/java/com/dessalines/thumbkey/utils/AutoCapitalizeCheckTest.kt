package com.dessalines.thumbkey.utils

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class AutoCapitalizeCheckTest {
    @Test
    fun keepsShiftedModeAfterSpanishOpeningMarks() {
        assertTrue(shouldAutoCapitalize(0, "¿"))
        assertTrue(shouldAutoCapitalize(0, "¡¿¡"))
    }

    @Test
    fun openingMarksDoNotKeepShiftedModeAfterTheNextCharacter() {
        assertFalse(shouldAutoCapitalize(0, "¿a"))
        assertFalse(shouldAutoCapitalize(0, "¡ "))
    }

    @Test
    fun preservesEditorCapsMode() {
        assertTrue(shouldAutoCapitalize(1, "a"))
    }
}
