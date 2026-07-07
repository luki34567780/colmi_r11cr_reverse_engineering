package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbo extends com.google.android.gms.internal.fitness.zza implements com.google.android.gms.internal.fitness.zzbq {
    zzbo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IDataSourcesCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzbq
    public final void zzb(com.google.android.gms.fitness.result.DataSourcesResult dataSourcesResult) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, dataSourcesResult);
        zzl(1, zza);
    }
}
