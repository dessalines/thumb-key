package com.dessalines.thumbkey.keyboards

import android.content.Context
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardMode
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.json.Json

enum class KeyboardLayout(val title: String, val index: Int) {
    ThumbKeyENv4("Thumb-Key english v4", 0),
    ThumbKeyENv4Programmer("Thumb-Key english v4 (programmer)", 1),
    ThumbKeyDEv2("Thumb-Key deutsch v2", 2),
    ThumbKeyDAv1("Thumb-Key dansk v1", 3),
    ThumbKeyESv1("Thumb-Key español v1", 4),
    ThumbKeyEUv1("Thumb-Key euskara v1", 5),
    ThumbKeyFAv1("Thumb-Key فارسیv1", 6),
    ThumbKeyFIv1("Thumb-Key suomi v1", 7),
    ThumbKeyFRv1("Thumb-Key français v1", 8),
    ThumbKeyITv1("Thumb-Key italiano v1", 9),
    ThumbKeyNLv1("Thumb-Key nederlands v1", 10),
    ThumbKeyPLv2("Thumb-Key polski v2", 11),
    ThumbKeyPTv1("Thumb-Key português v1", 12),
    ThumbKeyRUv2("Thumb-Key русский v2", 13),
    ThumbKeyUKv1("Thumb-Key українська v1", 14),
    MessageEaseEN("MessageEase english", 15),
    MessageEaseENSymbols("MessageEase english with symbols", 16),
    MessageEaseHE("MessageEase עברית", 17),
    ThumbKeyRUv2Symbols("Thumb-Key русский v2 с символами", 18),
    ThumbKeyBYv1("Thumb-Key беларуская v1", 19),
    ThumbKeyBYv1Symbols("Thumb-Key беларуская v1 з сімваламі", 20),
    ThumbKeyENv4Symbols("Thumb-Key english v4 with symbols", 21),
    ThumbKeyFIv1Wide("Thumb-Key suomi v1 wide", 22),
    MessageEaseDE("MessageEase deutsch", 23),
    ThumbKeyNOv1("Thumb-Key norsk v1", 24),
    ThumbKeyDEv2MultiLingual("Thumb-Key deutsch v2 multilingual", 25),
    ThumbKeyKAv1("Thumb-Key kartuli ena v1", 26),
    ThumbKeyIDv1("Thumb-Key bahasa indonesia with symbols v1", 27),
    MessageEaseFR("MessageEase français", 28),
    MessageEaseRUSymbols("MessageEase русский with Symbols", 29),
    T9v1("T9 v1", 30),
    ThumbKeyJAv1Hiragana("Thumb-Key japanese Hiragana v1", 31),
    ThumbKeyJAv1Katakana("Thumb-Key japanese Katakana v1", 32),
    ThumbKeyFRv2("Thumb-Key français v2", 33),
    ThumbKeySVv1("Thumb-Key svenska v1", 34),
    ThumbKeyTRv1("Thumb-Key Türkçe v1", 35),
    TypeSplitENv2("Type-Split english v2", 36),
    TypeSplitESv1("Type-Split español v1", 37),
    TypeSplitDEv1("Type-Split deutsch v1", 38),
    TypeSplitFRv1("Type-Split français v1", 39),
    TypeSplitITv1("Type-Split italiano v1", 40),
    TypeSplitPTv1("Type-Split português v1", 41),
    TypeSplitPLv1("Type-Split polski v1", 42),
    TwoHandsENv1("Two Hands english v1", 43),
    WideLayoutENProgrammer("Wide Layout English Programmer", 44),
    ThumbKeyHUv1("Thumb-Key magyar nyelv v1", 45),
    ThumbKeyESEOv1("Thumb-Key español esperanto v1", 46),
    MessageEaseIT("MessageEase italiano", 47),
    ThumbKeyENv4Multi("Thumb-Key english v4 (EN+SK multi)", 48),
    ThumbKeyHEv1("Thumb-Key עברית v1", 49),
    ThumbKeyEOENDEv1("Thumb-Key EO/EN/DE", 50),
    ThumbKeyGRv1("Thumb-Key ελληνικά v1", 51),
    ThumbKeyCZv1("Thumb-Key čeština v1", 52),
    MessageEaseES("MessageEase español", 53),
    MessageEaseRU("MessageEase русский", 54),
    ThumbKeyBGv1Symbols("Thumb-Key български v1 със символи", 55),
    TwoHandsHRv1("Two hands hrvatski v1", 56),
    ThumbKeyHRv1("Thumb-Key hrvatski v1", 57),
    ThumbKeyHRv1Symbols("Thumb-Key hrvatski v1 with symbols", 58),
    TypeSplitFIv1("Type-Split suomi v1", 59),
}

