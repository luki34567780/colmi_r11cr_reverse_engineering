package net.sourceforge.pinyin4j;

/* loaded from: classes3.dex */
class PinyinFormatter {
    PinyinFormatter() {
    }

    static java.lang.String formatHanyuPinyin(java.lang.String str, net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat hanyuPinyinOutputFormat) throws net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination {
        if (net.sourceforge.pinyin4j.format.HanyuPinyinToneType.WITH_TONE_MARK == hanyuPinyinOutputFormat.getToneType() && (net.sourceforge.pinyin4j.format.HanyuPinyinVCharType.WITH_V == hanyuPinyinOutputFormat.getVCharType() || net.sourceforge.pinyin4j.format.HanyuPinyinVCharType.WITH_U_AND_COLON == hanyuPinyinOutputFormat.getVCharType())) {
            throw new net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination("tone marks cannot be added to v or u:");
        }
        if (net.sourceforge.pinyin4j.format.HanyuPinyinToneType.WITHOUT_TONE == hanyuPinyinOutputFormat.getToneType()) {
            str = str.replaceAll("[1-5]", "");
        } else if (net.sourceforge.pinyin4j.format.HanyuPinyinToneType.WITH_TONE_MARK == hanyuPinyinOutputFormat.getToneType()) {
            str = convertToneNumber2ToneMark(str.replaceAll("u:", "v"));
        }
        if (net.sourceforge.pinyin4j.format.HanyuPinyinVCharType.WITH_V == hanyuPinyinOutputFormat.getVCharType()) {
            str = str.replaceAll("u:", "v");
        } else if (net.sourceforge.pinyin4j.format.HanyuPinyinVCharType.WITH_U_UNICODE == hanyuPinyinOutputFormat.getVCharType()) {
            str = str.replaceAll("u:", "ü");
        }
        return net.sourceforge.pinyin4j.format.HanyuPinyinCaseType.UPPERCASE == hanyuPinyinOutputFormat.getCaseType() ? str.toUpperCase() : str;
    }

    private static java.lang.String convertToneNumber2ToneMark(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase();
        if (!lowerCase.matches("[a-z]*[1-5]?")) {
            return lowerCase;
        }
        if (lowerCase.matches("[a-z]*[1-5]")) {
            int numericValue = java.lang.Character.getNumericValue(lowerCase.charAt(lowerCase.length() - 1));
            char c = 'a';
            int indexOf = lowerCase.indexOf(97);
            int indexOf2 = lowerCase.indexOf(101);
            int indexOf3 = lowerCase.indexOf("ou");
            if (-1 == indexOf) {
                if (-1 == indexOf2) {
                    if (-1 != indexOf3) {
                        c = "ou".charAt(0);
                        indexOf = indexOf3;
                    } else {
                        indexOf = lowerCase.length() - 1;
                        while (true) {
                            if (indexOf < 0) {
                                c = kotlin.text.Typography.dollar;
                                indexOf = -1;
                                break;
                            }
                            if (java.lang.String.valueOf(lowerCase.charAt(indexOf)).matches("[aeiouv]")) {
                                c = lowerCase.charAt(indexOf);
                                break;
                            }
                            indexOf--;
                        }
                    }
                } else {
                    indexOf = indexOf2;
                    c = 'e';
                }
            }
            if ('$' == c || -1 == indexOf) {
                return lowerCase;
            }
            return lowerCase.substring(0, indexOf).replaceAll("v", "ü") + "āáăàaēéĕèeīíĭìiōóŏòoūúŭùuǖǘǚǜü".charAt(("aeiouv".indexOf(c) * 5) + (numericValue - 1)) + lowerCase.substring(indexOf + 1, lowerCase.length() - 1).replaceAll("v", "ü");
        }
        return lowerCase.replaceAll("v", "ü");
    }
}
