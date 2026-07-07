package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzau extends com.google.android.gms.location.LocationCallback {
    final /* synthetic */ com.google.android.gms.internal.location.zzao zza;
    final /* synthetic */ com.google.android.gms.tasks.OnTokenCanceledListener zzb;

    zzau(com.google.android.gms.internal.location.zzbe zzbeVar, com.google.android.gms.internal.location.zzao zzaoVar, com.google.android.gms.tasks.OnTokenCanceledListener onTokenCanceledListener) {
        this.zza = zzaoVar;
        this.zzb = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationAvailability(com.google.android.gms.location.LocationAvailability locationAvailability) {
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(com.google.android.gms.location.LocationResult locationResult) {
        try {
            this.zza.zzb(com.google.android.gms.common.api.Status.RESULT_SUCCESS, locationResult.getLastLocation());
            this.zzb.onCanceled();
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
