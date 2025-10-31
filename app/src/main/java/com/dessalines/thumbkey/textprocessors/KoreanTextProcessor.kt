package com.dessalines.thumbkey.textprocessors

import android.util.Log
import android.view.KeyEvent
import android.view.inputmethod.ExtractedTextRequest
import android.view.inputmethod.InputConnection
import com.dessalines.thumbkey.IMEService
import com.dessalines.thumbkey.utils.TAG

private const val UNICODE_BASE = 0xAC00
private const val LEADING_MULTIPLIER = 588
private const val VOWEL_MULTIPLIER = 28

object KoreanLetters {
    private val leadingConsonants: Set<Char> =
        setOf(
            'ㄱ',
            'ㄲ',
            'ㄴ',
            'ㄷ',
            'ㄸ',
            'ㄹ',
            'ㅁ',
            'ㅂ',
            'ㅃ',
            'ㅅ',
            'ㅆ',
            'ㅇ',
            'ㅈ',
            'ㅉ',
            'ㅊ',
            'ㅋ',
            'ㅌ',
            'ㅍ',
            'ㅎ',
        )
    private val vowels: Set<Char> =
        setOf(
            'ㅏ',
            'ㅐ',
            'ㅑ',
            'ㅒ',
            'ㅓ',
            'ㅔ',
            'ㅕ',
            'ㅖ',
            'ㅗ',
            'ㅘ',
            'ㅙ',
            'ㅚ',
            'ㅛ',
            'ㅜ',
            'ㅝ',
            'ㅞ',
            'ㅟ',
            'ㅠ',
            'ㅡ',
            'ㅢ',
            'ㅣ',
        )
    private val trailingConsonants: Set<Char> =
        setOf(
            '\u0000',
            'ㄱ',
            'ㄲ',
            'ㄳ',
            'ㄴ',
            'ㄵ',
            'ㄶ',
            'ㄷ',
            'ㄹ',
            'ㄺ',
            'ㄻ',
            'ㄼ',
            'ㄽ',
            'ㄾ',
            'ㄿ',
            'ㅀ',
            'ㅁ',
            'ㅂ',
            'ㅄ',
            'ㅅ',
            'ㅆ',
            'ㅇ',
            'ㅈ',
            'ㅊ',
            'ㅋ',
            'ㅌ',
            'ㅍ',
            'ㅎ',
        )
    private val diphthongs: Map<Pair<Char, Char>, Char> =
        mapOf(
            ('ㅗ' to 'ㅏ') to 'ㅘ',
            ('ㅗ' to 'ㅐ') to 'ㅙ',
            ('ㅗ' to 'ㅣ') to 'ㅚ',
            ('ㅜ' to 'ㅓ') to 'ㅝ',
            ('ㅜ' to 'ㅔ') to 'ㅞ',
            ('ㅜ' to 'ㅣ') to 'ㅟ',
            ('ㅡ' to 'ㅣ') to 'ㅢ',
        )
    private val complexConsonants: Map<Pair<Char, Char>, Char> =
        mapOf(
            ('ㄱ' to 'ㅅ') to 'ㄳ',
            ('ㄴ' to 'ㅈ') to 'ㄵ',
            ('ㄴ' to 'ㅎ') to 'ㄶ',
            ('ㄹ' to 'ㄱ') to 'ㄺ',
            ('ㄹ' to 'ㅁ') to 'ㄻ',
            ('ㄹ' to 'ㅂ') to 'ㄼ',
            ('ㄹ' to 'ㅅ') to 'ㄽ',
            ('ㄹ' to 'ㅌ') to 'ㄾ',
            ('ㄹ' to 'ㅍ') to 'ㄿ',
            ('ㄹ' to 'ㅎ') to 'ㅀ',
            ('ㅂ' to 'ㅅ') to 'ㅄ',
        )

    fun isConsonant(c: Char): Boolean = c in leadingConsonants

    fun isVowel(c: Char): Boolean = c in vowels

    fun isTrailing(c: Char): Boolean = c in trailingConsonants

    fun isComplexConsonant(
        cons1: Char,
        cons2: Char,
    ): Boolean = Pair(cons1, cons2) in complexConsonants

