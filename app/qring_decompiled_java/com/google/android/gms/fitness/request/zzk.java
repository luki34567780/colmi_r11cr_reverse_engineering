package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzk extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzk> CREATOR = new com.google.android.gms.fitness.request.zzl();
    private final com.google.android.gms.fitness.data.DataSet zza;
    private final com.google.android.gms.internal.fitness.zzcp zzb;
    private final boolean zzc;

    zzk(com.google.android.gms.fitness.data.DataSet dataSet, android.os.IBinder iBinder, boolean z) {
        this.zza = dataSet;
        this.zzb = iBinder == null ? null : com.google.android.gms.internal.fitness.zzco.zzb(iBinder);
        this.zzc = z;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj == this || ((obj instanceof com.google.android.gms.fitness.request.zzk) && com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fitness.request.zzk) obj).zza));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataSet", this.zza).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzcpVar == null ? null : zzcpVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzk(com.google.android.gms.fitness.data.DataSet dataSet, com.google.android.gms.internal.fitness.zzcp zzcpVar, boolean z) {
        this.zza = dataSet;
        this.zzb = zzcpVar;
        this.zzc = false;
    }
}
