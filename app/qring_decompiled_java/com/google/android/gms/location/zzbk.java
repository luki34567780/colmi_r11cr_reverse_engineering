package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzbk extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.location.zzbl {
    public zzbk() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static com.google.android.gms.location.zzbl zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof com.google.android.gms.location.zzbl ? (com.google.android.gms.location.zzbl) queryLocalInterface : new com.google.android.gms.location.zzbj(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zzd((android.location.Location) com.google.android.gms.internal.location.zzc.zza(parcel, android.location.Location.CREATOR));
        return true;
    }
}
