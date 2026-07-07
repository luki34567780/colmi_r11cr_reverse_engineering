package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzej {
    private static final com.google.android.gms.internal.auth.zzeh<?> zza = new com.google.android.gms.internal.auth.zzei();
    private static final com.google.android.gms.internal.auth.zzeh<?> zzb;

    static {
        com.google.android.gms.internal.auth.zzeh<?> zzehVar;
        try {
            zzehVar = (com.google.android.gms.internal.auth.zzeh) java.lang.Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzehVar = null;
        }
        zzb = zzehVar;
    }

    static com.google.android.gms.internal.auth.zzeh<?> zza() {
        com.google.android.gms.internal.auth.zzeh<?> zzehVar = zzb;
        if (zzehVar != null) {
            return zzehVar;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static com.google.android.gms.internal.auth.zzeh<?> zzb() {
        return zza;
    }
}
