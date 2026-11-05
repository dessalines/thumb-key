package com.dessalines.thumbkey.textprocessors

/*
 * Avro Phonetic engine — faithful Kotlin port of jsAvroPhonetic v1.1.4
 * Original: Copyright (C) OmicronLab, Rifat Nabi (MPL 1.1)
 * https://github.com/torifat/jsAvroPhonetic
 */
object AvroEngine {
    private const val VOWELS = "aeiou"
    private const val CONSONANTS = "bcdfghjklmnpqrstvwxyz"
    private const val CASE_SENSITIVE = "oiudgjnrstyz"

    private data class Cond(
        val type: String,
        val scope: String,
        val value: String = "",
    )

    private data class Rule(
        val replace: String,
        val conds: List<Cond> = emptyList(),
    )

    private data class Pattern(
        val find: String,
        val replace: String,
        val rules: List<Rule> = emptyList(),
    )

    private fun c(
        type: String,
        scope: String,
        value: String = "",
    ) = Cond(type, scope, value)

    private fun rule(
        replace: String,
        vararg conds: Cond,
    ) = Rule(replace, conds.toList())

    // vowel renders as full letter at word start / after vowel, kar after consonant
    private fun sealRules(full: String) =
        listOf(
            rule(full, c("prefix", "!consonant"), c("suffix", "!exact", "`")),
            rule(full, c("prefix", "punctuation"), c("suffix", "!exact", "`")),
        )

