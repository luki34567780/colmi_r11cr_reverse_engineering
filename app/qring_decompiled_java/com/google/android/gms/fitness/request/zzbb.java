package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzbb> CREATOR = new com.google.android.gms.fitness.request.zzbc();
    private final com.google.android.gms.fitness.request.zzab zza;
    private final com.google.android.gms.internal.fitness.zzcp zzb;

    zzbb(android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        com.google.android.gms.fitness.request.zzab zzzVar;
        if (iBinder == null) {
            zzzVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            zzzVar = queryLocalInterface instanceof com.google.android.gms.fitness.request.zzab ? (com.google.android.gms.fitness.request.zzab) queryLocalInterface : new com.google.android.gms.fitness.request.zzz(iBinder);
        }
        this.zza = zzzVar;
        this.zzb = iBinder2 != null ? com.google.android.gms.internal.fitness.zzco.zzb(iBinder2) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, this.zza.asBinder(), false);
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzcpVar == null ? null : zzcpVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzbb(com.google.android.gms.fitness.request.zzab zzabVar, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        this.zza = zzabVar;
        this.zzb = zzcpVar;
    }
}
