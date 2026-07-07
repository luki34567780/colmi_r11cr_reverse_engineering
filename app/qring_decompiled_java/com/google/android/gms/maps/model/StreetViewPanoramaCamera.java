package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public class StreetViewPanoramaCamera extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.StreetViewPanoramaCamera> CREATOR = new com.google.android.gms.maps.model.zzp();
    public final float bearing;
    public final float tilt;
    public final float zoom;
    private final com.google.android.gms.maps.model.StreetViewPanoramaOrientation zza;

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    public static final class Builder {
        public float bearing;
        public float tilt;
        public float zoom;

        public Builder() {
        }

        public Builder(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(streetViewPanoramaCamera, "StreetViewPanoramaCamera must not be null.");
            this.zoom = streetViewPanoramaCamera.zoom;
            this.bearing = streetViewPanoramaCamera.bearing;
            this.tilt = streetViewPanoramaCamera.tilt;
        }

        public com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public com.google.android.gms.maps.model.StreetViewPanoramaCamera build() {
            return new com.google.android.gms.maps.model.StreetViewPanoramaCamera(this.zoom, this.tilt, this.bearing);
        }

        public com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder orientation(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(streetViewPanoramaOrientation, "orientation must not be null.");
            this.tilt = streetViewPanoramaOrientation.tilt;
            this.bearing = streetViewPanoramaOrientation.bearing;
            return this;
        }

        public com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder tilt(float f) {
            this.tilt = f;
            return this;
        }

        public com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder zoom(float f) {
            this.zoom = f;
            return this;
        }
    }

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Tilt needs to be between -90 and 90 inclusive: " + f2);
        this.zoom = ((double) f) <= 0.0d ? 0.0f : f;
        this.tilt = 0.0f + f2;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder builder = new com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder();
        builder.tilt(f2);
        builder.bearing(f3);
        this.zza = builder.build();
    }

    public static com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder builder() {
        return new com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder();
    }

    public static com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder builder(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder(streetViewPanoramaCamera);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.StreetViewPanoramaCamera)) {
            return false;
        }
        com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera = (com.google.android.gms.maps.model.StreetViewPanoramaCamera) obj;
        return java.lang.Float.floatToIntBits(this.zoom) == java.lang.Float.floatToIntBits(streetViewPanoramaCamera.zoom) && java.lang.Float.floatToIntBits(this.tilt) == java.lang.Float.floatToIntBits(streetViewPanoramaCamera.tilt) && java.lang.Float.floatToIntBits(this.bearing) == java.lang.Float.floatToIntBits(streetViewPanoramaCamera.bearing);
    }

    public com.google.android.gms.maps.model.StreetViewPanoramaOrientation getOrientation() {
        return this.zza;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Float.valueOf(this.zoom), java.lang.Float.valueOf(this.tilt), java.lang.Float.valueOf(this.bearing));
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("zoom", java.lang.Float.valueOf(this.zoom)).add("tilt", java.lang.Float.valueOf(this.tilt)).add("bearing", java.lang.Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 2, this.zoom);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 3, this.tilt);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, this.bearing);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
