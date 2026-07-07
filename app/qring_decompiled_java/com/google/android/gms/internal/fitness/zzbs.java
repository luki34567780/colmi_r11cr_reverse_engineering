package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzbs extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzbt {
    public zzbs() {
        super("com.google.android.gms.fitness.internal.IDataTypeCallback");
    }

    public static com.google.android.gms.internal.fitness.zzbt zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.fitness.zzbt ? (com.google.android.gms.internal.fitness.zzbt) queryLocalInterface : new com.google.android.gms.internal.fitness.zzbr(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.fitness.result.DataTypeResult dataTypeResult = (com.google.android.gms.fitness.result.DataTypeResult) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.fitness.result.DataTypeResult.CREATOR);
        com.google.android.gms.internal.fitness.zzc.zzb(parcel);
        zzd(dataTypeResult);
        return true;
    }
}
