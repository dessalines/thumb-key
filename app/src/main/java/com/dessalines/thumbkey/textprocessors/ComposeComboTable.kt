package com.dessalines.thumbkey.textprocessors

/**
 * Sequence table for the "compose combo" system, modeled on the X11 / Linux compose key.
 *
 * Unlike [com.dessalines.thumbkey.utils.KeyAction.ComposeLastKey], which rewrites the single
 * character before the cursor, these sequences are typed *after* a compose key and may be any
 * length. That is what makes characters such as © reachable: they are not a diacritic applied
 * to a base letter, so a dead key cannot express them.
 *
 * The table must stay **prefix-free**: no sequence may be a proper prefix of another, because
 * a match is committed as soon as it is found. `..` is therefore … and there can be no `...`,
 * and `--` is the em dash, so nothing longer may start with it.
 *
 * Sequences follow the X11 `Compose` file so muscle memory carries over from desktop Linux. See
 * https://gitlab.freedesktop.org/xorg/lib/libx11/-/blob/master/nls/en_US.UTF-8/Compose.pre
 *
 * Every sequence here either matches X11 exactly or is unused by X11. A few are deliberate
 * additions, each sitting alongside the X11 spelling rather than replacing it:
 *
 *  - `!=` for ≠, which programmers type without thinking (X11: `/=`, `=/`)
 *  - `==` for ≡, which is what people guess (X11: `=_`)
 *  - `00` for ∞ (X11: `88`)
 *  - `sz` for ß, the German convention (X11: `ss`)
 *  - `^n` for ⁿ (X11: `^_n`)
 *  - `ii` and `II` for the Turkish pair, easier to reach than the X11 `i.` and `I.`
 *  - `-m`, `m-`, `-n` and `n-` for the dashes, named after the printer's em and en
 *
 * The dashes are the one place where an X11 spelling is dropped rather than joined. X11 has `---`
 * for — and `--.` for –, which on a phone means three deliberate taps for the commoner of the two.
 * Here `--` is the em dash outright, which costs the X11 pair: once `--` resolves, no sequence
 * starting with `--` can ever be reached. The en dash keeps a spelling of its own in `-n` and `n-`,
 * with `-m` and `m-` alongside `--` for symmetry.
 *
 * One further sequence is taken over rather than left alone. X11 uses `c` followed by a letter for the
 * caron, 26 entries of which `co` is ǒ. None of that family is implemented here, and layouts
 * with a caron dead key can write ǒ as `o` plus the dead key, so `co` is used for © instead —
 * the spelling people reach for first. Adding the X11 caron family later would mean giving `co`
 * back. `ro` for ® is free either way; X11 defines only four `r` sequences and that is not one.
 */
