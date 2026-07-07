package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zabo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabp zaa;

    zabo(com.google.android.gms.common.api.internal.zabp zabpVar) {
        this.zaa = zabpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.Api.Client client;
        com.google.android.gms.common.api.Api.Client client2;
        com.google.android.gms.common.api.internal.zabq zabqVar = this.zaa.zaa;
        client = zabqVar.zac;
        client2 = zabqVar.zac;
        client.disconnect(java.lang.String.valueOf(client2.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
