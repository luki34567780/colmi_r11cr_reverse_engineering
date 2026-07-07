package com.google.android.gms.internal.fitness;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public abstract class zzcf extends com.google.android.gms.internal.fitness.zzb implements com.google.android.gms.internal.fitness.zzcg {
    public zzcf() {
        super("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
    }

    public static com.google.android.gms.internal.fitness.zzcg zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.fitness.zzcg ? (com.google.android.gms.internal.fitness.zzcg) queryLocalInterface : new com.google.android.gms.internal.fitness.zzce(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.fitness.result.ListSubscriptionsResult listSubscriptionsResult = (com.google.android.gms.fitness.result.ListSubscriptionsResult) com.google.android.gms.internal.fitness.zzc.zza(parcel, com.google.android.gms.fitness.result.ListSubscriptionsResult.CREATOR);
        com.google.android.gms.internal.fitness.zzc.zzb(parcel);
        zzd(listSubscriptionsResult);
        return true;
    }
}
