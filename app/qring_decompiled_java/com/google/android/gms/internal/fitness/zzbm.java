package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzbm extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzbn {
    public zzbm() {
        super("com.google.android.gms.fitness.internal.IDataReadCallback");
    }

    public static com.google.android.gms.internal.fitness.zzbn zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataReadCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.fitness.zzbn ? (com.google.android.gms.internal.fitness.zzbn) queryLocalInterface : new com.google.android.gms.internal.fitness.zzbl(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.fitness.result.DataReadResult dataReadResult = (com.google.android.gms.fitness.result.DataReadResult) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.fitness.result.DataReadResult.CREATOR);
        com.google.android.gms.internal.fitness.zzc.zzb(parcel);
        zzd(dataReadResult);
        return true;
    }
}
