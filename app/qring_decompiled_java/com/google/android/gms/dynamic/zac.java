package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zac implements com.google.android.gms.dynamic.zah {
    final /* synthetic */ android.os.Bundle zaa;
    final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zab;

    zac(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper, android.os.Bundle bundle) {
        this.zab = deferredLifecycleHelper;
        this.zaa = bundle;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 1;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.zab.zaa;
        lifecycleDelegate2.onCreate(this.zaa);
    }
}
