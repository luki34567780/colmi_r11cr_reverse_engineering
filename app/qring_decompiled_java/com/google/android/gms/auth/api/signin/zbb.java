package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zbb implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    private zbb() {
    }

    /* synthetic */ zbb(com.google.android.gms.auth.api.signin.zba zbaVar) {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        return ((com.google.android.gms.auth.api.signin.GoogleSignInResult) result).getSignInAccount();
    }
}
