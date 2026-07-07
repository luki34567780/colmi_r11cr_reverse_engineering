package com.google.android.gms.fitness.service;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
final class zzb extends com.google.android.gms.internal.fitness.zzfb {
    private final com.google.android.gms.fitness.service.FitnessSensorService zza;

    @Override // com.google.android.gms.internal.fitness.zzfc
    public final void zzb(com.google.android.gms.internal.fitness.zzex zzexVar, com.google.android.gms.internal.fitness.zzbq zzbqVar) throws android.os.RemoteException {
        this.zza.zza();
        zzbqVar.zzb(new com.google.android.gms.fitness.result.DataSourcesResult(this.zza.onFindDataSources(zzexVar.zza()), com.google.android.gms.common.api.Status.RESULT_SUCCESS));
    }

    @Override // com.google.android.gms.internal.fitness.zzfc
    public final void zzc(com.google.android.gms.fitness.service.FitnessSensorServiceRequest fitnessSensorServiceRequest, com.google.android.gms.internal.fitness.zzcp zzcpVar) throws android.os.RemoteException {
        this.zza.zza();
        if (this.zza.onRegister(fitnessSensorServiceRequest)) {
            zzcpVar.zzd(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
        } else {
            zzcpVar.zzd(new com.google.android.gms.common.api.Status(13));
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzfc
    public final void zzd(com.google.android.gms.internal.fitness.zzez zzezVar, com.google.android.gms.internal.fitness.zzcp zzcpVar) throws android.os.RemoteException {
        this.zza.zza();
        if (this.zza.onUnregister(zzezVar.zza())) {
            zzcpVar.zzd(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
        } else {
            zzcpVar.zzd(new com.google.android.gms.common.api.Status(13));
        }
    }
}
