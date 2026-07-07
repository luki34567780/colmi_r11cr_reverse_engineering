package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zaq implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    final /* synthetic */ com.google.android.gms.common.api.Response zaa;

    zaq(com.google.android.gms.common.api.Response response) {
        this.zaa = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* bridge */ /* synthetic */ java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        this.zaa.setResult(result);
        return this.zaa;
    }
}
