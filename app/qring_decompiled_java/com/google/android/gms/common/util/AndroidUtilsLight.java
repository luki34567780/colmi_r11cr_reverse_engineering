package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class AndroidUtilsLight {
    private static volatile int zza = -1;

    @java.lang.Deprecated
    public static byte[] getPackageCertificateHashBytes(android.content.Context context, java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
        java.security.MessageDigest zza2;
        android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(str, 64);
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1 || (zza2 = zza("SHA1")) == null) {
            return null;
        }
        return zza2.digest(packageInfo.signatures[0].toByteArray());
    }

    public static java.security.MessageDigest zza(java.lang.String str) {
        java.security.MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = java.security.MessageDigest.getInstance(str);
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
