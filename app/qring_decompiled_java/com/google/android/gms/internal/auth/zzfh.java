package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfh implements com.google.android.gms.internal.auth.zzfo {
    private final com.google.android.gms.internal.auth.zzfo[] zza;

    zzfh(com.google.android.gms.internal.auth.zzfo... zzfoVarArr) {
        this.zza = zzfoVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfo
    public final com.google.android.gms.internal.auth.zzfn zzb(java.lang.Class<?> cls) {
        com.google.android.gms.internal.auth.zzfo[] zzfoVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            com.google.android.gms.internal.auth.zzfo zzfoVar = zzfoVarArr[i];
            if (zzfoVar.zzc(cls)) {
                return zzfoVar.zzb(cls);
            }
        }
        java.lang.String valueOf = java.lang.String.valueOf(cls.getName());
        throw new java.lang.UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new java.lang.String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.auth.zzfo
    public final boolean zzc(java.lang.Class<?> cls) {
        com.google.android.gms.internal.auth.zzfo[] zzfoVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzfoVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
