package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface IStreetViewPanoramaDelegate extends android.os.IInterface {
    void animateTo(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws android.os.RemoteException;

    void enablePanning(boolean z) throws android.os.RemoteException;

    void enableStreetNames(boolean z) throws android.os.RemoteException;

    void enableUserNavigation(boolean z) throws android.os.RemoteException;

    void enableZoom(boolean z) throws android.os.RemoteException;

    com.google.android.gms.maps.model.StreetViewPanoramaCamera getPanoramaCamera() throws android.os.RemoteException;

    com.google.android.gms.maps.model.StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws android.os.RemoteException;

    boolean isPanningGesturesEnabled() throws android.os.RemoteException;

    boolean isStreetNamesEnabled() throws android.os.RemoteException;

    boolean isUserNavigationEnabled() throws android.os.RemoteException;

    boolean isZoomGesturesEnabled() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper orientationToPoint(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws android.os.RemoteException;

    com.google.android.gms.maps.model.StreetViewPanoramaOrientation pointToOrientation(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void setOnStreetViewPanoramaCameraChangeListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzbk zzbkVar) throws android.os.RemoteException;

    void setOnStreetViewPanoramaChangeListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzbm zzbmVar) throws android.os.RemoteException;

    void setOnStreetViewPanoramaClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzbo zzboVar) throws android.os.RemoteException;

    void setOnStreetViewPanoramaLongClickListener(@javax.annotation.Nullable com.google.android.gms.maps.internal.zzbq zzbqVar) throws android.os.RemoteException;

    void setPosition(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException;

    void setPositionWithID(java.lang.String str) throws android.os.RemoteException;

    void setPositionWithRadius(com.google.android.gms.maps.model.LatLng latLng, int i) throws android.os.RemoteException;

    void setPositionWithRadiusAndSource(com.google.android.gms.maps.model.LatLng latLng, int i, @javax.annotation.Nullable com.google.android.gms.maps.model.StreetViewSource streetViewSource) throws android.os.RemoteException;

    void setPositionWithSource(com.google.android.gms.maps.model.LatLng latLng, @javax.annotation.Nullable com.google.android.gms.maps.model.StreetViewSource streetViewSource) throws android.os.RemoteException;
}
