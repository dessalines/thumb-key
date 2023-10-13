package com.dessalines.thumbkey.utils

import com.dessalines.thumbkey.keyboards.MESSAGEEASE_DE_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_DE_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_EN_EO_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_EN_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_EN_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_ES_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_FR_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_HE_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_IT_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_RU_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_RU_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.MESSAGEEASE_UA_RU_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.T9_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_BG_V1_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_BY_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_BY_V1_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_CA_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_CZ_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_DA_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_DE_V2_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_DE_V2_MULTILINGUAL_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_EN_PROGRAMMER_WIDE_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_EN_V4_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_EN_V4_MULTI_IT_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_EN_V4_MULTI_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_EN_V4_PROGRAMMER_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_EN_V4_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_EOENDE_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_ES_CA_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_ES_EO_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_ES_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_EU_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_FA_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_FI_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_FI_V1_WIDE_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_FR_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_FR_V2_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_GR_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_HE_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_HR_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_HR_V1_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_HU_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_ID_V1_SN_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_ID_V1_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_ID_V2_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_IT_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_JA_V1_HIRAGANA_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_JA_V1_KATAKANA_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_KA_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_LT_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_LV_LTG_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_MATH_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_NL_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_NO_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_PL_V2_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_PT_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_RU_V2_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_RU_V2_SYMBOLS_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_SV_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_TR_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.THUMBKEY_UK_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TWO_HANDS_EN_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TWO_HANDS_HR_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_DE_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_EN_V2_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_ES_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_FI_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_FR_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_IT_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_PL_V1_KEYBOARD_MODES
import com.dessalines.thumbkey.keyboards.TYPESPLIT_PT_V1_KEYBOARD_MODES

