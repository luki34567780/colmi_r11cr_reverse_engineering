package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzct extends com.google.android.gms.internal.fitness.zzk {
    final /* synthetic */ com.google.android.gms.fitness.data.BleDevice zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzct(com.google.android.gms.internal.fitness.zzcy zzcyVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.BleDevice bleDevice) {
        super(googleApiClient);
        this.zza = bleDevice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbx) ((com.google.android.gms.internal.fitness.zzm) anyClient).getService()).zzd(new com.google.android.gms.fitness.request.zzf(this.zza.getAddress(), this.zza, (com.google.android.gms.internal.fitness.zzcp) new com.google.android.gms.internal.fitness.zzes(this)));
    }
}
