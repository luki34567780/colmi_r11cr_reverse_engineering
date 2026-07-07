package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class CameraPosition extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.CameraPosition> CREATOR = new com.google.android.gms.maps.model.zza();
    public final float bearing;
    public final com.google.android.gms.maps.model.LatLng target;
    public final float tilt;
    public final float zoom;

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    public static final class Builder {
        private com.google.android.gms.maps.model.LatLng zza;
        private float zzb;
        private float zzc;
        private float zzd;

        public Builder() {
        }

        public Builder(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
            com.google.android.gms.maps.model.CameraPosition cameraPosition2 = (com.google.android.gms.maps.model.CameraPosition) com.google.android.gms.common.internal.Preconditions.checkNotNull(cameraPosition, "previous must not be null.");
            this.zza = cameraPosition2.target;
            this.zzb = cameraPosition2.zoom;
            this.zzc = cameraPosition2.tilt;
            this.zzd = cameraPosition2.bearing;
        }

        public com.google.android.gms.maps.model.CameraPosition.Builder bearing(float f) {
            this.zzd = f;
            return this;
        }

        public com.google.android.gms.maps.model.CameraPosition build() {
            return new com.google.android.gms.maps.model.CameraPosition(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public com.google.android.gms.maps.model.CameraPosition.Builder target(com.google.android.gms.maps.model.LatLng latLng) {
            this.zza = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng, "location must not be null.");
            return this;
        }

        public com.google.android.gms.maps.model.CameraPosition.Builder tilt(float f) {
            this.zzc = f;
            return this;
        }

        public com.google.android.gms.maps.model.CameraPosition.Builder zoom(float f) {
            this.zzb = f;
            return this;
        }
    }

    public CameraPosition(com.google.android.gms.maps.model.LatLng latLng, float f, float f2, float f3) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng, "camera target must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(f2 >= 0.0f && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", java.lang.Float.valueOf(f2));
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + 0.0f;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public static com.google.android.gms.maps.model.CameraPosition.Builder builder() {
        return new com.google.android.gms.maps.model.CameraPosition.Builder();
    }

    public static com.google.android.gms.maps.model.CameraPosition.Builder builder(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
        return new com.google.android.gms.maps.model.CameraPosition.Builder(cameraPosition);
    }

    public static com.google.android.gms.maps.model.CameraPosition createFromAttributes(android.content.Context context, android.util.AttributeSet attributeSet) {
        return com.google.android.gms.maps.GoogleMapOptions.zza(context, attributeSet);
    }

    public static final com.google.android.gms.maps.model.CameraPosition fromLatLngZoom(com.google.android.gms.maps.model.LatLng latLng, float f) {
        return new com.google.android.gms.maps.model.CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.CameraPosition)) {
            return false;
        }
        com.google.android.gms.maps.model.CameraPosition cameraPosition = (com.google.android.gms.maps.model.CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && java.lang.Float.floatToIntBits(this.zoom) == java.lang.Float.floatToIntBits(cameraPosition.zoom) && java.lang.Float.floatToIntBits(this.tilt) == java.lang.Float.floatToIntBits(cameraPosition.tilt) && java.lang.Float.floatToIntBits(this.bearing) == java.lang.Float.floatToIntBits(cameraPosition.bearing);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.target, java.lang.Float.valueOf(this.zoom), java.lang.Float.valueOf(this.tilt), java.lang.Float.valueOf(this.bearing));
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("target", this.target).add("zoom", java.lang.Float.valueOf(this.zoom)).add("tilt", java.lang.Float.valueOf(this.tilt)).add("bearing", java.lang.Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.target, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 3, this.zoom);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, this.tilt);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 5, this.bearing);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
