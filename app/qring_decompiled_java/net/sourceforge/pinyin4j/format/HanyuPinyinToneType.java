package net.sourceforge.pinyin4j.format;

/* loaded from: classes3.dex */
public class HanyuPinyinToneType {
    protected java.lang.String name;
    public static final net.sourceforge.pinyin4j.format.HanyuPinyinToneType WITH_TONE_NUMBER = new net.sourceforge.pinyin4j.format.HanyuPinyinToneType("WITH_TONE_NUMBER");
    public static final net.sourceforge.pinyin4j.format.HanyuPinyinToneType WITHOUT_TONE = new net.sourceforge.pinyin4j.format.HanyuPinyinToneType("WITHOUT_TONE");
    public static final net.sourceforge.pinyin4j.format.HanyuPinyinToneType WITH_TONE_MARK = new net.sourceforge.pinyin4j.format.HanyuPinyinToneType("WITH_TONE_MARK");

    public java.lang.String getName() {
        return this.name;
    }

    protected void setName(java.lang.String str) {
        this.name = str;
    }

    protected HanyuPinyinToneType(java.lang.String str) {
        setName(str);
    }
}
