package com.google.android.gms.fitness.data;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class Subscription extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Subscription> CREATOR = new com.google.android.gms.fitness.data.zzag();
    private final com.google.android.gms.fitness.data.DataSource zza;
    private final com.google.android.gms.fitness.data.DataType zzb;
    private final long zzc;
    private final int zzd;
    private final int zze;

    Subscription(com.google.android.gms.fitness.data.DataSource dataSource, com.google.android.gms.fitness.data.DataType dataType, long j, int i, int i2) {
        this.zza = dataSource;
        this.zzb = dataType;
        this.zzc = j;
        this.zzd = i;
        this.zze = i2;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.data.Subscription)) {
            return false;
        }
        com.google.android.gms.fitness.data.Subscription subscription = (com.google.android.gms.fitness.data.Subscription) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, subscription.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, subscription.zzb) && this.zzc == subscription.zzc && this.zzd == subscription.zzd && this.zze == subscription.zze;
    }

    public com.google.android.gms.fitness.data.DataSource getDataSource() {
        return this.zza;
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzb;
    }

    public int hashCode() {
        com.google.android.gms.fitness.data.DataSource dataSource = this.zza;
        return com.google.android.gms.common.internal.Objects.hashCode(dataSource, dataSource, java.lang.Long.valueOf(this.zzc), java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zze));
    }

    public java.lang.String toDebugString() {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.google.android.gms.fitness.data.DataSource dataSource = this.zza;
        objArr[0] = dataSource == null ? this.zzb.getName() : dataSource.zzb();
        objArr[1] = java.lang.Integer.valueOf(this.zze);
        return java.lang.String.format(locale, "Subscription{%s}, subscriptionType{%d}", objArr);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("dataSource", this.zza).add("dataType", this.zzb).add("samplingIntervalMicros", java.lang.Long.valueOf(this.zzc)).add("accuracyMode", java.lang.Integer.valueOf(this.zzd)).add("subscriptionType", java.lang.Integer.valueOf(this.zze)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getDataType(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.fitness.data.DataType zza() {
        com.google.android.gms.fitness.data.DataType dataType = this.zzb;
        return dataType == null ? this.zza.getDataType() : dataType;
    }
}
