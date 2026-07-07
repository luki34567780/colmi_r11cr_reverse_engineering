package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfm {
    private static final com.google.android.gms.internal.auth.zzfl zza;
    private static final com.google.android.gms.internal.auth.zzfl zzb;

    static {
        com.google.android.gms.internal.auth.zzfl zzflVar;
        try {
            zzflVar = (com.google.android.gms.internal.auth.zzfl) java.lang.Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzflVar = null;
        }
        zza = zzflVar;
        zzb = new com.google.android.gms.internal.auth.zzfl();
    }

    static com.google.android.gms.internal.auth.zzfl zza() {
        return zza;
    }

    static com.google.android.gms.internal.auth.zzfl zzb() {
        return zzb;
    }
}
