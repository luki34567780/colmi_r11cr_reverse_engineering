package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzev extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzew {
    public zzev() {
        super("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
    }

    public static com.google.android.gms.internal.fitness.zzew zzc(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.fitness.zzew ? (com.google.android.gms.internal.fitness.zzew) queryLocalInterface : new com.google.android.gms.internal.fitness.zzeu(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.fitness.result.BleDevicesResult bleDevicesResult = (com.google.android.gms.fitness.result.BleDevicesResult) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.fitness.result.BleDevicesResult.CREATOR);
        com.google.android.gms.internal.fitness.zzc.zzb(parcel);
        zzb(bleDevicesResult);
        return true;
    }
}
