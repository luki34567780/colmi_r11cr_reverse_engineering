package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzap extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.internal.location.zzaq {
    public zzap() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zzb((com.google.android.gms.location.LocationSettingsResult) com.google.android.gms.internal.location.zzc.zza(parcel, com.google.android.gms.location.LocationSettingsResult.CREATOR));
        return true;
    }
}
