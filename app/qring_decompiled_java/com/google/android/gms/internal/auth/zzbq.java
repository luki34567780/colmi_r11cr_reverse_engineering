package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzbq extends com.google.android.gms.internal.auth.zzbi {
    final /* synthetic */ com.google.android.gms.auth.api.proxy.ProxyRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbq(com.google.android.gms.internal.auth.zzbt zzbtVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest) {
        super(googleApiClient);
        this.zza = proxyRequest;
    }

    @Override // com.google.android.gms.internal.auth.zzbi
    protected final void zza(android.content.Context context, com.google.android.gms.internal.auth.zzbh zzbhVar) throws android.os.RemoteException {
        zzbhVar.zze(new com.google.android.gms.internal.auth.zzbp(this), this.zza);
    }
}
