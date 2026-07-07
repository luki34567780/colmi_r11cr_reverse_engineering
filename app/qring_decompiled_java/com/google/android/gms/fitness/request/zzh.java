package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzh> CREATOR = new com.google.android.gms.fitness.request.zzi();
    private final com.google.android.gms.internal.fitness.zzbk zza;
    private final com.google.android.gms.fitness.data.DataType zzb;
    private final boolean zzc;

    zzh(android.os.IBinder iBinder, com.google.android.gms.fitness.data.DataType dataType, boolean z) {
        this.zza = com.google.android.gms.internal.fitness.zzbj.zzb(iBinder);
        this.zzb = dataType;
        this.zzc = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 1, this.zza.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.google.android.gms.fitness.data.DataType dataType = this.zzb;
        objArr[0] = dataType == null ? "null" : dataType.zzc();
        return java.lang.String.format("DailyTotalRequest{%s}", objArr);
    }

    public zzh(com.google.android.gms.internal.fitness.zzbk zzbkVar, com.google.android.gms.fitness.data.DataType dataType, boolean z) {
        this.zza = zzbkVar;
        this.zzb = dataType;
        this.zzc = z;
    }
}
