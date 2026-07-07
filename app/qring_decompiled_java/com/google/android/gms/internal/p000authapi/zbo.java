package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zbo extends com.google.android.gms.common.internal.GmsClient {
    private final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zba;

    public zbo(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.Auth.AuthCredentialsOptions authCredentialsOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder builder = new com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder(authCredentialsOptions == null ? com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.zba : authCredentialsOptions);
        builder.zba(com.google.android.gms.internal.p000authapi.zbbb.zba());
        this.zba = new com.google.android.gms.auth.api.Auth.AuthCredentialsOptions(builder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof com.google.android.gms.internal.p000authapi.zbt ? (com.google.android.gms.internal.p000authapi.zbt) queryLocalInterface : new com.google.android.gms.internal.p000authapi.zbt(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
        return this.zba.zba();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    final com.google.android.gms.auth.api.Auth.AuthCredentialsOptions zba() {
        return this.zba;
    }
}
