package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzdi extends com.google.android.gms.internal.fitness.zzah {
    final /* synthetic */ com.google.android.gms.fitness.data.DataSet zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdi(com.google.android.gms.internal.fitness.zzds zzdsVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataSet dataSet, boolean z) {
        super(googleApiClient);
        this.zza = dataSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzca) ((com.google.android.gms.internal.fitness.zzaj) anyClient).getService()).zze(new com.google.android.gms.fitness.request.zzk(this.zza, (com.google.android.gms.internal.fitness.zzcp) new com.google.android.gms.internal.fitness.zzes(this), false));
    }
}
