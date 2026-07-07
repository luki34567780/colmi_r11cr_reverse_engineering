package com.google.android.gms.maps.model;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;
    private static com.google.android.gms.internal.maps.zzi zza;

    private BitmapDescriptorFactory() {
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor defaultMarker() {
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzb().zzd());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor fromAsset(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "assetName must not be null");
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzb().zzf(str));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor fromBitmap(android.graphics.Bitmap bitmap) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bitmap, "image must not be null");
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzb().zzg(bitmap));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor fromFile(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "fileName must not be null");
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzb().zzh(str));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor fromPath(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "absolutePath must not be null");
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzb().zzi(str));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor fromResource(int i) {
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzb().zzj(i));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public static void zza(com.google.android.gms.internal.maps.zzi zziVar) {
        if (zza != null) {
            return;
        }
        zza = (com.google.android.gms.internal.maps.zzi) com.google.android.gms.common.internal.Preconditions.checkNotNull(zziVar, "delegate must not be null");
    }

    private static com.google.android.gms.internal.maps.zzi zzb() {
        return (com.google.android.gms.internal.maps.zzi) com.google.android.gms.common.internal.Preconditions.checkNotNull(zza, "IBitmapDescriptorFactory is not initialized");
    }

    public static com.google.android.gms.maps.model.BitmapDescriptor defaultMarker(float f) {
        try {
            return new com.google.android.gms.maps.model.BitmapDescriptor(zzb().zze(f));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
