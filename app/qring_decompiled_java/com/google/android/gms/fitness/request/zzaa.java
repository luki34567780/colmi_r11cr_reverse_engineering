package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzaa extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.fitness.request.zzab {
    public zzaa() {
        super("com.google.android.gms.fitness.request.IBleScanCallback");
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.fitness.data.BleDevice bleDevice = (com.google.android.gms.fitness.data.BleDevice) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.fitness.data.BleDevice.CREATOR);
            com.google.android.gms.internal.fitness.zzc.zzb(parcel);
            zzb(bleDevice);
        } else {
            if (i != 2) {
                return false;
            }
            zzc();
        }
        return true;
    }
}
