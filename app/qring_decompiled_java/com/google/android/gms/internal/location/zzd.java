package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzd extends com.google.android.gms.internal.location.zzf {
    final /* synthetic */ long zza;
    final /* synthetic */ android.app.PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(com.google.android.gms.internal.location.zzg zzgVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, long j, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = j;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) anyClient;
        long j = this.zza;
        android.app.PendingIntent pendingIntent = this.zzb;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "detectionIntervalMillis must be >= 0");
        ((com.google.android.gms.internal.location.zzam) zzbeVar.getService()).zzr(j, true, pendingIntent);
        setResult((com.google.android.gms.internal.location.zzd) com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    }
}
