package com.google.android.gms.fitness.result;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class DataSourcesResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.DataSourcesResult> CREATOR = new com.google.android.gms.fitness.result.zzd();
    private final java.util.List zza;
    private final com.google.android.gms.common.api.Status zzb;

    public DataSourcesResult(java.util.List list, com.google.android.gms.common.api.Status status) {
        this.zza = java.util.Collections.unmodifiableList(list);
        this.zzb = status;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (!(obj instanceof com.google.android.gms.fitness.result.DataSourcesResult)) {
                return false;
            }
            com.google.android.gms.fitness.result.DataSourcesResult dataSourcesResult = (com.google.android.gms.fitness.result.DataSourcesResult) obj;
            if (!this.zzb.equals(dataSourcesResult.zzb) || !com.google.android.gms.common.internal.Objects.equal(this.zza, dataSourcesResult.zza)) {
                return false;
            }
        }
        return true;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSource> getDataSources() {
        return this.zza;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSource> getDataSources(com.google.android.gms.fitness.data.DataType dataType) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.fitness.data.DataSource dataSource : this.zza) {
            if (dataSource.getDataType().equals(dataType)) {
                arrayList.add(dataSource);
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zza);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzb).add("dataSources", this.zza).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getDataSources(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
