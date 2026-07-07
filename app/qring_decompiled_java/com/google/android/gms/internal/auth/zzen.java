package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzen implements com.google.android.gms.internal.auth.zzfo {
    private static final com.google.android.gms.internal.auth.zzen zza = new com.google.android.gms.internal.auth.zzen();

    private zzen() {
    }

    public static com.google.android.gms.internal.auth.zzen zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.auth.zzfo
    public final com.google.android.gms.internal.auth.zzfn zzb(java.lang.Class<?> cls) {
        if (!com.google.android.gms.internal.auth.zzeq.class.isAssignableFrom(cls)) {
            java.lang.String valueOf = java.lang.String.valueOf(cls.getName());
            throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new java.lang.String("Unsupported message type: "));
        }
        try {
            return (com.google.android.gms.internal.auth.zzfn) com.google.android.gms.internal.auth.zzeq.zza(cls.asSubclass(com.google.android.gms.internal.auth.zzeq.class)).zzj(3, null, null);
        } catch (java.lang.Exception e) {
            java.lang.String valueOf2 = java.lang.String.valueOf(cls.getName());
            throw new java.lang.RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new java.lang.String("Unable to get message info for "), e);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzfo
    public final boolean zzc(java.lang.Class<?> cls) {
        return com.google.android.gms.internal.auth.zzeq.class.isAssignableFrom(cls);
    }
}
