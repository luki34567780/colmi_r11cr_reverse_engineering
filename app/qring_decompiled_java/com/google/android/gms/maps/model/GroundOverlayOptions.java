package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class GroundOverlayOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.GroundOverlayOptions> CREATOR = new com.google.android.gms.maps.model.zzd();
    public static final float NO_DIMENSION = -1.0f;
    private com.google.android.gms.maps.model.BitmapDescriptor zza;
    private com.google.android.gms.maps.model.LatLng zzb;
    private float zzc;
    private float zzd;
    private com.google.android.gms.maps.model.LatLngBounds zze;
    private float zzf;
    private float zzg;
    private boolean zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;

    public GroundOverlayOptions() {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
    }

    private final com.google.android.gms.maps.model.GroundOverlayOptions zza(com.google.android.gms.maps.model.LatLng latLng, float f, float f2) {
        this.zzb = latLng;
        this.zzc = f;
        this.zzd = f2;
        return this;
    }

    public com.google.android.gms.maps.model.GroundOverlayOptions anchor(float f, float f2) {
        this.zzj = f;
        this.zzk = f2;
        return this;
    }

    public com.google.android.gms.maps.model.GroundOverlayOptions bearing(float f) {
        this.zzf = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public com.google.android.gms.maps.model.GroundOverlayOptions clickable(boolean z) {
        this.zzl = z;
        return this;
    }

    public float getAnchorU() {
        return this.zzj;
    }

    public float getAnchorV() {
        return this.zzk;
    }

    public float getBearing() {
        return this.zzf;
    }

    public com.google.android.gms.maps.model.LatLngBounds getBounds() {
        return this.zze;
    }

    public float getHeight() {
        return this.zzd;
    }

    public com.google.android.gms.maps.model.BitmapDescriptor getImage() {
        return this.zza;
    }

    public com.google.android.gms.maps.model.LatLng getLocation() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzi;
    }

    public float getWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzg;
    }

    public com.google.android.gms.maps.model.GroundOverlayOptions image(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bitmapDescriptor, "imageDescriptor must not be null");
        this.zza = bitmapDescriptor;
        return this;
    }

    public boolean isClickable() {
        return this.zzl;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    public com.google.android.gms.maps.model.GroundOverlayOptions position(com.google.android.gms.maps.model.LatLng latLng, float f) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zze == null, "Position has already been set using positionFromBounds");
        com.google.android.gms.common.internal.Preconditions.checkArgument(latLng != null, "Location must be specified");
        com.google.android.gms.common.internal.Preconditions.checkArgument(f >= 0.0f, "Width must be non-negative");
        zza(latLng, f, -1.0f);
        return this;
    }

    public com.google.android.gms.maps.model.GroundOverlayOptions positionFromBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        com.google.android.gms.maps.model.LatLng latLng = this.zzb;
        com.google.android.gms.common.internal.Preconditions.checkState(latLng == null, "Position has already been set using position: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(latLng))));
        this.zze = latLngBounds;
        return this;
    }

    public com.google.android.gms.maps.model.GroundOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Transparency must be in the range [0..1]");
        this.zzi = f;
        return this;
    }

    public com.google.android.gms.maps.model.GroundOverlayOptions visible(boolean z) {
        this.zzh = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zza.zza().asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getLocation(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, getWidth());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 5, getHeight());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, getBounds(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, getBearing());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 8, getZIndex());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 10, getTransparency());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 11, getAnchorU());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 12, getAnchorV());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 13, isClickable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public com.google.android.gms.maps.model.GroundOverlayOptions zIndex(float f) {
        this.zzg = f;
        return this;
    }

    GroundOverlayOptions(android.os.IBinder iBinder, com.google.android.gms.maps.model.LatLng latLng, float f, float f2, com.google.android.gms.maps.model.LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
        this.zza = new com.google.android.gms.maps.model.BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder));
        this.zzb = latLng;
        this.zzc = f;
        this.zzd = f2;
        this.zze = latLngBounds;
        this.zzf = f3;
        this.zzg = f4;
        this.zzh = z;
        this.zzi = f5;
        this.zzj = f6;
        this.zzk = f7;
        this.zzl = z2;
    }

    public com.google.android.gms.maps.model.GroundOverlayOptions position(com.google.android.gms.maps.model.LatLng latLng, float f, float f2) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zze == null, "Position has already been set using positionFromBounds");
        com.google.android.gms.common.internal.Preconditions.checkArgument(latLng != null, "Location must be specified");
        com.google.android.gms.common.internal.Preconditions.checkArgument(f >= 0.0f, "Width must be non-negative");
        com.google.android.gms.common.internal.Preconditions.checkArgument(f2 >= 0.0f, "Height must be non-negative");
        zza(latLng, f, f2);
        return this;
    }
}