    private val PATTERNS: List<Pattern> =
        listOf(
            Pattern("bhl", "ভ্ল"),
            Pattern("psh", "পশ"),
            Pattern("bdh", "ব্ধ"),
            Pattern("bj", "ব্জ"),
            Pattern("bd", "ব্দ"),
            Pattern("bb", "ব্ব"),
            Pattern("bl", "ব্ল"),
            Pattern("bh", "ভ"),
            Pattern("vl", "ভ্ল"),
            Pattern("b", "ব"),
            Pattern("v", "ভ"),
            Pattern("cNG", "চ্ঞ"),
            Pattern("cch", "চ্ছ"),
            Pattern("cc", "চ্চ"),
            Pattern("ch", "ছ"),
            Pattern("c", "চ"),
            Pattern("dhn", "ধ্ন"),
            Pattern("dhm", "ধ্ম"),
            Pattern("dgh", "দ্ঘ"),
            Pattern("ddh", "দ্ধ"),
            Pattern("dbh", "দ্ভ"),
            Pattern("dv", "দ্ভ"),
            Pattern("dm", "দ্ম"),
            Pattern("DD", "ড্ড"),
            Pattern("Dh", "ঢ"),
            Pattern("dh", "ধ"),
            Pattern("dg", "দ্গ"),
            Pattern("dd", "দ্দ"),
            Pattern("D", "ড"),
            Pattern("d", "দ"),
            Pattern("...", "..."),
            Pattern(".`", "."),
            Pattern("..", "।।"),
            Pattern(".", "।"),
            Pattern("ghn", "ঘ্ন"),
            Pattern("Ghn", "ঘ্ন"),
            Pattern("gdh", "গ্ধ"),
            Pattern("Gdh", "গ্ধ"),
            Pattern("gN", "গ্ণ"),
            Pattern("GN", "গ্ণ"),
            Pattern("gn", "গ্ন"),
            Pattern("Gn", "গ্ন"),
            Pattern("gm", "গ্ম"),
            Pattern("Gm", "গ্ম"),
            Pattern("gl", "গ্ল"),
            Pattern("Gl", "গ্ল"),
            Pattern("gg", "জ্ঞ"),
            Pattern("GG", "জ্ঞ"),
            Pattern("Gg", "জ্ঞ"),
            Pattern("gG", "জ্ঞ"),
            Pattern("gh", "ঘ"),
            Pattern("Gh", "ঘ"),
            Pattern("g", "গ"),
            Pattern("G", "গ"),
            Pattern("hN", "হ্ণ"),
            Pattern("hn", "হ্ন"),
            Pattern("hm", "হ্ম"),
            Pattern("hl", "হ্ল"),
            Pattern("h", "হ"),
            Pattern("jjh", "জ্ঝ"),
            Pattern("jNG", "জ্ঞ"),
            Pattern("jh", "ঝ"),
            Pattern("jj", "জ্জ"),
            Pattern("j", "জ"),
            Pattern("J", "জ"),
            Pattern("kkhN", "ক্ষ্ণ"),
            Pattern("kShN", "ক্ষ্ণ"),
            Pattern("kkhm", "ক্ষ্ম"),
            Pattern("kShm", "ক্ষ্ম"),
            Pattern("kxN", "ক্ষ্ণ"),
            Pattern("kxm", "ক্ষ্ম"),
            Pattern("kkh", "ক্ষ"),
            Pattern("kSh", "ক্ষ"),
            Pattern("ksh", "কশ"),
            Pattern("kx", "ক্ষ"),
            Pattern("kk", "ক্ক"),
            Pattern("kT", "ক্ট"),
            Pattern("kt", "ক্ত"),
            Pattern("kl", "ক্ল"),
            Pattern("ks", "ক্স"),
            Pattern("kh", "খ"),
            Pattern("k", "ক"),
            Pattern("lbh", "ল্ভ"),
            Pattern("ldh", "ল্ধ"),
            Pattern("lkh", "লখ"),
            Pattern("lgh", "লঘ"),
            Pattern("lph", "লফ"),
            Pattern("lk", "ল্ক"),
            Pattern("lg", "ল্গ"),
            Pattern("lT", "ল্ট"),
            Pattern("lD", "ল্ড"),
            Pattern("lp", "ল্প"),
            Pattern("lv", "ল্ভ"),
            Pattern("lm", "ল্ম"),
            Pattern("ll", "ল্ল"),
            Pattern("lb", "ল্ব"),
            Pattern("l", "ল"),
            Pattern("mth", "ম্থ"),
            Pattern("mph", "ম্ফ"),
            Pattern("mbh", "ম্ভ"),
            Pattern("mpl", "মপ্ল"),
            Pattern("mn", "ম্ন"),
            Pattern("mp", "ম্প"),
            Pattern("mv", "ম্ভ"),
            Pattern("mm", "ম্ম"),
            Pattern("ml", "ম্ল"),
            Pattern("mb", "ম্ব"),
            Pattern("mf", "ম্ফ"),
            Pattern("m", "ম"),
            Pattern("0", "০"),
            Pattern("1", "১"),
            Pattern("2", "২"),
            Pattern("3", "৩"),
            Pattern("4", "৪"),
            Pattern("5", "৫"),
            Pattern("6", "৬"),
            Pattern("7", "৭"),
            Pattern("8", "৮"),
            Pattern("9", "৯"),
            Pattern("NgkSh", "ঙ্ক্ষ"),
            Pattern("Ngkkh", "ঙ্ক্ষ"),
            Pattern("NGch", "ঞ্ছ"),
            Pattern("Nggh", "ঙ্ঘ"),
            Pattern("Ngkh", "ঙ্খ"),
            Pattern("NGjh", "ঞ্ঝ"),
            Pattern("ngOU", "ঙ্গৌ"),
            Pattern("ngOI", "ঙ্গৈ"),
            Pattern("Ngkx", "ঙ্ক্ষ"),
            Pattern("NGc", "ঞ্চ"),
            Pattern("nch", "ঞ্ছ"),
            Pattern("njh", "ঞ্ঝ"),
            Pattern("ngh", "ঙ্ঘ"),
            Pattern("Ngk", "ঙ্ক"),
            Pattern("Ngx", "ঙ্ষ"),
            Pattern("Ngg", "ঙ্গ"),
            Pattern("Ngm", "ঙ্ম"),
            Pattern("NGj", "ঞ্জ"),
            Pattern("ndh", "ন্ধ"),
            Pattern("nTh", "ন্ঠ"),
            Pattern("NTh", "ণ্ঠ"),
            Pattern("nth", "ন্থ"),
            Pattern("nkh", "ঙ্খ"),
            Pattern("ngo", "ঙ্গ"),
            Pattern("nga", "ঙ্গা"),
            Pattern("ngi", "ঙ্গি"),
            Pattern("ngI", "ঙ্গী"),
            Pattern("ngu", "ঙ্গু"),
            Pattern("ngU", "ঙ্গূ"),
            Pattern("nge", "ঙ্গে"),
            Pattern("ngO", "ঙ্গো"),
            Pattern("NDh", "ণ্ঢ"),
            Pattern("nsh", "নশ"),
            Pattern("Ngr", "ঙর"),
            Pattern("NGr", "ঞর"),
            Pattern("ngr", "ংর"),
            Pattern("nj", "ঞ্জ"),
            Pattern("Ng", "ঙ"),
            Pattern("NG", "ঞ"),
            Pattern("nk", "ঙ্ক"),
            Pattern("ng", "ং"),
            Pattern("nn", "ন্ন"),
            Pattern("NN", "ণ্ণ"),
            Pattern("Nn", "ণ্ন"),
            Pattern("nm", "ন্ম"),
            Pattern("Nm", "ণ্ম"),
            Pattern("nd", "ন্দ"),
            Pattern("nT", "ন্ট"),
            Pattern("NT", "ণ্ট"),
            Pattern("nD", "ন্ড"),
            Pattern("ND", "ণ্ড"),
            Pattern("nt", "ন্ত"),
            Pattern("ns", "ন্স"),
            Pattern("nc", "ঞ্চ"),
            Pattern("n", "ন"),
            Pattern("N", "ণ"),
            Pattern("OI`", "ৈ"),
            Pattern("OU`", "ৌ"),
            Pattern("O`", "ো"),
            Pattern("OI", "ৈ", listOf(rule("ঐ", c("prefix", "!consonant")), rule("ঐ", c("prefix", "punctuation")))),
            Pattern("OU", "ৌ", listOf(rule("ঔ", c("prefix", "!consonant")), rule("ঔ", c("prefix", "punctuation")))),
            Pattern("O", "ো", listOf(rule("ও", c("prefix", "!consonant")), rule("ও", c("prefix", "punctuation")))),
            Pattern("phl", "ফ্ল"),
            Pattern("pT", "প্ট"),
            Pattern("pt", "প্ত"),
            Pattern("pn", "প্ন"),
            Pattern("pp", "প্প"),
            Pattern("pl", "প্ল"),
            Pattern("ps", "প্স"),
            Pattern("ph", "ফ"),
            Pattern("fl", "ফ্ল"),
            Pattern("f", "ফ"),
            Pattern("p", "প"),
            Pattern("rri`", "ৃ"),
            Pattern("rri", "ৃ", listOf(rule("ঋ", c("prefix", "!consonant")), rule("ঋ", c("prefix", "punctuation")))),
            Pattern("rrZ", "রর‍্য"),
            Pattern("rry", "রর‍্য"),
            Pattern(
                "rZ",
                "র‍্য",
                listOf(
                    rule(
                        "্র্য",
                        c("prefix", "consonant"),
                        c("prefix", "!exact", "rule"),
                        c("prefix", "!exact", "y"),
                        c("prefix", "!exact", "w"),
                        c("prefix", "!exact", "x"),
                    ),
                ),
            ),
            Pattern(
                "ry",
                "র‍্য",
                listOf(
                    rule(
                        "্র্য",
                        c("prefix", "consonant"),
                        c("prefix", "!exact", "rule"),
                        c("prefix", "!exact", "y"),
                        c("prefix", "!exact", "w"),
                        c("prefix", "!exact", "x"),
                    ),
                ),
            ),
            Pattern(
                "rr",
                "রর",
                listOf(
                    rule(
                        "র্",
                        c("prefix", "!consonant"),
                        c("suffix", "!vowel"),
                        c("suffix", "!exact", "rule"),
                        c("suffix", "!punctuation"),
                    ),
                    rule("্রর", c("prefix", "consonant"), c("prefix", "!exact", "rule")),
                ),
            ),
            Pattern("Rg", "ড্গ"),
            Pattern("Rh", "ঢ়"),
            Pattern("rule", "ড"),
            Pattern(
                "rule",
                "র",
                listOf(
                    rule(
                        "্র",
                        c("prefix", "consonant"),
                        c("prefix", "!exact", "rule"),
                        c("prefix", "!exact", "y"),
                        c("prefix", "!exact", "w"),
                        c("prefix", "!exact", "x"),
                        c("prefix", "!exact", "Z"),
                    ),
                ),
            ),
            Pattern("shch", "শ্ছ"),
            Pattern("ShTh", "ষ্ঠ"),
            Pattern("Shph", "ষ্ফ"),
            Pattern("Sch", "শ্ছ"),
            Pattern("skl", "স্ক্ল"),
            Pattern("skh", "স্খ"),
            Pattern("sth", "স্থ"),
            Pattern("sph", "স্ফ"),
            Pattern("shc", "শ্চ"),
            Pattern("sht", "শ্ত"),
            Pattern("shn", "শ্ন"),
            Pattern("shm", "শ্ম"),
            Pattern("shl", "শ্ল"),
            Pattern("Shk", "ষ্ক"),
            Pattern("ShT", "ষ্ট"),
            Pattern("ShN", "ষ্ণ"),
            Pattern("Shp", "ষ্প"),
            Pattern("Shf", "ষ্ফ"),
            Pattern("Shm", "ষ্ম"),
            Pattern("spl", "স্প্ল"),
            Pattern("sk", "স্ক"),
            Pattern("Sc", "শ্চ"),
            Pattern("sT", "স্ট"),
            Pattern("st", "স্ত"),
            Pattern("sn", "স্ন"),
            Pattern("sp", "স্প"),
            Pattern("sf", "স্ফ"),
            Pattern("sm", "স্ম"),
            Pattern("sl", "স্ল"),
            Pattern("sh", "শ"),
            Pattern("Sc", "শ্চ"),
            Pattern("St", "শ্ত"),
            Pattern("Sn", "শ্ন"),
            Pattern("Sm", "শ্ম"),
            Pattern("Sl", "শ্ল"),
            Pattern("Sh", "ষ"),
            Pattern("s", "স"),
            Pattern("S", "শ"),
            Pattern("oo`", "ু"),
            Pattern("oo", "ু", sealRules("উ")),
            Pattern("o`", ""),
            Pattern("oZ", "অ্য"),
            Pattern(
                "o",
                "",
                listOf(
                    rule("ও", c("prefix", "vowel"), c("prefix", "!exact", "o")),
                    rule("অ", c("prefix", "vowel"), c("prefix", "exact", "o")),
                    rule("অ", c("prefix", "punctuation")),
                ),
            ),
            Pattern("tth", "ত্থ"),
            Pattern("t``", "ৎ"),
            Pattern("TT", "ট্ট"),
            Pattern("Tm", "ট্ম"),
            Pattern("Th", "ঠ"),
            Pattern("tn", "ত্ন"),
            Pattern("tm", "ত্ম"),
            Pattern("th", "থ"),
            Pattern("tt", "ত্ত"),
            Pattern("T", "ট"),
            Pattern("t", "ত"),
            Pattern("aZ", "অ্যা"),
            Pattern("AZ", "অ্যা"),
            Pattern("a`", "া"),
            Pattern("A`", "া"),
            Pattern(
                "a",
                "া",
                listOf(
                    rule("আ", c("prefix", "punctuation"), c("suffix", "!exact", "`")),
                    rule("যা", c("prefix", "!consonant"), c("prefix", "!exact", "a"), c("suffix", "!exact", "`")),
                    rule("আ", c("prefix", "exact", "a"), c("suffix", "!exact", "`")),
                ),
            ),
            Pattern("i`", "ি"),
            Pattern("i", "ি", sealRules("ই")),
            Pattern("I`", "ী"),
            Pattern("I", "ী", sealRules("ঈ")),
            Pattern("u`", "ু"),
            Pattern("u", "ু", sealRules("উ")),
            Pattern("U`", "ূ"),
            Pattern("U", "ূ", sealRules("ঊ")),
            Pattern("ee`", "ী"),
            Pattern("ee", "ী", sealRules("ঈ")),
            Pattern("e`", "ে"),
            Pattern("e", "ে", sealRules("এ")),
            Pattern("z", "য"),
            Pattern("Z", "্য"),
            Pattern(
                "y",
                "্য",
                listOf(
                    rule("য", c("prefix", "!consonant"), c("prefix", "!punctuation")),
                    rule("ইয", c("prefix", "punctuation")),
                ),
            ),
            Pattern("Y", "য"),
            Pattern("q", "ক"),
            Pattern(
                "w",
                "ও",
                listOf(
                    rule("ওয", c("prefix", "punctuation"), c("suffix", "vowel")),
                    rule("্ব", c("prefix", "consonant")),
                ),
            ),
            Pattern("x", "ক্স", listOf(rule("এক্স", c("prefix", "punctuation")))),
            Pattern(":`", ":"),
            Pattern(":", "ঃ"),
            Pattern("^`", "^"),
            Pattern("^", "ঁ"),
            Pattern(",,", "্‌"),
            Pattern(",", ","),
            Pattern("$", "৳"),
            Pattern("`", ""),
        )

