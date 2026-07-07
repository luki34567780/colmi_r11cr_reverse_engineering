package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class StrokeStyle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.StrokeStyle> CREATOR = new com.google.android.gms.maps.model.zzv();
    private final float zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final com.google.android.gms.maps.model.StampStyle zze;

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    public static final class Builder {
        private float zza;
        private int zzb;
        private int zzc;
        private boolean zzd;
        private com.google.android.gms.maps.model.StampStyle zze;

        private Builder() {
        }

        public Builder(com.google.android.gms.maps.model.StrokeStyle strokeStyle) {
            this.zza = strokeStyle.zza();
            android.util.Pair zzb = strokeStyle.zzb();
            this.zzb = ((java.lang.Integer) zzb.first).intValue();
            this.zzc = ((java.lang.Integer) zzb.second).intValue();
            this.zzd = strokeStyle.isVisible();
            this.zze = strokeStyle.getStamp();
        }

        /* synthetic */ Builder(com.google.android.gms.maps.model.zzu zzuVar) {
        }

        public com.google.android.gms.maps.model.StrokeStyle build() {
            return new com.google.android.gms.maps.model.StrokeStyle(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public com.google.android.gms.maps.model.StrokeStyle.Builder stamp(com.google.android.gms.maps.model.StampStyle stampStyle) {
            this.zze = stampStyle;
            return this;
        }

        public final com.google.android.gms.maps.model.StrokeStyle.Builder zza(int i) {
            this.zzb = i;
            this.zzc = i;
            return this;
        }

        public final com.google.android.gms.maps.model.StrokeStyle.Builder zzb(int i, int i2) {
            this.zzb = i;
            this.zzc = i2;
            return this;
        }

        public final com.google.android.gms.maps.model.StrokeStyle.Builder zzc(boolean z) {
            this.zzd = z;
            return this;
        }

        public final com.google.android.gms.maps.model.StrokeStyle.Builder zzd(float f) {
            this.zza = f;
            return this;
        }
    }

    StrokeStyle(float f, int i, int i2, boolean z, com.google.android.gms.maps.model.StampStyle stampStyle) {
        this.zza = f;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = stampStyle;
    }

    public static com.google.android.gms.maps.model.StrokeStyle.Builder colorBuilder(int i) {
        com.google.android.gms.maps.model.StrokeStyle.Builder builder = new com.google.android.gms.maps.model.StrokeStyle.Builder((com.google.android.gms.maps.model.zzu) null);
        builder.zza(i);
        return builder;
    }

    public static com.google.android.gms.maps.model.StrokeStyle.Builder gradientBuilder(int i, int i2) {
        com.google.android.gms.maps.model.StrokeStyle.Builder builder = new com.google.android.gms.maps.model.StrokeStyle.Builder((com.google.android.gms.maps.model.zzu) null);
        builder.zzb(i, i2);
        return builder;
    }

    public static com.google.android.gms.maps.model.StrokeStyle.Builder transparentColorBuilder() {
        com.google.android.gms.maps.model.StrokeStyle.Builder builder = new com.google.android.gms.maps.model.StrokeStyle.Builder((com.google.android.gms.maps.model.zzu) null);
        builder.zza(0);
        return builder;
    }

    public com.google.android.gms.maps.model.StampStyle getStamp() {
        return this.zze;
    }

    public boolean isVisible() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 2, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, getStamp(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.zza;
    }

    public final android.util.Pair zzb() {
        return new android.util.Pair(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc));
    }
}
