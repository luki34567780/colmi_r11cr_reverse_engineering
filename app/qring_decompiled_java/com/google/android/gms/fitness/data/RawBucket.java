package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class RawBucket extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.RawBucket> CREATOR = new com.google.android.gms.fitness.data.zzy();
    public final long zza;
    public final long zzb;
    public final com.google.android.gms.fitness.data.Session zzc;
    public final int zzd;
    public final java.util.List zze;
    public final int zzf;

    public RawBucket(long j, long j2, com.google.android.gms.fitness.data.Session session, int i, java.util.List list, int i2) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = session;
        this.zzd = i;
        this.zze = list;
        this.zzf = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.RawBucket)) {
            return false;
        }
        com.google.android.gms.fitness.data.RawBucket rawBucket = (com.google.android.gms.fitness.data.RawBucket) obj;
        return this.zza == rawBucket.zza && this.zzb == rawBucket.zzb && this.zzd == rawBucket.zzd && com.google.android.gms.common.internal.Objects.equal(this.zze, rawBucket.zze) && this.zzf == rawBucket.zzf;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzf));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("startTime", java.lang.Long.valueOf(this.zza)).add("endTime", java.lang.Long.valueOf(this.zzb)).add("activity", java.lang.Integer.valueOf(this.zzd)).add("dataSets", this.zze).add("bucketType", java.lang.Integer.valueOf(this.zzf)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public RawBucket(com.google.android.gms.fitness.data.Bucket bucket, java.util.List list) {
        this.zza = bucket.getStartTime(java.util.concurrent.TimeUnit.MILLISECONDS);
        this.zzb = bucket.getEndTime(java.util.concurrent.TimeUnit.MILLISECONDS);
        this.zzc = bucket.getSession();
        this.zzd = bucket.zza();
        this.zzf = bucket.getBucketType();
        java.util.List<com.google.android.gms.fitness.data.DataSet> dataSets = bucket.getDataSets();
        this.zze = new java.util.ArrayList(dataSets.size());
        java.util.Iterator<com.google.android.gms.fitness.data.DataSet> it = dataSets.iterator();
        while (it.hasNext()) {
            this.zze.add(new com.google.android.gms.fitness.data.RawDataSet(it.next(), list));
        }
    }
}
