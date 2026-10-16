package com.dessalines.thumbkey.utils

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class SpanishAutoCapitalizerTest {
    @Test
    fun capitalizesTheLetterAfterEitherOpeningMark() {
        assertEquals("A", spanishOpeningMarkReplacement("¿a"))
        assertEquals("B", spanishOpeningMarkReplacement("¡b"))
    }

    @Test
    fun capitalizesAfterAnyNumberOfOpeningMarks() {
        assertEquals("Ñ", spanishOpeningMarkReplacement("¡¿¡ñ"))
    }

    @Test
    fun onlyCapitalizesLowercaseLettersImmediatelyAfterOpeningMarks() {
        assertNull(spanishOpeningMarkReplacement("¿A"))
        assertNull(spanishOpeningMarkReplacement("¿ "))
        assertNull(spanishOpeningMarkReplacement("a"))
        assertNull(spanishOpeningMarkReplacement(null))
    }
}
