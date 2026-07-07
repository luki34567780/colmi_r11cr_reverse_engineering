package com.google.android.gms.maps.internal;

/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* loaded from: /tmp/dex/classes2.dex */
public interface IUiSettingsDelegate extends android.os.IInterface {
    boolean isCompassEnabled() throws android.os.RemoteException;

    boolean isIndoorLevelPickerEnabled() throws android.os.RemoteException;

    boolean isMapToolbarEnabled() throws android.os.RemoteException;

    boolean isMyLocationButtonEnabled() throws android.os.RemoteException;

    boolean isRotateGesturesEnabled() throws android.os.RemoteException;

    boolean isScrollGesturesEnabled() throws android.os.RemoteException;

    boolean isScrollGesturesEnabledDuringRotateOrZoom() throws android.os.RemoteException;

    boolean isTiltGesturesEnabled() throws android.os.RemoteException;

    boolean isZoomControlsEnabled() throws android.os.RemoteException;

    boolean isZoomGesturesEnabled() throws android.os.RemoteException;

    void setAllGesturesEnabled(boolean z) throws android.os.RemoteException;

    void setCompassEnabled(boolean z) throws android.os.RemoteException;

    void setIndoorLevelPickerEnabled(boolean z) throws android.os.RemoteException;

    void setMapToolbarEnabled(boolean z) throws android.os.RemoteException;

    void setMyLocationButtonEnabled(boolean z) throws android.os.RemoteException;

    void setRotateGesturesEnabled(boolean z) throws android.os.RemoteException;

    void setScrollGesturesEnabled(boolean z) throws android.os.RemoteException;

    void setScrollGesturesEnabledDuringRotateOrZoom(boolean z) throws android.os.RemoteException;

    void setTiltGesturesEnabled(boolean z) throws android.os.RemoteException;

    void setZoomControlsEnabled(boolean z) throws android.os.RemoteException;

    void setZoomGesturesEnabled(boolean z) throws android.os.RemoteException;
}
