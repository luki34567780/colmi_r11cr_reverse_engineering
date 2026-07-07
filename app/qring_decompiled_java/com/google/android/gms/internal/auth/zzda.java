package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzda implements com.google.android.gms.internal.auth.zzck {
    private static final java.util.Map<java.lang.String, com.google.android.gms.internal.auth.zzda> zza = new androidx.collection.ArrayMap();
    private final android.content.SharedPreferences zzb;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener zzc;

    static com.google.android.gms.internal.auth.zzda zza(android.content.Context context, java.lang.String str) {
        com.google.android.gms.internal.auth.zzda zzdaVar;
        if (com.google.android.gms.internal.auth.zzcc.zza()) {
            throw null;
        }
        synchronized (com.google.android.gms.internal.auth.zzda.class) {
            zzdaVar = zza.get(null);
            if (zzdaVar == null) {
                android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } catch (java.lang.Throwable th) {
                    android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
        }
        return zzdaVar;
    }

    static synchronized void zzc() {
        synchronized (com.google.android.gms.internal.auth.zzda.class) {
            java.util.Map<java.lang.String, com.google.android.gms.internal.auth.zzda> map = zza;
            java.util.Iterator<com.google.android.gms.internal.auth.zzda> it = map.values().iterator();
            if (it.hasNext()) {
                com.google.android.gms.internal.auth.zzda next = it.next();
                android.content.SharedPreferences sharedPreferences = next.zzb;
                android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = next.zzc;
                throw null;
            }
            map.clear();
        }
    }

    @Override // com.google.android.gms.internal.auth.zzck
    public final java.lang.Object zzb(java.lang.String str) {
        throw null;
    }
}
