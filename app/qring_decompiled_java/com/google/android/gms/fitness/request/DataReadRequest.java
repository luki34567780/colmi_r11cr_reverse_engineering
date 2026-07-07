package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class DataReadRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataReadRequest> CREATOR = new com.google.android.gms.fitness.request.zzm();
    public static final int NO_LIMIT = 0;
    private final java.util.List zza;
    private final java.util.List zzb;
    private final long zzc;
    private final long zzd;
    private final java.util.List zze;
    private final java.util.List zzf;
    private final int zzg;
    private final long zzh;
    private final com.google.android.gms.fitness.data.DataSource zzi;
    private final int zzj;
    private final boolean zzk;
    private final boolean zzl;
    private final com.google.android.gms.internal.fitness.zzbn zzm;
    private final java.util.List zzn;
    private final java.util.List zzo;

    public DataReadRequest(com.google.android.gms.fitness.request.DataReadRequest dataReadRequest, com.google.android.gms.internal.fitness.zzbn zzbnVar) {
        this(dataReadRequest.zza, dataReadRequest.zzb, dataReadRequest.zzc, dataReadRequest.zzd, dataReadRequest.zze, dataReadRequest.zzf, dataReadRequest.zzg, dataReadRequest.zzh, dataReadRequest.zzi, dataReadRequest.zzj, dataReadRequest.zzk, dataReadRequest.zzl, zzbnVar, dataReadRequest.zzn, dataReadRequest.zzo);
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (!(obj instanceof com.google.android.gms.fitness.request.DataReadRequest)) {
                return false;
            }
            com.google.android.gms.fitness.request.DataReadRequest dataReadRequest = (com.google.android.gms.fitness.request.DataReadRequest) obj;
            if (!this.zza.equals(dataReadRequest.zza) || !this.zzb.equals(dataReadRequest.zzb) || this.zzc != dataReadRequest.zzc || this.zzd != dataReadRequest.zzd || this.zzg != dataReadRequest.zzg || !this.zzf.equals(dataReadRequest.zzf) || !this.zze.equals(dataReadRequest.zze) || !com.google.android.gms.common.internal.Objects.equal(this.zzi, dataReadRequest.zzi) || this.zzh != dataReadRequest.zzh || this.zzl != dataReadRequest.zzl || this.zzj != dataReadRequest.zzj || this.zzk != dataReadRequest.zzk || !com.google.android.gms.common.internal.Objects.equal(this.zzm, dataReadRequest.zzm)) {
                return false;
            }
        }
        return true;
    }

    public com.google.android.gms.fitness.data.DataSource getActivityDataSource() {
        return this.zzi;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSource> getAggregatedDataSources() {
        return this.zzf;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getAggregatedDataTypes() {
        return this.zze;
    }

    public long getBucketDuration(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzh, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public int getBucketType() {
        return this.zzg;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSource> getDataSources() {
        return this.zzb;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataType> getDataTypes() {
        return this.zza;
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzd, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public int getLimit() {
        return this.zzj;
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzc, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzg), java.lang.Long.valueOf(this.zzc), java.lang.Long.valueOf(this.zzd));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataReadRequest{");
        if (!this.zza.isEmpty()) {
            java.util.Iterator it = this.zza.iterator();
            while (it.hasNext()) {
                sb.append(((com.google.android.gms.fitness.data.DataType) it.next()).zzc());
                sb.append(" ");
            }
        }
        if (!this.zzb.isEmpty()) {
            java.util.Iterator it2 = this.zzb.iterator();
            while (it2.hasNext()) {
                sb.append(((com.google.android.gms.fitness.data.DataSource) it2.next()).zzb());
                sb.append(" ");
            }
        }
        if (this.zzg != 0) {
            sb.append("bucket by ");
            sb.append(com.google.android.gms.fitness.data.Bucket.zzb(this.zzg));
            if (this.zzh > 0) {
                sb.append(" >");
                sb.append(this.zzh);
                sb.append("ms");
            }
            sb.append(": ");
        }
        if (!this.zze.isEmpty()) {
            java.util.Iterator it3 = this.zze.iterator();
            while (it3.hasNext()) {
                sb.append(((com.google.android.gms.fitness.data.DataType) it3.next()).zzc());
                sb.append(" ");
            }
        }
        if (!this.zzf.isEmpty()) {
            java.util.Iterator it4 = this.zzf.iterator();
            while (it4.hasNext()) {
                sb.append(((com.google.android.gms.fitness.data.DataSource) it4.next()).zzb());
                sb.append(" ");
            }
        }
        sb.append(java.lang.String.format(java.util.Locale.US, "(%tF %tT - %tF %tT)", java.lang.Long.valueOf(this.zzc), java.lang.Long.valueOf(this.zzc), java.lang.Long.valueOf(this.zzd), java.lang.Long.valueOf(this.zzd)));
        if (this.zzi != null) {
            sb.append("activities: ");
            sb.append(this.zzi.zzb());
        }
        if (this.zzl) {
            sb.append(" +server");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, getDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getDataSources(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, getAggregatedDataTypes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 6, getAggregatedDataSources(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, getBucketType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, getActivityDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 10, getLimit());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        com.google.android.gms.internal.fitness.zzbn zzbnVar = this.zzm;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 14, zzbnVar == null ? null : zzbnVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongList(parcel, 18, this.zzn, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongList(parcel, 19, this.zzo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    DataReadRequest(java.util.List list, java.util.List list2, long j, long j2, java.util.List list3, java.util.List list4, int i, long j3, com.google.android.gms.fitness.data.DataSource dataSource, int i2, boolean z, boolean z2, android.os.IBinder iBinder, java.util.List list5, java.util.List list6) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = list3;
        this.zzf = list4;
        this.zzg = i;
        this.zzh = j3;
        this.zzi = dataSource;
        this.zzj = i2;
        this.zzk = z;
        this.zzl = z2;
        this.zzm = iBinder == null ? null : com.google.android.gms.internal.fitness.zzbm.zzb(iBinder);
        java.util.List emptyList = list5 == null ? java.util.Collections.emptyList() : list5;
        this.zzn = emptyList;
        java.util.List emptyList2 = list6 == null ? java.util.Collections.emptyList() : list6;
        this.zzo = emptyList2;
        com.google.android.gms.common.internal.Preconditions.checkArgument(emptyList.size() == emptyList2.size(), "Unequal number of interval start and end times.");
    }

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private com.google.android.gms.fitness.data.DataSource zze;
        private long zzf;
        private long zzg;
        private final java.util.List zza = new java.util.ArrayList();
        private final java.util.List zzb = new java.util.ArrayList();
        private final java.util.List zzc = new java.util.ArrayList();
        private final java.util.List zzd = new java.util.ArrayList();
        private final java.util.List zzh = new java.util.ArrayList();
        private final java.util.List zzi = new java.util.ArrayList();
        private int zzj = 0;
        private long zzk = 0;
        private int zzl = 0;
        private boolean zzm = false;

        public com.google.android.gms.fitness.request.DataReadRequest.Builder aggregate(com.google.android.gms.fitness.data.DataSource dataSource) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "Attempting to add a null data source");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb.contains(dataSource), "Cannot add the same data source for aggregated and detailed");
            com.google.android.gms.fitness.data.DataType dataType = dataSource.getDataType();
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataType.getAggregateType() != null, "Unsupported input data type specified for aggregation: %s", dataType);
            if (!this.zzd.contains(dataSource)) {
                this.zzd.add(dataSource);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder bucketByActivitySegment(int i, java.util.concurrent.TimeUnit timeUnit) {
            int i2 = this.zzj;
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", java.lang.Integer.valueOf(i2));
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for an activity segment: %d", java.lang.Integer.valueOf(i));
            this.zzj = 4;
            this.zzk = timeUnit.toMillis(i);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder bucketByActivityType(int i, java.util.concurrent.TimeUnit timeUnit) {
            int i2 = this.zzj;
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", java.lang.Integer.valueOf(i2));
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for an activity segment: %d", java.lang.Integer.valueOf(i));
            this.zzj = 3;
            this.zzk = timeUnit.toMillis(i);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder bucketBySession(int i, java.util.concurrent.TimeUnit timeUnit) {
            int i2 = this.zzj;
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", java.lang.Integer.valueOf(i2));
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for a session: %d", java.lang.Integer.valueOf(i));
            this.zzj = 2;
            this.zzk = timeUnit.toMillis(i);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder bucketByTime(int i, java.util.concurrent.TimeUnit timeUnit) {
            int i2 = this.zzj;
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", java.lang.Integer.valueOf(i2));
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration: %d", java.lang.Integer.valueOf(i));
            this.zzj = 1;
            this.zzk = timeUnit.toMillis(i);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState((this.zzb.isEmpty() && this.zza.isEmpty() && this.zzd.isEmpty() && this.zzc.isEmpty()) ? false : true, "Must add at least one data source (aggregated or detailed)");
            long j = this.zzf;
            com.google.android.gms.common.internal.Preconditions.checkState(j > 0, "Invalid start time: %s", java.lang.Long.valueOf(j));
            long j2 = this.zzg;
            com.google.android.gms.common.internal.Preconditions.checkState(j2 > 0 && j2 > this.zzf, "Invalid end time: %s", java.lang.Long.valueOf(j2));
            boolean z = this.zzd.isEmpty() && this.zzc.isEmpty();
            if (this.zzj == 0) {
                com.google.android.gms.common.internal.Preconditions.checkState(z, "Must specify a valid bucketing strategy while requesting aggregation");
            }
            if (!z) {
                com.google.android.gms.common.internal.Preconditions.checkState(this.zzj != 0, "Must specify a valid bucketing strategy while requesting aggregation");
            }
            return new com.google.android.gms.fitness.request.DataReadRequest(this.zza, this.zzb, this.zzf, this.zzg, this.zzc, this.zzd, this.zzj, this.zzk, this.zze, this.zzl, false, this.zzm, (com.google.android.gms.internal.fitness.zzbn) null, this.zzh, this.zzi);
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder enableServerQueries() {
            this.zzm = true;
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder read(com.google.android.gms.fitness.data.DataSource dataSource) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "Attempting to add a null data source");
            com.google.android.gms.common.internal.Preconditions.checkArgument(!this.zzd.contains(dataSource), "Cannot add the same data source as aggregated and detailed");
            if (!this.zzb.contains(dataSource)) {
                this.zzb.add(dataSource);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder setLimit(int i) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Invalid limit %d is specified", java.lang.Integer.valueOf(i));
            this.zzl = i;
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder setTimeRange(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            this.zzf = timeUnit.toMillis(j);
            this.zzg = timeUnit.toMillis(j2);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder bucketByActivitySegment(int i, java.util.concurrent.TimeUnit timeUnit, com.google.android.gms.fitness.data.DataSource dataSource) {
            int i2 = this.zzj;
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", java.lang.Integer.valueOf(i2));
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for an activity segment: %d", java.lang.Integer.valueOf(i));
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource != null, "Invalid activity data source specified");
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource.getDataType().equals(com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", dataSource);
            this.zze = dataSource;
            this.zzj = 4;
            this.zzk = timeUnit.toMillis(i);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder bucketByActivityType(int i, java.util.concurrent.TimeUnit timeUnit, com.google.android.gms.fitness.data.DataSource dataSource) {
            int i2 = this.zzj;
            com.google.android.gms.common.internal.Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", java.lang.Integer.valueOf(i2));
            com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for an activity segment: %d", java.lang.Integer.valueOf(i));
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource != null, "Invalid activity data source specified");
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource.getDataType().equals(com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", dataSource);
            this.zze = dataSource;
            this.zzj = 3;
            this.zzk = timeUnit.toMillis(i);
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder read(com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzc.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            if (!this.zza.contains(dataType)) {
                this.zza.add(dataType);
            }
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.gms.fitness.request.DataReadRequest.Builder aggregate(com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSource, "Attempting to add a null data source");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzb.contains(dataSource), "Cannot add the same data source for aggregated and detailed");
            com.google.android.gms.fitness.data.DataType dataType2 = dataSource.getDataType();
            com.google.android.gms.fitness.data.DataType aggregateType = dataType2.getAggregateType();
            if (aggregateType == null) {
                throw new java.lang.IllegalArgumentException("Unsupported input data type specified for aggregation: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(dataType2))));
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(aggregateType.equals(dataType), "Invalid output aggregate data type specified: %s -> %s", dataType2, dataType);
            if (!this.zzd.contains(dataSource)) {
                this.zzd.add(dataSource);
            }
            return this;
        }

        public com.google.android.gms.fitness.request.DataReadRequest.Builder aggregate(com.google.android.gms.fitness.data.DataType dataType) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zza.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataType.getAggregateType() != null, "Unsupported input data type specified for aggregation: %s", dataType);
            if (!this.zzc.contains(dataType)) {
                this.zzc.add(dataType);
            }
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.gms.fitness.request.DataReadRequest.Builder aggregate(com.google.android.gms.fitness.data.DataType dataType, com.google.android.gms.fitness.data.DataType dataType2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zza.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            com.google.android.gms.fitness.data.DataType aggregateType = dataType.getAggregateType();
            if (aggregateType == null) {
                throw new java.lang.IllegalArgumentException("Unsupported input data type specified for aggregation: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(dataType))));
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(aggregateType.equals(dataType2), "Invalid output aggregate data type specified: %s -> %s", dataType, dataType2);
            if (!this.zzc.contains(dataType)) {
                this.zzc.add(dataType);
            }
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r17v2 */
    public DataReadRequest(java.util.List list, java.util.List list2, long j, long j2, java.util.List list3, java.util.List list4, int i, long j3, com.google.android.gms.fitness.data.DataSource dataSource, int i2, boolean z, boolean z2, com.google.android.gms.internal.fitness.zzbn zzbnVar, java.util.List list5, java.util.List list6) {
        this(list, list2, j, j2, list3, list4, i, j3, dataSource, i2, z, z2, (android.os.IBinder) (zzbnVar == null ? 0 : zzbnVar), list5, list6);
    }
}
