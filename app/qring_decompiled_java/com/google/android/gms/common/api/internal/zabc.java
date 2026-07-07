package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zabc extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabe zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zabc(com.google.android.gms.common.api.internal.zabe zabeVar, android.os.Looper looper) {
        super(looper);
        this.zaa = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            com.google.android.gms.common.api.internal.zabe.zaj(this.zaa);
            return;
        }
        if (i == 2) {
            com.google.android.gms.common.api.internal.zabe.zai(this.zaa);
            return;
        }
        int i2 = message.what;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
        sb.append("Unknown message id: ");
        sb.append(i2);
        android.util.Log.w("GoogleApiClientImpl", sb.toString());
    }
}
