package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class SensorRequest {
    public static final int ACCURACY_MODE_DEFAULT = 2;
    public static final int ACCURACY_MODE_HIGH = 3;
    public static final int ACCURACY_MODE_LOW = 1;
    private final com.google.android.gms.fitness.data.DataSource zza;
    private final com.google.android.gms.fitness.data.DataType zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final int zzf;
    private final long zzg;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
    public static class Builder {
        private com.google.android.gms.fitness.data.DataSource zza;
        private com.google.android.gms.fitness.data.DataType zzb;
        private long zzc = -1;
        private long zzd = 0;
        private long zze = 0;
        private boolean zzf = false;
        private int zzg = 2;
        private long zzh = Long.MAX_VALUE;

        public com.google.android.gms.fitness.request.SensorRequest build() {
            com.google.android.gms.fitness.data.DataSource dataSource;
            com.google.android.gms.common.internal.Preconditions.checkState((this.zza == null && this.zzb == null) ? false : true, "Must call setDataSource() or setDataType()");
            com.google.android.gms.fitness.data.DataType dataType = this.zzb;
            com.google.android.gms.common.internal.Preconditions.checkState(dataType == null || (dataSource = this.zza) == null || dataType.equals(dataSource.getDataType()), "Specified data type is incompatible with specified data source");
            return new com.google.android.gms.fitness.request.SensorRequest(this, null);
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setAccuracyMode(int i) {
            if (i != 1 && i != 3) {
                i = 2;
            }
            this.zzg = i;
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setDataSource(com.google.android.gms.fitness.data.DataSource dataSource) {
            this.zza = dataSource;
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setDataType(com.google.android.gms.fitness.data.DataType dataType) {
            this.zzb = dataType;
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setFastestRate(int i, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i >= 0, "Cannot use a negative interval");
            this.zzf = true;
            this.zzd = timeUnit.toMicros(i);
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setMaxDeliveryLatency(int i, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i >= 0, "Cannot use a negative delivery interval");
            this.zze = timeUnit.toMicros(i);
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setSamplingRate(long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "Cannot use a negative sampling interval");
            long micros = timeUnit.toMicros(j);
            this.zzc = micros;
            if (!this.zzf) {
                this.zzd = micros / 2;
            }
            return this;
        }

        public com.google.android.gms.fitness.request.SensorRequest.Builder setTimeout(long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "Invalid time out value specified: %d", java.lang.Long.valueOf(j));
            com.google.android.gms.common.internal.Preconditions.checkArgument(timeUnit != null, "Invalid time unit specified");
            this.zzh = timeUnit.toMicros(j);
            return this;
        }
    }

    /* synthetic */ SensorRequest(com.google.android.gms.fitness.request.SensorRequest.Builder builder, com.google.android.gms.fitness.request.zzam zzamVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
        this.zzd = builder.zzd;
        this.zze = builder.zze;
        this.zzf = builder.zzg;
        this.zzg = builder.zzh;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.request.SensorRequest)) {
            return false;
        }
        com.google.android.gms.fitness.request.SensorRequest sensorRequest = (com.google.android.gms.fitness.request.SensorRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, sensorRequest.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, sensorRequest.zzb) && this.zzc == sensorRequest.zzc && this.zzd == sensorRequest.zzd && this.zze == sensorRequest.zze && this.zzf == sensorRequest.zzf && this.zzg == sensorRequest.zzg;
    }

    public int getAccuracyMode() {
        return this.zzf;
    }

    public com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zza;
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzb;
    }

    public long getFastestRate(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzd, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public long getMaxDeliveryLatency(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zze, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public long getSamplingRate(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzc, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, java.lang.Long.valueOf(this.zzc), java.lang.Long.valueOf(this.zzd), java.lang.Long.valueOf(this.zze), java.lang.Integer.valueOf(this.zzf), java.lang.Long.valueOf(this.zzg));
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataSource", this.zza).add("dataType", this.zzb).add("samplingRateMicros", java.lang.Long.valueOf(this.zzc)).add("deliveryLatencyMicros", java.lang.Long.valueOf(this.zze)).add("timeOutMicros", java.lang.Long.valueOf(this.zzg)).toString();
    }

    public final long zza() {
        return this.zzg;
    }
}