    fun isDiphthong(
        vowel1: Char,
        vowel2: Char,
    ): Boolean = Pair(vowel1, vowel2) in diphthongs

    fun getLeadingIndex(leading: Char): Int = leadingConsonants.indexOf(leading)

    fun getVowelIndex(vowel: Char): Int = vowels.indexOf(vowel)

    fun getTrailingIndex(trailing: Char): Int = trailingConsonants.indexOf(trailing)

    fun getDiphthong(
        vowel1: Char,
        vowel2: Char,
    ): Char? = diphthongs[vowel1 to vowel2]

    fun getComplexConsonant(
        cons1: Char,
        cons2: Char,
    ): Char? = complexConsonants[cons1 to cons2]
}

enum class CompositionState {
    EMPTY,
    LEADING_CONSONANT,
    MEDIAL_VOWEL,
    TRAILING_CONSONANT,
    TRAILING_COMPLEX_CONSONANT,
    STANDALONE_COMPLEX_CONSONANT,
    STANDALONE_VOWEL,
}

class KoreanTextProcessor : TextProcessor {
    private var state: CompositionState = CompositionState.EMPTY
    private var leading = ""
    private var medialVowel = ""
    private var trailing = ""
    private var standaloneVowel = ""
    private var composedText = ""
    private var selectionStart = 0
    private var selectionEnd = 0

    override fun handleCommitText(
        ime: IMEService,
        input: CharSequence,
    ) {
        val ic = ime.currentInputConnection
        val inputChar = input[0]

        if (KoreanLetters.isConsonant(inputChar)) {
            processConsonant(ic, inputChar)
        } else if (KoreanLetters.isVowel(inputChar)) {
            processVowel(ic, inputChar)
        } else {
            processNonHangul(ic, input)
        }
        Log.d(TAG, "TextProcessor: state $state, cursor position $selectionStart")
    }

    override fun handleKeyEvent(
        ime: IMEService,
        ev: KeyEvent,
    ) {
        val ic = ime.currentInputConnection

        if (state == CompositionState.EMPTY) {
            ic.sendKeyEvent(ev)
            return
        }

        when (ev.keyCode) {
            KeyEvent.KEYCODE_DEL -> deleteKeyAction(ime, ev)
            else -> {
                // in any other case (ENTER, DEL, DPAD movement) it just needs to finish job
                handleFinishInput(ime)
                ic.sendKeyEvent(ev)
            }
        }
    }

    override fun handleFinishInput(ime: IMEService) {
        // if in EMPTY state it means processor has been reset
        if (state != CompositionState.EMPTY) {
            // finishComposingText doesn't move cursor
            ime.currentInputConnection.finishComposingText()
            resetState()
        }
    }

    override fun handleCursorUpdate(
        ime: IMEService,
        oldSelStart: Int,
        oldSelEnd: Int,
        newSelStart: Int,
        newSelEnd: Int,
    ) {
        // after committing each letter selectionStart is incremented to predict cursor position
        if (oldSelStart == newSelStart || selectionStart == newSelStart) return
        if (newSelStart != newSelEnd) {
            resetState()
        }

        Log.d(TAG, "TextProcessor: cursor moved -> $newSelStart")

        selectionStart = newSelStart
        selectionEnd = newSelEnd

        if (state != CompositionState.EMPTY) {
            handleFinishInput(ime)
        }
    }

    override fun updateCursorPosition(ime: IMEService) {
        val extracted = ime.currentInputConnection.getExtractedText(ExtractedTextRequest(), 0)
        selectionStart = extracted.selectionStart
        selectionEnd = extracted.selectionEnd
    }

    private fun resetState() {
        state = CompositionState.EMPTY
        leading = ""
        medialVowel = ""
        trailing = ""
        standaloneVowel = ""
        composedText = ""
    }

