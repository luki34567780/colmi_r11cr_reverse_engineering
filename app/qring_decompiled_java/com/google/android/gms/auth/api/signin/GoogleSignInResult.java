package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class GoogleSignInResult implements com.google.android.gms.common.api.Result {
    private com.google.android.gms.common.api.Status zba;
    private com.google.android.gms.auth.api.signin.GoogleSignInAccount zbb;

    public GoogleSignInResult(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Status status) {
        this.zbb = googleSignInAccount;
        this.zba = status;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount getSignInAccount() {
        return this.zbb;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zba;
    }

    public boolean isSuccess() {
        return this.zba.isSuccess();
    }
}
