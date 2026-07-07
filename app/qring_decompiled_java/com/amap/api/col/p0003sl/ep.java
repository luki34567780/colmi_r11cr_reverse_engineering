package com.amap.api.col.p0003sl;

/* compiled from: ContourLineOverlay.java */
/* loaded from: classes.dex */
public final class ep extends com.amap.api.maps.model.BaseOverlay {
    private com.amap.api.col.p0003sl.eo a;
    private java.lang.ref.WeakReference<com.amap.api.maps.interfaces.IGlOverlayLayer> b;

    public ep(com.amap.api.maps.interfaces.IGlOverlayLayer iGlOverlayLayer, com.amap.api.col.p0003sl.eo eoVar, java.lang.String str) {
        super(str);
        this.b = new java.lang.ref.WeakReference<>(iGlOverlayLayer);
        this.a = eoVar;
    }
}
