package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class RawDataPoint extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.RawDataPoint> CREATOR = new com.google.android.gms.fitness.data.zzz();
    private final long zza;
    private final long zzb;
    private final com.google.android.gms.fitness.data.Value[] zzc;
    private final int zzd;
    private final int zze;
    private final long zzf;

    public RawDataPoint(long j, long j2, com.google.android.gms.fitness.data.Value[] valueArr, int i, int i2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzd = i;
        this.zze = i2;
        this.zzf = j3;
        this.zzc = valueArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.RawDataPoint)) {
            return false;
        }
        com.google.android.gms.fitness.data.RawDataPoint rawDataPoint = (com.google.android.gms.fitness.data.RawDataPoint) obj;
        return this.zza == rawDataPoint.zza && this.zzb == rawDataPoint.zzb && java.util.Arrays.equals(this.zzc, rawDataPoint.zzc) && this.zzd == rawDataPoint.zzd && this.zze == rawDataPoint.zze && this.zzf == rawDataPoint.zzf;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb));
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "RawDataPoint{%s@[%s, %s](%d,%d)}", java.util.Arrays.toString(this.zzc), java.lang.Long.valueOf(this.zzb), java.lang.Long.valueOf(this.zza), java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zze));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 3, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc() {
        return this.zza;
    }

    public final long zzd() {
        return this.zzf;
    }

    public final long zze() {
        return this.zzb;
    }

    public final com.google.android.gms.fitness.data.Value[] zzf() {
        return this.zzc;
    }

    RawDataPoint(com.google.android.gms.fitness.data.DataPoint dataPoint, java.util.List list) {
        this.zza = dataPoint.getTimestamp(java.util.concurrent.TimeUnit.NANOSECONDS);
        this.zzb = dataPoint.getStartTime(java.util.concurrent.TimeUnit.NANOSECONDS);
        this.zzc = dataPoint.zze();
        this.zzd = com.google.android.gms.internal.fitness.zzd.zza(dataPoint.getDataSource(), list);
        this.zze = com.google.android.gms.internal.fitness.zzd.zza(dataPoint.zzb(), list);
        this.zzf = dataPoint.zza();
    }
}
