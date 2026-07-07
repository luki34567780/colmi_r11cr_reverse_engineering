package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zab extends com.google.android.gms.common.api.internal.ActivityLifecycleObserver {
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaa> zaa;

    zab(com.google.android.gms.common.api.internal.zaa zaaVar) {
        this.zaa = new java.lang.ref.WeakReference<>(zaaVar);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(java.lang.Runnable runnable) {
        com.google.android.gms.common.api.internal.zaa zaaVar = this.zaa.get();
        if (zaaVar == null) {
            throw new java.lang.IllegalStateException("The target activity has already been GC'd");
        }
        zaaVar.zac(runnable);
        return this;
    }
}
