package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class Bucket extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Bucket> CREATOR = new com.google.android.gms.fitness.data.zze();
    public static final int TYPE_ACTIVITY_SEGMENT = 4;
    public static final int TYPE_ACTIVITY_TYPE = 3;
    public static final int TYPE_SESSION = 2;
    public static final int TYPE_TIME = 1;
    private final long zza;
    private final long zzb;
    private final com.google.android.gms.fitness.data.Session zzc;
    private final int zzd;
    private final java.util.List zze;
    private final int zzf;

    Bucket(long j, long j2, com.google.android.gms.fitness.data.Session session, int i, java.util.List list, int i2) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = session;
        this.zzd = i;
        this.zze = list;
        this.zzf = i2;
    }

    public static java.lang.String zzb(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "bug" : "intervals" : "segment" : "type" : "session" : "time" : "none";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Bucket)) {
            return false;
        }
        com.google.android.gms.fitness.data.Bucket bucket = (com.google.android.gms.fitness.data.Bucket) obj;
        return this.zza == bucket.zza && this.zzb == bucket.zzb && this.zzd == bucket.zzd && com.google.android.gms.common.internal.Objects.equal(this.zze, bucket.zze) && this.zzf == bucket.zzf;
    }

    public java.lang.String getActivity() {
        return com.google.android.gms.internal.fitness.zzfv.zzb(this.zzd);
    }

    public int getBucketType() {
        return this.zzf;
    }

    public com.google.android.gms.fitness.data.DataSet getDataSet(com.google.android.gms.fitness.data.DataType dataType) {
        for (com.google.android.gms.fitness.data.DataSet dataSet : this.zze) {
            if (dataSet.getDataType().equals(dataType)) {
                return dataSet;
            }
        }
        return null;
    }

    public java.util.List<com.google.android.gms.fitness.data.DataSet> getDataSets() {
        return this.zze;
    }

    public long getEndTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zzb, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public com.google.android.gms.fitness.data.Session getSession() {
        return this.zzc;
    }

    public long getStartTime(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.zza, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzf));
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("startTime", java.lang.Long.valueOf(this.zza)).add("endTime", java.lang.Long.valueOf(this.zzb)).add("activity", java.lang.Integer.valueOf(this.zzd)).add("dataSets", this.zze).add("bucketType", zzb(this.zzf)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getSession(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, getDataSets(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, getBucketType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzd;
    }

    public final boolean zzc(com.google.android.gms.fitness.data.Bucket bucket) {
        return this.zza == bucket.zza && this.zzb == bucket.zzb && this.zzd == bucket.zzd && this.zzf == bucket.zzf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Bucket(com.google.android.gms.fitness.data.RawBucket r11, java.util.List r12) {
        /*
            r10 = this;
            long r1 = r11.zza
            long r3 = r11.zzb
            com.google.android.gms.fitness.data.Session r5 = r11.zzc
            int r6 = r11.zzd
            java.util.List r0 = r11.zze
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = r0.size()
            r7.<init>(r8)
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L2c
            java.lang.Object r8 = r0.next()
            com.google.android.gms.fitness.data.RawDataSet r8 = (com.google.android.gms.fitness.data.RawDataSet) r8
            com.google.android.gms.fitness.data.DataSet r9 = new com.google.android.gms.fitness.data.DataSet
            r9.<init>(r8, r12)
            r7.add(r9)
            goto L17
        L2c:
            int r8 = r11.zzf
            r0 = r10
            r0.<init>(r1, r3, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.data.Bucket.<init>(com.google.android.gms.fitness.data.RawBucket, java.util.List):void");
    }
}