// Make sure new keyboards have a new index, even if they are in the middle
enum class KeyboardLayout(val title: String, val index: Int, val modes: Map<KeyboardMode, KeyboardC>) {
    ThumbKeyENv4("Thumb-Key english v4", 0, THUMBKEY_EN_V4_KEYBOARD_MODES),
    ThumbKeyENv4Programmer("Thumb-Key english v4 (programmer)", 1, THUMBKEY_EN_V4_PROGRAMMER_KEYBOARD_MODES),
    ThumbKeyDEv2("Thumb-Key deutsch v2", 2, THUMBKEY_DE_V2_KEYBOARD_MODES),
    ThumbKeyDAv1("Thumb-Key dansk v1", 3, THUMBKEY_DA_V1_KEYBOARD_MODES),
    ThumbKeyESv1("Thumb-Key español v1", 4, THUMBKEY_ES_V1_KEYBOARD_MODES),
    ThumbKeyEUv1("Thumb-Key euskara v1", 5, THUMBKEY_EU_V1_KEYBOARD_MODES),
    ThumbKeyFAv1("Thumb-Key فارسیv1", 6, THUMBKEY_FA_V1_KEYBOARD_MODES),
    ThumbKeyFIv1("Thumb-Key suomi v1", 7, THUMBKEY_FI_V1_KEYBOARD_MODES),
    ThumbKeyFRv1("Thumb-Key français v1", 8, THUMBKEY_FR_V1_KEYBOARD_MODES),
    ThumbKeyITv1("Thumb-Key italiano v1", 9, THUMBKEY_IT_V1_KEYBOARD_MODES),
    ThumbKeyNLv1("Thumb-Key nederlands v1", 10, THUMBKEY_NL_V1_KEYBOARD_MODES),
    ThumbKeyPLv2("Thumb-Key polski v2", 11, THUMBKEY_PL_V2_KEYBOARD_MODES),
    ThumbKeyPTv1("Thumb-Key português v1", 12, THUMBKEY_PT_V1_KEYBOARD_MODES),
    ThumbKeyRUv2("Thumb-Key русский v2", 13, THUMBKEY_RU_V2_KEYBOARD_MODES),
    ThumbKeyUKv1("Thumb-Key українська v1", 14, THUMBKEY_UK_V1_KEYBOARD_MODES),
    MessageEaseEN("MessageEase english", 15, MESSAGEEASE_EN_KEYBOARD_MODES),
    MessageEaseENSymbols("MessageEase english with symbols", 16, MESSAGEEASE_EN_SYMBOLS_KEYBOARD_MODES),
    MessageEaseHE("MessageEase עברית", 17, MESSAGEEASE_HE_KEYBOARD_MODES),
    ThumbKeyRUv2Symbols("Thumb-Key русский v2 с символами", 18, THUMBKEY_RU_V2_SYMBOLS_KEYBOARD_MODES),
    ThumbKeyBYv1("Thumb-Key беларуская v1", 19, THUMBKEY_BY_V1_KEYBOARD_MODES),
    ThumbKeyBYv1Symbols("Thumb-Key беларуская v1 з сімваламі", 20, THUMBKEY_BY_V1_SYMBOLS_KEYBOARD_MODES),
    ThumbKeyENv4Symbols("Thumb-Key english v4 with symbols", 21, THUMBKEY_EN_V4_SYMBOLS_KEYBOARD_MODES),
    ThumbKeyFIv1Wide("Thumb-Key suomi v1 wide", 22, THUMBKEY_FI_V1_WIDE_KEYBOARD_MODES),
    MessageEaseDE("MessageEase deutsch", 23, MESSAGEEASE_DE_KEYBOARD_MODES),
    ThumbKeyNOv1("Thumb-Key norsk v1", 24, THUMBKEY_NO_V1_KEYBOARD_MODES),
    ThumbKeyDEv2MultiLingual("Thumb-Key deutsch v2 multilingual", 25, THUMBKEY_DE_V2_MULTILINGUAL_KEYBOARD_MODES),
    ThumbKeyKAv1("Thumb-Key kartuli ena v1", 26, THUMBKEY_KA_V1_KEYBOARD_MODES),
    ThumbKeyIDv1("Thumb-Key Bahasa Indonesia with Symbols v1", 27, THUMBKEY_ID_V1_SYMBOLS_KEYBOARD_MODES),
    MessageEaseFR("MessageEase français", 28, MESSAGEEASE_FR_KEYBOARD_MODES),
    MessageEaseRUSymbols("MessageEase русский with Symbols", 29, MESSAGEEASE_RU_SYMBOLS_KEYBOARD_MODES),
    T9v1("T9 v1", 30, T9_V1_KEYBOARD_MODES),
    ThumbKeyJAv1Hiragana("Thumb-Key japanese Hiragana v1", 31, THUMBKEY_JA_V1_HIRAGANA_KEYBOARD_MODES),
    ThumbKeyJAv1Katakana("Thumb-Key japanese Katakana v1", 32, THUMBKEY_JA_V1_KATAKANA_KEYBOARD_MODES),
    ThumbKeyFRv2("Thumb-Key français v2", 33, THUMBKEY_FR_V2_KEYBOARD_MODES),
    ThumbKeySVv1("Thumb-Key svenska v1", 34, THUMBKEY_SV_V1_KEYBOARD_MODES),
    ThumbKeyTRv1("Thumb-Key Türkçe v1", 35, THUMBKEY_TR_V1_KEYBOARD_MODES),
    TypeSplitENv2("Type-Split english v2", 36, TYPESPLIT_EN_V2_KEYBOARD_MODES),
    TypeSplitESv1("Type-Split español v1", 37, TYPESPLIT_ES_V1_KEYBOARD_MODES),
    TypeSplitDEv1("Type-Split deutsch v1", 38, TYPESPLIT_DE_V1_KEYBOARD_MODES),
    TypeSplitFRv1("Type-Split français v1", 39, TYPESPLIT_FR_V1_KEYBOARD_MODES),
    TypeSplitITv1("Type-Split italiano v1", 40, TYPESPLIT_IT_V1_KEYBOARD_MODES),
    TypeSplitPTv1("Type-Split português v1", 41, TYPESPLIT_PT_V1_KEYBOARD_MODES),
    TypeSplitPLv1("Type-Split polski v1", 42, TYPESPLIT_PL_V1_KEYBOARD_MODES),
    TwoHandsENv1("Two Hands english v1", 43, TWO_HANDS_EN_V1_KEYBOARD_MODES),
    ThumbKeyEnProgrammerWide("Wide programmer (Thumb-Key english)", 44, THUMBKEY_EN_PROGRAMMER_WIDE_KEYBOARD_MODES),
    ThumbKeyHUv1("Thumb-Key magyar nyelv v1", 45, THUMBKEY_HU_V1_KEYBOARD_MODES),
    ThumbKeyESEOv1("Thumb-Key español esperanto v1", 46, THUMBKEY_ES_EO_V1_KEYBOARD_MODES),
    MessageEaseIT("MessageEase italiano", 47, MESSAGEEASE_IT_KEYBOARD_MODES),
    ThumbKeyENv4Multi("Thumb-Key english v4 (EN+SK multi)", 48, THUMBKEY_EN_V4_MULTI_KEYBOARD_MODES),
    ThumbKeyHEv1("Thumb-Key עברית v1", 49, THUMBKEY_HE_V1_KEYBOARD_MODES),
    ThumbKeyEOENDEv1("Thumb-Key EO/EN/DE", 50, THUMBKEY_EOENDE_KEYBOARD_MODES),
    ThumbKeyGRv1("Thumb-Key ελληνικά v1", 51, THUMBKEY_GR_V1_KEYBOARD_MODES),
    ThumbKeyCZv1("Thumb-Key čeština v1", 52, THUMBKEY_CZ_V1_KEYBOARD_MODES),
    MessageEaseES("MessageEase español", 53, MESSAGEEASE_ES_KEYBOARD_MODES),
    MessageEaseRU("MessageEase русский", 54, MESSAGEEASE_RU_KEYBOARD_MODES),
    ThumbKeyBGv1Symbols("Thumb-Key български v1 със символи", 55, THUMBKEY_BG_V1_SYMBOLS_KEYBOARD_MODES),
    TwoHandsHRv1("Two hands hrvatski v1", 56, TWO_HANDS_HR_V1_KEYBOARD_MODES),
    ThumbKeyHRv1("Thumb-Key hrvatski v1", 57, THUMBKEY_HR_V1_KEYBOARD_MODES),
    ThumbKeyHRv1Symbols("Thumb-Key hrvatski v1 with symbols", 58, THUMBKEY_HR_V1_SYMBOLS_KEYBOARD_MODES),
    TypeSplitFIv1("Type-Split suomi v1", 59, TYPESPLIT_FI_V1_KEYBOARD_MODES),
    ThumbKeyLVLTGv1("Thumb-Key latviešu valoda v1", 60, THUMBKEY_LV_LTG_V1_KEYBOARD_MODES),
    ThumbKeyLTv1("Thumb-Key lietuvių kalba v1", 61, THUMBKEY_LT_V1_KEYBOARD_MODES),
    ThumbKeyIDv2Symbols("Thumb-Key Bahasa Indonesia with Symbols v2", 62, THUMBKEY_ID_V2_SYMBOLS_KEYBOARD_MODES),
    ThumbKeyIDv1SN("Thumb-Key Bahasa Indonesia with Symbols and Number v1", 63, THUMBKEY_ID_V1_SN_KEYBOARD_MODES),
    ThumbKeyESCAv1("Thumb-Key español català v1", 64, THUMBKEY_ES_CA_V1_KEYBOARD_MODES),
    ThumbKeyENv4MultiIT("Thumb-Key english v4 (EN+IT multi)", 65, THUMBKEY_EN_V4_MULTI_IT_KEYBOARD_MODES),
    MessageEaseENEOSymbols("MessageEase english esperanto with symbols", 66, MESSAGEEASE_EN_EO_SYMBOLS_KEYBOARD_MODES),
    MessageEaseUKRUSymbols("MessageEase український-русский with Symbols", 67, MESSAGEEASE_UA_RU_SYMBOLS_KEYBOARD_MODES),
    MessageEaseDESymbols("MessageEase deutsch with Symbols", 68, MESSAGEEASE_DE_SYMBOLS_KEYBOARD_MODES),
    ThumbKeyCAv1("Thumb-Key Canadian Aboriginal Syllabic v1", 69, THUMBKEY_CA_V1_KEYBOARD_MODES),
    ThumbKeyMATHv1("Thumb-Key Mathematical", 70, THUMBKEY_MATH_V1_KEYBOARD_MODES),
}
