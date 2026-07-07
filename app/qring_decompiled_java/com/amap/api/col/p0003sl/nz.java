package com.amap.api.col.p0003sl;

/* compiled from: Table.java */
/* loaded from: classes.dex */
public class nz {
    private static final java.lang.ThreadLocal<java.nio.charset.CharsetDecoder> b = new java.lang.ThreadLocal<java.nio.charset.CharsetDecoder>() { // from class: com.amap.api.col.3sl.nz.1
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ java.nio.charset.CharsetDecoder initialValue() {
            return a();
        }

        private static java.nio.charset.CharsetDecoder a() {
            return java.nio.charset.Charset.forName(com.bumptech.glide.load.Key.STRING_CHARSET_NAME).newDecoder();
        }
    };
    public static final java.lang.ThreadLocal<java.nio.charset.Charset> a = new java.lang.ThreadLocal<java.nio.charset.Charset>() { // from class: com.amap.api.col.3sl.nz.2
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ java.nio.charset.Charset initialValue() {
            return a();
        }

        private static java.nio.charset.Charset a() {
            return java.nio.charset.Charset.forName(com.bumptech.glide.load.Key.STRING_CHARSET_NAME);
        }
    };
    private static final java.lang.ThreadLocal<java.nio.CharBuffer> c = new java.lang.ThreadLocal<>();
}
