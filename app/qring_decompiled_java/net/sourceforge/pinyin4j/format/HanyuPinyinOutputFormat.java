package net.sourceforge.pinyin4j.format;

/* loaded from: classes3.dex */
public final class HanyuPinyinOutputFormat {
    private net.sourceforge.pinyin4j.format.HanyuPinyinCaseType caseType;
    private net.sourceforge.pinyin4j.format.HanyuPinyinToneType toneType;
    private net.sourceforge.pinyin4j.format.HanyuPinyinVCharType vCharType;

    public HanyuPinyinOutputFormat() {
        restoreDefault();
    }

    public void restoreDefault() {
        this.vCharType = net.sourceforge.pinyin4j.format.HanyuPinyinVCharType.WITH_U_AND_COLON;
        this.caseType = net.sourceforge.pinyin4j.format.HanyuPinyinCaseType.LOWERCASE;
        this.toneType = net.sourceforge.pinyin4j.format.HanyuPinyinToneType.WITH_TONE_NUMBER;
    }

    public net.sourceforge.pinyin4j.format.HanyuPinyinCaseType getCaseType() {
        return this.caseType;
    }

    public void setCaseType(net.sourceforge.pinyin4j.format.HanyuPinyinCaseType hanyuPinyinCaseType) {
        this.caseType = hanyuPinyinCaseType;
    }

    public net.sourceforge.pinyin4j.format.HanyuPinyinToneType getToneType() {
        return this.toneType;
    }

    public void setToneType(net.sourceforge.pinyin4j.format.HanyuPinyinToneType hanyuPinyinToneType) {
        this.toneType = hanyuPinyinToneType;
    }

    public net.sourceforge.pinyin4j.format.HanyuPinyinVCharType getVCharType() {
        return this.vCharType;
    }

    public void setVCharType(net.sourceforge.pinyin4j.format.HanyuPinyinVCharType hanyuPinyinVCharType) {
        this.vCharType = hanyuPinyinVCharType;
    }
}
