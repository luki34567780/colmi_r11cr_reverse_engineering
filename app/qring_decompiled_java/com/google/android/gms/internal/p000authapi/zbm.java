package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
abstract class zbm extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl {
    zbm(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(com.google.android.gms.auth.api.Auth.CREDENTIALS_API, googleApiClient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.internal.p000authapi.zbo zboVar = (com.google.android.gms.internal.p000authapi.zbo) anyClient;
        zba(zboVar.getContext(), (com.google.android.gms.internal.p000authapi.zbt) zboVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
        super.setResult((com.google.android.gms.internal.p000authapi.zbm) obj);
    }

    protected abstract void zba(android.content.Context context, com.google.android.gms.internal.p000authapi.zbt zbtVar) throws android.os.DeadObjectException, android.os.RemoteException;
}
