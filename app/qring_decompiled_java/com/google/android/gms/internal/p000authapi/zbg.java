package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zbg extends com.google.android.gms.internal.p000authapi.zbm {
    final /* synthetic */ com.google.android.gms.auth.api.credentials.CredentialRequest zba;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zbg(com.google.android.gms.internal.p000authapi.zbl zblVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.CredentialRequest credentialRequest) {
        super(googleApiClient);
        this.zba = credentialRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.p000authapi.zbe(status, null);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    protected final void zba(android.content.Context context, com.google.android.gms.internal.p000authapi.zbt zbtVar) throws android.os.RemoteException {
        zbtVar.zbd(new com.google.android.gms.internal.p000authapi.zbf(this), this.zba);
    }
}
