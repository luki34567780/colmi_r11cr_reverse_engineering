package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzc extends com.google.android.gms.auth.api.accounttransfer.zzm {
    final /* synthetic */ com.google.android.gms.internal.auth.zzaz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzc(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient accountTransferClient, int i, com.google.android.gms.internal.auth.zzaz zzazVar) {
        super(1606);
        this.zza = zzazVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzk
    protected final void zza(com.google.android.gms.internal.auth.zzau zzauVar) throws android.os.RemoteException {
        zzauVar.zzh(this.zzc, this.zza);
    }
}
