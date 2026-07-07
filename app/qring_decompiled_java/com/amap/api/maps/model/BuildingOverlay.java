package com.amap.api.maps.model;

/* loaded from: classes.dex */
public class BuildingOverlay extends com.amap.api.maps.model.BaseOverlay {
    private com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions buildingOverlayTotalOptions;
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private com.amap.api.maps.model.BuildingOverlayOptions mDefaultOptions;
    private java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> optionList;

    public BuildingOverlay(com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer, java.lang.String str) {
        super(str);
        this.buildingOverlayTotalOptions = new com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions();
        this.glOverlayLayerRef = new java.lang.ref.WeakReference<>(iGlOverlayLayer);
        this.buildingOverlayTotalOptions.allOptionList = new java.util.ArrayList();
        try {
            if (this.mDefaultOptions == null) {
                com.amap.api.maps.model.BuildingOverlayOptions buildingOverlayOptions = new com.amap.api.maps.model.BuildingOverlayOptions();
                this.mDefaultOptions = buildingOverlayOptions;
                buildingOverlayOptions.setVisible(true);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new com.amap.api.maps.model.LatLng(84.9d, -179.9d));
                arrayList.add(new com.amap.api.maps.model.LatLng(84.9d, 179.9d));
                arrayList.add(new com.amap.api.maps.model.LatLng(-84.9d, 179.9d));
                arrayList.add(new com.amap.api.maps.model.LatLng(-84.9d, -179.9d));
                this.mDefaultOptions.setBuildingLatlngs(arrayList);
                this.mDefaultOptions.setBuildingTopColor(androidx.core.internal.view.SupportMenu.CATEGORY_MASK);
                this.mDefaultOptions.setBuildingSideColor(-12303292);
                this.mDefaultOptions.setVisible(true);
                this.mDefaultOptions.setZIndex(1.0f);
                this.buildingOverlayTotalOptions.allOptionList.add(this.mDefaultOptions);
                a(true);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public void setDefaultOptions(com.amap.api.maps.model.BuildingOverlayOptions buildingOverlayOptions) {
        if (buildingOverlayOptions != null) {
            synchronized (this) {
                this.mDefaultOptions = buildingOverlayOptions;
            }
            a(true);
        }
    }

    public com.amap.api.maps.model.BuildingOverlayOptions getDefaultOptions() {
        return this.mDefaultOptions;
    }

    public void setCustomOptions(java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        synchronized (this) {
            this.optionList = list;
        }
        a(false);
    }

    public java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> getCustomOptions() {
        return this.optionList;
    }

    public void destroy() {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public java.lang.String getId() {
        return this.overlayName;
    }

    public void setZIndex(float f) {
        com.amap.api.maps.model.BuildingOverlayOptions buildingOverlayOptions = this.mDefaultOptions;
        if (buildingOverlayOptions != null) {
            buildingOverlayOptions.setZIndex(f);
        }
        com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions buildingOverlayTotalOptions = this.buildingOverlayTotalOptions;
        if (buildingOverlayTotalOptions != null) {
            buildingOverlayTotalOptions.zIndex = f;
            a();
        }
    }

    public float getZIndex() {
        com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions buildingOverlayTotalOptions = this.buildingOverlayTotalOptions;
        if (buildingOverlayTotalOptions != null) {
            return buildingOverlayTotalOptions.zIndex;
        }
        return 0.0f;
    }

    public void setVisible(boolean z) {
        com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions buildingOverlayTotalOptions = this.buildingOverlayTotalOptions;
        if (buildingOverlayTotalOptions != null) {
            buildingOverlayTotalOptions.isVisible = z;
            a();
        }
    }

    public boolean isVisible() {
        com.amap.api.maps.model.BuildingOverlay.BuildingOverlayTotalOptions buildingOverlayTotalOptions = this.buildingOverlayTotalOptions;
        if (buildingOverlayTotalOptions != null) {
            return buildingOverlayTotalOptions.isVisible;
        }
        return false;
    }

    private void a(boolean z) {
        try {
            synchronized (this) {
                if (z) {
                    this.buildingOverlayTotalOptions.allOptionList.set(0, this.mDefaultOptions);
                } else {
                    this.buildingOverlayTotalOptions.allOptionList.removeAll(this.optionList);
                    this.buildingOverlayTotalOptions.allOptionList.set(0, this.mDefaultOptions);
                    this.buildingOverlayTotalOptions.allOptionList.addAll(this.optionList);
                }
                com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
                if (iGlOverlayLayer != null) {
                    iGlOverlayLayer.updateOption(this.overlayName, this.buildingOverlayTotalOptions);
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private void a() {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (android.text.TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.updateOption(this.overlayName, this.buildingOverlayTotalOptions);
        } catch (java.lang.Throwable unused) {
        }
    }

    protected class BuildingOverlayTotalOptions extends com.amap.api.maps.model.BaseOptions {
        public java.util.List<com.amap.api.maps.model.BuildingOverlayOptions> allOptionList;
        public boolean isVisible = true;
        private float zIndex = 0.0f;

        public BuildingOverlayTotalOptions() {
            this.type = "BuildingOptions";
        }
    }
}
