package com.google.android.gms.fitness.service;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class FitnessSensorServiceRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.service.FitnessSensorServiceRequest> CREATOR = new com.google.android.gms.fitness.service.zzc();
    public static final int UNSPECIFIED = -1;
    private final com.google.android.gms.fitness.data.DataSource zza;
    private final com.google.android.gms.fitness.data.zzv zzb;
    private final long zzc;
    private final long zzd;

    FitnessSensorServiceRequest(com.google.android.gms.fitness.data.DataSource dataSource, android.os.IBinder iBinder, long j, long j2) {
        this.zza = dataSource;
        this.zzb = com.google.android.gms.fitness.data.zzu.zzb(iBinder);
        this.zzc = j;
        this.zzd = j2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.service.FitnessSensorServiceRequest)) {
            return false;
        }
        com.google.android.gms.fitness.service.FitnessSensorServiceRequest fitnessSensorServiceRequest = (com.google.android.gms.fitness.service.FitnessSensorServiceRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, fitnessSensorServiceRequest.zza) && this.zzc == fitnessSensorServiceRequest.zzc && this.zzd == fitnessSensorServiceRequest.zzd;
    }

    public long getBatchInterval(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzd, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zza;
    }

    public com.google.android.gms.fitness.service.SensorEventDispatcher getDispatcher() {
        return new com.google.android.gms.fitness.service.zzd(this.zzb);
    }

    public long getSamplingRate(java.util.concurrent.TimeUnit timeUnit) {
        long j = this.zzc;
        if (j == -1) {
            return -1L;
        }
        return timeUnit.convert(j, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Long.valueOf(this.zzc), java.lang.Long.valueOf(this.zzd));
    }

    public java.lang.String toString() {
        return java.lang.String.format("FitnessSensorServiceRequest{%s}", this.zza);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zzb.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
