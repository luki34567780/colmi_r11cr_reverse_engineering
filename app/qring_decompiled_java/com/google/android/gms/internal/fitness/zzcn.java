package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzcn extends com.google.android.gms.internal.fitness.zza implements com.google.android.gms.internal.fitness.zzcp {
    zzcn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IStatusCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzcp
    public final void zzd(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, status);
        zzl(1, zza);
    }
}
