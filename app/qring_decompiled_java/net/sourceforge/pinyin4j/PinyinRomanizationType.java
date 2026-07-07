package net.sourceforge.pinyin4j;

/* loaded from: classes3.dex */
class PinyinRomanizationType {
    protected java.lang.String tagName;
    static final net.sourceforge.pinyin4j.PinyinRomanizationType HANYU_PINYIN = new net.sourceforge.pinyin4j.PinyinRomanizationType("Hanyu");
    static final net.sourceforge.pinyin4j.PinyinRomanizationType WADEGILES_PINYIN = new net.sourceforge.pinyin4j.PinyinRomanizationType("Wade");
    static final net.sourceforge.pinyin4j.PinyinRomanizationType MPS2_PINYIN = new net.sourceforge.pinyin4j.PinyinRomanizationType("MPSII");
    static final net.sourceforge.pinyin4j.PinyinRomanizationType YALE_PINYIN = new net.sourceforge.pinyin4j.PinyinRomanizationType("Yale");
    static final net.sourceforge.pinyin4j.PinyinRomanizationType TONGYONG_PINYIN = new net.sourceforge.pinyin4j.PinyinRomanizationType("Tongyong");
    static final net.sourceforge.pinyin4j.PinyinRomanizationType GWOYEU_ROMATZYH = new net.sourceforge.pinyin4j.PinyinRomanizationType("Gwoyeu");

    protected PinyinRomanizationType(java.lang.String str) {
        setTagName(str);
    }

    java.lang.String getTagName() {
        return this.tagName;
    }

    protected void setTagName(java.lang.String str) {
        this.tagName = str;
    }
}
