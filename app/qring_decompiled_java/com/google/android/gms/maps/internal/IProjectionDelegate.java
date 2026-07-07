package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface IProjectionDelegate extends android.os.IInterface {
    com.google.android.gms.maps.model.LatLng fromScreenLocation(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    com.google.android.gms.maps.model.VisibleRegion getVisibleRegion() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper toScreenLocation(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException;
}
