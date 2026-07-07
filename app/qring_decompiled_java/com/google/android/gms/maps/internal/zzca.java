package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzca {
    private zzca() {
    }

    public static android.os.Parcelable zza(android.os.Bundle bundle, java.lang.String str) {
        java.lang.ClassLoader zzd = zzd();
        bundle.setClassLoader(zzd);
        android.os.Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(zzd);
        return bundle2.getParcelable(str);
    }

    public static void zzb(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        android.os.Parcelable zza = zza(bundle, "MapOptions");
        if (zza != null) {
            zzc(bundle2, "MapOptions", zza);
        }
        android.os.Parcelable zza2 = zza(bundle, "StreetViewPanoramaOptions");
        if (zza2 != null) {
            zzc(bundle2, "StreetViewPanoramaOptions", zza2);
        }
        android.os.Parcelable zza3 = zza(bundle, "camera");
        if (zza3 != null) {
            zzc(bundle2, "camera", zza3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void zzc(android.os.Bundle bundle, java.lang.String str, android.os.Parcelable parcelable) {
        java.lang.ClassLoader zzd = zzd();
        bundle.setClassLoader(zzd);
        android.os.Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new android.os.Bundle();
        }
        bundle2.setClassLoader(zzd);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    private static java.lang.ClassLoader zzd() {
        return (java.lang.ClassLoader) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.maps.internal.zzca.class.getClassLoader());
    }
}
