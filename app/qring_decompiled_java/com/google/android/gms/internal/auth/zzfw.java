package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfw {
    private static final com.google.android.gms.internal.auth.zzfv zza;
    private static final com.google.android.gms.internal.auth.zzfv zzb;

    static {
        com.google.android.gms.internal.auth.zzfv zzfvVar;
        try {
            zzfvVar = (com.google.android.gms.internal.auth.zzfv) java.lang.Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzfvVar = null;
        }
        zza = zzfvVar;
        zzb = new com.google.android.gms.internal.auth.zzfv();
    }

    static com.google.android.gms.internal.auth.zzfv zza() {
        return zza;
    }

    static com.google.android.gms.internal.auth.zzfv zzb() {
        return zzb;
    }
}
