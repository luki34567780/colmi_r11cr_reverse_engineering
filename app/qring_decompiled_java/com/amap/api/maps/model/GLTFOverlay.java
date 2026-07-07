package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class GLTFOverlay extends com.amap.api.maps.model.BaseOverlay {
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private com.amap.api.maps.model.GLTFOverlayOptions mOptions;

    public GLTFOverlay(com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer, com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions, java.lang.String str) {
        super(str);
        this.glOverlayLayerRef = new java.lang.ref.WeakReference<>(iGlOverlayLayer);
        this.mOptions = gLTFOverlayOptions;
    }

    public void remove() {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public com.amap.api.maps.model.GLTFOverlayOptions getOptions() {
        return this.mOptions.m187clone();
    }

    public java.lang.String getId() {
        try {
            return this.overlayName;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public int hashCode() {
        return super.hashCode();
    }

    public void setLatLng(com.amap.api.maps.model.LatLng latLng) {
        try {
            com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
            if (gLTFOverlayOptions != null) {
                gLTFOverlayOptions.latLng(latLng);
                a();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public com.amap.api.maps.model.LatLng getLatlng() {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions != null) {
            return gLTFOverlayOptions.getLatLng();
        }
        return null;
    }

    public void setDraggable(boolean z) {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions != null) {
            gLTFOverlayOptions.setDraggable(z);
        }
    }

    public boolean isDraggable() {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions != null) {
            return gLTFOverlayOptions.isDraggable();
        }
        return true;
    }

    public void setClickable(boolean z) {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions != null) {
            gLTFOverlayOptions.setClickable(z);
        }
    }

    public boolean isClickable() {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions != null) {
            return gLTFOverlayOptions.isClickable();
        }
        return false;
    }

    public void tapClick() {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions != null) {
            gLTFOverlayOptions.tapClick();
        }
        try {
            a("tapClick");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isInfoWindowShow() {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions != null) {
            return gLTFOverlayOptions.isInfoWindowShow();
        }
        return false;
    }

    public void setInfoWindowView(com.amap.api.maps.model.BitmapDescriptor bitmapDescriptor) {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions != null) {
            gLTFOverlayOptions.infoWindowView(bitmapDescriptor);
            a();
        }
    }

    public com.amap.api.maps.model.BitmapDescriptor getInfoWindowView() {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions != null) {
            return gLTFOverlayOptions.getInfoWindowView();
        }
        return null;
    }

    public void setCurrentAnimationIndex(int i) {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions != null) {
            gLTFOverlayOptions.setCurrentAnimationIndex(i);
            a();
        }
    }

    public int getCurrentAnimationIndex() {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions == null) {
            return -1;
        }
        gLTFOverlayOptions.getCurrentAnimationIndex();
        return -1;
    }

    public boolean isAnimated() {
        java.lang.Object a = a("isAnimated");
        if (a instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) a).booleanValue();
        }
        return false;
    }

    public void setZIndex(float f) {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions != null) {
            gLTFOverlayOptions.setZIndex(f);
            a();
        }
    }

    public float getZIndex() {
        com.amap.api.maps.model.GLTFOverlayOptions gLTFOverlayOptions = this.mOptions;
        if (gLTFOverlayOptions != null) {
            return gLTFOverlayOptions.getZIndex();
        }
        return 0.0f;
    }

    private java.lang.Object a(java.lang.String str) {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (!android.text.TextUtils.isEmpty(this.overlayName) && iGlOverlayLayer != null) {
                return iGlOverlayLayer.getNativeProperties(this.overlayName, str, null);
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    private void a() {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (android.text.TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.updateOption(this.overlayName, this.mOptions);
        } catch (java.lang.Throwable unused) {
        }
    }
}
