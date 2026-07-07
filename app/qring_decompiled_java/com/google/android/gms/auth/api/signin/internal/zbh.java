package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zbh extends com.google.android.gms.auth.api.signin.internal.zba {
    final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zbi zba;

    zbh(com.google.android.gms.auth.api.signin.internal.zbi zbiVar) {
        this.zba = zbiVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbc(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zba.setResult((com.google.android.gms.auth.api.signin.internal.zbi) status);
    }
}
