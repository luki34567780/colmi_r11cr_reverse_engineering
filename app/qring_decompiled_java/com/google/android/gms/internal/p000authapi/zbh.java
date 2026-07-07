package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zbh extends com.google.android.gms.internal.p000authapi.zbm {
    final /* synthetic */ com.google.android.gms.auth.api.credentials.Credential zba;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zbh(com.google.android.gms.internal.p000authapi.zbl zblVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.Credential credential) {
        super(googleApiClient);
        this.zba = credential;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    protected final void zba(android.content.Context context, com.google.android.gms.internal.p000authapi.zbt zbtVar) throws android.os.RemoteException {
        zbtVar.zbe(new com.google.android.gms.internal.p000authapi.zbk(this), new com.google.android.gms.internal.p000authapi.zbu(this.zba));
    }
}
