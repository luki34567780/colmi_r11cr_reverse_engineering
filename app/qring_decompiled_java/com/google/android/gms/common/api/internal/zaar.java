package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zaar extends com.google.android.gms.signin.internal.zac {
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaaw> zaa;

    zaar(com.google.android.gms.common.api.internal.zaaw zaawVar) {
        this.zaa = new java.lang.ref.WeakReference<>(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        com.google.android.gms.common.api.internal.zabi zabiVar;
        com.google.android.gms.common.api.internal.zaaw zaawVar = this.zaa.get();
        if (zaawVar == null) {
            return;
        }
        zabiVar = zaawVar.zaa;
        zabiVar.zal(new com.google.android.gms.common.api.internal.zaaq(this, zaawVar, zaawVar, zakVar));
    }
}
