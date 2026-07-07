package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzf extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzam, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    zzf() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzam buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.Api.ApiOptions.NoOptions noOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.auth.zzam(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