    fun convert(input: String): String {
        val fixed = fixString(input)
        val out = StringBuilder()
        var cur = 0
        while (cur < fixed.length) {
            val start = cur
            val prev = start - 1
            var matched = false
            for (pattern in PATTERNS) {
                val end = cur + pattern.find.length
                if (end > fixed.length || fixed.substring(start, end) != pattern.find) continue
                for (rule in pattern.rules) {
                    if (rule.conds.all { condPass(it, fixed, start, end, prev) }) {
                        out.append(rule.replace)
                        cur = end
                        matched = true
                        break
                    }
                }
                if (matched) break
                out.append(pattern.replace) // no rule matched -> default
                cur = end
                matched = true
                break
            }
            if (!matched) {
                out.append(fixed[cur])
                cur++
            }
        }
        return out.toString()
    }

    // lowercase everything except letters whose case matters to the rules
    private fun fixString(input: String): String =
        buildString {
            for (ch in input) append(if (ch.lowercaseChar() in CASE_SENSITIVE) ch else ch.lowercaseChar())
        }

    private fun isVowel(ch: Char) = ch.lowercaseChar() in VOWELS

    private fun isConsonant(ch: Char) = ch.lowercaseChar() in CONSONANTS

    private fun isPunctuation(ch: Char) = !isVowel(ch) && !isConsonant(ch)

