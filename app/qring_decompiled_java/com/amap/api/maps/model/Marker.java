package com.amap.api.maps.model;

/* loaded from: classes.dex */
public final class Marker extends com.amap.api.maps.model.BasePointOverlay {
    private com.autonavi.amap.mapcore.IPoint geoPoint;
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> glOverlayLayerRef;
    private boolean isClickable;
    private boolean isInfoWindowEnable;
    private boolean isRemoved;
    private boolean isUseAnimation;
    private com.amap.api.maps.model.animation.Animation mCurAnimation;
    private com.amap.api.maps.model.animation.Animation.AnimationListener mCurAnimationListener;
    private com.amap.api.maps.model.Marker.a mCurInnerAnimationListener;
    private java.lang.Object object;
    private com.amap.api.maps.model.MarkerOptions options;
    private com.amap.api.maps.model.LatLng viewModeLatLng;
    private com.autonavi.amap.mapcore.DPoint viewModeLatLngDp;

    public final int getDisplayLevel() {
        return 5;
    }

    public final boolean isInfoWindowAutoOverturn() {
        return false;
    }

    public final boolean isPerspective() {
        return false;
    }

    public final void setAutoOverturnInfoWindow(boolean z) {
    }

    public final void setDisplayLevel(int i) {
    }

    public final void setFixingPointEnable(boolean z) {
    }

    public final void setPerspective(boolean z) {
    }

    public final void setRotateAngleNotUpdate(float f) {
    }

    public Marker(com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer, com.amap.api.maps.model.MarkerOptions markerOptions, java.lang.String str) {
        super(str);
        this.isRemoved = false;
        this.viewModeLatLngDp = new com.autonavi.amap.mapcore.DPoint();
        this.viewModeLatLng = null;
        this.isUseAnimation = false;
        this.mCurAnimation = null;
        this.mCurAnimationListener = null;
        this.mCurInnerAnimationListener = null;
        this.isClickable = true;
        this.isInfoWindowEnable = true;
        this.glOverlayLayerRef = new java.lang.ref.WeakReference<>(iGlOverlayLayer);
        this.options = markerOptions;
    }

