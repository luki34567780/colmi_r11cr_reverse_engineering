package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zbi extends com.google.android.gms.auth.api.signin.internal.zbl {
    zbi(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.auth.api.signin.internal.zbe zbeVar = (com.google.android.gms.auth.api.signin.internal.zbe) anyClient;
        ((com.google.android.gms.auth.api.signin.internal.zbs) zbeVar.getService()).zbd(new com.google.android.gms.auth.api.signin.internal.zbh(this), zbeVar.zba());
    }
}
