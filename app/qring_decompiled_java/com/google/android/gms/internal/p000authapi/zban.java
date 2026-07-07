package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zban extends com.google.android.gms.internal.p000authapi.zbag {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zban(com.google.android.gms.internal.p000authapi.zbao zbaoVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbah
    public final void zbb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.identity.SavePasswordResult savePasswordResult) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, savePasswordResult, this.zba);
    }
}
