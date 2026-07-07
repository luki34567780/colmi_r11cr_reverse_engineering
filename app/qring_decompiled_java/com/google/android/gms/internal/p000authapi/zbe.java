package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zbe implements com.google.android.gms.auth.api.credentials.CredentialRequestResult {
    private final com.google.android.gms.common.api.Status zba;
    private final com.google.android.gms.auth.api.credentials.Credential zbb;

    public zbe(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.credentials.Credential credential) {
        this.zba = status;
        this.zbb = credential;
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialRequestResult
    public final com.google.android.gms.auth.api.credentials.Credential getCredential() {
        return this.zbb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zba;
    }
}
