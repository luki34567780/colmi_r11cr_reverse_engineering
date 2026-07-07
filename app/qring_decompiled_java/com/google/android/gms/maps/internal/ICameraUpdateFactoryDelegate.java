package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface ICameraUpdateFactoryDelegate extends android.os.IInterface {
    com.google.android.gms.dynamic.IObjectWrapper newCameraPosition(com.google.android.gms.maps.model.CameraPosition cameraPosition) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper newLatLng(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds, int i) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper newLatLngBoundsWithSize(com.google.android.gms.maps.model.LatLngBounds latLngBounds, int i, int i2, int i3) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper newLatLngZoom(com.google.android.gms.maps.model.LatLng latLng, float f) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper scrollBy(float f, float f2) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zoomBy(float f) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zoomByWithFocus(float f, int i, int i2) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zoomIn() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zoomOut() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zoomTo(float f) throws android.os.RemoteException;
}
