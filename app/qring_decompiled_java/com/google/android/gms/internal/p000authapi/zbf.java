package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zbf extends com.google.android.gms.internal.p000authapi.zbd {
    final /* synthetic */ com.google.android.gms.internal.p000authapi.zbg zba;

    zbf(com.google.android.gms.internal.p000authapi.zbg zbgVar) {
        this.zba = zbgVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbd, com.google.android.gms.internal.p000authapi.zbs
    public final void zbb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.credentials.Credential credential) {
        this.zba.setResult((com.google.android.gms.internal.p000authapi.zbg) new com.google.android.gms.internal.p000authapi.zbe(status, credential));
    }

    @Override // com.google.android.gms.internal.p000authapi.zbd, com.google.android.gms.internal.p000authapi.zbs
    public final void zbc(com.google.android.gms.common.api.Status status) {
        this.zba.setResult((com.google.android.gms.internal.p000authapi.zbg) new com.google.android.gms.internal.p000authapi.zbe(status, null));
    }
}
