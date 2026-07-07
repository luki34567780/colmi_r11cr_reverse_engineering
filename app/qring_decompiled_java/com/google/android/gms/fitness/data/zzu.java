package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzu extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.fitness.data.zzv {
    public zzu() {
        super("com.google.android.gms.fitness.data.IDataSourceListener");
    }

    public static com.google.android.gms.fitness.data.zzv zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
        return queryLocalInterface instanceof com.google.android.gms.fitness.data.zzv ? (com.google.android.gms.fitness.data.zzv) queryLocalInterface : new com.google.android.gms.fitness.data.zzt(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.fitness.data.DataPoint dataPoint = (com.google.android.gms.fitness.data.DataPoint) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.fitness.data.DataPoint.CREATOR);
        com.google.android.gms.internal.fitness.zzc.zzb(parcel);
        zzd(dataPoint);
        return true;
    }
}
