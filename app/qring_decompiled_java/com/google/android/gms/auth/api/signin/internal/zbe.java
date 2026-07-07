package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zbe extends com.google.android.gms.common.internal.GmsClient {
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions zba;

    public zbe(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder builder = googleSignInOptions != null ? new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder(googleSignInOptions) : new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder();
        builder.setLogSessionId(com.google.android.gms.internal.p000authapi.zbbb.zba());
        if (!clientSettings.getAllRequestedScopes().isEmpty()) {
            java.util.Iterator<com.google.android.gms.common.api.Scope> it = clientSettings.getAllRequestedScopes().iterator();
            while (it.hasNext()) {
                builder.requestScopes(it.next(), new com.google.android.gms.common.api.Scope[0]);
            }
        }
        this.zba = builder.build();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof com.google.android.gms.auth.api.signin.internal.zbs ? (com.google.android.gms.auth.api.signin.internal.zbs) queryLocalInterface : new com.google.android.gms.auth.api.signin.internal.zbs(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final android.content.Intent getSignInIntent() {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbc(getContext(), this.zba);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
        return true;
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions zba() {
        return this.zba;
    }
}
