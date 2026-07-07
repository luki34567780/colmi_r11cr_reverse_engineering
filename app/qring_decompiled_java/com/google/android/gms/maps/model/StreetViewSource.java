package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class StreetViewSource extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.StreetViewSource> CREATOR = new com.google.android.gms.maps.model.zzt();
    public static final com.google.android.gms.maps.model.StreetViewSource DEFAULT = new com.google.android.gms.maps.model.StreetViewSource(0);
    public static final com.google.android.gms.maps.model.StreetViewSource OUTDOOR = new com.google.android.gms.maps.model.StreetViewSource(1);
    private static final java.lang.String zza = "StreetViewSource";
    private final int zzb;

    public StreetViewSource(int i) {
        this.zzb = i;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.google.android.gms.maps.model.StreetViewSource) && this.zzb == ((com.google.android.gms.maps.model.StreetViewSource) obj).zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzb));
    }

    public java.lang.String toString() {
        int i = this.zzb;
        return java.lang.String.format("StreetViewSource:%s", i != 0 ? i != 1 ? java.lang.String.format("UNKNOWN(%s)", java.lang.Integer.valueOf(i)) : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
