package net.sourceforge.pinyin4j;

/* loaded from: classes3.dex */
class ResourceHelper {
    ResourceHelper() {
    }

    static java.io.BufferedInputStream getResourceInputStream(java.lang.String str) {
        return new java.io.BufferedInputStream(net.sourceforge.pinyin4j.ResourceHelper.class.getResourceAsStream(str));
    }
}
