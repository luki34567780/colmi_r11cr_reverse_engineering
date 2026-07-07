package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfy {
    private static final com.google.android.gms.internal.auth.zzfy zza = new com.google.android.gms.internal.auth.zzfy();
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.auth.zzgb<?>> zzc = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.auth.zzgc zzb = new com.google.android.gms.internal.auth.zzfi();

    private zzfy() {
    }

    public static com.google.android.gms.internal.auth.zzfy zza() {
        return zza;
    }

    public final <T> com.google.android.gms.internal.auth.zzgb<T> zzb(java.lang.Class<T> cls) {
        com.google.android.gms.internal.auth.zzev.zzf(cls, "messageType");
        com.google.android.gms.internal.auth.zzgb<T> zzgbVar = (com.google.android.gms.internal.auth.zzgb) this.zzc.get(cls);
        if (zzgbVar == null) {
            zzgbVar = this.zzb.zza(cls);
            com.google.android.gms.internal.auth.zzev.zzf(cls, "messageType");
            com.google.android.gms.internal.auth.zzev.zzf(zzgbVar, "schema");
            com.google.android.gms.internal.auth.zzgb<T> zzgbVar2 = (com.google.android.gms.internal.auth.zzgb) this.zzc.putIfAbsent(cls, zzgbVar);
            if (zzgbVar2 != null) {
                return zzgbVar2;
            }
        }
        return zzgbVar;
    }
}
