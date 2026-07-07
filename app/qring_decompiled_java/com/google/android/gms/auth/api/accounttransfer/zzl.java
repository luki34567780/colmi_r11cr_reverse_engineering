package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzl extends com.google.android.gms.internal.auth.zzan {
    final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzm zza;

    zzl(com.google.android.gms.auth.api.accounttransfer.zzm zzmVar) {
        this.zza = zzmVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzd(com.google.android.gms.common.api.Status status) {
        this.zza.zzb.setException(new com.google.android.gms.auth.api.accounttransfer.AccountTransferException(status));
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zze() {
        this.zza.zzb.setResult(null);
    }
}
