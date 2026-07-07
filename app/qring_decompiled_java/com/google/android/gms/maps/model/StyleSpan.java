package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class StyleSpan extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.StyleSpan> CREATOR = new com.google.android.gms.maps.model.zzw();
    private final com.google.android.gms.maps.model.StrokeStyle zza;
    private final double zzb;

    public StyleSpan(int i) {
        this.zza = com.google.android.gms.maps.model.StrokeStyle.colorBuilder(i).build();
        this.zzb = 1.0d;
    }

    public double getSegments() {
        return this.zzb;
    }

    public com.google.android.gms.maps.model.StrokeStyle getStyle() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStyle(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 3, getSegments());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public StyleSpan(int i, double d) {
        if (d <= 0.0d) {
            throw new java.lang.IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.zza = com.google.android.gms.maps.model.StrokeStyle.colorBuilder(i).build();
        this.zzb = d;
    }

    public StyleSpan(com.google.android.gms.maps.model.StrokeStyle strokeStyle) {
        this.zza = strokeStyle;
        this.zzb = 1.0d;
    }

    public StyleSpan(com.google.android.gms.maps.model.StrokeStyle strokeStyle, double d) {
        if (d > 0.0d) {
            this.zza = strokeStyle;
            this.zzb = d;
            return;
        }
        throw new java.lang.IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }
}
