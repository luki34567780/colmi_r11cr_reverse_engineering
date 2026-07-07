package kotlin.text;

/* compiled from: Charsets.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/text/Charsets;", "", "()V", "ISO_8859_1", "Ljava/nio/charset/Charset;", "US_ASCII", "UTF_16", "UTF_16BE", "UTF_16LE", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32BE", "UTF32_BE", "UTF_32LE", "UTF32_LE", "UTF_8", "utf_32", "utf_32be", "utf_32le", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Charsets {
    public static final kotlin.text.Charsets INSTANCE = new kotlin.text.Charsets();
    public static final java.nio.charset.Charset ISO_8859_1;
    public static final java.nio.charset.Charset US_ASCII;
    public static final java.nio.charset.Charset UTF_16;
    public static final java.nio.charset.Charset UTF_16BE;
    public static final java.nio.charset.Charset UTF_16LE;
    public static final java.nio.charset.Charset UTF_8;
    private static java.nio.charset.Charset utf_32;
    private static java.nio.charset.Charset utf_32be;
    private static java.nio.charset.Charset utf_32le;

    private Charsets() {
    }

    static {
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.bumptech.glide.load.Key.STRING_CHARSET_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
        UTF_8 = forName;
        java.nio.charset.Charset forName2 = java.nio.charset.Charset.forName("UTF-16");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName2, "forName(\"UTF-16\")");
        UTF_16 = forName2;
        java.nio.charset.Charset forName3 = java.nio.charset.Charset.forName("UTF-16BE");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName3, "forName(\"UTF-16BE\")");
        UTF_16BE = forName3;
        java.nio.charset.Charset forName4 = java.nio.charset.Charset.forName("UTF-16LE");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName4, "forName(\"UTF-16LE\")");
        UTF_16LE = forName4;
        java.nio.charset.Charset forName5 = java.nio.charset.Charset.forName("US-ASCII");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName5, "forName(\"US-ASCII\")");
        US_ASCII = forName5;
        java.nio.charset.Charset forName6 = java.nio.charset.Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName6, "forName(\"ISO-8859-1\")");
        ISO_8859_1 = forName6;
    }

    public final java.nio.charset.Charset UTF32() {
        java.nio.charset.Charset charset = utf_32;
        if (charset != null) {
            return charset;
        }
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-32");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-32\")");
        utf_32 = forName;
        return forName;
    }

    public final java.nio.charset.Charset UTF32_LE() {
        java.nio.charset.Charset charset = utf_32le;
        if (charset != null) {
            return charset;
        }
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-32LE");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-32LE\")");
        utf_32le = forName;
        return forName;
    }

    public final java.nio.charset.Charset UTF32_BE() {
        java.nio.charset.Charset charset = utf_32be;
        if (charset != null) {
            return charset;
        }
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-32BE");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-32BE\")");
        utf_32be = forName;
        return forName;
    }
}
