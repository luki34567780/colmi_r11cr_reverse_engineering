package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zaam extends com.google.android.gms.common.api.internal.zabg {
    final /* synthetic */ com.google.android.gms.common.ConnectionResult zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zaao zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaam(com.google.android.gms.common.api.internal.zaao zaaoVar, com.google.android.gms.common.api.internal.zabf zabfVar, com.google.android.gms.common.ConnectionResult connectionResult) {
        super(zabfVar);
        this.zab = zaaoVar;
        this.zaa = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    public final void zaa() {
        this.zab.zaa.zaD(this.zaa);
    }
}
