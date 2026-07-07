package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: /tmp/dex/classes2.dex */
final class zao implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zap zaa;
    private final com.google.android.gms.common.api.internal.zam zab;

    zao(com.google.android.gms.common.api.internal.zap zapVar, com.google.android.gms.common.api.internal.zam zamVar) {
        this.zaa = zapVar;
        this.zab = zamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zaa.zaa) {
            com.google.android.gms.common.ConnectionResult zab = this.zab.zab();
            if (zab.hasResolution()) {
                this.zaa.mLifecycleFragment.startActivityForResult(com.google.android.gms.common.api.GoogleApiActivity.zaa(this.zaa.getActivity(), (android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull(zab.getResolution()), this.zab.zaa(), false), 1);
                return;
            }
            com.google.android.gms.common.api.internal.zap zapVar = this.zaa;
            if (zapVar.zac.getErrorResolutionIntent(zapVar.getActivity(), zab.getErrorCode(), null) != null) {
                com.google.android.gms.common.api.internal.zap zapVar2 = this.zaa;
                zapVar2.zac.zag(zapVar2.getActivity(), this.zaa.mLifecycleFragment, zab.getErrorCode(), 2, this.zaa);
            } else {
                if (zab.getErrorCode() != 18) {
                    this.zaa.zaa(zab, this.zab.zaa());
                    return;
                }
                com.google.android.gms.common.api.internal.zap zapVar3 = this.zaa;
                android.app.Dialog zab2 = zapVar3.zac.zab(zapVar3.getActivity(), this.zaa);
                com.google.android.gms.common.api.internal.zap zapVar4 = this.zaa;
                zapVar4.zac.zac(zapVar4.getActivity().getApplicationContext(), new com.google.android.gms.common.api.internal.zan(this, zab2));
            }
        }
    }
}
