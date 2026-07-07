package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class DataSet extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.DataSet> CREATOR = new com.google.android.gms.fitness.data.zzi();
    private final int zza;
    private final com.google.android.gms.fitness.data.DataSource zzb;
    private final java.util.List zzc;
    private final java.util.List zzd;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private final com.google.android.gms.fitness.data.DataSet zza;
        private boolean zzb = false;

        /* synthetic */ Builder(com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.zzh zzhVar) {
            this.zza = com.google.android.gms.fitness.data.DataSet.create(dataSource);
        }

        public com.google.android.gms.fitness.data.DataSet.Builder add(com.google.android.gms.fitness.data.DataPoint dataPoint) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "Builder should not be mutated after calling #build.");
            this.zza.add(dataPoint);
            return this;
        }

        public com.google.android.gms.fitness.data.DataSet.Builder addAll(java.lang.Iterable<com.google.android.gms.fitness.data.DataPoint> iterable) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "Builder should not be mutated after calling #build.");
            this.zza.addAll(iterable);
            return this;
        }

        public com.google.android.gms.fitness.data.DataSet build() {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "DataSet#build() should only be called once.");
            this.zzb = true;
            return this.zza;
        }
    }

    DataSet(int i, com.google.android.gms.fitness.data.DataSource dataSource, java.util.List list, java.util.List list2) {
        this.zza = i;
        this.zzb = dataSource;
        this.zzc = new java.util.ArrayList(list.size());
        this.zzd = i < 2 ? java.util.Collections.singletonList(dataSource) : list2;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.zzc.add(new com.google.android.gms.fitness.data.DataPoint(this.zzd, (com.google.android.gms.fitness.data.RawDataPoint) it.next()));
        }
    }

    public static com.google.android.gms.fitness.data.DataSet.Builder builder(com.google.android.gms.fitness.data.DataSource dataSource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "DataSource should be specified");
        return new com.google.android.gms.fitness.data.DataSet.Builder(dataSource, null);
    }

    public static com.google.android.gms.fitness.data.DataSet create(com.google.android.gms.fitness.data.DataSource dataSource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "DataSource should be specified");
        return new com.google.android.gms.fitness.data.DataSet(dataSource);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        if (r5 == 0.0d) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zzc(com.google.android.gms.fitness.data.DataPoint r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.data.DataSet.zzc(com.google.android.gms.fitness.data.DataPoint):void");
    }

    @java.lang.Deprecated
    public void add(com.google.android.gms.fitness.data.DataPoint dataPoint) {
        com.google.android.gms.fitness.data.DataSource dataSource = dataPoint.getDataSource();
        com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource.getStreamIdentifier().equals(this.zzb.getStreamIdentifier()), "Conflicting data sources found %s vs %s", dataSource, this.zzb);
        dataPoint.zzd();
        zzc(dataPoint);
        zzb(dataPoint);
    }

    @java.lang.Deprecated
    public void addAll(java.lang.Iterable<com.google.android.gms.fitness.data.DataPoint> iterable) {
        java.util.Iterator<com.google.android.gms.fitness.data.DataPoint> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public com.google.android.gms.fitness.data.DataPoint createDataPoint() {
        return com.google.android.gms.fitness.data.DataPoint.create(this.zzb);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.DataSet)) {
            return false;
        }
        com.google.android.gms.fitness.data.DataSet dataSet = (com.google.android.gms.fitness.data.DataSet) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzb, dataSet.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, dataSet.zzc);
    }

    public java.util.List<com.google.android.gms.fitness.data.DataPoint> getDataPoints() {
        return java.util.Collections.unmodifiableList(this.zzc);
    }

    public com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zzb;
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzb.getDataType();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb);
    }

    public boolean isEmpty() {
        return this.zzc.isEmpty();
    }

    public java.lang.String toString() {
        java.util.List zza = zza(this.zzd);
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.zzb.zzb();
        java.lang.Object obj = zza;
        if (this.zzc.size() >= 10) {
            obj = java.lang.String.format(java.util.Locale.US, "%d data points, first 5: %s", java.lang.Integer.valueOf(this.zzc.size()), zza.subList(0, 5));
        }
        objArr[1] = obj;
        return java.lang.String.format(locale, "DataSet{%s %s}", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 3, zza(this.zzd), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    final java.util.List zza(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zzc.size());
        java.util.Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.google.android.gms.fitness.data.RawDataPoint((com.google.android.gms.fitness.data.DataPoint) it.next(), list));
        }
        return arrayList;
    }

    @java.lang.Deprecated
    public final void zzb(com.google.android.gms.fitness.data.DataPoint dataPoint) {
        this.zzc.add(dataPoint);
        com.google.android.gms.fitness.data.DataSource originalDataSource = dataPoint.getOriginalDataSource();
        if (originalDataSource == null || this.zzd.contains(originalDataSource)) {
            return;
        }
        this.zzd.add(originalDataSource);
    }

    public DataSet(com.google.android.gms.fitness.data.DataSource dataSource) {
        this.zza = 3;
        com.google.android.gms.fitness.data.DataSource dataSource2 = (com.google.android.gms.fitness.data.DataSource) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource);
        this.zzb = dataSource2;
        this.zzc = new java.util.ArrayList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.zzd = arrayList;
        arrayList.add(dataSource2);
    }

    public DataSet(com.google.android.gms.fitness.data.RawDataSet rawDataSet, java.util.List list) {
        this.zza = 3;
        this.zzb = (com.google.android.gms.fitness.data.DataSource) list.get(rawDataSet.zza);
        this.zzd = list;
        java.util.List list2 = rawDataSet.zzb;
        this.zzc = new java.util.ArrayList(list2.size());
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            this.zzc.add(new com.google.android.gms.fitness.data.DataPoint(this.zzd, (com.google.android.gms.fitness.data.RawDataPoint) it.next()));
        }
    }
}
