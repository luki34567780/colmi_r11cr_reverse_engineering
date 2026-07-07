package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zah extends com.google.android.gms.common.api.internal.zad<java.lang.Boolean> {
    public final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> zab;

    public zah(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> listenerKey, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.zab = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(com.google.android.gms.common.api.internal.zabq<?> zabqVar) {
        com.google.android.gms.common.api.internal.zaci zaciVar = zabqVar.zah().get(this.zab);
        return zaciVar != null && zaciVar.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabq<?> zabqVar) {
        com.google.android.gms.common.api.internal.zaci zaciVar = zabqVar.zah().get(this.zab);
        if (zaciVar == null) {
            return null;
        }
        return zaciVar.zaa.getRequiredFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void zac(com.google.android.gms.common.api.internal.zabq<?> zabqVar) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.zaci remove = zabqVar.zah().remove(this.zab);
        if (remove == null) {
            this.zaa.trySetResult(false);
        } else {
            remove.zab.unregisterListener(zabqVar.zaf(), this.zaa);
            remove.zaa.clearListener();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(com.google.android.gms.common.api.internal.zaad zaadVar, boolean z) {
    }
}
