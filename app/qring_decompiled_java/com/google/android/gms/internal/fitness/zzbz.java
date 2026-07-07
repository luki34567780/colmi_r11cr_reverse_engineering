package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbz extends com.google.android.gms.internal.fitness.zza implements android.os.IInterface {
    zzbz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
    }

    public final void zzd(com.google.android.gms.fitness.request.GoalsReadRequest goalsReadRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.fitness.zzc.zzc(zza, goalsReadRequest);
        zzk(1, zza);
    }
}
