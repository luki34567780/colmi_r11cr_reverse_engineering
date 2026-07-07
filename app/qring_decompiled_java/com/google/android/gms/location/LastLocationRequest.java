package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class LastLocationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LastLocationRequest> CREATOR = new com.google.android.gms.location.zzbm();
    private final long zza;
    private final int zzb;
    private final boolean zzc;

    /* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
    public static class Builder {
        private long zza;
        private int zzb;
        private boolean zzc;

        public Builder() {
            this.zza = Long.MAX_VALUE;
            this.zzb = 0;
            this.zzc = false;
        }

        public Builder(com.google.android.gms.location.LastLocationRequest lastLocationRequest) {
            this.zza = lastLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = lastLocationRequest.getGranularity();
            this.zzc = lastLocationRequest.zza();
        }

        public com.google.android.gms.location.LastLocationRequest build() {
            return new com.google.android.gms.location.LastLocationRequest(this.zza, this.zzb, this.zzc);
        }

        public com.google.android.gms.location.LastLocationRequest.Builder setGranularity(int i) {
            com.google.android.gms.location.zzbc.zza(i);
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.location.LastLocationRequest.Builder setMaxUpdateAgeMillis(long j) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "maxUpdateAgeMillis must be greater than 0");
            this.zza = j;
            return this;
        }
    }

    LastLocationRequest(long j, int i, boolean z) {
        this.zza = j;
        this.zzb = i;
        this.zzc = z;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.LastLocationRequest)) {
            return false;
        }
        com.google.android.gms.location.LastLocationRequest lastLocationRequest = (com.google.android.gms.location.LastLocationRequest) obj;
        return this.zza == lastLocationRequest.zza && this.zzb == lastLocationRequest.zzb && this.zzc == lastLocationRequest.zzc;
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Boolean.valueOf(this.zzc));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.zza != Long.MAX_VALUE) {
            sb.append("maxAge=");
            com.google.android.gms.internal.location.zzbo.zza(this.zza, sb);
        }
        if (this.zzb != 0) {
            sb.append(", ");
            sb.append(com.google.android.gms.location.zzbc.zzb(this.zzb));
        }
        if (this.zzc) {
            sb.append(", bypass");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean zza() {
        return this.zzc;
    }
}
