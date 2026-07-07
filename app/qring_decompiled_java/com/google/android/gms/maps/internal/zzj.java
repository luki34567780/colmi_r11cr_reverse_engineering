package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzj extends com.google.android.gms.internal.maps.zzb implements com.google.android.gms.maps.internal.ILocationSourceDelegate {
    public zzj() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.zzaj zzaiVar;
        if (i == 1) {
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzaiVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                zzaiVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.zzaj ? (com.google.android.gms.maps.internal.zzaj) queryLocalInterface : new com.google.android.gms.maps.internal.zzai(readStrongBinder);
            }
            com.google.android.gms.internal.maps.zzc.zzc(parcel);
            activate(zzaiVar);
        } else {
            if (i != 2) {
                return false;
            }
            deactivate();
        }
        parcel2.writeNoException();
        return true;
    }
}
