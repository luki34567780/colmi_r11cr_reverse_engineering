package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzeg {
    static final com.google.android.gms.internal.auth.zzeg zza = new com.google.android.gms.internal.auth.zzeg(true);
    private static volatile boolean zzb;
    private static volatile com.google.android.gms.internal.auth.zzeg zzc;
    private final java.util.Map zzd;

    zzeg() {
        this.zzd = new java.util.HashMap();
    }

    public static com.google.android.gms.internal.auth.zzeg zza() {
        com.google.android.gms.internal.auth.zzeg zzegVar = zzc;
        if (zzegVar == null) {
            synchronized (com.google.android.gms.internal.auth.zzeg.class) {
                zzegVar = zzc;
                if (zzegVar == null) {
                    zzegVar = zza;
                    zzc = zzegVar;
                }
            }
        }
        return zzegVar;
    }

    zzeg(boolean z) {
        this.zzd = java.util.Collections.emptyMap();
    }
}
