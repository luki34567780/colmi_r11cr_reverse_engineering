package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zaa implements com.google.android.gms.dynamic.OnDelegateCreatedListener {
    final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zaa;

    zaa(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate2;
        this.zaa.zaa = lifecycleDelegate;
        linkedList = this.zaa.zac;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.google.android.gms.dynamic.zah zahVar = (com.google.android.gms.dynamic.zah) it.next();
            lifecycleDelegate2 = this.zaa.zaa;
            zahVar.zab(lifecycleDelegate2);
        }
        linkedList2 = this.zaa.zac;
        linkedList2.clear();
        this.zaa.zab = null;
    }
}
