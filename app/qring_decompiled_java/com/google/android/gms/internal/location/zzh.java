package com.google.android.gms.internal.location;

/* compiled from: com.google.android.gms:play-services-location@@20.0.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class zzh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    final com.google.android.gms.location.zzw zzc;
    final java.util.List zzd;
    final java.lang.String zze;
    static final java.util.List zza = java.util.Collections.emptyList();
    static final com.google.android.gms.location.zzw zzb = new com.google.android.gms.location.zzw();
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzh> CREATOR = new com.google.android.gms.internal.location.zzi();

    zzh(com.google.android.gms.location.zzw zzwVar, java.util.List list, java.lang.String str) {
        this.zzc = zzwVar;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.location.zzh)) {
            return false;
        }
        com.google.android.gms.internal.location.zzh zzhVar = (com.google.android.gms.internal.location.zzh) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzc, zzhVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzhVar.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, zzhVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zzd);
        java.lang.String str = this.zze;
        int length = java.lang.String.valueOf(valueOf).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 77 + java.lang.String.valueOf(valueOf2).length() + java.lang.String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
