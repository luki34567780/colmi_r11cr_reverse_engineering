package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zbao extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.identity.CredentialSavingClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zba;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zbb;
    private static final com.google.android.gms.common.api.Api zbc;
    private final java.lang.String zbd;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zba = clientKey;
        com.google.android.gms.internal.p000authapi.zbal zbalVar = new com.google.android.gms.internal.p000authapi.zbal();
        zbb = zbalVar;
        zbc = new com.google.android.gms.common.api.Api("Auth.Api.Identity.CredentialSaving.API", zbalVar, clientKey);
    }

    public zbao(android.app.Activity activity, com.google.android.gms.auth.api.identity.zbc zbcVar) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zbc>) zbc, zbcVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = com.google.android.gms.internal.p000authapi.zbbb.zba();
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult> saveAccountLinkingToken(com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.Builder zba2 = com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest.zba(saveAccountLinkingTokenRequest);
        zba2.zba(this.zbd);
        final com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest build = zba2.build();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbba.zbg).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbaj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbao zbaoVar = com.google.android.gms.internal.p000authapi.zbao.this;
                com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = build;
                ((com.google.android.gms.internal.p000authapi.zbz) ((com.google.android.gms.internal.p000authapi.zbw) obj).getService()).zbc(new com.google.android.gms.internal.p000authapi.zbam(zbaoVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(saveAccountLinkingTokenRequest2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1535).build());
    }

    @Override // com.google.android.gms.auth.api.identity.CredentialSavingClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.identity.SavePasswordResult> savePassword(com.google.android.gms.auth.api.identity.SavePasswordRequest savePasswordRequest) {
        com.google.android.gms.auth.api.identity.SavePasswordRequest.Builder zba2 = com.google.android.gms.auth.api.identity.SavePasswordRequest.zba(savePasswordRequest);
        zba2.zba(this.zbd);
        final com.google.android.gms.auth.api.identity.SavePasswordRequest build = zba2.build();
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p000authapi.zbba.zbe).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbak
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.p000authapi.zbao zbaoVar = com.google.android.gms.internal.p000authapi.zbao.this;
                com.google.android.gms.auth.api.identity.SavePasswordRequest savePasswordRequest2 = build;
                ((com.google.android.gms.internal.p000authapi.zbz) ((com.google.android.gms.internal.p000authapi.zbw) obj).getService()).zbd(new com.google.android.gms.internal.p000authapi.zban(zbaoVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), (com.google.android.gms.auth.api.identity.SavePasswordRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(savePasswordRequest2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1536).build());
    }

    public zbao(android.content.Context context, com.google.android.gms.auth.api.identity.zbc zbcVar) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.auth.api.identity.zbc>) zbc, zbcVar, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zbd = com.google.android.gms.internal.p000authapi.zbbb.zba();
    }
}
