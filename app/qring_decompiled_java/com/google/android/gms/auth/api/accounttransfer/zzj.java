package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
class zzj<T> extends com.google.android.gms.internal.auth.zzan {
    final com.google.android.gms.auth.api.accounttransfer.zzk<T> zzb;

    public zzj(com.google.android.gms.auth.api.accounttransfer.zzk<T> zzkVar) {
        this.zzb = zzkVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzd(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.tasks.TaskCompletionSource<T> taskCompletionSource = this.zzb.zzb;
        int i = com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zza;
        taskCompletionSource.setException(new com.google.android.gms.auth.api.accounttransfer.AccountTransferException(status));
    }
}
