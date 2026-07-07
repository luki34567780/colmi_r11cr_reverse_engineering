package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzo {
    private static java.lang.String zza = null;
    private static int zzb = -1;

    public static int zza(android.content.Context context) {
        int i = zzb;
        if (i != -1) {
            return i;
        }
        if (com.google.android.gms.common.util.DeviceProperties.isWearable(context)) {
            zzb = 3;
            return 3;
        }
        if (com.google.android.gms.common.util.DeviceProperties.isTv(context) || com.google.android.gms.common.util.DeviceProperties.isAuto(context)) {
            zzb = 0;
            return 0;
        }
        if (com.google.android.gms.common.util.DeviceProperties.isTablet(context.getResources()) && !zzc(context)) {
            zzb = 2;
            return 2;
        }
        if (android.text.TextUtils.isEmpty(android.os.Build.PRODUCT) || !android.os.Build.PRODUCT.startsWith("glass_")) {
            zzb = 1;
            return 1;
        }
        zzb = 6;
        return 6;
    }

    public static java.lang.String zzb(android.content.Context context) {
        java.lang.String str = zza;
        if (str != null) {
            return str;
        }
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        zza = string;
        return string;
    }

    private static boolean zzc(android.content.Context context) {
        try {
            return ((android.telephony.TelephonyManager) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.telephony.TelephonyManager) context.getSystemService("phone"))).getPhoneType() != 0;
        } catch (android.content.res.Resources.NotFoundException e) {
            android.util.Log.e("Fitness", "Unable to determine type of device, assuming phone.", e);
            return true;
        }
    }
}
