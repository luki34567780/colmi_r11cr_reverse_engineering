package net.sourceforge.pinyin4j;

/* loaded from: classes3.dex */
class GwoyeuRomatzyhTranslator {
    private static java.lang.String[] tones = {"_I", "_II", "_III", "_IV", "_V"};

    GwoyeuRomatzyhTranslator() {
    }

    static java.lang.String convertHanyuPinyinToGwoyeuRomatzyh(java.lang.String str) {
        java.lang.String extractPinyinString = net.sourceforge.pinyin4j.TextHelper.extractPinyinString(str);
        java.lang.String extractToneNumber = net.sourceforge.pinyin4j.TextHelper.extractToneNumber(str);
        try {
            com.hp.hpl.sparta.Element xpathSelectElement = net.sourceforge.pinyin4j.GwoyeuRomatzyhResource.getInstance().getPinyinToGwoyeuMappingDoc().xpathSelectElement("//" + net.sourceforge.pinyin4j.PinyinRomanizationType.HANYU_PINYIN.getTagName() + "[text()='" + extractPinyinString + "']");
            if (xpathSelectElement == null) {
                return null;
            }
            return xpathSelectElement.xpathSelectString("../" + net.sourceforge.pinyin4j.PinyinRomanizationType.GWOYEU_ROMATZYH.getTagName() + tones[java.lang.Integer.parseInt(extractToneNumber) - 1] + "/text()");
        } catch (com.hp.hpl.sparta.ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
