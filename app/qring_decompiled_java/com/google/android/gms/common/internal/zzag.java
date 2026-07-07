package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzag {
    private static final java.lang.Object zza = new java.lang.Object();
    private static boolean zzb;
    private static java.lang.String zzc;
    private static int zzd;

    public static int zza(android.content.Context context) {
        zzc(context);
        return zzd;
    }

    public static java.lang.String zzb(android.content.Context context) {
        zzc(context);
        return zzc;
    }

    private static void zzc(android.content.Context context) {
        android.os.Bundle bundle;
        synchronized (zza) {
            if (zzb) {
                return;
            }
            zzb = true;
            try {
                bundle = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), com.realsil.sdk.bbpro.equalizer.EqConstants.CodeIndex.BUILD_IN_EQ_4).metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            zzc = bundle.getString("com.google.app.id");
            zzd = bundle.getInt("com.google.android.gms.version");
        }
    }
}
