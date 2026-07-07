package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzj> CREATOR = new com.google.android.gms.internal.location.zzk();
    final int zza;
    final com.google.android.gms.internal.location.zzh zzb;
    final com.google.android.gms.location.zzbf zzc;
    final com.google.android.gms.internal.location.zzai zzd;

    zzj(int i, com.google.android.gms.internal.location.zzh zzhVar, android.os.IBinder iBinder, android.os.IBinder iBinder2) {
        this.zza = i;
        this.zzb = zzhVar;
        com.google.android.gms.internal.location.zzai zzaiVar = null;
        this.zzc = iBinder == null ? null : com.google.android.gms.location.zzbe.zzb(iBinder);
        if (iBinder2 != null) {
            android.os.IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaiVar = queryLocalInterface instanceof com.google.android.gms.internal.location.zzai ? (com.google.android.gms.internal.location.zzai) queryLocalInterface : new com.google.android.gms.internal.location.zzag(iBinder2);
        }
        this.zzd = zzaiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.location.zzbf zzbfVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzbfVar == null ? null : zzbfVar.asBinder(), false);
        com.google.android.gms.internal.location.zzai zzaiVar = this.zzd;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
