package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zas {
    final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult zaa;

    /* synthetic */ zas(com.google.android.gms.common.api.internal.BasePendingResult basePendingResult, com.google.android.gms.common.api.internal.zar zarVar) {
        this.zaa = basePendingResult;
    }

    protected final void finalize() throws java.lang.Throwable {
        com.google.android.gms.common.api.Result result;
        result = this.zaa.zaj;
        com.google.android.gms.common.api.internal.BasePendingResult.zal(result);
        super.finalize();
    }
}
