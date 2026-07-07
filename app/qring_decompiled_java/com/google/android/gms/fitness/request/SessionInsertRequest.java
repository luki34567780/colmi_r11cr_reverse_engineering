package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SessionInsertRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private final com.google.android.gms.fitness.data.Session zzb;
    private final java.util.List zzc;
    private final java.util.List zzd;
    private final com.google.android.gms.internal.fitness.zzcp zze;
    private static final java.util.concurrent.TimeUnit zza = java.util.concurrent.TimeUnit.MILLISECONDS;
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.SessionInsertRequest> CREATOR = new com.google.android.gms.fitness.request.zzap();

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private com.google.android.gms.fitness.data.Session zza;
        private final java.util.List zzb = new java.util.ArrayList();
        private final java.util.List zzc = new java.util.ArrayList();
        private final java.util.List zzd = new java.util.ArrayList();

        private final void zza(com.google.android.gms.fitness.data.DataPoint dataPoint) {
            long startTime = this.zza.getStartTime(java.util.concurrent.TimeUnit.NANOSECONDS);
            long endTime = this.zza.getEndTime(java.util.concurrent.TimeUnit.NANOSECONDS);
            long startTime2 = dataPoint.getStartTime(java.util.concurrent.TimeUnit.NANOSECONDS);
            long endTime2 = dataPoint.getEndTime(java.util.concurrent.TimeUnit.NANOSECONDS);
            if (startTime2 == 0 || endTime2 == 0) {
                return;
            }
            if (endTime2 > endTime) {
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
                java.util.concurrent.TimeUnit timeUnit2 = com.google.android.gms.fitness.request.SessionInsertRequest.zza;
                endTime2 = timeUnit.convert(timeUnit2.convert(endTime2, timeUnit), timeUnit2);
            }
            long j = endTime2;
            com.google.android.gms.common.internal.Preconditions.checkState(startTime2 >= startTime && j <= endTime, "Data point %s has start and end times outside session interval [%d, %d]", dataPoint, java.lang.Long.valueOf(startTime), java.lang.Long.valueOf(endTime));
            if (j != dataPoint.getEndTime(java.util.concurrent.TimeUnit.NANOSECONDS)) {
                android.util.Log.w("Fitness", java.lang.String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", java.lang.Long.valueOf(dataPoint.getEndTime(java.util.concurrent.TimeUnit.NANOSECONDS)), java.lang.Long.valueOf(j), com.google.android.gms.fitness.request.SessionInsertRequest.zza));
                dataPoint.setTimeInterval(startTime2, j, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
        }

        private final void zzb(com.google.android.gms.fitness.data.DataPoint dataPoint) {
            long startTime = this.zza.getStartTime(java.util.concurrent.TimeUnit.NANOSECONDS);
            long endTime = this.zza.getEndTime(java.util.concurrent.TimeUnit.NANOSECONDS);
            long timestamp = dataPoint.getTimestamp(java.util.concurrent.TimeUnit.NANOSECONDS);
            if (timestamp != 0) {
                if (timestamp < startTime || timestamp > endTime) {
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
                    java.util.concurrent.TimeUnit timeUnit2 = com.google.android.gms.fitness.request.SessionInsertRequest.zza;
                    timestamp = timeUnit.convert(timeUnit2.convert(timestamp, timeUnit), timeUnit2);
                }
                com.google.android.gms.common.internal.Preconditions.checkState(timestamp >= startTime && timestamp <= endTime, "Data point %s has time stamp outside session interval [%d, %d]", dataPoint, java.lang.Long.valueOf(startTime), java.lang.Long.valueOf(endTime));
                if (dataPoint.getTimestamp(java.util.concurrent.TimeUnit.NANOSECONDS) != timestamp) {
                    android.util.Log.w("Fitness", java.lang.String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", java.lang.Long.valueOf(dataPoint.getTimestamp(java.util.concurrent.TimeUnit.NANOSECONDS)), java.lang.Long.valueOf(timestamp), com.google.android.gms.fitness.request.SessionInsertRequest.zza));
                    dataPoint.setTimestamp(timestamp, java.util.concurrent.TimeUnit.NANOSECONDS);
                }
            }
        }

        public com.google.android.gms.fitness.request.SessionInsertRequest.Builder addAggregateDataPoint(com.google.android.gms.fitness.data.DataPoint dataPoint) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataPoint != null, "Must specify a valid aggregate data point.");
            com.google.android.gms.fitness.data.DataSource dataSource = dataPoint.getDataSource();
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzd.contains(dataSource), "Data set/Aggregate data point for this data source %s is already added.", dataSource);
            com.google.android.gms.fitness.data.DataSet.zzc(dataPoint);
            this.zzd.add(dataSource);
            this.zzc.add(dataPoint);
            return this;
        }

        public com.google.android.gms.fitness.request.SessionInsertRequest.Builder addDataSet(com.google.android.gms.fitness.data.DataSet dataSet) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSet != null, "Must specify a valid data set.");
            com.google.android.gms.fitness.data.DataSource dataSource = dataSet.getDataSource();
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zzd.contains(dataSource), "Data set for this data source %s is already added.", dataSource);
            com.google.android.gms.common.internal.Preconditions.checkArgument(!dataSet.getDataPoints().isEmpty(), "No data points specified in the input data set.");
            this.zzd.add(dataSource);
            this.zzb.add(dataSet);
            return this;
        }

        public com.google.android.gms.fitness.request.SessionInsertRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zza != null, "Must specify a valid session.");
            com.google.android.gms.common.internal.Preconditions.checkState(this.zza.getEndTime(java.util.concurrent.TimeUnit.MILLISECONDS) != 0, "Must specify a valid end time, cannot insert a continuing session.");
            java.util.Iterator it = this.zzb.iterator();
            while (it.hasNext()) {
                for (com.google.android.gms.fitness.data.DataPoint dataPoint : ((com.google.android.gms.fitness.data.DataSet) it.next()).getDataPoints()) {
                    zzb(dataPoint);
                    zza(dataPoint);
                }
            }
            for (com.google.android.gms.fitness.data.DataPoint dataPoint2 : this.zzc) {
                zzb(dataPoint2);
                zza(dataPoint2);
            }
            return new com.google.android.gms.fitness.request.SessionInsertRequest(this.zza, this.zzb, this.zzc, (com.google.android.gms.internal.fitness.zzcp) null);
        }

        public com.google.android.gms.fitness.request.SessionInsertRequest.Builder setSession(com.google.android.gms.fitness.data.Session session) {
            this.zza = session;
            return this;
        }
    }

    SessionInsertRequest(com.google.android.gms.fitness.data.Session session, java.util.List list, java.util.List list2, android.os.IBinder iBinder) {
        this.zzb = session;
        this.zzc = java.util.Collections.unmodifiableList(list);
        this.zzd = java.util.Collections.unmodifiableList(list2);
        this.zze = iBinder == null ? null : com.google.android.gms.internal.fitness.zzco.zzb(iBinder);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (!(obj instanceof com.google.android.gms.fitness.request.SessionInsertRequest)) {
                return false;
            }
            com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest = (com.google.android.gms.fitness.request.SessionInsertRequest) obj;
            if (!com.google.android.gms.common.internal.Objects.equal(this.zzb, sessionInsertRequest.zzb) || !com.google.android.gms.common.internal.Objects.equal(this.zzc, sessionInsertRequest.zzc) || !com.google.android.gms.common.internal.Objects.equal(this.zzd, sessionInsertRequest.zzd)) {
                return false;
            }
        }
        return true;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataPoint> getAggregateDataPoints() {
        return this.zzd;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSets() {
        return this.zzc;
    }

    public com.google.android.gms.fitness.data.Session getSession() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zzc, this.zzd);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("session", this.zzb).add("dataSets", this.zzc).add("aggregateDataPoints", this.zzd).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getSession(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getDataSets(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, getAggregateDataPoints(), false);
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zze;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzcpVar == null ? null : zzcpVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public SessionInsertRequest(com.google.android.gms.fitness.data.Session session, java.util.List list, java.util.List list2, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        this.zzb = session;
        this.zzc = java.util.Collections.unmodifiableList(list);
        this.zzd = java.util.Collections.unmodifiableList(list2);
        this.zze = zzcpVar;
    }

    public SessionInsertRequest(com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        this(sessionInsertRequest.zzb, sessionInsertRequest.zzc, sessionInsertRequest.zzd, zzcpVar);
    }
}
