package com.google.android.gms.fitness.result;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class DailyTotalResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.DailyTotalResult> CREATOR = new com.google.android.gms.fitness.result.zzb();
    private final com.google.android.gms.common.api.Status zza;
    private final com.google.android.gms.fitness.data.DataSet zzb;

    public DailyTotalResult(com.google.android.gms.common.api.Status status, com.google.android.gms.fitness.data.DataSet dataSet) {
        this.zza = status;
        this.zzb = dataSet;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.result.DailyTotalResult)) {
            return false;
        }
        com.google.android.gms.fitness.result.DailyTotalResult dailyTotalResult = (com.google.android.gms.fitness.result.DailyTotalResult) obj;
        return this.zza.equals(dailyTotalResult.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, dailyTotalResult.zzb);
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    public com.google.android.gms.fitness.data.DataSet getTotal() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zza).add("dataPoint", this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getTotal(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
