package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
abstract class zzbj extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult, com.google.android.gms.internal.auth.zzbe> {
    public zzbj(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(com.google.android.gms.auth.api.AuthProxy.API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.auth.zzbv(status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.internal.auth.zzbe zzbeVar) throws android.os.RemoteException {
        com.google.android.gms.internal.auth.zzbe zzbeVar2 = zzbeVar;
        zza(zzbeVar2.getContext(), (com.google.android.gms.internal.auth.zzbh) zzbeVar2.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
        super.setResult((com.google.android.gms.internal.auth.zzbj) obj);
    }

    protected abstract void zza(android.content.Context context, com.google.android.gms.internal.auth.zzbh zzbhVar) throws android.os.RemoteException;
}
