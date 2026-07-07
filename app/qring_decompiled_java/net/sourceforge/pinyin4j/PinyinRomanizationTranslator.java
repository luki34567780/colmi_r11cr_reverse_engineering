package net.sourceforge.pinyin4j;

/* loaded from: classes3.dex */
class PinyinRomanizationTranslator {
    PinyinRomanizationTranslator() {
    }

    static java.lang.String convertRomanizationSystem(java.lang.String str, net.sourceforge.pinyin4j.PinyinRomanizationType pinyinRomanizationType, net.sourceforge.pinyin4j.PinyinRomanizationType pinyinRomanizationType2) {
        java.lang.String extractPinyinString = net.sourceforge.pinyin4j.TextHelper.extractPinyinString(str);
        java.lang.String extractToneNumber = net.sourceforge.pinyin4j.TextHelper.extractToneNumber(str);
        try {
            com.hp.hpl.sparta.Element xpathSelectElement = net.sourceforge.pinyin4j.PinyinRomanizationResource.getInstance().getPinyinMappingDoc().xpathSelectElement("//" + pinyinRomanizationType.getTagName() + "[text()='" + extractPinyinString + "']");
            if (xpathSelectElement == null) {
                return null;
            }
            return xpathSelectElement.xpathSelectString("../" + pinyinRomanizationType2.getTagName() + "/text()") + extractToneNumber;
        } catch (com.hp.hpl.sparta.ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
