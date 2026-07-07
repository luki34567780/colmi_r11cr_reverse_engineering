package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbv implements com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult {
    private final com.google.android.gms.common.api.Status zza;
    private final java.lang.String zzb;

    public zzbv(@javax.annotation.Nonnull com.google.android.gms.common.api.Status status) {
        this.zza = (com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(status);
        this.zzb = "";
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult
    public final java.lang.String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    public zzbv(@javax.annotation.Nonnull java.lang.String str) {
        this.zzb = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zza = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
    }
}
