package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzfd extends com.google.android.gms.internal.auth.zzfe {
    private zzfd() {
        super(null);
    }

    /* synthetic */ zzfd(com.google.android.gms.internal.auth.zzfb zzfbVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfe
    final void zza(java.lang.Object obj, long j) {
        ((com.google.android.gms.internal.auth.zzeu) com.google.android.gms.internal.auth.zzgz.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfe
    final <E> void zzb(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.auth.zzeu zzeuVar = (com.google.android.gms.internal.auth.zzeu) com.google.android.gms.internal.auth.zzgz.zzf(obj, j);
        com.google.android.gms.internal.auth.zzeu zzeuVar2 = (com.google.android.gms.internal.auth.zzeu) com.google.android.gms.internal.auth.zzgz.zzf(obj2, j);
        int size = zzeuVar.size();
        int size2 = zzeuVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzeuVar.zzc()) {
                zzeuVar = zzeuVar.zzd(size2 + size);
            }
            zzeuVar.addAll(zzeuVar2);
        }
        if (size > 0) {
            zzeuVar2 = zzeuVar;
        }
        com.google.android.gms.internal.auth.zzgz.zzp(obj, j, zzeuVar2);
    }
}
