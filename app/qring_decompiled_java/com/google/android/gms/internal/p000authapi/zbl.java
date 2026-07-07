package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zbl implements com.google.android.gms.auth.api.credentials.CredentialsApi {
    @Override // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> delete(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.Credential credential) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(credential, "credential must not be null");
        return googleApiClient.execute(new com.google.android.gms.internal.p000authapi.zbi(this, googleApiClient, credential));
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> disableAutoSignIn(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client must not be null");
        return googleApiClient.execute(new com.google.android.gms.internal.p000authapi.zbj(this, googleApiClient));
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final android.app.PendingIntent getHintPickerIntent(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.HintRequest hintRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(hintRequest, "request must not be null");
        com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zba = ((com.google.android.gms.internal.p000authapi.zbo) googleApiClient.getClient(com.google.android.gms.auth.api.Auth.zba)).zba();
        return com.google.android.gms.internal.p000authapi.zbn.zba(googleApiClient.getContext(), zba, hintRequest, zba.zbd());
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.credentials.CredentialRequestResult> request(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.CredentialRequest credentialRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(credentialRequest, "request must not be null");
        return googleApiClient.enqueue(new com.google.android.gms.internal.p000authapi.zbg(this, googleApiClient, credentialRequest));
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> save(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.Credential credential) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(credential, "credential must not be null");
        return googleApiClient.execute(new com.google.android.gms.internal.p000authapi.zbh(this, googleApiClient, credential));
    }
}
