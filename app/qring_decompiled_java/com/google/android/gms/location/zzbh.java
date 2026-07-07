package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzbh extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.location.zzbi {
    public zzbh() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static com.google.android.gms.location.zzbi zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof com.google.android.gms.location.zzbi ? (com.google.android.gms.location.zzbi) queryLocalInterface : new com.google.android.gms.location.zzbg(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zze((com.google.android.gms.location.LocationResult) com.google.android.gms.internal.location.zzc.zza(parcel, com.google.android.gms.location.LocationResult.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            zzd((com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.location.zzc.zza(parcel, com.google.android.gms.location.LocationAvailability.CREATOR));
        }
        return true;
    }
}