    private fun condPass(
        cond: Cond,
        fixed: String,
        start: Int,
        end: Int,
        prev: Int,
    ): Boolean {
        val negative = cond.scope.startsWith("!")
        val scope = if (negative) cond.scope.drop(1) else cond.scope
        val chk = if (cond.type == "suffix") end else prev
        val len = fixed.length
        val hit =
            when (scope) {
                "punctuation" -> {
                    val atBoundary = (chk < 0 && cond.type == "prefix") || (chk >= len && cond.type == "suffix")
                    atBoundary || (chk in fixed.indices && isPunctuation(fixed[chk]))
                }

                "vowel" -> {
                    val inRange = (chk >= 0 && cond.type == "prefix") || (chk < len && cond.type == "suffix")
                    inRange && isVowel(fixed[chk])
                }

                "consonant" -> {
                    val inRange = (chk >= 0 && cond.type == "prefix") || (chk < len && cond.type == "suffix")
                    inRange && isConsonant(fixed[chk])
                }

                "exact" -> {
                    val (s, e) =
                        if (cond.type == "suffix") {
                            end to (end + cond.value.length)
                        } else {
                            (start - cond.value.length) to start
                        }
                    s >= 0 && e < len && fixed.substring(s, e) == cond.value
                }

                else -> {
                    true
                }
            }
        return hit xor negative
    }
}
