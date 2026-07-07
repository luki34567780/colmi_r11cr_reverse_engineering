package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzbf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    final com.google.android.gms.location.LocationRequest zzb;
    final java.util.List zzc;
    final java.lang.String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final java.lang.String zzh;
    final boolean zzi;
    boolean zzj;
    final java.lang.String zzk;
    long zzl;
    static final java.util.List zza = java.util.Collections.emptyList();
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzbf> CREATOR = new com.google.android.gms.internal.location.zzbg();

    zzbf(com.google.android.gms.location.LocationRequest locationRequest, java.util.List list, java.lang.String str, boolean z, boolean z2, boolean z3, java.lang.String str2, boolean z4, boolean z5, java.lang.String str3, long j) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        this.zzh = str2;
        this.zzi = z4;
        this.zzj = z5;
        this.zzk = str3;
        this.zzl = j;
    }

    public static com.google.android.gms.internal.location.zzbf zzc(java.lang.String str, com.google.android.gms.location.LocationRequest locationRequest) {
        return new com.google.android.gms.internal.location.zzbf(locationRequest, com.google.android.gms.internal.location.zzbx.zzk(), null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.location.zzbf) {
            com.google.android.gms.internal.location.zzbf zzbfVar = (com.google.android.gms.internal.location.zzbf) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zzb, zzbfVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzbfVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzbfVar.zzd) && this.zze == zzbfVar.zze && this.zzf == zzbfVar.zzf && this.zzg == zzbfVar.zzg && com.google.android.gms.common.internal.Objects.equal(this.zzh, zzbfVar.zzh) && this.zzi == zzbfVar.zzi && this.zzj == zzbfVar.zzj && com.google.android.gms.common.internal.Objects.equal(this.zzk, zzbfVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.zzb);
        if (this.zzd != null) {
            sb.append(" tag=");
            sb.append(this.zzd);
        }
        if (this.zzh != null) {
            sb.append(" moduleId=");
            sb.append(this.zzh);
        }
        if (this.zzk != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.zzk);
        }
        sb.append(" hideAppOps=");
        sb.append(this.zze);
        sb.append(" clients=");
        sb.append(this.zzc);
        sb.append(" forceCoarseLocation=");
        sb.append(this.zzf);
        if (this.zzg) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 12, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, this.zzk, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 14, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        return this.zzl;
    }

    public final com.google.android.gms.location.LocationRequest zzb() {
        return this.zzb;
    }

    @java.lang.Deprecated
    public final com.google.android.gms.internal.location.zzbf zzd(boolean z) {
        this.zzj = true;
        return this;
    }

    public final com.google.android.gms.internal.location.zzbf zze(long j) {
        if (this.zzb.getMaxWaitTime() <= this.zzb.getInterval()) {
            this.zzl = j;
            return this;
        }
        long interval = this.zzb.getInterval();
        long maxWaitTime = this.zzb.getMaxWaitTime();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(120);
        sb.append("could not set max age when location batching is requested, interval=");
        sb.append(interval);
        sb.append("maxWaitTime=");
        sb.append(maxWaitTime);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final java.util.List zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzi;
    }
}
