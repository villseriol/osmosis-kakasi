// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode;

import java.lang.Character.UnicodeBlock;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Represents a Unicode block (character range), as defined by the Unicode
 * Character Database "Blocks.txt".
 *
 * Each constant is defined as NAME(alias, lower, upper, block), where lower and
 * upper are the inclusive first and last code points of the block, and block is
 * the {@link UnicodeBlock} the range delegates its membership tests to.
 */
public enum UnicodeRange {
    /**
     * Basic Latin.
     *
     * https://www.unicodepedia.com/groups/basic-latin/
     */
    BASIC_LATIN("basic-latin", 0x0, 0x7F, UnicodeBlock.BASIC_LATIN),
    /**
     * Latin-1 Supplement.
     *
     * https://www.unicodepedia.com/groups/latin-1-supplement/
     */
    LATIN_1_SUPPLEMENT("latin-1-supplement", 0x80, 0xFF, UnicodeBlock.LATIN_1_SUPPLEMENT),
    /**
     * Latin Extended-A.
     *
     * https://www.unicodepedia.com/groups/latin-extended-a/
     */
    LATIN_EXTENDED_A("latin-extended-a", 0x100, 0x17F, UnicodeBlock.LATIN_EXTENDED_A),
    /**
     * Latin Extended-B.
     *
     * https://www.unicodepedia.com/groups/latin-extended-b/
     */
    LATIN_EXTENDED_B("latin-extended-b", 0x180, 0x24F, UnicodeBlock.LATIN_EXTENDED_B),
    /**
     * IPA Extensions.
     *
     * https://www.unicodepedia.com/groups/ipa-extensions/
     */
    IPA_EXTENSIONS("ipa-extensions", 0x250, 0x2AF, UnicodeBlock.IPA_EXTENSIONS),
    /**
     * Spacing Modifier Letters.
     *
     * https://www.unicodepedia.com/groups/spacing-modifier-letters/
     */
    SPACING_MODIFIER_LETTERS("spacing-modifier-letters", 0x2B0, 0x2FF, UnicodeBlock.SPACING_MODIFIER_LETTERS),
    /**
     * Combining Diacritical Marks.
     *
     * https://www.unicodepedia.com/groups/combining-diacritical-marks/
     */
    COMBINING_DIACRITICAL_MARKS("combining-diacritical-marks", 0x300, 0x36F, UnicodeBlock.COMBINING_DIACRITICAL_MARKS),
    /**
     * Greek and Coptic.
     *
     * https://www.unicodepedia.com/groups/greek-and-coptic/
     */
    GREEK_AND_COPTIC("greek-and-coptic", 0x370, 0x3FF, UnicodeBlock.GREEK),
    /**
     * Cyrillic.
     *
     * https://www.unicodepedia.com/groups/cyrillic/
     */
    CYRILLIC("cyrillic", 0x400, 0x4FF, UnicodeBlock.CYRILLIC),
    /**
     * Cyrillic Supplement.
     *
     * https://www.unicodepedia.com/groups/cyrillic-supplement/
     */
    CYRILLIC_SUPPLEMENT("cyrillic-supplement", 0x500, 0x52F, UnicodeBlock.CYRILLIC_SUPPLEMENTARY),
    /**
     * Armenian.
     *
     * https://www.unicodepedia.com/groups/armenian/
     */
    ARMENIAN("armenian", 0x530, 0x58F, UnicodeBlock.ARMENIAN),
    /**
     * Hebrew.
     *
     * https://www.unicodepedia.com/groups/hebrew/
     */
    HEBREW("hebrew", 0x590, 0x5FF, UnicodeBlock.HEBREW),
    /**
     * Arabic.
     *
     * https://www.unicodepedia.com/groups/arabic/
     */
    ARABIC("arabic", 0x600, 0x6FF, UnicodeBlock.ARABIC),
    /**
     * Syriac.
     *
     * https://www.unicodepedia.com/groups/syriac/
     */
    SYRIAC("syriac", 0x700, 0x74F, UnicodeBlock.SYRIAC),
    /**
     * Arabic Supplement.
     *
     * https://www.unicodepedia.com/groups/arabic-supplement/
     */
    ARABIC_SUPPLEMENT("arabic-supplement", 0x750, 0x77F, UnicodeBlock.ARABIC_SUPPLEMENT),
    /**
     * Thaana.
     *
     * https://www.unicodepedia.com/groups/thaana/
     */
    THAANA("thaana", 0x780, 0x7BF, UnicodeBlock.THAANA),
    /**
     * NKo.
     *
     * https://www.unicodepedia.com/groups/nko/
     */
    NKO("nko", 0x7C0, 0x7FF, UnicodeBlock.NKO),
    /**
     * Samaritan.
     *
     * https://www.unicodepedia.com/groups/samaritan/
     */
    SAMARITAN("samaritan", 0x800, 0x83F, UnicodeBlock.SAMARITAN),
    /**
     * Mandaic.
     *
     * https://www.unicodepedia.com/groups/mandaic/
     */
    MANDAIC("mandaic", 0x840, 0x85F, UnicodeBlock.MANDAIC),
    /**
     * Devanagari.
     *
     * https://www.unicodepedia.com/groups/devanagari/
     */
    DEVANAGARI("devanagari", 0x900, 0x97F, UnicodeBlock.DEVANAGARI),
    /**
     * Bengali.
     *
     * https://www.unicodepedia.com/groups/bengali/
     */
    BENGALI("bengali", 0x980, 0x9FF, UnicodeBlock.BENGALI),
    /**
     * Gurmukhi.
     *
     * https://www.unicodepedia.com/groups/gurmukhi/
     */
    GURMUKHI("gurmukhi", 0xA00, 0xA7F, UnicodeBlock.GURMUKHI),
    /**
     * Gujarati.
     *
     * https://www.unicodepedia.com/groups/gujarati/
     */
    GUJARATI("gujarati", 0xA80, 0xAFF, UnicodeBlock.GUJARATI),
    /**
     * Oriya.
     *
     * https://www.unicodepedia.com/groups/oriya/
     */
    ORIYA("oriya", 0xB00, 0xB7F, UnicodeBlock.ORIYA),
    /**
     * Tamil.
     *
     * https://www.unicodepedia.com/groups/tamil/
     */
    TAMIL("tamil", 0xB80, 0xBFF, UnicodeBlock.TAMIL),
    /**
     * Telugu.
     *
     * https://www.unicodepedia.com/groups/telugu/
     */
    TELUGU("telugu", 0xC00, 0xC7F, UnicodeBlock.TELUGU),
    /**
     * Kannada.
     *
     * https://www.unicodepedia.com/groups/kannada/
     */
    KANNADA("kannada", 0xC80, 0xCFF, UnicodeBlock.KANNADA),
    /**
     * Malayalam.
     *
     * https://www.unicodepedia.com/groups/malayalam/
     */
    MALAYALAM("malayalam", 0xD00, 0xD7F, UnicodeBlock.MALAYALAM),
    /**
     * Sinhala.
     *
     * https://www.unicodepedia.com/groups/sinhala/
     */
    SINHALA("sinhala", 0xD80, 0xDFF, UnicodeBlock.SINHALA),
    /**
     * Thai.
     *
     * https://www.unicodepedia.com/groups/thai/
     */
    THAI("thai", 0xE00, 0xE7F, UnicodeBlock.THAI),
    /**
     * Lao.
     *
     * https://www.unicodepedia.com/groups/lao/
     */
    LAO("lao", 0xE80, 0xEFF, UnicodeBlock.LAO),
    /**
     * Tibetan.
     *
     * https://www.unicodepedia.com/groups/tibetan/
     */
    TIBETAN("tibetan", 0xF00, 0xFFF, UnicodeBlock.TIBETAN),
    /**
     * Myanmar.
     *
     * https://www.unicodepedia.com/groups/myanmar/
     */
    MYANMAR("myanmar", 0x1000, 0x109F, UnicodeBlock.MYANMAR),
    /**
     * Georgian.
     *
     * https://www.unicodepedia.com/groups/georgian/
     */
    GEORGIAN("georgian", 0x10A0, 0x10FF, UnicodeBlock.GEORGIAN),
    /**
     * Hangul Jamo.
     *
     * https://www.unicodepedia.com/groups/hangul-jamo/
     */
    HANGUL_JAMO("hangul-jamo", 0x1100, 0x11FF, UnicodeBlock.HANGUL_JAMO),
    /**
     * Ethiopic.
     *
     * https://www.unicodepedia.com/groups/ethiopic/
     */
    ETHIOPIC("ethiopic", 0x1200, 0x137F, UnicodeBlock.ETHIOPIC),
    /**
     * Ethiopic Supplement.
     *
     * https://www.unicodepedia.com/groups/ethiopic-supplement/
     */
    ETHIOPIC_SUPPLEMENT("ethiopic-supplement", 0x1380, 0x139F, UnicodeBlock.ETHIOPIC_SUPPLEMENT),
    /**
     * Cherokee.
     *
     * https://www.unicodepedia.com/groups/cherokee/
     */
    CHEROKEE("cherokee", 0x13A0, 0x13FF, UnicodeBlock.CHEROKEE),
    /**
     * Unified Canadian Aboriginal Syllabics.
     *
     * https://www.unicodepedia.com/groups/unified-canadian-aboriginal-syllabics/
     */
    UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS("canadian-aborig-syllabics", 0x1400, 0x167F,
            UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS),
    /**
     * Ogham.
     *
     * https://www.unicodepedia.com/groups/ogham/
     */
    OGHAM("ogham", 0x1680, 0x169F, UnicodeBlock.OGHAM),
    /**
     * Runic.
     *
     * https://www.unicodepedia.com/groups/runic/
     */
    RUNIC("runic", 0x16A0, 0x16FF, UnicodeBlock.RUNIC),
    /**
     * Tagalog.
     *
     * https://www.unicodepedia.com/groups/tagalog/
     */
    TAGALOG("tagalog", 0x1700, 0x171F, UnicodeBlock.TAGALOG),
    /**
     * Hanunoo.
     *
     * https://www.unicodepedia.com/groups/hanunoo/
     */
    HANUNOO("hanunoo", 0x1720, 0x173F, UnicodeBlock.HANUNOO),
    /**
     * Buhid.
     *
     * https://www.unicodepedia.com/groups/buhid/
     */
    BUHID("buhid", 0x1740, 0x175F, UnicodeBlock.BUHID),
    /**
     * Tagbanwa.
     *
     * https://www.unicodepedia.com/groups/tagbanwa/
     */
    TAGBANWA("tagbanwa", 0x1760, 0x177F, UnicodeBlock.TAGBANWA),
    /**
     * Khmer.
     *
     * https://www.unicodepedia.com/groups/khmer/
     */
    KHMER("khmer", 0x1780, 0x17FF, UnicodeBlock.KHMER),
    /**
     * Mongolian.
     *
     * https://www.unicodepedia.com/groups/mongolian/
     */
    MONGOLIAN("mongolian", 0x1800, 0x18AF, UnicodeBlock.MONGOLIAN),
    /**
     * Unified Canadian Aboriginal Syllabics Extended.
     *
     * https://www.unicodepedia.com/groups/unified-canadian-aboriginal-syllabics-extended/
     */
    UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED("canadian-aborig-syllabics-ext", 0x18B0, 0x18FF,
            UnicodeBlock.UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED),
    /**
     * Limbu.
     *
     * https://www.unicodepedia.com/groups/limbu/
     */
    LIMBU("limbu", 0x1900, 0x194F, UnicodeBlock.LIMBU),
    /**
     * Tai Le.
     *
     * https://www.unicodepedia.com/groups/tai-le/
     */
    TAI_LE("tai-le", 0x1950, 0x197F, UnicodeBlock.TAI_LE),
    /**
     * New Tai Lue.
     *
     * https://www.unicodepedia.com/groups/new-tai-lue/
     */
    NEW_TAI_LUE("new-tai-lue", 0x1980, 0x19DF, UnicodeBlock.NEW_TAI_LUE),
    /**
     * Khmer Symbols.
     *
     * https://www.unicodepedia.com/groups/khmer-symbols/
     */
    KHMER_SYMBOLS("khmer-symbols", 0x19E0, 0x19FF, UnicodeBlock.KHMER_SYMBOLS),
    /**
     * Buginese.
     *
     * https://www.unicodepedia.com/groups/buginese/
     */
    BUGINESE("buginese", 0x1A00, 0x1A1F, UnicodeBlock.BUGINESE),
    /**
     * Tai Tham.
     *
     * https://www.unicodepedia.com/groups/tai-tham/
     */
    TAI_THAM("tai-tham", 0x1A20, 0x1AAF, UnicodeBlock.TAI_THAM),
    /**
     * Balinese.
     *
     * https://www.unicodepedia.com/groups/balinese/
     */
    BALINESE("balinese", 0x1B00, 0x1B7F, UnicodeBlock.BALINESE),
    /**
     * Sundanese.
     *
     * https://www.unicodepedia.com/groups/sundanese/
     */
    SUNDANESE("sundanese", 0x1B80, 0x1BBF, UnicodeBlock.SUNDANESE),
    /**
     * Batak.
     *
     * https://www.unicodepedia.com/groups/batak/
     */
    BATAK("batak", 0x1BC0, 0x1BFF, UnicodeBlock.BATAK),
    /**
     * Lepcha.
     *
     * https://www.unicodepedia.com/groups/lepcha/
     */
    LEPCHA("lepcha", 0x1C00, 0x1C4F, UnicodeBlock.LEPCHA),
    /**
     * Ol Chiki.
     *
     * https://www.unicodepedia.com/groups/ol-chiki/
     */
    OL_CHIKI("ol-chiki", 0x1C50, 0x1C7F, UnicodeBlock.OL_CHIKI),
    /**
     * Vedic Extensions.
     *
     * https://www.unicodepedia.com/groups/vedic-extensions/
     */
    VEDIC_EXTENSIONS("vedic-extensions", 0x1CD0, 0x1CFF, UnicodeBlock.VEDIC_EXTENSIONS),
    /**
     * Phonetic Extensions.
     *
     * https://www.unicodepedia.com/groups/phonetic-extensions/
     */
    PHONETIC_EXTENSIONS("phonetic-extensions", 0x1D00, 0x1D7F, UnicodeBlock.PHONETIC_EXTENSIONS),
    /**
     * Phonetic Extensions Supplement.
     *
     * https://www.unicodepedia.com/groups/phonetic-extensions-supplement/
     */
    PHONETIC_EXTENSIONS_SUPPLEMENT("phonetic-extensions-supplement", 0x1D80, 0x1DBF,
            UnicodeBlock.PHONETIC_EXTENSIONS_SUPPLEMENT),
    /**
     * Combining Diacritical Marks Supplement.
     *
     * https://www.unicodepedia.com/groups/combining-diacritical-marks-supplement/
     */
    COMBINING_DIACRITICAL_MARKS_SUPPLEMENT("combining-diacritical-marks-sup", 0x1DC0, 0x1DFF,
            UnicodeBlock.COMBINING_DIACRITICAL_MARKS_SUPPLEMENT),
    /**
     * Latin Extended Additional.
     *
     * https://www.unicodepedia.com/groups/latin-extended-additional/
     */
    LATIN_EXTENDED_ADDITIONAL("latin-extended-additional", 0x1E00, 0x1EFF, UnicodeBlock.LATIN_EXTENDED_ADDITIONAL),
    /**
     * Greek Extended.
     *
     * https://www.unicodepedia.com/groups/greek-extended/
     */
    GREEK_EXTENDED("greek-extended", 0x1F00, 0x1FFF, UnicodeBlock.GREEK_EXTENDED),
    /**
     * General Punctuation.
     *
     * https://www.unicodepedia.com/groups/general-punctuation/
     */
    GENERAL_PUNCTUATION("general-punctuation", 0x2000, 0x206F, UnicodeBlock.GENERAL_PUNCTUATION),
    /**
     * Superscripts and Subscripts.
     *
     * https://www.unicodepedia.com/groups/superscripts-and-subscripts/
     */
    SUPERSCRIPTS_AND_SUBSCRIPTS("superscripts-and-subscripts", 0x2070, 0x209F,
            UnicodeBlock.SUPERSCRIPTS_AND_SUBSCRIPTS),
    /**
     * Currency Symbols.
     *
     * https://www.unicodepedia.com/groups/currency-symbols/
     */
    CURRENCY_SYMBOLS("currency-symbols", 0x20A0, 0x20CF, UnicodeBlock.CURRENCY_SYMBOLS),
    /**
     * Combining Diacritical Marks for Symbols.
     *
     * https://www.unicodepedia.com/groups/combining-diacritical-marks-for-symbols/
     */
    COMBINING_DIACRITICAL_MARKS_FOR_SYMBOLS("combining-diacritical-marks-sym", 0x20D0, 0x20FF,
            UnicodeBlock.COMBINING_MARKS_FOR_SYMBOLS),
    /**
     * Letterlike Symbols.
     *
     * https://www.unicodepedia.com/groups/letterlike-symbols/
     */
    LETTERLIKE_SYMBOLS("letterlike-symbols", 0x2100, 0x214F, UnicodeBlock.LETTERLIKE_SYMBOLS),
    /**
     * Number Forms.
     *
     * https://www.unicodepedia.com/groups/number-forms/
     */
    NUMBER_FORMS("number-forms", 0x2150, 0x218F, UnicodeBlock.NUMBER_FORMS),
    /**
     * Arrows.
     *
     * https://www.unicodepedia.com/groups/arrows/
     */
    ARROWS("arrows", 0x2190, 0x21FF, UnicodeBlock.ARROWS),
    /**
     * Mathematical Operators.
     *
     * https://www.unicodepedia.com/groups/mathematical-operators/
     */
    MATHEMATICAL_OPERATORS("mathematical-operators", 0x2200, 0x22FF, UnicodeBlock.MATHEMATICAL_OPERATORS),
    /**
     * Miscellaneous Technical.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-technical/
     */
    MISCELLANEOUS_TECHNICAL("miscellaneous-technical", 0x2300, 0x23FF, UnicodeBlock.MISCELLANEOUS_TECHNICAL),
    /**
     * Control Pictures.
     *
     * https://www.unicodepedia.com/groups/control-pictures/
     */
    CONTROL_PICTURES("control-pictures", 0x2400, 0x243F, UnicodeBlock.CONTROL_PICTURES),
    /**
     * Optical Character Recognition.
     *
     * https://www.unicodepedia.com/groups/optical-character-recognition/
     */
    OPTICAL_CHARACTER_RECOGNITION("optical-character-recognition", 0x2440, 0x245F,
            UnicodeBlock.OPTICAL_CHARACTER_RECOGNITION),
    /**
     * Enclosed Alphanumerics.
     *
     * https://www.unicodepedia.com/groups/enclosed-alphanumerics/
     */
    ENCLOSED_ALPHANUMERICS("enclosed-alphanumerics", 0x2460, 0x24FF, UnicodeBlock.ENCLOSED_ALPHANUMERICS),
    /**
     * Box Drawing.
     *
     * https://www.unicodepedia.com/groups/box-drawing/
     */
    BOX_DRAWING("box-drawing", 0x2500, 0x257F, UnicodeBlock.BOX_DRAWING),
    /**
     * Block Elements.
     *
     * https://www.unicodepedia.com/groups/block-elements/
     */
    BLOCK_ELEMENTS("block-elements", 0x2580, 0x259F, UnicodeBlock.BLOCK_ELEMENTS),
    /**
     * Geometric Shapes.
     *
     * https://www.unicodepedia.com/groups/geometric-shapes/
     */
    GEOMETRIC_SHAPES("geometric-shapes", 0x25A0, 0x25FF, UnicodeBlock.GEOMETRIC_SHAPES),
    /**
     * Miscellaneous Symbols.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-symbols/
     */
    MISCELLANEOUS_SYMBOLS("miscellaneous-symbols", 0x2600, 0x26FF, UnicodeBlock.MISCELLANEOUS_SYMBOLS),
    /**
     * Dingbats.
     *
     * https://www.unicodepedia.com/groups/dingbats/
     */
    DINGBATS("dingbats", 0x2700, 0x27BF, UnicodeBlock.DINGBATS),
    /**
     * Miscellaneous Mathematical Symbols-A.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-mathematical-symbols-a/
     */
    MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A("miscellaneous-math-symbols-a", 0x27C0, 0x27EF,
            UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A),
    /**
     * Supplemental Arrows-A.
     *
     * https://www.unicodepedia.com/groups/supplemental-arrows-a/
     */
    SUPPLEMENTAL_ARROWS_A("supplemental-arrows-a", 0x27F0, 0x27FF, UnicodeBlock.SUPPLEMENTAL_ARROWS_A),
    /**
     * Braille Patterns.
     *
     * https://www.unicodepedia.com/groups/braille-patterns/
     */
    BRAILLE_PATTERNS("braille-patterns", 0x2800, 0x28FF, UnicodeBlock.BRAILLE_PATTERNS),
    /**
     * Supplemental Arrows-B.
     *
     * https://www.unicodepedia.com/groups/supplemental-arrows-b/
     */
    SUPPLEMENTAL_ARROWS_B("supplemental-arrows-b", 0x2900, 0x297F, UnicodeBlock.SUPPLEMENTAL_ARROWS_B),
    /**
     * Miscellaneous Mathematical Symbols-B.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-mathematical-symbols-b/
     */
    MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B("miscellaneous-math-symbols-b", 0x2980, 0x29FF,
            UnicodeBlock.MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B),
    /**
     * Supplemental Mathematical Operators.
     *
     * https://www.unicodepedia.com/groups/supplemental-mathematical-operators/
     */
    SUPPLEMENTAL_MATHEMATICAL_OPERATORS("supplemental-math-operators", 0x2A00, 0x2AFF,
            UnicodeBlock.SUPPLEMENTAL_MATHEMATICAL_OPERATORS),
    /**
     * Miscellaneous Symbols and Arrows.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-symbols-and-arrows/
     */
    MISCELLANEOUS_SYMBOLS_AND_ARROWS("misc-symbols-and-arrows", 0x2B00, 0x2BFF,
            UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS),
    /**
     * Glagolitic.
     *
     * https://www.unicodepedia.com/groups/glagolitic/
     */
    GLAGOLITIC("glagolitic", 0x2C00, 0x2C5F, UnicodeBlock.GLAGOLITIC),
    /**
     * Latin Extended-C.
     *
     * https://www.unicodepedia.com/groups/latin-extended-c/
     */
    LATIN_EXTENDED_C("latin-extended-c", 0x2C60, 0x2C7F, UnicodeBlock.LATIN_EXTENDED_C),
    /**
     * Coptic.
     *
     * https://www.unicodepedia.com/groups/coptic/
     */
    COPTIC("coptic", 0x2C80, 0x2CFF, UnicodeBlock.COPTIC),
    /**
     * Georgian Supplement.
     *
     * https://www.unicodepedia.com/groups/georgian-supplement/
     */
    GEORGIAN_SUPPLEMENT("georgian-supplement", 0x2D00, 0x2D2F, UnicodeBlock.GEORGIAN_SUPPLEMENT),
    /**
     * Tifinagh.
     *
     * https://www.unicodepedia.com/groups/tifinagh/
     */
    TIFINAGH("tifinagh", 0x2D30, 0x2D7F, UnicodeBlock.TIFINAGH),
    /**
     * Ethiopic Extended.
     *
     * https://www.unicodepedia.com/groups/ethiopic-extended/
     */
    ETHIOPIC_EXTENDED("ethiopic-extended", 0x2D80, 0x2DDF, UnicodeBlock.ETHIOPIC_EXTENDED),
    /**
     * Cyrillic Extended-A.
     *
     * https://www.unicodepedia.com/groups/cyrillic-extended-a/
     */
    CYRILLIC_EXTENDED_A("cyrillic-extended-a", 0x2DE0, 0x2DFF, UnicodeBlock.CYRILLIC_EXTENDED_A),
    /**
     * Supplemental Punctuation.
     *
     * https://www.unicodepedia.com/groups/supplemental-punctuation/
     */
    SUPPLEMENTAL_PUNCTUATION("supplemental-punctuation", 0x2E00, 0x2E7F, UnicodeBlock.SUPPLEMENTAL_PUNCTUATION),
    /**
     * CJK Radicals Supplement.
     *
     * https://www.unicodepedia.com/groups/cjk-radicals-supplement/
     */
    CJK_RADICALS_SUPPLEMENT("cjk-radicals-supplement", 0x2E80, 0x2EFF, UnicodeBlock.CJK_RADICALS_SUPPLEMENT),
    /**
     * Kangxi Radicals.
     *
     * https://www.unicodepedia.com/groups/kangxi-radicals/
     */
    KANGXI_RADICALS("kangxi-radicals", 0x2F00, 0x2FDF, UnicodeBlock.KANGXI_RADICALS),
    /**
     * Ideographic Description Characters.
     *
     * https://www.unicodepedia.com/groups/ideographic-description-characters/
     */
    IDEOGRAPHIC_DESCRIPTION_CHARACTERS("ideographic-description-chars", 0x2FF0, 0x2FFF,
            UnicodeBlock.IDEOGRAPHIC_DESCRIPTION_CHARACTERS),
    /**
     * CJK Symbols and Punctuation.
     *
     * https://www.unicodepedia.com/groups/cjk-symbols-and-punctuation/
     */
    CJK_SYMBOLS_AND_PUNCTUATION("cjk-symbols-and-punctuation", 0x3000, 0x303F,
            UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION),
    /**
     * Hiragana.
     *
     * https://www.unicodepedia.com/groups/hiragana/
     */
    HIRAGANA("hiragana", 0x3040, 0x309F, UnicodeBlock.HIRAGANA),
    /**
     * Katakana.
     *
     * https://www.unicodepedia.com/groups/katakana/
     */
    KATAKANA("katakana", 0x30A0, 0x30FF, UnicodeBlock.KATAKANA),
    /**
     * Bopomofo.
     *
     * https://www.unicodepedia.com/groups/bopomofo/
     */
    BOPOMOFO("bopomofo", 0x3100, 0x312F, UnicodeBlock.BOPOMOFO),
    /**
     * Hangul Compatibility Jamo.
     *
     * https://www.unicodepedia.com/groups/hangul-compatibility-jamo/
     */
    HANGUL_COMPATIBILITY_JAMO("hangul-compatibility-jamo", 0x3130, 0x318F, UnicodeBlock.HANGUL_COMPATIBILITY_JAMO),
    /**
     * Kanbun.
     *
     * https://www.unicodepedia.com/groups/kanbun/
     */
    KANBUN("kanbun", 0x3190, 0x319F, UnicodeBlock.KANBUN),
    /**
     * Bopomofo Extended.
     *
     * https://www.unicodepedia.com/groups/bopomofo-extended/
     */
    BOPOMOFO_EXTENDED("bopomofo-extended", 0x31A0, 0x31BF, UnicodeBlock.BOPOMOFO_EXTENDED),
    /**
     * CJK Strokes.
     *
     * https://www.unicodepedia.com/groups/cjk-strokes/
     */
    CJK_STROKES("cjk-strokes", 0x31C0, 0x31EF, UnicodeBlock.CJK_STROKES),
    /**
     * Katakana Phonetic Extensions.
     *
     * https://www.unicodepedia.com/groups/katakana-phonetic-extensions/
     */
    KATAKANA_PHONETIC_EXTENSIONS("katakana-phonetic-extensions", 0x31F0, 0x31FF,
            UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS),
    /**
     * Enclosed CJK Letters and Months.
     *
     * https://www.unicodepedia.com/groups/enclosed-cjk-letters-and-months/
     */
    ENCLOSED_CJK_LETTERS_AND_MONTHS("enclosed-cjk-letters-and-months", 0x3200, 0x32FF,
            UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS),
    /**
     * CJK Compatibility.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility/
     */
    CJK_COMPATIBILITY("cjk-compatibility", 0x3300, 0x33FF, UnicodeBlock.CJK_COMPATIBILITY),
    /**
     * CJK Unified Ideographs Extension A.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-a/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A("cjk-unified-ideographs-ext-a", 0x3400, 0x4DBF,
            UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A),
    /**
     * Yijing Hexagram Symbols.
     *
     * https://www.unicodepedia.com/groups/yijing-hexagram-symbols/
     */
    YIJING_HEXAGRAM_SYMBOLS("yijing-hexagram-symbols", 0x4DC0, 0x4DFF, UnicodeBlock.YIJING_HEXAGRAM_SYMBOLS),
    /**
     * CJK Unified Ideographs.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs/
     */
    CJK_UNIFIED_IDEOGRAPHS("cjk-unified-ideographs", 0x4E00, 0x9FFF, UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS),
    /**
     * Yi Syllables.
     *
     * https://www.unicodepedia.com/groups/yi-syllables/
     */
    YI_SYLLABLES("yi-syllables", 0xA000, 0xA48F, UnicodeBlock.YI_SYLLABLES),
    /**
     * Yi Radicals.
     *
     * https://www.unicodepedia.com/groups/yi-radicals/
     */
    YI_RADICALS("yi-radicals", 0xA490, 0xA4CF, UnicodeBlock.YI_RADICALS),
    /**
     * Lisu.
     *
     * https://www.unicodepedia.com/groups/lisu/
     */
    LISU("lisu", 0xA4D0, 0xA4FF, UnicodeBlock.LISU),
    /**
     * Vai.
     *
     * https://www.unicodepedia.com/groups/vai/
     */
    VAI("vai", 0xA500, 0xA63F, UnicodeBlock.VAI),
    /**
     * Cyrillic Extended-B.
     *
     * https://www.unicodepedia.com/groups/cyrillic-extended-b/
     */
    CYRILLIC_EXTENDED_B("cyrillic-extended-b", 0xA640, 0xA69F, UnicodeBlock.CYRILLIC_EXTENDED_B),
    /**
     * Bamum.
     *
     * https://www.unicodepedia.com/groups/bamum/
     */
    BAMUM("bamum", 0xA6A0, 0xA6FF, UnicodeBlock.BAMUM),
    /**
     * Modifier Tone Letters.
     *
     * https://www.unicodepedia.com/groups/modifier-tone-letters/
     */
    MODIFIER_TONE_LETTERS("modifier-tone-letters", 0xA700, 0xA71F, UnicodeBlock.MODIFIER_TONE_LETTERS),
    /**
     * Latin Extended-D.
     *
     * https://www.unicodepedia.com/groups/latin-extended-d/
     */
    LATIN_EXTENDED_D("latin-extended-d", 0xA720, 0xA7FF, UnicodeBlock.LATIN_EXTENDED_D),
    /**
     * Syloti Nagri.
     *
     * https://www.unicodepedia.com/groups/syloti-nagri/
     */
    SYLOTI_NAGRI("syloti-nagri", 0xA800, 0xA82F, UnicodeBlock.SYLOTI_NAGRI),
    /**
     * Common Indic Number Forms.
     *
     * https://www.unicodepedia.com/groups/common-indic-number-forms/
     */
    COMMON_INDIC_NUMBER_FORMS("common-indic-number-forms", 0xA830, 0xA83F, UnicodeBlock.COMMON_INDIC_NUMBER_FORMS),
    /**
     * Phags-pa.
     *
     * https://www.unicodepedia.com/groups/phags-pa/
     */
    PHAGS_PA("phags-pa", 0xA840, 0xA87F, UnicodeBlock.PHAGS_PA),
    /**
     * Saurashtra.
     *
     * https://www.unicodepedia.com/groups/saurashtra/
     */
    SAURASHTRA("saurashtra", 0xA880, 0xA8DF, UnicodeBlock.SAURASHTRA),
    /**
     * Devanagari Extended.
     *
     * https://www.unicodepedia.com/groups/devanagari-extended/
     */
    DEVANAGARI_EXTENDED("devanagari-extended", 0xA8E0, 0xA8FF, UnicodeBlock.DEVANAGARI_EXTENDED),
    /**
     * Kayah Li.
     *
     * https://www.unicodepedia.com/groups/kayah-li/
     */
    KAYAH_LI("kayah-li", 0xA900, 0xA92F, UnicodeBlock.KAYAH_LI),
    /**
     * Rejang.
     *
     * https://www.unicodepedia.com/groups/rejang/
     */
    REJANG("rejang", 0xA930, 0xA95F, UnicodeBlock.REJANG),
    /**
     * Hangul Jamo Extended-A.
     *
     * https://www.unicodepedia.com/groups/hangul-jamo-extended-a/
     */
    HANGUL_JAMO_EXTENDED_A("hangul-jamo-extended-a", 0xA960, 0xA97F, UnicodeBlock.HANGUL_JAMO_EXTENDED_A),
    /**
     * Javanese.
     *
     * https://www.unicodepedia.com/groups/javanese/
     */
    JAVANESE("javanese", 0xA980, 0xA9DF, UnicodeBlock.JAVANESE),
    /**
     * Cham.
     *
     * https://www.unicodepedia.com/groups/cham/
     */
    CHAM("cham", 0xAA00, 0xAA5F, UnicodeBlock.CHAM),
    /**
     * Myanmar Extended-A.
     *
     * https://www.unicodepedia.com/groups/myanmar-extended-a/
     */
    MYANMAR_EXTENDED_A("myanmar-extended-a", 0xAA60, 0xAA7F, UnicodeBlock.MYANMAR_EXTENDED_A),
    /**
     * Tai Viet.
     *
     * https://www.unicodepedia.com/groups/tai-viet/
     */
    TAI_VIET("tai-viet", 0xAA80, 0xAADF, UnicodeBlock.TAI_VIET),
    /**
     * Ethiopic Extended-A.
     *
     * https://www.unicodepedia.com/groups/ethiopic-extended-a/
     */
    ETHIOPIC_EXTENDED_A("ethiopic-extended-a", 0xAB00, 0xAB2F, UnicodeBlock.ETHIOPIC_EXTENDED_A),
    /**
     * Meetei Mayek.
     *
     * https://www.unicodepedia.com/groups/meetei-mayek/
     */
    MEETEI_MAYEK("meetei-mayek", 0xABC0, 0xABFF, UnicodeBlock.MEETEI_MAYEK),
    /**
     * Hangul Syllables.
     *
     * https://www.unicodepedia.com/groups/hangul-syllables/
     */
    HANGUL_SYLLABLES("hangul-syllables", 0xAC00, 0xD7AF, UnicodeBlock.HANGUL_SYLLABLES),
    /**
     * Hangul Jamo Extended-B.
     *
     * https://www.unicodepedia.com/groups/hangul-jamo-extended-b/
     */
    HANGUL_JAMO_EXTENDED_B("hangul-jamo-extended-b", 0xD7B0, 0xD7FF, UnicodeBlock.HANGUL_JAMO_EXTENDED_B),
    /**
     * High Surrogates.
     *
     * https://www.unicodepedia.com/groups/high-surrogates/
     */
    HIGH_SURROGATES("high-surrogates", 0xD800, 0xDB7F, UnicodeBlock.HIGH_SURROGATES),
    /**
     * High Private Use Surrogates.
     *
     * https://www.unicodepedia.com/groups/high-private-use-surrogates/
     */
    HIGH_PRIVATE_USE_SURROGATES("high-private-use-surrogates", 0xDB80, 0xDBFF,
            UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES),
    /**
     * Low Surrogates.
     *
     * https://www.unicodepedia.com/groups/low-surrogates/
     */
    LOW_SURROGATES("low-surrogates", 0xDC00, 0xDFFF, UnicodeBlock.LOW_SURROGATES),
    /**
     * Private Use Area.
     *
     * https://www.unicodepedia.com/groups/private-use-area/
     */
    PRIVATE_USE_AREA("private-use-area", 0xE000, 0xF8FF, UnicodeBlock.PRIVATE_USE_AREA),
    /**
     * CJK Compatibility Ideographs.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility-ideographs/
     */
    CJK_COMPATIBILITY_IDEOGRAPHS("cjk-compatibility-ideographs", 0xF900, 0xFAFF,
            UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS),
    /**
     * Alphabetic Presentation Forms.
     *
     * https://www.unicodepedia.com/groups/alphabetic-presentation-forms/
     */
    ALPHABETIC_PRESENTATION_FORMS("alphabetic-presentation-forms", 0xFB00, 0xFB4F,
            UnicodeBlock.ALPHABETIC_PRESENTATION_FORMS),
    /**
     * Arabic Presentation Forms-A.
     *
     * https://www.unicodepedia.com/groups/arabic-presentation-forms-a/
     */
    ARABIC_PRESENTATION_FORMS_A("arabic-presentation-forms-a", 0xFB50, 0xFDFF,
            UnicodeBlock.ARABIC_PRESENTATION_FORMS_A),
    /**
     * Variation Selectors.
     *
     * https://www.unicodepedia.com/groups/variation-selectors/
     */
    VARIATION_SELECTORS("variation-selectors", 0xFE00, 0xFE0F, UnicodeBlock.VARIATION_SELECTORS),
    /**
     * Vertical Forms.
     *
     * https://www.unicodepedia.com/groups/vertical-forms/
     */
    VERTICAL_FORMS("vertical-forms", 0xFE10, 0xFE1F, UnicodeBlock.VERTICAL_FORMS),
    /**
     * Combining Half Marks.
     *
     * https://www.unicodepedia.com/groups/combining-half-marks/
     */
    COMBINING_HALF_MARKS("combining-half-marks", 0xFE20, 0xFE2F, UnicodeBlock.COMBINING_HALF_MARKS),
    /**
     * CJK Compatibility Forms.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility-forms/
     */
    CJK_COMPATIBILITY_FORMS("cjk-compatibility-forms", 0xFE30, 0xFE4F, UnicodeBlock.CJK_COMPATIBILITY_FORMS),
    /**
     * Small Form Variants.
     *
     * https://www.unicodepedia.com/groups/small-form-variants/
     */
    SMALL_FORM_VARIANTS("small-form-variants", 0xFE50, 0xFE6F, UnicodeBlock.SMALL_FORM_VARIANTS),
    /**
     * Arabic Presentation Forms-B.
     *
     * https://www.unicodepedia.com/groups/arabic-presentation-forms-b/
     */
    ARABIC_PRESENTATION_FORMS_B("arabic-presentation-forms-b", 0xFE70, 0xFEFF,
            UnicodeBlock.ARABIC_PRESENTATION_FORMS_B),
    /**
     * Halfwidth and Fullwidth Forms.
     *
     * https://www.unicodepedia.com/groups/halfwidth-and-fullwidth-forms/
     */
    HALFWIDTH_AND_FULLWIDTH_FORMS("halfwidth-and-fullwidth-forms", 0xFF00, 0xFFEF,
            UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS),
    /**
     * Specials.
     *
     * https://www.unicodepedia.com/groups/specials/
     */
    SPECIALS("specials", 0xFFF0, 0xFFFF, UnicodeBlock.SPECIALS),
    /**
     * Linear B Syllabary.
     *
     * https://www.unicodepedia.com/groups/linear-b-syllabary/
     */
    LINEAR_B_SYLLABARY("linear-b-syllabary", 0x10000, 0x1007F, UnicodeBlock.LINEAR_B_SYLLABARY),
    /**
     * Linear B Ideograms.
     *
     * https://www.unicodepedia.com/groups/linear-b-ideograms/
     */
    LINEAR_B_IDEOGRAMS("linear-b-ideograms", 0x10080, 0x100FF, UnicodeBlock.LINEAR_B_IDEOGRAMS),
    /**
     * Aegean Numbers.
     *
     * https://www.unicodepedia.com/groups/aegean-numbers/
     */
    AEGEAN_NUMBERS("aegean-numbers", 0x10100, 0x1013F, UnicodeBlock.AEGEAN_NUMBERS),
    /**
     * Ancient Greek Numbers.
     *
     * https://www.unicodepedia.com/groups/ancient-greek-numbers/
     */
    ANCIENT_GREEK_NUMBERS("ancient-greek-numbers", 0x10140, 0x1018F, UnicodeBlock.ANCIENT_GREEK_NUMBERS),
    /**
     * Ancient Symbols.
     *
     * https://www.unicodepedia.com/groups/ancient-symbols/
     */
    ANCIENT_SYMBOLS("ancient-symbols", 0x10190, 0x101CF, UnicodeBlock.ANCIENT_SYMBOLS),
    /**
     * Phaistos Disc.
     *
     * https://www.unicodepedia.com/groups/phaistos-disc/
     */
    PHAISTOS_DISC("phaistos-disc", 0x101D0, 0x101FF, UnicodeBlock.PHAISTOS_DISC),
    /**
     * Lycian.
     *
     * https://www.unicodepedia.com/groups/lycian/
     */
    LYCIAN("lycian", 0x10280, 0x1029F, UnicodeBlock.LYCIAN),
    /**
     * Carian.
     *
     * https://www.unicodepedia.com/groups/carian/
     */
    CARIAN("carian", 0x102A0, 0x102DF, UnicodeBlock.CARIAN),
    /**
     * Old Italic.
     *
     * https://www.unicodepedia.com/groups/old-italic/
     */
    OLD_ITALIC("old-italic", 0x10300, 0x1032F, UnicodeBlock.OLD_ITALIC),
    /**
     * Gothic.
     *
     * https://www.unicodepedia.com/groups/gothic/
     */
    GOTHIC("gothic", 0x10330, 0x1034F, UnicodeBlock.GOTHIC),
    /**
     * Ugaritic.
     *
     * https://www.unicodepedia.com/groups/ugaritic/
     */
    UGARITIC("ugaritic", 0x10380, 0x1039F, UnicodeBlock.UGARITIC),
    /**
     * Old Persian.
     *
     * https://www.unicodepedia.com/groups/old-persian/
     */
    OLD_PERSIAN("old-persian", 0x103A0, 0x103DF, UnicodeBlock.OLD_PERSIAN),
    /**
     * Deseret.
     *
     * https://www.unicodepedia.com/groups/deseret/
     */
    DESERET("deseret", 0x10400, 0x1044F, UnicodeBlock.DESERET),
    /**
     * Shavian.
     *
     * https://www.unicodepedia.com/groups/shavian/
     */
    SHAVIAN("shavian", 0x10450, 0x1047F, UnicodeBlock.SHAVIAN),
    /**
     * Osmanya.
     *
     * https://www.unicodepedia.com/groups/osmanya/
     */
    OSMANYA("osmanya", 0x10480, 0x104AF, UnicodeBlock.OSMANYA),
    /**
     * Cypriot Syllabary.
     *
     * https://www.unicodepedia.com/groups/cypriot-syllabary/
     */
    CYPRIOT_SYLLABARY("cypriot-syllabary", 0x10800, 0x1083F, UnicodeBlock.CYPRIOT_SYLLABARY),
    /**
     * Imperial Aramaic.
     *
     * https://www.unicodepedia.com/groups/imperial-aramaic/
     */
    IMPERIAL_ARAMAIC("imperial-aramaic", 0x10840, 0x1085F, UnicodeBlock.IMPERIAL_ARAMAIC),
    /**
     * Phoenician.
     *
     * https://www.unicodepedia.com/groups/phoenician/
     */
    PHOENICIAN("phoenician", 0x10900, 0x1091F, UnicodeBlock.PHOENICIAN),
    /**
     * Lydian.
     *
     * https://www.unicodepedia.com/groups/lydian/
     */
    LYDIAN("lydian", 0x10920, 0x1093F, UnicodeBlock.LYDIAN),
    /**
     * Kharoshthi.
     *
     * https://www.unicodepedia.com/groups/kharoshthi/
     */
    KHAROSHTHI("kharoshthi", 0x10A00, 0x10A5F, UnicodeBlock.KHAROSHTHI),
    /**
     * Old South Arabian.
     *
     * https://www.unicodepedia.com/groups/old-south-arabian/
     */
    OLD_SOUTH_ARABIAN("old-south-arabian", 0x10A60, 0x10A7F, UnicodeBlock.OLD_SOUTH_ARABIAN),
    /**
     * Avestan.
     *
     * https://www.unicodepedia.com/groups/avestan/
     */
    AVESTAN("avestan", 0x10B00, 0x10B3F, UnicodeBlock.AVESTAN),
    /**
     * Inscriptional Parthian.
     *
     * https://www.unicodepedia.com/groups/inscriptional-parthian/
     */
    INSCRIPTIONAL_PARTHIAN("inscriptional-parthian", 0x10B40, 0x10B5F, UnicodeBlock.INSCRIPTIONAL_PARTHIAN),
    /**
     * Inscriptional Pahlavi.
     *
     * https://www.unicodepedia.com/groups/inscriptional-pahlavi/
     */
    INSCRIPTIONAL_PAHLAVI("inscriptional-pahlavi", 0x10B60, 0x10B7F, UnicodeBlock.INSCRIPTIONAL_PAHLAVI),
    /**
     * Old Turkic.
     *
     * https://www.unicodepedia.com/groups/old-turkic/
     */
    OLD_TURKIC("old-turkic", 0x10C00, 0x10C4F, UnicodeBlock.OLD_TURKIC),
    /**
     * Rumi Numeral Symbols.
     *
     * https://www.unicodepedia.com/groups/rumi-numeral-symbols/
     */
    RUMI_NUMERAL_SYMBOLS("rumi-numeral-symbols", 0x10E60, 0x10E7F, UnicodeBlock.RUMI_NUMERAL_SYMBOLS),
    /**
     * Brahmi.
     *
     * https://www.unicodepedia.com/groups/brahmi/
     */
    BRAHMI("brahmi", 0x11000, 0x1107F, UnicodeBlock.BRAHMI),
    /**
     * Kaithi.
     *
     * https://www.unicodepedia.com/groups/kaithi/
     */
    KAITHI("kaithi", 0x11080, 0x110CF, UnicodeBlock.KAITHI),
    /**
     * Cuneiform.
     *
     * https://www.unicodepedia.com/groups/cuneiform/
     */
    CUNEIFORM("cuneiform", 0x12000, 0x123FF, UnicodeBlock.CUNEIFORM),
    /**
     * Cuneiform Numbers and Punctuation.
     *
     * https://www.unicodepedia.com/groups/cuneiform-numbers-and-punctuation/
     */
    CUNEIFORM_NUMBERS_AND_PUNCTUATION("cuneiform-numbers-punctuation", 0x12400, 0x1247F,
            UnicodeBlock.CUNEIFORM_NUMBERS_AND_PUNCTUATION),
    /**
     * Egyptian Hieroglyphs.
     *
     * https://www.unicodepedia.com/groups/egyptian-hieroglyphs/
     */
    EGYPTIAN_HIEROGLYPHS("egyptian-hieroglyphs", 0x13000, 0x1342F, UnicodeBlock.EGYPTIAN_HIEROGLYPHS),
    /**
     * Bamum Supplement.
     *
     * https://www.unicodepedia.com/groups/bamum-supplement/
     */
    BAMUM_SUPPLEMENT("bamum-supplement", 0x16800, 0x16A3F, UnicodeBlock.BAMUM_SUPPLEMENT),
    /**
     * Kana Supplement.
     *
     * https://www.unicodepedia.com/groups/kana-supplement/
     */
    KANA_SUPPLEMENT("kana-supplement", 0x1B000, 0x1B0FF, UnicodeBlock.KANA_SUPPLEMENT),
    /**
     * Byzantine Musical Symbols.
     *
     * https://www.unicodepedia.com/groups/byzantine-musical-symbols/
     */
    BYZANTINE_MUSICAL_SYMBOLS("byzantine-musical-symbols", 0x1D000, 0x1D0FF, UnicodeBlock.BYZANTINE_MUSICAL_SYMBOLS),
    /**
     * Musical Symbols.
     *
     * https://www.unicodepedia.com/groups/musical-symbols/
     */
    MUSICAL_SYMBOLS("musical-symbols", 0x1D100, 0x1D1FF, UnicodeBlock.MUSICAL_SYMBOLS),
    /**
     * Ancient Greek Musical Notation.
     *
     * https://www.unicodepedia.com/groups/ancient-greek-musical-notation/
     */
    ANCIENT_GREEK_MUSICAL_NOTATION("ancient-greek-musical-notation", 0x1D200, 0x1D24F,
            UnicodeBlock.ANCIENT_GREEK_MUSICAL_NOTATION),
    /**
     * Tai Xuan Jing Symbols.
     *
     * https://www.unicodepedia.com/groups/tai-xuan-jing-symbols/
     */
    TAI_XUAN_JING_SYMBOLS("tai-xuan-jing-symbols", 0x1D300, 0x1D35F, UnicodeBlock.TAI_XUAN_JING_SYMBOLS),
    /**
     * Counting Rod Numerals.
     *
     * https://www.unicodepedia.com/groups/counting-rod-numerals/
     */
    COUNTING_ROD_NUMERALS("counting-rod-numerals", 0x1D360, 0x1D37F, UnicodeBlock.COUNTING_ROD_NUMERALS),
    /**
     * Mathematical Alphanumeric Symbols.
     *
     * https://www.unicodepedia.com/groups/mathematical-alphanumeric-symbols/
     */
    MATHEMATICAL_ALPHANUMERIC_SYMBOLS("math-alphanumeric-symbols", 0x1D400, 0x1D7FF,
            UnicodeBlock.MATHEMATICAL_ALPHANUMERIC_SYMBOLS),
    /**
     * Mahjong Tiles.
     *
     * https://www.unicodepedia.com/groups/mahjong-tiles/
     */
    MAHJONG_TILES("mahjong-tiles", 0x1F000, 0x1F02F, UnicodeBlock.MAHJONG_TILES),
    /**
     * Domino Tiles.
     *
     * https://www.unicodepedia.com/groups/domino-tiles/
     */
    DOMINO_TILES("domino-tiles", 0x1F030, 0x1F09F, UnicodeBlock.DOMINO_TILES),
    /**
     * Playing Cards.
     *
     * https://www.unicodepedia.com/groups/playing-cards/
     */
    PLAYING_CARDS("playing-cards", 0x1F0A0, 0x1F0FF, UnicodeBlock.PLAYING_CARDS),
    /**
     * Enclosed Alphanumeric Supplement.
     *
     * https://www.unicodepedia.com/groups/enclosed-alphanumeric-supplement/
     */
    ENCLOSED_ALPHANUMERIC_SUPPLEMENT("enclosed-alphanumeric-supp", 0x1F100, 0x1F1FF,
            UnicodeBlock.ENCLOSED_ALPHANUMERIC_SUPPLEMENT),
    /**
     * Enclosed Ideographic Supplement.
     *
     * https://www.unicodepedia.com/groups/enclosed-ideographic-supplement/
     */
    ENCLOSED_IDEOGRAPHIC_SUPPLEMENT("enclosed-ideographic-supplement", 0x1F200, 0x1F2FF,
            UnicodeBlock.ENCLOSED_IDEOGRAPHIC_SUPPLEMENT),
    /**
     * Miscellaneous Symbols And Pictographs.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-symbols-and-pictographs/
     */
    MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS("misc-symbols-and-pictographs", 0x1F300, 0x1F5FF,
            UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS),
    /**
     * Emoticons.
     *
     * https://www.unicodepedia.com/groups/emoticons/
     */
    EMOTICONS("emoticons", 0x1F600, 0x1F64F, UnicodeBlock.EMOTICONS),
    /**
     * Transport And Map Symbols.
     *
     * https://www.unicodepedia.com/groups/transport-and-map-symbols/
     */
    TRANSPORT_AND_MAP_SYMBOLS("transport-and-map-symbols", 0x1F680, 0x1F6FF, UnicodeBlock.TRANSPORT_AND_MAP_SYMBOLS),
    /**
     * Alchemical Symbols.
     *
     * https://www.unicodepedia.com/groups/alchemical-symbols/
     */
    ALCHEMICAL_SYMBOLS("alchemical-symbols", 0x1F700, 0x1F77F, UnicodeBlock.ALCHEMICAL_SYMBOLS),
    /**
     * CJK Unified Ideographs Extension B.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-b/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B("cjk-unified-ideographs-ext-b", 0x20000, 0x2A6DF,
            UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B),
    /**
     * CJK Unified Ideographs Extension C.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-c/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C("cjk-unified-ideographs-ext-c", 0x2A700, 0x2B73F,
            UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C),
    /**
     * CJK Unified Ideographs Extension D.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-d/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D("cjk-unified-ideographs-ext-d", 0x2B740, 0x2B81F,
            UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D),
    /**
     * CJK Compatibility Ideographs Supplement.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility-ideographs-supplement/
     */
    CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT("cjk-compat-ideographs-sup", 0x2F800, 0x2FA1F,
            UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT),
    /**
     * Tags.
     *
     * https://www.unicodepedia.com/groups/tags/
     */
    TAGS("tags", 0xE0000, 0xE007F, UnicodeBlock.TAGS),
    /**
     * Variation Selectors Supplement.
     *
     * https://www.unicodepedia.com/groups/variation-selectors-supplement/
     */
    VARIATION_SELECTORS_SUPPLEMENT("variation-selectors-supplement", 0xE0100, 0xE01EF,
            UnicodeBlock.VARIATION_SELECTORS_SUPPLEMENT),
    /**
     * Supplementary Private Use Area-A.
     *
     * https://www.unicodepedia.com/groups/supplementary-private-use-area-a/
     */
    SUPPLEMENTARY_PRIVATE_USE_AREA_A("supplementary-private-use-a", 0xF0000, 0xFFFFF,
            UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A),
    /**
     * Supplementary Private Use Area-B.
     *
     * https://www.unicodepedia.com/groups/supplementary-private-use-area-b/
     */
    SUPPLEMENTARY_PRIVATE_USE_AREA_B("supplementary-private-use-b", 0x100000, 0x10FFFF,
            UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B);

    private final String alias;
    private final int lower;
    private final int upper;
    private final UnicodeBlock block;

    UnicodeRange(String alias, int lower, int upper, UnicodeBlock block) {
        this.alias = alias;
        this.lower = lower;
        this.upper = upper;
        this.block = block;
    }


    @JsonValue
    public String getAlias() {
        return alias;
    }


    public int getLower() {
        return lower;
    }


    public int getUpper() {
        return upper;
    }


    public UnicodeBlock getBlock() {
        return block;
    }


    public boolean contains(int codePoint) {
        return block.equals(UnicodeBlock.of(codePoint));
    }


    @JsonCreator
    public static UnicodeRange fromAlias(String alias) {
        for (UnicodeRange value : values()) {
            if (value.alias.equals(alias)) {
                return value;
            }
        }

        throw new IllegalArgumentException("Unknown unicode range: " + alias);
    }


    public static UnicodeRange fromCodePoint(int codePoint) {
        UnicodeBlock block = UnicodeBlock.of(codePoint);

        for (UnicodeRange value : values()) {
            if (value.block.equals(block)) {
                return value;
            }
        }

        throw new IllegalArgumentException("No unicode range for code point: " + codePoint);
    }
}