    private fun deleteKeyAction(
        ime: IMEService,
        ev: KeyEvent,
    ) {
        val ic = ime.currentInputConnection

        when (state) {
            CompositionState.EMPTY -> {
                ic.sendKeyEvent(ev)
            }
            CompositionState.LEADING_CONSONANT -> {
                resetState()
            }
            CompositionState.MEDIAL_VOWEL -> {
                if (medialVowel.length == 2) {
                    medialVowel = medialVowel.dropLast(1)
                    val unicode = calculateBlockUnicode(leading, medialVowel)
                    composedText = unicode.toChar().toString()
                } else {
                    state = CompositionState.LEADING_CONSONANT
                    composedText = leading
                }
            }
            CompositionState.TRAILING_CONSONANT -> {
                state = CompositionState.MEDIAL_VOWEL
                val unicode = calculateBlockUnicode(leading, medialVowel)
                composedText = unicode.toChar().toString()
            }
            CompositionState.TRAILING_COMPLEX_CONSONANT -> {
                state = CompositionState.TRAILING_CONSONANT
                trailing = trailing.dropLast(1)
                val unicode = calculateBlockUnicode(leading, medialVowel, trailing)
                composedText = unicode.toChar().toString()
            }
            CompositionState.STANDALONE_VOWEL -> {
                if (standaloneVowel.length > 1) {
                    standaloneVowel = standaloneVowel.dropLast(1)
                    composedText = standaloneVowel
                } else {
                    resetState()
                }
            }
            CompositionState.STANDALONE_COMPLEX_CONSONANT -> {
                leading = leading.dropLast(1)
                composedText = leading
            }
        }

        ic.setComposingText(composedText, 1)
    }

    private fun processConsonant(
        ic: InputConnection,
        consonant: Char,
    ) {
        when (state) {
            CompositionState.EMPTY -> {
                state = CompositionState.LEADING_CONSONANT
                leading = consonant.toString()
                composedText = leading

                selectionStart += 1
                selectionEnd += 1
            }
            CompositionState.LEADING_CONSONANT -> {
                if (KoreanLetters.isComplexConsonant(leading[0], consonant)) {
                    state = CompositionState.STANDALONE_COMPLEX_CONSONANT
                    leading += consonant
                    composedText = KoreanLetters.getComplexConsonant(leading[0], consonant).toString()
                } else {
                    commitCurrentBlock(ic)
                    state = CompositionState.LEADING_CONSONANT
                    leading = consonant.toString()
                    composedText = leading
                }
            }
            CompositionState.MEDIAL_VOWEL -> {
                if (KoreanLetters.isTrailing(consonant)) {
                    state = CompositionState.TRAILING_CONSONANT
                    trailing = consonant.toString()
                    val unicode = calculateBlockUnicode(leading, medialVowel, trailing)
                    composedText = unicode.toChar().toString()
                } else {
                    commitCurrentBlock(ic)

                    state = CompositionState.LEADING_CONSONANT
                    leading = consonant.toString()
                    composedText = leading
                }
            }
            CompositionState.TRAILING_CONSONANT -> {
                if (KoreanLetters.isComplexConsonant(trailing[0], consonant)) {
                    state = CompositionState.TRAILING_COMPLEX_CONSONANT
                    trailing += consonant
                    val unicode = calculateBlockUnicode(leading, medialVowel, trailing)
                    composedText = unicode.toChar().toString()
                } else {
                    commitCurrentBlock(ic)

                    state = CompositionState.LEADING_CONSONANT
                    leading = consonant.toString()
                    composedText = leading
                }
            }
            CompositionState.TRAILING_COMPLEX_CONSONANT,
            CompositionState.STANDALONE_COMPLEX_CONSONANT,
            CompositionState.STANDALONE_VOWEL,
            -> {
                commitCurrentBlock(ic)

                state = CompositionState.LEADING_CONSONANT
                leading = consonant.toString()
                composedText = leading
            }
        }

        ic.setComposingText(composedText, 1)
    }