    public final void setPeriod(int i) {
        try {
            this.options.period(i);
            a();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final int getPeriod() {
        try {
            return this.options.getPeriod();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final void setIcons(java.util.ArrayList<com.amap.api.maps.model.BitmapDescriptor> arrayList) {
        try {
            this.options.icons(arrayList);
            a();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final java.util.ArrayList<com.amap.api.maps.model.BitmapDescriptor> getIcons() {
        try {
            return this.options.getIcons();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void remove() {
        try {
            if (isInfoWindowShown()) {
                hideInfoWindow();
            }
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.removeOverlay(this.overlayName);
            }
            this.isRemoved = true;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void destroy() {
        try {
            remove();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final java.lang.String getId() {
        try {
            return this.overlayName;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setPosition(com.amap.api.maps.model.LatLng latLng) {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.position(latLng);
                a();
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final com.amap.api.maps.model.LatLng getPosition() {
        java.lang.Object a2;
        try {
            if (this.options != null) {
                if (isViewMode()) {
                    this.glOverlayLayerRef.get().getMap().getPixel2LatLng(this.options.getScreenX(), this.options.getScreenY(), this.viewModeLatLngDp);
                    com.amap.api.maps.model.LatLng latLng = this.viewModeLatLng;
                    if (latLng != null && latLng.latitude == this.viewModeLatLngDp.y && this.viewModeLatLng.longitude == this.viewModeLatLngDp.x) {
                        return this.viewModeLatLng;
                    }
                    return new com.amap.api.maps.model.LatLng(this.viewModeLatLngDp.y, this.viewModeLatLngDp.x);
                }
                if (this.isUseAnimation && (a2 = a("getPosition", null)) != null) {
                    return (com.amap.api.maps.model.LatLng) a2;
                }
                return this.options.getPosition();
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setTitle(java.lang.String str) {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.title(str);
                a();
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final java.lang.String getTitle() {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                return markerOptions.getTitle();
            }
            return null;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setSnippet(java.lang.String str) {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.snippet(str);
                a();
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final java.lang.String getSnippet() {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                return markerOptions.getSnippet();
            }
            return null;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void setIcon(com.amap.api.maps.model.BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            try {
                com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
                if (markerOptions != null) {
                    markerOptions.icon(bitmapDescriptor);
                    a();
                }
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void setAnchor(float f, float f2) {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.anchor(f, f2);
                a();
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setDraggable(boolean z) {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.draggable(z);
                a();
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final boolean isDraggable() {
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.isDraggable();
        }
        return false;
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void showInfoWindow() {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (android.text.TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.showInfoWindow(this.overlayName);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final void hideInfoWindow() {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (android.text.TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.hideInfoWindow(this.overlayName);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final boolean isInfoWindowShown() {
        com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
        if (android.text.TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
            return false;
        }
        java.lang.Object a2 = a("isInfoWindowShown", null);
        if (a2 instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) a2).booleanValue();
        }
        return false;
    }

    public final void setAltitude(float f) {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.altitude(f);
                a();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final float getAltitude() {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                return markerOptions.getAltitude();
            }
            return 0.0f;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setVisible(boolean z) {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.visible(z);
                a();
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final boolean isVisible() {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                return markerOptions.isVisible();
            }
            return false;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.amap.api.maps.model.Marker)) {
            try {
                com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
                if (markerOptions != null && markerOptions.equals(((com.amap.api.maps.model.Marker) obj).options)) {
                    if (this.overlayName.equals(((com.amap.api.maps.model.Marker) obj).overlayName)) {
                        return true;
                    }
                }
                return false;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.options != null) {
            return (((this.overlayName == null ? 0 : this.overlayName.hashCode()) + 31) * 31) + this.options.hashCode();
        }
        return super.hashCode();
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setObject(java.lang.Object obj) {
        this.object = obj;
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final java.lang.Object getObject() {
        return this.object;
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setRotateAngle(float f) {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.rotateAngle(f);
                a();
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final float getRotateAngle() {
        if (this.options == null) {
            return 0.0f;
        }
        if (this.isUseAnimation) {
            java.lang.Object a2 = a("getRotateAngle", null);
            android.util.Log.e("mapcore", "getRotateAngle ".concat(java.lang.String.valueOf(a2)));
            if (a2 != null) {
                return ((java.lang.Double) a2).floatValue();
            }
        }
        return this.options.getRotateAngle();
    }

    public final void setToTop() {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (android.text.TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.set2Top(this.overlayName);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setGeoPoint(com.autonavi.amap.mapcore.IPoint iPoint) {
        this.geoPoint = iPoint;
        if (iPoint != null) {
            com.autonavi.amap.mapcore.DPoint pixelsToLatLong = com.autonavi.amap.mapcore.VirtualEarthProjection.pixelsToLatLong(iPoint.x, iPoint.y, 20);
            com.amap.api.maps.model.LatLng latLng = new com.amap.api.maps.model.LatLng(pixelsToLatLong.y, pixelsToLatLong.x, false);
            pixelsToLatLong.recycle();
            this.options.position(latLng);
            a();
        }
    }

    public final com.autonavi.amap.mapcore.IPoint getGeoPoint() {
        if (this.geoPoint == null) {
            this.geoPoint = new com.autonavi.amap.mapcore.IPoint();
        }
        com.amap.api.maps.model.LatLng position = getPosition();
        if (position != null) {
            com.autonavi.amap.mapcore.VirtualEarthProjection.latLongToPixels(position.latitude, position.longitude, 20, this.geoPoint);
        }
        return this.geoPoint;
    }

    public final void setFlat(boolean z) {
        try {
            com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
            if (markerOptions != null) {
                markerOptions.setFlat(z);
                a();
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public final boolean isFlat() {
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.isFlat();
        }
        return false;
    }

    public final void setPositionByPixels(int i, int i2) {
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.setScreenPosition(i, i2);
            a();
        }
    }

    public final void setZIndex(float f) {
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.zIndex(f);
            a();
        }
    }

    public final float getZIndex() {
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.getZIndex();
        }
        return 0.0f;
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final void setAnimation(com.amap.api.maps.model.animation.Animation animation) {
        if (animation != null) {
            try {
                com.amap.api.maps.model.animation.Animation.AnimationListener animationListener = this.mCurAnimationListener;
                if (animationListener != null) {
                    animation.setAnimationListener(animationListener);
                }
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        this.mCurAnimation = animation;
        this.isUseAnimation = animation != null;
        a("setAnimation", new java.lang.Object[]{animation});
        if (animation != null) {
            animation.resetUpdateFlags();
        }
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final boolean startAnimation() {
        java.lang.Object a2 = a("startAnimation", null);
        if (a2 instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) a2).booleanValue();
        }
        return false;
    }

    public final void setAnimationListener(com.amap.api.maps.model.animation.Animation.AnimationListener animationListener) {
        this.mCurAnimationListener = animationListener;
        com.amap.api.maps.model.Marker.a aVar = new com.amap.api.maps.model.Marker.a(this, animationListener, (byte) 0);
        this.mCurInnerAnimationListener = aVar;
        if (this.mCurAnimation != null) {
            a("setAnimationListener", new java.lang.Object[]{aVar});
        }
    }

    public final float getAlpha() {
        java.lang.Object a2;
        if (this.options == null) {
            return 1.0f;
        }
        if (this.isUseAnimation && (a2 = a("getAlpha", null)) != null) {
            return ((java.lang.Double) a2).floatValue();
        }
        return this.options.getAlpha();
    }

    public final void setAlpha(float f) {
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.alpha(f);
            a();
        }
    }

    public final com.amap.api.maps.model.MarkerOptions getOptions() {
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions;
        }
        return null;
    }

    public final boolean isClickable() {
        java.lang.Object a2 = a("isClickable", null);
        if (a2 instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) a2).booleanValue();
        }
        return this.isClickable;
    }

    @Override // com.amap.api.maps.model.BasePointOverlay
    public final boolean isInfoWindowEnable() {
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.isInfoWindowEnable();
        }
        return this.isInfoWindowEnable;
    }

    public final void setInfoWindowEnable(boolean z) {
        this.isInfoWindowEnable = z;
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.infoWindowEnable(z);
            a();
        }
    }

    public final void setMarkerOptions(com.amap.api.maps.model.MarkerOptions markerOptions) {
        this.options = markerOptions;
        a();
    }

    public final void setClickable(boolean z) {
        this.isClickable = z;
        a("setClickable", new java.lang.Object[]{java.lang.Boolean.valueOf(z)});
    }

    public final boolean isRemoved() {
        return this.isRemoved;
    }

    public final void setPositionNotUpdate(com.amap.api.maps.model.LatLng latLng) {
        setPosition(latLng);
    }

    public final void setBelowMaskLayer(boolean z) {
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            markerOptions.belowMaskLayer(z);
            a();
        }
    }

    public final float getAnchorU() {
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.getAnchorU();
        }
        return 0.0f;
    }

    public final float getAnchorV() {
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.getAnchorV();
        }
        return 0.0f;
    }

    private java.lang.Object a(java.lang.String str, java.lang.Object[] objArr) {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (android.text.TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return null;
            }
            return iGlOverlayLayer.getNativeProperties(this.overlayName, str, objArr);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private void a() {
        try {
            com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer = this.glOverlayLayerRef.get();
            if (android.text.TextUtils.isEmpty(this.overlayName) || iGlOverlayLayer == null) {
                return;
            }
            iGlOverlayLayer.updateOption(this.overlayName, this.options);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final boolean isViewMode() {
        com.amap.api.maps.model.MarkerOptions markerOptions = this.options;
        if (markerOptions != null) {
            return markerOptions.isViewMode();
        }
        return false;
    }

    private class a implements com.amap.api.maps.model.animation.Animation.AnimationListener {
        private final com.amap.api.col.p0003sl.ma b;
        private final com.amap.api.col.p0003sl.ma c;

        /* synthetic */ a(com.amap.api.maps.model.Marker marker, com.amap.api.maps.model.animation.Animation.AnimationListener animationListener, byte b) {
            this(animationListener);
        }

        private a(final com.amap.api.maps.model.animation.Animation.AnimationListener animationListener) {
            this.b = new com.amap.api.col.p0003sl.ma() { // from class: com.amap.api.maps.model.Marker.a.1
                @Override // com.amap.api.col.p0003sl.ma
                public final void runTask() {
                    try {
                        com.amap.api.maps.model.animation.Animation.AnimationListener animationListener2 = animationListener;
                        if (animationListener2 != null) {
                            animationListener2.onAnimationStart();
                        }
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                }
            };
            this.c = new com.amap.api.col.p0003sl.ma() { // from class: com.amap.api.maps.model.Marker.a.2
                @Override // com.amap.api.col.p0003sl.ma
                public final void runTask() {
                    try {
                        com.amap.api.maps.model.animation.Animation.AnimationListener animationListener2 = animationListener;
                        if (animationListener2 != null) {
                            animationListener2.onAnimationEnd();
                        }
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                }
            };
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public final void onAnimationStart() {
            com.amap.api.col.p0003sl.dv.a().a(this.b);
        }

        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
        public final void onAnimationEnd() {
            com.amap.api.col.p0003sl.dv.a().a(this.c);
        }
    }
}
