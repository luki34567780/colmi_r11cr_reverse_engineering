package com.google.android.gms.fitness.result;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class DataReadResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.DataReadResult> CREATOR = new com.google.android.gms.fitness.result.zzc();
    private final java.util.List zza;
    private final com.google.android.gms.common.api.Status zzb;
    private final java.util.List zzc;
    private int zzd;
    private final java.util.List zze;

    DataReadResult(java.util.List list, com.google.android.gms.common.api.Status status, java.util.List list2, int i, java.util.List list3) {
        this.zzb = status;
        this.zzd = i;
        this.zze = list3;
        this.zza = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.zza.add(new com.google.android.gms.fitness.data.DataSet((com.google.android.gms.fitness.data.RawDataSet) it.next(), list3));
        }
        this.zzc = new java.util.ArrayList(list2.size());
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.zzc.add(new com.google.android.gms.fitness.data.Bucket((com.google.android.gms.fitness.data.RawBucket) it2.next(), list3));
        }
    }

    private static void zzc(com.google.android.gms.fitness.data.DataSet dataSet, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.fitness.data.DataSet dataSet2 = (com.google.android.gms.fitness.data.DataSet) it.next();
            if (dataSet2.getDataSource().equals(dataSet.getDataSource())) {
                java.util.Iterator<T> it2 = dataSet.getDataPoints().iterator();
                while (it2.hasNext()) {
                    dataSet2.zzb((com.google.android.gms.fitness.data.DataPoint) it2.next());
                }
                return;
            }
        }
        list.add(dataSet);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.result.DataReadResult)) {
            return false;
        }
        com.google.android.gms.fitness.result.DataReadResult dataReadResult = (com.google.android.gms.fitness.result.DataReadResult) obj;
        return this.zzb.equals(dataReadResult.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zza, dataReadResult.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzc, dataReadResult.zzc);
    }

    public java.util.List<com.google.android.gms.fitness.data.Bucket> getBuckets() {
        return this.zzc;
    }

    public com.google.android.gms.fitness.data.DataSet getDataSet(com.google.android.gms.fitness.data.DataSource dataSource) {
        for (com.google.android.gms.fitness.data.DataSet dataSet : this.zza) {
            if (dataSource.equals(dataSet.getDataSource())) {
                return dataSet;
            }
        }
        return com.google.android.gms.fitness.data.DataSet.builder(dataSource).build();
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSets() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zza, this.zzc);
    }

    public java.lang.String toString() {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.google.android.gms.common.internal.Objects.ToStringHelper add = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zzb);
        if (this.zza.size() > 5) {
            obj = this.zza.size() + " data sets";
        } else {
            obj = this.zza;
        }
        com.google.android.gms.common.internal.Objects.ToStringHelper add2 = add.add("dataSets", obj);
        if (this.zzc.size() > 5) {
            obj2 = this.zzc.size() + " buckets";
        } else {
            obj2 = this.zzc;
        }
        return add2.add("buckets", obj2).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zza.size());
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.google.android.gms.fitness.data.RawDataSet((com.google.android.gms.fitness.data.DataSet) it.next(), this.zze));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 1, arrayList, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.zzc.size());
        java.util.Iterator it2 = this.zzc.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new com.google.android.gms.fitness.data.RawBucket((com.google.android.gms.fitness.data.Bucket) it2.next(), this.zze));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 3, arrayList2, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 6, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzd;
    }

    public final void zzb(com.google.android.gms.fitness.result.DataReadResult dataReadResult) {
        java.util.Iterator<com.google.android.gms.fitness.data.DataSet> it = dataReadResult.getDataSets().iterator();
        while (it.hasNext()) {
            zzc(it.next(), this.zza);
        }
        for (com.google.android.gms.fitness.data.Bucket bucket : dataReadResult.getBuckets()) {
            java.util.Iterator it2 = this.zzc.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    this.zzc.add(bucket);
                    break;
                }
                com.google.android.gms.fitness.data.Bucket bucket2 = (com.google.android.gms.fitness.data.Bucket) it2.next();
                if (bucket2.zzc(bucket)) {
                    java.util.Iterator<com.google.android.gms.fitness.data.DataSet> it3 = bucket.getDataSets().iterator();
                    while (it3.hasNext()) {
                        zzc(it3.next(), bucket2.getDataSets());
                    }
                }
            }
        }
    }

    public com.google.android.gms.fitness.data.DataSet getDataSet(com.google.android.gms.fitness.data.DataType dataType) {
        for (com.google.android.gms.fitness.data.DataSet dataSet : this.zza) {
            if (dataType.equals(dataSet.getDataType())) {
                return dataSet;
            }
        }
        com.google.android.gms.fitness.data.DataSource.Builder builder = new com.google.android.gms.fitness.data.DataSource.Builder();
        builder.setType(1);
        builder.setDataType(dataType);
        return com.google.android.gms.fitness.data.DataSet.builder(builder.build()).build();
    }

    public DataReadResult(java.util.List list, java.util.List list2, com.google.android.gms.common.api.Status status) {
        this.zza = list;
        this.zzb = status;
        this.zzc = list2;
        this.zzd = 1;
        this.zze = new java.util.ArrayList();
    }
}
