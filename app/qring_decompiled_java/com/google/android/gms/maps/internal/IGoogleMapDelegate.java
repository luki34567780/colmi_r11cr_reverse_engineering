package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface IGoogleMapDelegate extends android.os.IInterface {
    com.google.android.gms.internal.maps.zzl addCircle(com.google.android.gms.maps.model.CircleOptions circleOptions) throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzo addGroundOverlay(com.google.android.gms.maps.model.GroundOverlayOptions groundOverlayOptions) throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzaa addMarker(com.google.android.gms.maps.model.MarkerOptions markerOptions) throws android.os.RemoteException;

    void addOnMapCapabilitiesChangedListener(com.google.android.gms.maps.internal.zzak zzakVar) throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzad addPolygon(com.google.android.gms.maps.model.PolygonOptions polygonOptions) throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzag addPolyline(com.google.android.gms.maps.model.PolylineOptions polylineOptions) throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzaj addTileOverlay(com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions) throws android.os.RemoteException;

    void animateCamera(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void animateCameraWithCallback(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, @javax.annotation.Nullable com.google.android.gms.maps.internal.zzd zzdVar) throws android.os.RemoteException;

    void animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i, @javax.annotation.Nullable com.google.android.gms.maps.internal.zzd zzdVar) throws android.os.RemoteException;

    void clear() throws android.os.RemoteException;

    com.google.android.gms.maps.model.CameraPosition getCameraPosition() throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzr getFocusedBuilding() throws android.os.RemoteException;

    void getMapAsync(com.google.android.gms.maps.internal.zzas zzasVar) throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzx getMapCapabilities() throws android.os.RemoteException;

    int getMapType() throws android.os.RemoteException;

    float getMaxZoomLevel() throws android.os.RemoteException;

    float getMinZoomLevel() throws android.os.RemoteException;

    android.location.Location getMyLocation() throws android.os.RemoteException;

    com.google.android.gms.maps.internal.IProjectionDelegate getProjection() throws android.os.RemoteException;

    com.google.android.gms.maps.internal.IUiSettingsDelegate getUiSettings() throws android.os.RemoteException;

    boolean isBuildingsEnabled() throws android.os.RemoteException;

    boolean isIndoorEnabled() throws android.os.RemoteException;

    boolean isMyLocationEnabled() throws android.os.RemoteException;

    boolean isTrafficEnabled() throws android.os.RemoteException;

    void moveCamera(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void onCreate(android.os.Bundle bundle) throws android.os.RemoteException;

    void onDestroy() throws android.os.RemoteException;

    void onEnterAmbient(android.os.Bundle bundle) throws android.os.RemoteException;

    void onExitAmbient() throws android.os.RemoteException;

    void onLowMemory() throws android.os.RemoteException;

    void onPause() throws android.os.RemoteException;

    void onResume() throws android.os.RemoteException;

    void onSaveInstanceState(android.os.Bundle bundle) throws android.os.RemoteException;

    void onStart() throws android.os.RemoteException;

    void onStop() throws android.os.RemoteException;

    void removeOnMapCapabilitiesChangedListener(com.google.android.gms.maps.internal.zzak zzakVar) throws android.os.RemoteException;

    void resetMinMaxZoomPreference() throws android.os.RemoteException;

    void setBuildingsEnabled(boolean z) throws android.os.RemoteException;

    void setContentDescription(@javax.annotation.Nullable java.lang.String str) throws android.os.RemoteException;

    boolean setIndoorEnabled(boolean z) throws android.os.RemoteException;

    void setInfoWindowAdapter(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzi zziVar) throws android.os.RemoteException;

    void setLatLngBoundsForCameraTarget(@javax.annotation.Nullable com.google.android.gms.maps.model.LatLngBounds latLngBounds) throws android.os.RemoteException;

    void setLocationSource(@javax.annotation.Nullable com.google.android.gms.maps.internal.ILocationSourceDelegate iLocationSourceDelegate) throws android.os.RemoteException;

    boolean setMapStyle(@javax.annotation.Nullable com.google.android.gms.maps.model.MapStyleOptions mapStyleOptions) throws android.os.RemoteException;

    void setMapType(int i) throws android.os.RemoteException;

    void setMaxZoomPreference(float f) throws android.os.RemoteException;

    void setMinZoomPreference(float f) throws android.os.RemoteException;

    void setMyLocationEnabled(boolean z) throws android.os.RemoteException;

    void setOnCameraChangeListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzn zznVar) throws android.os.RemoteException;

    void setOnCameraIdleListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzp zzpVar) throws android.os.RemoteException;

    void setOnCameraMoveCanceledListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzr zzrVar) throws android.os.RemoteException;

    void setOnCameraMoveListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzt zztVar) throws android.os.RemoteException;

    void setOnCameraMoveStartedListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzv zzvVar) throws android.os.RemoteException;

    void setOnCircleClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzx zzxVar) throws android.os.RemoteException;

    void setOnGroundOverlayClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzz zzzVar) throws android.os.RemoteException;

    void setOnIndoorStateChangeListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzab zzabVar) throws android.os.RemoteException;

    void setOnInfoWindowClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzad zzadVar) throws android.os.RemoteException;

    void setOnInfoWindowCloseListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzaf zzafVar) throws android.os.RemoteException;

    void setOnInfoWindowLongClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzah zzahVar) throws android.os.RemoteException;

    void setOnMapClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzam zzamVar) throws android.os.RemoteException;

    void setOnMapLoadedCallback(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzao zzaoVar) throws android.os.RemoteException;

    void setOnMapLongClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzaq zzaqVar) throws android.os.RemoteException;

    void setOnMarkerClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzau zzauVar) throws android.os.RemoteException;

    void setOnMarkerDragListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzaw zzawVar) throws android.os.RemoteException;

    void setOnMyLocationButtonClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzay zzayVar) throws android.os.RemoteException;

    void setOnMyLocationChangeListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzba zzbaVar) throws android.os.RemoteException;

    void setOnMyLocationClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzbc zzbcVar) throws android.os.RemoteException;

    void setOnPoiClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzbe zzbeVar) throws android.os.RemoteException;

    void setOnPolygonClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzbg zzbgVar) throws android.os.RemoteException;

    void setOnPolylineClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzbi zzbiVar) throws android.os.RemoteException;

    void setPadding(int i, int i2, int i3, int i4) throws android.os.RemoteException;

    void setTrafficEnabled(boolean z) throws android.os.RemoteException;

    void setWatermarkEnabled(boolean z) throws android.os.RemoteException;

    void snapshot(com.google.android.gms.maps.internal.zzbv zzbvVar, @javax.annotation.Nullable com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void snapshotForTest(com.google.android.gms.maps.internal.zzbv zzbvVar) throws android.os.RemoteException;

    void stopAnimation() throws android.os.RemoteException;

    boolean useViewLifecycleWhenInFragment() throws android.os.RemoteException;
}