    private fun processVowel(
        ic: InputConnection,
        vowel: Char,
    ) {
        when (state) {
            CompositionState.EMPTY -> {
                state = CompositionState.STANDALONE_VOWEL
                standaloneVowel = vowel.toString()
                composedText = standaloneVowel

                selectionStart += 1
                selectionEnd += 1
            }
            CompositionState.LEADING_CONSONANT -> {
                state = CompositionState.MEDIAL_VOWEL
                medialVowel = vowel.toString()
                val unicode = calculateBlockUnicode(leading, medialVowel)
                composedText = unicode.toChar().toString()
            }
            CompositionState.MEDIAL_VOWEL -> {
                if (KoreanLetters.isDiphthong(medialVowel[0], vowel) && medialVowel.length < 2) {
                    // state is the same
                    medialVowel += vowel
                    val unicode = calculateBlockUnicode(leading, medialVowel)
                    composedText = unicode.toChar().toString()
                } else {
                    commitCurrentBlock(ic)

                    state = CompositionState.STANDALONE_VOWEL
                    standaloneVowel = vowel.toString()
                    composedText = standaloneVowel
                }
            }
            CompositionState.TRAILING_CONSONANT,
            CompositionState.TRAILING_COMPLEX_CONSONANT,
            -> {
                val lastConsonant = trailing.last()
                trailing = trailing.dropLast(1)
                var unicode =
                    if (trailing.isNotEmpty()) {
                        calculateBlockUnicode(leading, medialVowel, trailing)
                    } else {
                        calculateBlockUnicode(leading, medialVowel)
                    }
                composedText = unicode.toChar().toString()
                commitCurrentBlock(ic)

                state = CompositionState.MEDIAL_VOWEL
                leading = lastConsonant.toString()
                medialVowel = vowel.toString()
                unicode = calculateBlockUnicode(leading, medialVowel)
                composedText = unicode.toChar().toString()
            }
            CompositionState.STANDALONE_COMPLEX_CONSONANT -> {
                val lastConsonant = leading.last().toString()
                composedText = leading.dropLast(1)
                commitCurrentBlock(ic)

                state = CompositionState.MEDIAL_VOWEL
                leading = lastConsonant
                medialVowel = vowel.toString()
                val unicode = calculateBlockUnicode(leading, medialVowel)
                composedText = unicode.toChar().toString()
            }
            CompositionState.STANDALONE_VOWEL -> {
                if (standaloneVowel.length == 1 && KoreanLetters.isDiphthong(standaloneVowel[0], vowel)) {
                    standaloneVowel += vowel
                    composedText = KoreanLetters.getDiphthong(standaloneVowel[0], vowel).toString()
                } else {
                    commitCurrentBlock(ic)
                    state = CompositionState.STANDALONE_VOWEL
                    standaloneVowel = vowel.toString()
                    composedText = standaloneVowel
                }
            }
        }

        ic.setComposingText(composedText, 1)
    }

    private fun processNonHangul(
        ic: InputConnection,
        input: CharSequence,
    ) {
        ic.commitText(composedText, 1)
        resetState()
        ic.commitText(input, 1)
        selectionStart += 1
        selectionEnd += 1
    }

    private fun commitCurrentBlock(ic: InputConnection) {
        Log.d(TAG, "TextProcessor: committing text: $composedText")
        ic.commitText(composedText, 1)
        resetState()
        selectionStart += 1
        selectionEnd += 1
    }

    private fun calculateBlockUnicode(
        lCons: String,
        medVow: String,
        tCons: String? = null,
    ): Int {
        var codepoint = UNICODE_BASE
        codepoint += KoreanLetters.getLeadingIndex(lCons[0]) * LEADING_MULTIPLIER

        if (medVow.length == 2) {
            val diphthong = KoreanLetters.getDiphthong(medVow[0], medVow[1]) ?: return 0xFFFD
            codepoint += KoreanLetters.getVowelIndex(diphthong) * VOWEL_MULTIPLIER
        } else {
            codepoint += KoreanLetters.getVowelIndex(medVow[0]) * VOWEL_MULTIPLIER
        }

        val tLength = tCons?.length ?: return codepoint

        if (tLength == 2) {
            val complex = KoreanLetters.getComplexConsonant(tCons[0], tCons[1]) ?: return 0xFFFD
            codepoint += KoreanLetters.getTrailingIndex(complex)
        } else {
            codepoint += KoreanLetters.getTrailingIndex(tCons[0])
        }

        return codepoint
    }
}
