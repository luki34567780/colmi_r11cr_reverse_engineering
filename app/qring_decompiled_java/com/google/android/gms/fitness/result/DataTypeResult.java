package com.google.android.gms.fitness.result;

/* compiled from: com.google.android.gms:play-services-fitness@@21.1.0 */
@java.lang.Deprecated
/* loaded from: /tmp/dex/classes2.dex */
public class DataTypeResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fitness.result.DataTypeResult> CREATOR = new com.google.android.gms.fitness.result.zze();
    private final com.google.android.gms.common.api.Status zza;
    private final com.google.android.gms.fitness.data.DataType zzb;

    public DataTypeResult(com.google.android.gms.common.api.Status status, com.google.android.gms.fitness.data.DataType dataType) {
        this.zza = status;
        this.zzb = dataType;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.fitness.result.DataTypeResult)) {
            return false;
        }
        com.google.android.gms.fitness.result.DataTypeResult dataTypeResult = (com.google.android.gms.fitness.result.DataTypeResult) obj;
        return this.zza.equals(dataTypeResult.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, dataTypeResult.zzb);
    }

    public com.google.android.gms.fitness.data.DataType getDataType() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("status", this.zza).add("dataType", this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getDataType(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
