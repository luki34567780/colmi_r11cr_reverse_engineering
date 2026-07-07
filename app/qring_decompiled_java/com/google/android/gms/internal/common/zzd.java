package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzd {
    public static final int zza;

    static {
        int i = 33554432;
        if (android.os.Build.VERSION.SDK_INT < 31 && (android.os.Build.VERSION.SDK_INT < 30 || android.os.Build.VERSION.CODENAME.length() != 1 || android.os.Build.VERSION.CODENAME.charAt(0) < 'S' || android.os.Build.VERSION.CODENAME.charAt(0) > 'Z')) {
            i = 0;
        }
        zza = i;
    }

    public static android.app.PendingIntent zza(android.content.Context context, int i, android.content.Intent intent, int i2) {
        return android.app.PendingIntent.getActivity(context, i, intent, i2);
    }
}
