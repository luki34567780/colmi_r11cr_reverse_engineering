package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzbj extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzbk {
    public zzbj() {
        super("com.google.android.gms.fitness.internal.IDailyTotalCallback");
    }

    public static com.google.android.gms.internal.fitness.zzbk zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDailyTotalCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.fitness.zzbk ? (com.google.android.gms.internal.fitness.zzbk) queryLocalInterface : new com.google.android.gms.internal.fitness.zzbi(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.fitness.result.DailyTotalResult dailyTotalResult = (com.google.android.gms.fitness.result.DailyTotalResult) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.fitness.result.DailyTotalResult.CREATOR);
        com.google.android.gms.internal.fitness.zzc.zzb(parcel);
        zzd(dailyTotalResult);
        return true;
    }
}
