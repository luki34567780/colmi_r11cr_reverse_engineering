package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class GoogleMapOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.GoogleMapOptions> CREATOR = new com.google.android.gms.maps.zzab();
    private static final java.lang.Integer zza = java.lang.Integer.valueOf(android.graphics.Color.argb(255, 236, 233, 225));
    private java.lang.Boolean zzb;
    private java.lang.Boolean zzc;
    private int zzd;
    private com.google.android.gms.maps.model.CameraPosition zze;
    private java.lang.Boolean zzf;
    private java.lang.Boolean zzg;
    private java.lang.Boolean zzh;
    private java.lang.Boolean zzi;
    private java.lang.Boolean zzj;
    private java.lang.Boolean zzk;
    private java.lang.Boolean zzl;
    private java.lang.Boolean zzm;
    private java.lang.Boolean zzn;
    private java.lang.Float zzo;
    private java.lang.Float zzp;
    private com.google.android.gms.maps.model.LatLngBounds zzq;
    private java.lang.Boolean zzr;
    private java.lang.Integer zzs;
    private java.lang.String zzt;

    public GoogleMapOptions() {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
    }

    public static com.google.android.gms.maps.GoogleMapOptions createFromAttributes(android.content.Context context, android.util.AttributeSet attributeSet) {
        java.lang.String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        android.content.res.TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.maps.R.styleable.MapAttrs);
        com.google.android.gms.maps.GoogleMapOptions googleMapOptions = new com.google.android.gms.maps.GoogleMapOptions();
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_mapType)) {
            googleMapOptions.mapType(obtainAttributes.getInt(com.google.android.gms.maps.R.styleable.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_zOrderOnTop)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_useViewLifecycle)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiCompass)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiRotateGestures)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(obtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiScrollGestures)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiTiltGestures)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiZoomGestures)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiZoomControls)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_liteMode)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiMapToolbar)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_ambientEnabled)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.minZoomPreference(obtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.maxZoomPreference(obtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_backgroundColor)) {
            googleMapOptions.backgroundColor(java.lang.Integer.valueOf(obtainAttributes.getColor(com.google.android.gms.maps.R.styleable.MapAttrs_backgroundColor, zza.intValue())));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_mapId) && (string = obtainAttributes.getString(com.google.android.gms.maps.R.styleable.MapAttrs_mapId)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public static com.google.android.gms.maps.model.CameraPosition zza(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        android.content.res.TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.maps.R.styleable.MapAttrs);
        com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraTargetLat, 0.0f) : 0.0f, obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraTargetLng, 0.0f) : 0.0f);
        com.google.android.gms.maps.model.CameraPosition.Builder builder = com.google.android.gms.maps.model.CameraPosition.builder();
        builder.target(latLng);
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraZoom)) {
            builder.zoom(obtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraZoom, 0.0f));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraBearing)) {
            builder.bearing(obtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraBearing, 0.0f));
        }
        if (obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraTilt)) {
            builder.tilt(obtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraTilt, 0.0f));
        }
        obtainAttributes.recycle();
        return builder.build();
    }

    public static com.google.android.gms.maps.model.LatLngBounds zzb(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        android.content.res.TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.maps.R.styleable.MapAttrs);
        java.lang.Float valueOf = obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsSouthWestLatitude) ? java.lang.Float.valueOf(obtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        java.lang.Float valueOf2 = obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsSouthWestLongitude) ? java.lang.Float.valueOf(obtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        java.lang.Float valueOf3 = obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsNorthEastLatitude) ? java.lang.Float.valueOf(obtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        java.lang.Float valueOf4 = obtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsNorthEastLongitude) ? java.lang.Float.valueOf(obtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new com.google.android.gms.maps.model.LatLngBounds(new com.google.android.gms.maps.model.LatLng(valueOf.floatValue(), valueOf2.floatValue()), new com.google.android.gms.maps.model.LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
    }

    public com.google.android.gms.maps.GoogleMapOptions ambientEnabled(boolean z) {
        this.zzn = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions backgroundColor(java.lang.Integer num) {
        this.zzs = num;
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions camera(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
        this.zze = cameraPosition;
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions compassEnabled(boolean z) {
        this.zzg = java.lang.Boolean.valueOf(z);
        return this;
    }

    public java.lang.Boolean getAmbientEnabled() {
        return this.zzn;
    }

    public java.lang.Integer getBackgroundColor() {
        return this.zzs;
    }

    public com.google.android.gms.maps.model.CameraPosition getCamera() {
        return this.zze;
    }

    public java.lang.Boolean getCompassEnabled() {
        return this.zzg;
    }

    public com.google.android.gms.maps.model.LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzq;
    }

    public java.lang.Boolean getLiteMode() {
        return this.zzl;
    }

    public java.lang.String getMapId() {
        return this.zzt;
    }

    public java.lang.Boolean getMapToolbarEnabled() {
        return this.zzm;
    }

    public int getMapType() {
        return this.zzd;
    }

    public java.lang.Float getMaxZoomPreference() {
        return this.zzp;
    }

    public java.lang.Float getMinZoomPreference() {
        return this.zzo;
    }

    public java.lang.Boolean getRotateGesturesEnabled() {
        return this.zzk;
    }

    public java.lang.Boolean getScrollGesturesEnabled() {
        return this.zzh;
    }

    public java.lang.Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzr;
    }

    public java.lang.Boolean getTiltGesturesEnabled() {
        return this.zzj;
    }

    public java.lang.Boolean getUseViewLifecycleInFragment() {
        return this.zzc;
    }

    public java.lang.Boolean getZOrderOnTop() {
        return this.zzb;
    }

    public java.lang.Boolean getZoomControlsEnabled() {
        return this.zzf;
    }

    public java.lang.Boolean getZoomGesturesEnabled() {
        return this.zzi;
    }

    public com.google.android.gms.maps.GoogleMapOptions latLngBoundsForCameraTarget(com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        this.zzq = latLngBounds;
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions liteMode(boolean z) {
        this.zzl = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions mapId(java.lang.String str) {
        this.zzt = str;
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.zzm = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions mapType(int i) {
        this.zzd = i;
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions maxZoomPreference(float f) {
        this.zzp = java.lang.Float.valueOf(f);
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions minZoomPreference(float f) {
        this.zzo = java.lang.Float.valueOf(f);
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.zzk = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.zzh = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        this.zzr = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.zzj = java.lang.Boolean.valueOf(z);
        return this;
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("MapType", java.lang.Integer.valueOf(this.zzd)).add("LiteMode", this.zzl).add(com.luck.picture.lib.config.PictureMimeType.CAMERA, this.zze).add("CompassEnabled", this.zzg).add("ZoomControlsEnabled", this.zzf).add("ScrollGesturesEnabled", this.zzh).add("ZoomGesturesEnabled", this.zzi).add("TiltGesturesEnabled", this.zzj).add("RotateGesturesEnabled", this.zzk).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzr).add("MapToolbarEnabled", this.zzm).add("AmbientEnabled", this.zzn).add("MinZoomPreference", this.zzo).add("MaxZoomPreference", this.zzp).add("BackgroundColor", this.zzs).add("LatLngBoundsForCameraTarget", this.zzq).add("ZOrderOnTop", this.zzb).add("UseViewLifecycleInFragment", this.zzc).toString();
    }

    public com.google.android.gms.maps.GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.zzc = java.lang.Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(this.zzb));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(this.zzc));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, getMapType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzj));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(this.zzk));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(this.zzl));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(this.zzm));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(this.zzn));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 19, com.google.android.gms.maps.internal.zza.zza(this.zzr));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public com.google.android.gms.maps.GoogleMapOptions zOrderOnTop(boolean z) {
        this.zzb = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.zzf = java.lang.Boolean.valueOf(z);
        return this;
    }

    public com.google.android.gms.maps.GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.zzi = java.lang.Boolean.valueOf(z);
        return this;
    }

    GoogleMapOptions(byte b, byte b2, int i, com.google.android.gms.maps.model.CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, java.lang.Float f, java.lang.Float f2, com.google.android.gms.maps.model.LatLngBounds latLngBounds, byte b12, java.lang.Integer num, java.lang.String str) {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzb = com.google.android.gms.maps.internal.zza.zzb(b);
        this.zzc = com.google.android.gms.maps.internal.zza.zzb(b2);
        this.zzd = i;
        this.zze = cameraPosition;
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b3);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b4);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b5);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b6);
        this.zzj = com.google.android.gms.maps.internal.zza.zzb(b7);
        this.zzk = com.google.android.gms.maps.internal.zza.zzb(b8);
        this.zzl = com.google.android.gms.maps.internal.zza.zzb(b9);
        this.zzm = com.google.android.gms.maps.internal.zza.zzb(b10);
        this.zzn = com.google.android.gms.maps.internal.zza.zzb(b11);
        this.zzo = f;
        this.zzp = f2;
        this.zzq = latLngBounds;
        this.zzr = com.google.android.gms.maps.internal.zza.zzb(b12);
        this.zzs = num;
        this.zzt = str;
    }
}
