package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzdb extends com.google.android.gms.internal.fitness.zzs {
    zzdb(com.google.android.gms.internal.fitness.zzde zzdeVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzby) ((com.google.android.gms.internal.fitness.zzu) anyClient).getService()).zze(new com.google.android.gms.fitness.request.zzv((com.google.android.gms.internal.fitness.zzcp) new com.google.android.gms.internal.fitness.zzes(this)));
    }
}
