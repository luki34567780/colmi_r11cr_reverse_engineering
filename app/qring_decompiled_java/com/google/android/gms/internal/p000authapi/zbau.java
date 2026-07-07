package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zbau extends com.google.android.gms.internal.p000authapi.zbx {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbau(com.google.android.gms.internal.p000authapi.zbay zbayVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zby
    public final void zbb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.identity.BeginSignInResult beginSignInResult) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, beginSignInResult, this.zba);
    }
}
