package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzbh> CREATOR = new com.google.android.gms.fitness.request.zzbi();
    private final com.google.android.gms.fitness.data.DataType zza;
    private final com.google.android.gms.fitness.data.DataSource zzb;
    private final com.google.android.gms.internal.fitness.zzcp zzc;

    public zzbh(com.google.android.gms.fitness.data.DataType dataType, com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        com.google.android.gms.common.internal.Preconditions.checkArgument((dataType == null) != (dataSource == null), "Must specify exactly one of dataType and dataSource.");
        this.zza = dataType;
        this.zzb = dataSource;
        this.zzc = zzcpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.request.zzbh)) {
            return false;
        }
        com.google.android.gms.fitness.request.zzbh zzbhVar = (com.google.android.gms.fitness.request.zzbh) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzb, zzbhVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zza, zzbhVar.zza);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzcpVar == null ? null : zzcpVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
