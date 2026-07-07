package com.google.android.gms.auth.api.proxy;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public interface ProxyClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.auth.api.AuthProxyOptions> {
    com.google.android.gms.tasks.Task<java.lang.String> getSpatulaHeader();

    com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.proxy.ProxyResponse> performProxyRequest(com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest);
}
