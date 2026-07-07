package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zbd implements com.google.android.gms.auth.api.signin.GoogleSignInApi {
    private static final com.google.android.gms.auth.api.signin.GoogleSignInOptions zba(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return ((com.google.android.gms.auth.api.signin.internal.zbe) googleApiClient.getClient(com.google.android.gms.auth.api.Auth.zbb)).zba();
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final android.content.Intent getSignInIntent(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbc(googleApiClient.getContext(), zba(googleApiClient));
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.auth.api.signin.GoogleSignInResult getSignInResultFromIntent(android.content.Intent intent) {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbd(intent);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> revokeAccess(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbf(googleApiClient, googleApiClient.getContext(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> signOut(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbg(googleApiClient, googleApiClient.getContext(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> silentSignIn(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbe(googleApiClient, googleApiClient.getContext(), zba(googleApiClient), false);
    }
}
