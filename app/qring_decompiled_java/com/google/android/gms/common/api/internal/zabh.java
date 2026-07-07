package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zabh extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabi zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zabh(com.google.android.gms.common.api.internal.zabi zabiVar, android.os.Looper looper) {
        super(looper);
        this.zaa = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            ((com.google.android.gms.common.api.internal.zabg) message.obj).zab(this.zaa);
            return;
        }
        if (i == 2) {
            throw ((java.lang.RuntimeException) message.obj);
        }
        int i2 = message.what;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
        sb.append("Unknown message id: ");
        sb.append(i2);
        android.util.Log.w("GACStateManager", sb.toString());
    }
}
