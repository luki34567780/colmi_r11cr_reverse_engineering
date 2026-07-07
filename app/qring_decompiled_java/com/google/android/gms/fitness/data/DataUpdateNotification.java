package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class DataUpdateNotification extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final java.lang.String ACTION = "com.google.android.gms.fitness.DATA_UPDATE_NOTIFICATION";
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.DataUpdateNotification> CREATOR = new com.google.android.gms.fitness.data.zzm();
    public static final java.lang.String EXTRA_DATA_UPDATE_NOTIFICATION = "vnd.google.fitness.data_udpate_notification";
    public static final int OPERATION_DELETE = 2;
    public static final int OPERATION_INSERT = 1;
    public static final int OPERATION_UPDATE = 3;
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final com.google.android.gms.fitness.data.DataSource zzd;
    private final com.google.android.gms.fitness.data.DataType zze;

    public DataUpdateNotification(long j, long j2, int i, com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.DataType dataType) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
        this.zzd = dataSource;
        this.zze = dataType;
    }

    public static com.google.android.gms.fitness.data.DataUpdateNotification getDataUpdateNotification(android.content.Intent intent) {
        return (com.google.android.gms.fitness.data.DataUpdateNotification) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, EXTRA_DATA_UPDATE_NOTIFICATION, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.DataUpdateNotification)) {
            return false;
        }
        com.google.android.gms.fitness.data.DataUpdateNotification dataUpdateNotification = (com.google.android.gms.fitness.data.DataUpdateNotification) obj;
        return this.zza == dataUpdateNotification.zza && this.zzb == dataUpdateNotification.zzb && this.zzc == dataUpdateNotification.zzc && com.google.android.gms.common.internal.Objects.equal(this.zzd, dataUpdateNotification.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, dataUpdateNotification.zze);
    }

    public com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zzd;
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zze;
    }

    public int getOperationType() {
        return this.zzc;
    }

    public long getUpdateEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzb, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public long getUpdateStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zza, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), this.zzd, this.zze);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("updateStartTimeNanos", java.lang.Long.valueOf(this.zza)).add("updateEndTimeNanos", java.lang.Long.valueOf(this.zzb)).add("operationType", java.lang.Integer.valueOf(this.zzc)).add("dataSource", this.zzd).add("dataType", this.zze).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getOperationType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, getDataType(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
