package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzav extends com.google.android.gms.internal.location.zzah {
    final /* synthetic */ com.google.android.gms.internal.location.zzao zza;

    zzav(com.google.android.gms.internal.location.zzbe zzbeVar, com.google.android.gms.internal.location.zzao zzaoVar) {
        this.zza = zzaoVar;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(com.google.android.gms.internal.location.zzaa zzaaVar) throws android.os.RemoteException {
        if (zzaaVar.getStatus().isSuccess()) {
            return;
        }
        this.zza.zzb(zzaaVar.getStatus(), null);
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() throws android.os.RemoteException {
        this.zza.zzb(com.google.android.gms.common.api.Status.RESULT_SUCCESS, null);
    }
}
