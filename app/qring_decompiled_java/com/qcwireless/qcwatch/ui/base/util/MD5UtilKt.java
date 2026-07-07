package com.qcwireless.qcwatch.ui.base.util;

/* compiled from: MD5Util.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"encode", "", "text", "app_championRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: /tmp/dex/classes2.dex */
public final class MD5UtilKt {
    public static final java.lang.String encode(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(\"MD5\")");
            byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] digest = messageDigest.digest(bytes);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "instance.digest(text.toByteArray())");
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (byte b : digest) {
                java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    hexString = '0' + hexString;
                }
                stringBuffer.append(hexString);
            }
            java.lang.String stringBuffer2 = stringBuffer.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringBuffer2, "sb.toString()");
            return stringBuffer2;
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}
