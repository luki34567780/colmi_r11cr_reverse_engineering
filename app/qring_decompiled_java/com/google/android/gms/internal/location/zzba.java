package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzba extends com.google.android.gms.internal.location.zzaj {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zza;

    public zzba(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(resultHolder != null, "listener can't be null.");
        this.zza = resultHolder;
    }

    private final void zze(int i) {
        com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder = this.zza;
        int i2 = com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE;
        if (i != 0 && (i < 1000 || i >= 1006)) {
            i = 13;
        }
        resultHolder.setResult(new com.google.android.gms.common.api.Status(i));
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i, java.lang.String[] strArr) {
        zze(i);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i, android.app.PendingIntent pendingIntent) {
        zze(i);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i, java.lang.String[] strArr) {
        zze(i);
    }
}
