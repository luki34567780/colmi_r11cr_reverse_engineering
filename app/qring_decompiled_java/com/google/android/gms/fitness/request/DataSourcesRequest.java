package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class DataSourcesRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataSourcesRequest> CREATOR = new com.google.android.gms.fitness.request.zzn();
    private final java.util.List zza;
    private final java.util.List zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.fitness.zzbq zzd;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private java.util.List zza = new java.util.ArrayList();
        private java.util.List zzb = java.util.Arrays.asList(0, 1);

        public com.google.android.gms.fitness.request.DataSourcesRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zza.isEmpty(), "Must add at least one data type");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb.isEmpty(), "Must add at least one data source type");
            return new com.google.android.gms.fitness.request.DataSourcesRequest(this.zza, this.zzb, false, (com.google.android.gms.internal.fitness.zzbq) null);
        }

        public com.google.android.gms.fitness.request.DataSourcesRequest.Builder setDataSourceTypes(int... iArr) {
            this.zzb = new java.util.ArrayList();
            for (int i : iArr) {
                this.zzb.add(java.lang.Integer.valueOf(i));
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataSourcesRequest.Builder setDataTypes(com.google.android.gms.fitness.data.DataType... dataTypeArr) {
            this.zza = java.util.Arrays.asList(dataTypeArr);
            return this;
        }
    }

    public DataSourcesRequest(com.google.android.gms.fitness.request.DataSourcesRequest dataSourcesRequest, com.google.android.gms.internal.fitness.zzbq zzbqVar) {
        this(dataSourcesRequest.zza, dataSourcesRequest.zzb, dataSourcesRequest.zzc, zzbqVar);
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return this.zza;
    }

    public java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper add = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataTypes", this.zza).add("sourceTypes", this.zzb);
        if (this.zzc) {
            add.add("includeDbOnlySources", "true");
        }
        return add.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerList(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.internal.fitness.zzbq zzbqVar = this.zzd;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzbqVar == null ? null : zzbqVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    DataSourcesRequest(java.util.List list, java.util.List list2, boolean z, android.os.IBinder iBinder) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = z;
        this.zzd = iBinder == null ? null : com.google.android.gms.internal.fitness.zzbp.zzc(iBinder);
    }

    public DataSourcesRequest(java.util.List list, java.util.List list2, boolean z, com.google.android.gms.internal.fitness.zzbq zzbqVar) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = z;
        this.zzd = zzbqVar;
    }
}
