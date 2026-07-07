package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class Projection {
    private final com.google.android.gms.maps.internal.IProjectionDelegate zza;

    Projection(com.google.android.gms.maps.internal.IProjectionDelegate iProjectionDelegate) {
        this.zza = iProjectionDelegate;
    }

    public com.google.android.gms.maps.model.LatLng fromScreenLocation(android.graphics.Point point) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(point);
        try {
            return this.zza.fromScreenLocation(com.google.android.gms.dynamic.ObjectWrapper.wrap(point));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.gms.maps.model.VisibleRegion getVisibleRegion() {
        try {
            return this.zza.getVisibleRegion();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public android.graphics.Point toScreenLocation(com.google.android.gms.maps.model.LatLng latLng) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng);
        try {
            return (android.graphics.Point) com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zza.toScreenLocation(latLng));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
