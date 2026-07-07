package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zbk extends com.google.android.gms.internal.p000authapi.zbd {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zba;

    zbk(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) {
        this.zba = resultHolder;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbd, com.google.android.gms.internal.p000authapi.zbs
    public final void zbc(com.google.android.gms.common.api.Status status) {
        this.zba.setResult(status);
    }
}
