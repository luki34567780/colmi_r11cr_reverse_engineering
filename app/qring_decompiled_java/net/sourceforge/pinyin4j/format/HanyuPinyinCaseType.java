package net.sourceforge.pinyin4j.format;

/* loaded from: classes3.dex */
public class HanyuPinyinCaseType {
    protected java.lang.String name;
    public static final net.sourceforge.pinyin4j.format.HanyuPinyinCaseType UPPERCASE = new net.sourceforge.pinyin4j.format.HanyuPinyinCaseType("UPPERCASE");
    public static final net.sourceforge.pinyin4j.format.HanyuPinyinCaseType LOWERCASE = new net.sourceforge.pinyin4j.format.HanyuPinyinCaseType("LOWERCASE");

    public java.lang.String getName() {
        return this.name;
    }

    protected void setName(java.lang.String str) {
        this.name = str;
    }

    protected HanyuPinyinCaseType(java.lang.String str) {
        setName(str);
    }
}
