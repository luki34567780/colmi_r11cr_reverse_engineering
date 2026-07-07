package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
abstract class zzfe {
    private static final com.google.android.gms.internal.auth.zzfe zza;
    private static final com.google.android.gms.internal.auth.zzfe zzb;

    static {
        com.google.android.gms.internal.auth.zzfb zzfbVar = null;
        zza = new com.google.android.gms.internal.auth.zzfc(zzfbVar);
        zzb = new com.google.android.gms.internal.auth.zzfd(zzfbVar);
    }

    /* synthetic */ zzfe(com.google.android.gms.internal.auth.zzfb zzfbVar) {
    }

    static com.google.android.gms.internal.auth.zzfe zzc() {
        return zza;
    }

    static com.google.android.gms.internal.auth.zzfe zzd() {
        return zzb;
    }

    abstract void zza(java.lang.Object obj, long j);

    abstract <L> void zzb(java.lang.Object obj, java.lang.Object obj2, long j);
}
