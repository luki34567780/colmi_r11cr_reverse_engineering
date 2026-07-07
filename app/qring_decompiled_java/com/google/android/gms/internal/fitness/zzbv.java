package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzbv extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzbw {
    public zzbv() {
        super("com.google.android.gms.fitness.internal.IGoalsReadCallback");
    }

    public static com.google.android.gms.internal.fitness.zzbw zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoalsReadCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.fitness.zzbw ? (com.google.android.gms.internal.fitness.zzbw) queryLocalInterface : new com.google.android.gms.internal.fitness.zzbu(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.fitness.result.GoalsResult goalsResult = (com.google.android.gms.fitness.result.GoalsResult) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.fitness.result.GoalsResult.CREATOR);
        com.google.android.gms.internal.fitness.zzc.zzb(parcel);
        zzd(goalsResult);
        return true;
    }
}
