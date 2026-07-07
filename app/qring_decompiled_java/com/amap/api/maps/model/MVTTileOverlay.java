package com.amap.api.maps.model;

/* loaded from: classes.dex */
public final class MVTTileOverlay extends com.amap.api.maps.model.BaseOverlay {
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private com.amap.api.maps.model.MVTTileOverlayOptions mMVTTileOverlayOptions;

    public MVTTileOverlay(com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer, com.amap.api.maps.model.MVTTileOverlayOptions mVTTileOverlayOptions, java.lang.String str) {
        super(str);
        this.glOverlayLayerRef = new java.lang.ref.WeakReference<>(iGlOverlayLayer);
        this.mMVTTileOverlayOptions = mVTTileOverlayOptions;
        if (mVTTileOverlayOptions != null) {
            mVTTileOverlayOptions.getTileProviderInner().init(iGlOverlayLayer, str);
        }
    }

    public final void remove() {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
        }
    }

    public final void setZIndex(float f) {
        this.mMVTTileOverlayOptions.setZIndex(f);
        updateOption();
    }

    public final float getZIndex() {
        return this.mMVTTileOverlayOptions.getZIndex();
    }

    public final void setVisible(boolean z) {
        this.mMVTTileOverlayOptions.setVisible(z);
        updateOption();
    }

    public final boolean visible() {
        return this.mMVTTileOverlayOptions.visible();
    }

    protected final void updateOption() {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (android.text.TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.updateOption(this.overlayName, this.mMVTTileOverlayOptions);
        } catch (java.lang.Throwable unused) {
        }
    }
}