fun keyboardLayoutToModes(layout: KeyboardLayout): Map<KeyboardMode, KeyboardC> {
    return when (layout) {
        KeyboardLayout.ThumbKeyENv4 -> THUMBKEY_EN_V4_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyENv4Programmer -> THUMBKEY_EN_V4_PROGRAMMER_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyENv4Multi -> THUMBKEY_EN_V4_MULTI_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyDEv2 -> THUMBKEY_DE_V2_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyDAv1 -> THUMBKEY_DA_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyESv1 -> THUMBKEY_ES_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyEUv1 -> THUMBKEY_EU_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyFAv1 -> THUMBKEY_FA_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyFIv1 -> THUMBKEY_FI_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyFIv1Wide -> THUMBKEY_FI_V1_WIDE_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyFRv1 -> THUMBKEY_FR_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyGRv1 -> THUMBKEY_GR_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyITv1 -> THUMBKEY_IT_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyNLv1 -> THUMBKEY_NL_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyPLv2 -> THUMBKEY_PL_V2_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyPTv1 -> THUMBKEY_PT_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyRUv2 -> THUMBKEY_RU_V2_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyUKv1 -> THUMBKEY_UK_V1_KEYBOARD_MODES
        KeyboardLayout.MessageEaseEN -> MESSAGEEASE_EN_KEYBOARD_MODES
        KeyboardLayout.MessageEaseES -> MESSAGEEASE_ES_KEYBOARD_MODES
        KeyboardLayout.MessageEaseENSymbols -> MESSAGEEASE_EN_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.MessageEaseHE -> MESSAGEEASE_HE_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyENv4Symbols -> THUMBKEY_EN_V4_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyRUv2Symbols -> THUMBKEY_RU_V2_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyBYv1 -> THUMBKEY_BY_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyBYv1Symbols -> THUMBKEY_BY_V1_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.MessageEaseDE -> MESSAGEEASE_DE_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyNOv1 -> THUMBKEY_NO_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyDEv2MultiLingual -> THUMBKEY_DE_V2_MULTILINGUAL_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyKAv1 -> THUMBKEY_KA_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyIDv1 -> THUMBKEY_ID_V1_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.MessageEaseFR -> MESSAGEEASE_FR_KEYBOARD_MODES
        KeyboardLayout.MessageEaseRUSymbols -> MESSAGEEASE_RU_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.T9v1 -> T9_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyJAv1Hiragana -> THUMBKEY_JA_V1_HIRAGANA_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyJAv1Katakana -> THUMBKEY_JA_V1_KATAKANA_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyFRv2 -> THUMBKEY_FR_V2_KEYBOARD_MODES
        KeyboardLayout.ThumbKeySVv1 -> THUMBKEY_SV_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyTRv1 -> THUMBKEY_TR_V1_KEYBOARD_MODES
        KeyboardLayout.TypeSplitENv2 -> TYPESPLIT_EN_V2_KEYBOARD_MODES
        KeyboardLayout.TypeSplitESv1 -> TYPESPLIT_ES_V1_KEYBOARD_MODES
        KeyboardLayout.TypeSplitDEv1 -> TYPESPLIT_DE_V1_KEYBOARD_MODES
        KeyboardLayout.TypeSplitITv1 -> TYPESPLIT_IT_V1_KEYBOARD_MODES
        KeyboardLayout.TypeSplitFRv1 -> TYPESPLIT_FR_V1_KEYBOARD_MODES
        KeyboardLayout.TypeSplitPTv1 -> TYPESPLIT_PT_V1_KEYBOARD_MODES
        KeyboardLayout.TypeSplitPLv1 -> TYPESPLIT_PL_V1_KEYBOARD_MODES
        KeyboardLayout.TwoHandsENv1 -> TWO_HANDS_EN_V1_KEYBOARD_MODES
        KeyboardLayout.WideLayoutENProgrammer -> WIDE_LAYOUT_EN_PROGRAMMER_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyHUv1 -> THUMBKEY_HU_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyESEOv1 -> THUMBKEY_ES_EO_V1_KEYBOARD_MODES
        KeyboardLayout.MessageEaseIT -> MESSAGEEASE_IT_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyHEv1 -> THUMBKEY_HE_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyEOENDEv1 -> THUMBKEY_EOENDE_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyCZv1 -> THUMBKEY_CZ_V1_KEYBOARD_MODES
        KeyboardLayout.MessageEaseRU -> MESSAGEEASE_RU_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyBGv1Symbols -> THUMBKEY_BG_V1_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.TwoHandsHRv1 -> TWO_HANDS_HR_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyHRv1 -> THUMBKEY_HR_V1_KEYBOARD_MODES
        KeyboardLayout.ThumbKeyHRv1Symbols -> THUMBKEY_HR_V1_SYMBOLS_KEYBOARD_MODES
        KeyboardLayout.TypeSplitFIv1 -> TYPESPLIT_FI_V1_KEYBOARD_MODES
    }
}


fun convert(context: Context) {
    val text = KeyboardLayout.values().joinToString("\n") {
        val json = Json.encodeToString(MapSerializer(KeyboardMode.serializer(), KeyboardC.serializer()), keyboardLayoutToModes(it))
        val text = """"${escape(it.name)}" to KeyboardLayout("${escape(it.title)}", "${escape(json)}"),"""
        text
    }
    context.cacheDir.resolve("layouts.txt").writeText(text)
}
fun escape(s: String) = s.replace("\\", "\\\\").replace("\"", "\\\"").replace("$", "\\\$")
