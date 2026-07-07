package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zbg extends com.google.android.gms.auth.api.signin.internal.zbl {
    final /* synthetic */ android.content.Context zba;
    final /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInOptions zbb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zbg(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        super(googleApiClient);
        this.zba = context;
        this.zbb = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInResult(null, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.auth.api.signin.internal.zbs) ((com.google.android.gms.auth.api.signin.internal.zbe) anyClient).getService()).zbe(new com.google.android.gms.auth.api.signin.internal.zbf(this), this.zbb);
    }
}
