package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zbf extends com.google.android.gms.auth.api.signin.internal.zba {
    final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zbg zba;

    zbf(com.google.android.gms.auth.api.signin.internal.zbg zbgVar) {
        this.zba = zbgVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbd(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        if (googleSignInAccount != null) {
            com.google.android.gms.auth.api.signin.internal.zbn.zbc(this.zba.zba).zbe(this.zba.zbb, googleSignInAccount);
        }
        this.zba.setResult((com.google.android.gms.auth.api.signin.internal.zbg) new com.google.android.gms.auth.api.signin.GoogleSignInResult(googleSignInAccount, status));
    }
}