object ComposeComboTable {
    val sequences: Map<String, String> =
        buildMap {
            // Legal and typographic symbols. X11 defines both letter orders for these, so
            // either habit works.
            put("oc", "©")
            put("OC", "©")
            put("CO", "©")
            put("co", "©") // X11 spends this on ǒ; see the note above
            put("or", "®")
            put("OR", "®")
            put("RO", "®")
            put("ro", "®")
            put("tm", "™")
            put("TM", "™")
            put("so", "§")
            put("p!", "¶")
            put("%o", "‰")
            put("..", "…")
            put("--", "—") // X11 spells this `---`; see the note above
            put("-m", "—")
            put("m-", "—")
            put("-n", "–") // X11 spells the en dash `--.`
            put("n-", "–")
            put("<<", "«")
            put(">>", "»")
            put("!!", "¡")
            put("??", "¿")
            put(".-", "·")

            // Mathematics and programming
            put("+-", "±")
            put("-:", "÷")
            put("xx", "×")
            put("/=", "≠")
            put("=/", "≠")
            put("!=", "≠") // not X11, but the habit every programmer already has
            put("=_", "≡")
            put("==", "≡") // not X11, but it is what people guess
            put("<=", "≤")
            put(">=", "≥")
            put("~~", "≈")
            put("88", "∞")
            put("00", "∞")
            put("oo", "°")
            put("{}", "∅")
            put("/v", "√")
            put("mu", "µ")

            // Arrows
            put("->", "→")
            put("<-", "←")
            put("<>", "⋄")

            // Fractions
            put("12", "½")
            put("13", "⅓")
            put("23", "⅔")
            put("14", "¼")
            put("34", "¾")

            // Super- and subscripts. Multi-digit runs are typed one sequence per digit, so ¹²
            // is ^1 then ^2.
            put("^0", "⁰")
            put("^1", "¹")
            put("^2", "²")
            put("^3", "³")
            put("^4", "⁴")
            put("^5", "⁵")
            put("^6", "⁶")
            put("^7", "⁷")
            put("^8", "⁸")
            put("^9", "⁹")
            put("^n", "ⁿ")
            put("_0", "₀")
            put("_1", "₁")
            put("_2", "₂")
            put("_3", "₃")
            put("_4", "₄")
            put("_5", "₅")
            put("_6", "₆")
            put("_7", "₇")
            put("_8", "₈")
            put("_9", "₉")

            // Currency
            put("e=", "€")
            put("E=", "€")
            put("l-", "£")
            put("L-", "£")
            put("y=", "¥")
            put("Y=", "¥")
            put("c/", "¢")
            put("/c", "¢")
            put("C/", "₡") // colón, per X11; the cent sign is lowercase

            // Turkish dotted and dotless i. X11 treats the dot as movable rather than
            // additive: adding it to a lowercase i takes it away, and to an uppercase I
            // puts it on.
            put("i.", "ı")
            put("ii", "ı")
            put("I.", "İ")
            put("II", "İ")

            // Ligatures and standalone letters
            put("ss", "ß")
            put("sz", "ß")
            put("SS", "ẞ")
            put("ae", "æ")
            put("AE", "Æ")
            put("oe", "œ")
            put("OE", "Œ")
            put("o/", "ø")
            put("O/", "Ø")
            put("aa", "å")
            put("AA", "Å")
            put(",c", "ç")
            put(",C", "Ç")

            // Diacritics, mark first, as on a desktop compose key. The dead keys already on this
            // layout produce the same letters in the opposite order (`n` then `~`), so both
            // habits work side by side.
            putDiacritic("\"", "aäAÄeëEËiïIÏoöOÖuüUÜyÿ")
            putDiacritic("'", "aáAÁeéEÉiíIÍoóOÓuúUÚyýYÝ")
            putDiacritic("`", "aàAÀeèEÈiìIÌoòOÒuùUÙ")
            putDiacritic("^", "aâAÂeêEÊiîIÎoôOÔuûUÛ")
            putDiacritic("~", "aãAÃnñNÑoõOÕ")

            // Marks with no dead key on any layout. Dot above and macron mark stress and vowel
            // length; together with dot below they cover Pali and Sanskrit transliteration, where
            // ā ī ū come from the macron, ṁ ṅ from the dot above, and ṃ ṇ ṭ ḍ ḷ from the dot
            // below. Note that `.i` is the Turkish dotless ı rather than an i with a second dot,
            // which is X11's convention and the reason the Turkish pair needs no special case.
            putDiacritic(".", "aȧbḃcċdḋeėfḟgġhḣiımṁnṅoȯpṗrṙsṡtṫwẇxẋyẏzżAȦBḂCĊDḊEĖFḞGĠHḢIİMṀNṄOȮPṖRṘSṠTṪWẆXẊYẎZŻ")
            putDiacritic("_", "aāeēgḡiīoōuūyȳAĀEĒGḠIĪOŌUŪYȲ")
            putDiacritic("!", "aạbḅdḍeẹhḥiịkḳlḷmṃnṇoọrṛsṣtṭuụvṿwẉyỵzẓAẠBḄDḌEẸHḤIỊKḲLḶMṂNṆOỌRṚSṢTṬUỤVṾWẈYỴZẒ")
        }

    /** Every proper prefix of every sequence, used to decide whether to keep buffering. */
    private val prefixes: Set<String> =
        buildSet {
            sequences.keys.forEach { seq ->
                for (i in 1 until seq.length) {
                    add(seq.substring(0, i))
                }
            }
        }

    /** True when [buffer] could still grow into a valid sequence. */
    fun isPrefix(buffer: String): Boolean = prefixes.contains(buffer)

    /** The character [buffer] resolves to, or null if it is not a complete sequence. */
    fun match(buffer: String): String? = sequences[buffer]
}

/**
 * Adds one entry per base/accented pair, given as a flat "aäAÄ" style string. Purely to keep the
 * diacritic block readable.
 */
private fun MutableMap<String, String>.putDiacritic(
    mark: String,
    pairs: String,
) {
    pairs.chunked(2).forEach { pair ->
        put(mark + pair[0], pair[1].toString())
    }
}
