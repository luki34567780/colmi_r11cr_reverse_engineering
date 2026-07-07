package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbo extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.auth.api.AuthProxyOptions> implements com.google.android.gms.auth.api.proxy.ProxyClient {
    public zzbo(android.app.Activity activity, com.google.android.gms.auth.api.AuthProxyOptions authProxyOptions) {
        super(activity, com.google.android.gms.auth.api.AuthProxy.API, authProxyOptions == null ? com.google.android.gms.auth.api.AuthProxyOptions.zza : authProxyOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyClient
    public final com.google.android.gms.tasks.Task<java.lang.String> getSpatulaHeader() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth.zzbk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.auth.zzbh) ((com.google.android.gms.internal.auth.zzbe) obj).getService()).zzd(new com.google.android.gms.internal.auth.zzbn(com.google.android.gms.internal.auth.zzbo.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(1520).build());
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.proxy.ProxyResponse> performProxyRequest(final com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth.zzbl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.auth.zzbo zzboVar = com.google.android.gms.internal.auth.zzbo.this;
                com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest2 = proxyRequest;
                ((com.google.android.gms.internal.auth.zzbh) ((com.google.android.gms.internal.auth.zzbe) obj).getService()).zze(new com.google.android.gms.internal.auth.zzbm(zzboVar, (com.google.android.gms.tasks.TaskCompletionSource) obj2), proxyRequest2);
            }
        }).setMethodKey(1518).build());
    }

    public zzbo(android.content.Context context, com.google.android.gms.auth.api.AuthProxyOptions authProxyOptions) {
        super(context, com.google.android.gms.auth.api.AuthProxy.API, authProxyOptions == null ? com.google.android.gms.auth.api.AuthProxyOptions.zza : authProxyOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
