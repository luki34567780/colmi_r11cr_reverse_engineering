package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class zzbe extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.location.zzbf {
    public static com.google.android.gms.location.zzbf zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof com.google.android.gms.location.zzbf ? (com.google.android.gms.location.zzbf) queryLocalInterface : new com.google.android.gms.location.zzbd(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        throw null;
    }
}
