package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zbay extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.SignInClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zba;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbb;
    private static final com.google.android.gms.common.api.Api zbc;
    private final java.lang.String zbd;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zba = clientKey;
        com.google.android.gms.internal.p000authapi.zbat zbatVar = new com.google.android.gms.internal.p000authapi.zbat();
        zbb = zbatVar;
        zbc = new com.google.android.gms.common.api.Api("Auth.Api.Identity.SignIn.API", zbatVar, clientKey);
    }

    public zbay(android.app.Activity activity, com.google.android.gms.auth.api.identity.zbn zbnVar) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zbn>) zbc, zbnVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = com.google.android.gms.internal.p000authapi.zbbb.zba();
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.BeginSignInResult> beginSignIn(com.google.android.gms.auth.api.identity.BeginSignInRequest beginSignInRequest) {
        com.google.android.gms.auth.api.identity.BeginSignInRequest.Builder zba2 = com.google.android.gms.auth.api.identity.BeginSignInRequest.zba(beginSignInRequest);
        zba2.zba(this.zbd);
        final com.google.android.gms.auth.api.identity.BeginSignInRequest build = zba2.build();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbba.zba).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbap
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbay zbayVar = com.google.android.gms.internal.p000authapi.zbay.this;
                com.google.android.gms.auth.api.identity.BeginSignInRequest beginSignInRequest2 = build;
                ((com.google.android.gms.internal.p000authapi.zbai) ((com.google.android.gms.internal.p000authapi.zbaz) obj).getService()).zbc(new com.google.android.gms.internal.p000authapi.zbau(zbayVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.BeginSignInRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(beginSignInRequest2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1553).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> getPhoneNumberHintIntent(final com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbba.zbh).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbas
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbay.this.zba(getPhoneNumberHintIntentRequest, (com.google.android.gms.internal.p000authapi.zbaz) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setMethodKey(1653).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> getSignInIntent(com.google.android.gms.auth.api.identity.GetSignInIntentRequest getSignInIntentRequest) {
        com.google.android.gms.auth.api.identity.GetSignInIntentRequest.Builder zba2 = com.google.android.gms.auth.api.identity.GetSignInIntentRequest.zba(getSignInIntentRequest);
        zba2.zbb(this.zbd);
        final com.google.android.gms.auth.api.identity.GetSignInIntentRequest build = zba2.build();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbba.zbf).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbaq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbay zbayVar = com.google.android.gms.internal.p000authapi.zbay.this;
                com.google.android.gms.auth.api.identity.GetSignInIntentRequest getSignInIntentRequest2 = build;
                ((com.google.android.gms.internal.p000authapi.zbai) ((com.google.android.gms.internal.p000authapi.zbaz) obj).getService()).zbe(new com.google.android.gms.internal.p000authapi.zbaw(zbayVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.GetSignInIntentRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(getSignInIntentRequest2));
            }
        }).setMethodKey(1555).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        java.util.Iterator<com.google.android.gms.common.api.GoogleApiClient> it = com.google.android.gms.common.api.GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        com.google.android.gms.common.api.internal.GoogleApiManager.reportSignOut();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbba.zbb).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbar
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbay.this.zbb((com.google.android.gms.internal.p000authapi.zbaz) obj, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1554).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zba(com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, com.google.android.gms.internal.p000authapi.zbaz zbazVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.p000authapi.zbai) zbazVar.getService()).zbd(new com.google.android.gms.internal.p000authapi.zbax(this, taskCompletionSource), getPhoneNumberHintIntentRequest, this.zbd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zbb(com.google.android.gms.internal.p000authapi.zbaz zbazVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.p000authapi.zbai) zbazVar.getService()).zbf(new com.google.android.gms.internal.p000authapi.zbav(this, taskCompletionSource), this.zbd);
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final java.lang.String getPhoneNumberFromIntent(android.content.Intent intent) throws com.google.android.gms.common.api.ApiException {
        if (intent == null) {
            throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", com.google.android.gms.common.api.Status.CREATOR);
        if (status == null) {
            throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_CANCELED);
        }
        if (!status.isSuccess()) {
            throw new com.google.android.gms.common.api.ApiException(status);
        }
        java.lang.String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final com.google.android.gms.auth.api.identity.SignInCredential getSignInCredentialFromIntent(android.content.Intent intent) throws com.google.android.gms.common.api.ApiException {
        if (intent == null) {
            throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", com.google.android.gms.common.api.Status.CREATOR);
        if (status == null) {
            throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_CANCELED);
        }
        if (!status.isSuccess()) {
            throw new com.google.android.gms.common.api.ApiException(status);
        }
        com.google.android.gms.auth.api.identity.SignInCredential signInCredential = (com.google.android.gms.auth.api.identity.SignInCredential) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "sign_in_credential", com.google.android.gms.auth.api.identity.SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
    }

    public zbay(android.content.Context context, com.google.android.gms.auth.api.identity.zbn zbnVar) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zbn>) zbc, zbnVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = com.google.android.gms.internal.p000authapi.zbbb.zba();
    }
}
