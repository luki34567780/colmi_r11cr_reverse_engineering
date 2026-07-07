package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzcs extends com.google.android.gms.internal.fitness.zzk {
    final /* synthetic */ java.lang.String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcs(com.google.android.gms.internal.fitness.zzcy zzcyVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        super(googleApiClient);
        this.zza = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbx) ((com.google.android.gms.internal.fitness.zzm) anyClient).getService()).zzd(new com.google.android.gms.fitness.request.zzf(this.zza, (com.google.android.gms.fitness.data.BleDevice) null, (com.google.android.gms.internal.fitness.zzcp) new com.google.android.gms.internal.fitness.zzes(this)));
    }
}
