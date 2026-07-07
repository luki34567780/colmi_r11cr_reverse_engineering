package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class DataUpdateRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.DataUpdateRequest> CREATOR = new com.google.android.gms.fitness.request.zzu();
    private final long zza;
    private final long zzb;
    private final com.google.android.gms.fitness.data.DataSet zzc;
    private final com.google.android.gms.internal.fitness.zzcp zzd;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private long zza;
        private long zzb;
        private com.google.android.gms.fitness.data.DataSet zzc;

        public com.google.android.gms.fitness.request.DataUpdateRequest build() {
            com.google.android.gms.common.internal.Preconditions.checkNotZero(this.zza, "Must set a non-zero value for startTimeMillis/startTime");
            com.google.android.gms.common.internal.Preconditions.checkNotZero(this.zzb, "Must set a non-zero value for endTimeMillis/endTime");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc, "Must set the data set");
            for (com.google.android.gms.fitness.data.DataPoint dataPoint : this.zzc.getDataPoints()) {
                long startTime = dataPoint.getStartTime(java.util.concurrent.TimeUnit.MILLISECONDS);
                long endTime = dataPoint.getEndTime(java.util.concurrent.TimeUnit.MILLISECONDS);
                com.google.android.gms.common.internal.Preconditions.checkState(startTime <= endTime && (startTime == 0 || startTime >= this.zza) && ((startTime == 0 || startTime <= this.zzb) && endTime <= this.zzb && endTime >= this.zza), "Data Point's startTimeMillis %d, endTimeMillis %d should lie between timeRange provided in the request. StartTimeMillis %d, EndTimeMillis: %d", java.lang.Long.valueOf(startTime), java.lang.Long.valueOf(endTime), java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb));
            }
            return new com.google.android.gms.fitness.request.DataUpdateRequest(this.zza, this.zzb, this.zzc, null);
        }

        public com.google.android.gms.fitness.request.DataUpdateRequest.Builder setDataSet(com.google.android.gms.fitness.data.DataSet dataSet) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(dataSet, "Must set the data set");
            this.zzc = dataSet;
            return this;
        }

        public com.google.android.gms.fitness.request.DataUpdateRequest.Builder setTimeInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "Invalid start time :%d", java.lang.Long.valueOf(j));
            com.google.android.gms.common.internal.Preconditions.checkArgument(j2 >= j, "Invalid end time :%d", java.lang.Long.valueOf(j2));
            this.zza = timeUnit.toMillis(j);
            this.zzb = timeUnit.toMillis(j2);
            return this;
        }
    }

    public DataUpdateRequest(long j, long j2, com.google.android.gms.fitness.data.DataSet dataSet, android.os.IBinder iBinder) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = dataSet;
        this.zzd = iBinder == null ? null : com.google.android.gms.internal.fitness.zzco.zzb(iBinder);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.request.DataUpdateRequest)) {
            return false;
        }
        com.google.android.gms.fitness.request.DataUpdateRequest dataUpdateRequest = (com.google.android.gms.fitness.request.DataUpdateRequest) obj;
        return this.zza == dataUpdateRequest.zza && this.zzb == dataUpdateRequest.zzb && com.google.android.gms.common.internal.Objects.equal(this.zzc, dataUpdateRequest.zzc);
    }

    public com.google.android.gms.fitness.data.DataSet getDataSet() {
        return this.zzc;
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzb, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zza, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), this.zzc);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("startTimeMillis", java.lang.Long.valueOf(this.zza)).add("endTimeMillis", java.lang.Long.valueOf(this.zzb)).add("dataSet", this.zzc).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getDataSet(), i, false);
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzd;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, zzcpVar == null ? null : zzcpVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zza;
    }

    public DataUpdateRequest(com.google.android.gms.fitness.request.DataUpdateRequest dataUpdateRequest, android.os.IBinder iBinder) {
        this(dataUpdateRequest.zza, dataUpdateRequest.zzb, dataUpdateRequest.getDataSet(), iBinder);
    }
}
