package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class RawDataSet extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.RawDataSet> CREATOR = new com.google.android.gms.fitness.data.zzaa();
    public final int zza;
    public final java.util.List zzb;

    public RawDataSet(int i, java.util.List list) {
        this.zza = i;
        this.zzb = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.RawDataSet)) {
            return false;
        }
        com.google.android.gms.fitness.data.RawDataSet rawDataSet = (com.google.android.gms.fitness.data.RawDataSet) obj;
        return this.zza == rawDataSet.zza && com.google.android.gms.common.internal.Objects.equal(this.zzb, rawDataSet.zzb);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza));
    }

    public final java.lang.String toString() {
        return java.lang.String.format("RawDataSet{%s@[%s]}", java.lang.Integer.valueOf(this.zza), this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public RawDataSet(com.google.android.gms.fitness.data.DataSet dataSet, java.util.List list) {
        this.zzb = dataSet.zza(list);
        this.zza = com.google.android.gms.internal.fitness.zzd.zza(dataSet.getDataSource(), list);
    }
}
