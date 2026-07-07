package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzci extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzcj {
    public zzci() {
        super("com.google.android.gms.fitness.internal.ISessionReadCallback");
    }

    public static com.google.android.gms.internal.fitness.zzcj zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.fitness.zzcj ? (com.google.android.gms.internal.fitness.zzcj) queryLocalInterface : new com.google.android.gms.internal.fitness.zzch(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.fitness.result.SessionReadResult sessionReadResult = (com.google.android.gms.fitness.result.SessionReadResult) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.fitness.result.SessionReadResult.CREATOR);
        com.google.android.gms.internal.fitness.zzc.zzb(parcel);
        zzd(sessionReadResult);
        return true;
    }
}
