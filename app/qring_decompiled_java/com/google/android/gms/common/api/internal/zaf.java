package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zaf extends com.google.android.gms.common.api.internal.zad<java.lang.Void> {
    public final com.google.android.gms.common.api.internal.zaci zab;

    public zaf(com.google.android.gms.common.api.internal.zaci zaciVar, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.zab = zaciVar;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(com.google.android.gms.common.api.internal.zabq<?> zabqVar) {
        return this.zab.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabq<?> zabqVar) {
        return this.zab.zaa.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void zac(com.google.android.gms.common.api.internal.zabq<?> zabqVar) throws android.os.RemoteException {
        this.zab.zaa.registerListener(zabqVar.zaf(), this.zaa);
        com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey = this.zab.zaa.getListenerKey();
        if (listenerKey != null) {
            zabqVar.zah().put(listenerKey, this.zab);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(com.google.android.gms.common.api.internal.zaad zaadVar, boolean z) {
    }
}
