package com.amap.api.services.core;

/* loaded from: classes.dex */
public class SearchUtils {
    public static java.lang.String getVersion() {
        return "9.7.0";
    }

    public static java.lang.String getSHA1(android.content.Context context) {
        try {
            byte[] digest = java.security.MessageDigest.getInstance("SHA1").digest(context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (byte b : digest) {
                java.lang.String upperCase = java.lang.Integer.toHexString(b & 255).toUpperCase(java.util.Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(":");
            }
            return stringBuffer.toString();
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.fn.a(th, "SearchUtils", "getSHA1");
            return null;
        }
    }

    public static java.lang.String getPkgName(android.content.Context context) {
        try {
            return context.getApplicationContext().getPackageName();
        } catch (java.lang.Throwable th) {
            com.amap.api.col.p0003sl.fn.a(th, "SearchUtils", "getPkgName");
            return null;
        }
    }
}
