package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zad implements com.google.android.gms.dynamic.zah {
    final /* synthetic */ android.widget.FrameLayout zaa;
    final /* synthetic */ android.view.LayoutInflater zab;
    final /* synthetic */ android.view.ViewGroup zac;
    final /* synthetic */ android.os.Bundle zad;
    final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zae;

    zad(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper, android.widget.FrameLayout frameLayout, android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.zae = deferredLifecycleHelper;
        this.zaa = frameLayout;
        this.zab = layoutInflater;
        this.zac = viewGroup;
        this.zad = bundle;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 2;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate2;
        this.zaa.removeAllViews();
        android.widget.FrameLayout frameLayout = this.zaa;
        lifecycleDelegate2 = this.zae.zaa;
        frameLayout.addView(lifecycleDelegate2.onCreateView(this.zab, this.zac, this.zad));
    }
}
