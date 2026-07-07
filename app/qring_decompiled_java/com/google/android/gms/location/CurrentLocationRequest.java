package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class CurrentLocationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.CurrentLocationRequest> CREATOR = new com.google.android.gms.location.zzt();
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final boolean zze;
    private final android.os.WorkSource zzf;

    /* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
    public static class Builder {
        private long zza;
        private int zzb;
        private int zzc;
        private long zzd;
        private boolean zze;
        private android.os.WorkSource zzf;

        public Builder() {
            this.zza = 60000L;
            this.zzb = 0;
            this.zzc = 102;
            this.zzd = Long.MAX_VALUE;
            this.zze = false;
            this.zzf = null;
        }

        public Builder(com.google.android.gms.location.CurrentLocationRequest currentLocationRequest) {
            this.zza = currentLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = currentLocationRequest.getGranularity();
            this.zzc = currentLocationRequest.getPriority();
            this.zzd = currentLocationRequest.getDurationMillis();
            this.zze = currentLocationRequest.zzb();
            this.zzf = new android.os.WorkSource(currentLocationRequest.zza());
        }

        public com.google.android.gms.location.CurrentLocationRequest build() {
            return new com.google.android.gms.location.CurrentLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, new android.os.WorkSource(this.zzf));
        }

        public com.google.android.gms.location.CurrentLocationRequest.Builder setDurationMillis(long j) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
            this.zzd = j;
            return this;
        }

        public com.google.android.gms.location.CurrentLocationRequest.Builder setGranularity(int i) {
            com.google.android.gms.location.zzbc.zza(i);
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.location.CurrentLocationRequest.Builder setMaxUpdateAgeMillis(long j) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.zza = j;
            return this;
        }

        public com.google.android.gms.location.CurrentLocationRequest.Builder setPriority(int i) {
            boolean z;
            int i2 = 105;
            if (i == 100 || i == 102 || i == 104) {
                i2 = i;
            } else {
                if (i != 105) {
                    i2 = i;
                    z = false;
                    com.google.android.gms.common.internal.Preconditions.checkArgument(z, "priority %d must be a Priority.PRIORITY_* constants", java.lang.Integer.valueOf(i));
                    this.zzc = i2;
                    return this;
                }
                i = 105;
            }
            z = true;
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "priority %d must be a Priority.PRIORITY_* constants", java.lang.Integer.valueOf(i));
            this.zzc = i2;
            return this;
        }

        public final com.google.android.gms.location.CurrentLocationRequest.Builder zza(boolean z) {
            this.zze = z;
            return this;
        }

        public final com.google.android.gms.location.CurrentLocationRequest.Builder zzb(android.os.WorkSource workSource) {
            this.zzf = workSource;
            return this;
        }
    }

    CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, android.os.WorkSource workSource) {
        this.zza = j;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j2;
        this.zze = z;
        this.zzf = workSource;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.location.CurrentLocationRequest)) {
            return false;
        }
        com.google.android.gms.location.CurrentLocationRequest currentLocationRequest = (com.google.android.gms.location.CurrentLocationRequest) obj;
        return this.zza == currentLocationRequest.zza && this.zzb == currentLocationRequest.zzb && this.zzc == currentLocationRequest.zzc && this.zzd == currentLocationRequest.zzd && this.zze == currentLocationRequest.zze && com.google.android.gms.common.internal.Objects.equal(this.zzf, currentLocationRequest.zzf);
    }

    public long getDurationMillis() {
        return this.zzd;
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int getPriority() {
        return this.zzc;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Long.valueOf(this.zzd));
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CurrentLocationRequest[");
        int i = this.zzc;
        if (i == 100) {
            str = "HIGH_ACCURACY";
        } else if (i == 102) {
            str = "BALANCED_POWER_ACCURACY";
        } else if (i == 104) {
            str = "LOW_POWER";
        } else {
            if (i != 105) {
                throw new java.lang.IllegalArgumentException();
            }
            str = "PASSIVE";
        }
        sb.append(str);
        if (this.zza != Long.MAX_VALUE) {
            sb.append(", maxAge=");
            com.google.android.gms.internal.location.zzbo.zza(this.zza, sb);
        }
        if (this.zzd != Long.MAX_VALUE) {
            sb.append(", duration=");
            sb.append(this.zzd);
            sb.append("ms");
        }
        if (this.zzb != 0) {
            sb.append(", ");
            sb.append(com.google.android.gms.location.zzbc.zzb(this.zzb));
        }
        if (this.zze) {
            sb.append(", bypass");
        }
        if (!com.google.android.gms.common.util.WorkSourceUtil.isEmpty(this.zzf)) {
            sb.append(", workSource=");
            sb.append(this.zzf);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getPriority());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, getDurationMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final android.os.WorkSource zza() {
        return this.zzf;
    }

    public final boolean zzb() {
        return this.zze;
    }
}
