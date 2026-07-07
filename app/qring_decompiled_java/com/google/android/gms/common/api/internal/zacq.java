package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zacq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zact zaa;

    zacq(com.google.android.gms.common.api.internal.zact zactVar) {
        this.zaa = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.zacs zacsVar;
        zacsVar = this.zaa.zah;
        zacsVar.zae(new com.google.android.gms.common.ConnectionResult(4));
    }
}
