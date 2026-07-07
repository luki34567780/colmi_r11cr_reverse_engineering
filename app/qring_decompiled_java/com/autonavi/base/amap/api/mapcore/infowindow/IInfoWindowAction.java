package com.autonavi.base.amap.api.mapcore.infowindow;

/* loaded from: classes.dex */
public interface IInfoWindowAction {
    void hideInfoWindow();

    boolean isInfoWindowShown();

    boolean onInfoWindowTap(android.view.MotionEvent motionEvent);

    void redrawInfoWindow();

    void setInfoWindowAdapterManager(com.amap.api.col.p0003sl.av avVar);

    void showInfoWindow(com.amap.api.maps.model.BasePointOverlay basePointOverlay) throws android.os.RemoteException;

    void showInfoWindow(com.autonavi.base.amap.api.mapcore.BaseOverlayImp baseOverlayImp) throws android.os.RemoteException;
}
