package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzbu implements com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult {
    private final com.google.android.gms.common.api.Status zza;
    private com.google.android.gms.auth.api.proxy.ProxyResponse zzb;

    public zzbu(com.google.android.gms.auth.api.proxy.ProxyResponse proxyResponse) {
        this.zzb = proxyResponse;
        this.zza = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
    }

    public zzbu(com.google.android.gms.common.api.Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult
    public final com.google.android.gms.auth.api.proxy.ProxyResponse getResponse() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }
}
