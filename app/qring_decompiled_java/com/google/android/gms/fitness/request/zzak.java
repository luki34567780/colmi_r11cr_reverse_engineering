package com.google.android.gms.fitness.request;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzak extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.request.zzak> CREATOR = new com.google.android.gms.fitness.request.zzal();
    private final com.google.android.gms.fitness.data.DataSource zza;
    private final com.google.android.gms.fitness.data.DataType zzb;
    private final com.google.android.gms.fitness.data.zzv zzc;
    private final long zzd;
    private final long zze;
    private final android.app.PendingIntent zzf;
    private final long zzg;
    private final int zzh;
    private final long zzi;
    private final java.util.List zzj;
    private final com.google.android.gms.internal.fitness.zzcp zzk;

    zzak(com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.DataType dataType, android.os.IBinder iBinder, long j, long j2, android.app.PendingIntent pendingIntent, long j3, int i, long j4, android.os.IBinder iBinder2) {
        this.zza = dataSource;
        this.zzb = dataType;
        this.zzc = iBinder == null ? null : com.google.android.gms.fitness.data.zzu.zzb(iBinder);
        this.zzd = j;
        this.zzg = j3;
        this.zze = j2;
        this.zzf = pendingIntent;
        this.zzh = i;
        this.zzj = java.util.Collections.emptyList();
        this.zzi = j4;
        this.zzk = iBinder2 != null ? com.google.android.gms.internal.fitness.zzco.zzb(iBinder2) : null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.request.zzak)) {
            return false;
        }
        com.google.android.gms.fitness.request.zzak zzakVar = (com.google.android.gms.fitness.request.zzak) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, zzakVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzakVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzakVar.zzc) && this.zzd == zzakVar.zzd && this.zzg == zzakVar.zzg && this.zze == zzakVar.zze && this.zzh == zzakVar.zzh;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, java.lang.Long.valueOf(this.zzd), java.lang.Long.valueOf(this.zzg), java.lang.Long.valueOf(this.zze), java.lang.Integer.valueOf(this.zzh));
    }

    public final java.lang.String toString() {
        return java.lang.String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", this.zzb, this.zza, java.lang.Long.valueOf(this.zzd), java.lang.Long.valueOf(this.zzg), java.lang.Long.valueOf(this.zze));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.fitness.data.zzv zzvVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, zzvVar == null ? null : zzvVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 9, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 10, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 12, this.zzi);
        com.google.android.gms.internal.fitness.zzcp zzcpVar = this.zzk;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 13, zzcpVar != null ? zzcpVar.asBinder() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzak(com.google.android.gms.fitness.request.SensorRequest sensorRequest, com.google.android.gms.fitness.data.zzv zzvVar, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.fitness.zzcp zzcpVar) {
        com.google.android.gms.fitness.data.DataSource dataSource = sensorRequest.getDataSource();
        com.google.android.gms.fitness.data.DataType dataType = sensorRequest.getDataType();
        long samplingRate = sensorRequest.getSamplingRate(java.util.concurrent.TimeUnit.MICROSECONDS);
        long fastestRate = sensorRequest.getFastestRate(java.util.concurrent.TimeUnit.MICROSECONDS);
        long maxDeliveryLatency = sensorRequest.getMaxDeliveryLatency(java.util.concurrent.TimeUnit.MICROSECONDS);
        int accuracyMode = sensorRequest.getAccuracyMode();
        java.util.List emptyList = java.util.Collections.emptyList();
        long zza = sensorRequest.zza();
        this.zza = dataSource;
        this.zzb = dataType;
        this.zzc = zzvVar;
        this.zzf = pendingIntent;
        this.zzd = samplingRate;
        this.zzg = fastestRate;
        this.zze = maxDeliveryLatency;
        this.zzh = accuracyMode;
        this.zzj = emptyList;
        this.zzi = zza;
        this.zzk = zzcpVar;
    }
}
