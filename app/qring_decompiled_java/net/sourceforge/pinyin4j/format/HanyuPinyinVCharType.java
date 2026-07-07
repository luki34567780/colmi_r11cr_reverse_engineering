package net.sourceforge.pinyin4j.format;

/* loaded from: classes3.dex */
public class HanyuPinyinVCharType {
    protected java.lang.String name;
    public static final net.sourceforge.pinyin4j.format.HanyuPinyinVCharType WITH_U_AND_COLON = new net.sourceforge.pinyin4j.format.HanyuPinyinVCharType("WITH_U_AND_COLON");
    public static final net.sourceforge.pinyin4j.format.HanyuPinyinVCharType WITH_V = new net.sourceforge.pinyin4j.format.HanyuPinyinVCharType("WITH_V");
    public static final net.sourceforge.pinyin4j.format.HanyuPinyinVCharType WITH_U_UNICODE = new net.sourceforge.pinyin4j.format.HanyuPinyinVCharType("WITH_U_UNICODE");

    public java.lang.String getName() {
        return this.name;
    }

    protected void setName(java.lang.String str) {
        this.name = str;
    }

    protected HanyuPinyinVCharType(java.lang.String str) {
        setName(str);
    }
}
