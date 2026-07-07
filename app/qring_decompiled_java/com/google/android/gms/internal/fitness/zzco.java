package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzco extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzcp {
    public zzco() {
        super("com.google.android.gms.fitness.internal.IStatusCallback");
    }

    public static com.google.android.gms.internal.fitness.zzcp zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.fitness.zzcp ? (com.google.android.gms.internal.fitness.zzcp) queryLocalInterface : new com.google.android.gms.internal.fitness.zzcn(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
        com.google.android.gms.internal.fitness.zzc.zzb(parcel);
        zzd(status);
        return true;
    }
}
