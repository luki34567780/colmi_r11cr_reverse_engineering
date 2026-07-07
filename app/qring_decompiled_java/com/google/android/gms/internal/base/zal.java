package com.google.android.gms.internal.base;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zal {
    public static final int zaa;

    static {
        int i = 33554432;
        if (android.os.Build.VERSION.SDK_INT < 31 && (android.os.Build.VERSION.SDK_INT < 30 || android.os.Build.VERSION.CODENAME.length() != 1 || android.os.Build.VERSION.CODENAME.charAt(0) < 'S' || android.os.Build.VERSION.CODENAME.charAt(0) > 'Z')) {
            i = 0;
        }
        zaa = i;
    }

    public static android.app.PendingIntent zaa(android.content.Context context, int i, android.content.Intent intent, int i2) {
        return android.app.PendingIntent.getActivity(context, i, intent, i2);
    }
}
