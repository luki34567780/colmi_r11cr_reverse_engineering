package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzcl extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzcm {
    public zzcl() {
        super("com.google.android.gms.fitness.internal.ISessionStopCallback");
    }

    public static com.google.android.gms.internal.fitness.zzcm zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.fitness.zzcm ? (com.google.android.gms.internal.fitness.zzcm) queryLocalInterface : new com.google.android.gms.internal.fitness.zzck(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.fitness.result.SessionStopResult sessionStopResult = (com.google.android.gms.fitness.result.SessionStopResult) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.fitness.result.SessionStopResult.CREATOR);
        com.google.android.gms.internal.fitness.zzc.zzb(parcel);
        zzd(sessionStopResult);
        return true;
    }
}
