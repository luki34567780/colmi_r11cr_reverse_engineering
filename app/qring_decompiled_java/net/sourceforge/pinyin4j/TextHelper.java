package net.sourceforge.pinyin4j;

/* loaded from: classes3.dex */
class TextHelper {
    TextHelper() {
    }

    static java.lang.String extractToneNumber(java.lang.String str) {
        return str.substring(str.length() - 1);
    }

    static java.lang.String extractPinyinString(java.lang.String str) {
        return str.substring(0, str.length() - 1);
    }
}
