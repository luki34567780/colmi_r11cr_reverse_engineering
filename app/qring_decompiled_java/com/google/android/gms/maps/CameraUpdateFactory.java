package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class CameraUpdateFactory {
    private static com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zza;

    private CameraUpdateFactory() {
    }

    public static com.google.android.gms.maps.CameraUpdate newCameraPosition(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(cameraPosition, "cameraPosition must not be null");
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzb().newCameraPosition(cameraPosition));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate newLatLng(com.google.android.gms.maps.model.LatLng latLng) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng, "latLng must not be null");
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzb().newLatLng(latLng));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLngBounds, "bounds must not be null");
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzb().newLatLngBounds(latLngBounds, i));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate newLatLngZoom(com.google.android.gms.maps.model.LatLng latLng, float f) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng, "latLng must not be null");
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzb().newLatLngZoom(latLng, f));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate scrollBy(float f, float f2) {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzb().scrollBy(f, f2));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate zoomBy(float f) {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzb().zoomBy(f));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate zoomIn() {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzb().zoomIn());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate zoomOut() {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzb().zoomOut());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate zoomTo(float f) {
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzb().zoomTo(f));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static void zza(com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate) {
        zza = (com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(iCameraUpdateFactoryDelegate);
    }

    private static com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zzb() {
        return (com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(zza, "CameraUpdateFactory is not initialized");
    }

    public static com.google.android.gms.maps.CameraUpdate zoomBy(float f, android.graphics.Point point) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(point, "focus must not be null");
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzb().zoomByWithFocus(f, point.x, point.y));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.CameraUpdate newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds, int i, int i2, int i3) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLngBounds, "bounds must not be null");
        try {
            return new com.google.android.gms.maps.CameraUpdate(zzb().newLatLngBoundsWithSize(latLngBounds, i, i2, i3));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
