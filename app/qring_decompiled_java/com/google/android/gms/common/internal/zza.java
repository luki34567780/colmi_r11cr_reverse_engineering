package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
abstract class zza extends com.google.android.gms.common.internal.zzc<java.lang.Boolean> {
    public final int zza;
    public final android.os.Bundle zzb;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected zza(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i, android.os.Bundle bundle) {
        super(baseGmsClient, true);
        this.zzc = baseGmsClient;
        this.zza = i;
        this.zzb = bundle;
    }

    protected abstract void zzb(com.google.android.gms.common.ConnectionResult connectionResult);

    @Override // com.google.android.gms.common.internal.zzc
    protected final void zzc() {
    }

    protected abstract boolean zzd();

    @Override // com.google.android.gms.common.internal.zzc
    protected final /* bridge */ /* synthetic */ void zza(java.lang.Boolean bool) {
        if (this.zza != 0) {
            this.zzc.zzp(1, null);
            android.os.Bundle bundle = this.zzb;
            zzb(new com.google.android.gms.common.ConnectionResult(this.zza, bundle != null ? (android.app.PendingIntent) bundle.getParcelable(com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT) : null));
        } else {
            if (zzd()) {
                return;
            }
            this.zzc.zzp(1, null);
            zzb(new com.google.android.gms.common.ConnectionResult(8, null));
        }
    }
}
