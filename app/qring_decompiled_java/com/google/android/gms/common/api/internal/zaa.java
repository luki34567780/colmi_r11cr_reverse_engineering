package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zaa extends com.google.android.gms.common.api.internal.LifecycleCallback {
    private java.util.List<java.lang.Runnable> zaa;

    private zaa(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.zaa = new java.util.ArrayList();
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zaa zaa(android.app.Activity activity) {
        com.google.android.gms.common.api.internal.zaa zaaVar;
        synchronized (activity) {
            com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(activity);
            zaaVar = (com.google.android.gms.common.api.internal.zaa) fragment.getCallbackOrNull("LifecycleObserverOnStop", com.google.android.gms.common.api.internal.zaa.class);
            if (zaaVar == null) {
                zaaVar = new com.google.android.gms.common.api.internal.zaa(fragment);
            }
        }
        return zaaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zac(java.lang.Runnable runnable) {
        this.zaa.add(runnable);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        java.util.List<java.lang.Runnable> list;
        synchronized (this) {
            list = this.zaa;
            this.zaa = new java.util.ArrayList();
        }
        java.util.Iterator<java.lang.Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }
}
