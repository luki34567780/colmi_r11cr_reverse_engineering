package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zabd extends com.google.android.gms.common.api.internal.zabw {
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zabe> zaa;

    zabd(com.google.android.gms.common.api.internal.zabe zabeVar) {
        this.zaa = new java.lang.ref.WeakReference<>(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        com.google.android.gms.common.api.internal.zabe zabeVar = this.zaa.get();
        if (zabeVar == null) {
            return;
        }
        com.google.android.gms.common.api.internal.zabe.zai(zabeVar);
    }
}
