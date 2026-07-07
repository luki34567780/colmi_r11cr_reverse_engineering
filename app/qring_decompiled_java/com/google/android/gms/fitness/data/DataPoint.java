package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class DataPoint extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.DataPoint> CREATOR = new com.google.android.gms.fitness.data.zzg();
    private final com.google.android.gms.fitness.data.DataSource zza;
    private long zzb;
    private long zzc;
    private final com.google.android.gms.fitness.data.Value[] zzd;
    private com.google.android.gms.fitness.data.DataSource zze;
    private final long zzf;

    private DataPoint(com.google.android.gms.fitness.data.DataSource dataSource) {
        this.zza = (com.google.android.gms.fitness.data.DataSource) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "Data source cannot be null");
        java.util.List<com.google.android.gms.fitness.data.Field> fields = dataSource.getDataType().getFields();
        this.zzd = new com.google.android.gms.fitness.data.Value[fields.size()];
        java.util.Iterator<com.google.android.gms.fitness.data.Field> it = fields.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.zzd[i] = new com.google.android.gms.fitness.data.Value(it.next().getFormat(), false, 0.0f, null, null, null, null, null);
            i++;
        }
        this.zzf = 0L;
    }

    public static com.google.android.gms.fitness.data.DataPoint.Builder builder(com.google.android.gms.fitness.data.DataSource dataSource) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "DataSource should be specified");
        return new com.google.android.gms.fitness.data.DataPoint.Builder(dataSource, null);
    }

    @java.lang.Deprecated
    public static com.google.android.gms.fitness.data.DataPoint create(com.google.android.gms.fitness.data.DataSource dataSource) {
        return new com.google.android.gms.fitness.data.DataPoint(dataSource);
    }

    public static com.google.android.gms.fitness.data.DataPoint extract(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        return (com.google.android.gms.fitness.data.DataPoint) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
    }

    private static com.google.android.gms.fitness.data.DataSource zzf(java.util.List list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (com.google.android.gms.fitness.data.DataSource) list.get(i);
    }

    private final void zzg(int i) {
        java.util.List<com.google.android.gms.fitness.data.Field> fields = getDataType().getFields();
        int size = fields.size();
        com.google.android.gms.common.internal.Preconditions.checkArgument(i == size, "Attempting to insert %s values, but needed %s: %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(size), fields);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.DataPoint)) {
            return false;
        }
        com.google.android.gms.fitness.data.DataPoint dataPoint = (com.google.android.gms.fitness.data.DataPoint) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, dataPoint.zza) && this.zzb == dataPoint.zzb && this.zzc == dataPoint.zzc && java.util.Arrays.equals(this.zzd, dataPoint.zzd) && com.google.android.gms.common.internal.Objects.equal(getOriginalDataSource(), dataPoint.getOriginalDataSource());
    }

    public com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zza;
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zza.getDataType();
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzb, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public com.google.android.gms.fitness.data.DataSource getOriginalDataSource() {
        com.google.android.gms.fitness.data.DataSource dataSource = this.zze;
        return dataSource != null ? dataSource : this.zza;
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzc, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public long getTimestamp(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzb, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public com.google.android.gms.fitness.data.Value getValue(com.google.android.gms.fitness.data.Field field) {
        return this.zzd[getDataType().indexOf(field)];
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Long.valueOf(this.zzb), java.lang.Long.valueOf(this.zzc));
    }

    @java.lang.Deprecated
    public com.google.android.gms.fitness.data.DataPoint setFloatValues(float... fArr) {
        zzg(fArr.length);
        for (int i = 0; i < fArr.length; i++) {
            this.zzd[i].setFloat(fArr[i]);
        }
        return this;
    }

    @java.lang.Deprecated
    public com.google.android.gms.fitness.data.DataPoint setIntValues(int... iArr) {
        zzg(iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            this.zzd[i].setInt(iArr[i]);
        }
        return this;
    }

    @java.lang.Deprecated
    public com.google.android.gms.fitness.data.DataPoint setTimeInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        this.zzc = timeUnit.toNanos(j);
        this.zzb = timeUnit.toNanos(j2);
        return this;
    }

    @java.lang.Deprecated
    public com.google.android.gms.fitness.data.DataPoint setTimestamp(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.zzb = timeUnit.toNanos(j);
        return this;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.util.Arrays.toString(this.zzd);
        objArr[1] = java.lang.Long.valueOf(this.zzc);
        objArr[2] = java.lang.Long.valueOf(this.zzb);
        objArr[3] = java.lang.Long.valueOf(this.zzf);
        objArr[4] = this.zza.zzb();
        com.google.android.gms.fitness.data.DataSource dataSource = this.zze;
        objArr[5] = dataSource != null ? dataSource.zzb() : "N/A";
        return java.lang.String.format("DataPoint{%s@[%s, %s,raw=%s](%s %s)}", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 5, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        return this.zzf;
    }

    public final com.google.android.gms.fitness.data.DataSource zzb() {
        return this.zze;
    }

    public final com.google.android.gms.fitness.data.Value zzc(int i) {
        com.google.android.gms.fitness.data.DataType dataType = getDataType();
        com.google.android.gms.common.internal.Preconditions.checkArgument(i >= 0 && i < dataType.getFields().size(), "fieldIndex %s is out of range for %s", java.lang.Integer.valueOf(i), dataType);
        return this.zzd[i];
    }

    public final void zzd() {
        com.google.android.gms.common.internal.Preconditions.checkArgument(getDataType().getName().equals(getDataSource().getDataType().getName()), "Conflicting data types found %s vs %s", getDataType(), getDataType());
        com.google.android.gms.common.internal.Preconditions.checkArgument(this.zzb > 0, "Data point does not have the timestamp set: %s", this);
        com.google.android.gms.common.internal.Preconditions.checkArgument(this.zzc <= this.zzb, "Data point with start time greater than end time found: %s", this);
    }

    public final com.google.android.gms.fitness.data.Value[] zze() {
        return this.zzd;
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private final com.google.android.gms.fitness.data.DataPoint zza;
        private boolean zzb = false;

        /* synthetic */ Builder(com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.zzf zzfVar) {
            this.zza = com.google.android.gms.fitness.data.DataPoint.create(dataSource);
        }

        public com.google.android.gms.fitness.data.DataPoint build() {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "DataPoint#build should not be called multiple times.");
            this.zzb = true;
            return this.zza;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setActivityField(com.google.android.gms.fitness.data.Field field, java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "Builder should not be mutated after calling #build.");
            this.zza.getValue(field).setInt(com.google.android.gms.internal.fitness.zzfv.zza(str));
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setField(com.google.android.gms.fitness.data.Field field, float f) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "Builder should not be mutated after calling #build.");
            this.zza.getValue(field).setFloat(f);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setFloatValues(float... fArr) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "Builder should not be mutated after calling #build.");
            this.zza.setFloatValues(fArr);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setIntValues(int... iArr) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "Builder should not be mutated after calling #build.");
            this.zza.setIntValues(iArr);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setTimeInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "Builder should not be mutated after calling #build.");
            this.zza.setTimeInterval(j, j2, timeUnit);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setTimestamp(long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "Builder should not be mutated after calling #build.");
            this.zza.setTimestamp(j, timeUnit);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setField(com.google.android.gms.fitness.data.Field field, int i) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "Builder should not be mutated after calling #build.");
            this.zza.getValue(field).setInt(i);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setField(com.google.android.gms.fitness.data.Field field, java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "Builder should not be mutated after calling #build.");
            this.zza.getValue(field).setString(str);
            return this;
        }

        public com.google.android.gms.fitness.data.DataPoint.Builder setField(com.google.android.gms.fitness.data.Field field, java.util.Map<java.lang.String, java.lang.Float> map) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb, "Builder should not be mutated after calling #build.");
            this.zza.getValue(field).zza(map);
            return this;
        }
    }

    public DataPoint(com.google.android.gms.fitness.data.DataSource dataSource, long j, long j2, com.google.android.gms.fitness.data.Value[] valueArr, com.google.android.gms.fitness.data.DataSource dataSource2, long j3) {
        this.zza = dataSource;
        this.zze = dataSource2;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = valueArr;
        this.zzf = j3;
    }

    DataPoint(java.util.List list, com.google.android.gms.fitness.data.RawDataPoint rawDataPoint) {
        this((com.google.android.gms.fitness.data.DataSource) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzf(list, rawDataPoint.zza())), rawDataPoint.zzc(), rawDataPoint.zze(), rawDataPoint.zzf(), zzf(list, rawDataPoint.zzb()), rawDataPoint.zzd());
    }
}
