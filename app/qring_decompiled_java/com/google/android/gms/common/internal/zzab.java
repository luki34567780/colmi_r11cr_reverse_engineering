package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzab extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IGmsCallbacks {
    public zzab() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (android.os.Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, android.os.Bundle.CREATOR));
        } else if (i == 2) {
            zzb(parcel.readInt(), (android.os.Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, android.os.Bundle.CREATOR));
        } else {
            if (i != 3) {
                return false;
            }
            zzc(parcel.readInt(), parcel.readStrongBinder(), (com.google.android.gms.common.internal.zzj) com.google.android.gms.internal.common.zzc.zza(parcel, com.google.android.gms.common.internal.zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
