package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
abstract class zzk<T> extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.auth.zzap, T> {
    protected com.google.android.gms.tasks.TaskCompletionSource<T> zzb;

    /* synthetic */ zzk(int i, com.google.android.gms.auth.api.accounttransfer.zzb zzbVar) {
        super(null, false, i);
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.internal.auth.zzap zzapVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        this.zzb = taskCompletionSource;
        zza((com.google.android.gms.internal.auth.zzau) zzapVar.getService());
    }

    protected abstract void zza(com.google.android.gms.internal.auth.zzau zzauVar) throws android.os.RemoteException;
}
