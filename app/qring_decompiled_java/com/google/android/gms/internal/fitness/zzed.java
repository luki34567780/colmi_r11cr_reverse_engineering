package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzed extends com.google.android.gms.internal.fitness.zzax {
    final /* synthetic */ com.google.android.gms.fitness.data.zzv zza;
    final /* synthetic */ android.app.PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzed(com.google.android.gms.internal.fitness.zzee zzeeVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.zzv zzvVar, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = zzvVar;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.internal.fitness.zzax, com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcc) ((com.google.android.gms.internal.fitness.zzaz) anyClient).getService()).zzf(new com.google.android.gms.fitness.request.zzan(this.zza, this.zzb, new com.google.android.gms.internal.fitness.zzes(this)));
    }
}
