package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class StreetViewPanoramaOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.StreetViewPanoramaOptions> CREATOR = new com.google.android.gms.maps.zzap();
    private com.google.android.gms.maps.model.StreetViewPanoramaCamera zza;
    private java.lang.String zzb;
    private com.google.android.gms.maps.model.LatLng zzc;
    private java.lang.Integer zzd;
    private java.lang.Boolean zze;
    private java.lang.Boolean zzf;
    private java.lang.Boolean zzg;
    private java.lang.Boolean zzh;
    private java.lang.Boolean zzi;
    private com.google.android.gms.maps.model.StreetViewSource zzj;

    public StreetViewPanoramaOptions() {
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
        this.zzh = true;
        this.zzj = com.google.android.gms.maps.model.StreetViewSource.DEFAULT;
    }

    public java.lang.Boolean getPanningGesturesEnabled() {
        return this.zzg;
    }

    public java.lang.String getPanoramaId() {
        return this.zzb;
    }

    public com.google.android.gms.maps.model.LatLng getPosition() {
        return this.zzc;
    }

    public java.lang.Integer getRadius() {
        return this.zzd;
    }

    public com.google.android.gms.maps.model.StreetViewSource getSource() {
        return this.zzj;
    }

    public java.lang.Boolean getStreetNamesEnabled() {
        return this.zzh;
    }

    public com.google.android.gms.maps.model.StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.zza;
    }

    public java.lang.Boolean getUseViewLifecycleInFragment() {
        return this.zzi;
    }

    public java.lang.Boolean getUserNavigationEnabled() {
        return this.zze;
    }

    public java.lang.Boolean getZoomGesturesEnabled() {
        return this.zzf;
    }

    public com.google.android.gms.maps.StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.zzg = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.gms.maps.StreetViewPanoramaOptions panoramaCamera(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zza = streetViewPanoramaCamera;
        return this;
    }

    public com.google.android.gms.maps.StreetViewPanoramaOptions panoramaId(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    public com.google.android.gms.maps.StreetViewPanoramaOptions position(com.google.android.gms.maps.model.LatLng latLng) {
        this.zzc = latLng;
        return this;
    }

    public com.google.android.gms.maps.StreetViewPanoramaOptions position(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.StreetViewSource streetViewSource) {
        this.zzc = latLng;
        this.zzj = streetViewSource;
        return this;
    }

    public com.google.android.gms.maps.StreetViewPanoramaOptions position(com.google.android.gms.maps.model.LatLng latLng, java.lang.Integer num) {
        this.zzc = latLng;
        this.zzd = num;
        return this;
    }

    public com.google.android.gms.maps.StreetViewPanoramaOptions position(com.google.android.gms.maps.model.LatLng latLng, java.lang.Integer num, com.google.android.gms.maps.model.StreetViewSource streetViewSource) {
        this.zzc = latLng;
        this.zzd = num;
        this.zzj = streetViewSource;
        return this;
    }

    public com.google.android.gms.maps.StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.zzh = java.lang.Boolean.valueOf(z);
        return this;
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("PanoramaId", this.zzb).add("Position", this.zzc).add("Radius", this.zzd).add("Source", this.zzj).add("StreetViewPanoramaCamera", this.zza).add("UserNavigationEnabled", this.zze).add("ZoomGesturesEnabled", this.zzf).add("PanningGesturesEnabled", this.zzg).add("StreetNamesEnabled", this.zzh).add("UseViewLifecycleInFragment", this.zzi).toString();
    }

    public com.google.android.gms.maps.StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.zzi = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.gms.maps.StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.zze = java.lang.Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStreetViewPanoramaCamera(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getPanoramaId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getPosition(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 5, getRadius(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zze));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 11, getSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public com.google.android.gms.maps.StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.zzf = java.lang.Boolean.valueOf(z);
        return this;
    }

    StreetViewPanoramaOptions(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera, java.lang.String str, com.google.android.gms.maps.model.LatLng latLng, java.lang.Integer num, byte b, byte b2, byte b3, byte b4, byte b5, com.google.android.gms.maps.model.StreetViewSource streetViewSource) {
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
        this.zzh = true;
        this.zzj = com.google.android.gms.maps.model.StreetViewSource.DEFAULT;
        this.zza = streetViewPanoramaCamera;
        this.zzc = latLng;
        this.zzd = num;
        this.zzb = str;
        this.zze = com.google.android.gms.maps.internal.zza.zzb(b);
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b2);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b3);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b4);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b5);
        this.zzj = streetViewSource;
    }
}
