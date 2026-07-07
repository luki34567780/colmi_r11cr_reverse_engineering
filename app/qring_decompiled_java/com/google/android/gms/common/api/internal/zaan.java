package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zaan extends com.google.android.gms.common.api.internal.zabg {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaan(com.google.android.gms.common.api.internal.zaao zaaoVar, com.google.android.gms.common.api.internal.zabf zabfVar, com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabfVar);
        this.zaa = connectionProgressReportCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    public final void zaa() {
        this.zaa.onReportServiceBinding(new com.google.android.gms.common.ConnectionResult(16, null));
    }
}
